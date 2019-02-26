package de.roamingthings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThingTest {

    @Test
    fun `it should call for action`() {
        val thing = Thing()

        val value = thing.callForAction()

        assertThat(value).isEqualTo("Done.")
    }
}