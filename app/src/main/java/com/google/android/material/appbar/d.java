package com.google.android.material.appbar;

import android.view.View;
import l1.n;

/* loaded from: classes.dex */
public final class d implements n {

    /* renamed from: a */
    public final /* synthetic */ AppBarLayout f6241a;

    /* renamed from: b */
    public final /* synthetic */ boolean f6242b;

    public d(AppBarLayout appBarLayout, boolean z10) {
        this.f6241a = appBarLayout;
        this.f6242b = z10;
    }

    @Override // l1.n
    public final boolean a(View view) {
        this.f6241a.setExpanded(this.f6242b);
        return true;
    }
}
