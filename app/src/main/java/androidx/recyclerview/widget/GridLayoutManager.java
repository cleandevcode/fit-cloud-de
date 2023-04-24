package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.u0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import java.util.Arrays;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;
import l1.j;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public c K;
    public final Rect L;

    /* loaded from: classes.dex */
    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int b(int i10, int i11) {
            return i10 % i11;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i10) {
            return 1;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends RecyclerView.n {

        /* renamed from: e */
        public int f2828e;

        /* renamed from: f */
        public int f2829f;

        public b(int i10, int i11) {
            super(i10, i11);
            this.f2828e = -1;
            this.f2829f = 0;
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2828e = -1;
            this.f2829f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2828e = -1;
            this.f2829f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2828e = -1;
            this.f2829f = 0;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a */
        public final SparseIntArray f2830a = new SparseIntArray();

        /* renamed from: b */
        public final SparseIntArray f2831b = new SparseIntArray();

        public final int a(int i10, int i11) {
            int c10 = c(i10);
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                int c11 = c(i14);
                i12 += c11;
                if (i12 == i11) {
                    i13++;
                    i12 = 0;
                } else if (i12 > i11) {
                    i13++;
                    i12 = c11;
                }
            }
            return i12 + c10 > i11 ? i13 + 1 : i13;
        }

        public int b(int i10, int i11) {
            int c10 = c(i10);
            if (c10 == i11) {
                return 0;
            }
            int i12 = 0;
            for (int i13 = 0; i13 < i10; i13++) {
                int c11 = c(i13);
                i12 += c11;
                if (i12 == i11) {
                    i12 = 0;
                } else if (i12 > i11) {
                    i12 = c11;
                }
            }
            if (c10 + i12 <= i11) {
                return i12;
            }
            return 0;
        }

        public abstract int c(int i10);

        public final void d() {
            this.f2830a.clear();
        }
    }

    public GridLayoutManager(int i10) {
        super(1);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new a();
        this.L = new Rect();
        q1(i10);
    }

    public GridLayoutManager(int i10, int i11) {
        super(1);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new a();
        this.L = new Rect();
        q1(i10);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new a();
        this.L = new Rect();
        q1(RecyclerView.m.I(context, attributeSet, i10, i11).f2977b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int A(RecyclerView.t tVar, RecyclerView.y yVar) {
        if (this.f2832p == 1) {
            return this.F;
        }
        if (yVar.b() < 1) {
            return 0;
        }
        return m1(yVar.b() - 1, tVar, yVar) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final boolean D0() {
        return this.f2842z == null && !this.E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void F0(RecyclerView.y yVar, LinearLayoutManager.c cVar, RecyclerView.m.c cVar2) {
        boolean z10;
        int i10 = this.F;
        for (int i11 = 0; i11 < this.F; i11++) {
            int i12 = cVar.f2855d;
            if (i12 >= 0 && i12 < yVar.b()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && i10 > 0) {
                int i13 = cVar.f2855d;
                ((s.b) cVar2).a(i13, Math.max(0, cVar.f2858g));
                i10 -= this.K.c(i13);
                cVar.f2855d += cVar.f2856e;
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int K(RecyclerView.t tVar, RecyclerView.y yVar) {
        if (this.f2832p == 0) {
            return this.F;
        }
        if (yVar.b() < 1) {
            return 0;
        }
        return m1(yVar.b() - 1, tVar, yVar) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View S0(RecyclerView.t tVar, RecyclerView.y yVar, boolean z10, boolean z11) {
        int i10;
        int y10 = y();
        int i11 = -1;
        if (z11) {
            i10 = y() - 1;
            y10 = -1;
        } else {
            i10 = 0;
            i11 = 1;
        }
        int b10 = yVar.b();
        K0();
        int k10 = this.f2834r.k();
        int g10 = this.f2834r.g();
        View view = null;
        View view2 = null;
        while (i10 != y10) {
            View x10 = x(i10);
            int H = RecyclerView.m.H(x10);
            if (H >= 0 && H < b10 && n1(H, tVar, yVar) == 0) {
                if (((RecyclerView.n) x10.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = x10;
                    }
                } else if (this.f2834r.e(x10) < g10 && this.f2834r.b(x10) >= k10) {
                    return x10;
                } else {
                    if (view == null) {
                        view = x10;
                    }
                }
            }
            i10 += i11;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x00df, code lost:
        if (r13 == r5) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x010e, code lost:
        if (r13 == r5) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0119  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View U(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.t r25, androidx.recyclerview.widget.RecyclerView.y r26) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.U(android.view.View, int, androidx.recyclerview.widget.RecyclerView$t, androidx.recyclerview.widget.RecyclerView$y):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void Y(RecyclerView.t tVar, RecyclerView.y yVar, View view, l1.j jVar) {
        int i10;
        int i11;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            X(view, jVar);
            return;
        }
        b bVar = (b) layoutParams;
        int m12 = m1(bVar.a(), tVar, yVar);
        int i12 = 1;
        if (this.f2832p == 0) {
            int i13 = bVar.f2828e;
            i12 = bVar.f2829f;
            i11 = 1;
            i10 = m12;
            m12 = i13;
        } else {
            i10 = bVar.f2828e;
            i11 = bVar.f2829f;
        }
        jVar.h(j.c.a(m12, i12, i10, i11, false));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void Y0(RecyclerView.t tVar, RecyclerView.y yVar, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int z12;
        int i19;
        boolean z13;
        boolean z14;
        View b10;
        int j10 = this.f2834r.j();
        if (j10 != 1073741824) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (y() > 0) {
            i10 = this.G[this.F];
        } else {
            i10 = 0;
        }
        if (z10) {
            r1();
        }
        if (cVar.f2856e == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i20 = this.F;
        if (!z11) {
            i20 = n1(cVar.f2855d, tVar, yVar) + o1(cVar.f2855d, tVar, yVar);
        }
        int i21 = 0;
        while (i21 < this.F) {
            int i22 = cVar.f2855d;
            if (i22 >= 0 && i22 < yVar.b()) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (!z14 || i20 <= 0) {
                break;
            }
            int i23 = cVar.f2855d;
            int o12 = o1(i23, tVar, yVar);
            if (o12 <= this.F) {
                i20 -= o12;
                if (i20 < 0 || (b10 = cVar.b(tVar)) == null) {
                    break;
                }
                this.H[i21] = b10;
                i21++;
            } else {
                throw new IllegalArgumentException(a0.q.b(w1.h.a("Item at position ", i23, " requires ", o12, " spans but GridLayoutManager has only "), this.F, " spans."));
            }
        }
        if (i21 == 0) {
            bVar.f2849b = true;
            return;
        }
        if (z11) {
            i11 = 0;
            i12 = i21;
            i13 = 0;
            i14 = 1;
        } else {
            i11 = i21 - 1;
            i12 = -1;
            i13 = 0;
            i14 = -1;
        }
        while (i11 != i12) {
            View view = this.H[i11];
            b bVar2 = (b) view.getLayoutParams();
            int o13 = o1(RecyclerView.m.H(view), tVar, yVar);
            bVar2.f2829f = o13;
            bVar2.f2828e = i13;
            i13 += o13;
            i11 += i14;
        }
        float f10 = 0.0f;
        int i24 = 0;
        for (int i25 = 0; i25 < i21; i25++) {
            View view2 = this.H[i25];
            if (cVar.f2862k == null) {
                if (z11) {
                    z13 = false;
                    c(view2, -1, false);
                } else {
                    z13 = false;
                    c(view2, 0, false);
                }
            } else {
                z13 = false;
                if (z11) {
                    c(view2, -1, true);
                } else {
                    c(view2, 0, true);
                }
            }
            e(view2, this.L);
            p1(view2, j10, z13);
            int c10 = this.f2834r.c(view2);
            if (c10 > i24) {
                i24 = c10;
            }
            float d10 = (this.f2834r.d(view2) * 1.0f) / ((b) view2.getLayoutParams()).f2829f;
            if (d10 > f10) {
                f10 = d10;
            }
        }
        if (z10) {
            k1(Math.max(Math.round(f10 * this.F), i10));
            i24 = 0;
            for (int i26 = 0; i26 < i21; i26++) {
                View view3 = this.H[i26];
                p1(view3, 1073741824, true);
                int c11 = this.f2834r.c(view3);
                if (c11 > i24) {
                    i24 = c11;
                }
            }
        }
        for (int i27 = 0; i27 < i21; i27++) {
            View view4 = this.H[i27];
            if (this.f2834r.c(view4) != i24) {
                b bVar3 = (b) view4.getLayoutParams();
                Rect rect = bVar3.f2981b;
                int i28 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar3).topMargin + ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin;
                int i29 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar3).leftMargin + ((ViewGroup.MarginLayoutParams) bVar3).rightMargin;
                int l12 = l1(bVar3.f2828e, bVar3.f2829f);
                if (this.f2832p == 1) {
                    i19 = RecyclerView.m.z(l12, 1073741824, i29, ((ViewGroup.MarginLayoutParams) bVar3).width, false);
                    z12 = View.MeasureSpec.makeMeasureSpec(i24 - i28, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i24 - i29, 1073741824);
                    z12 = RecyclerView.m.z(l12, 1073741824, i28, ((ViewGroup.MarginLayoutParams) bVar3).height, false);
                    i19 = makeMeasureSpec;
                }
                if (A0(view4, i19, z12, (RecyclerView.n) view4.getLayoutParams())) {
                    view4.measure(i19, z12);
                }
            }
        }
        bVar.f2848a = i24;
        if (this.f2832p == 1) {
            if (cVar.f2857f == -1) {
                i18 = cVar.f2853b;
                i17 = i18 - i24;
            } else {
                i17 = cVar.f2853b;
                i18 = i24 + i17;
            }
            i16 = 0;
            i15 = 0;
        } else {
            if (cVar.f2857f == -1) {
                int i30 = cVar.f2853b;
                i16 = i30;
                i15 = i30 - i24;
            } else {
                int i31 = cVar.f2853b;
                i15 = i31;
                i16 = i24 + i31;
            }
            i17 = 0;
            i18 = 0;
        }
        for (int i32 = 0; i32 < i21; i32++) {
            View view5 = this.H[i32];
            b bVar4 = (b) view5.getLayoutParams();
            if (this.f2832p == 1) {
                if (X0()) {
                    i16 = E() + this.G[this.F - bVar4.f2828e];
                    i15 = i16 - this.f2834r.d(view5);
                } else {
                    i15 = this.G[bVar4.f2828e] + E();
                    i16 = this.f2834r.d(view5) + i15;
                }
            } else {
                int G = G() + this.G[bVar4.f2828e];
                i17 = G;
                i18 = this.f2834r.d(view5) + G;
            }
            RecyclerView.m.P(view5, i15, i17, i16, i18);
            if (bVar4.c() || bVar4.b()) {
                bVar.f2850c = true;
            }
            bVar.f2851d = view5.hasFocusable() | bVar.f2851d;
        }
        Arrays.fill(this.H, (Object) null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void Z(int i10, int i11) {
        this.K.d();
        this.K.f2831b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void Z0(RecyclerView.t tVar, RecyclerView.y yVar, LinearLayoutManager.a aVar, int i10) {
        boolean z10;
        r1();
        if (yVar.b() > 0 && !yVar.f3021g) {
            if (i10 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            int n12 = n1(aVar.f2844b, tVar, yVar);
            if (z10) {
                while (n12 > 0) {
                    int i11 = aVar.f2844b;
                    if (i11 <= 0) {
                        break;
                    }
                    int i12 = i11 - 1;
                    aVar.f2844b = i12;
                    n12 = n1(i12, tVar, yVar);
                }
            } else {
                int b10 = yVar.b() - 1;
                int i13 = aVar.f2844b;
                while (i13 < b10) {
                    int i14 = i13 + 1;
                    int n13 = n1(i14, tVar, yVar);
                    if (n13 <= n12) {
                        break;
                    }
                    i13 = i14;
                    n12 = n13;
                }
                aVar.f2844b = i13;
            }
        }
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void a0() {
        this.K.d();
        this.K.f2831b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void b0(int i10, int i11) {
        this.K.d();
        this.K.f2831b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void c0(int i10, int i11) {
        this.K.d();
        this.K.f2831b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void d0(int i10, int i11) {
        this.K.d();
        this.K.f2831b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final void e0(RecyclerView.t tVar, RecyclerView.y yVar) {
        if (yVar.f3021g) {
            int y10 = y();
            for (int i10 = 0; i10 < y10; i10++) {
                b bVar = (b) x(i10).getLayoutParams();
                int a10 = bVar.a();
                this.I.put(a10, bVar.f2829f);
                this.J.put(a10, bVar.f2828e);
            }
        }
        super.e0(tVar, yVar);
        this.I.clear();
        this.J.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final void f0(RecyclerView.y yVar) {
        super.f0(yVar);
        this.E = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void g1(boolean z10) {
        if (z10) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.g1(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean h(RecyclerView.n nVar) {
        return nVar instanceof b;
    }

    public final void k1(int i10) {
        int i11;
        int[] iArr = this.G;
        int i12 = this.F;
        if (iArr == null || iArr.length != i12 + 1 || iArr[iArr.length - 1] != i10) {
            iArr = new int[i12 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i10 / i12;
        int i15 = i10 % i12;
        int i16 = 0;
        for (int i17 = 1; i17 <= i12; i17++) {
            i13 += i15;
            if (i13 > 0 && i12 - i13 < i15) {
                i11 = i14 + 1;
                i13 -= i12;
            } else {
                i11 = i14;
            }
            i16 += i11;
            iArr[i17] = i16;
        }
        this.G = iArr;
    }

    public final int l1(int i10, int i11) {
        if (this.f2832p != 1 || !X0()) {
            int[] iArr = this.G;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.G;
        int i12 = this.F;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int m(RecyclerView.y yVar) {
        return H0(yVar);
    }

    public final int m1(int i10, RecyclerView.t tVar, RecyclerView.y yVar) {
        if (!yVar.f3021g) {
            return this.K.a(i10, this.F);
        }
        int b10 = tVar.b(i10);
        if (b10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
            return 0;
        }
        return this.K.a(b10, this.F);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int n(RecyclerView.y yVar) {
        return I0(yVar);
    }

    public final int n1(int i10, RecyclerView.t tVar, RecyclerView.y yVar) {
        if (!yVar.f3021g) {
            return this.K.b(i10, this.F);
        }
        int i11 = this.J.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int b10 = tVar.b(i10);
        if (b10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
            return 0;
        }
        return this.K.b(b10, this.F);
    }

    public final int o1(int i10, RecyclerView.t tVar, RecyclerView.y yVar) {
        if (!yVar.f3021g) {
            return this.K.c(i10);
        }
        int i11 = this.I.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int b10 = tVar.b(i10);
        if (b10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
            return 1;
        }
        return this.K.c(b10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int p(RecyclerView.y yVar) {
        return H0(yVar);
    }

    public final void p1(View view, int i10, boolean z10) {
        int i11;
        int i12;
        boolean y02;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f2981b;
        int i13 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i14 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int l12 = l1(bVar.f2828e, bVar.f2829f);
        if (this.f2832p == 1) {
            i12 = RecyclerView.m.z(l12, i10, i14, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            i11 = RecyclerView.m.z(this.f2834r.l(), this.f2971m, i13, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int z11 = RecyclerView.m.z(l12, i10, i13, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int z12 = RecyclerView.m.z(this.f2834r.l(), this.f2970l, i14, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            i11 = z11;
            i12 = z12;
        }
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        if (z10) {
            y02 = A0(view, i12, i11, nVar);
        } else {
            y02 = y0(view, i12, i11, nVar);
        }
        if (y02) {
            view.measure(i12, i11);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int q(RecyclerView.y yVar) {
        return I0(yVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int q0(int i10, RecyclerView.t tVar, RecyclerView.y yVar) {
        r1();
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
        return super.q0(i10, tVar, yVar);
    }

    public final void q1(int i10) {
        if (i10 == this.F) {
            return;
        }
        this.E = true;
        if (i10 >= 1) {
            this.F = i10;
            this.K.d();
            p0();
            return;
        }
        throw new IllegalArgumentException(u0.a("Span count should be at least 1. Provided ", i10));
    }

    public final void r1() {
        int D;
        int G;
        if (this.f2832p == 1) {
            D = this.f2972n - F();
            G = E();
        } else {
            D = this.f2973o - D();
            G = G();
        }
        k1(D - G);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int s0(int i10, RecyclerView.t tVar, RecyclerView.y yVar) {
        r1();
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
        return super.s0(i10, tVar, yVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n t() {
        return this.f2832p == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n u(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n v(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void v0(Rect rect, int i10, int i11) {
        int i12;
        int i13;
        if (this.G == null) {
            super.v0(rect, i10, i11);
        }
        int F = F() + E();
        int D = D() + G();
        if (this.f2832p == 1) {
            int height = rect.height() + D;
            RecyclerView recyclerView = this.f2960b;
            WeakHashMap<View, i2> weakHashMap = k1.o0.f18161a;
            i13 = RecyclerView.m.i(i11, height, o0.d.d(recyclerView));
            int[] iArr = this.G;
            i12 = RecyclerView.m.i(i10, iArr[iArr.length - 1] + F, o0.d.e(this.f2960b));
        } else {
            int width = rect.width() + F;
            RecyclerView recyclerView2 = this.f2960b;
            WeakHashMap<View, i2> weakHashMap2 = k1.o0.f18161a;
            i12 = RecyclerView.m.i(i10, width, o0.d.e(recyclerView2));
            int[] iArr2 = this.G;
            i13 = RecyclerView.m.i(i11, iArr2[iArr2.length - 1] + D, o0.d.d(this.f2960b));
        }
        this.f2960b.setMeasuredDimension(i12, i13);
    }
}
