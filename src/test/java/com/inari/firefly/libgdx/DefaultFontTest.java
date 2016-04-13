package com.inari.firefly.libgdx;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.inari.commons.graphics.RGBColor;
import com.inari.firefly.entity.ETransform;
import com.inari.firefly.graphics.text.EText;
import com.inari.firefly.graphics.text.TextSystem;
import com.inari.firefly.system.FFContext;
import com.inari.firefly.system.view.View;

public class DefaultFontTest extends GdxFFApplicationAdapter{
    
    @Override
    public String getTitle() {
        return "DefaultFontTest";
    }

    @Override
    protected void init( FFContext context ) {
        context.loadSystem( TextSystem.SYSTEM_KEY );
        context.getSystemComponent( View.TYPE_KEY, 0 )
            .setClearColor( new RGBColor( 1, 1, 1, 1 ) );

        context.getEntityBuilder()
            .set( ETransform.VIEW_ID, 0 )
            .set( ETransform.LAYER_ID, 0 )
            .set( ETransform.XPOSITION, 10 )
            .set( ETransform.YPOSITION, 10 )
            .set( EText.FONT_ASSET_NAME, FFContext.DEFAULT_FONT )
            .set( EText.TEXT, "Test 123 Dies ist ein Text mit einem Absatz\nUnd hier geht es weiter mit dem Text" )
            .activate();
    }

    @Override
    protected void resize( int width, int height, FFContext context ) {
    }

    @Override
    protected void pause( FFContext context ) {
    }

    @Override
    protected void resume( FFContext context ) {
    }
    
    public static void main (String[] arg) {
        try {
            LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
            config.resizable = false;
            config.width = 800;
            config.height = 600;
            new LwjglApplication( new DefaultFontTest(), config );
        } catch ( Throwable t ) {
            t.printStackTrace();
        }
    }

}
