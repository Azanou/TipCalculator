package com.example.tiptime

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performTextInput
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.tiptime.ui.theme.TipTimeTheme

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
       //-- val appContext = InstrumentationRegistry.getInstrumentation().targetContext
       //-- assertEquals("com.example.tiptime", appContext.packageName)

         val composeTestRule = createComposeRule()

        @Test
        fun calculate_20_percent_tip() {
            composeTestRule.setContent {
                TipTimeTheme {
                    TipTimeLayout()
                }
            }
            composeTestRule.onNodeWithText("Bill Amount").performTextInput("10")
            composeTestRule.onNodeWithText("Tip Percentage").performTextInput("20")

            val expectedTip = "2.0 XAF"
            composeTestRule.onNodeWithText("Tip Amount: $expectedTip")
                            .assertExists("No node with this text was found.")
        }

    }
}