package net.intellectsoft.skeleton.presentation.common;

import android.content.Context;

import net.intellectsoft.core.mvp.presentation.ui.BaseCompatFragment;

public abstract class BaseFragment extends BaseCompatFragment {

    protected Navigator navigator;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        BaseActivity activity = ((BaseActivity) getActivity());
        navigator = activity.getNavigator();
    }

}
