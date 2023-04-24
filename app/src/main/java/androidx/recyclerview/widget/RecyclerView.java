package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.appcompat.widget.e2;
import androidx.recyclerview.R;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.i0;
import androidx.recyclerview.widget.p;
import androidx.recyclerview.widget.p0;
import androidx.recyclerview.widget.q0;
import androidx.recyclerview.widget.s;
import f1.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;
import l1.j;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements k1.z {
    public static final int[] M0 = {16843830};
    public static final boolean N0;
    public static final boolean O0;
    public static final boolean P0;
    public static final Class<?>[] Q0;
    public static final c R0;
    public boolean A;
    public i0 A0;
    public final AccessibilityManager B;
    public final int[] B0;
    public ArrayList C;
    public k1.a0 C0;
    public boolean D;
    public final int[] D0;
    public boolean E;
    public final int[] E0;
    public int F;
    public final int[] F0;
    public final ArrayList G0;
    public int H;
    public b H0;
    public boolean I0;
    public int J0;
    public int K0;
    public i L;
    public final d L0;
    public EdgeEffect M;
    public EdgeEffect Q;
    public EdgeEffect U;
    public EdgeEffect V;
    public j W;

    /* renamed from: a */
    public final v f2867a;

    /* renamed from: b */
    public final t f2868b;

    /* renamed from: c */
    public w f2869c;

    /* renamed from: c0 */
    public int f2870c0;

    /* renamed from: d */
    public androidx.recyclerview.widget.a f2871d;

    /* renamed from: d0 */
    public int f2872d0;

    /* renamed from: e */
    public androidx.recyclerview.widget.e f2873e;

    /* renamed from: e0 */
    public VelocityTracker f2874e0;

    /* renamed from: f */
    public final q0 f2875f;

    /* renamed from: f0 */
    public int f2876f0;

    /* renamed from: g */
    public boolean f2877g;

    /* renamed from: g0 */
    public int f2878g0;

    /* renamed from: h */
    public final a f2879h;

    /* renamed from: h0 */
    public int f2880h0;

    /* renamed from: i */
    public final Rect f2881i;

    /* renamed from: i0 */
    public int f2882i0;

    /* renamed from: j */
    public final Rect f2883j;

    /* renamed from: j0 */
    public int f2884j0;

    /* renamed from: k */
    public final RectF f2885k;

    /* renamed from: k0 */
    public p f2886k0;

    /* renamed from: l */
    public e f2887l;

    /* renamed from: l0 */
    public final int f2888l0;

    /* renamed from: m */
    public m f2889m;

    /* renamed from: m0 */
    public final int f2890m0;

    /* renamed from: n */
    public u f2891n;

    /* renamed from: n0 */
    public float f2892n0;

    /* renamed from: o */
    public final ArrayList f2893o;

    /* renamed from: o0 */
    public float f2894o0;

    /* renamed from: p */
    public final ArrayList<l> f2895p;

    /* renamed from: p0 */
    public boolean f2896p0;

    /* renamed from: q */
    public final ArrayList<q> f2897q;

    /* renamed from: q0 */
    public final a0 f2898q0;

    /* renamed from: r */
    public q f2899r;

    /* renamed from: r0 */
    public androidx.recyclerview.widget.s f2900r0;

    /* renamed from: s */
    public boolean f2901s;

    /* renamed from: s0 */
    public s.b f2902s0;

    /* renamed from: t */
    public boolean f2903t;

    /* renamed from: t0 */
    public final y f2904t0;

    /* renamed from: u */
    public boolean f2905u;

    /* renamed from: u0 */
    public r f2906u0;

    /* renamed from: v */
    public int f2907v;

    /* renamed from: v0 */
    public ArrayList f2908v0;

    /* renamed from: w */
    public boolean f2909w;

    /* renamed from: w0 */
    public boolean f2910w0;

    /* renamed from: x */
    public boolean f2911x;

    /* renamed from: x0 */
    public boolean f2912x0;

    /* renamed from: y */
    public boolean f2913y;

    /* renamed from: y0 */
    public k f2914y0;

    /* renamed from: z */
    public int f2915z;

    /* renamed from: z0 */
    public boolean f2916z0;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            RecyclerView.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f2905u || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.f2901s) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f2911x) {
                recyclerView2.f2909w = true;
            } else {
                recyclerView2.m();
            }
        }
    }

    /* loaded from: classes.dex */
    public class a0 implements Runnable {

        /* renamed from: a */
        public int f2918a;

        /* renamed from: b */
        public int f2919b;

        /* renamed from: c */
        public OverScroller f2920c;

        /* renamed from: d */
        public Interpolator f2921d;

        /* renamed from: e */
        public boolean f2922e;

        /* renamed from: f */
        public boolean f2923f;

        public a0() {
            RecyclerView.this = r3;
            c cVar = RecyclerView.R0;
            this.f2921d = cVar;
            this.f2922e = false;
            this.f2923f = false;
            this.f2920c = new OverScroller(r3.getContext(), cVar);
        }

        public final void a() {
            if (this.f2922e) {
                this.f2923f = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            RecyclerView recyclerView = RecyclerView.this;
            WeakHashMap<View, i2> weakHashMap = k1.o0.f18161a;
            o0.d.m(recyclerView, this);
        }

        public final void b(int i10, int i11, int i12, Interpolator interpolator) {
            boolean z10;
            int height;
            if (i12 == Integer.MIN_VALUE) {
                int abs = Math.abs(i10);
                int abs2 = Math.abs(i11);
                if (abs > abs2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                RecyclerView recyclerView = RecyclerView.this;
                if (z10) {
                    height = recyclerView.getWidth();
                } else {
                    height = recyclerView.getHeight();
                }
                if (!z10) {
                    abs = abs2;
                }
                i12 = Math.min((int) (((abs / height) + 1.0f) * 300.0f), 2000);
            }
            int i13 = i12;
            if (interpolator == null) {
                interpolator = RecyclerView.R0;
            }
            if (this.f2921d != interpolator) {
                this.f2921d = interpolator;
                this.f2920c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f2919b = 0;
            this.f2918a = 0;
            RecyclerView.this.setScrollState(2);
            this.f2920c.startScroll(0, 0, i10, i11, i13);
            if (Build.VERSION.SDK_INT < 23) {
                this.f2920c.computeScrollOffset();
            }
            a();
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10;
            int i11;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            int i12;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f2889m == null) {
                recyclerView.removeCallbacks(this);
                this.f2920c.abortAnimation();
                return;
            }
            this.f2923f = false;
            this.f2922e = true;
            recyclerView.m();
            OverScroller overScroller = this.f2920c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i13 = currX - this.f2918a;
                int i14 = currY - this.f2919b;
                this.f2918a = currX;
                this.f2919b = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.F0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.s(i13, i14, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.F0;
                    i13 -= iArr2[0];
                    i14 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.l(i13, i14);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f2887l != null) {
                    int[] iArr3 = recyclerView3.F0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.c0(i13, i14, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.F0;
                    i11 = iArr4[0];
                    i10 = iArr4[1];
                    i13 -= i11;
                    i14 -= i10;
                    x xVar = recyclerView4.f2889m.f2963e;
                    if (xVar != null && !xVar.f3003d && xVar.f3004e) {
                        int b10 = recyclerView4.f2904t0.b();
                        if (b10 == 0) {
                            xVar.d();
                        } else {
                            if (xVar.f3000a >= b10) {
                                xVar.f3000a = b10 - 1;
                            }
                            xVar.b(i11, i10);
                        }
                    }
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                if (!RecyclerView.this.f2895p.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.F0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.t(i11, i10, i13, i14, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.F0;
                int i15 = i13 - iArr6[0];
                int i16 = i14 - iArr6[1];
                if (i11 != 0 || i10 != 0) {
                    recyclerView6.u(i11, i10);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                if (overScroller.getCurrX() == overScroller.getFinalX()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (overScroller.getCurrY() == overScroller.getFinalY()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!overScroller.isFinished() && ((!z10 && i15 == 0) || (!z11 && i16 == 0))) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                RecyclerView recyclerView7 = RecyclerView.this;
                x xVar2 = recyclerView7.f2889m.f2963e;
                if (xVar2 != null && xVar2.f3003d) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13 && z12) {
                    if (recyclerView7.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i15 < 0) {
                            i12 = -currVelocity;
                        } else if (i15 > 0) {
                            i12 = currVelocity;
                        } else {
                            i12 = 0;
                        }
                        if (i16 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i16 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView recyclerView8 = RecyclerView.this;
                        if (i12 < 0) {
                            recyclerView8.w();
                            if (recyclerView8.M.isFinished()) {
                                recyclerView8.M.onAbsorb(-i12);
                            }
                        } else if (i12 > 0) {
                            recyclerView8.x();
                            if (recyclerView8.U.isFinished()) {
                                recyclerView8.U.onAbsorb(i12);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView8.y();
                            if (recyclerView8.Q.isFinished()) {
                                recyclerView8.Q.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView8.v();
                            if (recyclerView8.V.isFinished()) {
                                recyclerView8.V.onAbsorb(currVelocity);
                            }
                        } else {
                            recyclerView8.getClass();
                        }
                        if (i12 != 0 || currVelocity != 0) {
                            WeakHashMap<View, i2> weakHashMap = k1.o0.f18161a;
                            o0.d.k(recyclerView8);
                        }
                    }
                    if (RecyclerView.P0) {
                        s.b bVar = RecyclerView.this.f2902s0;
                        int[] iArr7 = bVar.f3260c;
                        if (iArr7 != null) {
                            Arrays.fill(iArr7, -1);
                        }
                        bVar.f3261d = 0;
                    }
                } else {
                    a();
                    RecyclerView recyclerView9 = RecyclerView.this;
                    androidx.recyclerview.widget.s sVar = recyclerView9.f2900r0;
                    if (sVar != null) {
                        sVar.a(recyclerView9, i11, i10);
                    }
                }
            }
            x xVar3 = RecyclerView.this.f2889m.f2963e;
            if (xVar3 != null && xVar3.f3003d) {
                xVar3.b(0, 0);
            }
            this.f2922e = false;
            if (this.f2923f) {
                RecyclerView.this.removeCallbacks(this);
                RecyclerView recyclerView10 = RecyclerView.this;
                WeakHashMap<View, i2> weakHashMap2 = k1.o0.f18161a;
                o0.d.m(recyclerView10, this);
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.i0(1);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
            RecyclerView.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            long j10;
            long j11;
            j jVar = RecyclerView.this.W;
            if (jVar != null) {
                androidx.recyclerview.widget.p pVar = (androidx.recyclerview.widget.p) jVar;
                boolean z10 = !pVar.f3157h.isEmpty();
                boolean z11 = !pVar.f3159j.isEmpty();
                boolean z12 = !pVar.f3160k.isEmpty();
                boolean z13 = !pVar.f3158i.isEmpty();
                if (z10 || z11 || z13 || z12) {
                    Iterator<b0> it = pVar.f3157h.iterator();
                    while (it.hasNext()) {
                        b0 next = it.next();
                        View view = next.f2927a;
                        ViewPropertyAnimator animate = view.animate();
                        pVar.f3166q.add(next);
                        animate.setDuration(pVar.f2953d).alpha(0.0f).setListener(new androidx.recyclerview.widget.k(view, animate, pVar, next)).start();
                    }
                    pVar.f3157h.clear();
                    if (z11) {
                        ArrayList<p.b> arrayList = new ArrayList<>();
                        arrayList.addAll(pVar.f3159j);
                        pVar.f3162m.add(arrayList);
                        pVar.f3159j.clear();
                        androidx.recyclerview.widget.h hVar = new androidx.recyclerview.widget.h(pVar, arrayList);
                        if (z10) {
                            View view2 = arrayList.get(0).f3174a.f2927a;
                            long j12 = pVar.f2953d;
                            WeakHashMap<View, i2> weakHashMap = k1.o0.f18161a;
                            o0.d.n(view2, hVar, j12);
                        } else {
                            hVar.run();
                        }
                    }
                    if (z12) {
                        ArrayList<p.a> arrayList2 = new ArrayList<>();
                        arrayList2.addAll(pVar.f3160k);
                        pVar.f3163n.add(arrayList2);
                        pVar.f3160k.clear();
                        androidx.recyclerview.widget.i iVar = new androidx.recyclerview.widget.i(pVar, arrayList2);
                        if (z10) {
                            View view3 = arrayList2.get(0).f3168a.f2927a;
                            long j13 = pVar.f2953d;
                            WeakHashMap<View, i2> weakHashMap2 = k1.o0.f18161a;
                            o0.d.n(view3, iVar, j13);
                        } else {
                            iVar.run();
                        }
                    }
                    if (z13) {
                        ArrayList<b0> arrayList3 = new ArrayList<>();
                        arrayList3.addAll(pVar.f3158i);
                        pVar.f3161l.add(arrayList3);
                        pVar.f3158i.clear();
                        androidx.recyclerview.widget.j jVar2 = new androidx.recyclerview.widget.j(pVar, arrayList3);
                        if (!z10 && !z11 && !z12) {
                            jVar2.run();
                        } else {
                            long j14 = 0;
                            if (z10) {
                                j10 = pVar.f2953d;
                            } else {
                                j10 = 0;
                            }
                            if (z11) {
                                j11 = pVar.f2954e;
                            } else {
                                j11 = 0;
                            }
                            if (z12) {
                                j14 = pVar.f2955f;
                            }
                            View view4 = arrayList3.get(0).f2927a;
                            WeakHashMap<View, i2> weakHashMap3 = k1.o0.f18161a;
                            o0.d.n(view4, jVar2, Math.max(j11, j14) + j10);
                        }
                    }
                }
            }
            RecyclerView.this.f2916z0 = false;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b0 {

        /* renamed from: t */
        public static final List<Object> f2926t = Collections.emptyList();

        /* renamed from: a */
        public final View f2927a;

        /* renamed from: b */
        public WeakReference<RecyclerView> f2928b;

        /* renamed from: j */
        public int f2936j;

        /* renamed from: r */
        public RecyclerView f2944r;

        /* renamed from: s */
        public e<? extends b0> f2945s;

        /* renamed from: c */
        public int f2929c = -1;

        /* renamed from: d */
        public int f2930d = -1;

        /* renamed from: e */
        public long f2931e = -1;

        /* renamed from: f */
        public int f2932f = -1;

        /* renamed from: g */
        public int f2933g = -1;

        /* renamed from: h */
        public b0 f2934h = null;

        /* renamed from: i */
        public b0 f2935i = null;

        /* renamed from: k */
        public ArrayList f2937k = null;

        /* renamed from: l */
        public List<Object> f2938l = null;

        /* renamed from: m */
        public int f2939m = 0;

        /* renamed from: n */
        public t f2940n = null;

        /* renamed from: o */
        public boolean f2941o = false;

        /* renamed from: p */
        public int f2942p = 0;

        /* renamed from: q */
        public int f2943q = -1;

        public b0(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f2927a = view;
        }

        public final void a(Object obj) {
            if (obj == null) {
                b(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
            } else if ((1024 & this.f2936j) == 0) {
                if (this.f2937k == null) {
                    ArrayList arrayList = new ArrayList();
                    this.f2937k = arrayList;
                    this.f2938l = Collections.unmodifiableList(arrayList);
                }
                this.f2937k.add(obj);
            }
        }

        public final void b(int i10) {
            this.f2936j = i10 | this.f2936j;
        }

        public final int c() {
            RecyclerView recyclerView = this.f2944r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.G(this);
        }

        public final int d() {
            RecyclerView recyclerView;
            e adapter;
            int G;
            if (this.f2945s == null || (recyclerView = this.f2944r) == null || (adapter = recyclerView.getAdapter()) == null || (G = this.f2944r.G(this)) == -1) {
                return -1;
            }
            return adapter.d(this.f2945s, this, G);
        }

        public final int e() {
            int i10 = this.f2933g;
            return i10 == -1 ? this.f2929c : i10;
        }

        public final List<Object> f() {
            if ((this.f2936j & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
                ArrayList arrayList = this.f2937k;
                return (arrayList == null || arrayList.size() == 0) ? f2926t : this.f2938l;
            }
            return f2926t;
        }

        public final boolean g() {
            return (this.f2927a.getParent() == null || this.f2927a.getParent() == this.f2944r) ? false : true;
        }

        public final boolean h() {
            return (this.f2936j & 1) != 0;
        }

        public final boolean i() {
            return (this.f2936j & 4) != 0;
        }

        public final boolean j() {
            if ((this.f2936j & 16) == 0) {
                View view = this.f2927a;
                WeakHashMap<View, i2> weakHashMap = k1.o0.f18161a;
                if (!o0.d.i(view)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean k() {
            return (this.f2936j & 8) != 0;
        }

        public final boolean l() {
            return this.f2940n != null;
        }

        public final boolean m() {
            return (this.f2936j & DfuBaseService.ERROR_REMOTE_TYPE_LEGACY) != 0;
        }

        public final void n(int i10, boolean z10) {
            if (this.f2930d == -1) {
                this.f2930d = this.f2929c;
            }
            if (this.f2933g == -1) {
                this.f2933g = this.f2929c;
            }
            if (z10) {
                this.f2933g += i10;
            }
            this.f2929c += i10;
            if (this.f2927a.getLayoutParams() != null) {
                ((n) this.f2927a.getLayoutParams()).f2982c = true;
            }
        }

        public final void o() {
            this.f2936j = 0;
            this.f2929c = -1;
            this.f2930d = -1;
            this.f2931e = -1L;
            this.f2933g = -1;
            this.f2939m = 0;
            this.f2934h = null;
            this.f2935i = null;
            ArrayList arrayList = this.f2937k;
            if (arrayList != null) {
                arrayList.clear();
            }
            this.f2936j &= -1025;
            this.f2942p = 0;
            this.f2943q = -1;
            RecyclerView.j(this);
        }

        public final void p(boolean z10) {
            int i10;
            int i11 = this.f2939m;
            int i12 = z10 ? i11 - 1 : i11 + 1;
            this.f2939m = i12;
            if (i12 < 0) {
                this.f2939m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z10 && i12 == 1) {
                i10 = this.f2936j | 16;
            } else if (!z10 || i12 != 0) {
                return;
            } else {
                i10 = this.f2936j & (-17);
            }
            this.f2936j = i10;
        }

        public final boolean q() {
            return (this.f2936j & 128) != 0;
        }

        public final boolean r() {
            return (this.f2936j & 32) != 0;
        }

        public final String toString() {
            String simpleName;
            boolean z10;
            String str;
            if (getClass().isAnonymousClass()) {
                simpleName = "ViewHolder";
            } else {
                simpleName = getClass().getSimpleName();
            }
            StringBuilder a10 = p.a.a(simpleName, "{");
            a10.append(Integer.toHexString(hashCode()));
            a10.append(" position=");
            a10.append(this.f2929c);
            a10.append(" id=");
            a10.append(this.f2931e);
            a10.append(", oldPos=");
            a10.append(this.f2930d);
            a10.append(", pLpos:");
            a10.append(this.f2933g);
            StringBuilder sb2 = new StringBuilder(a10.toString());
            if (l()) {
                sb2.append(" scrap ");
                if (this.f2941o) {
                    str = "[changeScrap]";
                } else {
                    str = "[attachedScrap]";
                }
                sb2.append(str);
            }
            if (i()) {
                sb2.append(" invalid");
            }
            if (!h()) {
                sb2.append(" unbound");
            }
            boolean z11 = true;
            if ((this.f2936j & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                sb2.append(" update");
            }
            if (k()) {
                sb2.append(" removed");
            }
            if (q()) {
                sb2.append(" ignored");
            }
            if (m()) {
                sb2.append(" tmpDetached");
            }
            if (!j()) {
                StringBuilder a11 = android.support.v4.media.d.a(" not recyclable(");
                a11.append(this.f2939m);
                a11.append(")");
                sb2.append(a11.toString());
            }
            if ((this.f2936j & DfuBaseService.ERROR_REMOTE_TYPE_SECURE) == 0 && !i()) {
                z11 = false;
            }
            if (z11) {
                sb2.append(" undefined adapter position");
            }
            if (this.f2927a.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }
    }

    /* loaded from: classes.dex */
    public class c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public class d {
        public d() {
            RecyclerView.this = r1;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e<VH extends b0> {

        /* renamed from: a */
        public final f f2947a = new f();

        /* renamed from: b */
        public boolean f2948b = false;

        /* renamed from: c */
        public int f2949c = 1;

        public final void c(VH vh2, int i10) {
            boolean z10;
            if (vh2.f2945s == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                vh2.f2929c = i10;
                if (this.f2948b) {
                    vh2.f2931e = f(i10);
                }
                vh2.f2936j = (vh2.f2936j & (-520)) | 1;
                int i11 = f1.o.f14038a;
                o.a.a("RV OnBindView");
            }
            vh2.f2945s = this;
            vh2.f();
            n(vh2, i10);
            if (z10) {
                ArrayList arrayList = vh2.f2937k;
                if (arrayList != null) {
                    arrayList.clear();
                }
                vh2.f2936j &= -1025;
                ViewGroup.LayoutParams layoutParams = vh2.f2927a.getLayoutParams();
                if (layoutParams instanceof n) {
                    ((n) layoutParams).f2982c = true;
                }
                int i12 = f1.o.f14038a;
                o.a.b();
            }
        }

        public int d(e<? extends b0> eVar, b0 b0Var, int i10) {
            if (eVar == this) {
                return i10;
            }
            return -1;
        }

        public abstract int e();

        public long f(int i10) {
            return -1L;
        }

        public int g(int i10) {
            return 0;
        }

        public final void h() {
            this.f2947a.b();
        }

        public final void i(int i10, int i11) {
            this.f2947a.c(i10, i11);
        }

        public final void j(int i10, int i11, Object obj) {
            this.f2947a.d(i10, i11, obj);
        }

        public final void k(int i10, int i11) {
            this.f2947a.e(i10, i11);
        }

        public final void l(int i10, int i11) {
            this.f2947a.f(i10, i11);
        }

        public void m(RecyclerView recyclerView) {
        }

        public abstract void n(VH vh2, int i10);

        public abstract b0 o(RecyclerView recyclerView, int i10);

        public void p(RecyclerView recyclerView) {
        }

        public boolean q(VH vh2) {
            return false;
        }

        public void r(VH vh2) {
        }

        public void s(VH vh2) {
        }

        public void t(VH vh2) {
        }

        public final void u(g gVar) {
            this.f2947a.registerObserver(gVar);
        }

        public final void v(boolean z10) {
            if (!this.f2947a.a()) {
                this.f2948b = z10;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void w(int i10) {
            this.f2949c = i10;
            this.f2947a.g();
        }

        public final void x(g gVar) {
            this.f2947a.unregisterObserver(gVar);
        }
    }

    /* loaded from: classes.dex */
    public static class f extends Observable<g> {
        public final boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public final void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public final void c(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).e(i10, i11);
            }
        }

        public final void d(int i10, int i11, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).c(i10, i11, obj);
            }
        }

        public final void e(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).d(i10, i11);
            }
        }

        public final void f(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).f(i10, i11);
            }
        }

        public final void g() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).g();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class g {
        public void a() {
        }

        public void b(int i10, int i11) {
        }

        public void c(int i10, int i11, Object obj) {
            b(i10, i11);
        }

        public void d(int i10, int i11) {
        }

        public void e(int i10, int i11) {
        }

        public void f(int i10, int i11) {
        }

        public void g() {
        }
    }

    /* loaded from: classes.dex */
    public interface h {
        int a();
    }

    /* loaded from: classes.dex */
    public static class i {
    }

    /* loaded from: classes.dex */
    public static abstract class j {

        /* renamed from: a */
        public b f2950a = null;

        /* renamed from: b */
        public ArrayList<a> f2951b = new ArrayList<>();

        /* renamed from: c */
        public long f2952c = 120;

        /* renamed from: d */
        public long f2953d = 120;

        /* renamed from: e */
        public long f2954e = 250;

        /* renamed from: f */
        public long f2955f = 250;

        /* loaded from: classes.dex */
        public interface a {
            void a();
        }

        /* loaded from: classes.dex */
        public interface b {
        }

        /* loaded from: classes.dex */
        public static class c {

            /* renamed from: a */
            public int f2956a;

            /* renamed from: b */
            public int f2957b;

            public final void a(b0 b0Var) {
                View view = b0Var.f2927a;
                this.f2956a = view.getLeft();
                this.f2957b = view.getTop();
                view.getRight();
                view.getBottom();
            }
        }

        public static void b(b0 b0Var) {
            int i10 = b0Var.f2936j & 14;
            if (!b0Var.i() && (i10 & 4) == 0) {
                b0Var.c();
            }
        }

        public abstract boolean a(b0 b0Var, b0 b0Var2, c cVar, c cVar2);

        public final void c(b0 b0Var) {
            boolean z10;
            b bVar = this.f2950a;
            if (bVar != null) {
                k kVar = (k) bVar;
                boolean z11 = true;
                b0Var.p(true);
                if (b0Var.f2934h != null && b0Var.f2935i == null) {
                    b0Var.f2934h = null;
                }
                b0Var.f2935i = null;
                if ((b0Var.f2936j & 16) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    RecyclerView recyclerView = RecyclerView.this;
                    View view = b0Var.f2927a;
                    recyclerView.g0();
                    androidx.recyclerview.widget.e eVar = recyclerView.f2873e;
                    int indexOfChild = ((g0) eVar.f3092a).f3112a.indexOfChild(view);
                    if (indexOfChild == -1) {
                        eVar.l(view);
                    } else if (eVar.f3093b.d(indexOfChild)) {
                        eVar.f3093b.f(indexOfChild);
                        eVar.l(view);
                        ((g0) eVar.f3092a).b(indexOfChild);
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        b0 J = RecyclerView.J(view);
                        recyclerView.f2868b.j(J);
                        recyclerView.f2868b.g(J);
                    }
                    recyclerView.h0(!z11);
                    if (!z11 && b0Var.m()) {
                        RecyclerView.this.removeDetachedView(b0Var.f2927a, false);
                    }
                }
            }
        }

        public final void d() {
            int size = this.f2951b.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f2951b.get(i10).a();
            }
            this.f2951b.clear();
        }

        public abstract void e(b0 b0Var);

        public abstract void f();

        public abstract boolean g();
    }

    /* loaded from: classes.dex */
    public class k implements j.b {
        public k() {
            RecyclerView.this = r1;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class l {
        public void f(Rect rect, View view, RecyclerView recyclerView) {
            ((n) view.getLayoutParams()).a();
            rect.set(0, 0, 0, 0);
        }

        public void g(Canvas canvas, RecyclerView recyclerView) {
        }

        public void h(Canvas canvas, RecyclerView recyclerView) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class m {

        /* renamed from: a */
        public androidx.recyclerview.widget.e f2959a;

        /* renamed from: b */
        public RecyclerView f2960b;

        /* renamed from: c */
        public p0 f2961c;

        /* renamed from: d */
        public p0 f2962d;

        /* renamed from: e */
        public x f2963e;

        /* renamed from: f */
        public boolean f2964f;

        /* renamed from: g */
        public boolean f2965g;

        /* renamed from: h */
        public boolean f2966h;

        /* renamed from: i */
        public boolean f2967i;

        /* renamed from: j */
        public int f2968j;

        /* renamed from: k */
        public boolean f2969k;

        /* renamed from: l */
        public int f2970l;

        /* renamed from: m */
        public int f2971m;

        /* renamed from: n */
        public int f2972n;

        /* renamed from: o */
        public int f2973o;

        /* loaded from: classes.dex */
        public class a implements p0.b {
            public a() {
                m.this = r1;
            }

            @Override // androidx.recyclerview.widget.p0.b
            public final int a(View view) {
                m.this.getClass();
                return (view.getLeft() - m.C(view)) - ((ViewGroup.MarginLayoutParams) ((n) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.p0.b
            public final int b() {
                return m.this.E();
            }

            @Override // androidx.recyclerview.widget.p0.b
            public final int c() {
                m mVar = m.this;
                return mVar.f2972n - mVar.F();
            }

            @Override // androidx.recyclerview.widget.p0.b
            public final View d(int i10) {
                return m.this.x(i10);
            }

            @Override // androidx.recyclerview.widget.p0.b
            public final int e(View view) {
                m.this.getClass();
                return m.J(view) + view.getRight() + ((ViewGroup.MarginLayoutParams) ((n) view.getLayoutParams())).rightMargin;
            }
        }

        /* loaded from: classes.dex */
        public class b implements p0.b {
            public b() {
                m.this = r1;
            }

            @Override // androidx.recyclerview.widget.p0.b
            public final int a(View view) {
                m.this.getClass();
                return (view.getTop() - m.L(view)) - ((ViewGroup.MarginLayoutParams) ((n) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.p0.b
            public final int b() {
                return m.this.G();
            }

            @Override // androidx.recyclerview.widget.p0.b
            public final int c() {
                m mVar = m.this;
                return mVar.f2973o - mVar.D();
            }

            @Override // androidx.recyclerview.widget.p0.b
            public final View d(int i10) {
                return m.this.x(i10);
            }

            @Override // androidx.recyclerview.widget.p0.b
            public final int e(View view) {
                m.this.getClass();
                return m.w(view) + view.getBottom() + ((ViewGroup.MarginLayoutParams) ((n) view.getLayoutParams())).bottomMargin;
            }
        }

        /* loaded from: classes.dex */
        public interface c {
        }

        /* loaded from: classes.dex */
        public static class d {

            /* renamed from: a */
            public int f2976a;

            /* renamed from: b */
            public int f2977b;

            /* renamed from: c */
            public boolean f2978c;

            /* renamed from: d */
            public boolean f2979d;
        }

        public m() {
            a aVar = new a();
            b bVar = new b();
            this.f2961c = new p0(aVar);
            this.f2962d = new p0(bVar);
            this.f2964f = false;
            this.f2965g = false;
            this.f2966h = true;
            this.f2967i = true;
        }

        public static int C(View view) {
            return ((n) view.getLayoutParams()).f2981b.left;
        }

        public static int H(View view) {
            return ((n) view.getLayoutParams()).a();
        }

        public static d I(Context context, AttributeSet attributeSet, int i10, int i11) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RecyclerView, i10, i11);
            dVar.f2976a = obtainStyledAttributes.getInt(R.styleable.RecyclerView_android_orientation, 1);
            dVar.f2977b = obtainStyledAttributes.getInt(R.styleable.RecyclerView_spanCount, 1);
            dVar.f2978c = obtainStyledAttributes.getBoolean(R.styleable.RecyclerView_reverseLayout, false);
            dVar.f2979d = obtainStyledAttributes.getBoolean(R.styleable.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public static int J(View view) {
            return ((n) view.getLayoutParams()).f2981b.right;
        }

        public static int L(View view) {
            return ((n) view.getLayoutParams()).f2981b.top;
        }

        public static boolean O(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 <= 0 || i10 == i12) {
                if (mode == Integer.MIN_VALUE) {
                    return size >= i10;
                } else if (mode != 0) {
                    return mode == 1073741824 && size == i10;
                } else {
                    return true;
                }
            }
            return false;
        }

        public static void P(View view, int i10, int i11, int i12, int i13) {
            n nVar = (n) view.getLayoutParams();
            Rect rect = nVar.f2981b;
            view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) nVar).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) nVar).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) nVar).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) nVar).bottomMargin);
        }

        public static int i(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i11, i12) : size : Math.min(size, Math.max(i11, i12));
        }

        public static int w(View view) {
            return ((n) view.getLayoutParams()).f2981b.bottom;
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0017, code lost:
            if (r5 == 1073741824) goto L8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int z(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1a
                if (r7 < 0) goto L11
                goto L1c
            L11:
                if (r7 != r1) goto L2f
                if (r5 == r2) goto L21
                if (r5 == 0) goto L2f
                if (r5 == r3) goto L21
                goto L2f
            L1a:
                if (r7 < 0) goto L1f
            L1c:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L31
            L1f:
                if (r7 != r1) goto L23
            L21:
                r7 = r4
                goto L31
            L23:
                if (r7 != r0) goto L2f
                if (r5 == r2) goto L2c
                if (r5 != r3) goto L2a
                goto L2c
            L2a:
                r5 = 0
                goto L21
            L2c:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L21
            L2f:
                r5 = 0
                r7 = 0
            L31:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m.z(int, int, int, int, boolean):int");
        }

        public int A(t tVar, y yVar) {
            return -1;
        }

        public final boolean A0(View view, int i10, int i11, n nVar) {
            return (this.f2966h && O(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) nVar).width) && O(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) nVar).height)) ? false : true;
        }

        public final int B() {
            RecyclerView recyclerView = this.f2960b;
            WeakHashMap<View, i2> weakHashMap = k1.o0.f18161a;
            return o0.e.d(recyclerView);
        }

        public void B0(RecyclerView recyclerView, int i10) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public final void C0(androidx.recyclerview.widget.x xVar) {
            x xVar2 = this.f2963e;
            if (xVar2 != null && xVar != xVar2 && xVar2.f3004e) {
                xVar2.d();
            }
            this.f2963e = xVar;
            RecyclerView recyclerView = this.f2960b;
            a0 a0Var = recyclerView.f2898q0;
            RecyclerView.this.removeCallbacks(a0Var);
            a0Var.f2920c.abortAnimation();
            if (xVar.f3007h) {
                StringBuilder a10 = android.support.v4.media.d.a("An instance of ");
                a10.append(xVar.getClass().getSimpleName());
                a10.append(" was started more than once. Each instance of");
                a10.append(xVar.getClass().getSimpleName());
                a10.append(" is intended to only be used once. You should create a new instance for each use.");
                Log.w("RecyclerView", a10.toString());
            }
            xVar.f3001b = recyclerView;
            xVar.f3002c = this;
            int i10 = xVar.f3000a;
            if (i10 != -1) {
                recyclerView.f2904t0.f3015a = i10;
                xVar.f3004e = true;
                xVar.f3003d = true;
                xVar.f3005f = recyclerView.f2889m.s(i10);
                xVar.f3001b.f2898q0.a();
                xVar.f3007h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        public final int D() {
            RecyclerView recyclerView = this.f2960b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public boolean D0() {
            return false;
        }

        public final int E() {
            RecyclerView recyclerView = this.f2960b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public final int F() {
            RecyclerView recyclerView = this.f2960b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public final int G() {
            RecyclerView recyclerView = this.f2960b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int K(t tVar, y yVar) {
            return -1;
        }

        public final void M(View view, Rect rect) {
            Matrix matrix;
            Rect rect2 = ((n) view.getLayoutParams()).f2981b;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            if (this.f2960b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f2960b.f2885k;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public boolean N() {
            return false;
        }

        public void Q(int i10) {
            RecyclerView recyclerView = this.f2960b;
            if (recyclerView != null) {
                int e10 = recyclerView.f2873e.e();
                for (int i11 = 0; i11 < e10; i11++) {
                    recyclerView.f2873e.d(i11).offsetLeftAndRight(i10);
                }
            }
        }

        public void R(int i10) {
            RecyclerView recyclerView = this.f2960b;
            if (recyclerView != null) {
                int e10 = recyclerView.f2873e.e();
                for (int i11 = 0; i11 < e10; i11++) {
                    recyclerView.f2873e.d(i11).offsetTopAndBottom(i10);
                }
            }
        }

        public void S() {
        }

        public void T(RecyclerView recyclerView) {
        }

        public View U(View view, int i10, t tVar, y yVar) {
            return null;
        }

        public void V(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f2960b;
            t tVar = recyclerView.f2868b;
            y yVar = recyclerView.f2904t0;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z10 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f2960b.canScrollVertically(-1) && !this.f2960b.canScrollHorizontally(-1) && !this.f2960b.canScrollHorizontally(1)) {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            e eVar = this.f2960b.f2887l;
            if (eVar != null) {
                accessibilityEvent.setItemCount(eVar.e());
            }
        }

        public void W(t tVar, y yVar, l1.j jVar) {
            if (this.f2960b.canScrollVertically(-1) || this.f2960b.canScrollHorizontally(-1)) {
                jVar.a(DfuBaseService.ERROR_REMOTE_MASK);
                jVar.k(true);
            }
            if (this.f2960b.canScrollVertically(1) || this.f2960b.canScrollHorizontally(1)) {
                jVar.a(4096);
                jVar.k(true);
            }
            jVar.f18670a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) j.b.a(K(tVar, yVar), A(tVar, yVar), 0).f18685a);
        }

        public final void X(View view, l1.j jVar) {
            b0 J = RecyclerView.J(view);
            if (J == null || J.k() || this.f2959a.k(J.f2927a)) {
                return;
            }
            RecyclerView recyclerView = this.f2960b;
            Y(recyclerView.f2868b, recyclerView.f2904t0, view, jVar);
        }

        public void Y(t tVar, y yVar, View view, l1.j jVar) {
        }

        public void Z(int i10, int i11) {
        }

        public void a0() {
        }

        public void b0(int i10, int i11) {
        }

        public final void c(View view, int i10, boolean z10) {
            b0 J = RecyclerView.J(view);
            if (!z10 && !J.k()) {
                this.f2960b.f2875f.d(J);
            } else {
                q0 q0Var = this.f2960b.f2875f;
                q0.a orDefault = q0Var.f3209a.getOrDefault(J, null);
                if (orDefault == null) {
                    orDefault = q0.a.a();
                    q0Var.f3209a.put(J, orDefault);
                }
                orDefault.f3212a |= 1;
            }
            n nVar = (n) view.getLayoutParams();
            if (!J.r() && !J.l()) {
                int i11 = -1;
                if (view.getParent() == this.f2960b) {
                    int j10 = this.f2959a.j(view);
                    if (i10 == -1) {
                        i10 = this.f2959a.e();
                    }
                    if (j10 != -1) {
                        if (j10 != i10) {
                            m mVar = this.f2960b.f2889m;
                            View x10 = mVar.x(j10);
                            if (x10 != null) {
                                mVar.x(j10);
                                mVar.f2959a.c(j10);
                                n nVar2 = (n) x10.getLayoutParams();
                                b0 J2 = RecyclerView.J(x10);
                                if (J2.k()) {
                                    q0 q0Var2 = mVar.f2960b.f2875f;
                                    q0.a orDefault2 = q0Var2.f3209a.getOrDefault(J2, null);
                                    if (orDefault2 == null) {
                                        orDefault2 = q0.a.a();
                                        q0Var2.f3209a.put(J2, orDefault2);
                                    }
                                    orDefault2.f3212a = 1 | orDefault2.f3212a;
                                } else {
                                    mVar.f2960b.f2875f.d(J2);
                                }
                                mVar.f2959a.b(x10, i10, nVar2, J2.k());
                            } else {
                                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + j10 + mVar.f2960b.toString());
                            }
                        }
                    } else {
                        StringBuilder a10 = android.support.v4.media.d.a("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                        a10.append(this.f2960b.indexOfChild(view));
                        throw new IllegalStateException(androidx.recyclerview.widget.d.a(this.f2960b, a10));
                    }
                } else {
                    this.f2959a.a(view, i10, false);
                    nVar.f2982c = true;
                    x xVar = this.f2963e;
                    if (xVar != null && xVar.f3004e) {
                        xVar.f3001b.getClass();
                        b0 J3 = RecyclerView.J(view);
                        if (J3 != null) {
                            i11 = J3.e();
                        }
                        if (i11 == xVar.f3000a) {
                            xVar.f3005f = view;
                        }
                    }
                }
            } else {
                if (J.l()) {
                    J.f2940n.j(J);
                } else {
                    J.f2936j &= -33;
                }
                this.f2959a.b(view, i10, view.getLayoutParams(), false);
            }
            if (nVar.f2983d) {
                J.f2927a.invalidate();
                nVar.f2983d = false;
            }
        }

        public void c0(int i10, int i11) {
        }

        public void d(String str) {
            RecyclerView recyclerView = this.f2960b;
            if (recyclerView != null) {
                recyclerView.i(str);
            }
        }

        public void d0(int i10, int i11) {
        }

        public final void e(View view, Rect rect) {
            RecyclerView recyclerView = this.f2960b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.L(view));
            }
        }

        public void e0(t tVar, y yVar) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public boolean f() {
            return false;
        }

        public void f0(y yVar) {
        }

        public boolean g() {
            return false;
        }

        public void g0(Parcelable parcelable) {
        }

        public boolean h(n nVar) {
            return nVar != null;
        }

        public Parcelable h0() {
            return null;
        }

        public void i0(int i10) {
        }

        public void j(int i10, int i11, y yVar, c cVar) {
        }

        /* JADX WARN: Removed duplicated region for block: B:56:0x0068 A[ADDED_TO_REGION] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean j0(androidx.recyclerview.widget.RecyclerView.t r2, androidx.recyclerview.widget.RecyclerView.y r3, int r4, android.os.Bundle r5) {
            /*
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r2 = r1.f2960b
                r3 = 0
                if (r2 != 0) goto L6
                return r3
            L6:
                r5 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r4 == r5) goto L3e
                r5 = 8192(0x2000, float:1.148E-41)
                if (r4 == r5) goto L12
                r2 = 0
            L10:
                r4 = 0
                goto L66
            L12:
                r4 = -1
                boolean r2 = r2.canScrollVertically(r4)
                if (r2 == 0) goto L27
                int r2 = r1.f2973o
                int r5 = r1.G()
                int r2 = r2 - r5
                int r5 = r1.D()
                int r2 = r2 - r5
                int r2 = -r2
                goto L28
            L27:
                r2 = 0
            L28:
                androidx.recyclerview.widget.RecyclerView r5 = r1.f2960b
                boolean r4 = r5.canScrollHorizontally(r4)
                if (r4 == 0) goto L10
                int r4 = r1.f2972n
                int r5 = r1.E()
                int r4 = r4 - r5
                int r5 = r1.F()
                int r4 = r4 - r5
                int r4 = -r4
                goto L66
            L3e:
                boolean r2 = r2.canScrollVertically(r0)
                if (r2 == 0) goto L51
                int r2 = r1.f2973o
                int r4 = r1.G()
                int r2 = r2 - r4
                int r4 = r1.D()
                int r2 = r2 - r4
                goto L52
            L51:
                r2 = 0
            L52:
                androidx.recyclerview.widget.RecyclerView r4 = r1.f2960b
                boolean r4 = r4.canScrollHorizontally(r0)
                if (r4 == 0) goto L10
                int r4 = r1.f2972n
                int r5 = r1.E()
                int r4 = r4 - r5
                int r5 = r1.F()
                int r4 = r4 - r5
            L66:
                if (r2 != 0) goto L6b
                if (r4 != 0) goto L6b
                return r3
            L6b:
                androidx.recyclerview.widget.RecyclerView r3 = r1.f2960b
                r3.e0(r4, r2, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m.j0(androidx.recyclerview.widget.RecyclerView$t, androidx.recyclerview.widget.RecyclerView$y, int, android.os.Bundle):boolean");
        }

        public void k(int i10, c cVar) {
        }

        public final void k0(t tVar) {
            int y10 = y();
            while (true) {
                y10--;
                if (y10 < 0) {
                    return;
                }
                if (!RecyclerView.J(x(y10)).q()) {
                    View x10 = x(y10);
                    n0(y10);
                    tVar.f(x10);
                }
            }
        }

        public int l(y yVar) {
            return 0;
        }

        public final void l0(t tVar) {
            int size = tVar.f2990a.size();
            for (int i10 = size - 1; i10 >= 0; i10--) {
                View view = tVar.f2990a.get(i10).f2927a;
                b0 J = RecyclerView.J(view);
                if (!J.q()) {
                    J.p(false);
                    if (J.m()) {
                        this.f2960b.removeDetachedView(view, false);
                    }
                    j jVar = this.f2960b.W;
                    if (jVar != null) {
                        jVar.e(J);
                    }
                    J.p(true);
                    b0 J2 = RecyclerView.J(view);
                    J2.f2940n = null;
                    J2.f2941o = false;
                    J2.f2936j &= -33;
                    tVar.g(J2);
                }
            }
            tVar.f2990a.clear();
            ArrayList<b0> arrayList = tVar.f2991b;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (size > 0) {
                this.f2960b.invalidate();
            }
        }

        public int m(y yVar) {
            return 0;
        }

        public final void m0(View view, t tVar) {
            androidx.recyclerview.widget.e eVar = this.f2959a;
            int indexOfChild = ((g0) eVar.f3092a).f3112a.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (eVar.f3093b.f(indexOfChild)) {
                    eVar.l(view);
                }
                ((g0) eVar.f3092a).b(indexOfChild);
            }
            tVar.f(view);
        }

        public int n(y yVar) {
            return 0;
        }

        public final void n0(int i10) {
            androidx.recyclerview.widget.e eVar;
            int f10;
            View childAt;
            if (x(i10) != null && (childAt = ((g0) eVar.f3092a).f3112a.getChildAt((f10 = (eVar = this.f2959a).f(i10)))) != null) {
                if (eVar.f3093b.f(f10)) {
                    eVar.l(childAt);
                }
                ((g0) eVar.f3092a).b(f10);
            }
        }

        public int o(y yVar) {
            return 0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:67:0x00a9, code lost:
            if (r10 == false) goto L20;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean o0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
            /*
                r8 = this;
                int r0 = r8.E()
                int r1 = r8.G()
                int r2 = r8.f2972n
                int r3 = r8.F()
                int r2 = r2 - r3
                int r3 = r8.f2973o
                int r4 = r8.D()
                int r3 = r3 - r4
                int r4 = r10.getLeft()
                int r5 = r11.left
                int r4 = r4 + r5
                int r5 = r10.getScrollX()
                int r4 = r4 - r5
                int r5 = r10.getTop()
                int r6 = r11.top
                int r5 = r5 + r6
                int r10 = r10.getScrollY()
                int r5 = r5 - r10
                int r10 = r11.width()
                int r10 = r10 + r4
                int r11 = r11.height()
                int r11 = r11 + r5
                int r4 = r4 - r0
                r0 = 0
                int r6 = java.lang.Math.min(r0, r4)
                int r5 = r5 - r1
                int r1 = java.lang.Math.min(r0, r5)
                int r10 = r10 - r2
                int r2 = java.lang.Math.max(r0, r10)
                int r11 = r11 - r3
                int r11 = java.lang.Math.max(r0, r11)
                int r3 = r8.B()
                r7 = 1
                if (r3 != r7) goto L5c
                if (r2 == 0) goto L57
                goto L64
            L57:
                int r2 = java.lang.Math.max(r6, r10)
                goto L64
            L5c:
                if (r6 == 0) goto L5f
                goto L63
            L5f:
                int r6 = java.lang.Math.min(r4, r2)
            L63:
                r2 = r6
            L64:
                if (r1 == 0) goto L67
                goto L6b
            L67:
                int r1 = java.lang.Math.min(r5, r11)
            L6b:
                if (r13 == 0) goto Lab
                android.view.View r10 = r9.getFocusedChild()
                if (r10 != 0) goto L74
                goto La8
            L74:
                int r11 = r8.E()
                int r13 = r8.G()
                int r3 = r8.f2972n
                int r4 = r8.F()
                int r3 = r3 - r4
                int r4 = r8.f2973o
                int r5 = r8.D()
                int r4 = r4 - r5
                androidx.recyclerview.widget.RecyclerView r5 = r8.f2960b
                android.graphics.Rect r5 = r5.f2881i
                androidx.recyclerview.widget.RecyclerView.K(r10, r5)
                int r10 = r5.left
                int r10 = r10 - r2
                if (r10 >= r3) goto La8
                int r10 = r5.right
                int r10 = r10 - r2
                if (r10 <= r11) goto La8
                int r10 = r5.top
                int r10 = r10 - r1
                if (r10 >= r4) goto La8
                int r10 = r5.bottom
                int r10 = r10 - r1
                if (r10 > r13) goto La6
                goto La8
            La6:
                r10 = 1
                goto La9
            La8:
                r10 = 0
            La9:
                if (r10 == 0) goto Lb0
            Lab:
                if (r2 != 0) goto Lb1
                if (r1 == 0) goto Lb0
                goto Lb1
            Lb0:
                return r0
            Lb1:
                if (r12 == 0) goto Lb7
                r9.scrollBy(r2, r1)
                goto Lba
            Lb7:
                r9.e0(r2, r1, r0)
            Lba:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m.o0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
        }

        public int p(y yVar) {
            return 0;
        }

        public final void p0() {
            RecyclerView recyclerView = this.f2960b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int q(y yVar) {
            return 0;
        }

        public int q0(int i10, t tVar, y yVar) {
            return 0;
        }

        public final void r(t tVar) {
            int y10 = y();
            while (true) {
                y10--;
                if (y10 >= 0) {
                    View x10 = x(y10);
                    b0 J = RecyclerView.J(x10);
                    if (!J.q()) {
                        if (J.i() && !J.k() && !this.f2960b.f2887l.f2948b) {
                            n0(y10);
                            tVar.g(J);
                        } else {
                            x(y10);
                            this.f2959a.c(y10);
                            tVar.h(x10);
                            this.f2960b.f2875f.d(J);
                        }
                    }
                } else {
                    return;
                }
            }
        }

        public void r0(int i10) {
        }

        public View s(int i10) {
            int y10 = y();
            for (int i11 = 0; i11 < y10; i11++) {
                View x10 = x(i11);
                b0 J = RecyclerView.J(x10);
                if (J != null && J.e() == i10 && !J.q() && (this.f2960b.f2904t0.f3021g || !J.k())) {
                    return x10;
                }
            }
            return null;
        }

        public int s0(int i10, t tVar, y yVar) {
            return 0;
        }

        public abstract n t();

        public final void t0(RecyclerView recyclerView) {
            u0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public n u(Context context, AttributeSet attributeSet) {
            return new n(context, attributeSet);
        }

        public final void u0(int i10, int i11) {
            this.f2972n = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.f2970l = mode;
            if (mode == 0 && !RecyclerView.N0) {
                this.f2972n = 0;
            }
            this.f2973o = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f2971m = mode2;
            if (mode2 != 0 || RecyclerView.N0) {
                return;
            }
            this.f2973o = 0;
        }

        public n v(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof n ? new n((n) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new n((ViewGroup.MarginLayoutParams) layoutParams) : new n(layoutParams);
        }

        public void v0(Rect rect, int i10, int i11) {
            int F = F() + E() + rect.width();
            int D = D() + G() + rect.height();
            RecyclerView recyclerView = this.f2960b;
            WeakHashMap<View, i2> weakHashMap = k1.o0.f18161a;
            this.f2960b.setMeasuredDimension(i(i10, F, o0.d.e(recyclerView)), i(i11, D, o0.d.d(this.f2960b)));
        }

        public final void w0(int i10, int i11) {
            int y10 = y();
            if (y10 == 0) {
                this.f2960b.n(i10, i11);
                return;
            }
            int i12 = Integer.MAX_VALUE;
            int i13 = Integer.MAX_VALUE;
            int i14 = Integer.MIN_VALUE;
            int i15 = Integer.MIN_VALUE;
            for (int i16 = 0; i16 < y10; i16++) {
                View x10 = x(i16);
                Rect rect = this.f2960b.f2881i;
                RecyclerView.K(x10, rect);
                int i17 = rect.left;
                if (i17 < i12) {
                    i12 = i17;
                }
                int i18 = rect.right;
                if (i18 > i14) {
                    i14 = i18;
                }
                int i19 = rect.top;
                if (i19 < i13) {
                    i13 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i15) {
                    i15 = i20;
                }
            }
            this.f2960b.f2881i.set(i12, i13, i14, i15);
            v0(this.f2960b.f2881i, i10, i11);
        }

        public final View x(int i10) {
            androidx.recyclerview.widget.e eVar = this.f2959a;
            if (eVar != null) {
                return eVar.d(i10);
            }
            return null;
        }

        public final void x0(RecyclerView recyclerView) {
            int height;
            if (recyclerView == null) {
                this.f2960b = null;
                this.f2959a = null;
                height = 0;
                this.f2972n = 0;
            } else {
                this.f2960b = recyclerView;
                this.f2959a = recyclerView.f2873e;
                this.f2972n = recyclerView.getWidth();
                height = recyclerView.getHeight();
            }
            this.f2973o = height;
            this.f2970l = 1073741824;
            this.f2971m = 1073741824;
        }

        public final int y() {
            androidx.recyclerview.widget.e eVar = this.f2959a;
            if (eVar != null) {
                return eVar.e();
            }
            return 0;
        }

        public final boolean y0(View view, int i10, int i11, n nVar) {
            return (!view.isLayoutRequested() && this.f2966h && O(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) nVar).width) && O(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) nVar).height)) ? false : true;
        }

        public boolean z0() {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class n extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public b0 f2980a;

        /* renamed from: b */
        public final Rect f2981b;

        /* renamed from: c */
        public boolean f2982c;

        /* renamed from: d */
        public boolean f2983d;

        public n(int i10, int i11) {
            super(i10, i11);
            this.f2981b = new Rect();
            this.f2982c = true;
            this.f2983d = false;
        }

        public n(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2981b = new Rect();
            this.f2982c = true;
            this.f2983d = false;
        }

        public n(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2981b = new Rect();
            this.f2982c = true;
            this.f2983d = false;
        }

        public n(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2981b = new Rect();
            this.f2982c = true;
            this.f2983d = false;
        }

        public n(n nVar) {
            super((ViewGroup.LayoutParams) nVar);
            this.f2981b = new Rect();
            this.f2982c = true;
            this.f2983d = false;
        }

        public final int a() {
            return this.f2980a.e();
        }

        public final boolean b() {
            return (this.f2980a.f2936j & 2) != 0;
        }

        public final boolean c() {
            return this.f2980a.k();
        }
    }

    /* loaded from: classes.dex */
    public interface o {
        void b(View view);

        void d(View view);
    }

    /* loaded from: classes.dex */
    public static abstract class p {
    }

    /* loaded from: classes.dex */
    public interface q {
        void a(MotionEvent motionEvent);

        boolean c(RecyclerView recyclerView, MotionEvent motionEvent);

        void e(boolean z10);
    }

    /* loaded from: classes.dex */
    public static abstract class r {
        public void a(int i10, RecyclerView recyclerView) {
        }

        public void b(RecyclerView recyclerView, int i10, int i11) {
        }
    }

    /* loaded from: classes.dex */
    public static class s {

        /* renamed from: a */
        public SparseArray<a> f2984a = new SparseArray<>();

        /* renamed from: b */
        public int f2985b = 0;

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a */
            public final ArrayList<b0> f2986a = new ArrayList<>();

            /* renamed from: b */
            public int f2987b = 5;

            /* renamed from: c */
            public long f2988c = 0;

            /* renamed from: d */
            public long f2989d = 0;
        }

        public final a a(int i10) {
            a aVar = this.f2984a.get(i10);
            if (aVar == null) {
                a aVar2 = new a();
                this.f2984a.put(i10, aVar2);
                return aVar2;
            }
            return aVar;
        }
    }

    /* loaded from: classes.dex */
    public final class t {

        /* renamed from: a */
        public final ArrayList<b0> f2990a;

        /* renamed from: b */
        public ArrayList<b0> f2991b;

        /* renamed from: c */
        public final ArrayList<b0> f2992c;

        /* renamed from: d */
        public final List<b0> f2993d;

        /* renamed from: e */
        public int f2994e;

        /* renamed from: f */
        public int f2995f;

        /* renamed from: g */
        public s f2996g;

        public t() {
            RecyclerView.this = r2;
            ArrayList<b0> arrayList = new ArrayList<>();
            this.f2990a = arrayList;
            this.f2991b = null;
            this.f2992c = new ArrayList<>();
            this.f2993d = Collections.unmodifiableList(arrayList);
            this.f2994e = 2;
            this.f2995f = 2;
        }

        public final void a(b0 b0Var, boolean z10) {
            k1.a aVar;
            RecyclerView.j(b0Var);
            View view = b0Var.f2927a;
            i0 i0Var = RecyclerView.this.A0;
            if (i0Var != null) {
                i0.a aVar2 = i0Var.f3119e;
                if (aVar2 instanceof i0.a) {
                    aVar = (k1.a) aVar2.f3121e.remove(view);
                } else {
                    aVar = null;
                }
                k1.o0.p(view, aVar);
            }
            if (z10) {
                u uVar = RecyclerView.this.f2891n;
                if (uVar != null) {
                    uVar.a();
                }
                int size = RecyclerView.this.f2893o.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((u) RecyclerView.this.f2893o.get(i10)).a();
                }
                e eVar = RecyclerView.this.f2887l;
                if (eVar != null) {
                    eVar.t(b0Var);
                }
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f2904t0 != null) {
                    recyclerView.f2875f.e(b0Var);
                }
            }
            b0Var.f2945s = null;
            b0Var.f2944r = null;
            s c10 = c();
            c10.getClass();
            int i11 = b0Var.f2932f;
            ArrayList<b0> arrayList = c10.a(i11).f2986a;
            if (c10.f2984a.get(i11).f2987b > arrayList.size()) {
                b0Var.o();
                arrayList.add(b0Var);
            }
        }

        public final int b(int i10) {
            if (i10 >= 0 && i10 < RecyclerView.this.f2904t0.b()) {
                RecyclerView recyclerView = RecyclerView.this;
                if (!recyclerView.f2904t0.f3021g) {
                    return i10;
                }
                return recyclerView.f2871d.f(i10, 0);
            }
            StringBuilder a10 = e2.a("invalid position ", i10, ". State item count is ");
            a10.append(RecyclerView.this.f2904t0.b());
            throw new IndexOutOfBoundsException(androidx.recyclerview.widget.d.a(RecyclerView.this, a10));
        }

        public final s c() {
            if (this.f2996g == null) {
                this.f2996g = new s();
            }
            return this.f2996g;
        }

        public final void d() {
            for (int size = this.f2992c.size() - 1; size >= 0; size--) {
                e(size);
            }
            this.f2992c.clear();
            if (RecyclerView.P0) {
                s.b bVar = RecyclerView.this.f2902s0;
                int[] iArr = bVar.f3260c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                bVar.f3261d = 0;
            }
        }

        public final void e(int i10) {
            a(this.f2992c.get(i10), true);
            this.f2992c.remove(i10);
        }

        public final void f(View view) {
            b0 J = RecyclerView.J(view);
            if (J.m()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (J.l()) {
                J.f2940n.j(J);
            } else if (J.r()) {
                J.f2936j &= -33;
            }
            g(J);
            if (RecyclerView.this.W != null && !J.j()) {
                RecyclerView.this.W.e(J);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:130:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:168:0x00c9  */
        /* JADX WARN: Removed duplicated region for block: B:169:0x00cd  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void g(androidx.recyclerview.widget.RecyclerView.b0 r9) {
            /*
                Method dump skipped, instructions count: 314
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.t.g(androidx.recyclerview.widget.RecyclerView$b0):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:78:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0049  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void h(android.view.View r5) {
            /*
                r4 = this;
                androidx.recyclerview.widget.RecyclerView$b0 r5 = androidx.recyclerview.widget.RecyclerView.J(r5)
                int r0 = r5.f2936j
                r1 = r0 & 12
                r2 = 1
                r3 = 0
                if (r1 == 0) goto Le
                r1 = 1
                goto Lf
            Le:
                r1 = 0
            Lf:
                if (r1 != 0) goto L5b
                r0 = r0 & 2
                if (r0 == 0) goto L17
                r0 = 1
                goto L18
            L17:
                r0 = 0
            L18:
                if (r0 == 0) goto L5b
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$j r0 = r0.W
                if (r0 == 0) goto L45
                java.util.List r1 = r5.f()
                androidx.recyclerview.widget.p r0 = (androidx.recyclerview.widget.p) r0
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L3f
                boolean r0 = r0.f3128g
                if (r0 == 0) goto L39
                boolean r0 = r5.i()
                if (r0 == 0) goto L37
                goto L39
            L37:
                r0 = 0
                goto L3a
            L39:
                r0 = 1
            L3a:
                if (r0 == 0) goto L3d
                goto L3f
            L3d:
                r0 = 0
                goto L40
            L3f:
                r0 = 1
            L40:
                if (r0 == 0) goto L43
                goto L45
            L43:
                r0 = 0
                goto L46
            L45:
                r0 = 1
            L46:
                if (r0 == 0) goto L49
                goto L5b
            L49:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r0 = r4.f2991b
                if (r0 != 0) goto L54
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r4.f2991b = r0
            L54:
                r5.f2940n = r4
                r5.f2941o = r2
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r0 = r4.f2991b
                goto L88
            L5b:
                boolean r0 = r5.i()
                if (r0 == 0) goto L82
                boolean r0 = r5.k()
                if (r0 != 0) goto L82
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r0 = r0.f2887l
                boolean r0 = r0.f2948b
                if (r0 == 0) goto L70
                goto L82
            L70:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."
                java.lang.StringBuilder r0 = android.support.v4.media.d.a(r0)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = androidx.recyclerview.widget.d.a(r1, r0)
                r5.<init>(r0)
                throw r5
            L82:
                r5.f2940n = r4
                r5.f2941o = r3
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r0 = r4.f2990a
            L88:
                r0.add(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.t.h(android.view.View):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:569:0x044f, code lost:
            if (r7.i() == false) goto L231;
         */
        /* JADX WARN: Code restructure failed: missing block: B:579:0x0485, code lost:
            if (r5 == false) goto L231;
         */
        /* JADX WARN: Removed duplicated region for block: B:373:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:378:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:461:0x0247  */
        /* JADX WARN: Removed duplicated region for block: B:546:0x03f3  */
        /* JADX WARN: Removed duplicated region for block: B:563:0x0440  */
        /* JADX WARN: Removed duplicated region for block: B:572:0x046e  */
        /* JADX WARN: Removed duplicated region for block: B:584:0x04aa  */
        /* JADX WARN: Removed duplicated region for block: B:592:0x04c6  */
        /* JADX WARN: Removed duplicated region for block: B:613:0x0509  */
        /* JADX WARN: Removed duplicated region for block: B:616:0x0512  */
        /* JADX WARN: Removed duplicated region for block: B:620:0x051d  */
        /* JADX WARN: Removed duplicated region for block: B:621:0x0524  */
        /* JADX WARN: Removed duplicated region for block: B:628:0x0540 A[ADDED_TO_REGION] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final androidx.recyclerview.widget.RecyclerView.b0 i(int r18, long r19) {
            /*
                Method dump skipped, instructions count: 1384
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.t.i(int, long):androidx.recyclerview.widget.RecyclerView$b0");
        }

        public final void j(b0 b0Var) {
            (b0Var.f2941o ? this.f2991b : this.f2990a).remove(b0Var);
            b0Var.f2940n = null;
            b0Var.f2941o = false;
            b0Var.f2936j &= -33;
        }

        public final void k() {
            m mVar = RecyclerView.this.f2889m;
            this.f2995f = this.f2994e + (mVar != null ? mVar.f2968j : 0);
            for (int size = this.f2992c.size() - 1; size >= 0 && this.f2992c.size() > this.f2995f; size--) {
                e(size);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface u {
        void a();
    }

    /* loaded from: classes.dex */
    public class v extends g {
        public v() {
            RecyclerView.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void a() {
            RecyclerView.this.i(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f2904t0.f3020f = true;
            recyclerView.V(true);
            if (RecyclerView.this.f2871d.g()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0026, code lost:
            if (r0.f3073b.size() == 1) goto L5;
         */
        @Override // androidx.recyclerview.widget.RecyclerView.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void c(int r5, int r6, java.lang.Object r7) {
            /*
                r4 = this;
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                r1 = 0
                r0.i(r1)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.f2871d
                r1 = 1
                if (r6 >= r1) goto L11
                r0.getClass()
                goto L29
            L11:
                java.util.ArrayList<androidx.recyclerview.widget.a$b> r2 = r0.f3073b
                r3 = 4
                androidx.recyclerview.widget.a$b r5 = r0.h(r7, r3, r5, r6)
                r2.add(r5)
                int r5 = r0.f3077f
                r5 = r5 | r3
                r0.f3077f = r5
                java.util.ArrayList<androidx.recyclerview.widget.a$b> r5 = r0.f3073b
                int r5 = r5.size()
                if (r5 != r1) goto L29
                goto L2a
            L29:
                r1 = 0
            L2a:
                if (r1 == 0) goto L2f
                r4.h()
            L2f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v.c(int, int, java.lang.Object):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0025, code lost:
            if (r0.f3073b.size() == 1) goto L5;
         */
        @Override // androidx.recyclerview.widget.RecyclerView.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void d(int r5, int r6) {
            /*
                r4 = this;
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                r1 = 0
                r0.i(r1)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.f2871d
                r2 = 1
                if (r6 >= r2) goto L11
                r0.getClass()
                goto L28
            L11:
                java.util.ArrayList<androidx.recyclerview.widget.a$b> r3 = r0.f3073b
                androidx.recyclerview.widget.a$b r5 = r0.h(r1, r2, r5, r6)
                r3.add(r5)
                int r5 = r0.f3077f
                r5 = r5 | r2
                r0.f3077f = r5
                java.util.ArrayList<androidx.recyclerview.widget.a$b> r5 = r0.f3073b
                int r5 = r5.size()
                if (r5 != r2) goto L28
                goto L29
            L28:
                r2 = 0
            L29:
                if (r2 == 0) goto L2e
                r4.h()
            L2e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v.d(int, int):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
            if (r0.f3073b.size() == 1) goto L5;
         */
        @Override // androidx.recyclerview.widget.RecyclerView.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void e(int r6, int r7) {
            /*
                r5 = this;
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                r1 = 0
                r0.i(r1)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.f2871d
                r0.getClass()
                r2 = 1
                if (r6 != r7) goto L11
                goto L2a
            L11:
                java.util.ArrayList<androidx.recyclerview.widget.a$b> r3 = r0.f3073b
                r4 = 8
                androidx.recyclerview.widget.a$b r6 = r0.h(r1, r4, r6, r7)
                r3.add(r6)
                int r6 = r0.f3077f
                r6 = r6 | r4
                r0.f3077f = r6
                java.util.ArrayList<androidx.recyclerview.widget.a$b> r6 = r0.f3073b
                int r6 = r6.size()
                if (r6 != r2) goto L2a
                goto L2b
            L2a:
                r2 = 0
            L2b:
                if (r2 == 0) goto L30
                r5.h()
            L30:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v.e(int, int):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0026, code lost:
            if (r0.f3073b.size() == 1) goto L5;
         */
        @Override // androidx.recyclerview.widget.RecyclerView.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void f(int r6, int r7) {
            /*
                r5 = this;
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                r1 = 0
                r0.i(r1)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.f2871d
                r2 = 1
                if (r7 >= r2) goto L11
                r0.getClass()
                goto L29
            L11:
                java.util.ArrayList<androidx.recyclerview.widget.a$b> r3 = r0.f3073b
                r4 = 2
                androidx.recyclerview.widget.a$b r6 = r0.h(r1, r4, r6, r7)
                r3.add(r6)
                int r6 = r0.f3077f
                r6 = r6 | r4
                r0.f3077f = r6
                java.util.ArrayList<androidx.recyclerview.widget.a$b> r6 = r0.f3073b
                int r6 = r6.size()
                if (r6 != r2) goto L29
                goto L2a
            L29:
                r2 = 0
            L2a:
                if (r2 == 0) goto L2f
                r5.h()
            L2f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v.f(int, int):void");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void g() {
            e eVar;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f2869c != null && (eVar = recyclerView.f2887l) != null) {
                int b10 = s.c0.b(eVar.f2949c);
                boolean z10 = true;
                if (b10 == 1 ? eVar.e() <= 0 : b10 == 2) {
                    z10 = false;
                }
                if (z10) {
                    RecyclerView.this.requestLayout();
                }
            }
        }

        public final void h() {
            if (RecyclerView.O0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f2903t && recyclerView.f2901s) {
                    a aVar = recyclerView.f2879h;
                    WeakHashMap<View, i2> weakHashMap = k1.o0.f18161a;
                    o0.d.m(recyclerView, aVar);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.A = true;
            recyclerView2.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public static class w extends q1.a {
        public static final Parcelable.Creator<w> CREATOR = new a();

        /* renamed from: c */
        public Parcelable f2999c;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<w> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new w(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new w[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final w createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new w(parcel, classLoader);
            }
        }

        public w(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2999c = parcel.readParcelable(classLoader == null ? m.class.getClassLoader() : classLoader);
        }

        public w(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // q1.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f24504a, i10);
            parcel.writeParcelable(this.f2999c, 0);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class x {

        /* renamed from: b */
        public RecyclerView f3001b;

        /* renamed from: c */
        public m f3002c;

        /* renamed from: d */
        public boolean f3003d;

        /* renamed from: e */
        public boolean f3004e;

        /* renamed from: f */
        public View f3005f;

        /* renamed from: h */
        public boolean f3007h;

        /* renamed from: a */
        public int f3000a = -1;

        /* renamed from: g */
        public final a f3006g = new a();

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: d */
            public int f3011d = -1;

            /* renamed from: f */
            public boolean f3013f = false;

            /* renamed from: g */
            public int f3014g = 0;

            /* renamed from: a */
            public int f3008a = 0;

            /* renamed from: b */
            public int f3009b = 0;

            /* renamed from: c */
            public int f3010c = Integer.MIN_VALUE;

            /* renamed from: e */
            public Interpolator f3012e = null;

            public final void a(RecyclerView recyclerView) {
                int i10 = this.f3011d;
                if (i10 >= 0) {
                    this.f3011d = -1;
                    recyclerView.N(i10);
                    this.f3013f = false;
                } else if (this.f3013f) {
                    Interpolator interpolator = this.f3012e;
                    if (interpolator != null && this.f3010c < 1) {
                        throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                    }
                    int i11 = this.f3010c;
                    if (i11 >= 1) {
                        recyclerView.f2898q0.b(this.f3008a, this.f3009b, i11, interpolator);
                        int i12 = this.f3014g + 1;
                        this.f3014g = i12;
                        if (i12 > 10) {
                            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                        }
                        this.f3013f = false;
                        return;
                    }
                    throw new IllegalStateException("Scroll duration must be a positive number");
                } else {
                    this.f3014g = 0;
                }
            }
        }

        /* loaded from: classes.dex */
        public interface b {
            PointF a(int i10);
        }

        public final PointF a(int i10) {
            m mVar = this.f3002c;
            if (mVar instanceof b) {
                return ((b) mVar).a(i10);
            }
            StringBuilder a10 = android.support.v4.media.d.a("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            a10.append(b.class.getCanonicalName());
            Log.w("RecyclerView", a10.toString());
            return null;
        }

        public final void b(int i10, int i11) {
            PointF a10;
            RecyclerView recyclerView = this.f3001b;
            int i12 = -1;
            if (this.f3000a == -1 || recyclerView == null) {
                d();
            }
            if (this.f3003d && this.f3005f == null && this.f3002c != null && (a10 = a(this.f3000a)) != null) {
                float f10 = a10.x;
                if (f10 != 0.0f || a10.y != 0.0f) {
                    recyclerView.c0((int) Math.signum(f10), (int) Math.signum(a10.y), null);
                }
            }
            boolean z10 = false;
            this.f3003d = false;
            View view = this.f3005f;
            if (view != null) {
                this.f3001b.getClass();
                b0 J = RecyclerView.J(view);
                if (J != null) {
                    i12 = J.e();
                }
                if (i12 == this.f3000a) {
                    View view2 = this.f3005f;
                    y yVar = recyclerView.f2904t0;
                    c(view2, this.f3006g);
                    this.f3006g.a(recyclerView);
                    d();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f3005f = null;
                }
            }
            if (this.f3004e) {
                y yVar2 = recyclerView.f2904t0;
                a aVar = this.f3006g;
                androidx.recyclerview.widget.x xVar = (androidx.recyclerview.widget.x) this;
                if (xVar.f3001b.f2889m.y() == 0) {
                    xVar.d();
                } else {
                    int i13 = xVar.f3334o;
                    int i14 = i13 - i10;
                    if (i13 * i14 <= 0) {
                        i14 = 0;
                    }
                    xVar.f3334o = i14;
                    int i15 = xVar.f3335p;
                    int i16 = i15 - i11;
                    if (i15 * i16 <= 0) {
                        i16 = 0;
                    }
                    xVar.f3335p = i16;
                    if (i14 == 0 && i16 == 0) {
                        PointF a11 = xVar.a(xVar.f3000a);
                        if (a11 != null) {
                            float f11 = a11.x;
                            if (f11 != 0.0f || a11.y != 0.0f) {
                                float f12 = a11.y;
                                float sqrt = (float) Math.sqrt((f12 * f12) + (f11 * f11));
                                float f13 = a11.x / sqrt;
                                a11.x = f13;
                                float f14 = a11.y / sqrt;
                                a11.y = f14;
                                xVar.f3330k = a11;
                                xVar.f3334o = (int) (f13 * 10000.0f);
                                xVar.f3335p = (int) (f14 * 10000.0f);
                                int g10 = xVar.g(10000);
                                LinearInterpolator linearInterpolator = xVar.f3328i;
                                aVar.f3008a = (int) (xVar.f3334o * 1.2f);
                                aVar.f3009b = (int) (xVar.f3335p * 1.2f);
                                aVar.f3010c = (int) (g10 * 1.2f);
                                aVar.f3012e = linearInterpolator;
                                aVar.f3013f = true;
                            }
                        }
                        aVar.f3011d = xVar.f3000a;
                        xVar.d();
                    }
                }
                a aVar2 = this.f3006g;
                if (aVar2.f3011d >= 0) {
                    z10 = true;
                }
                aVar2.a(recyclerView);
                if (z10 && this.f3004e) {
                    this.f3003d = true;
                    recyclerView.f2898q0.a();
                }
            }
        }

        public abstract void c(View view, a aVar);

        public final void d() {
            if (!this.f3004e) {
                return;
            }
            this.f3004e = false;
            androidx.recyclerview.widget.x xVar = (androidx.recyclerview.widget.x) this;
            xVar.f3335p = 0;
            xVar.f3334o = 0;
            xVar.f3330k = null;
            this.f3001b.f2904t0.f3015a = -1;
            this.f3005f = null;
            this.f3000a = -1;
            this.f3003d = false;
            m mVar = this.f3002c;
            if (mVar.f2963e == this) {
                mVar.f2963e = null;
            }
            this.f3002c = null;
            this.f3001b = null;
        }
    }

    /* loaded from: classes.dex */
    public static class y {

        /* renamed from: a */
        public int f3015a = -1;

        /* renamed from: b */
        public int f3016b = 0;

        /* renamed from: c */
        public int f3017c = 0;

        /* renamed from: d */
        public int f3018d = 1;

        /* renamed from: e */
        public int f3019e = 0;

        /* renamed from: f */
        public boolean f3020f = false;

        /* renamed from: g */
        public boolean f3021g = false;

        /* renamed from: h */
        public boolean f3022h = false;

        /* renamed from: i */
        public boolean f3023i = false;

        /* renamed from: j */
        public boolean f3024j = false;

        /* renamed from: k */
        public boolean f3025k = false;

        /* renamed from: l */
        public int f3026l;

        /* renamed from: m */
        public long f3027m;

        /* renamed from: n */
        public int f3028n;

        public final void a(int i10) {
            if ((this.f3018d & i10) != 0) {
                return;
            }
            StringBuilder a10 = android.support.v4.media.d.a("Layout state should be one of ");
            a10.append(Integer.toBinaryString(i10));
            a10.append(" but it is ");
            a10.append(Integer.toBinaryString(this.f3018d));
            throw new IllegalStateException(a10.toString());
        }

        public final int b() {
            return this.f3021g ? this.f3016b - this.f3017c : this.f3019e;
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("State{mTargetPosition=");
            a10.append(this.f3015a);
            a10.append(", mData=");
            a10.append((Object) null);
            a10.append(", mItemCount=");
            a10.append(this.f3019e);
            a10.append(", mIsMeasuring=");
            a10.append(this.f3023i);
            a10.append(", mPreviousLayoutItemCount=");
            a10.append(this.f3016b);
            a10.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            a10.append(this.f3017c);
            a10.append(", mStructureChanged=");
            a10.append(this.f3020f);
            a10.append(", mInPreLayout=");
            a10.append(this.f3021g);
            a10.append(", mRunSimpleAnimations=");
            a10.append(this.f3024j);
            a10.append(", mRunPredictiveAnimations=");
            return l2.o0.a(a10, this.f3025k, '}');
        }
    }

    /* loaded from: classes.dex */
    public static abstract class z {
    }

    static {
        N0 = Build.VERSION.SDK_INT >= 23;
        O0 = true;
        P0 = true;
        Class<?> cls = Integer.TYPE;
        Q0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        R0 = new c();
    }

    public RecyclerView() {
        throw null;
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:38|(1:40)(10:78|(1:80)|42|43|44|(1:46)(1:62)|47|48|49|50)|41|42|43|44|(0)(0)|47|48|49|50) */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x027f, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0281, code lost:
        r0 = r3.getConstructor(new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0287, code lost:
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0297, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0298, code lost:
        r0.initCause(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02b8, code lost:
        throw new java.lang.IllegalStateException(r22.getPositionDescription() + ": Error creating LayoutManager " + r2, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:149:0x024d A[Catch: ClassCastException -> 0x02b9, IllegalAccessException -> 0x02d8, InstantiationException -> 0x02f7, InvocationTargetException -> 0x0314, ClassNotFoundException -> 0x0331, TryCatch #4 {ClassCastException -> 0x02b9, ClassNotFoundException -> 0x0331, IllegalAccessException -> 0x02d8, InstantiationException -> 0x02f7, InvocationTargetException -> 0x0314, blocks: (B:147:0x0247, B:149:0x024d, B:151:0x025a, B:152:0x0264, B:158:0x0289, B:156:0x0281, B:160:0x0298, B:161:0x02b8, B:150:0x0256), top: B:183:0x0247 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0256 A[Catch: ClassCastException -> 0x02b9, IllegalAccessException -> 0x02d8, InstantiationException -> 0x02f7, InvocationTargetException -> 0x0314, ClassNotFoundException -> 0x0331, TryCatch #4 {ClassCastException -> 0x02b9, ClassNotFoundException -> 0x0331, IllegalAccessException -> 0x02d8, InstantiationException -> 0x02f7, InvocationTargetException -> 0x0314, blocks: (B:147:0x0247, B:149:0x024d, B:151:0x025a, B:152:0x0264, B:158:0x0289, B:156:0x0281, B:160:0x0298, B:161:0x02b8, B:150:0x0256), top: B:183:0x0247 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public RecyclerView(android.content.Context r21, android.util.AttributeSet r22, int r23) {
        /*
            Method dump skipped, instructions count: 877
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static RecyclerView E(View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                RecyclerView E = E(viewGroup.getChildAt(i10));
                if (E != null) {
                    return E;
                }
            }
            return null;
        }
        return null;
    }

    public static b0 J(View view) {
        if (view == null) {
            return null;
        }
        return ((n) view.getLayoutParams()).f2980a;
    }

    public static void K(View view, Rect rect) {
        n nVar = (n) view.getLayoutParams();
        Rect rect2 = nVar.f2981b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) nVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) nVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) nVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin);
    }

    private k1.a0 getScrollingChildHelper() {
        if (this.C0 == null) {
            this.C0 = new k1.a0(this);
        }
        return this.C0;
    }

    public static void j(b0 b0Var) {
        WeakReference<RecyclerView> weakReference = b0Var.f2928b;
        if (weakReference != null) {
            ViewParent viewParent = weakReference.get();
            while (true) {
                for (View view = (View) viewParent; view != null; view = null) {
                    if (view == b0Var.f2927a) {
                        return;
                    }
                    viewParent = view.getParent();
                    if (viewParent instanceof View) {
                        break;
                    }
                }
                b0Var.f2928b = null;
                return;
            }
        }
    }

    public final void A(y yVar) {
        if (getScrollState() != 2) {
            yVar.getClass();
            return;
        }
        OverScroller overScroller = this.f2898q0.f2920c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        yVar.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View B(android.view.View r3) {
        /*
            r2 = this;
        L0:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L10
            if (r0 == r2) goto L10
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L10
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L0
        L10:
            if (r0 != r2) goto L13
            goto L14
        L13:
            r3 = 0
        L14:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.B(android.view.View):android.view.View");
    }

    public final boolean C(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f2897q.size();
        for (int i10 = 0; i10 < size; i10++) {
            q qVar = this.f2897q.get(i10);
            if (qVar.c(this, motionEvent) && action != 3) {
                this.f2899r = qVar;
                return true;
            }
        }
        return false;
    }

    public final void D(int[] iArr) {
        int e10 = this.f2873e.e();
        if (e10 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < e10; i12++) {
            b0 J = J(this.f2873e.d(i12));
            if (!J.q()) {
                int e11 = J.e();
                if (e11 < i10) {
                    i10 = e11;
                }
                if (e11 > i11) {
                    i11 = e11;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    public final b0 F(int i10) {
        b0 b0Var = null;
        if (this.D) {
            return null;
        }
        int h10 = this.f2873e.h();
        for (int i11 = 0; i11 < h10; i11++) {
            b0 J = J(this.f2873e.g(i11));
            if (J != null && !J.k() && G(J) == i10) {
                if (!this.f2873e.k(J.f2927a)) {
                    return J;
                }
                b0Var = J;
            }
        }
        return b0Var;
    }

    public final int G(b0 b0Var) {
        boolean z10;
        if ((b0Var.f2936j & 524) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && b0Var.h()) {
            androidx.recyclerview.widget.a aVar = this.f2871d;
            int i10 = b0Var.f2929c;
            int size = aVar.f3073b.size();
            for (int i11 = 0; i11 < size; i11++) {
                a.b bVar = aVar.f3073b.get(i11);
                int i12 = bVar.f3078a;
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 == 8) {
                            int i13 = bVar.f3079b;
                            if (i13 == i10) {
                                i10 = bVar.f3081d;
                            } else {
                                if (i13 < i10) {
                                    i10--;
                                }
                                if (bVar.f3081d <= i10) {
                                    i10++;
                                }
                            }
                        }
                    } else {
                        int i14 = bVar.f3079b;
                        if (i14 <= i10) {
                            int i15 = bVar.f3081d;
                            if (i14 + i15 <= i10) {
                                i10 -= i15;
                            }
                        } else {
                            continue;
                        }
                    }
                } else if (bVar.f3079b <= i10) {
                    i10 += bVar.f3081d;
                }
            }
            return i10;
        }
        return -1;
    }

    public final long H(b0 b0Var) {
        if (this.f2887l.f2948b) {
            return b0Var.f2931e;
        }
        return b0Var.f2929c;
    }

    public final b0 I(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return J(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect L(View view) {
        n nVar = (n) view.getLayoutParams();
        if (!nVar.f2982c) {
            return nVar.f2981b;
        }
        if (this.f2904t0.f3021g && (nVar.b() || nVar.f2980a.i())) {
            return nVar.f2981b;
        }
        Rect rect = nVar.f2981b;
        rect.set(0, 0, 0, 0);
        int size = this.f2895p.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f2881i.set(0, 0, 0, 0);
            this.f2895p.get(i10).f(this.f2881i, view, this);
            int i11 = rect.left;
            Rect rect2 = this.f2881i;
            rect.left = i11 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        nVar.f2982c = false;
        return rect;
    }

    public final boolean M() {
        return this.F > 0;
    }

    public final void N(int i10) {
        if (this.f2889m == null) {
            return;
        }
        setScrollState(2);
        this.f2889m.r0(i10);
        awakenScrollBars();
    }

    public final void O() {
        int h10 = this.f2873e.h();
        for (int i10 = 0; i10 < h10; i10++) {
            ((n) this.f2873e.g(i10).getLayoutParams()).f2982c = true;
        }
        t tVar = this.f2868b;
        int size = tVar.f2992c.size();
        for (int i11 = 0; i11 < size; i11++) {
            n nVar = (n) tVar.f2992c.get(i11).f2927a.getLayoutParams();
            if (nVar != null) {
                nVar.f2982c = true;
            }
        }
    }

    public final void P(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int h10 = this.f2873e.h();
        for (int i13 = 0; i13 < h10; i13++) {
            b0 J = J(this.f2873e.g(i13));
            if (J != null && !J.q()) {
                int i14 = J.f2929c;
                if (i14 >= i12) {
                    J.n(-i11, z10);
                } else if (i14 >= i10) {
                    J.b(8);
                    J.n(-i11, z10);
                    J.f2929c = i10 - 1;
                }
                this.f2904t0.f3020f = true;
            }
        }
        t tVar = this.f2868b;
        int size = tVar.f2992c.size();
        while (true) {
            size--;
            if (size >= 0) {
                b0 b0Var = tVar.f2992c.get(size);
                if (b0Var != null) {
                    int i15 = b0Var.f2929c;
                    if (i15 >= i12) {
                        b0Var.n(-i11, z10);
                    } else if (i15 >= i10) {
                        b0Var.b(8);
                        tVar.e(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    public final void Q() {
        this.F++;
    }

    public final void R(boolean z10) {
        int i10;
        boolean z11 = true;
        int i11 = this.F - 1;
        this.F = i11;
        if (i11 < 1) {
            this.F = 0;
            if (z10) {
                int i12 = this.f2915z;
                this.f2915z = 0;
                if (i12 != 0) {
                    AccessibilityManager accessibilityManager = this.B;
                    if ((accessibilityManager == null || !accessibilityManager.isEnabled()) ? false : false) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain();
                        obtain.setEventType(2048);
                        l1.b.b(obtain, i12);
                        sendAccessibilityEventUnchecked(obtain);
                    }
                }
                for (int size = this.G0.size() - 1; size >= 0; size--) {
                    b0 b0Var = (b0) this.G0.get(size);
                    if (b0Var.f2927a.getParent() == this && !b0Var.q() && (i10 = b0Var.f2943q) != -1) {
                        View view = b0Var.f2927a;
                        WeakHashMap<View, i2> weakHashMap = k1.o0.f18161a;
                        o0.d.s(view, i10);
                        b0Var.f2943q = -1;
                    }
                }
                this.G0.clear();
            }
        }
    }

    public final void S(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2872d0) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f2872d0 = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f2880h0 = x10;
            this.f2876f0 = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.f2882i0 = y10;
            this.f2878g0 = y10;
        }
    }

    public final void T() {
        if (!this.f2916z0 && this.f2901s) {
            b bVar = this.H0;
            WeakHashMap<View, i2> weakHashMap = k1.o0.f18161a;
            o0.d.m(this, bVar);
            this.f2916z0 = true;
        }
    }

    public final void U() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15 = false;
        if (this.D) {
            androidx.recyclerview.widget.a aVar = this.f2871d;
            aVar.l(aVar.f3073b);
            aVar.l(aVar.f3074c);
            aVar.f3077f = 0;
            if (this.E) {
                this.f2889m.a0();
            }
        }
        if (this.W != null && this.f2889m.D0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f2871d.j();
        } else {
            this.f2871d.c();
        }
        if (!this.f2910w0 && !this.f2912x0) {
            z11 = false;
        } else {
            z11 = true;
        }
        y yVar = this.f2904t0;
        if (this.f2905u && this.W != null && (((z14 = this.D) || z11 || this.f2889m.f2964f) && (!z14 || this.f2887l.f2948b))) {
            z12 = true;
        } else {
            z12 = false;
        }
        yVar.f3024j = z12;
        if (z12 && z11 && !this.D) {
            if (this.W != null && this.f2889m.D0()) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                z15 = true;
            }
        }
        yVar.f3025k = z15;
    }

    public final void V(boolean z10) {
        this.E = z10 | this.E;
        this.D = true;
        int h10 = this.f2873e.h();
        for (int i10 = 0; i10 < h10; i10++) {
            b0 J = J(this.f2873e.g(i10));
            if (J != null && !J.q()) {
                J.b(6);
            }
        }
        O();
        t tVar = this.f2868b;
        int size = tVar.f2992c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b0 b0Var = tVar.f2992c.get(i11);
            if (b0Var != null) {
                b0Var.b(6);
                b0Var.a(null);
            }
        }
        e eVar = RecyclerView.this.f2887l;
        if (eVar == null || !eVar.f2948b) {
            tVar.d();
        }
    }

    public final void W(b0 b0Var, j.c cVar) {
        boolean z10 = false;
        int i10 = (b0Var.f2936j & (-8193)) | 0;
        b0Var.f2936j = i10;
        if (this.f2904t0.f3022h) {
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            if (z10 && !b0Var.k() && !b0Var.q()) {
                this.f2875f.f3210b.g(H(b0Var), b0Var);
            }
        }
        this.f2875f.b(b0Var, cVar);
    }

    public final void X() {
        j jVar = this.W;
        if (jVar != null) {
            jVar.f();
        }
        m mVar = this.f2889m;
        if (mVar != null) {
            mVar.k0(this.f2868b);
            this.f2889m.l0(this.f2868b);
        }
        t tVar = this.f2868b;
        tVar.f2990a.clear();
        tVar.d();
    }

    public final void Y(l lVar) {
        m mVar = this.f2889m;
        if (mVar != null) {
            mVar.d("Cannot remove item decoration during a scroll  or layout");
        }
        this.f2895p.remove(lVar);
        if (this.f2895p.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        O();
        requestLayout();
    }

    public final void Z(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f2881i.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof n) {
            n nVar = (n) layoutParams;
            if (!nVar.f2982c) {
                Rect rect = nVar.f2981b;
                Rect rect2 = this.f2881i;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f2881i);
            offsetRectIntoDescendantCoords(view, this.f2881i);
        }
        this.f2889m.o0(this, view, this.f2881i, !this.f2905u, view2 == null);
    }

    public final void a0() {
        VelocityTracker velocityTracker = this.f2874e0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z10 = false;
        i0(0);
        EdgeEffect edgeEffect = this.M;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = this.M.isFinished();
        }
        EdgeEffect edgeEffect2 = this.Q;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 |= this.Q.isFinished();
        }
        EdgeEffect edgeEffect3 = this.U;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 |= this.U.isFinished();
        }
        EdgeEffect edgeEffect4 = this.V;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z10 |= this.V.isFinished();
        }
        if (z10) {
            WeakHashMap<View, i2> weakHashMap = k1.o0.f18161a;
            o0.d.k(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        m mVar = this.f2889m;
        if (mVar != null) {
            mVar.getClass();
        }
        super.addFocusables(arrayList, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b0(int r19, int r20, android.view.MotionEvent r21, int r22) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.b0(int, int, android.view.MotionEvent, int):boolean");
    }

    public final void c0(int i10, int i11, int[] iArr) {
        int i12;
        int i13;
        b0 b0Var;
        g0();
        Q();
        int i14 = f1.o.f14038a;
        o.a.a("RV Scroll");
        A(this.f2904t0);
        if (i10 != 0) {
            i12 = this.f2889m.q0(i10, this.f2868b, this.f2904t0);
        } else {
            i12 = 0;
        }
        if (i11 != 0) {
            i13 = this.f2889m.s0(i11, this.f2868b, this.f2904t0);
        } else {
            i13 = 0;
        }
        o.a.b();
        int e10 = this.f2873e.e();
        for (int i15 = 0; i15 < e10; i15++) {
            View d10 = this.f2873e.d(i15);
            b0 I = I(d10);
            if (I != null && (b0Var = I.f2935i) != null) {
                View view = b0Var.f2927a;
                int left = d10.getLeft();
                int top = d10.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        R(true);
        h0(false);
        if (iArr != null) {
            iArr[0] = i12;
            iArr[1] = i13;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof n) && this.f2889m.h((n) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        m mVar = this.f2889m;
        if (mVar != null && mVar.f()) {
            return this.f2889m.l(this.f2904t0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        m mVar = this.f2889m;
        if (mVar != null && mVar.f()) {
            return this.f2889m.m(this.f2904t0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        m mVar = this.f2889m;
        if (mVar != null && mVar.f()) {
            return this.f2889m.n(this.f2904t0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        m mVar = this.f2889m;
        if (mVar != null && mVar.g()) {
            return this.f2889m.o(this.f2904t0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        m mVar = this.f2889m;
        if (mVar != null && mVar.g()) {
            return this.f2889m.p(this.f2904t0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        m mVar = this.f2889m;
        if (mVar != null && mVar.g()) {
            return this.f2889m.q(this.f2904t0);
        }
        return 0;
    }

    public final void d0(int i10) {
        x xVar;
        if (this.f2911x) {
            return;
        }
        setScrollState(0);
        a0 a0Var = this.f2898q0;
        RecyclerView.this.removeCallbacks(a0Var);
        a0Var.f2920c.abortAnimation();
        m mVar = this.f2889m;
        if (mVar != null && (xVar = mVar.f2963e) != null) {
            xVar.d();
        }
        m mVar2 = this.f2889m;
        if (mVar2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        mVar2.r0(i10);
        awakenScrollBars();
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().e(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z10;
        float f10;
        float f11;
        super.draw(canvas);
        int size = this.f2895p.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            this.f2895p.get(i10).h(canvas, this);
        }
        EdgeEffect edgeEffect = this.M;
        boolean z12 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f2877g ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.M;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.Q;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f2877g) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.Q;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.U;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f2877g ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.U;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.V;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f2877g) {
                f10 = getPaddingRight() + (-getWidth());
                f11 = getPaddingBottom() + (-getHeight());
            } else {
                f10 = -getWidth();
                f11 = -getHeight();
            }
            canvas.translate(f10, f11);
            EdgeEffect edgeEffect8 = this.V;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(save4);
        }
        if (z10 || this.W == null || this.f2895p.size() <= 0 || !this.W.g()) {
            z12 = z10;
        }
        if (z12) {
            WeakHashMap<View, i2> weakHashMap = k1.o0.f18161a;
            o0.d.k(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public final void e0(int i10, int i11, boolean z10) {
        m mVar = this.f2889m;
        if (mVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.f2911x) {
        } else {
            int i12 = 0;
            if (!mVar.f()) {
                i10 = 0;
            }
            if (!this.f2889m.g()) {
                i11 = 0;
            }
            if (i10 != 0 || i11 != 0) {
                if (z10) {
                    if (i10 != 0) {
                        i12 = 1;
                    }
                    if (i11 != 0) {
                        i12 |= 2;
                    }
                    getScrollingChildHelper().j(i12, 1);
                }
                this.f2898q0.b(i10, i11, Integer.MIN_VALUE, null);
            }
        }
    }

    public final void f(b0 b0Var) {
        boolean z10;
        View view = b0Var.f2927a;
        if (view.getParent() == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f2868b.j(I(view));
        if (b0Var.m()) {
            this.f2873e.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        androidx.recyclerview.widget.e eVar = this.f2873e;
        if (!z10) {
            eVar.a(view, -1, true);
            return;
        }
        int indexOfChild = ((g0) eVar.f3092a).f3112a.indexOfChild(view);
        if (indexOfChild >= 0) {
            eVar.f3093b.h(indexOfChild);
            eVar.i(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    public final void f0(int i10) {
        if (this.f2911x) {
            return;
        }
        m mVar = this.f2889m;
        if (mVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            mVar.B0(this, i10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:258:0x0167, code lost:
        if (r3 > 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0181, code lost:
        if (r6 > 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0184, code lost:
        if (r3 < 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0187, code lost:
        if (r6 < 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0190, code lost:
        if ((r6 * r1) <= 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0199, code lost:
        if ((r6 * r1) >= 0) goto L120;
     */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:283:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View focusSearch(android.view.View r14, int r15) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g(l lVar) {
        m mVar = this.f2889m;
        if (mVar != null) {
            mVar.d("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f2895p.isEmpty()) {
            setWillNotDraw(false);
        }
        this.f2895p.add(lVar);
        O();
        requestLayout();
    }

    public final void g0() {
        int i10 = this.f2907v + 1;
        this.f2907v = i10;
        if (i10 != 1 || this.f2911x) {
            return;
        }
        this.f2909w = false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        m mVar = this.f2889m;
        if (mVar != null) {
            return mVar.t();
        }
        throw new IllegalStateException(androidx.recyclerview.widget.d.a(this, android.support.v4.media.d.a("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        m mVar = this.f2889m;
        if (mVar != null) {
            return mVar.u(getContext(), attributeSet);
        }
        throw new IllegalStateException(androidx.recyclerview.widget.d.a(this, android.support.v4.media.d.a("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public e getAdapter() {
        return this.f2887l;
    }

    @Override // android.view.View
    public int getBaseline() {
        m mVar = this.f2889m;
        if (mVar != null) {
            mVar.getClass();
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f2877g;
    }

    public i0 getCompatAccessibilityDelegate() {
        return this.A0;
    }

    public i getEdgeEffectFactory() {
        return this.L;
    }

    public j getItemAnimator() {
        return this.W;
    }

    public int getItemDecorationCount() {
        return this.f2895p.size();
    }

    public m getLayoutManager() {
        return this.f2889m;
    }

    public int getMaxFlingVelocity() {
        return this.f2890m0;
    }

    public int getMinFlingVelocity() {
        return this.f2888l0;
    }

    public long getNanoTime() {
        if (P0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public p getOnFlingListener() {
        return this.f2886k0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f2896p0;
    }

    public s getRecycledViewPool() {
        return this.f2868b.c();
    }

    public int getScrollState() {
        return this.f2870c0;
    }

    public final void h(r rVar) {
        if (this.f2908v0 == null) {
            this.f2908v0 = new ArrayList();
        }
        this.f2908v0.add(rVar);
    }

    public final void h0(boolean z10) {
        if (this.f2907v < 1) {
            this.f2907v = 1;
        }
        if (!z10 && !this.f2911x) {
            this.f2909w = false;
        }
        if (this.f2907v == 1) {
            if (z10 && this.f2909w && !this.f2911x && this.f2889m != null && this.f2887l != null) {
                p();
            }
            if (!this.f2911x) {
                this.f2909w = false;
            }
        }
        this.f2907v--;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().h(0);
    }

    public final void i(String str) {
        if (M()) {
            if (str == null) {
                throw new IllegalStateException(androidx.recyclerview.widget.d.a(this, android.support.v4.media.d.a("Cannot call this method while RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(str);
        } else if (this.H > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(androidx.recyclerview.widget.d.a(this, android.support.v4.media.d.a(""))));
        }
    }

    public final void i0(int i10) {
        getScrollingChildHelper().k(i10);
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f2901s;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f2911x;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f18091d;
    }

    public final void k() {
        int h10 = this.f2873e.h();
        for (int i10 = 0; i10 < h10; i10++) {
            b0 J = J(this.f2873e.g(i10));
            if (!J.q()) {
                J.f2930d = -1;
                J.f2933g = -1;
            }
        }
        t tVar = this.f2868b;
        int size = tVar.f2992c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b0 b0Var = tVar.f2992c.get(i11);
            b0Var.f2930d = -1;
            b0Var.f2933g = -1;
        }
        int size2 = tVar.f2990a.size();
        for (int i12 = 0; i12 < size2; i12++) {
            b0 b0Var2 = tVar.f2990a.get(i12);
            b0Var2.f2930d = -1;
            b0Var2.f2933g = -1;
        }
        ArrayList<b0> arrayList = tVar.f2991b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i13 = 0; i13 < size3; i13++) {
                b0 b0Var3 = tVar.f2991b.get(i13);
                b0Var3.f2930d = -1;
                b0Var3.f2933g = -1;
            }
        }
    }

    public final void l(int i10, int i11) {
        boolean z10;
        EdgeEffect edgeEffect = this.M;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            z10 = false;
        } else {
            this.M.onRelease();
            z10 = this.M.isFinished();
        }
        EdgeEffect edgeEffect2 = this.U;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.U.onRelease();
            z10 |= this.U.isFinished();
        }
        EdgeEffect edgeEffect3 = this.Q;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.Q.onRelease();
            z10 |= this.Q.isFinished();
        }
        EdgeEffect edgeEffect4 = this.V;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.V.onRelease();
            z10 |= this.V.isFinished();
        }
        if (z10) {
            WeakHashMap<View, i2> weakHashMap = k1.o0.f18161a;
            o0.d.k(this);
        }
    }

    public final void m() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f2905u && !this.D) {
            if (!this.f2871d.g()) {
                return;
            }
            androidx.recyclerview.widget.a aVar = this.f2871d;
            int i10 = aVar.f3077f;
            boolean z13 = false;
            if ((4 & i10) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if ((11 & i10) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    int i11 = f1.o.f14038a;
                    o.a.a("RV PartialInvalidate");
                    g0();
                    Q();
                    this.f2871d.j();
                    if (!this.f2909w) {
                        int e10 = this.f2873e.e();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= e10) {
                                break;
                            }
                            b0 J = J(this.f2873e.d(i12));
                            if (J != null && !J.q()) {
                                if ((J.f2936j & 2) != 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    z13 = true;
                                    break;
                                }
                            }
                            i12++;
                        }
                        if (z13) {
                            p();
                        } else {
                            this.f2871d.b();
                        }
                    }
                    h0(true);
                    R(true);
                    o.a.b();
                    return;
                }
            }
            if (aVar.g()) {
                int i13 = f1.o.f14038a;
                o.a.a("RV FullInvalidate");
                p();
                o.a.b();
                return;
            }
            return;
        }
        int i14 = f1.o.f14038a;
        o.a.a("RV FullInvalidate");
        p();
        o.a.b();
    }

    public final void n(int i10, int i11) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap<View, i2> weakHashMap = k1.o0.f18161a;
        setMeasuredDimension(m.i(i10, paddingRight, o0.d.e(this)), m.i(i11, getPaddingBottom() + getPaddingTop(), o0.d.d(this)));
    }

    public final void o(View view) {
        b0 J = J(view);
        e eVar = this.f2887l;
        if (eVar != null && J != null) {
            eVar.s(J);
        }
        ArrayList arrayList = this.C;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            ((o) this.C.get(size)).b(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        boolean z10;
        super.onAttachedToWindow();
        this.F = 0;
        this.f2901s = true;
        if (this.f2905u && !isLayoutRequested()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f2905u = z10;
        m mVar = this.f2889m;
        if (mVar != null) {
            mVar.f2965g = true;
        }
        this.f2916z0 = false;
        if (P0) {
            ThreadLocal<androidx.recyclerview.widget.s> threadLocal = androidx.recyclerview.widget.s.f3252e;
            androidx.recyclerview.widget.s sVar = threadLocal.get();
            this.f2900r0 = sVar;
            if (sVar == null) {
                this.f2900r0 = new androidx.recyclerview.widget.s();
                WeakHashMap<View, i2> weakHashMap = k1.o0.f18161a;
                Display b10 = o0.e.b(this);
                float f10 = 60.0f;
                if (!isInEditMode() && b10 != null) {
                    float refreshRate = b10.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f10 = refreshRate;
                    }
                }
                androidx.recyclerview.widget.s sVar2 = this.f2900r0;
                sVar2.f3256c = 1.0E9f / f10;
                threadLocal.set(sVar2);
            }
            this.f2900r0.f3254a.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        androidx.recyclerview.widget.s sVar;
        x xVar;
        super.onDetachedFromWindow();
        j jVar = this.W;
        if (jVar != null) {
            jVar.f();
        }
        setScrollState(0);
        a0 a0Var = this.f2898q0;
        RecyclerView.this.removeCallbacks(a0Var);
        a0Var.f2920c.abortAnimation();
        m mVar = this.f2889m;
        if (mVar != null && (xVar = mVar.f2963e) != null) {
            xVar.d();
        }
        this.f2901s = false;
        m mVar2 = this.f2889m;
        if (mVar2 != null) {
            mVar2.f2965g = false;
            mVar2.T(this);
        }
        this.G0.clear();
        removeCallbacks(this.H0);
        this.f2875f.getClass();
        do {
        } while (q0.a.f3211d.acquire() != null);
        if (P0 && (sVar = this.f2900r0) != null) {
            sVar.f3254a.remove(this);
            this.f2900r0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f2895p.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f2895p.get(i10).g(canvas, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0065  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.f2911x) {
            return false;
        }
        this.f2899r = null;
        if (C(motionEvent)) {
            a0();
            setScrollState(0);
            return true;
        }
        m mVar = this.f2889m;
        if (mVar == null) {
            return false;
        }
        boolean f10 = mVar.f();
        boolean g10 = this.f2889m.g();
        if (this.f2874e0 == null) {
            this.f2874e0 = VelocityTracker.obtain();
        }
        this.f2874e0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                S(motionEvent);
                            }
                        } else {
                            this.f2872d0 = motionEvent.getPointerId(actionIndex);
                            int x10 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.f2880h0 = x10;
                            this.f2876f0 = x10;
                            int y10 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                            this.f2882i0 = y10;
                            this.f2878g0 = y10;
                        }
                    } else {
                        a0();
                        setScrollState(0);
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f2872d0);
                    if (findPointerIndex < 0) {
                        StringBuilder a10 = android.support.v4.media.d.a("Error processing scroll; pointer index for id ");
                        a10.append(this.f2872d0);
                        a10.append(" not found. Did any MotionEvents get skipped?");
                        Log.e("RecyclerView", a10.toString());
                        return false;
                    }
                    int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.f2870c0 != 1) {
                        int i10 = x11 - this.f2876f0;
                        int i11 = y11 - this.f2878g0;
                        if (f10 && Math.abs(i10) > this.f2884j0) {
                            this.f2880h0 = x11;
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (g10 && Math.abs(i11) > this.f2884j0) {
                            this.f2882i0 = y11;
                            z10 = true;
                        }
                        if (z10) {
                            setScrollState(1);
                        }
                    }
                }
            } else {
                this.f2874e0.clear();
                i0(0);
            }
        } else {
            if (this.f2913y) {
                this.f2913y = false;
            }
            this.f2872d0 = motionEvent.getPointerId(0);
            int x12 = (int) (motionEvent.getX() + 0.5f);
            this.f2880h0 = x12;
            this.f2876f0 = x12;
            int y12 = (int) (motionEvent.getY() + 0.5f);
            this.f2882i0 = y12;
            this.f2878g0 = y12;
            if (this.f2870c0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                i0(1);
            }
            int[] iArr = this.E0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i12 = f10;
            if (g10) {
                i12 = (f10 ? 1 : 0) | 2;
            }
            getScrollingChildHelper().j(i12, 0);
        }
        if (this.f2870c0 != 1) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = f1.o.f14038a;
        o.a.a("RV OnLayout");
        p();
        o.a.b();
        this.f2905u = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        m mVar = this.f2889m;
        if (mVar == null) {
            n(i10, i11);
            return;
        }
        boolean z10 = false;
        if (mVar.N()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f2889m.f2960b.n(i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.I0 = z10;
            if (!z10 && this.f2887l != null) {
                if (this.f2904t0.f3018d == 1) {
                    q();
                }
                this.f2889m.u0(i10, i11);
                this.f2904t0.f3023i = true;
                r();
                this.f2889m.w0(i10, i11);
                if (this.f2889m.z0()) {
                    this.f2889m.u0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.f2904t0.f3023i = true;
                    r();
                    this.f2889m.w0(i10, i11);
                }
                this.J0 = getMeasuredWidth();
                this.K0 = getMeasuredHeight();
            }
        } else if (this.f2903t) {
            this.f2889m.f2960b.n(i10, i11);
        } else {
            if (this.A) {
                g0();
                Q();
                U();
                R(true);
                y yVar = this.f2904t0;
                if (yVar.f3025k) {
                    yVar.f3021g = true;
                } else {
                    this.f2871d.c();
                    this.f2904t0.f3021g = false;
                }
                this.A = false;
                h0(false);
            } else if (this.f2904t0.f3025k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            e eVar = this.f2887l;
            if (eVar != null) {
                this.f2904t0.f3019e = eVar.e();
            } else {
                this.f2904t0.f3019e = 0;
            }
            g0();
            this.f2889m.f2960b.n(i10, i11);
            h0(false);
            this.f2904t0.f3021g = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (M()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof w)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        w wVar = (w) parcelable;
        this.f2869c = wVar;
        super.onRestoreInstanceState(wVar.f24504a);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelable;
        w wVar = new w(super.onSaveInstanceState());
        w wVar2 = this.f2869c;
        if (wVar2 != null) {
            wVar.f2999c = wVar2.f2999c;
        } else {
            m mVar = this.f2889m;
            if (mVar != null) {
                parcelable = mVar.h0();
            } else {
                parcelable = null;
            }
            wVar.f2999c = parcelable;
        }
        return wVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        this.V = null;
        this.Q = null;
        this.U = null;
        this.M = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:493:0x0327, code lost:
        if (r5 < r8) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x033a, code lost:
        if (r2 == false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x039e, code lost:
        if (r8 == false) goto L103;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:327:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x03dd  */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v6, types: [boolean] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 998
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:465:0x03c2, code lost:
        if (r17.f2873e.k(getFocusedChild()) == false) goto L250;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x046a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p() {
        /*
            Method dump skipped, instructions count: 1165
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p():void");
    }

    public final void q() {
        View view;
        b0 b0Var;
        int c10;
        int id2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        View B;
        this.f2904t0.a(1);
        A(this.f2904t0);
        this.f2904t0.f3023i = false;
        g0();
        q0 q0Var = this.f2875f;
        q0Var.f3209a.clear();
        q0Var.f3210b.b();
        Q();
        U();
        if (this.f2896p0 && hasFocus() && this.f2887l != null) {
            view = getFocusedChild();
        } else {
            view = null;
        }
        if (view == null || (B = B(view)) == null) {
            b0Var = null;
        } else {
            b0Var = I(B);
        }
        long j10 = -1;
        if (b0Var == null) {
            y yVar = this.f2904t0;
            yVar.f3027m = -1L;
            yVar.f3026l = -1;
            yVar.f3028n = -1;
        } else {
            y yVar2 = this.f2904t0;
            if (this.f2887l.f2948b) {
                j10 = b0Var.f2931e;
            }
            yVar2.f3027m = j10;
            if (this.D) {
                c10 = -1;
            } else if (b0Var.k()) {
                c10 = b0Var.f2930d;
            } else {
                c10 = b0Var.c();
            }
            yVar2.f3026l = c10;
            y yVar3 = this.f2904t0;
            View view2 = b0Var.f2927a;
            loop3: while (true) {
                id2 = view2.getId();
                while (!view2.isFocused() && (view2 instanceof ViewGroup) && view2.hasFocus()) {
                    view2 = ((ViewGroup) view2).getFocusedChild();
                    if (view2.getId() != -1) {
                        break;
                    }
                }
            }
            yVar3.f3028n = id2;
        }
        y yVar4 = this.f2904t0;
        if (yVar4.f3024j && this.f2912x0) {
            z10 = true;
        } else {
            z10 = false;
        }
        yVar4.f3022h = z10;
        this.f2912x0 = false;
        this.f2910w0 = false;
        yVar4.f3021g = yVar4.f3025k;
        yVar4.f3019e = this.f2887l.e();
        D(this.B0);
        if (this.f2904t0.f3024j) {
            int e10 = this.f2873e.e();
            for (int i10 = 0; i10 < e10; i10++) {
                b0 J = J(this.f2873e.d(i10));
                if (!J.q() && (!J.i() || this.f2887l.f2948b)) {
                    j jVar = this.W;
                    j.b(J);
                    J.f();
                    jVar.getClass();
                    j.c cVar = new j.c();
                    cVar.a(J);
                    this.f2875f.b(J, cVar);
                    if (this.f2904t0.f3022h) {
                        if ((J.f2936j & 2) != 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13 && !J.k() && !J.q() && !J.i()) {
                            this.f2875f.f3210b.g(H(J), J);
                        }
                    }
                }
            }
        }
        if (this.f2904t0.f3025k) {
            int h10 = this.f2873e.h();
            for (int i11 = 0; i11 < h10; i11++) {
                b0 J2 = J(this.f2873e.g(i11));
                if (!J2.q() && J2.f2930d == -1) {
                    J2.f2930d = J2.f2929c;
                }
            }
            y yVar5 = this.f2904t0;
            boolean z14 = yVar5.f3020f;
            yVar5.f3020f = false;
            this.f2889m.e0(this.f2868b, yVar5);
            this.f2904t0.f3020f = z14;
            for (int i12 = 0; i12 < this.f2873e.e(); i12++) {
                b0 J3 = J(this.f2873e.d(i12));
                if (!J3.q()) {
                    q0.a orDefault = this.f2875f.f3209a.getOrDefault(J3, null);
                    if (orDefault != null && (orDefault.f3212a & 4) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        j.b(J3);
                        if ((8192 & J3.f2936j) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        j jVar2 = this.W;
                        J3.f();
                        jVar2.getClass();
                        j.c cVar2 = new j.c();
                        cVar2.a(J3);
                        if (z12) {
                            W(J3, cVar2);
                        } else {
                            q0 q0Var2 = this.f2875f;
                            q0.a orDefault2 = q0Var2.f3209a.getOrDefault(J3, null);
                            if (orDefault2 == null) {
                                orDefault2 = q0.a.a();
                                q0Var2.f3209a.put(J3, orDefault2);
                            }
                            orDefault2.f3212a |= 2;
                            orDefault2.f3213b = cVar2;
                        }
                    }
                }
            }
        }
        k();
        R(true);
        h0(false);
        this.f2904t0.f3018d = 2;
    }

    public final void r() {
        boolean z10;
        boolean z11;
        g0();
        Q();
        this.f2904t0.a(6);
        this.f2871d.c();
        this.f2904t0.f3019e = this.f2887l.e();
        this.f2904t0.f3017c = 0;
        if (this.f2869c != null) {
            e eVar = this.f2887l;
            int b10 = s.c0.b(eVar.f2949c);
            if (b10 == 1 ? eVar.e() > 0 : b10 != 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                Parcelable parcelable = this.f2869c.f2999c;
                if (parcelable != null) {
                    this.f2889m.g0(parcelable);
                }
                this.f2869c = null;
            }
        }
        y yVar = this.f2904t0;
        yVar.f3021g = false;
        this.f2889m.e0(this.f2868b, yVar);
        y yVar2 = this.f2904t0;
        yVar2.f3020f = false;
        if (yVar2.f3024j && this.W != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        yVar2.f3024j = z10;
        yVar2.f3018d = 4;
        R(true);
        h0(false);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z10) {
        b0 J = J(view);
        if (J != null) {
            if (J.m()) {
                J.f2936j &= -257;
            } else if (!J.q()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb2.append(J);
                throw new IllegalArgumentException(androidx.recyclerview.widget.d.a(this, sb2));
            }
        }
        view.clearAnimation();
        o(view);
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        boolean z10;
        x xVar = this.f2889m.f2963e;
        boolean z11 = true;
        if (xVar != null && xVar.f3004e) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && !M()) {
            z11 = false;
        }
        if (!z11 && view2 != null) {
            Z(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.f2889m.o0(this, view, rect, z10, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.f2897q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f2897q.get(i10).e(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f2907v != 0 || this.f2911x) {
            this.f2909w = true;
        } else {
            super.requestLayout();
        }
    }

    public final boolean s(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2, i12);
    }

    @Override // android.view.View
    public final void scrollBy(int i10, int i11) {
        m mVar = this.f2889m;
        if (mVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.f2911x) {
        } else {
            boolean f10 = mVar.f();
            boolean g10 = this.f2889m.g();
            if (f10 || g10) {
                if (!f10) {
                    i10 = 0;
                }
                if (!g10) {
                    i11 = 0;
                }
                b0(i10, i11, null, 0);
            }
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i10;
        int i11 = 0;
        if (M()) {
            if (accessibilityEvent != null) {
                i10 = l1.b.a(accessibilityEvent);
            } else {
                i10 = 0;
            }
            if (i10 != 0) {
                i11 = i10;
            }
            this.f2915z |= i11;
            i11 = 1;
        }
        if (i11 != 0) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(i0 i0Var) {
        this.A0 = i0Var;
        k1.o0.p(this, i0Var);
    }

    public void setAdapter(e eVar) {
        setLayoutFrozen(false);
        e eVar2 = this.f2887l;
        if (eVar2 != null) {
            eVar2.x(this.f2867a);
            this.f2887l.p(this);
        }
        X();
        androidx.recyclerview.widget.a aVar = this.f2871d;
        aVar.l(aVar.f3073b);
        aVar.l(aVar.f3074c);
        aVar.f3077f = 0;
        e eVar3 = this.f2887l;
        this.f2887l = eVar;
        if (eVar != null) {
            eVar.u(this.f2867a);
            eVar.m(this);
        }
        m mVar = this.f2889m;
        if (mVar != null) {
            mVar.S();
        }
        t tVar = this.f2868b;
        e eVar4 = this.f2887l;
        tVar.f2990a.clear();
        tVar.d();
        s c10 = tVar.c();
        if (eVar3 != null) {
            c10.f2985b--;
        }
        if (c10.f2985b == 0) {
            for (int i10 = 0; i10 < c10.f2984a.size(); i10++) {
                c10.f2984a.valueAt(i10).f2986a.clear();
            }
        }
        if (eVar4 != null) {
            c10.f2985b++;
        }
        this.f2904t0.f3020f = true;
        V(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(h hVar) {
        if (hVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(hVar != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.f2877g) {
            this.V = null;
            this.Q = null;
            this.U = null;
            this.M = null;
        }
        this.f2877g = z10;
        super.setClipToPadding(z10);
        if (this.f2905u) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(i iVar) {
        iVar.getClass();
        this.L = iVar;
        this.V = null;
        this.Q = null;
        this.U = null;
        this.M = null;
    }

    public void setHasFixedSize(boolean z10) {
        this.f2903t = z10;
    }

    public void setItemAnimator(j jVar) {
        j jVar2 = this.W;
        if (jVar2 != null) {
            jVar2.f();
            this.W.f2950a = null;
        }
        this.W = jVar;
        if (jVar != null) {
            jVar.f2950a = this.f2914y0;
        }
    }

    public void setItemViewCacheSize(int i10) {
        t tVar = this.f2868b;
        tVar.f2994e = i10;
        tVar.k();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(m mVar) {
        x xVar;
        if (mVar == this.f2889m) {
            return;
        }
        setScrollState(0);
        a0 a0Var = this.f2898q0;
        RecyclerView.this.removeCallbacks(a0Var);
        a0Var.f2920c.abortAnimation();
        m mVar2 = this.f2889m;
        if (mVar2 != null && (xVar = mVar2.f2963e) != null) {
            xVar.d();
        }
        if (this.f2889m != null) {
            j jVar = this.W;
            if (jVar != null) {
                jVar.f();
            }
            this.f2889m.k0(this.f2868b);
            this.f2889m.l0(this.f2868b);
            t tVar = this.f2868b;
            tVar.f2990a.clear();
            tVar.d();
            if (this.f2901s) {
                m mVar3 = this.f2889m;
                mVar3.f2965g = false;
                mVar3.T(this);
            }
            this.f2889m.x0(null);
            this.f2889m = null;
        } else {
            t tVar2 = this.f2868b;
            tVar2.f2990a.clear();
            tVar2.d();
        }
        androidx.recyclerview.widget.e eVar = this.f2873e;
        eVar.f3093b.g();
        int size = eVar.f3094c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            g0 g0Var = (g0) eVar.f3092a;
            g0Var.getClass();
            b0 J = J((View) eVar.f3094c.get(size));
            if (J != null) {
                RecyclerView recyclerView = g0Var.f3112a;
                int i10 = J.f2942p;
                if (recyclerView.M()) {
                    J.f2943q = i10;
                    recyclerView.G0.add(J);
                } else {
                    View view = J.f2927a;
                    WeakHashMap<View, i2> weakHashMap = k1.o0.f18161a;
                    o0.d.s(view, i10);
                }
                J.f2942p = 0;
            }
            eVar.f3094c.remove(size);
        }
        g0 g0Var2 = (g0) eVar.f3092a;
        int a10 = g0Var2.a();
        for (int i11 = 0; i11 < a10; i11++) {
            View childAt = g0Var2.f3112a.getChildAt(i11);
            g0Var2.f3112a.o(childAt);
            childAt.clearAnimation();
        }
        g0Var2.f3112a.removeAllViews();
        this.f2889m = mVar;
        if (mVar != null) {
            if (mVar.f2960b == null) {
                mVar.x0(this);
                if (this.f2901s) {
                    this.f2889m.f2965g = true;
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("LayoutManager ");
                sb2.append(mVar);
                sb2.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(androidx.recyclerview.widget.d.a(mVar.f2960b, sb2));
            }
        }
        this.f2868b.k();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        getScrollingChildHelper().i(z10);
    }

    public void setOnFlingListener(p pVar) {
        this.f2886k0 = pVar;
    }

    @Deprecated
    public void setOnScrollListener(r rVar) {
        this.f2906u0 = rVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f2896p0 = z10;
    }

    public void setRecycledViewPool(s sVar) {
        s sVar2;
        t tVar = this.f2868b;
        if (tVar.f2996g != null) {
            sVar2.f2985b--;
        }
        tVar.f2996g = sVar;
        if (sVar != null && RecyclerView.this.getAdapter() != null) {
            tVar.f2996g.f2985b++;
        }
    }

    @Deprecated
    public void setRecyclerListener(u uVar) {
        this.f2891n = uVar;
    }

    void setScrollState(int i10) {
        x xVar;
        if (i10 == this.f2870c0) {
            return;
        }
        this.f2870c0 = i10;
        if (i10 != 2) {
            a0 a0Var = this.f2898q0;
            RecyclerView.this.removeCallbacks(a0Var);
            a0Var.f2920c.abortAnimation();
            m mVar = this.f2889m;
            if (mVar != null && (xVar = mVar.f2963e) != null) {
                xVar.d();
            }
        }
        m mVar2 = this.f2889m;
        if (mVar2 != null) {
            mVar2.i0(i10);
        }
        r rVar = this.f2906u0;
        if (rVar != null) {
            rVar.a(i10, this);
        }
        ArrayList arrayList = this.f2908v0;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((r) this.f2908v0.get(size)).a(i10, this);
                } else {
                    return;
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i10) {
        int scaledTouchSlop;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 == 1) {
                scaledTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                this.f2884j0 = scaledTouchSlop;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
        }
        scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.f2884j0 = scaledTouchSlop;
    }

    public void setViewCacheExtension(z zVar) {
        this.f2868b.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().j(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().k(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        x xVar;
        if (z10 != this.f2911x) {
            i("Do not suppressLayout in layout or scroll");
            if (!z10) {
                this.f2911x = false;
                if (this.f2909w && this.f2889m != null && this.f2887l != null) {
                    requestLayout();
                }
                this.f2909w = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f2911x = true;
            this.f2913y = true;
            setScrollState(0);
            a0 a0Var = this.f2898q0;
            RecyclerView.this.removeCallbacks(a0Var);
            a0Var.f2920c.abortAnimation();
            m mVar = this.f2889m;
            if (mVar != null && (xVar = mVar.f2963e) != null) {
                xVar.d();
            }
        }
    }

    public final void t(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().f(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public final void u(int i10, int i11) {
        this.H++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        r rVar = this.f2906u0;
        if (rVar != null) {
            rVar.b(this, i10, i11);
        }
        ArrayList arrayList = this.f2908v0;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((r) this.f2908v0.get(size)).b(this, i10, i11);
            }
        }
        this.H--;
    }

    public final void v() {
        int measuredWidth;
        int measuredHeight;
        if (this.V != null) {
            return;
        }
        this.L.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.V = edgeEffect;
        if (this.f2877g) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffect.setSize(measuredWidth, measuredHeight);
    }

    public final void w() {
        int measuredHeight;
        int measuredWidth;
        if (this.M != null) {
            return;
        }
        this.L.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.M = edgeEffect;
        if (this.f2877g) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffect.setSize(measuredHeight, measuredWidth);
    }

    public final void x() {
        int measuredHeight;
        int measuredWidth;
        if (this.U != null) {
            return;
        }
        this.L.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.U = edgeEffect;
        if (this.f2877g) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffect.setSize(measuredHeight, measuredWidth);
    }

    public final void y() {
        int measuredWidth;
        int measuredHeight;
        if (this.Q != null) {
            return;
        }
        this.L.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.Q = edgeEffect;
        if (this.f2877g) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffect.setSize(measuredWidth, measuredHeight);
    }

    public final String z() {
        StringBuilder a10 = android.support.v4.media.d.a(" ");
        a10.append(super.toString());
        a10.append(", adapter:");
        a10.append(this.f2887l);
        a10.append(", layout:");
        a10.append(this.f2889m);
        a10.append(", context:");
        a10.append(getContext());
        return a10.toString();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        m mVar = this.f2889m;
        if (mVar != null) {
            return mVar.v(layoutParams);
        }
        throw new IllegalStateException(androidx.recyclerview.widget.d.a(this, android.support.v4.media.d.a("RecyclerView has no LayoutManager")));
    }
}
