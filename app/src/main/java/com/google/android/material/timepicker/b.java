package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    public final /* synthetic */ ClockFaceView f6909a;

    public b(ClockFaceView clockFaceView) {
        this.f6909a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (!this.f6909a.isShown()) {
            return true;
        }
        this.f6909a.getViewTreeObserver().removeOnPreDrawListener(this);
        ClockFaceView clockFaceView = this.f6909a;
        int height = ((this.f6909a.getHeight() / 2) - clockFaceView.f6889t.f6897b) - clockFaceView.A;
        if (height != clockFaceView.f6912r) {
            clockFaceView.f6912r = height;
            clockFaceView.i();
            ClockHandView clockHandView = clockFaceView.f6889t;
            clockHandView.f6905j = clockFaceView.f6912r;
            clockHandView.invalidate();
        }
        return true;
    }
}
