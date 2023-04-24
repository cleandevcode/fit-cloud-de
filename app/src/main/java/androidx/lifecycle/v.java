package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.os.Looper;
import androidx.lifecycle.k;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import n.b;

/* loaded from: classes.dex */
public final class v extends k {

    /* renamed from: d */
    public final WeakReference<u> f2791d;

    /* renamed from: b */
    public n.a<t, a> f2789b = new n.a<>();

    /* renamed from: e */
    public int f2792e = 0;

    /* renamed from: f */
    public boolean f2793f = false;

    /* renamed from: g */
    public boolean f2794g = false;

    /* renamed from: h */
    public ArrayList<k.c> f2795h = new ArrayList<>();

    /* renamed from: c */
    public k.c f2790c = k.c.INITIALIZED;

    /* renamed from: i */
    public final boolean f2796i = true;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public k.c f2797a;

        /* renamed from: b */
        public s f2798b;

        public a(t tVar, k.c cVar) {
            s reflectiveGenericLifecycleObserver;
            HashMap hashMap = y.f2808a;
            boolean z10 = tVar instanceof s;
            boolean z11 = tVar instanceof g;
            if (z10 && z11) {
                reflectiveGenericLifecycleObserver = new FullLifecycleObserverAdapter((g) tVar, (s) tVar);
            } else if (z11) {
                reflectiveGenericLifecycleObserver = new FullLifecycleObserverAdapter((g) tVar, null);
            } else if (z10) {
                reflectiveGenericLifecycleObserver = (s) tVar;
            } else {
                Class<?> cls = tVar.getClass();
                if (y.c(cls) == 2) {
                    List list = (List) y.f2809b.get(cls);
                    if (list.size() == 1) {
                        reflectiveGenericLifecycleObserver = new SingleGeneratedAdapterObserver(y.a((Constructor) list.get(0), tVar));
                    } else {
                        h[] hVarArr = new h[list.size()];
                        for (int i10 = 0; i10 < list.size(); i10++) {
                            hVarArr[i10] = y.a((Constructor) list.get(i10), tVar);
                        }
                        reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(hVarArr);
                    }
                } else {
                    reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(tVar);
                }
            }
            this.f2798b = reflectiveGenericLifecycleObserver;
            this.f2797a = cVar;
        }

        public final void a(u uVar, k.b bVar) {
            k.c a10 = bVar.a();
            k.c cVar = this.f2797a;
            if (a10.compareTo(cVar) < 0) {
                cVar = a10;
            }
            this.f2797a = cVar;
            this.f2798b.d(uVar, bVar);
            this.f2797a = a10;
        }
    }

    public v(u uVar) {
        this.f2791d = new WeakReference<>(uVar);
    }

    @Override // androidx.lifecycle.k
    public final void a(t tVar) {
        u uVar;
        boolean z10;
        k.b bVar;
        ArrayList<k.c> arrayList;
        e("addObserver");
        k.c cVar = this.f2790c;
        k.c cVar2 = k.c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = k.c.INITIALIZED;
        }
        a aVar = new a(tVar, cVar2);
        if (this.f2789b.e(tVar, aVar) != null || (uVar = this.f2791d.get()) == null) {
            return;
        }
        if (this.f2792e == 0 && !this.f2793f) {
            z10 = false;
        } else {
            z10 = true;
        }
        k.c d10 = d(tVar);
        this.f2792e++;
        while (aVar.f2797a.compareTo(d10) < 0 && this.f2789b.f21895e.containsKey(tVar)) {
            this.f2795h.add(aVar.f2797a);
            int ordinal = aVar.f2797a.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        bVar = null;
                    } else {
                        bVar = k.b.ON_RESUME;
                    }
                } else {
                    bVar = k.b.ON_START;
                }
            } else {
                bVar = k.b.ON_CREATE;
            }
            if (bVar != null) {
                aVar.a(uVar, bVar);
                this.f2795h.remove(arrayList.size() - 1);
                d10 = d(tVar);
            } else {
                StringBuilder a10 = android.support.v4.media.d.a("no event up from ");
                a10.append(aVar.f2797a);
                throw new IllegalStateException(a10.toString());
            }
        }
        if (!z10) {
            i();
        }
        this.f2792e--;
    }

    @Override // androidx.lifecycle.k
    public final k.c b() {
        return this.f2790c;
    }

    @Override // androidx.lifecycle.k
    public final void c(t tVar) {
        e("removeObserver");
        this.f2789b.f(tVar);
    }

    public final k.c d(t tVar) {
        b.c<t, a> cVar;
        k.c cVar2;
        ArrayList<k.c> arrayList;
        n.a<t, a> aVar = this.f2789b;
        k.c cVar3 = null;
        if (aVar.f21895e.containsKey(tVar)) {
            cVar = aVar.f21895e.get(tVar).f21903d;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            cVar2 = cVar.f21901b.f2797a;
        } else {
            cVar2 = null;
        }
        if (!this.f2795h.isEmpty()) {
            cVar3 = this.f2795h.get(arrayList.size() - 1);
        }
        k.c cVar4 = this.f2790c;
        if (cVar2 == null || cVar2.compareTo(cVar4) >= 0) {
            cVar2 = cVar4;
        }
        if (cVar3 == null || cVar3.compareTo(cVar2) >= 0) {
            return cVar2;
        }
        return cVar3;
    }

    @SuppressLint({"RestrictedApi"})
    public final void e(String str) {
        boolean z10;
        if (this.f2796i) {
            m.a.C().f20150c.getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalStateException(android.support.v4.media.a.a("Method ", str, " must be called on the main thread"));
            }
        }
    }

    public final void f(k.b bVar) {
        e("handleLifecycleEvent");
        g(bVar.a());
    }

    public final void g(k.c cVar) {
        k.c cVar2 = k.c.DESTROYED;
        k.c cVar3 = this.f2790c;
        if (cVar3 == cVar) {
            return;
        }
        if (cVar3 == k.c.INITIALIZED && cVar == cVar2) {
            StringBuilder a10 = android.support.v4.media.d.a("no event down from ");
            a10.append(this.f2790c);
            throw new IllegalStateException(a10.toString());
        }
        this.f2790c = cVar;
        if (!this.f2793f && this.f2792e == 0) {
            this.f2793f = true;
            i();
            this.f2793f = false;
            if (this.f2790c == cVar2) {
                this.f2789b = new n.a<>();
                return;
            }
            return;
        }
        this.f2794g = true;
    }

    public final void h(k.c cVar) {
        e("setCurrentState");
        g(cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:187:0x0055, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x00f8, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x016f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.v.i():void");
    }
}
