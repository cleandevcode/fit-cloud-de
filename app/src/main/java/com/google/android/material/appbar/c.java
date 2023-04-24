package com.google.android.material.appbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import l1.n;

/* loaded from: classes.dex */
public final class c implements n {

    /* renamed from: a */
    public final /* synthetic */ CoordinatorLayout f6236a;

    /* renamed from: b */
    public final /* synthetic */ AppBarLayout f6237b;

    /* renamed from: c */
    public final /* synthetic */ View f6238c;

    /* renamed from: d */
    public final /* synthetic */ int f6239d;

    /* renamed from: e */
    public final /* synthetic */ AppBarLayout.BaseBehavior f6240e;

    public c(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
        this.f6240e = baseBehavior;
        this.f6236a = coordinatorLayout;
        this.f6237b = appBarLayout;
        this.f6238c = view;
        this.f6239d = i10;
    }

    @Override // l1.n
    public final boolean a(View view) {
        this.f6240e.D(this.f6236a, this.f6237b, this.f6238c, this.f6239d, new int[]{0, 0});
        return true;
    }
}
