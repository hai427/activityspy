package edu.washington.hai427.activityspy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    String tag = "mainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(tag, "on onCreate event fired");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i(tag, "on onStart event fired");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i(tag, "on onResume event fired");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i(tag, "on onPause event fired");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i(tag, "on onStop event fired");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.i(tag, "on onRestart event fired");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.e(tag, "We’re going down, Captain!");
    }
}
