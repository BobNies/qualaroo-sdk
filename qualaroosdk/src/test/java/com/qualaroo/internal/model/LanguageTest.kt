package com.qualaroo.internal.model

import com.qualaroo.internal.model.TestModels.language
import org.junit.Assert.assertTrue
import org.junit.Test

class LanguageTest {

    @Test
    fun equals() {
        val plLanguage = language("pl")
        val enLanguage = language("en")
        val otherEnLanguage = language("en")

        assertTrue(plLanguage != enLanguage)
        assertTrue(enLanguage == otherEnLanguage)
        assertTrue(enLanguage == enLanguage)
    }

}