package com.example.appjava;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {
    private String tag = "BaseActivity";
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        Log.d(tag,getClass().getSimpleName());
        Collection.addActivity(this);
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Collection.removeActivity(this);
    }
}
