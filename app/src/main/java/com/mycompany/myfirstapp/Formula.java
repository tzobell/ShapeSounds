package com.mycompany.myfirstapp;

import android.util.Pair;

/**
 * Created by Owner on 9/17/2015.
 */
public interface Formula {

    Pair<Float,Float>[] GetKeyPoints();
    Pair<Float,Float> GetClosestPoint(float x,float y);
    Formula[] GetGoldenPoints();
    Pair<Float,Float> GetStart();
    Pair<Float,Float> GetEnd();
    boolean doesLineCross(LineFormula lf);
}
