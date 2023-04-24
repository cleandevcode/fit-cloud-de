package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.R;

/* loaded from: classes.dex */
public final class j extends k1.a {

    /* renamed from: d */
    public final /* synthetic */ h f6492d;

    public j(h hVar) {
        this.f6492d = hVar;
    }

    @Override // k1.a
    public final void d(View view, l1.j jVar) {
        h hVar;
        int i10;
        this.f18085a.onInitializeAccessibilityNodeInfo(view, jVar.f18670a);
        if (this.f6492d.f6485v0.getVisibility() == 0) {
            hVar = this.f6492d;
            i10 = R.string.mtrl_picker_toggle_to_year_selection;
        } else {
            hVar = this.f6492d;
            i10 = R.string.mtrl_picker_toggle_to_day_selection;
        }
        jVar.j(hVar.o0(i10));
    }
}
