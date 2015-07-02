package com.javapapers.android.androidsmsapp;

import android.app.Application;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ApplicationTestCase;
import android.test.suitebuilder.annotation.LargeTest;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

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

}