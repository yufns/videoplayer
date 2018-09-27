package com.ttyd.videoplayer.videolib.render.effect;

import android.opengl.GLSurfaceView;
import com.ttyd.videoplayer.videolib.render.view.GSYVideoGLView;

/**
 * Adjusts the brightness of the video.
 *
 * @author sheraz.khilji
 */
public class BrightnessEffect implements GSYVideoGLView.ShaderInterface {
    private float brightnessValue;

    /**
     * Initialize Effect
     *
     * @param brightnessvalue Range should be between 0.1- 2.0 with 1.0 being normal.
     */
    public BrightnessEffect(float brightnessvalue) {
        if (brightnessvalue < 0.1f) brightnessvalue = 0.1f;
        if (brightnessvalue > 2.0f) brightnessvalue = 2.0f;

        this.brightnessValue = brightnessvalue;
    }

    @Override public String getShader(GLSurfaceView mGlSurfaceView) {

        String shader = "#extension GL_OES_EGL_image_external : require\n"
            + "precision mediump float;\n"
            + "uniform samplerExternalOES sTexture;\n"
            + "float brightness ;\n"
            + "varying vec2 vTextureCoord;\n"
            + "void main() {\n"
            + "  brightness ="
            + brightnessValue
            + ";\n"
            + "  vec4 color = texture2D(sTexture, vTextureCoord);\n"
            + "  gl_FragColor = brightness * color;\n"
            + "}\n";

        return shader;
    }
}
