package com.javapapers.android.androidsmsapp;

import android.app.Application;
import android.support.test.espresso.ViewAction;
import android.support.test.espresso.action.ViewActions;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ApplicationTestCase;
import android.test.suitebuilder.annotation.LargeTest;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@LargeTest
public class ApplicationTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public ApplicationTest() {super(MainActivity.class);}

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        getActivity();
    }

    public void testButtonPresentAndActivityChange() {
        onView(withId(R.id.btnInbox)).check(matches(isDisplayed()));
        onView(withId(R.id.btnInbox)).perform(click());
    }

    public void testSendAndReceiveSms() throws InterruptedException {
        onView(withId(R.id.btnCompose)).check(matches(isDisplayed()));
        onView(withId(R.id.btnCompose)).perform(click());

        onView(withId(R.id.editTextPhoneNo)).perform(typeText("5184117032"));
        onView(withId(R.id.editTextSMS)).perform(typeText("mensagem ui loco"));

        onView(withId(R.id.btnSendSMS)).perform(click());

        Thread.sleep(500000);

        onView(withId(R.id.btnInbox)).check(matches(isDisplayed()));
        onView(withId(R.id.btnInbox)).perform(click());



        onView(withId(R.id.textView)).check(matches(withText("dieine")));
    }

}