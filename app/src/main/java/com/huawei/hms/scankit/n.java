package com.huawei.hms.scankit;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public class n implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ q f7451a;

    public n(q qVar) {
        this.f7451a = qVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.f7451a.f8149h.a(motionEvent);
        return true;
    }
}
