package com.ajeetkumar.circlecitestapp;


import android.app.KeyguardManager;
import android.content.Context;
import android.test.ActivityInstrumentationTestCase2;

import org.junit.Before;
import org.junit.Test;

import static android.support.test.espresso.Espresso.closeSoftKeyboard;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;


/**
 * Created by dev on 23/09/15.
 */
public class FirstTestCase extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity mainActivity;

    public FirstTestCase() {
        super(MainActivity.class);
    }


    @Before
    public void setUp() throws Exception {
        super.setUp();
        injectInstrumentation(getInstrumentation());
        mainActivity = getActivity();
    }

    @Test
    public void testChangeText_sameActivity() {
        // Fill some dummy text into the text view
        //onView(withId(R.id.test_edit_text)).perform(typeText("just a test text."));

        // Click Button to go the second activity
        //onView(withId(R.id.text_btn)).perform(click());
    }
}
