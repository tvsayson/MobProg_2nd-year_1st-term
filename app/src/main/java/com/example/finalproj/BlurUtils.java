package com.example.finalproj;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

public class BlurUtils {
    public static Bitmap blur(Context context, Bitmap inputBitmap, int radius) {
        RenderScript renderScript = RenderScript.create(context);
        final Allocation input = Allocation.createFromBitmap(renderScript, inputBitmap);
        final Allocation output = Allocation.createTyped(renderScript, input.getType());
        final ScriptIntrinsicBlur script = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
        script.setInput(input);
        script.setRadius(radius);
        script.forEach(output);
        output.copyTo(inputBitmap);
        return inputBitmap;
    }
}

