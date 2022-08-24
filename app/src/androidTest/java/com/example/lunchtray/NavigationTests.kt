/*
 * Copyright (C) 2021 The Android Open Source Project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.lunchtray

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.testing.FragmentScenario
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.navigation.Navigation
import androidx.navigation.testing.TestNavHostController
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.example.lunchtray.ui.order.*
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Tests for all navigation flows
 */
@RunWith(AndroidJUnit4::class)
@LargeTest
class NavigationTests : BaseTest() {

    /**
     * Test navigation from [StartOrderFragment] to [EntreeMenuFragment]
     */
    @Test
    fun `navigate_to_entree_menu_from_start_order`() {
        navigateFrom<StartOrderFragment>(
            withViewInteraction = onView(withId(R.id.start_order_btn)),
            currentDestiny = R.id.startOrderFragment,
            nextDestiny = R.id.entreeMenuFragment,
        )
    }

    /**
     * Test navigation from [EntreeMenuFragment] to [StartOrderFragment]
     */
    @Test
    fun `navigate_to_start_order_from_entree_menu`() {
        navigateFrom<EntreeMenuFragment>(
            withViewInteraction = onView(withId(R.id.cancel_button)),
            currentDestiny = R.id.entreeMenuFragment,
            nextDestiny = R.id.startOrderFragment,
        )
    }

    /**
     * Test navigation from [EntreeMenuFragment] to [SideMenuFragment]
     */
    @Test
    fun `navigate_to_side_menu_from_entree_menu`() {
        navigateFrom<EntreeMenuFragment>(
            withViewInteraction = onView(withId(R.id.next_button)),
            currentDestiny = R.id.entreeMenuFragment,
            nextDestiny = R.id.sideMenuFragment,
        )
    }

    /**
     * Test navigation from [SideMenuFragment] to [StartOrderFragment]
     */
    @Test
    fun `navigate_to_start_order_from_side_menu`() {
        navigateFrom<SideMenuFragment>(
            withViewInteraction = onView(withId(R.id.cancel_button)),
            currentDestiny = R.id.sideMenuFragment,
            nextDestiny = R.id.startOrderFragment,
        )
    }

    /**
     * Test navigation from [SideMenuFragment] to [AccompanimentMenuFragment]
     */
    @Test
    fun `navigate_to_accompaniment_menu_from_side_menu`() {
        navigateFrom<SideMenuFragment>(
            withViewInteraction = onView(withId(R.id.next_button)),
            nextDestiny = R.id.accompanimentMenuFragment,
            currentDestiny = R.id.sideMenuFragment,
        )
    }

    /**
     * Test navigation from [AccompanimentMenuFragment] to [StartOrderFragment]
     */
    @Test
    fun `navigate_to_start_order_from_accompaniment_menu`() {
        navigateFrom<AccompanimentMenuFragment>(
            withViewInteraction = onView(withId(R.id.cancel_button)),
            currentDestiny = R.id.accompanimentMenuFragment,
            nextDestiny = R.id.startOrderFragment,
        )
    }

    /**
     * Test navigation from [AccompanimentMenuFragment] to [CheckoutFragment]
     */
    @Test
    fun `navigate_to_checkout_from_accompaniment_menu`() {
        navigateFrom<AccompanimentMenuFragment>(
            withViewInteraction = onView(withId(R.id.next_button)),
            currentDestiny = R.id.accompanimentMenuFragment,
            nextDestiny = R.id.checkoutFragment,
        )
    }

    /**
     * Test navigation from [CheckoutFragment] to [StartOrderFragment]
     */
    @Test
    fun `navigate_to_start_order_from_checkout`() {
        navigateFrom<CheckoutFragment>(
            withViewInteraction = onView(withId(R.id.cancel_button)),
            currentDestiny = R.id.checkoutFragment,
            nextDestiny = R.id.startOrderFragment,
        )
    }

    /**
     * Test Navigation from [CheckoutFragment] to [StartOrderFragment]
     */
    @Test
    fun `navigate_to_start_order_from_checkout_via_submit`() {
        navigateFrom<CheckoutFragment>(
            withViewInteraction = onView(withId(R.id.submit_button)),
            currentDestiny = R.id.checkoutFragment,
            nextDestiny = R.id.startOrderFragment,
        )
    }

    inline fun <reified T : Fragment> navigateFrom(
        withViewInteraction: ViewInteraction,
        currentDestiny: Int,
        nextDestiny: Int,
    ) {
        val navController = TestNavHostController(
            ApplicationProvider.getApplicationContext())
        val checkoutScenario = launchFragmentInContainer<T>(themeResId = R.style.Theme_LunchTray)
        checkoutScenario.onFragment { fragment ->
            navController.setGraph(R.navigation.mobile_navigation)
            navController.setCurrentDestination(destId = currentDestiny)
            Navigation.setViewNavController(fragment.requireView(), navController)
        }
        withViewInteraction.perform(click())
        assertEquals(navController.currentDestination?.id, nextDestiny)
    }
}
