package com.google.android.material.datepicker;

import android.view.View;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class m implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ x f6497a;

    /* renamed from: b */
    public final /* synthetic */ h f6498b;

    public m(h hVar, x xVar) {
        this.f6498b = hVar;
        this.f6497a = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int O0 = this.f6498b.d1().O0() + 1;
        if (O0 < this.f6498b.f6483t0.getAdapter().e()) {
            h hVar = this.f6498b;
            Calendar b10 = d0.b(this.f6497a.f6527d.f6436a.f6512a);
            b10.add(2, O0);
            hVar.f1(new u(b10));
        }
    }
}
