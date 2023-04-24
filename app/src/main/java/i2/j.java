package i2;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.k;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public final class j implements androidx.lifecycle.u, y0, androidx.lifecycle.i, q2.c {

    /* renamed from: a */
    public final Context f16293a;

    /* renamed from: b */
    public v f16294b;

    /* renamed from: c */
    public final Bundle f16295c;

    /* renamed from: d */
    public k.c f16296d;

    /* renamed from: e */
    public final e0 f16297e;

    /* renamed from: f */
    public final String f16298f;

    /* renamed from: g */
    public final Bundle f16299g;

    /* renamed from: j */
    public boolean f16302j;

    /* renamed from: l */
    public k.c f16304l;

    /* renamed from: h */
    public androidx.lifecycle.v f16300h = new androidx.lifecycle.v(this);

    /* renamed from: i */
    public final q2.b f16301i = new q2.b(this);

    /* renamed from: k */
    public final tl.i f16303k = new tl.i(new d());

    /* loaded from: classes.dex */
    public static final class a {
        public static j a(Context context, v vVar, Bundle bundle, k.c cVar, q qVar) {
            String uuid = UUID.randomUUID().toString();
            gm.l.e(uuid, "randomUUID().toString()");
            gm.l.f(cVar, "hostLifecycleState");
            return new j(context, vVar, bundle, cVar, qVar, uuid, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends androidx.lifecycle.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j jVar) {
            super(jVar);
            gm.l.f(jVar, "owner");
        }

        @Override // androidx.lifecycle.a
        public final <T extends s0> T d(String str, Class<T> cls, androidx.lifecycle.l0 l0Var) {
            gm.l.f(l0Var, "handle");
            return new c(l0Var);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends s0 {

        /* renamed from: d */
        public final androidx.lifecycle.l0 f16305d;

        public c(androidx.lifecycle.l0 l0Var) {
            gm.l.f(l0Var, "handle");
            this.f16305d = l0Var;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends gm.m implements fm.a<p0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d() {
            super(0);
            j.this = r1;
        }

        @Override // fm.a
        public final p0 m() {
            Context context;
            Context context2 = j.this.f16293a;
            Application application = null;
            if (context2 != null) {
                context = context2.getApplicationContext();
            } else {
                context = null;
            }
            if (context instanceof Application) {
                application = (Application) context;
            }
            j jVar = j.this;
            return new p0(application, jVar, jVar.f16295c);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends gm.m implements fm.a<androidx.lifecycle.l0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e() {
            super(0);
            j.this = r1;
        }

        @Override // fm.a
        public final androidx.lifecycle.l0 m() {
            boolean z10;
            j jVar = j.this;
            if (jVar.f16302j) {
                if (jVar.f16300h.f2790c != k.c.DESTROYED) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return ((c) new v0(jVar, new b(jVar)).a(c.class)).f16305d;
                }
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.".toString());
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
        }
    }

    static {
        new a();
    }

    public j(Context context, v vVar, Bundle bundle, k.c cVar, e0 e0Var, String str, Bundle bundle2) {
        this.f16293a = context;
        this.f16294b = vVar;
        this.f16295c = bundle;
        this.f16296d = cVar;
        this.f16297e = e0Var;
        this.f16298f = str;
        this.f16299g = bundle2;
        new tl.i(new e());
        this.f16304l = k.c.INITIALIZED;
    }

    @Override // q2.c
    public final q2.a C() {
        return this.f16301i.f24512b;
    }

    @Override // androidx.lifecycle.u
    public final androidx.lifecycle.v a0() {
        return this.f16300h;
    }

    public final void c(k.c cVar) {
        gm.l.f(cVar, "maxState");
        this.f16304l = cVar;
        d();
    }

    public final void d() {
        androidx.lifecycle.v vVar;
        k.c cVar;
        if (!this.f16302j) {
            this.f16301i.a();
            this.f16302j = true;
            if (this.f16297e != null) {
                m0.b(this);
            }
            this.f16301i.b(this.f16299g);
        }
        if (this.f16296d.ordinal() < this.f16304l.ordinal()) {
            vVar = this.f16300h;
            cVar = this.f16296d;
        } else {
            vVar = this.f16300h;
            cVar = this.f16304l;
        }
        vVar.h(cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L83
            boolean r1 = r7 instanceof i2.j
            if (r1 != 0) goto L9
            goto L83
        L9:
            java.lang.String r1 = r6.f16298f
            i2.j r7 = (i2.j) r7
            java.lang.String r2 = r7.f16298f
            boolean r1 = gm.l.a(r1, r2)
            r2 = 1
            if (r1 == 0) goto L83
            i2.v r1 = r6.f16294b
            i2.v r3 = r7.f16294b
            boolean r1 = gm.l.a(r1, r3)
            if (r1 == 0) goto L83
            androidx.lifecycle.v r1 = r6.f16300h
            androidx.lifecycle.v r3 = r7.f16300h
            boolean r1 = gm.l.a(r1, r3)
            if (r1 == 0) goto L83
            q2.b r1 = r6.f16301i
            q2.a r1 = r1.f24512b
            q2.b r3 = r7.f16301i
            q2.a r3 = r3.f24512b
            boolean r1 = gm.l.a(r1, r3)
            if (r1 == 0) goto L83
            android.os.Bundle r1 = r6.f16295c
            android.os.Bundle r3 = r7.f16295c
            boolean r1 = gm.l.a(r1, r3)
            if (r1 != 0) goto L82
            android.os.Bundle r1 = r6.f16295c
            if (r1 == 0) goto L7f
            java.util.Set r1 = r1.keySet()
            if (r1 == 0) goto L7f
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L54
        L52:
            r7 = 1
            goto L7b
        L54:
            java.util.Iterator r1 = r1.iterator()
        L58:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L52
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            android.os.Bundle r4 = r6.f16295c
            java.lang.Object r4 = r4.get(r3)
            android.os.Bundle r5 = r7.f16295c
            if (r5 == 0) goto L73
            java.lang.Object r3 = r5.get(r3)
            goto L74
        L73:
            r3 = 0
        L74:
            boolean r3 = gm.l.a(r4, r3)
            if (r3 != 0) goto L58
            r7 = 0
        L7b:
            if (r7 != r2) goto L7f
            r7 = 1
            goto L80
        L7f:
            r7 = 0
        L80:
            if (r7 == 0) goto L83
        L82:
            r0 = 1
        L83:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.j.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Set<String> keySet;
        int i10;
        int hashCode = this.f16294b.hashCode() + (this.f16298f.hashCode() * 31);
        Bundle bundle = this.f16295c;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            for (String str : keySet) {
                int i11 = hashCode * 31;
                Object obj = this.f16295c.get(str);
                if (obj != null) {
                    i10 = obj.hashCode();
                } else {
                    i10 = 0;
                }
                hashCode = i11 + i10;
            }
        }
        return this.f16301i.f24512b.hashCode() + ((this.f16300h.hashCode() + (hashCode * 31)) * 31);
    }

    @Override // androidx.lifecycle.i
    public final v0.b r() {
        return (p0) this.f16303k.getValue();
    }

    @Override // androidx.lifecycle.i
    public final d2.c s() {
        Context context;
        d2.c cVar = new d2.c(0);
        Context context2 = this.f16293a;
        Application application = null;
        if (context2 != null) {
            context = context2.getApplicationContext();
        } else {
            context = null;
        }
        if (context instanceof Application) {
            application = (Application) context;
        }
        if (application != null) {
            cVar.f12611a.put(u0.f2788a, application);
        }
        cVar.f12611a.put(m0.f2748a, this);
        cVar.f12611a.put(m0.f2749b, this);
        Bundle bundle = this.f16295c;
        if (bundle != null) {
            cVar.f12611a.put(m0.f2750c, bundle);
        }
        return cVar;
    }

    @Override // androidx.lifecycle.y0
    public final x0 z() {
        boolean z10;
        if (this.f16302j) {
            if (this.f16300h.f2790c != k.c.DESTROYED) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                e0 e0Var = this.f16297e;
                if (e0Var != null) {
                    return e0Var.a(this.f16298f);
                }
                throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.".toString());
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.".toString());
        }
        throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
    }
}
