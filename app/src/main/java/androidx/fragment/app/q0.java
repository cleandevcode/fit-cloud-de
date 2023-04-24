package androidx.fragment.app;

import a2.b;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.e2;
import androidx.fragment.R;
import androidx.fragment.app.f1;
import androidx.fragment.app.r;
import androidx.lifecycle.k;
import e2.b;
import java.util.Iterator;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a */
    public final f0 f2501a;

    /* renamed from: b */
    public final r0 f2502b;

    /* renamed from: c */
    public final r f2503c;

    /* renamed from: d */
    public boolean f2504d = false;

    /* renamed from: e */
    public int f2505e = -1;

    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final /* synthetic */ View f2506a;

        public a(View view) {
            this.f2506a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            this.f2506a.removeOnAttachStateChangeListener(this);
            View view2 = this.f2506a;
            WeakHashMap<View, i2> weakHashMap = k1.o0.f18161a;
            o0.h.c(view2);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public q0(f0 f0Var, r0 r0Var, r rVar) {
        this.f2501a = f0Var;
        this.f2502b = r0Var;
        this.f2503c = rVar;
    }

    public q0(f0 f0Var, r0 r0Var, r rVar, p0 p0Var) {
        this.f2501a = f0Var;
        this.f2502b = r0Var;
        this.f2503c = rVar;
        rVar.f2510c = null;
        rVar.f2512d = null;
        rVar.f2533r = 0;
        rVar.f2530o = false;
        rVar.f2526k = false;
        r rVar2 = rVar.f2518g;
        rVar.f2520h = rVar2 != null ? rVar2.f2514e : null;
        rVar.f2518g = null;
        Bundle bundle = p0Var.f2499m;
        rVar.f2509b = bundle == null ? new Bundle() : bundle;
    }

    public q0(f0 f0Var, r0 r0Var, ClassLoader classLoader, c0 c0Var, p0 p0Var) {
        this.f2501a = f0Var;
        this.f2502b = r0Var;
        r a10 = p0Var.a(c0Var, classLoader);
        this.f2503c = a10;
        if (j0.J(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a10);
        }
    }

    public final void a() {
        if (j0.J(3)) {
            StringBuilder a10 = android.support.v4.media.d.a("moveto ACTIVITY_CREATED: ");
            a10.append(this.f2503c);
            Log.d("FragmentManager", a10.toString());
        }
        r rVar = this.f2503c;
        Bundle bundle = rVar.f2509b;
        rVar.f2536u.Q();
        rVar.f2508a = 3;
        rVar.E = false;
        rVar.x0();
        if (rVar.E) {
            if (j0.J(3)) {
                Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + rVar);
            }
            View view = rVar.H;
            if (view != null) {
                Bundle bundle2 = rVar.f2509b;
                SparseArray<Parcelable> sparseArray = rVar.f2510c;
                if (sparseArray != null) {
                    view.restoreHierarchyState(sparseArray);
                    rVar.f2510c = null;
                }
                if (rVar.H != null) {
                    a1 a1Var = rVar.f2511c0;
                    a1Var.f2314e.b(rVar.f2512d);
                    rVar.f2512d = null;
                }
                rVar.E = false;
                rVar.P0(bundle2);
                if (rVar.E) {
                    if (rVar.H != null) {
                        rVar.f2511c0.c(k.b.ON_CREATE);
                    }
                } else {
                    throw new k1(p.a("Fragment ", rVar, " did not call through to super.onViewStateRestored()"));
                }
            }
            rVar.f2509b = null;
            k0 k0Var = rVar.f2536u;
            k0Var.F = false;
            k0Var.G = false;
            k0Var.M.f2465i = false;
            k0Var.u(4);
            f0 f0Var = this.f2501a;
            Bundle bundle3 = this.f2503c.f2509b;
            f0Var.a(false);
            return;
        }
        throw new k1(p.a("Fragment ", rVar, " did not call through to super.onActivityCreated()"));
    }

    public final void b() {
        View view;
        View view2;
        r0 r0Var = this.f2502b;
        r rVar = this.f2503c;
        r0Var.getClass();
        ViewGroup viewGroup = rVar.F;
        int i10 = -1;
        if (viewGroup != null) {
            int indexOf = r0Var.f2558a.indexOf(rVar);
            int i11 = indexOf - 1;
            while (true) {
                if (i11 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= r0Var.f2558a.size()) {
                            break;
                        }
                        r rVar2 = r0Var.f2558a.get(indexOf);
                        if (rVar2.F == viewGroup && (view = rVar2.H) != null) {
                            i10 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    r rVar3 = r0Var.f2558a.get(i11);
                    if (rVar3.F == viewGroup && (view2 = rVar3.H) != null) {
                        i10 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i11--;
                }
            }
        }
        r rVar4 = this.f2503c;
        rVar4.F.addView(rVar4.H, i10);
    }

    public final void c() {
        if (j0.J(3)) {
            StringBuilder a10 = android.support.v4.media.d.a("moveto ATTACHED: ");
            a10.append(this.f2503c);
            Log.d("FragmentManager", a10.toString());
        }
        r rVar = this.f2503c;
        r rVar2 = rVar.f2518g;
        q0 q0Var = null;
        if (rVar2 != null) {
            q0 q0Var2 = this.f2502b.f2559b.get(rVar2.f2514e);
            if (q0Var2 != null) {
                r rVar3 = this.f2503c;
                rVar3.f2520h = rVar3.f2518g.f2514e;
                rVar3.f2518g = null;
                q0Var = q0Var2;
            } else {
                StringBuilder a11 = android.support.v4.media.d.a("Fragment ");
                a11.append(this.f2503c);
                a11.append(" declared target fragment ");
                throw new IllegalStateException(n.a(a11, this.f2503c.f2518g, " that does not belong to this FragmentManager!"));
            }
        } else {
            String str = rVar.f2520h;
            if (str != null && (q0Var = this.f2502b.f2559b.get(str)) == null) {
                StringBuilder a12 = android.support.v4.media.d.a("Fragment ");
                a12.append(this.f2503c);
                a12.append(" declared target fragment ");
                throw new IllegalStateException(androidx.activity.e.b(a12, this.f2503c.f2520h, " that does not belong to this FragmentManager!"));
            }
        }
        if (q0Var != null) {
            q0Var.k();
        }
        r rVar4 = this.f2503c;
        j0 j0Var = rVar4.f2534s;
        rVar4.f2535t = j0Var.f2413u;
        rVar4.f2537v = j0Var.f2415w;
        this.f2501a.g(false);
        r rVar5 = this.f2503c;
        Iterator<r.e> it = rVar5.f2523i0.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        rVar5.f2523i0.clear();
        rVar5.f2536u.c(rVar5.f2535t, rVar5.c0(), rVar5);
        rVar5.f2508a = 0;
        rVar5.E = false;
        rVar5.A0(rVar5.f2535t.f2340b);
        if (rVar5.E) {
            j0 j0Var2 = rVar5.f2534s;
            Iterator<n0> it2 = j0Var2.f2406n.iterator();
            while (it2.hasNext()) {
                it2.next().f(j0Var2, rVar5);
            }
            k0 k0Var = rVar5.f2536u;
            k0Var.F = false;
            k0Var.G = false;
            k0Var.M.f2465i = false;
            k0Var.u(0);
            this.f2501a.b(false);
            return;
        }
        throw new k1(p.a("Fragment ", rVar5, " did not call through to super.onAttach()"));
    }

    public final int d() {
        r rVar = this.f2503c;
        if (rVar.f2534s == null) {
            return rVar.f2508a;
        }
        int i10 = this.f2505e;
        int ordinal = rVar.Y.ordinal();
        int i11 = 0;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        i10 = Math.min(i10, -1);
                    }
                } else {
                    i10 = Math.min(i10, 5);
                }
            } else {
                i10 = Math.min(i10, 1);
            }
        } else {
            i10 = Math.min(i10, 0);
        }
        r rVar2 = this.f2503c;
        if (rVar2.f2529n) {
            if (rVar2.f2530o) {
                i10 = Math.max(this.f2505e, 2);
                View view = this.f2503c.H;
                if (view != null && view.getParent() == null) {
                    i10 = Math.min(i10, 2);
                }
            } else {
                i10 = this.f2505e < 4 ? Math.min(i10, rVar2.f2508a) : Math.min(i10, 1);
            }
        }
        if (!this.f2503c.f2526k) {
            i10 = Math.min(i10, 1);
        }
        r rVar3 = this.f2503c;
        ViewGroup viewGroup = rVar3.F;
        f1.b bVar = null;
        if (viewGroup != null) {
            f1 f10 = f1.f(viewGroup, rVar3.m0().H());
            f10.getClass();
            f1.b d10 = f10.d(this.f2503c);
            if (d10 != null) {
                i11 = d10.f2368b;
            }
            r rVar4 = this.f2503c;
            Iterator<f1.b> it = f10.f2363c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                f1.b next = it.next();
                if (next.f2369c.equals(rVar4) && !next.f2372f) {
                    bVar = next;
                    break;
                }
            }
            if (bVar != null && (i11 == 0 || i11 == 1)) {
                i11 = bVar.f2368b;
            }
        }
        if (i11 == 2) {
            i10 = Math.min(i10, 6);
        } else if (i11 == 3) {
            i10 = Math.max(i10, 3);
        } else {
            r rVar5 = this.f2503c;
            if (rVar5.f2527l) {
                if (rVar5.v0()) {
                    i10 = Math.min(i10, 1);
                } else {
                    i10 = Math.min(i10, -1);
                }
            }
        }
        r rVar6 = this.f2503c;
        if (rVar6.L && rVar6.f2508a < 5) {
            i10 = Math.min(i10, 4);
        }
        if (j0.J(2)) {
            StringBuilder a10 = e2.a("computeExpectedState() of ", i10, " for ");
            a10.append(this.f2503c);
            Log.v("FragmentManager", a10.toString());
        }
        return i10;
    }

    public final void e() {
        Parcelable parcelable;
        if (j0.J(3)) {
            StringBuilder a10 = android.support.v4.media.d.a("moveto CREATED: ");
            a10.append(this.f2503c);
            Log.d("FragmentManager", a10.toString());
        }
        r rVar = this.f2503c;
        if (!rVar.W) {
            this.f2501a.h(false);
            final r rVar2 = this.f2503c;
            Bundle bundle = rVar2.f2509b;
            rVar2.f2536u.Q();
            rVar2.f2508a = 1;
            rVar2.E = false;
            rVar2.Z.a(new androidx.lifecycle.s() { // from class: androidx.fragment.app.Fragment$6
                @Override // androidx.lifecycle.s
                public final void d(androidx.lifecycle.u uVar, k.b bVar) {
                    View view;
                    if (bVar != k.b.ON_STOP || (view = r.this.H) == null) {
                        return;
                    }
                    view.cancelPendingInputEvents();
                }
            });
            rVar2.f2517f0.b(bundle);
            rVar2.B0(bundle);
            rVar2.W = true;
            if (rVar2.E) {
                rVar2.Z.f(k.b.ON_CREATE);
                f0 f0Var = this.f2501a;
                Bundle bundle2 = this.f2503c.f2509b;
                f0Var.c(false);
                return;
            }
            throw new k1(p.a("Fragment ", rVar2, " did not call through to super.onCreate()"));
        }
        Bundle bundle3 = rVar.f2509b;
        if (bundle3 != null && (parcelable = bundle3.getParcelable("android:support:fragments")) != null) {
            rVar.f2536u.W(parcelable);
            k0 k0Var = rVar.f2536u;
            k0Var.F = false;
            k0Var.G = false;
            k0Var.M.f2465i = false;
            k0Var.u(1);
        }
        this.f2503c.f2508a = 1;
    }

    public final void f() {
        String str;
        if (this.f2503c.f2529n) {
            return;
        }
        if (j0.J(3)) {
            StringBuilder a10 = android.support.v4.media.d.a("moveto CREATE_VIEW: ");
            a10.append(this.f2503c);
            Log.d("FragmentManager", a10.toString());
        }
        r rVar = this.f2503c;
        LayoutInflater G0 = rVar.G0(rVar.f2509b);
        rVar.V = G0;
        ViewGroup viewGroup = null;
        r rVar2 = this.f2503c;
        ViewGroup viewGroup2 = rVar2.F;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i10 = rVar2.f2539x;
            if (i10 != 0) {
                if (i10 != -1) {
                    viewGroup = (ViewGroup) rVar2.f2534s.f2414v.u(i10);
                    if (viewGroup == null) {
                        r rVar3 = this.f2503c;
                        if (!rVar3.f2531p) {
                            try {
                                str = rVar3.n0().getResourceName(this.f2503c.f2539x);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            StringBuilder a11 = android.support.v4.media.d.a("No view found for id 0x");
                            a11.append(Integer.toHexString(this.f2503c.f2539x));
                            a11.append(" (");
                            a11.append(str);
                            a11.append(") for fragment ");
                            a11.append(this.f2503c);
                            throw new IllegalArgumentException(a11.toString());
                        }
                    } else if (!(viewGroup instanceof FragmentContainerView)) {
                        r rVar4 = this.f2503c;
                        b.c cVar = a2.b.f241a;
                        gm.l.f(rVar4, "fragment");
                        a2.a aVar = new a2.a(rVar4, viewGroup);
                        a2.b.c(aVar);
                        b.c a12 = a2.b.a(rVar4);
                        if (a12.f250a.contains(b.a.DETECT_WRONG_FRAGMENT_CONTAINER) && a2.b.f(a12, rVar4.getClass(), a2.a.class)) {
                            a2.b.b(a12, aVar);
                        }
                    }
                } else {
                    throw new IllegalArgumentException(n.a(android.support.v4.media.d.a("Cannot create fragment "), this.f2503c, " for a container view with no id"));
                }
            }
        }
        r rVar5 = this.f2503c;
        rVar5.F = viewGroup;
        rVar5.Q0(G0, viewGroup, rVar5.f2509b);
        View view = this.f2503c.H;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            r rVar6 = this.f2503c;
            rVar6.H.setTag(R.id.fragment_container_view_tag, rVar6);
            if (viewGroup != null) {
                b();
            }
            r rVar7 = this.f2503c;
            if (rVar7.f2541z) {
                rVar7.H.setVisibility(8);
            }
            View view2 = this.f2503c.H;
            WeakHashMap<View, i2> weakHashMap = k1.o0.f18161a;
            if (o0.g.b(view2)) {
                o0.h.c(this.f2503c.H);
            } else {
                View view3 = this.f2503c.H;
                view3.addOnAttachStateChangeListener(new a(view3));
            }
            r rVar8 = this.f2503c;
            rVar8.O0(rVar8.H, rVar8.f2509b);
            rVar8.f2536u.u(2);
            f0 f0Var = this.f2501a;
            r rVar9 = this.f2503c;
            f0Var.m(rVar9, rVar9.H, false);
            int visibility = this.f2503c.H.getVisibility();
            this.f2503c.e0().f2555l = this.f2503c.H.getAlpha();
            r rVar10 = this.f2503c;
            if (rVar10.F != null && visibility == 0) {
                View findFocus = rVar10.H.findFocus();
                if (findFocus != null) {
                    this.f2503c.e0().f2556m = findFocus;
                    if (j0.J(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f2503c);
                    }
                }
                this.f2503c.H.setAlpha(0.0f);
            }
        }
        this.f2503c.f2508a = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.q0.g():void");
    }

    public final void h() {
        View view;
        if (j0.J(3)) {
            StringBuilder a10 = android.support.v4.media.d.a("movefrom CREATE_VIEW: ");
            a10.append(this.f2503c);
            Log.d("FragmentManager", a10.toString());
        }
        r rVar = this.f2503c;
        ViewGroup viewGroup = rVar.F;
        if (viewGroup != null && (view = rVar.H) != null) {
            viewGroup.removeView(view);
        }
        r rVar2 = this.f2503c;
        rVar2.f2536u.u(1);
        if (rVar2.H != null) {
            a1 a1Var = rVar2.f2511c0;
            a1Var.d();
            if (a1Var.f2313d.f2790c.a(k.c.CREATED)) {
                rVar2.f2511c0.c(k.b.ON_DESTROY);
            }
        }
        rVar2.f2508a = 1;
        rVar2.E = false;
        rVar2.E0();
        if (rVar2.E) {
            b.c cVar = e2.a.a(rVar2).f13322b;
            int f10 = cVar.f13332d.f();
            for (int i10 = 0; i10 < f10; i10++) {
                cVar.f13332d.g(i10).l();
            }
            rVar2.f2532q = false;
            this.f2501a.n(false);
            r rVar3 = this.f2503c;
            rVar3.F = null;
            rVar3.H = null;
            rVar3.f2511c0 = null;
            rVar3.f2513d0.j(null);
            this.f2503c.f2530o = false;
            return;
        }
        throw new k1(p.a("Fragment ", rVar2, " did not call through to super.onDestroyView()"));
    }

    public final void i() {
        if (j0.J(3)) {
            StringBuilder a10 = android.support.v4.media.d.a("movefrom ATTACHED: ");
            a10.append(this.f2503c);
            Log.d("FragmentManager", a10.toString());
        }
        r rVar = this.f2503c;
        rVar.f2508a = -1;
        boolean z10 = false;
        rVar.E = false;
        rVar.F0();
        rVar.V = null;
        if (rVar.E) {
            k0 k0Var = rVar.f2536u;
            if (!k0Var.H) {
                k0Var.l();
                rVar.f2536u = new k0();
            }
            this.f2501a.e(false);
            r rVar2 = this.f2503c;
            rVar2.f2508a = -1;
            rVar2.f2535t = null;
            rVar2.f2537v = null;
            rVar2.f2534s = null;
            boolean z11 = true;
            if (rVar2.f2527l && !rVar2.v0()) {
                z10 = true;
            }
            if (!z10) {
                m0 m0Var = this.f2502b.f2561d;
                if (m0Var.f2460d.containsKey(this.f2503c.f2514e) && m0Var.f2463g) {
                    z11 = m0Var.f2464h;
                }
                if (!z11) {
                    return;
                }
            }
            if (j0.J(3)) {
                StringBuilder a11 = android.support.v4.media.d.a("initState called for fragment: ");
                a11.append(this.f2503c);
                Log.d("FragmentManager", a11.toString());
            }
            this.f2503c.s0();
            return;
        }
        throw new k1(p.a("Fragment ", rVar, " did not call through to super.onDetach()"));
    }

    public final void j() {
        r rVar = this.f2503c;
        if (rVar.f2529n && rVar.f2530o && !rVar.f2532q) {
            if (j0.J(3)) {
                StringBuilder a10 = android.support.v4.media.d.a("moveto CREATE_VIEW: ");
                a10.append(this.f2503c);
                Log.d("FragmentManager", a10.toString());
            }
            r rVar2 = this.f2503c;
            LayoutInflater G0 = rVar2.G0(rVar2.f2509b);
            rVar2.V = G0;
            rVar2.Q0(G0, null, this.f2503c.f2509b);
            View view = this.f2503c.H;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                r rVar3 = this.f2503c;
                rVar3.H.setTag(R.id.fragment_container_view_tag, rVar3);
                r rVar4 = this.f2503c;
                if (rVar4.f2541z) {
                    rVar4.H.setVisibility(8);
                }
                r rVar5 = this.f2503c;
                rVar5.O0(rVar5.H, rVar5.f2509b);
                rVar5.f2536u.u(2);
                f0 f0Var = this.f2501a;
                r rVar6 = this.f2503c;
                f0Var.m(rVar6, rVar6.H, false);
                this.f2503c.f2508a = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f2504d) {
            if (j0.J(2)) {
                StringBuilder a10 = android.support.v4.media.d.a("Ignoring re-entrant call to moveToExpectedState() for ");
                a10.append(this.f2503c);
                Log.v("FragmentManager", a10.toString());
                return;
            }
            return;
        }
        try {
            this.f2504d = true;
            boolean z10 = false;
            while (true) {
                int d10 = d();
                r rVar = this.f2503c;
                int i10 = rVar.f2508a;
                if (d10 != i10) {
                    if (d10 > i10) {
                        switch (i10 + 1) {
                            case 0:
                                c();
                                continue;
                            case 1:
                                e();
                                continue;
                            case 2:
                                j();
                                f();
                                continue;
                            case 3:
                                a();
                                continue;
                            case 4:
                                if (rVar.H != null && (viewGroup3 = rVar.F) != null) {
                                    f1 f10 = f1.f(viewGroup3, rVar.m0().H());
                                    int b10 = i1.b(this.f2503c.H.getVisibility());
                                    f10.getClass();
                                    if (j0.J(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + this.f2503c);
                                    }
                                    f10.a(b10, 2, this);
                                }
                                this.f2503c.f2508a = 4;
                                continue;
                            case 5:
                                r();
                                continue;
                            case 6:
                                rVar.f2508a = 6;
                                continue;
                            case 7:
                                n();
                                continue;
                            default:
                                continue;
                        }
                    } else {
                        switch (i10 - 1) {
                            case -1:
                                i();
                                continue;
                            case 0:
                                if (rVar.f2528m) {
                                    if (this.f2502b.f2560c.get(rVar.f2514e) == null) {
                                        p();
                                    }
                                }
                                g();
                                continue;
                            case 1:
                                h();
                                this.f2503c.f2508a = 1;
                                continue;
                            case 2:
                                rVar.f2530o = false;
                                rVar.f2508a = 2;
                                continue;
                            case 3:
                                if (j0.J(3)) {
                                    Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f2503c);
                                }
                                r rVar2 = this.f2503c;
                                if (rVar2.f2528m) {
                                    p();
                                } else if (rVar2.H != null && rVar2.f2510c == null) {
                                    q();
                                }
                                r rVar3 = this.f2503c;
                                if (rVar3.H != null && (viewGroup2 = rVar3.F) != null) {
                                    f1 f11 = f1.f(viewGroup2, rVar3.m0().H());
                                    f11.getClass();
                                    if (j0.J(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + this.f2503c);
                                    }
                                    f11.a(1, 3, this);
                                }
                                this.f2503c.f2508a = 3;
                                continue;
                            case 4:
                                s();
                                continue;
                            case 5:
                                rVar.f2508a = 5;
                                continue;
                            case 6:
                                l();
                                continue;
                            default:
                                continue;
                        }
                    }
                    z10 = true;
                } else {
                    if (!z10 && i10 == -1 && rVar.f2527l && !rVar.v0() && !this.f2503c.f2528m) {
                        if (j0.J(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f2503c);
                        }
                        this.f2502b.f2561d.f(this.f2503c);
                        this.f2502b.h(this);
                        if (j0.J(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f2503c);
                        }
                        this.f2503c.s0();
                    }
                    r rVar4 = this.f2503c;
                    if (rVar4.U) {
                        if (rVar4.H != null && (viewGroup = rVar4.F) != null) {
                            f1 f12 = f1.f(viewGroup, rVar4.m0().H());
                            if (this.f2503c.f2541z) {
                                f12.getClass();
                                if (j0.J(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + this.f2503c);
                                }
                                f12.a(3, 1, this);
                            } else {
                                f12.getClass();
                                if (j0.J(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + this.f2503c);
                                }
                                f12.a(2, 1, this);
                            }
                        }
                        r rVar5 = this.f2503c;
                        j0 j0Var = rVar5.f2534s;
                        if (j0Var != null && rVar5.f2526k && j0.K(rVar5)) {
                            j0Var.E = true;
                        }
                        r rVar6 = this.f2503c;
                        rVar6.U = false;
                        rVar6.f2536u.o();
                    }
                    return;
                }
            }
        } finally {
            this.f2504d = false;
        }
    }

    public final void l() {
        if (j0.J(3)) {
            StringBuilder a10 = android.support.v4.media.d.a("movefrom RESUMED: ");
            a10.append(this.f2503c);
            Log.d("FragmentManager", a10.toString());
        }
        r rVar = this.f2503c;
        rVar.f2536u.u(5);
        if (rVar.H != null) {
            rVar.f2511c0.c(k.b.ON_PAUSE);
        }
        rVar.Z.f(k.b.ON_PAUSE);
        rVar.f2508a = 6;
        rVar.E = false;
        rVar.I0();
        if (rVar.E) {
            this.f2501a.f(false);
            return;
        }
        throw new k1(p.a("Fragment ", rVar, " did not call through to super.onPause()"));
    }

    public final void m(ClassLoader classLoader) {
        Bundle bundle = this.f2503c.f2509b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        r rVar = this.f2503c;
        rVar.f2510c = rVar.f2509b.getSparseParcelableArray("android:view_state");
        r rVar2 = this.f2503c;
        rVar2.f2512d = rVar2.f2509b.getBundle("android:view_registry_state");
        r rVar3 = this.f2503c;
        rVar3.f2520h = rVar3.f2509b.getString("android:target_state");
        r rVar4 = this.f2503c;
        if (rVar4.f2520h != null) {
            rVar4.f2522i = rVar4.f2509b.getInt("android:target_req_state", 0);
        }
        r rVar5 = this.f2503c;
        rVar5.getClass();
        rVar5.M = rVar5.f2509b.getBoolean("android:user_visible_hint", true);
        r rVar6 = this.f2503c;
        if (rVar6.M) {
            return;
        }
        rVar6.L = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n() {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.q0.n():void");
    }

    public final Bundle o() {
        Bundle bundle = new Bundle();
        r rVar = this.f2503c;
        rVar.L0(bundle);
        rVar.f2517f0.c(bundle);
        bundle.putParcelable("android:support:fragments", rVar.f2536u.X());
        this.f2501a.j(false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f2503c.H != null) {
            q();
        }
        if (this.f2503c.f2510c != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f2503c.f2510c);
        }
        if (this.f2503c.f2512d != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f2503c.f2512d);
        }
        if (!this.f2503c.M) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f2503c.M);
        }
        return bundle;
    }

    public final void p() {
        p0 p0Var = new p0(this.f2503c);
        r rVar = this.f2503c;
        if (rVar.f2508a <= -1 || p0Var.f2499m != null) {
            p0Var.f2499m = rVar.f2509b;
        } else {
            Bundle o10 = o();
            p0Var.f2499m = o10;
            if (this.f2503c.f2520h != null) {
                if (o10 == null) {
                    p0Var.f2499m = new Bundle();
                }
                p0Var.f2499m.putString("android:target_state", this.f2503c.f2520h);
                int i10 = this.f2503c.f2522i;
                if (i10 != 0) {
                    p0Var.f2499m.putInt("android:target_req_state", i10);
                }
            }
        }
        this.f2502b.i(this.f2503c.f2514e, p0Var);
    }

    public final void q() {
        if (this.f2503c.H == null) {
            return;
        }
        if (j0.J(2)) {
            StringBuilder a10 = android.support.v4.media.d.a("Saving view state for fragment ");
            a10.append(this.f2503c);
            a10.append(" with view ");
            a10.append(this.f2503c.H);
            Log.v("FragmentManager", a10.toString());
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f2503c.H.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f2503c.f2510c = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f2503c.f2511c0.f2314e.c(bundle);
        if (!bundle.isEmpty()) {
            this.f2503c.f2512d = bundle;
        }
    }

    public final void r() {
        if (j0.J(3)) {
            StringBuilder a10 = android.support.v4.media.d.a("moveto STARTED: ");
            a10.append(this.f2503c);
            Log.d("FragmentManager", a10.toString());
        }
        r rVar = this.f2503c;
        rVar.f2536u.Q();
        rVar.f2536u.y(true);
        rVar.f2508a = 5;
        rVar.E = false;
        rVar.M0();
        if (rVar.E) {
            androidx.lifecycle.v vVar = rVar.Z;
            k.b bVar = k.b.ON_START;
            vVar.f(bVar);
            if (rVar.H != null) {
                rVar.f2511c0.c(bVar);
            }
            k0 k0Var = rVar.f2536u;
            k0Var.F = false;
            k0Var.G = false;
            k0Var.M.f2465i = false;
            k0Var.u(5);
            this.f2501a.k(false);
            return;
        }
        throw new k1(p.a("Fragment ", rVar, " did not call through to super.onStart()"));
    }

    public final void s() {
        if (j0.J(3)) {
            StringBuilder a10 = android.support.v4.media.d.a("movefrom STARTED: ");
            a10.append(this.f2503c);
            Log.d("FragmentManager", a10.toString());
        }
        r rVar = this.f2503c;
        k0 k0Var = rVar.f2536u;
        k0Var.G = true;
        k0Var.M.f2465i = true;
        k0Var.u(4);
        if (rVar.H != null) {
            rVar.f2511c0.c(k.b.ON_STOP);
        }
        rVar.Z.f(k.b.ON_STOP);
        rVar.f2508a = 4;
        rVar.E = false;
        rVar.N0();
        if (rVar.E) {
            this.f2501a.l(false);
            return;
        }
        throw new k1(p.a("Fragment ", rVar, " did not call through to super.onStop()"));
    }
}
