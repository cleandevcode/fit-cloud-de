package com.google.android.material.datepicker;

import android.view.View;
import k1.n2;

/* loaded from: classes.dex */
public final class q implements k1.e0 {

    /* renamed from: a */
    public final /* synthetic */ int f6504a;

    /* renamed from: b */
    public final /* synthetic */ View f6505b;

    /* renamed from: c */
    public final /* synthetic */ int f6506c;

    public q(int i10, View view, int i11) {
        this.f6504a = i10;
        this.f6505b = view;
        this.f6506c = i11;
    }

    @Override // k1.e0
    public final n2 a(View view, n2 n2Var) {
        int i10 = n2Var.a(7).f215b;
        if (this.f6504a >= 0) {
            this.f6505b.getLayoutParams().height = this.f6504a + i10;
            View view2 = this.f6505b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        View view3 = this.f6505b;
        view3.setPadding(view3.getPaddingLeft(), this.f6506c + i10, this.f6505b.getPaddingRight(), this.f6505b.getPaddingBottom());
        return n2Var;
    }
}
