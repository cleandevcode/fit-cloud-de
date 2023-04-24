package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class f0 extends l0 {

    /* renamed from: c */
    public c0 f3099c;

    /* renamed from: d */
    public b0 f3100d;

    public static int e(View view, d0 d0Var) {
        return ((d0Var.c(view) / 2) + d0Var.e(view)) - ((d0Var.l() / 2) + d0Var.k());
    }

    public static View f(RecyclerView.m mVar, d0 d0Var) {
        int y10 = mVar.y();
        View view = null;
        if (y10 == 0) {
            return null;
        }
        int l10 = (d0Var.l() / 2) + d0Var.k();
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < y10; i11++) {
            View x10 = mVar.x(i11);
            int abs = Math.abs(((d0Var.c(x10) / 2) + d0Var.e(x10)) - l10);
            if (abs < i10) {
                view = x10;
                i10 = abs;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.l0
    public final int[] b(RecyclerView.m mVar, View view) {
        int[] iArr = new int[2];
        if (mVar.f()) {
            iArr[0] = e(view, g(mVar));
        } else {
            iArr[0] = 0;
        }
        if (mVar.g()) {
            iArr[1] = e(view, h(mVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.l0
    public View c(RecyclerView.m mVar) {
        d0 g10;
        if (mVar.g()) {
            g10 = h(mVar);
        } else if (!mVar.f()) {
            return null;
        } else {
            g10 = g(mVar);
        }
        return f(mVar, g10);
    }

    public final d0 g(RecyclerView.m mVar) {
        b0 b0Var = this.f3100d;
        if (b0Var == null || b0Var.f3089a != mVar) {
            this.f3100d = new b0(mVar);
        }
        return this.f3100d;
    }

    public final d0 h(RecyclerView.m mVar) {
        c0 c0Var = this.f3099c;
        if (c0Var == null || c0Var.f3089a != mVar) {
            this.f3099c = new c0(mVar);
        }
        return this.f3099c;
    }
}
