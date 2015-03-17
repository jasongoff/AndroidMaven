package uk.me.goff.androidmaven;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class HelloAndroidActivity extends Activity {

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Button button = (Button) findViewById(R.id.button);
    button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        startSecondScreen();
      }
    });
  }

  private void startSecondScreen() {
    Random random = new Random();
    Class<? extends Activity> activityClass = (random.nextBoolean()) ? SecondActivity.class : ThirdActivity.class;
    startActivity(new Intent(this, activityClass));
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(uk.me.goff.androidmaven.R.menu.main, menu);
    return true;
  }

}

