package com.google.android.material.datepicker;

import android.view.View;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class n implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ x f6499a;

    /* renamed from: b */
    public final /* synthetic */ h f6500b;

    public n(h hVar, x xVar) {
        this.f6500b = hVar;
        this.f6499a = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int P0 = this.f6500b.d1().P0() - 1;
        if (P0 >= 0) {
            h hVar = this.f6500b;
            Calendar b10 = d0.b(this.f6499a.f6527d.f6436a.f6512a);
            b10.add(2, P0);
            hVar.f1(new u(b10));
        }
    }
}
