package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.widget.u0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import androidx.recyclerview.widget.t;
import java.util.List;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.m implements t.g, RecyclerView.x.b {
    public final a A;
    public final b B;
    public int C;
    public int[] D;

    /* renamed from: p */
    public int f2832p;

    /* renamed from: q */
    public c f2833q;

    /* renamed from: r */
    public d0 f2834r;

    /* renamed from: s */
    public boolean f2835s;

    /* renamed from: t */
    public boolean f2836t;

    /* renamed from: u */
    public boolean f2837u;

    /* renamed from: v */
    public boolean f2838v;

    /* renamed from: w */
    public boolean f2839w;

    /* renamed from: x */
    public int f2840x;

    /* renamed from: y */
    public int f2841y;

    /* renamed from: z */
    public d f2842z;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public d0 f2843a;

        /* renamed from: b */
        public int f2844b;

        /* renamed from: c */
        public int f2845c;

        /* renamed from: d */
        public boolean f2846d;

        /* renamed from: e */
        public boolean f2847e;

        public a() {
            c();
        }

        public final void a(View view, int i10) {
            int l10;
            if (this.f2846d) {
                int b10 = this.f2843a.b(view);
                d0 d0Var = this.f2843a;
                if (Integer.MIN_VALUE == d0Var.f3090b) {
                    l10 = 0;
                } else {
                    l10 = d0Var.l() - d0Var.f3090b;
                }
                this.f2845c = l10 + b10;
            } else {
                this.f2845c = this.f2843a.e(view);
            }
            this.f2844b = i10;
        }

        public final void b(View view, int i10) {
            int l10;
            int min;
            d0 d0Var = this.f2843a;
            if (Integer.MIN_VALUE == d0Var.f3090b) {
                l10 = 0;
            } else {
                l10 = d0Var.l() - d0Var.f3090b;
            }
            if (l10 >= 0) {
                a(view, i10);
                return;
            }
            this.f2844b = i10;
            if (this.f2846d) {
                int g10 = (this.f2843a.g() - l10) - this.f2843a.b(view);
                this.f2845c = this.f2843a.g() - g10;
                if (g10 > 0) {
                    int c10 = this.f2845c - this.f2843a.c(view);
                    int k10 = this.f2843a.k();
                    int min2 = c10 - (Math.min(this.f2843a.e(view) - k10, 0) + k10);
                    if (min2 < 0) {
                        min = Math.min(g10, -min2) + this.f2845c;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                int e10 = this.f2843a.e(view);
                int k11 = e10 - this.f2843a.k();
                this.f2845c = e10;
                if (k11 > 0) {
                    int g11 = (this.f2843a.g() - Math.min(0, (this.f2843a.g() - l10) - this.f2843a.b(view))) - (this.f2843a.c(view) + e10);
                    if (g11 < 0) {
                        min = this.f2845c - Math.min(k11, -g11);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f2845c = min;
        }

        public final void c() {
            this.f2844b = -1;
            this.f2845c = Integer.MIN_VALUE;
            this.f2846d = false;
            this.f2847e = false;
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("AnchorInfo{mPosition=");
            a10.append(this.f2844b);
            a10.append(", mCoordinate=");
            a10.append(this.f2845c);
            a10.append(", mLayoutFromEnd=");
            a10.append(this.f2846d);
            a10.append(", mValid=");
            return l2.o0.a(a10, this.f2847e, '}');
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public int f2848a;

        /* renamed from: b */
        public boolean f2849b;

        /* renamed from: c */
        public boolean f2850c;

        /* renamed from: d */
        public boolean f2851d;
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: b */
        public int f2853b;

        /* renamed from: c */
        public int f2854c;

        /* renamed from: d */
        public int f2855d;

        /* renamed from: e */
        public int f2856e;

        /* renamed from: f */
        public int f2857f;

        /* renamed from: g */
        public int f2858g;

        /* renamed from: j */
        public int f2861j;

        /* renamed from: l */
        public boolean f2863l;

        /* renamed from: a */
        public boolean f2852a = true;

        /* renamed from: h */
        public int f2859h = 0;

        /* renamed from: i */
        public int f2860i = 0;

        /* renamed from: k */
        public List<RecyclerView.b0> f2862k = null;

        public final void a(View view) {
            int a10;
            int a11;
            int size = this.f2862k.size();
            View view2 = null;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = this.f2862k.get(i11).f2927a;
                RecyclerView.n nVar = (RecyclerView.n) view3.getLayoutParams();
                if (view3 != view && !nVar.c() && (a11 = (nVar.a() - this.f2855d) * this.f2856e) >= 0 && a11 < i10) {
                    view2 = view3;
                    if (a11 == 0) {
                        break;
                    }
                    i10 = a11;
                }
            }
            if (view2 == null) {
                a10 = -1;
            } else {
                a10 = ((RecyclerView.n) view2.getLayoutParams()).a();
            }
            this.f2855d = a10;
        }

        public final View b(RecyclerView.t tVar) {
            List<RecyclerView.b0> list = this.f2862k;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    View view = this.f2862k.get(i10).f2927a;
                    RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
                    if (!nVar.c() && this.f2855d == nVar.a()) {
                        a(view);
                        return view;
                    }
                }
                return null;
            }
            View view2 = tVar.i(this.f2855d, Long.MAX_VALUE).f2927a;
            this.f2855d += this.f2856e;
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a */
        public int f2864a;

        /* renamed from: b */
        public int f2865b;

        /* renamed from: c */
        public boolean f2866c;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d() {
        }

        public d(Parcel parcel) {
            this.f2864a = parcel.readInt();
            this.f2865b = parcel.readInt();
            this.f2866c = parcel.readInt() == 1;
        }

        public d(d dVar) {
            this.f2864a = dVar.f2864a;
            this.f2865b = dVar.f2865b;
            this.f2866c = dVar.f2866c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f2864a);
            parcel.writeInt(this.f2865b);
            parcel.writeInt(this.f2866c ? 1 : 0);
        }
    }

    public LinearLayoutManager() {
        this(1);
    }

    public LinearLayoutManager(int i10) {
        this.f2832p = 1;
        this.f2836t = false;
        this.f2837u = false;
        this.f2838v = false;
        this.f2839w = true;
        this.f2840x = -1;
        this.f2841y = Integer.MIN_VALUE;
        this.f2842z = null;
        this.A = new a();
        this.B = new b();
        this.C = 2;
        this.D = new int[2];
        f1(i10);
        d(null);
        if (this.f2836t) {
            this.f2836t = false;
            p0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void B0(RecyclerView recyclerView, int i10) {
        x xVar = new x(recyclerView.getContext());
        xVar.f3000a = i10;
        C0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean D0() {
        return this.f2842z == null && this.f2835s == this.f2838v;
    }

    public void E0(RecyclerView.y yVar, int[] iArr) {
        boolean z10;
        int i10;
        int i11;
        if (yVar.f3015a != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = this.f2834r.l();
        } else {
            i10 = 0;
        }
        if (this.f2833q.f2857f == -1) {
            i11 = 0;
        } else {
            i11 = i10;
            i10 = 0;
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    public void F0(RecyclerView.y yVar, c cVar, RecyclerView.m.c cVar2) {
        int i10 = cVar.f2855d;
        if (i10 < 0 || i10 >= yVar.b()) {
            return;
        }
        ((s.b) cVar2).a(i10, Math.max(0, cVar.f2858g));
    }

    public final int G0(RecyclerView.y yVar) {
        if (y() == 0) {
            return 0;
        }
        K0();
        return j0.a(yVar, this.f2834r, N0(!this.f2839w), M0(!this.f2839w), this, this.f2839w);
    }

    public final int H0(RecyclerView.y yVar) {
        if (y() == 0) {
            return 0;
        }
        K0();
        return j0.b(yVar, this.f2834r, N0(!this.f2839w), M0(!this.f2839w), this, this.f2839w, this.f2837u);
    }

    public final int I0(RecyclerView.y yVar) {
        if (y() == 0) {
            return 0;
        }
        K0();
        return j0.c(yVar, this.f2834r, N0(!this.f2839w), M0(!this.f2839w), this, this.f2839w);
    }

    public final int J0(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 17 ? i10 != 33 ? i10 != 66 ? (i10 == 130 && this.f2832p == 1) ? 1 : Integer.MIN_VALUE : this.f2832p == 0 ? 1 : Integer.MIN_VALUE : this.f2832p == 1 ? -1 : Integer.MIN_VALUE : this.f2832p == 0 ? -1 : Integer.MIN_VALUE : (this.f2832p != 1 && X0()) ? -1 : 1 : (this.f2832p != 1 && X0()) ? 1 : -1;
    }

    public final void K0() {
        if (this.f2833q == null) {
            this.f2833q = new c();
        }
    }

    public final int L0(RecyclerView.t tVar, c cVar, RecyclerView.y yVar, boolean z10) {
        boolean z11;
        int i10 = cVar.f2854c;
        int i11 = cVar.f2858g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                cVar.f2858g = i11 + i10;
            }
            a1(tVar, cVar);
        }
        int i12 = cVar.f2854c + cVar.f2859h;
        b bVar = this.B;
        while (true) {
            if (!cVar.f2863l && i12 <= 0) {
                break;
            }
            int i13 = cVar.f2855d;
            if (i13 >= 0 && i13 < yVar.b()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                break;
            }
            bVar.f2848a = 0;
            bVar.f2849b = false;
            bVar.f2850c = false;
            bVar.f2851d = false;
            Y0(tVar, yVar, cVar, bVar);
            if (!bVar.f2849b) {
                int i14 = cVar.f2853b;
                int i15 = bVar.f2848a;
                cVar.f2853b = (cVar.f2857f * i15) + i14;
                if (!bVar.f2850c || cVar.f2862k != null || !yVar.f3021g) {
                    cVar.f2854c -= i15;
                    i12 -= i15;
                }
                int i16 = cVar.f2858g;
                if (i16 != Integer.MIN_VALUE) {
                    int i17 = i16 + i15;
                    cVar.f2858g = i17;
                    int i18 = cVar.f2854c;
                    if (i18 < 0) {
                        cVar.f2858g = i17 + i18;
                    }
                    a1(tVar, cVar);
                }
                if (z10 && bVar.f2851d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - cVar.f2854c;
    }

    public final View M0(boolean z10) {
        int y10;
        int i10 = -1;
        if (this.f2837u) {
            y10 = 0;
            i10 = y();
        } else {
            y10 = y() - 1;
        }
        return R0(y10, i10, z10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean N() {
        return true;
    }

    public final View N0(boolean z10) {
        int i10;
        int i11 = -1;
        if (this.f2837u) {
            i10 = y() - 1;
        } else {
            i10 = 0;
            i11 = y();
        }
        return R0(i10, i11, z10);
    }

    public final int O0() {
        View R0 = R0(0, y(), false);
        if (R0 == null) {
            return -1;
        }
        return RecyclerView.m.H(R0);
    }

    public final int P0() {
        View R0 = R0(y() - 1, -1, false);
        if (R0 == null) {
            return -1;
        }
        return RecyclerView.m.H(R0);
    }

    public final View Q0(int i10, int i11) {
        int i12;
        int i13;
        K0();
        if ((i11 > i10 ? (char) 1 : i11 < i10 ? (char) 65535 : (char) 0) == 0) {
            return x(i10);
        }
        if (this.f2834r.e(x(i10)) < this.f2834r.k()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = DfuBaseService.ERROR_FILE_NOT_FOUND;
        }
        return (this.f2832p == 0 ? this.f2961c : this.f2962d).a(i10, i11, i12, i13);
    }

    public final View R0(int i10, int i11, boolean z10) {
        K0();
        return (this.f2832p == 0 ? this.f2961c : this.f2962d).a(i10, i11, z10 ? 24579 : 320, 320);
    }

    public View S0(RecyclerView.t tVar, RecyclerView.y yVar, boolean z10, boolean z11) {
        int i10;
        int i11;
        K0();
        int y10 = y();
        int i12 = -1;
        if (z11) {
            i10 = y() - 1;
            i11 = -1;
        } else {
            i12 = y10;
            i10 = 0;
            i11 = 1;
        }
        int b10 = yVar.b();
        int k10 = this.f2834r.k();
        int g10 = this.f2834r.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i10 != i12) {
            View x10 = x(i10);
            int H = RecyclerView.m.H(x10);
            int e10 = this.f2834r.e(x10);
            int b11 = this.f2834r.b(x10);
            if (H >= 0 && H < b10) {
                if (!((RecyclerView.n) x10.getLayoutParams()).c()) {
                    boolean z12 = b11 <= k10 && e10 < k10;
                    boolean z13 = e10 >= g10 && b11 > g10;
                    if (!z12 && !z13) {
                        return x10;
                    }
                    if (z10) {
                        if (!z13) {
                            if (view != null) {
                            }
                            view = x10;
                        }
                        view2 = x10;
                    } else {
                        if (!z12) {
                            if (view != null) {
                            }
                            view = x10;
                        }
                        view2 = x10;
                    }
                } else if (view3 == null) {
                    view3 = x10;
                }
            }
            i10 += i11;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void T(RecyclerView recyclerView) {
    }

    public final int T0(int i10, RecyclerView.t tVar, RecyclerView.y yVar, boolean z10) {
        int g10;
        int g11 = this.f2834r.g() - i10;
        if (g11 > 0) {
            int i11 = -d1(-g11, tVar, yVar);
            int i12 = i10 + i11;
            if (!z10 || (g10 = this.f2834r.g() - i12) <= 0) {
                return i11;
            }
            this.f2834r.o(g10);
            return g10 + i11;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public View U(View view, int i10, RecyclerView.t tVar, RecyclerView.y yVar) {
        int J0;
        View Q0;
        View V0;
        c1();
        if (y() == 0 || (J0 = J0(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        K0();
        h1(J0, (int) (this.f2834r.l() * 0.33333334f), false, yVar);
        c cVar = this.f2833q;
        cVar.f2858g = Integer.MIN_VALUE;
        cVar.f2852a = false;
        L0(tVar, cVar, yVar, true);
        if (J0 == -1) {
            if (this.f2837u) {
                Q0 = Q0(y() - 1, -1);
            } else {
                Q0 = Q0(0, y());
            }
        } else if (this.f2837u) {
            Q0 = Q0(0, y());
        } else {
            Q0 = Q0(y() - 1, -1);
        }
        if (J0 == -1) {
            V0 = W0();
        } else {
            V0 = V0();
        }
        if (V0.hasFocusable()) {
            if (Q0 == null) {
                return null;
            }
            return V0;
        }
        return Q0;
    }

    public final int U0(int i10, RecyclerView.t tVar, RecyclerView.y yVar, boolean z10) {
        int k10;
        int k11 = i10 - this.f2834r.k();
        if (k11 > 0) {
            int i11 = -d1(k11, tVar, yVar);
            int i12 = i10 + i11;
            if (!z10 || (k10 = i12 - this.f2834r.k()) <= 0) {
                return i11;
            }
            this.f2834r.o(-k10);
            return i11 - k10;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void V(AccessibilityEvent accessibilityEvent) {
        super.V(accessibilityEvent);
        if (y() > 0) {
            accessibilityEvent.setFromIndex(O0());
            accessibilityEvent.setToIndex(P0());
        }
    }

    public final View V0() {
        return x(this.f2837u ? 0 : y() - 1);
    }

    public final View W0() {
        return x(this.f2837u ? y() - 1 : 0);
    }

    public final boolean X0() {
        return B() == 1;
    }

    public void Y0(RecyclerView.t tVar, RecyclerView.y yVar, c cVar, b bVar) {
        boolean z10;
        int d10;
        int i10;
        int i11;
        int i12;
        int E;
        int i13;
        boolean z11;
        View b10 = cVar.b(tVar);
        if (b10 == null) {
            bVar.f2849b = true;
            return;
        }
        RecyclerView.n nVar = (RecyclerView.n) b10.getLayoutParams();
        if (cVar.f2862k == null) {
            boolean z12 = this.f2837u;
            if (cVar.f2857f == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z12 == z11) {
                c(b10, -1, false);
            } else {
                c(b10, 0, false);
            }
        } else {
            boolean z13 = this.f2837u;
            if (cVar.f2857f == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z13 == z10) {
                c(b10, -1, true);
            } else {
                c(b10, 0, true);
            }
        }
        RecyclerView.n nVar2 = (RecyclerView.n) b10.getLayoutParams();
        Rect L = this.f2960b.L(b10);
        int z14 = RecyclerView.m.z(this.f2972n, this.f2970l, F() + E() + ((ViewGroup.MarginLayoutParams) nVar2).leftMargin + ((ViewGroup.MarginLayoutParams) nVar2).rightMargin + L.left + L.right + 0, ((ViewGroup.MarginLayoutParams) nVar2).width, f());
        int z15 = RecyclerView.m.z(this.f2973o, this.f2971m, D() + G() + ((ViewGroup.MarginLayoutParams) nVar2).topMargin + ((ViewGroup.MarginLayoutParams) nVar2).bottomMargin + L.top + L.bottom + 0, ((ViewGroup.MarginLayoutParams) nVar2).height, g());
        if (y0(b10, z14, z15, nVar2)) {
            b10.measure(z14, z15);
        }
        bVar.f2848a = this.f2834r.c(b10);
        if (this.f2832p == 1) {
            if (X0()) {
                i12 = this.f2972n - F();
                E = i12 - this.f2834r.d(b10);
            } else {
                E = E();
                i12 = this.f2834r.d(b10) + E;
            }
            int i14 = cVar.f2857f;
            i11 = cVar.f2853b;
            if (i14 == -1) {
                i13 = E;
                d10 = i11;
                i11 -= bVar.f2848a;
            } else {
                i13 = E;
                d10 = bVar.f2848a + i11;
            }
            i10 = i13;
        } else {
            int G = G();
            d10 = this.f2834r.d(b10) + G;
            int i15 = cVar.f2857f;
            int i16 = cVar.f2853b;
            if (i15 == -1) {
                i10 = i16 - bVar.f2848a;
                i12 = i16;
                i11 = G;
            } else {
                int i17 = bVar.f2848a + i16;
                i10 = i16;
                i11 = G;
                i12 = i17;
            }
        }
        RecyclerView.m.P(b10, i10, i11, i12, d10);
        if (nVar.c() || nVar.b()) {
            bVar.f2850c = true;
        }
        bVar.f2851d = b10.hasFocusable();
    }

    public void Z0(RecyclerView.t tVar, RecyclerView.y yVar, a aVar, int i10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.x.b
    public final PointF a(int i10) {
        if (y() == 0) {
            return null;
        }
        int i11 = (i10 < RecyclerView.m.H(x(0))) != this.f2837u ? -1 : 1;
        return this.f2832p == 0 ? new PointF(i11, 0.0f) : new PointF(0.0f, i11);
    }

    public final void a1(RecyclerView.t tVar, c cVar) {
        if (cVar.f2852a && !cVar.f2863l) {
            int i10 = cVar.f2858g;
            int i11 = cVar.f2860i;
            if (cVar.f2857f == -1) {
                int y10 = y();
                if (i10 >= 0) {
                    int f10 = (this.f2834r.f() - i10) + i11;
                    if (this.f2837u) {
                        for (int i12 = 0; i12 < y10; i12++) {
                            View x10 = x(i12);
                            if (this.f2834r.e(x10) < f10 || this.f2834r.n(x10) < f10) {
                                b1(tVar, 0, i12);
                                return;
                            }
                        }
                        return;
                    }
                    int i13 = y10 - 1;
                    for (int i14 = i13; i14 >= 0; i14--) {
                        View x11 = x(i14);
                        if (this.f2834r.e(x11) < f10 || this.f2834r.n(x11) < f10) {
                            b1(tVar, i13, i14);
                            return;
                        }
                    }
                }
            } else if (i10 >= 0) {
                int i15 = i10 - i11;
                int y11 = y();
                if (this.f2837u) {
                    int i16 = y11 - 1;
                    for (int i17 = i16; i17 >= 0; i17--) {
                        View x12 = x(i17);
                        if (this.f2834r.b(x12) > i15 || this.f2834r.m(x12) > i15) {
                            b1(tVar, i16, i17);
                            return;
                        }
                    }
                    return;
                }
                for (int i18 = 0; i18 < y11; i18++) {
                    View x13 = x(i18);
                    if (this.f2834r.b(x13) > i15 || this.f2834r.m(x13) > i15) {
                        b1(tVar, 0, i18);
                        return;
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.t.g
    public final void b(View view, View view2) {
        int e10;
        d("Cannot drop a view during a scroll or layout calculation");
        K0();
        c1();
        int H = RecyclerView.m.H(view);
        int H2 = RecyclerView.m.H(view2);
        char c10 = H < H2 ? (char) 1 : (char) 65535;
        if (this.f2837u) {
            if (c10 == 1) {
                e1(H2, this.f2834r.g() - (this.f2834r.c(view) + this.f2834r.e(view2)));
                return;
            }
            e10 = this.f2834r.g() - this.f2834r.b(view2);
        } else if (c10 != 65535) {
            e1(H2, this.f2834r.b(view2) - this.f2834r.c(view));
            return;
        } else {
            e10 = this.f2834r.e(view2);
        }
        e1(H2, e10);
    }

    public final void b1(RecyclerView.t tVar, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                View x10 = x(i10);
                n0(i10);
                tVar.f(x10);
                i10--;
            }
            return;
        }
        while (true) {
            i11--;
            if (i11 < i10) {
                return;
            }
            View x11 = x(i11);
            n0(i11);
            tVar.f(x11);
        }
    }

    public final void c1() {
        this.f2837u = (this.f2832p == 1 || !X0()) ? this.f2836t : !this.f2836t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void d(String str) {
        if (this.f2842z == null) {
            super.d(str);
        }
    }

    public final int d1(int i10, RecyclerView.t tVar, RecyclerView.y yVar) {
        if (y() == 0 || i10 == 0) {
            return 0;
        }
        K0();
        this.f2833q.f2852a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int abs = Math.abs(i10);
        h1(i11, abs, true, yVar);
        c cVar = this.f2833q;
        int L0 = L0(tVar, cVar, yVar, false) + cVar.f2858g;
        if (L0 < 0) {
            return 0;
        }
        if (abs > L0) {
            i10 = i11 * L0;
        }
        this.f2834r.o(-i10);
        this.f2833q.f2861j = i10;
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:378:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x023d  */
    @Override // androidx.recyclerview.widget.RecyclerView.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e0(androidx.recyclerview.widget.RecyclerView.t r18, androidx.recyclerview.widget.RecyclerView.y r19) {
        /*
            Method dump skipped, instructions count: 1133
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.e0(androidx.recyclerview.widget.RecyclerView$t, androidx.recyclerview.widget.RecyclerView$y):void");
    }

    public final void e1(int i10, int i11) {
        this.f2840x = i10;
        this.f2841y = i11;
        d dVar = this.f2842z;
        if (dVar != null) {
            dVar.f2864a = -1;
        }
        p0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean f() {
        return this.f2832p == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void f0(RecyclerView.y yVar) {
        this.f2842z = null;
        this.f2840x = -1;
        this.f2841y = Integer.MIN_VALUE;
        this.A.c();
    }

    public final void f1(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(u0.a("invalid orientation:", i10));
        }
        d(null);
        if (i10 != this.f2832p || this.f2834r == null) {
            d0 a10 = d0.a(this, i10);
            this.f2834r = a10;
            this.A.f2843a = a10;
            this.f2832p = i10;
            p0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean g() {
        return this.f2832p == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void g0(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.f2842z = dVar;
            if (this.f2840x != -1) {
                dVar.f2864a = -1;
            }
            p0();
        }
    }

    public void g1(boolean z10) {
        d(null);
        if (this.f2838v == z10) {
            return;
        }
        this.f2838v = z10;
        p0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final Parcelable h0() {
        d dVar = this.f2842z;
        if (dVar != null) {
            return new d(dVar);
        }
        d dVar2 = new d();
        if (y() > 0) {
            K0();
            boolean z10 = this.f2835s ^ this.f2837u;
            dVar2.f2866c = z10;
            if (z10) {
                View V0 = V0();
                dVar2.f2865b = this.f2834r.g() - this.f2834r.b(V0);
                dVar2.f2864a = RecyclerView.m.H(V0);
            } else {
                View W0 = W0();
                dVar2.f2864a = RecyclerView.m.H(W0);
                dVar2.f2865b = this.f2834r.e(W0) - this.f2834r.k();
            }
        } else {
            dVar2.f2864a = -1;
        }
        return dVar2;
    }

    public final void h1(int i10, int i11, boolean z10, RecyclerView.y yVar) {
        boolean z11;
        int i12;
        int k10;
        c cVar = this.f2833q;
        boolean z12 = false;
        int i13 = 1;
        if (this.f2834r.i() == 0 && this.f2834r.f() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        cVar.f2863l = z11;
        this.f2833q.f2857f = i10;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        E0(yVar, iArr);
        int max = Math.max(0, this.D[0]);
        int max2 = Math.max(0, this.D[1]);
        if (i10 == 1) {
            z12 = true;
        }
        c cVar2 = this.f2833q;
        if (z12) {
            i12 = max2;
        } else {
            i12 = max;
        }
        cVar2.f2859h = i12;
        if (!z12) {
            max = max2;
        }
        cVar2.f2860i = max;
        if (z12) {
            cVar2.f2859h = this.f2834r.h() + i12;
            View V0 = V0();
            c cVar3 = this.f2833q;
            if (this.f2837u) {
                i13 = -1;
            }
            cVar3.f2856e = i13;
            int H = RecyclerView.m.H(V0);
            c cVar4 = this.f2833q;
            cVar3.f2855d = H + cVar4.f2856e;
            cVar4.f2853b = this.f2834r.b(V0);
            k10 = this.f2834r.b(V0) - this.f2834r.g();
        } else {
            View W0 = W0();
            c cVar5 = this.f2833q;
            cVar5.f2859h = this.f2834r.k() + cVar5.f2859h;
            c cVar6 = this.f2833q;
            if (!this.f2837u) {
                i13 = -1;
            }
            cVar6.f2856e = i13;
            int H2 = RecyclerView.m.H(W0);
            c cVar7 = this.f2833q;
            cVar6.f2855d = H2 + cVar7.f2856e;
            cVar7.f2853b = this.f2834r.e(W0);
            k10 = (-this.f2834r.e(W0)) + this.f2834r.k();
        }
        c cVar8 = this.f2833q;
        cVar8.f2854c = i11;
        if (z10) {
            cVar8.f2854c = i11 - k10;
        }
        cVar8.f2858g = k10;
    }

    public final void i1(int i10, int i11) {
        this.f2833q.f2854c = this.f2834r.g() - i11;
        c cVar = this.f2833q;
        cVar.f2856e = this.f2837u ? -1 : 1;
        cVar.f2855d = i10;
        cVar.f2857f = 1;
        cVar.f2853b = i11;
        cVar.f2858g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void j(int i10, int i11, RecyclerView.y yVar, RecyclerView.m.c cVar) {
        if (this.f2832p != 0) {
            i10 = i11;
        }
        if (y() == 0 || i10 == 0) {
            return;
        }
        K0();
        h1(i10 > 0 ? 1 : -1, Math.abs(i10), true, yVar);
        F0(yVar, this.f2833q, cVar);
    }

    public final void j1(int i10, int i11) {
        this.f2833q.f2854c = i11 - this.f2834r.k();
        c cVar = this.f2833q;
        cVar.f2855d = i10;
        cVar.f2856e = this.f2837u ? 1 : -1;
        cVar.f2857f = -1;
        cVar.f2853b = i11;
        cVar.f2858g = Integer.MIN_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0025  */
    @Override // androidx.recyclerview.widget.RecyclerView.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(int r7, androidx.recyclerview.widget.RecyclerView.m.c r8) {
        /*
            r6 = this;
            androidx.recyclerview.widget.LinearLayoutManager$d r0 = r6.f2842z
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L13
            int r4 = r0.f2864a
            if (r4 < 0) goto Ld
            r5 = 1
            goto Le
        Ld:
            r5 = 0
        Le:
            if (r5 == 0) goto L13
            boolean r0 = r0.f2866c
            goto L22
        L13:
            r6.c1()
            boolean r0 = r6.f2837u
            int r4 = r6.f2840x
            if (r4 != r1) goto L22
            if (r0 == 0) goto L21
            int r4 = r7 + (-1)
            goto L22
        L21:
            r4 = 0
        L22:
            if (r0 == 0) goto L25
            goto L26
        L25:
            r1 = 1
        L26:
            r0 = 0
        L27:
            int r2 = r6.C
            if (r0 >= r2) goto L39
            if (r4 < 0) goto L39
            if (r4 >= r7) goto L39
            r2 = r8
            androidx.recyclerview.widget.s$b r2 = (androidx.recyclerview.widget.s.b) r2
            r2.a(r4, r3)
            int r4 = r4 + r1
            int r0 = r0 + 1
            goto L27
        L39:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.k(int, androidx.recyclerview.widget.RecyclerView$m$c):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int l(RecyclerView.y yVar) {
        return G0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int m(RecyclerView.y yVar) {
        return H0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int n(RecyclerView.y yVar) {
        return I0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int o(RecyclerView.y yVar) {
        return G0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int p(RecyclerView.y yVar) {
        return H0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int q(RecyclerView.y yVar) {
        return I0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int q0(int i10, RecyclerView.t tVar, RecyclerView.y yVar) {
        if (this.f2832p == 1) {
            return 0;
        }
        return d1(i10, tVar, yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void r0(int i10) {
        this.f2840x = i10;
        this.f2841y = Integer.MIN_VALUE;
        d dVar = this.f2842z;
        if (dVar != null) {
            dVar.f2864a = -1;
        }
        p0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final View s(int i10) {
        int y10 = y();
        if (y10 == 0) {
            return null;
        }
        int H = i10 - RecyclerView.m.H(x(0));
        if (H >= 0 && H < y10) {
            View x10 = x(H);
            if (RecyclerView.m.H(x10) == i10) {
                return x10;
            }
        }
        return super.s(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int s0(int i10, RecyclerView.t tVar, RecyclerView.y yVar) {
        if (this.f2832p == 0) {
            return 0;
        }
        return d1(i10, tVar, yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public RecyclerView.n t() {
        return new RecyclerView.n(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean z0() {
        boolean z10;
        if (this.f2971m == 1073741824 || this.f2970l == 1073741824) {
            return false;
        }
        int y10 = y();
        int i10 = 0;
        while (true) {
            if (i10 < y10) {
                ViewGroup.LayoutParams layoutParams = x(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                z10 = false;
                break;
            }
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f2832p = 1;
        this.f2836t = false;
        this.f2837u = false;
        this.f2838v = false;
        this.f2839w = true;
        this.f2840x = -1;
        this.f2841y = Integer.MIN_VALUE;
        this.f2842z = null;
        this.A = new a();
        this.B = new b();
        this.C = 2;
        this.D = new int[2];
        RecyclerView.m.d I = RecyclerView.m.I(context, attributeSet, i10, i11);
        f1(I.f2976a);
        boolean z10 = I.f2978c;
        d(null);
        if (z10 != this.f2836t) {
            this.f2836t = z10;
            p0();
        }
        g1(I.f2979d);
    }
}
