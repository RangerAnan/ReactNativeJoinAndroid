package com.rn.admin.testrn;

import com.facebook.react.BuildConfig;
import com.facebook.react.ReactActivity;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nullable;

public class MyRNActivity extends ReactActivity {

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "app";
    }

//    @Override
//    protected boolean getUseDeveloperSupport() {
//        return BuildConfig.DEBUG;
//    }
//
//    @Override
//    protected List<ReactPackage> getPackages() {
//        List<ReactPackage> objects = new ArrayList<>();
//        objects.add(new MainReactPackage());
//        return objects;
//    }


    /**
     * bundling failed: NotFoundError: Cannot find entry file index.android.js in any of the roots
     */
//    @Override
//    protected String getJSMainModuleName() {
//        return "index";
//    }

 /*   @Nullable
    @Override
    protected String getBundleAssetName() {
        return "index.bundle";
    }*/
}
