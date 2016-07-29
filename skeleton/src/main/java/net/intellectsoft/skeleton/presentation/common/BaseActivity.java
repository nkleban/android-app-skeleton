package net.intellectsoft.skeleton.presentation.common;

import net.intellectsoft.core.mvp.presentation.ui.BaseAppCompatActivity;

import javax.inject.Inject;

public class BaseActivity extends BaseAppCompatActivity {

    @Inject protected Navigator navigator;

    public Navigator getNavigator() {
        return navigator;
    }

}
