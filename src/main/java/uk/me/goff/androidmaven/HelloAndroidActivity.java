package uk.me.goff.androidmaven;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HelloAndroidActivity extends Activity {

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    setTitle("Hello Android!");
    ButterKnife.inject(this);
  }

  @OnClick(R.id.button)
  void button1Click() {
    sendStartIntentTo(SecondActivity.class);
  }

  private void sendStartIntentTo(Class<? extends Activity> activityClass) {
    startActivity(new Intent(getBaseContext(), activityClass));
  }

  @OnClick(R.id.button3)
  void button2Click() {
    sendStartIntentTo(ThirdActivity.class);
  }
}

