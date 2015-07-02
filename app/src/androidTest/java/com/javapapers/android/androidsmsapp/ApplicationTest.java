package com.javapapers.android.androidsmsapp;

import android.app.Application;
import android.support.test.espresso.ViewAction;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ApplicationTestCase;
import android.test.suitebuilder.annotation.LargeTest;

import org.hamcrest.CoreMatchers;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.collection.IsMapContaining.hasEntry;
import static org.hamcrest.core.Is.is;

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

        //onView(withId(R.id.btnSendSMS)).perform(click());

        //Thread.sleep(50000);

        onView(withId(R.id.btnInbox)).check(matches(isDisplayed()));
        onView(withId(R.id.btnInbox)).perform(click());

        onData(allOf(is(instanceOf(String.class)), containsString("Dieine")))
                .perform(click());

        //onData(allOf(is(instanceOf(String.class)), containsString("estegosauro")))
               // .perform(click());


    }

}