package com.inari.firefly.libgdx.intro;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.inari.firefly.physics.animation.Animation;
import com.inari.firefly.system.FFContext;
import com.inari.firefly.system.utils.Condition;

public final class InariIntroFinishedCondition implements Condition {
    
    @Override
    public final boolean check( FFContext context ) {
        return context.getSystemComponent( Animation.TYPE_KEY, BuildInariIntro.INTRO_ANIMATION ) == null && 
               ( Gdx.input.isKeyPressed( Input.Keys.SPACE ) || Gdx.input.isTouched() || Gdx.input.isButtonPressed( Input.Buttons.LEFT ) );
    }

}