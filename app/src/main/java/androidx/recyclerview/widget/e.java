package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    public final b f3092a;

    /* renamed from: b */
    public final a f3093b = new a();

    /* renamed from: c */
    public final ArrayList f3094c = new ArrayList();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public long f3095a = 0;

        /* renamed from: b */
        public a f3096b;

        public final void a(int i10) {
            if (i10 < 64) {
                this.f3095a &= ~(1 << i10);
                return;
            }
            a aVar = this.f3096b;
            if (aVar != null) {
                aVar.a(i10 - 64);
            }
        }

        public final int b(int i10) {
            long j10;
            a aVar = this.f3096b;
            if (aVar == null) {
                if (i10 >= 64) {
                    j10 = this.f3095a;
                    return Long.bitCount(j10);
                }
            } else if (i10 >= 64) {
                return Long.bitCount(this.f3095a) + aVar.b(i10 - 64);
            }
            j10 = this.f3095a & ((1 << i10) - 1);
            return Long.bitCount(j10);
        }

        public final void c() {
            if (this.f3096b == null) {
                this.f3096b = new a();
            }
        }

        public final boolean d(int i10) {
            if (i10 < 64) {
                return (this.f3095a & (1 << i10)) != 0;
            }
            c();
            return this.f3096b.d(i10 - 64);
        }

        public final void e(int i10, boolean z10) {
            if (i10 >= 64) {
                c();
                this.f3096b.e(i10 - 64, z10);
                return;
            }
            long j10 = this.f3095a;
            boolean z11 = (Long.MIN_VALUE & j10) != 0;
            long j11 = (1 << i10) - 1;
            this.f3095a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z10) {
                h(i10);
            } else {
                a(i10);
            }
            if (z11 || this.f3096b != null) {
                c();
                this.f3096b.e(0, z11);
            }
        }

        public final boolean f(int i10) {
            if (i10 >= 64) {
                c();
                return this.f3096b.f(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f3095a;
            boolean z10 = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f3095a = j12;
            long j13 = j10 - 1;
            this.f3095a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f3096b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f3096b.f(0);
            }
            return z10;
        }

        public final void g() {
            this.f3095a = 0L;
            a aVar = this.f3096b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public final void h(int i10) {
            if (i10 < 64) {
                this.f3095a |= 1 << i10;
                return;
            }
            c();
            this.f3096b.h(i10 - 64);
        }

        public final String toString() {
            if (this.f3096b == null) {
                return Long.toBinaryString(this.f3095a);
            }
            return this.f3096b.toString() + "xx" + Long.toBinaryString(this.f3095a);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    public e(g0 g0Var) {
        this.f3092a = g0Var;
    }

    public final void a(View view, int i10, boolean z10) {
        int f10;
        if (i10 < 0) {
            f10 = ((g0) this.f3092a).a();
        } else {
            f10 = f(i10);
        }
        this.f3093b.e(f10, z10);
        if (z10) {
            i(view);
        }
        g0 g0Var = (g0) this.f3092a;
        g0Var.f3112a.addView(view, f10);
        RecyclerView recyclerView = g0Var.f3112a;
        recyclerView.getClass();
        RecyclerView.b0 J = RecyclerView.J(view);
        RecyclerView.e eVar = recyclerView.f2887l;
        if (eVar != null && J != null) {
            eVar.r(J);
        }
        ArrayList arrayList = recyclerView.C;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((RecyclerView.o) recyclerView.C.get(size)).d(view);
                } else {
                    return;
                }
            }
        }
    }

    public final void b(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int f10;
        if (i10 < 0) {
            f10 = ((g0) this.f3092a).a();
        } else {
            f10 = f(i10);
        }
        this.f3093b.e(f10, z10);
        if (z10) {
            i(view);
        }
        g0 g0Var = (g0) this.f3092a;
        g0Var.getClass();
        RecyclerView.b0 J = RecyclerView.J(view);
        if (J != null) {
            if (!J.m() && !J.q()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Called attach on a child which is not detached: ");
                sb2.append(J);
                throw new IllegalArgumentException(d.a(g0Var.f3112a, sb2));
            }
            J.f2936j &= -257;
        }
        g0Var.f3112a.attachViewToParent(view, f10, layoutParams);
    }

    public final void c(int i10) {
        RecyclerView.b0 J;
        int f10 = f(i10);
        this.f3093b.f(f10);
        g0 g0Var = (g0) this.f3092a;
        View childAt = g0Var.f3112a.getChildAt(f10);
        if (childAt != null && (J = RecyclerView.J(childAt)) != null) {
            if (J.m() && !J.q()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("called detach on an already detached child ");
                sb2.append(J);
                throw new IllegalArgumentException(d.a(g0Var.f3112a, sb2));
            }
            J.b(DfuBaseService.ERROR_REMOTE_TYPE_LEGACY);
        }
        g0Var.f3112a.detachViewFromParent(f10);
    }

    public final View d(int i10) {
        return ((g0) this.f3092a).f3112a.getChildAt(f(i10));
    }

    public final int e() {
        return ((g0) this.f3092a).a() - this.f3094c.size();
    }

    public final int f(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int a10 = ((g0) this.f3092a).a();
        int i11 = i10;
        while (i11 < a10) {
            int b10 = i10 - (i11 - this.f3093b.b(i11));
            if (b10 == 0) {
                while (this.f3093b.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += b10;
        }
        return -1;
    }

    public final View g(int i10) {
        return ((g0) this.f3092a).f3112a.getChildAt(i10);
    }

    public final int h() {
        return ((g0) this.f3092a).a();
    }

    public final void i(View view) {
        this.f3094c.add(view);
        g0 g0Var = (g0) this.f3092a;
        g0Var.getClass();
        RecyclerView.b0 J = RecyclerView.J(view);
        if (J != null) {
            RecyclerView recyclerView = g0Var.f3112a;
            int i10 = J.f2943q;
            if (i10 == -1) {
                View view2 = J.f2927a;
                WeakHashMap<View, i2> weakHashMap = k1.o0.f18161a;
                i10 = o0.d.c(view2);
            }
            J.f2942p = i10;
            if (recyclerView.M()) {
                J.f2943q = 4;
                recyclerView.G0.add(J);
                return;
            }
            View view3 = J.f2927a;
            WeakHashMap<View, i2> weakHashMap2 = k1.o0.f18161a;
            o0.d.s(view3, 4);
        }
    }

    public final int j(View view) {
        int indexOfChild = ((g0) this.f3092a).f3112a.indexOfChild(view);
        if (indexOfChild == -1 || this.f3093b.d(indexOfChild)) {
            return -1;
        }
        return indexOfChild - this.f3093b.b(indexOfChild);
    }

    public final boolean k(View view) {
        return this.f3094c.contains(view);
    }

    public final void l(View view) {
        if (this.f3094c.remove(view)) {
            g0 g0Var = (g0) this.f3092a;
            g0Var.getClass();
            RecyclerView.b0 J = RecyclerView.J(view);
            if (J != null) {
                RecyclerView recyclerView = g0Var.f3112a;
                int i10 = J.f2942p;
                if (recyclerView.M()) {
                    J.f2943q = i10;
                    recyclerView.G0.add(J);
                } else {
                    View view2 = J.f2927a;
                    WeakHashMap<View, i2> weakHashMap = k1.o0.f18161a;
                    o0.d.s(view2, i10);
                }
                J.f2942p = 0;
            }
        }
    }

    public final String toString() {
        return this.f3093b.toString() + ", hidden list:" + this.f3094c.size();
    }
}
