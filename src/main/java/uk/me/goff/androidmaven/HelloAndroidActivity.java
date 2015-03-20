package uk.me.goff.androidmaven;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HelloAndroidActivity extends Activity {

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    setTitle("Hello Android!");
    bindButtonToActivityLaunch(R.id.button, SecondActivity.class);
    bindButtonToActivityLaunch(R.id.button3, ThirdActivity.class);
  }

  private void bindButtonToActivityLaunch(int buttonId, final Class<? extends Activity> activityClass) {
    findViewById(buttonId).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        startActivity(new Intent(getBaseContext(), activityClass));
      }
    });
  }
}


