package com.testflow;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ItemFragment f = (ItemFragment) getSupportFragmentManager().findFragmentByTag("item");
    if (f == null) {
      f = ItemFragment.newInstance(1);
      getSupportFragmentManager().beginTransaction().replace(R.id.frame, f).commit();
    }
  }
}
