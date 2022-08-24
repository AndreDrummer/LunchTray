package com.example.lunchtray.databinding;
import com.example.lunchtray.R;
import com.example.lunchtray.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSideMenuBindingImpl extends FragmentSideMenuBinding implements com.example.lunchtray.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.side_options, 16);
        sViewsWithIds.put(R.id.divider, 17);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSideMenuBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private FragmentSideMenuBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[14]
            , (android.view.View) bindings[17]
            , (android.widget.Button) bindings[15]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.RadioButton) bindings[7]
            , (android.widget.RadioButton) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (android.widget.RadioButton) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.RadioGroup) bindings[16]
            , (android.widget.RadioButton) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[13]
            );
        this.cancelButton.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.nextButton.setTag(null);
        this.potatoDescription.setTag(null);
        this.potatoPrice.setTag(null);
        this.potatoes.setTag(null);
        this.rice.setTag(null);
        this.riceDescription.setTag(null);
        this.ricePrice.setTag(null);
        this.salad.setTag(null);
        this.saladDescription.setTag(null);
        this.saladPrice.setTag(null);
        this.soup.setTag(null);
        this.soupDescription.setTag(null);
        this.soupPrice.setTag(null);
        this.subtotal.setTag(null);
        setRootTag(root);
        // listeners
        mCallback11 = new com.example.lunchtray.generated.callback.OnClickListener(this, 4);
        mCallback12 = new com.example.lunchtray.generated.callback.OnClickListener(this, 5);
        mCallback9 = new com.example.lunchtray.generated.callback.OnClickListener(this, 2);
        mCallback13 = new com.example.lunchtray.generated.callback.OnClickListener(this, 6);
        mCallback8 = new com.example.lunchtray.generated.callback.OnClickListener(this, 1);
        mCallback10 = new com.example.lunchtray.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.sideMenu == variableId) {
            setSideMenu((com.example.lunchtray.ui.order.SideMenuFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.example.lunchtray.model.OrderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSideMenu(@Nullable com.example.lunchtray.ui.order.SideMenuFragment SideMenu) {
        this.mSideMenu = SideMenu;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.sideMenu);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.example.lunchtray.model.OrderViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelSubtotal((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelSubtotal(androidx.lifecycle.LiveData<java.lang.String> ViewModelSubtotal, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.LiveData<java.lang.String> viewModelSubtotal = null;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsAndroidStringRice = null;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsAndroidStringPotatoes = null;
        java.util.Map<java.lang.String,com.example.lunchtray.model.MenuItem> viewModelMenuItems = null;
        java.lang.String viewModelMenuItemsAndroidStringPotatoesGetFormattedPrice = null;
        java.lang.String viewModelMenuItemsAndroidStringSoupName = null;
        java.lang.String viewModelMenuItemsAndroidStringRiceName = null;
        java.lang.String viewModelMenuItemsAndroidStringRiceDescription = null;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsAndroidStringSoup = null;
        java.lang.String viewModelMenuItemsAndroidStringPotatoesName = null;
        java.lang.String viewModelMenuItemsAndroidStringPotatoesDescription = null;
        java.lang.String viewModelMenuItemsAndroidStringRiceGetFormattedPrice = null;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsAndroidStringSalad = null;
        java.lang.String subtotalAndroidStringSubtotalViewModelSubtotal = null;
        java.lang.String viewModelMenuItemsAndroidStringSaladName = null;
        java.lang.String viewModelMenuItemsAndroidStringSaladDescription = null;
        java.lang.String viewModelMenuItemsAndroidStringSaladGetFormattedPrice = null;
        java.lang.String viewModelSubtotalGetValue = null;
        com.example.lunchtray.ui.order.SideMenuFragment sideMenu = mSideMenu;
        java.lang.String viewModelMenuItemsAndroidStringSoupGetFormattedPrice = null;
        java.lang.String viewModelMenuItemsAndroidStringSoupDescription = null;
        com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xdL) != 0) {



                if (viewModel != null) {
                    // read viewModel.subtotal
                    viewModelSubtotal = viewModel.getSubtotal();
                }
                updateLiveDataRegistration(0, viewModelSubtotal);


                if (viewModelSubtotal != null) {
                    // read viewModel.subtotal.getValue()
                    viewModelSubtotalGetValue = viewModelSubtotal.getValue();
                }


                // read @android:string/subtotal
                subtotalAndroidStringSubtotalViewModelSubtotal = subtotal.getResources().getString(R.string.subtotal, viewModelSubtotalGetValue);
            if ((dirtyFlags & 0xcL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.menuItems
                        viewModelMenuItems = viewModel.getMenuItems();
                    }


                    if (viewModelMenuItems != null) {
                        // read viewModel.menuItems[@android:string/rice]
                        viewModelMenuItemsAndroidStringRice = viewModelMenuItems.get(rice.getResources().getString(R.string.rice));
                        // read viewModel.menuItems[@android:string/potatoes]
                        viewModelMenuItemsAndroidStringPotatoes = viewModelMenuItems.get(potatoes.getResources().getString(R.string.potatoes));
                        // read viewModel.menuItems[@android:string/soup]
                        viewModelMenuItemsAndroidStringSoup = viewModelMenuItems.get(soup.getResources().getString(R.string.soup));
                        // read viewModel.menuItems[@android:string/salad]
                        viewModelMenuItemsAndroidStringSalad = viewModelMenuItems.get(salad.getResources().getString(R.string.salad));
                    }


                    if (viewModelMenuItemsAndroidStringRice != null) {
                        // read viewModel.menuItems[@android:string/rice].name
                        viewModelMenuItemsAndroidStringRiceName = viewModelMenuItemsAndroidStringRice.getName();
                        // read viewModel.menuItems[@android:string/rice].description
                        viewModelMenuItemsAndroidStringRiceDescription = viewModelMenuItemsAndroidStringRice.getDescription();
                        // read viewModel.menuItems[@android:string/rice].getFormattedPrice()
                        viewModelMenuItemsAndroidStringRiceGetFormattedPrice = viewModelMenuItemsAndroidStringRice.getFormattedPrice();
                    }
                    if (viewModelMenuItemsAndroidStringPotatoes != null) {
                        // read viewModel.menuItems[@android:string/potatoes].getFormattedPrice()
                        viewModelMenuItemsAndroidStringPotatoesGetFormattedPrice = viewModelMenuItemsAndroidStringPotatoes.getFormattedPrice();
                        // read viewModel.menuItems[@android:string/potatoes].name
                        viewModelMenuItemsAndroidStringPotatoesName = viewModelMenuItemsAndroidStringPotatoes.getName();
                        // read viewModel.menuItems[@android:string/potatoes].description
                        viewModelMenuItemsAndroidStringPotatoesDescription = viewModelMenuItemsAndroidStringPotatoes.getDescription();
                    }
                    if (viewModelMenuItemsAndroidStringSoup != null) {
                        // read viewModel.menuItems[@android:string/soup].name
                        viewModelMenuItemsAndroidStringSoupName = viewModelMenuItemsAndroidStringSoup.getName();
                        // read viewModel.menuItems[@android:string/soup].getFormattedPrice()
                        viewModelMenuItemsAndroidStringSoupGetFormattedPrice = viewModelMenuItemsAndroidStringSoup.getFormattedPrice();
                        // read viewModel.menuItems[@android:string/soup].description
                        viewModelMenuItemsAndroidStringSoupDescription = viewModelMenuItemsAndroidStringSoup.getDescription();
                    }
                    if (viewModelMenuItemsAndroidStringSalad != null) {
                        // read viewModel.menuItems[@android:string/salad].name
                        viewModelMenuItemsAndroidStringSaladName = viewModelMenuItemsAndroidStringSalad.getName();
                        // read viewModel.menuItems[@android:string/salad].description
                        viewModelMenuItemsAndroidStringSaladDescription = viewModelMenuItemsAndroidStringSalad.getDescription();
                        // read viewModel.menuItems[@android:string/salad].getFormattedPrice()
                        viewModelMenuItemsAndroidStringSaladGetFormattedPrice = viewModelMenuItemsAndroidStringSalad.getFormattedPrice();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.cancelButton.setOnClickListener(mCallback12);
            this.nextButton.setOnClickListener(mCallback13);
            this.potatoes.setOnClickListener(mCallback10);
            this.rice.setOnClickListener(mCallback11);
            this.salad.setOnClickListener(mCallback8);
            this.soup.setOnClickListener(mCallback9);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.potatoDescription, viewModelMenuItemsAndroidStringPotatoesDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.potatoPrice, viewModelMenuItemsAndroidStringPotatoesGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.potatoes, viewModelMenuItemsAndroidStringPotatoesName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.rice, viewModelMenuItemsAndroidStringRiceName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.riceDescription, viewModelMenuItemsAndroidStringRiceDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.ricePrice, viewModelMenuItemsAndroidStringRiceGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.salad, viewModelMenuItemsAndroidStringSaladName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.saladDescription, viewModelMenuItemsAndroidStringSaladDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.saladPrice, viewModelMenuItemsAndroidStringSaladGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.soup, viewModelMenuItemsAndroidStringSoupName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.soupDescription, viewModelMenuItemsAndroidStringSoupDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.soupPrice, viewModelMenuItemsAndroidStringSoupGetFormattedPrice);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.subtotal.setText(subtotalAndroidStringSubtotalViewModelSubtotal);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setSide(rice.getResources().getString(R.string.rice));
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // sideMenu
                com.example.lunchtray.ui.order.SideMenuFragment sideMenu = mSideMenu;
                // sideMenu != null
                boolean sideMenuJavaLangObjectNull = false;



                sideMenuJavaLangObjectNull = (sideMenu) != (null);
                if (sideMenuJavaLangObjectNull) {


                    sideMenu.cancelOrder();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setSide(soup.getResources().getString(R.string.soup));
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // sideMenu
                com.example.lunchtray.ui.order.SideMenuFragment sideMenu = mSideMenu;
                // sideMenu != null
                boolean sideMenuJavaLangObjectNull = false;



                sideMenuJavaLangObjectNull = (sideMenu) != (null);
                if (sideMenuJavaLangObjectNull) {


                    sideMenu.goToNextScreen();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setSide(salad.getResources().getString(R.string.salad));
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setSide(potatoes.getResources().getString(R.string.potatoes));
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.subtotal
        flag 1 (0x2L): sideMenu
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}