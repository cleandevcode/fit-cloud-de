package com.google.android.material.datepicker;

import android.view.View;

/* loaded from: classes.dex */
public final class e0 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f6466a;

    /* renamed from: b */
    public final /* synthetic */ f0 f6467b;

    public e0(f0 f0Var, int i10) {
        this.f6467b = f0Var;
        this.f6466a = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        u a10 = u.a(this.f6466a, this.f6467b.f6469d.f6479p0.f6513b);
        a aVar = this.f6467b.f6469d.f6478o0;
        if (a10.f6512a.compareTo(aVar.f6436a.f6512a) < 0) {
            a10 = aVar.f6436a;
        } else {
            if (a10.f6512a.compareTo(aVar.f6437b.f6512a) > 0) {
                a10 = aVar.f6437b;
            }
        }
        this.f6467b.f6469d.f1(a10);
        this.f6467b.f6469d.g1(1);
    }
}
