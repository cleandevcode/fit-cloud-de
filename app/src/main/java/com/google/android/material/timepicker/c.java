package com.google.android.material.timepicker;

import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.R;
import l1.j;

/* loaded from: classes.dex */
public final class c extends k1.a {

    /* renamed from: d */
    public final /* synthetic */ ClockFaceView f6910d;

    public c(ClockFaceView clockFaceView) {
        this.f6910d = clockFaceView;
    }

    @Override // k1.a
    public final void d(View view, j jVar) {
        this.f18085a.onInitializeAccessibilityNodeInfo(view, jVar.f18670a);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            TextView textView = this.f6910d.f6892w.get(intValue - 1);
            if (Build.VERSION.SDK_INT >= 22) {
                jVar.f18670a.setTraversalAfter(textView);
            }
        }
        jVar.h(j.c.a(0, 1, intValue, 1, view.isSelected()));
        jVar.f18670a.setClickable(true);
        jVar.b(j.a.f18673e);
    }

    @Override // k1.a
    public final boolean g(View view, int i10, Bundle bundle) {
        if (i10 == 16) {
            long uptimeMillis = SystemClock.uptimeMillis();
            float x10 = view.getX() + (view.getWidth() / 2.0f);
            float height = (view.getHeight() / 2.0f) + view.getY();
            this.f6910d.f6889t.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, x10, height, 0));
            this.f6910d.f6889t.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, x10, height, 0));
            return true;
        }
        return super.g(view, i10, bundle);
    }
}
