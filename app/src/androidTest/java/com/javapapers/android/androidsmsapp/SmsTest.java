package com.javapapers.android.androidsmsapp;

import android.test.ActivityInstrumentationTestCase2;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
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
public abstract class SmsTest extends ActivityInstrumentationTestCase2<MainActivity>{


    public SmsTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        getActivity();
        //TODO: clean inbox
    }

    protected Integer getDefaultDelay() {
        return 1;
    }

    public void optin() {
        sendMessageAndDelay(getLA(),getOptinKeyword());
    }

    public void optout() {

        sendMessageAndDelay(getLA(),getOptoutKeyword());
    }


    protected String getOptoutKeyword() {
        return "SAIR";
    }

    public void testOptinOptout() {

        optout();

        optin();

        if (getFreePeriodMessage()!=null) {
            verifyMessage(getFreePeriodMessage());
        }



        if (getWelcomeMessage()!=null) {
            verifyMessage(getWelcomeMessage());
        }

        if (getAlreadySignedMessage()!=null) {
            optin();

            verifyMessage(getAlreadySignedMessage());
        }

        if (getFirstContent()!=null) {
            verifyMessage(getFirstContent());
        }

        optout();

        verifyMessage(getSignoutMessage());


    }

    protected abstract String getFirstContent();

    protected abstract String getSignoutMessage();

    protected abstract String getAlreadySignedMessage();

    protected abstract String getWelcomeMessage();

    protected abstract String getFreePeriodMessage();

    protected abstract String getOptinKeyword();

    protected abstract String getLA();

    public void sendMessageAndDelay(String msisdn, String message) {



        try {
            onView(withId(R.id.btnCompose)).check(matches(isDisplayed()));
            onView(withId(R.id.btnCompose)).perform(click());
        }
        catch (Exception e) {

        }

        clear();

        onView(withId(R.id.editTextPhoneNo)).perform(typeText(msisdn));
        onView(withId(R.id.editTextSMS)).perform(typeText(message));

        onView(withId(R.id.btnSendSMS)).perform(click());

        delay(getDefaultDelay());
    }

    private void clear() {
        onView(withId(R.id.editTextPhoneNo)).perform(clearText());
        onView(withId(R.id.editTextSMS)).perform(clearText());
    }

    public void verifyMessage(String message) {
        try {
            onView(withId(R.id.btnInbox)).check(matches(isDisplayed()));
            onView(withId(R.id.btnInbox)).perform(click());
        } catch (Exception e) {

        }

        try {
            onData(allOf(is(instanceOf(String.class)), containsString(message)))
                    .perform(click());
        }
        catch (RuntimeException re) {
            if (!re.getMessage().contains("Multiple data")) {
                throw re;
            }
        }
    }

    public void delay(long minutes) {
        try {
            Thread.sleep(minutes*60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
