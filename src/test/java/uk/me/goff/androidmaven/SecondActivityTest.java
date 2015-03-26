package uk.me.goff.androidmaven;

import android.app.Activity;
import android.widget.TextView;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = "./AndroidManifest.xml", emulateSdk = 18)
public class SecondActivityTest {
  private Activity activity;
  private TextView textView;

  @Before
  public void setUp() {
    activity = Robolectric.setupActivity(SecondActivity.class);
    textView = (TextView) activity.findViewById(R.id.textView2);
  }

  @Test
  public void thatTextViewCaptionIsCorrect() {
    assertEquals("Second Screen with a change", textView.getText());
  }
}
