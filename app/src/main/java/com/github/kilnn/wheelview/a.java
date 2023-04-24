package com.github.kilnn.wheelview;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class a extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    public final /* synthetic */ b f5989a;

    public a(b bVar) {
        this.f5989a = bVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        b bVar = this.f5989a;
        bVar.f5994e = 0;
        bVar.f5993d.fling(0, 0, 0, (int) (-f11), 0, 0, -2147483647, Integer.MAX_VALUE);
        b bVar2 = this.f5989a;
        bVar2.f5997h.removeMessages(0);
        bVar2.f5997h.removeMessages(1);
        bVar2.f5997h.sendEmptyMessage(0);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return true;
    }
}
