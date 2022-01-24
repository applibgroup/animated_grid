package com.pratik.grid_animation;

import com.pratik.grid_animation.slice.Page1Slice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class Page1 extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(Page1Slice.class.getName());
    }
}
