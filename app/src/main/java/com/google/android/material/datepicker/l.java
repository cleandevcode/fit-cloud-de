package com.google.android.material.datepicker;

import android.view.View;

/* loaded from: classes.dex */
public final class l implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ h f6496a;

    public l(h hVar) {
        this.f6496a = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        h hVar = this.f6496a;
        int i10 = hVar.f6480q0;
        if (i10 == 2) {
            hVar.g1(1);
        } else if (i10 == 1) {
            hVar.g1(2);
        }
    }
}
