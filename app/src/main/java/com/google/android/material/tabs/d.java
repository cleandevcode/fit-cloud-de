package com.google.android.material.tabs;

import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes.dex */
public final class d implements View.OnLayoutChangeListener {

    /* renamed from: a */
    public final /* synthetic */ View f6763a;

    /* renamed from: b */
    public final /* synthetic */ TabLayout.i f6764b;

    public d(TabLayout.i iVar, View view) {
        this.f6764b = iVar;
        this.f6763a = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (this.f6763a.getVisibility() == 0) {
            this.f6764b.d(this.f6763a);
        }
    }
}
