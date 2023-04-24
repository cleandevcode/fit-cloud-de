package com.github.kilnn.wheelview;

import com.github.kilnn.wheelview.b;

/* loaded from: classes.dex */
public final class c implements b.InterfaceC0090b {

    /* renamed from: a */
    public final /* synthetic */ WheelView f5999a;

    public c(WheelView wheelView) {
        this.f5999a = wheelView;
    }

    public final void a(int i10) {
        WheelView.a(this.f5999a, i10);
        int height = this.f5999a.getHeight();
        WheelView wheelView = this.f5999a;
        int i11 = wheelView.f5984v;
        if (i11 > height) {
            wheelView.f5984v = height;
        } else {
            int i12 = -height;
            if (i11 < i12) {
                wheelView.f5984v = i12;
            } else {
                return;
            }
        }
        wheelView.f5982t.d();
    }
}
