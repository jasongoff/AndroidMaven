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
public class ThirdActivityTest {
  private Activity activity;
  private TextView textView;

  @Before
  public void setUp() {
    activity = Robolectric.setupActivity(ThirdActivity.class);
    textView = (TextView) activity.findViewById(R.id.textview3);
  }

  @Test
  public void thatTextViewCaptionIsCorrect() {
    assertEquals("Number 3 for a third feature", textView.getText());
  }
}
