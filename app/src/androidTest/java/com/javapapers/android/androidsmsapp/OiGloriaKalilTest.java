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

/**
 * Created by ricardo on 03/07/15.
 */
public class OiGloriaKalilTest extends SmsTest {

    private static final String LA = "66006";

    private static final String KEYWORD_OPTIN = "ESTILO";

    public void test() {
        sendMessage(LA,KEYWORD_OPTIN);
        delay(3);
        verifyMessage(LA,"Aproveite! Voce assinou o Estilo com Gloria Kalil e os 7 primeiros dias sao GRATIS!");
    }

}
