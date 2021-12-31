package com.pratik.grid_animation;

import org.junit.Test;

public class ExampleTest {
    @Test
    public void testBundleName() {
        final String actualBundleName = AbilityDelegatorRegistry.getArguments().getTestBundleName();
        assertEquals("com.pratik.grid_animation", actualBundleName);
    }
}
