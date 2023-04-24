package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* loaded from: classes.dex */
public final class g implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ GestureDetector f6917a;

    public g(GestureDetector gestureDetector) {
        this.f6917a = gestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f6917a.onTouchEvent(motionEvent);
        }
        return false;
    }
}
