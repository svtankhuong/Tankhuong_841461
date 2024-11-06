package com.example.tankhuong;
import android.graphics.drawable.GradientDrawable;
import android.graphics.Color;
public class ShapeDrawable {
    public GradientDrawable createShape()
    {
        GradientDrawable shape = new GradientDrawable();
        shape.setShape(GradientDrawable.RECTANGLE);
        shape.setColor(Color.parseColor("#800080"));
        float[] radi = new float[]{
                100f, 100f,
                100f, 100f,
                100f, 100f,
                100f, 100f
        };
        shape.setCornerRadii(radi);
        return shape;
    }
}
