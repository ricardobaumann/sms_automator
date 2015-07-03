package com.javapapers.android.androidsmsapp;

import android.test.ActivityInstrumentationTestCase2;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.core.Is.is;

/**
 * Created by ricardo on 03/07/15.
 */
public class SmsTest extends ActivityInstrumentationTestCase2<MainActivity>{


    public SmsTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        //TODO: clean inbox
    }

    public void sendMessage(String msisdn,String message) {
        onView(withId(R.id.btnCompose)).check(matches(isDisplayed()));
        onView(withId(R.id.btnCompose)).perform(click());

        onView(withId(R.id.editTextPhoneNo)).perform(typeText(msisdn));
        onView(withId(R.id.editTextSMS)).perform(typeText(message));

        onView(withId(R.id.btnSendSMS)).perform(click());
    }

    public void verifyMessage(String from,String message) {
        onView(withId(R.id.btnInbox)).check(matches(isDisplayed()));
        onView(withId(R.id.btnInbox)).perform(click());

        onData(allOf(is(instanceOf(String.class)), containsString(message)))
                .perform(click());
    }

    public void delay(long minutes) {
        try {
            Thread.sleep(minutes*60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
