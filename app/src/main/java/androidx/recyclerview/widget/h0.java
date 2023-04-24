package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

/* loaded from: classes.dex */
public final class h0 implements a.InterfaceC0031a {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView f3115a;

    public h0(RecyclerView recyclerView) {
        this.f3115a = recyclerView;
    }

    public final void a(a.b bVar) {
        int i10 = bVar.f3078a;
        if (i10 == 1) {
            this.f3115a.f2889m.Z(bVar.f3079b, bVar.f3081d);
        } else if (i10 == 2) {
            this.f3115a.f2889m.c0(bVar.f3079b, bVar.f3081d);
        } else if (i10 == 4) {
            this.f3115a.f2889m.d0(bVar.f3079b, bVar.f3081d);
        } else if (i10 != 8) {
        } else {
            this.f3115a.f2889m.b0(bVar.f3079b, bVar.f3081d);
        }
    }

    public final RecyclerView.b0 b(int i10) {
        RecyclerView recyclerView = this.f3115a;
        int h10 = recyclerView.f2873e.h();
        int i11 = 0;
        RecyclerView.b0 b0Var = null;
        while (true) {
            if (i11 >= h10) {
                break;
            }
            RecyclerView.b0 J = RecyclerView.J(recyclerView.f2873e.g(i11));
            if (J != null && !J.k() && J.f2929c == i10) {
                if (recyclerView.f2873e.k(J.f2927a)) {
                    b0Var = J;
                } else {
                    b0Var = J;
                    break;
                }
            }
            i11++;
        }
        if (b0Var == null || this.f3115a.f2873e.k(b0Var.f2927a)) {
            return null;
        }
        return b0Var;
    }

    public final void c(int i10, int i11, Object obj) {
        int i12;
        int i13;
        RecyclerView recyclerView = this.f3115a;
        int h10 = recyclerView.f2873e.h();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < h10; i15++) {
            View g10 = recyclerView.f2873e.g(i15);
            RecyclerView.b0 J = RecyclerView.J(g10);
            if (J != null && !J.q() && (i13 = J.f2929c) >= i10 && i13 < i14) {
                J.b(2);
                J.a(obj);
                ((RecyclerView.n) g10.getLayoutParams()).f2982c = true;
            }
        }
        RecyclerView.t tVar = recyclerView.f2868b;
        int size = tVar.f2992c.size();
        while (true) {
            size--;
            if (size >= 0) {
                RecyclerView.b0 b0Var = tVar.f2992c.get(size);
                if (b0Var != null && (i12 = b0Var.f2929c) >= i10 && i12 < i14) {
                    b0Var.b(2);
                    tVar.e(size);
                }
            } else {
                this.f3115a.f2912x0 = true;
                return;
            }
        }
    }

    public final void d(int i10, int i11) {
        RecyclerView recyclerView = this.f3115a;
        int h10 = recyclerView.f2873e.h();
        for (int i12 = 0; i12 < h10; i12++) {
            RecyclerView.b0 J = RecyclerView.J(recyclerView.f2873e.g(i12));
            if (J != null && !J.q() && J.f2929c >= i10) {
                J.n(i11, false);
                recyclerView.f2904t0.f3020f = true;
            }
        }
        RecyclerView.t tVar = recyclerView.f2868b;
        int size = tVar.f2992c.size();
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView.b0 b0Var = tVar.f2992c.get(i13);
            if (b0Var != null && b0Var.f2929c >= i10) {
                b0Var.n(i11, false);
            }
        }
        recyclerView.requestLayout();
        this.f3115a.f2910w0 = true;
    }

    public final void e(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = this.f3115a;
        int h10 = recyclerView.f2873e.h();
        int i19 = -1;
        if (i10 < i11) {
            i13 = i10;
            i12 = i11;
            i14 = -1;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i20 = 0; i20 < h10; i20++) {
            RecyclerView.b0 J = RecyclerView.J(recyclerView.f2873e.g(i20));
            if (J != null && (i18 = J.f2929c) >= i13 && i18 <= i12) {
                if (i18 == i10) {
                    J.n(i11 - i10, false);
                } else {
                    J.n(i14, false);
                }
                recyclerView.f2904t0.f3020f = true;
            }
        }
        RecyclerView.t tVar = recyclerView.f2868b;
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
        } else {
            i15 = i10;
            i16 = i11;
            i19 = 1;
        }
        int size = tVar.f2992c.size();
        for (int i21 = 0; i21 < size; i21++) {
            RecyclerView.b0 b0Var = tVar.f2992c.get(i21);
            if (b0Var != null && (i17 = b0Var.f2929c) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    b0Var.n(i11 - i10, false);
                } else {
                    b0Var.n(i19, false);
                }
            }
        }
        recyclerView.requestLayout();
        this.f3115a.f2910w0 = true;
    }
}
