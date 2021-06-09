package com.bigkoo.pickerviewdemo;


import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class FragmentTestActivity extends Activity {
    private FragmentManager mFragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragmenttest);
        mFragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_activity_main, new TestFragment());
        fragmentTransaction.commitAllowingStateLoss();

    }
}
