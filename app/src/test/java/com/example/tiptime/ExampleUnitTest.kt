package com.example.tiptime

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class TipCalculatorText{
    @Test
    fun calculateTip_20PercentNoRoundUp(){
        val amount = 10.00
        val tipPercent = 20.00
        val result = 2.0
        val expectedTip = "$result XAF"
        val actualTip = calculateTip(amount=amount, tipPercent=tipPercent, roundUp = false)
        assertEquals(expectedTip, actualTip)
    }
}