package com.google.android.material.behavior;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.e;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;
import l1.n;

/* loaded from: classes.dex */
public final class a implements n {

    /* renamed from: a */
    public final /* synthetic */ SwipeDismissBehavior f6261a;

    public a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f6261a = swipeDismissBehavior;
    }

    @Override // l1.n
    public final boolean a(View view) {
        boolean z10;
        boolean z11 = false;
        if (!this.f6261a.s(view)) {
            return false;
        }
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        if (o0.e.d(view) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = this.f6261a.f6250d;
        if ((i10 == 0 && z10) || (i10 == 1 && !z10)) {
            z11 = true;
        }
        int width = view.getWidth();
        if (z11) {
            width = -width;
        }
        o0.i(view, width);
        view.setAlpha(0.0f);
        SwipeDismissBehavior.b bVar = this.f6261a.f6248b;
        if (bVar != null) {
            ((e) bVar).a(view);
        }
        return true;
    }
}
