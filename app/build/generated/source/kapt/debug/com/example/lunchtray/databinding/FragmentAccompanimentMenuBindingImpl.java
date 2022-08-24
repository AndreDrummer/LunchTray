package com.example.lunchtray.databinding;
import com.example.lunchtray.R;
import com.example.lunchtray.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAccompanimentMenuBindingImpl extends FragmentAccompanimentMenuBinding implements com.example.lunchtray.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.accompaniment_options, 13);
        sViewsWithIds.put(R.id.divider, 14);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAccompanimentMenuBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private FragmentAccompanimentMenuBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.RadioGroup) bindings[13]
            , (android.widget.RadioButton) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.RadioButton) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.Button) bindings[11]
            , (android.view.View) bindings[14]
            , (android.widget.Button) bindings[12]
            , (android.widget.RadioButton) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[10]
            );
        this.berries.setTag(null);
        this.berriesDescription.setTag(null);
        this.berriesPrice.setTag(null);
        this.bread.setTag(null);
        this.breadDescription.setTag(null);
        this.breadPrice.setTag(null);
        this.cancelButton.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.nextButton.setTag(null);
        this.pickles.setTag(null);
        this.picklesDescription.setTag(null);
        this.picklesPrice.setTag(null);
        this.subtotal.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new com.example.lunchtray.generated.callback.OnClickListener(this, 4);
        mCallback2 = new com.example.lunchtray.generated.callback.OnClickListener(this, 2);
        mCallback5 = new com.example.lunchtray.generated.callback.OnClickListener(this, 5);
        mCallback3 = new com.example.lunchtray.generated.callback.OnClickListener(this, 3);
        mCallback1 = new com.example.lunchtray.generated.callback.OnClickListener(this, 1);
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
        if (BR.accompaniment == variableId) {
            setAccompaniment((com.example.lunchtray.ui.order.AccompanimentMenuFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.example.lunchtray.model.OrderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAccompaniment(@Nullable com.example.lunchtray.ui.order.AccompanimentMenuFragment Accompaniment) {
        this.mAccompaniment = Accompaniment;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.accompaniment);
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
        java.lang.String viewModelMenuItemsAndroidStringBreadDescription = null;
        androidx.lifecycle.LiveData<java.lang.String> viewModelSubtotal = null;
        java.lang.String viewModelMenuItemsAndroidStringBerriesDescription = null;
        java.lang.String viewModelMenuItemsAndroidStringBreadGetFormattedPrice = null;
        java.lang.String viewModelMenuItemsAndroidStringBreadName = null;
        java.lang.String viewModelMenuItemsAndroidStringPicklesDescription = null;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsAndroidStringBerries = null;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsAndroidStringBread = null;
        java.lang.String viewModelMenuItemsAndroidStringPicklesName = null;
        java.lang.String subtotalAndroidStringSubtotalViewModelSubtotal = null;
        java.util.Map<java.lang.String,com.example.lunchtray.model.MenuItem> viewModelMenuItems = null;
        java.lang.String viewModelMenuItemsAndroidStringPicklesGetFormattedPrice = null;
        java.lang.String viewModelMenuItemsAndroidStringBerriesGetFormattedPrice = null;
        java.lang.String viewModelSubtotalGetValue = null;
        com.example.lunchtray.ui.order.AccompanimentMenuFragment accompaniment = mAccompaniment;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsAndroidStringPickles = null;
        com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
        java.lang.String viewModelMenuItemsAndroidStringBerriesName = null;

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
                        // read viewModel.menuItems[@android:string/berries]
                        viewModelMenuItemsAndroidStringBerries = viewModelMenuItems.get(berries.getResources().getString(R.string.berries));
                        // read viewModel.menuItems[@android:string/bread]
                        viewModelMenuItemsAndroidStringBread = viewModelMenuItems.get(bread.getResources().getString(R.string.bread));
                        // read viewModel.menuItems[@android:string/pickles]
                        viewModelMenuItemsAndroidStringPickles = viewModelMenuItems.get(pickles.getResources().getString(R.string.pickles));
                    }


                    if (viewModelMenuItemsAndroidStringBerries != null) {
                        // read viewModel.menuItems[@android:string/berries].description
                        viewModelMenuItemsAndroidStringBerriesDescription = viewModelMenuItemsAndroidStringBerries.getDescription();
                        // read viewModel.menuItems[@android:string/berries].getFormattedPrice()
                        viewModelMenuItemsAndroidStringBerriesGetFormattedPrice = viewModelMenuItemsAndroidStringBerries.getFormattedPrice();
                        // read viewModel.menuItems[@android:string/berries].name
                        viewModelMenuItemsAndroidStringBerriesName = viewModelMenuItemsAndroidStringBerries.getName();
                    }
                    if (viewModelMenuItemsAndroidStringBread != null) {
                        // read viewModel.menuItems[@android:string/bread].description
                        viewModelMenuItemsAndroidStringBreadDescription = viewModelMenuItemsAndroidStringBread.getDescription();
                        // read viewModel.menuItems[@android:string/bread].getFormattedPrice()
                        viewModelMenuItemsAndroidStringBreadGetFormattedPrice = viewModelMenuItemsAndroidStringBread.getFormattedPrice();
                        // read viewModel.menuItems[@android:string/bread].name
                        viewModelMenuItemsAndroidStringBreadName = viewModelMenuItemsAndroidStringBread.getName();
                    }
                    if (viewModelMenuItemsAndroidStringPickles != null) {
                        // read viewModel.menuItems[@android:string/pickles].description
                        viewModelMenuItemsAndroidStringPicklesDescription = viewModelMenuItemsAndroidStringPickles.getDescription();
                        // read viewModel.menuItems[@android:string/pickles].name
                        viewModelMenuItemsAndroidStringPicklesName = viewModelMenuItemsAndroidStringPickles.getName();
                        // read viewModel.menuItems[@android:string/pickles].getFormattedPrice()
                        viewModelMenuItemsAndroidStringPicklesGetFormattedPrice = viewModelMenuItemsAndroidStringPickles.getFormattedPrice();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.berries.setOnClickListener(mCallback2);
            this.bread.setOnClickListener(mCallback1);
            this.cancelButton.setOnClickListener(mCallback4);
            this.nextButton.setOnClickListener(mCallback5);
            this.pickles.setOnClickListener(mCallback3);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.berries, viewModelMenuItemsAndroidStringBerriesName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.berriesDescription, viewModelMenuItemsAndroidStringBerriesDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.berriesPrice, viewModelMenuItemsAndroidStringBerriesGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.bread, viewModelMenuItemsAndroidStringBreadName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.breadDescription, viewModelMenuItemsAndroidStringBreadDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.breadPrice, viewModelMenuItemsAndroidStringBreadGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.pickles, viewModelMenuItemsAndroidStringPicklesName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.picklesDescription, viewModelMenuItemsAndroidStringPicklesDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.picklesPrice, viewModelMenuItemsAndroidStringPicklesGetFormattedPrice);
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
                // accompaniment
                com.example.lunchtray.ui.order.AccompanimentMenuFragment accompaniment = mAccompaniment;
                // accompaniment != null
                boolean accompanimentJavaLangObjectNull = false;



                accompanimentJavaLangObjectNull = (accompaniment) != (null);
                if (accompanimentJavaLangObjectNull) {


                    accompaniment.cancelOrder();
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



                    viewModel.setAccompaniment(berries.getResources().getString(R.string.berries));
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // accompaniment
                com.example.lunchtray.ui.order.AccompanimentMenuFragment accompaniment = mAccompaniment;
                // accompaniment != null
                boolean accompanimentJavaLangObjectNull = false;



                accompanimentJavaLangObjectNull = (accompaniment) != (null);
                if (accompanimentJavaLangObjectNull) {


                    accompaniment.goToNextScreen();
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



                    viewModel.setAccompaniment(pickles.getResources().getString(R.string.pickles));
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



                    viewModel.setAccompaniment(bread.getResources().getString(R.string.bread));
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.subtotal
        flag 1 (0x2L): accompaniment
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}