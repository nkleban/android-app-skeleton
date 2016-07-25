package net.intellectsoft.skeleton.presentation.ui;

import net.intellectsoft.core.mvp.presentation.ui.BaseAppCompatActivity;
import net.intellectsoft.skeleton.presentation.Navigator;

import javax.inject.Inject;

public class BaseActivity extends BaseAppCompatActivity {

    @Inject protected Navigator navigator;

    public Navigator getNavigator() {
        return navigator;
    }

}
