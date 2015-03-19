package uk.me.goff.androidmaven;

import android.app.Activity;
import android.widget.Button;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = "./AndroidManifest.xml", emulateSdk = 18)
public class HelloAndroidActivityTest {

  private Activity activity;

  @Before
  public void setUp() throws Exception {
    activity = Robolectric.setupActivity(HelloAndroidActivity.class);
  }

  @Test
  public void testJunit() {
    assertTrue(true);
  }
  @Test
  public void titleIsCorrect() {
    assertTrue(activity.getTitle().toString().equals("Hello Android!"));
  }

  @Test
  public void buttonCaptionIsCorrect() {
    Button button = (Button) activity.findViewById(R.id.button);
    assertEquals("Click Me!",  button.getText());
  }
}
