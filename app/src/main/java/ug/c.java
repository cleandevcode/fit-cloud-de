package ug;

import android.content.Context;
import bi.z0;
import com.topstep.fitcloud.pro.model.location.LocationInfo;
import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import fm.p;
import gm.m;
import mf.a0;
import mg.d9;
import p000do.a;
import pm.e0;
import pm.g1;
import pm.z1;
import tl.l;
import zl.e;
import zl.i;

/* loaded from: classes2.dex */
public final class c implements ug.b {

    /* renamed from: a */
    public final Context f28719a;

    /* renamed from: b */
    public final AppDatabase f28720b;

    /* renamed from: c */
    public final e0 f28721c;

    /* renamed from: d */
    public final dk.a<ug.a> f28722d;

    /* renamed from: e */
    public final Object f28723e;

    /* renamed from: f */
    public z1 f28724f;

    /* renamed from: g */
    public volatile LocationInfo f28725g;

    /* renamed from: h */
    public volatile boolean f28726h;

    /* renamed from: i */
    public boolean f28727i;

    @e(c = "com.topstep.fitcloud.pro.shared.data.location.LocationRepositoryImpl", f = "LocationRepository.kt", l = {165}, m = "getCacheLocation")
    /* loaded from: classes2.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public c f28728d;

        /* renamed from: e */
        public /* synthetic */ Object f28729e;

        /* renamed from: g */
        public int f28731g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d<? super a> dVar) {
            super(dVar);
            c.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f28729e = obj;
            this.f28731g |= Integer.MIN_VALUE;
            return c.this.c(this);
        }
    }

    @e(c = "com.topstep.fitcloud.pro.shared.data.location.LocationRepositoryImpl$requestSync$2", f = "LocationRepository.kt", l = {128}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends i implements p<e0, xl.d<? super l>, Object> {

        /* renamed from: e */
        public int f28732e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(2, dVar);
            c.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super l> dVar) {
            return ((b) p(e0Var, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final xl.d<l> p(Object obj, xl.d<?> dVar) {
            return new b(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f28732e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                g1 f10 = c.this.f();
                this.f28732e = 1;
                if (f10.R(this) == aVar) {
                    return aVar;
                }
            }
            return l.f28297a;
        }
    }

    @e(c = "com.topstep.fitcloud.pro.shared.data.location.LocationRepositoryImpl$startRequest$1$1", f = "LocationRepository.kt", l = {93, 95}, m = "invokeSuspend")
    /* renamed from: ug.c$c */
    /* loaded from: classes2.dex */
    public static final class C0517c extends i implements p<e0, xl.d<? super l>, Object> {

        /* renamed from: e */
        public int f28734e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0517c(xl.d<? super C0517c> dVar) {
            super(2, dVar);
            c.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super l> dVar) {
            return ((C0517c) p(e0Var, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final xl.d<l> p(Object obj, xl.d<?> dVar) {
            return new C0517c(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f28734e;
            try {
            } catch (Exception e10) {
                a.b bVar = p000do.a.f13275a;
                bVar.t("Location");
                bVar.q(e10);
            }
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        a0.k(obj);
                        return l.f28297a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.k(obj);
            } else {
                a0.k(obj);
                this.f28734e = 1;
                obj = c.this.f28722d.get().a(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            LocationInfo locationInfo = (LocationInfo) obj;
            if (locationInfo != null) {
                c cVar = c.this;
                cVar.f28725g = locationInfo;
                d9 E = cVar.f28720b.E();
                this.f28734e = 2;
                if (E.m(locationInfo, this) == aVar) {
                    return aVar;
                }
            }
            return l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends m implements fm.l<Throwable, l> {

        /* renamed from: b */
        public static final d f28736b = new d();

        public d() {
            super(1);
        }

        @Override // fm.l
        public final l k(Throwable th2) {
            a.b bVar = p000do.a.f13275a;
            bVar.t("Location");
            bVar.h("job stop", new Object[0]);
            return l.f28297a;
        }
    }

    public c(Context context, AppDatabase appDatabase, e0 e0Var, dk.a<ug.a> aVar) {
        gm.l.f(appDatabase, "appDatabase");
        gm.l.f(e0Var, "applicationScope");
        gm.l.f(aVar, "locationEngine");
        this.f28719a = context;
        this.f28720b = appDatabase;
        this.f28721c = e0Var;
        this.f28722d = aVar;
        this.f28723e = new Object();
    }

    @Override // ug.b
    public final LocationInfo a(long j10) {
        LocationInfo e10 = e(j10);
        if (e10 != null) {
            return e10;
        }
        if (b()) {
            z0.n(new b(null));
            return e(j10);
        }
        return null;
    }

    @Override // ug.b
    public final boolean b() {
        boolean z10 = true;
        if (!this.f28727i) {
            if (y0.a.a(this.f28719a, "android.permission.ACCESS_FINE_LOCATION") != 0 && y0.a.a(this.f28719a, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
                z10 = false;
            }
            this.f28727i = z10;
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0031  */
    @Override // ug.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(xl.d<? super com.topstep.fitcloud.pro.model.location.LocationInfo> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ug.c.a
            if (r0 == 0) goto L13
            r0 = r5
            ug.c$a r0 = (ug.c.a) r0
            int r1 = r0.f28731g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28731g = r1
            goto L18
        L13:
            ug.c$a r0 = new ug.c$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f28729e
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f28731g
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ug.c r0 = r0.f28728d
            mf.a0.k(r5)
            goto L50
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            mf.a0.k(r5)
            com.topstep.fitcloud.pro.model.location.LocationInfo r5 = r4.f28725g
            if (r5 != 0) goto L56
            boolean r5 = r4.f28726h
            if (r5 == 0) goto L3e
            r5 = 0
            goto L56
        L3e:
            com.topstep.fitcloud.pro.shared.data.db.AppDatabase r5 = r4.f28720b
            mg.d9 r5 = r5.E()
            r0.f28728d = r4
            r0.f28731g = r3
            java.lang.Object r5 = r5.d(r0)
            if (r5 != r1) goto L4f
            return r1
        L4f:
            r0 = r4
        L50:
            com.topstep.fitcloud.pro.model.location.LocationInfo r5 = (com.topstep.fitcloud.pro.model.location.LocationInfo) r5
            r0.f28725g = r5
            r0.f28726h = r3
        L56:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.c.c(xl.d):java.lang.Object");
    }

    @Override // ug.b
    public final void d() {
        if (e(1800000L) == null && b()) {
            f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x001a, code lost:
        if (r9 == true) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.topstep.fitcloud.pro.model.location.LocationInfo e(long r9) {
        /*
            r8 = this;
            com.topstep.fitcloud.pro.model.location.LocationInfo r0 = r8.f28725g
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1d
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r0.f9707c
            long r3 = r3 - r5
            r5 = 0
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 > 0) goto L19
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r5 > 0) goto L19
            r9 = 1
            goto L1a
        L19:
            r9 = 0
        L1a:
            if (r9 != r1) goto L1d
            goto L1e
        L1d:
            r1 = 0
        L1e:
            if (r1 == 0) goto L21
            goto L22
        L21:
            r0 = 0
        L22:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.c.e(long):com.topstep.fitcloud.pro.model.location.LocationInfo");
    }

    public final g1 f() {
        synchronized (this.f28723e) {
            z1 z1Var = this.f28724f;
            boolean z10 = true;
            if (z1Var == null || !z1Var.a()) {
                z10 = false;
            }
            if (z10) {
                a.b bVar = p000do.a.f13275a;
                bVar.t("Location");
                bVar.h("job exist", new Object[0]);
                return z1Var;
            }
            a.b bVar2 = p000do.a.f13275a;
            bVar2.t("Location");
            bVar2.h("job start", new Object[0]);
            z1 g10 = z0.g(this.f28721c, null, 0, new C0517c(null), 3);
            g10.k(d.f28736b);
            this.f28724f = g10;
            return g10;
        }
    }
}
