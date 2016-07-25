package net.intellectsoft.skeleton.presentation.ui;

import android.content.Context;

import net.intellectsoft.core.mvp.presentation.ui.BaseCompatFragment;
import net.intellectsoft.skeleton.presentation.Navigator;

public abstract class BaseFragment extends BaseCompatFragment {

    protected Navigator navigator;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        BaseActivity activity = ((BaseActivity) getActivity());
        navigator = activity.getNavigator();
    }

}
