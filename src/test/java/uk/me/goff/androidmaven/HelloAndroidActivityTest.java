package uk.me.goff.androidmaven;

import android.app.Activity;
import android.content.Intent;
import android.widget.Button;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.robolectric.Robolectric.shadowOf;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = "./AndroidManifest.xml", emulateSdk = 18)
public class HelloAndroidActivityTest {

  private Activity activity;
  private Button button3;
  private Button button;

  @Before
  public void setUp() throws Exception {
    activity = Robolectric.setupActivity(HelloAndroidActivity.class);
    button3 = (Button) activity.findViewById(R.id.button3);
    button = (Button) activity.findViewById(R.id.button);
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
    assertEquals("Activity 2", button.getText());
  }

  @Test
  public void thatButton3CaptionIsCorrect() {
    assertEquals("Activity 3", button3.getText());
  }

  @Test
  public void thatButtonStartsSecondScreen() {
    button.performClick();
    Intent expectedIntent = new Intent(activity, SecondActivity.class);
    assertThat(shadowOf(activity).peekNextStartedActivity(), is(expectedIntent));
  }

  @Test
  public void thatButton3StartsThirdScreen() {
    button3.performClick();
    Intent expectedIntent = new Intent(activity, ThirdActivity.class);
    assertThat(shadowOf(activity).peekNextStartedActivity(), is(expectedIntent));
  }
}
