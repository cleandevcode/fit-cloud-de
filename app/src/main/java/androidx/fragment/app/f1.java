package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.R;
import androidx.fragment.app.j0;
import androidx.fragment.app.r;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;

/* loaded from: classes.dex */
public abstract class f1 {

    /* renamed from: a */
    public final ViewGroup f2361a;

    /* renamed from: b */
    public final ArrayList<b> f2362b = new ArrayList<>();

    /* renamed from: c */
    public final ArrayList<b> f2363c = new ArrayList<>();

    /* renamed from: d */
    public boolean f2364d = false;

    /* renamed from: e */
    public boolean f2365e = false;

    /* loaded from: classes.dex */
    public static class a extends b {

        /* renamed from: h */
        public final q0 f2366h;

        public a(int i10, int i11, q0 q0Var, f1.d dVar) {
            super(i10, i11, q0Var.f2503c, dVar);
            this.f2366h = q0Var;
        }

        @Override // androidx.fragment.app.f1.b
        public final void b() {
            super.b();
            this.f2366h.k();
        }

        @Override // androidx.fragment.app.f1.b
        public final void d() {
            float f10;
            int i10 = this.f2368b;
            if (i10 == 2) {
                r rVar = this.f2366h.f2503c;
                View findFocus = rVar.H.findFocus();
                if (findFocus != null) {
                    rVar.e0().f2556m = findFocus;
                    if (j0.J(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + rVar);
                    }
                }
                View X0 = this.f2369c.X0();
                if (X0.getParent() == null) {
                    this.f2366h.b();
                    X0.setAlpha(0.0f);
                }
                if (X0.getAlpha() == 0.0f && X0.getVisibility() == 0) {
                    X0.setVisibility(4);
                }
                r.c cVar = rVar.Q;
                if (cVar == null) {
                    f10 = 1.0f;
                } else {
                    f10 = cVar.f2555l;
                }
                X0.setAlpha(f10);
            } else if (i10 == 3) {
                r rVar2 = this.f2366h.f2503c;
                View X02 = rVar2.X0();
                if (j0.J(2)) {
                    StringBuilder a10 = android.support.v4.media.d.a("Clearing focus ");
                    a10.append(X02.findFocus());
                    a10.append(" on view ");
                    a10.append(X02);
                    a10.append(" for Fragment ");
                    a10.append(rVar2);
                    Log.v("FragmentManager", a10.toString());
                }
                X02.clearFocus();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public int f2367a;

        /* renamed from: b */
        public int f2368b;

        /* renamed from: c */
        public final r f2369c;

        /* renamed from: d */
        public final ArrayList f2370d = new ArrayList();

        /* renamed from: e */
        public final HashSet<f1.d> f2371e = new HashSet<>();

        /* renamed from: f */
        public boolean f2372f = false;

        /* renamed from: g */
        public boolean f2373g = false;

        public b(int i10, int i11, r rVar, f1.d dVar) {
            this.f2367a = i10;
            this.f2368b = i11;
            this.f2369c = rVar;
            dVar.b(new g1((a) this));
        }

        public final void a() {
            if (this.f2372f) {
                return;
            }
            this.f2372f = true;
            if (this.f2371e.isEmpty()) {
                b();
                return;
            }
            Iterator it = new ArrayList(this.f2371e).iterator();
            while (it.hasNext()) {
                ((f1.d) it.next()).a();
            }
        }

        public void b() {
            if (this.f2373g) {
                return;
            }
            if (j0.J(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f2373g = true;
            Iterator it = this.f2370d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void c(int i10, int i11) {
            if (i11 != 0) {
                int i12 = i11 - 1;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            if (j0.J(2)) {
                                StringBuilder a10 = android.support.v4.media.d.a("SpecialEffectsController: For fragment ");
                                a10.append(this.f2369c);
                                a10.append(" mFinalState = ");
                                a10.append(i1.e(this.f2367a));
                                a10.append(" -> REMOVED. mLifecycleImpact  = ");
                                a10.append(h1.c(this.f2368b));
                                a10.append(" to REMOVING.");
                                Log.v("FragmentManager", a10.toString());
                            }
                            this.f2367a = 1;
                            this.f2368b = 3;
                            return;
                        }
                        return;
                    } else if (this.f2367a == 1) {
                        if (j0.J(2)) {
                            StringBuilder a11 = android.support.v4.media.d.a("SpecialEffectsController: For fragment ");
                            a11.append(this.f2369c);
                            a11.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                            a11.append(h1.c(this.f2368b));
                            a11.append(" to ADDING.");
                            Log.v("FragmentManager", a11.toString());
                        }
                        this.f2367a = 2;
                        this.f2368b = 2;
                        return;
                    } else {
                        return;
                    }
                } else if (this.f2367a != 1) {
                    if (j0.J(2)) {
                        StringBuilder a12 = android.support.v4.media.d.a("SpecialEffectsController: For fragment ");
                        a12.append(this.f2369c);
                        a12.append(" mFinalState = ");
                        a12.append(i1.e(this.f2367a));
                        a12.append(" -> ");
                        a12.append(i1.e(i10));
                        a12.append(". ");
                        Log.v("FragmentManager", a12.toString());
                    }
                    this.f2367a = i10;
                    return;
                } else {
                    return;
                }
            }
            throw null;
        }

        public void d() {
        }

        public final String toString() {
            StringBuilder a10 = p.a.a("Operation ", "{");
            a10.append(Integer.toHexString(System.identityHashCode(this)));
            a10.append("} ");
            a10.append("{");
            a10.append("mFinalState = ");
            a10.append(i1.e(this.f2367a));
            a10.append("} ");
            a10.append("{");
            a10.append("mLifecycleImpact = ");
            a10.append(h1.c(this.f2368b));
            a10.append("} ");
            a10.append("{");
            a10.append("mFragment = ");
            return n.a(a10, this.f2369c, "}");
        }
    }

    public f1(ViewGroup viewGroup) {
        this.f2361a = viewGroup;
    }

    public static f1 f(ViewGroup viewGroup, j1 j1Var) {
        int i10 = R.id.special_effects_controller_view_tag;
        Object tag = viewGroup.getTag(i10);
        if (tag instanceof f1) {
            return (f1) tag;
        }
        ((j0.e) j1Var).getClass();
        m mVar = new m(viewGroup);
        viewGroup.setTag(i10, mVar);
        return mVar;
    }

    public final void a(int i10, int i11, q0 q0Var) {
        synchronized (this.f2362b) {
            f1.d dVar = new f1.d();
            b d10 = d(q0Var.f2503c);
            if (d10 != null) {
                d10.c(i10, i11);
                return;
            }
            a aVar = new a(i10, i11, q0Var, dVar);
            this.f2362b.add(aVar);
            aVar.f2370d.add(new d1(this, aVar));
            aVar.f2370d.add(new e1(this, aVar));
        }
    }

    public abstract void b(ArrayList arrayList, boolean z10);

    public final void c() {
        if (this.f2365e) {
            return;
        }
        ViewGroup viewGroup = this.f2361a;
        WeakHashMap<View, i2> weakHashMap = k1.o0.f18161a;
        if (!o0.g.b(viewGroup)) {
            e();
            this.f2364d = false;
            return;
        }
        synchronized (this.f2362b) {
            if (!this.f2362b.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f2363c);
                this.f2363c.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    if (j0.J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + bVar);
                    }
                    bVar.a();
                    if (!bVar.f2373g) {
                        this.f2363c.add(bVar);
                    }
                }
                h();
                ArrayList arrayList2 = new ArrayList(this.f2362b);
                this.f2362b.clear();
                this.f2363c.addAll(arrayList2);
                if (j0.J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((b) it2.next()).d();
                }
                b(arrayList2, this.f2364d);
                this.f2364d = false;
                if (j0.J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                }
            }
        }
    }

    public final b d(r rVar) {
        Iterator<b> it = this.f2362b.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f2369c.equals(rVar) && !next.f2372f) {
                return next;
            }
        }
        return null;
    }

    public final void e() {
        String str;
        String str2;
        if (j0.J(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f2361a;
        WeakHashMap<View, i2> weakHashMap = k1.o0.f18161a;
        boolean b10 = o0.g.b(viewGroup);
        synchronized (this.f2362b) {
            h();
            Iterator<b> it = this.f2362b.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
            Iterator it2 = new ArrayList(this.f2363c).iterator();
            while (it2.hasNext()) {
                b bVar = (b) it2.next();
                if (j0.J(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (b10) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f2361a + " is not attached to window. ";
                    }
                    sb2.append(str2);
                    sb2.append("Cancelling running operation ");
                    sb2.append(bVar);
                    Log.v("FragmentManager", sb2.toString());
                }
                bVar.a();
            }
            Iterator it3 = new ArrayList(this.f2362b).iterator();
            while (it3.hasNext()) {
                b bVar2 = (b) it3.next();
                if (j0.J(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: ");
                    if (b10) {
                        str = "";
                    } else {
                        str = "Container " + this.f2361a + " is not attached to window. ";
                    }
                    sb3.append(str);
                    sb3.append("Cancelling pending operation ");
                    sb3.append(bVar2);
                    Log.v("FragmentManager", sb3.toString());
                }
                bVar2.a();
            }
        }
    }

    public final void g() {
        synchronized (this.f2362b) {
            h();
            this.f2365e = false;
            int size = this.f2362b.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                b bVar = this.f2362b.get(size);
                int c10 = i1.c(bVar.f2369c.H);
                if (bVar.f2367a == 2 && c10 != 2) {
                    r.c cVar = bVar.f2369c.Q;
                    this.f2365e = false;
                    break;
                }
            }
        }
    }

    public final void h() {
        Iterator<b> it = this.f2362b.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f2368b == 2) {
                next.c(i1.b(next.f2369c.X0().getVisibility()), 1);
            }
        }
    }
}
