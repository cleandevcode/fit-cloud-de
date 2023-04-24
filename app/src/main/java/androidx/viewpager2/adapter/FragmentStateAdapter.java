package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.f0;
import androidx.fragment.app.j0;
import androidx.fragment.app.p;
import androidx.fragment.app.q0;
import androidx.fragment.app.r;
import androidx.lifecycle.k;
import androidx.lifecycle.s;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Iterator;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;
import o0.g;
import s.h1;

/* loaded from: classes.dex */
public abstract class FragmentStateAdapter extends RecyclerView.e<f> implements g {

    /* renamed from: d */
    public final k f3527d;

    /* renamed from: e */
    public final j0 f3528e;

    /* renamed from: f */
    public final o0.e<r> f3529f;

    /* renamed from: g */
    public final o0.e<r.f> f3530g;

    /* renamed from: h */
    public final o0.e<Integer> f3531h;

    /* renamed from: i */
    public b f3532i;

    /* renamed from: j */
    public boolean f3533j;

    /* renamed from: k */
    public boolean f3534k;

    /* loaded from: classes.dex */
    public static abstract class a extends RecyclerView.g {
        @Override // androidx.recyclerview.widget.RecyclerView.g
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void b(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void c(int i10, int i11, Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void d(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void e(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void f(int i10, int i11) {
            a();
        }
    }

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a */
        public d f3540a;

        /* renamed from: b */
        public e f3541b;

        /* renamed from: c */
        public s f3542c;

        /* renamed from: d */
        public ViewPager2 f3543d;

        /* renamed from: e */
        public long f3544e = -1;

        public b() {
            FragmentStateAdapter.this = r3;
        }

        public static ViewPager2 a(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        public final void b(boolean z10) {
            boolean z11;
            int currentItem;
            boolean z12;
            if (FragmentStateAdapter.this.f3528e.O() || this.f3543d.getScrollState() != 0) {
                return;
            }
            if (FragmentStateAdapter.this.f3529f.i() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 || FragmentStateAdapter.this.e() == 0 || (currentItem = this.f3543d.getCurrentItem()) >= FragmentStateAdapter.this.e()) {
                return;
            }
            FragmentStateAdapter.this.getClass();
            long j10 = currentItem;
            if (j10 == this.f3544e && !z10) {
                return;
            }
            r rVar = null;
            r rVar2 = (r) FragmentStateAdapter.this.f3529f.e(j10, null);
            if (rVar2 != null && rVar2.t0()) {
                this.f3544e = j10;
                j0 j0Var = FragmentStateAdapter.this.f3528e;
                j0Var.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(j0Var);
                for (int i10 = 0; i10 < FragmentStateAdapter.this.f3529f.i(); i10++) {
                    long f10 = FragmentStateAdapter.this.f3529f.f(i10);
                    r l10 = FragmentStateAdapter.this.f3529f.l(i10);
                    if (l10.t0()) {
                        if (f10 != this.f3544e) {
                            aVar.j(l10, k.c.STARTED);
                        } else {
                            rVar = l10;
                        }
                        if (f10 == this.f3544e) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (l10.D != z12) {
                            l10.D = z12;
                        }
                    }
                }
                if (rVar != null) {
                    aVar.j(rVar, k.c.RESUMED);
                }
                if (!aVar.f2563a.isEmpty()) {
                    aVar.f();
                }
            }
        }
    }

    public FragmentStateAdapter(j0 j0Var, v vVar) {
        this.f3529f = new o0.e<>();
        this.f3530g = new o0.e<>();
        this.f3531h = new o0.e<>();
        this.f3533j = false;
        this.f3534k = false;
        this.f3528e = j0Var;
        this.f3527d = vVar;
        v(true);
    }

    public FragmentStateAdapter(r rVar) {
        this(rVar.h0(), rVar.Z);
    }

    public static void y(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    public abstract r A(int i10);

    public final void B() {
        boolean z10;
        r rVar;
        View view;
        if (this.f3534k && !this.f3528e.O()) {
            o0.d dVar = new o0.d();
            for (int i10 = 0; i10 < this.f3529f.i(); i10++) {
                long f10 = this.f3529f.f(i10);
                if (!z(f10)) {
                    dVar.add(Long.valueOf(f10));
                    this.f3531h.h(f10);
                }
            }
            if (!this.f3533j) {
                this.f3534k = false;
                for (int i11 = 0; i11 < this.f3529f.i(); i11++) {
                    long f11 = this.f3529f.f(i11);
                    o0.e<Integer> eVar = this.f3531h;
                    if (eVar.f22522a) {
                        eVar.d();
                    }
                    boolean z11 = true;
                    if (hh.d.c(eVar.f22523b, eVar.f22525d, f11) >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10 && ((rVar = (r) this.f3529f.e(f11, null)) == null || (view = rVar.H) == null || view.getParent() == null)) {
                        z11 = false;
                    }
                    if (!z11) {
                        dVar.add(Long.valueOf(f11));
                    }
                }
            }
            Iterator it = dVar.iterator();
            while (true) {
                g.a aVar = (g.a) it;
                if (aVar.hasNext()) {
                    E(((Long) aVar.next()).longValue());
                } else {
                    return;
                }
            }
        }
    }

    public final Long C(int i10) {
        Long l10 = null;
        for (int i11 = 0; i11 < this.f3531h.i(); i11++) {
            if (this.f3531h.l(i11).intValue() == i10) {
                if (l10 != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                l10 = Long.valueOf(this.f3531h.f(i11));
            }
        }
        return l10;
    }

    public final void D(final f fVar) {
        r rVar = (r) this.f3529f.e(fVar.f2931e, null);
        if (rVar != null) {
            FrameLayout frameLayout = (FrameLayout) fVar.f2927a;
            View view = rVar.H;
            if (!rVar.t0() && view != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            if (rVar.t0() && view == null) {
                this.f3528e.f2405m.f2357a.add(new f0.a(new androidx.viewpager2.adapter.b(this, rVar, frameLayout)));
                return;
            } else if (rVar.t0() && view.getParent() != null) {
                if (view.getParent() != frameLayout) {
                    y(view, frameLayout);
                    return;
                }
                return;
            } else if (rVar.t0()) {
                y(view, frameLayout);
                return;
            } else if (!this.f3528e.O()) {
                this.f3528e.f2405m.f2357a.add(new f0.a(new androidx.viewpager2.adapter.b(this, rVar, frameLayout)));
                j0 j0Var = this.f3528e;
                j0Var.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(j0Var);
                StringBuilder a10 = android.support.v4.media.d.a("f");
                a10.append(fVar.f2931e);
                aVar.g(0, rVar, a10.toString(), 1);
                aVar.j(rVar, k.c.STARTED);
                aVar.f();
                this.f3532i.b(false);
                return;
            } else if (this.f3528e.H) {
                return;
            } else {
                this.f3527d.a(new s() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.2
                    @Override // androidx.lifecycle.s
                    public final void d(u uVar, k.b bVar) {
                        if (FragmentStateAdapter.this.f3528e.O()) {
                            return;
                        }
                        uVar.a0().c(this);
                        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                        if (o0.g.b((FrameLayout) fVar.f2927a)) {
                            FragmentStateAdapter.this.D(fVar);
                        }
                    }
                });
                return;
            }
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public final void E(long j10) {
        Bundle o10;
        ViewParent parent;
        r.f fVar = null;
        r rVar = (r) this.f3529f.e(j10, null);
        if (rVar == null) {
            return;
        }
        View view = rVar.H;
        if (view != null && (parent = view.getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!z(j10)) {
            this.f3530g.h(j10);
        }
        if (!rVar.t0()) {
            this.f3529f.h(j10);
        } else if (this.f3528e.O()) {
            this.f3534k = true;
        } else {
            if (rVar.t0() && z(j10)) {
                o0.e<r.f> eVar = this.f3530g;
                j0 j0Var = this.f3528e;
                q0 q0Var = j0Var.f2395c.f2559b.get(rVar.f2514e);
                if (q0Var != null && q0Var.f2503c.equals(rVar)) {
                    if (q0Var.f2503c.f2508a > -1 && (o10 = q0Var.o()) != null) {
                        fVar = new r.f(o10);
                    }
                    eVar.g(j10, fVar);
                } else {
                    j0Var.g0(new IllegalStateException(p.a("Fragment ", rVar, " is not currently in the FragmentManager")));
                    throw null;
                }
            }
            j0 j0Var2 = this.f3528e;
            j0Var2.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(j0Var2);
            aVar.i(rVar);
            aVar.f();
            this.f3529f.h(j10);
        }
    }

    @Override // androidx.viewpager2.adapter.g
    public final Bundle a() {
        Bundle bundle = new Bundle(this.f3530g.i() + this.f3529f.i());
        for (int i10 = 0; i10 < this.f3529f.i(); i10++) {
            long f10 = this.f3529f.f(i10);
            r rVar = (r) this.f3529f.e(f10, null);
            if (rVar != null && rVar.t0()) {
                String a10 = a0.q0.a("f#", f10);
                j0 j0Var = this.f3528e;
                j0Var.getClass();
                if (rVar.f2534s == j0Var) {
                    bundle.putString(a10, rVar.f2514e);
                } else {
                    j0Var.g0(new IllegalStateException(p.a("Fragment ", rVar, " is not currently in the FragmentManager")));
                    throw null;
                }
            }
        }
        for (int i11 = 0; i11 < this.f3530g.i(); i11++) {
            long f11 = this.f3530g.f(i11);
            if (z(f11)) {
                bundle.putParcelable(a0.q0.a("s#", f11), (Parcelable) this.f3530g.e(f11, null));
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager2.adapter.g
    public final void b(Parcelable parcelable) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14 = false;
        if (this.f3530g.i() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.f3529f.i() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                Bundle bundle = (Bundle) parcelable;
                if (bundle.getClassLoader() == null) {
                    bundle.setClassLoader(getClass().getClassLoader());
                }
                for (String str : bundle.keySet()) {
                    if (str.startsWith("f#") && str.length() > 2) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        long parseLong = Long.parseLong(str.substring(2));
                        j0 j0Var = this.f3528e;
                        j0Var.getClass();
                        String string = bundle.getString(str);
                        r rVar = null;
                        if (string != null) {
                            r B = j0Var.B(string);
                            if (B != null) {
                                rVar = B;
                            } else {
                                j0Var.g0(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
                                throw null;
                            }
                        }
                        this.f3529f.g(parseLong, rVar);
                    } else {
                        if (str.startsWith("s#") && str.length() > 2) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            long parseLong2 = Long.parseLong(str.substring(2));
                            r.f fVar = (r.f) bundle.getParcelable(str);
                            if (z(parseLong2)) {
                                this.f3530g.g(parseLong2, fVar);
                            }
                        } else {
                            throw new IllegalArgumentException(a.b.b("Unexpected key in savedState: ", str));
                        }
                    }
                }
                if (this.f3529f.i() == 0) {
                    z14 = true;
                }
                if (!z14) {
                    this.f3534k = true;
                    this.f3533j = true;
                    B();
                    final Handler handler = new Handler(Looper.getMainLooper());
                    final c cVar = new c(this);
                    this.f3527d.a(new s() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.5
                        @Override // androidx.lifecycle.s
                        public final void d(u uVar, k.b bVar) {
                            if (bVar == k.b.ON_DESTROY) {
                                handler.removeCallbacks(cVar);
                                uVar.a0().c(this);
                            }
                        }
                    });
                    handler.postDelayed(cVar, 10000L);
                    return;
                }
                return;
            }
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final long f(int i10) {
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void m(RecyclerView recyclerView) {
        boolean z10;
        if (this.f3532i == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        h1.f(z10);
        final b bVar = new b();
        this.f3532i = bVar;
        bVar.f3543d = b.a(recyclerView);
        d dVar = new d(bVar);
        bVar.f3540a = dVar;
        bVar.f3543d.f3558c.f3589a.add(dVar);
        e eVar = new e(bVar);
        bVar.f3541b = eVar;
        u(eVar);
        s sVar = new s() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3
            @Override // androidx.lifecycle.s
            public final void d(u uVar, k.b bVar2) {
                FragmentStateAdapter.b.this.b(false);
            }
        };
        bVar.f3542c = sVar;
        this.f3527d.a(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(f fVar, int i10) {
        boolean z10;
        Bundle bundle;
        f fVar2 = fVar;
        long j10 = fVar2.f2931e;
        int id2 = ((FrameLayout) fVar2.f2927a).getId();
        Long C = C(id2);
        if (C != null && C.longValue() != j10) {
            E(C.longValue());
            this.f3531h.h(C.longValue());
        }
        this.f3531h.g(j10, Integer.valueOf(id2));
        long j11 = i10;
        o0.e<r> eVar = this.f3529f;
        if (eVar.f22522a) {
            eVar.d();
        }
        if (hh.d.c(eVar.f22523b, eVar.f22525d, j11) >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            r A = A(i10);
            Bundle bundle2 = null;
            r.f fVar3 = (r.f) this.f3530g.e(j11, null);
            if (A.f2534s == null) {
                if (fVar3 != null && (bundle = fVar3.f2557a) != null) {
                    bundle2 = bundle;
                }
                A.f2509b = bundle2;
                this.f3529f.g(j11, A);
            } else {
                throw new IllegalStateException("Fragment already added");
            }
        }
        FrameLayout frameLayout = (FrameLayout) fVar2.f2927a;
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        if (o0.g.b(frameLayout)) {
            if (frameLayout.getParent() == null) {
                frameLayout.addOnLayoutChangeListener(new androidx.viewpager2.adapter.a(this, frameLayout, fVar2));
            } else {
                throw new IllegalStateException("Design assumption violated.");
            }
        }
        B();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.b0 o(RecyclerView recyclerView, int i10) {
        int i11 = f.f3555u;
        FrameLayout frameLayout = new FrameLayout(recyclerView.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        frameLayout.setId(o0.e.a());
        frameLayout.setSaveEnabled(false);
        return new f(frameLayout);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void p(RecyclerView recyclerView) {
        b bVar = this.f3532i;
        bVar.getClass();
        ViewPager2 a10 = b.a(recyclerView);
        a10.f3558c.f3589a.remove(bVar.f3540a);
        FragmentStateAdapter.this.x(bVar.f3541b);
        FragmentStateAdapter.this.f3527d.c(bVar.f3542c);
        bVar.f3543d = null;
        this.f3532i = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final /* bridge */ /* synthetic */ boolean q(f fVar) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void r(f fVar) {
        D(fVar);
        B();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void t(f fVar) {
        Long C = C(((FrameLayout) fVar.f2927a).getId());
        if (C != null) {
            E(C.longValue());
            this.f3531h.h(C.longValue());
        }
    }

    public final boolean z(long j10) {
        return j10 >= 0 && j10 < ((long) e());
    }
}
