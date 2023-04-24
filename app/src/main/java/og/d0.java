package og;

import android.content.Context;
import android.content.IntentFilter;
import cn.sharesdk.framework.InnerShareParams;
import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import kg.f;
import mg.sa;
import no.nordicsemi.android.dfu.DfuServiceInitiator;
import p000do.a;
import sm.b1;

/* loaded from: classes2.dex */
public final class d0 extends kg.f<pg.d> implements t {

    /* renamed from: b */
    public final Context f23246b;

    /* renamed from: c */
    public final pm.e0 f23247c;

    /* renamed from: d */
    public final yg.j f23248d;

    /* renamed from: e */
    public final vg.d f23249e;

    /* renamed from: f */
    public final yg.u f23250f;

    /* renamed from: g */
    public final kg.k f23251g;

    /* renamed from: h */
    public final kg.g f23252h;

    /* renamed from: i */
    public final kg.a f23253i;

    /* renamed from: j */
    public final dk.a<n1> f23254j;

    /* renamed from: k */
    public final lg.d f23255k;

    /* renamed from: l */
    public final dk.a<lg.r0> f23256l;

    /* renamed from: m */
    public final ah.a f23257m;

    /* renamed from: n */
    public final hj.a f23258n;

    /* renamed from: o */
    public final sa f23259o;

    /* renamed from: p */
    public final sm.g1 f23260p;

    /* renamed from: q */
    public final sm.t0 f23261q;

    /* renamed from: r */
    public final sm.t0 f23262r;

    /* renamed from: s */
    public final sm.t0 f23263s;

    /* renamed from: t */
    public final rm.a f23264t;

    /* renamed from: u */
    public final sm.c f23265u;

    /* renamed from: v */
    public final sm.t0 f23266v;

    /* renamed from: w */
    public final og.f f23267w;

    /* renamed from: x */
    public final c1 f23268x;

    /* renamed from: y */
    public long f23269y;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public final uf.c f23270a;

        /* renamed from: b */
        public final wf.a f23271b;

        public a(uf.c cVar, wf.a aVar) {
            this.f23270a = cVar;
            this.f23271b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return gm.l.a(this.f23270a, aVar.f23270a) && gm.l.a(this.f23271b, aVar.f23271b);
            }
            return false;
        }

        public final int hashCode() {
            uf.c cVar = this.f23270a;
            int hashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
            wf.a aVar = this.f23271b;
            return hashCode + (aVar != null ? aVar.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("ConnectionParam(user=");
            a10.append(this.f23270a);
            a10.append(", device=");
            a10.append(this.f23271b);
            a10.append(')');
            return a10.toString();
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DeviceManagerImpl$bind$1", f = "DeviceManager.kt", l = {487}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f23272e;

        /* renamed from: g */
        public final /* synthetic */ Long f23274g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Long l10, xl.d<? super b> dVar) {
            super(2, dVar);
            d0.this = r1;
            this.f23274g = l10;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new b(this.f23274g, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f23272e;
            if (i10 != 0) {
                if (i10 == 1) {
                    mf.a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                mf.a0.k(obj);
                sa saVar = d0.this.f23259o;
                long longValue = this.f23274g.longValue();
                long currentTimeMillis = System.currentTimeMillis();
                this.f23272e = 1;
                if (saVar.c(longValue, currentTimeMillis, this) == aVar) {
                    return aVar;
                }
            }
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DeviceManagerImpl", f = "DeviceManager.kt", l = {568}, m = "clearDevice")
    /* loaded from: classes2.dex */
    public static final class c extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f23275d;

        /* renamed from: f */
        public int f23277f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(dVar);
            d0.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f23275d = obj;
            this.f23277f |= Integer.MIN_VALUE;
            return d0.this.S(this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DeviceManagerImpl", f = "DeviceManager.kt", l = {658}, m = "getNewDataCount")
    /* loaded from: classes2.dex */
    public static final class d extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f23278d;

        /* renamed from: f */
        public int f23280f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(dVar);
            d0.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f23278d = obj;
            this.f23280f |= Integer.MIN_VALUE;
            return d0.this.h(0L, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DeviceManagerImpl", f = "DeviceManager.kt", l = {531, 532}, m = "reset")
    /* loaded from: classes2.dex */
    public static final class e extends zl.c {

        /* renamed from: d */
        public d0 f23281d;

        /* renamed from: e */
        public /* synthetic */ Object f23282e;

        /* renamed from: g */
        public int f23284g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(xl.d<? super e> dVar) {
            super(dVar);
            d0.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f23282e = obj;
            this.f23284g |= Integer.MIN_VALUE;
            return d0.this.v(this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DeviceManagerImpl$syncData$1", f = "DeviceManager.kt", l = {642}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f23285e;

        /* renamed from: g */
        public final /* synthetic */ long f23287g;

        @zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DeviceManagerImpl$syncData$1$1", f = "DeviceManager.kt", l = {613}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends zl.i implements fm.p<sm.g<? super oj.o>, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f23288e;

            /* renamed from: f */
            public final /* synthetic */ d0 f23289f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d0 d0Var, xl.d<? super a> dVar) {
                super(2, dVar);
                this.f23289f = d0Var;
            }

            @Override // fm.p
            public final Object A(sm.g<? super oj.o> gVar, xl.d<? super tl.l> dVar) {
                return ((a) p(gVar, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new a(this.f23289f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f23288e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        mf.a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    mf.a0.k(obj);
                    a.b bVar = p000do.a.f13275a;
                    bVar.t("DeviceManager");
                    bVar.b("syncData onStart", new Object[0]);
                    rm.a aVar2 = this.f23289f.f23264t;
                    Integer num = new Integer(0);
                    this.f23288e = 1;
                    if (aVar2.d(num, this) == aVar) {
                        return aVar;
                    }
                }
                return tl.l.f28297a;
            }
        }

        @zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DeviceManagerImpl$syncData$1$2", f = "DeviceManager.kt", l = {620, 633, 636}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends zl.i implements fm.q<sm.g<? super oj.o>, Throwable, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f23290e;

            /* renamed from: f */
            public /* synthetic */ Throwable f23291f;

            /* renamed from: g */
            public final /* synthetic */ d0 f23292g;

            /* renamed from: h */
            public final /* synthetic */ long f23293h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(d0 d0Var, long j10, xl.d<? super b> dVar) {
                super(3, dVar);
                this.f23292g = d0Var;
                this.f23293h = j10;
            }

            @Override // fm.q
            public final Object j(sm.g<? super oj.o> gVar, Throwable th2, xl.d<? super tl.l> dVar) {
                b bVar = new b(this.f23292g, this.f23293h, dVar);
                bVar.f23291f = th2;
                return bVar.t(tl.l.f28297a);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f23290e;
                if (i10 != 0) {
                    if (i10 != 1 && i10 != 2 && i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mf.a0.k(obj);
                } else {
                    mf.a0.k(obj);
                    Throwable th2 = this.f23291f;
                    a.b bVar = p000do.a.f13275a;
                    bVar.t("DeviceManager");
                    bVar.c(th2, "syncData onCompletion", new Object[0]);
                    if (th2 == null) {
                        d0 d0Var = this.f23292g;
                        d0Var.f23269y = this.f23293h;
                        rm.a aVar2 = d0Var.f23264t;
                        Integer num = new Integer(1);
                        this.f23290e = 1;
                        if (aVar2.d(num, this) == aVar) {
                            return aVar;
                        }
                    } else if (th2 instanceof lc.f) {
                        rm.a aVar3 = this.f23292g.f23264t;
                        Integer num2 = new Integer(2);
                        this.f23290e = 2;
                        if (aVar3.d(num2, this) == aVar) {
                            return aVar;
                        }
                    } else if (!(th2 instanceof yi.g)) {
                        rm.a aVar4 = this.f23292g.f23264t;
                        Integer num3 = new Integer(3);
                        this.f23290e = 3;
                        if (aVar4.d(num3, this) == aVar) {
                            return aVar;
                        }
                    }
                }
                return tl.l.f28297a;
            }
        }

        @zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DeviceManagerImpl$syncData$1$3", f = "DeviceManager.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class c extends zl.i implements fm.q<sm.g<? super oj.o>, Throwable, xl.d<? super tl.l>, Object> {
            public c(xl.d<? super c> dVar) {
                super(3, dVar);
            }

            @Override // fm.q
            public final Object j(sm.g<? super oj.o> gVar, Throwable th2, xl.d<? super tl.l> dVar) {
                new c(dVar);
                tl.l lVar = tl.l.f28297a;
                mf.a0.k(lVar);
                return lVar;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                mf.a0.k(obj);
                return tl.l.f28297a;
            }
        }

        /* loaded from: classes2.dex */
        public static final class d<T> implements sm.g {

            /* renamed from: a */
            public final /* synthetic */ d0 f23294a;

            public d(d0 d0Var) {
                this.f23294a = d0Var;
            }

            @Override // sm.g
            public final Object n(Object obj, xl.d dVar) {
                oj.o oVar = (oj.o) obj;
                d0 d0Var = this.f23294a;
                gm.l.e(oVar, "it");
                Object Q = d0.Q(d0Var, oVar, dVar);
                return Q == yl.a.COROUTINE_SUSPENDED ? Q : tl.l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(long j10, xl.d<? super f> dVar) {
            super(2, dVar);
            d0.this = r1;
            this.f23287g = j10;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((f) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new f(this.f23287g, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:56:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0160 A[RETURN] */
        @Override // zl.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object t(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 370
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: og.d0.f.t(java.lang.Object):java.lang.Object");
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DeviceManagerImpl", f = "DeviceManager.kt", l = {526, 527}, m = "unbind")
    /* loaded from: classes2.dex */
    public static final class g extends zl.c {

        /* renamed from: d */
        public d0 f23295d;

        /* renamed from: e */
        public /* synthetic */ Object f23296e;

        /* renamed from: g */
        public int f23298g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(xl.d<? super g> dVar) {
            super(dVar);
            d0.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f23296e = obj;
            this.f23298g |= Integer.MIN_VALUE;
            return d0.this.g(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(hj.b bVar, Context context, pm.e0 e0Var, yg.b bVar2, AppDatabase appDatabase, vg.d dVar, yg.b0 b0Var, kg.k kVar, kg.h hVar, kg.b bVar3, dk.a aVar, lg.d dVar2, dk.a aVar2, ah.e eVar) {
        super(bVar2);
        gm.l.f(e0Var, "applicationScope");
        gm.l.f(appDatabase, "appDatabase");
        gm.l.f(kVar, "userInfoRepository");
        gm.l.f(aVar, "shellRepository");
        gm.l.f(dVar2, "dataRepository");
        gm.l.f(aVar2, "sportRepository");
        this.f23246b = context;
        this.f23247c = e0Var;
        this.f23248d = bVar2;
        this.f23249e = dVar;
        this.f23250f = b0Var;
        this.f23251g = kVar;
        this.f23252h = hVar;
        this.f23253i = bVar3;
        this.f23254j = aVar;
        this.f23255k = dVar2;
        this.f23256l = aVar2;
        this.f23257m = eVar;
        hj.a a10 = bVar.a();
        this.f23258n = a10;
        this.f23259o = appDatabase.t();
        sm.g1 c10 = bi.r.c(null);
        this.f23260p = c10;
        sm.n0 n0Var = new sm.n0(c10, new w0(bi.r.O(bVar2.f31487f, new u0(this, null))), new i0(null));
        sm.c1 c1Var = b1.a.f27123a;
        sm.t0 M = bi.r.M(n0Var, e0Var, c1Var, null);
        this.f23261q = M;
        sm.t0 M2 = bi.r.M(bi.r.p(M, bi.r.t(qi.h.d(bVar.f16117a.a().d().x(Boolean.valueOf(bVar.f16117a.a().i())))), bi.r.t(qi.h.d(a10.h().u(new u(0, j0.f23383b)).x(wf.b.DISCONNECTED))), new k0(this, null)), e0Var, c1Var, wf.b.NO_DEVICE);
        this.f23262r = M2;
        ql.d<Integer> dVar3 = a10.j().f17885e;
        gm.l.e(dVar3, "syncState");
        this.f23263s = bi.r.M(qi.h.d(dVar3), e0Var, b1.a.f27124b, null);
        rm.a a11 = jh.v.a(0, null, 7);
        this.f23264t = a11;
        this.f23265u = bi.r.J(a11);
        bi.z0.g(e0Var, null, 0, new v(this, null), 3);
        bi.z0.g(e0Var, null, 0, new w(this, null), 3);
        bi.z0.g(e0Var, null, 0, new x(this, null), 3);
        bi.z0.g(e0Var, null, 0, new y(this, null), 3);
        bi.z0.g(e0Var, null, 0, new a0(this, null), 3);
        bi.z0.g(e0Var, null, 0, new b0(this, null), 3);
        context.registerReceiver(new c0(this), new IntentFilter("android.intent.action.TIME_SET"));
        this.f23266v = bi.r.M(bi.r.O(new t0(M2), new v0(this, null)), e0Var, b1.a.a(DfuServiceInitiator.DEFAULT_SCAN_TIMEOUT), null);
        this.f23267w = new og.f(a10.o(), e0Var);
        this.f23268x = new c1(a10.k(), e0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0006, code lost:
        if (r3 != 1) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x000f, code lost:
        if (android.text.format.DateFormat.is24HourFormat(r1.f23246b) == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0012, code lost:
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void O(og.d0 r1, nj.e.a r2, int r3) {
        /*
            r0 = 1
            if (r3 == 0) goto L9
            r1.getClass()
            if (r3 == r0) goto L13
            goto L12
        L9:
            android.content.Context r1 = r1.f23246b
            boolean r1 = android.text.format.DateFormat.is24HourFormat(r1)
            if (r1 != 0) goto L12
            goto L13
        L12:
            r0 = 0
        L13:
            r1 = 2
            r2.a(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: og.d0.O(og.d0, nj.e$a, int):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(2:18|(3:20|12|13)(3:21|22|(2:24|25)))|11|12|13))|28|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ab, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ac, code lost:
        p000do.a.f13275a.q(r0);
        mf.a0.f(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object P(og.d0 r17, wf.a r18, xl.d r19) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            r17.getClass()
            boolean r3 = r2 instanceof og.p0
            if (r3 == 0) goto L1c
            r3 = r2
            og.p0 r3 = (og.p0) r3
            int r4 = r3.f23455f
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1c
            int r4 = r4 - r5
            r3.f23455f = r4
            goto L21
        L1c:
            og.p0 r3 = new og.p0
            r3.<init>(r0, r2)
        L21:
            java.lang.Object r2 = r3.f23453d
            yl.a r4 = yl.a.COROUTINE_SUSPENDED
            int r5 = r3.f23455f
            r6 = 1
            if (r5 == 0) goto L39
            if (r5 != r6) goto L31
            mf.a0.k(r2)     // Catch: java.lang.Throwable -> Lab
            goto La8
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            mf.a0.k(r2)
            yg.j r2 = r0.f23248d
            sm.f1 r2 = r2.h()
            java.lang.Object r2 = r2.getValue()
            java.lang.Long r2 = (java.lang.Long) r2
            r5 = 0
            if (r2 != 0) goto L60
            do.a$b r1 = p000do.a.f13275a
            java.lang.String r2 = "DeviceManager"
            r1.t(r2)
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.String r3 = "saveDevice error because no authed user"
            r1.p(r3, r2)
            sm.g1 r0 = r0.f23260p
            r1 = 0
            r0.setValue(r1)
            goto Lb4
        L60:
            sm.g1 r7 = r0.f23260p
            java.lang.String r8 = r1.f29802a
            java.lang.String r9 = r1.f29803b
            java.lang.String r10 = "address"
            gm.l.f(r8, r10)
            java.lang.String r10 = "name"
            gm.l.f(r9, r10)
            wf.a r10 = new wf.a
            r10.<init>(r8, r9, r5)
            r7.setValue(r10)
            hj.a r7 = r0.f23258n
            jj.l r7 = r7.o()
            nj.c r7 = r7.f17930d
            java.lang.String r13 = r7.toString()
            pg.d r7 = new pg.d
            long r9 = r2.longValue()
            java.lang.String r11 = r1.f29802a
            java.lang.String r12 = r1.f29803b
            r14 = 0
            long r15 = java.lang.System.currentTimeMillis()
            r8 = r7
            r8.<init>(r9, r11, r12, r13, r14, r15)
            r7.f24053b = r6
            mg.sa r0 = r0.f23259o     // Catch: java.lang.Throwable -> Lab
            pg.d[] r1 = new pg.d[r6]     // Catch: java.lang.Throwable -> Lab
            r1[r5] = r7     // Catch: java.lang.Throwable -> Lab
            r3.f23455f = r6     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r0 = r0.k(r1, r3)     // Catch: java.lang.Throwable -> Lab
            if (r0 != r4) goto La8
            goto Lb6
        La8:
            tl.l r0 = tl.l.f28297a     // Catch: java.lang.Throwable -> Lab
            goto Lb4
        Lab:
            r0 = move-exception
            do.a$b r1 = p000do.a.f13275a
            r1.q(r0)
            mf.a0.f(r0)
        Lb4:
            tl.l r4 = tl.l.f28297a
        Lb6:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: og.d0.P(og.d0, wf.a, xl.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:645:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:692:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:798:0x0815  */
    /* JADX WARN: Removed duplicated region for block: B:805:0x0827  */
    /* JADX WARN: Removed duplicated region for block: B:806:0x0829  */
    /* JADX WARN: Removed duplicated region for block: B:808:0x082c  */
    /* JADX WARN: Removed duplicated region for block: B:816:0x0852  */
    /* JADX WARN: Removed duplicated region for block: B:864:0x0980  */
    /* JADX WARN: Removed duplicated region for block: B:912:0x0a9c  */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v14 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object Q(og.d0 r54, oj.o r55, xl.d r56) {
        /*
            Method dump skipped, instructions count: 2988
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: og.d0.Q(og.d0, oj.o, xl.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x00a0, code lost:
        if (r10 == 0) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object R(og.d0 r9, gg.b r10, xl.d r11) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: og.d0.R(og.d0, gg.b, xl.d):java.lang.Object");
    }

    @Override // og.t
    public final void A(String str, String str2) {
        gm.l.f(str, InnerShareParams.ADDRESS);
        gm.l.f(str2, "name");
        Long value = this.f23248d.h().getValue();
        if (value != null) {
            this.f23260p.setValue(new wf.a(str, str2, true));
            mf.a0.j(this.f23247c, new b(value, null));
            return;
        }
        a.b bVar = p000do.a.f13275a;
        bVar.t("DeviceManager");
        bVar.p("bind error because no authed user", new Object[0]);
    }

    @Override // og.t
    public final og.f D() {
        return this.f23267w;
    }

    @Override // og.t
    public final sm.t0 E() {
        return this.f23266v;
    }

    @Override // og.t
    public final void F() {
        wf.a aVar = (wf.a) this.f23261q.getValue();
        if (aVar == null) {
            a.b bVar = p000do.a.f13275a;
            bVar.t("DeviceManager");
            bVar.p("rebind error because no device", new Object[0]);
            return;
        }
        A(aVar.f29802a, aVar.f29803b);
    }

    @Override // og.t
    public final sm.t0 G() {
        return this.f23263s;
    }

    @Override // og.t
    public final sm.f1<wf.b> J() {
        return this.f23262r;
    }

    @Override // kg.f
    public final Object K(long j10, zl.c cVar) {
        return this.f23259o.n(j10, cVar);
    }

    @Override // kg.f
    public final Object L(long j10, f.a aVar) {
        return vg.e.e(this.f23249e, j10, aVar);
    }

    @Override // kg.f
    public final Object M(pg.j jVar, pg.j jVar2, f.a aVar) {
        Object q10 = this.f23259o.q((pg.d) jVar, (pg.d) jVar2, aVar);
        return q10 == yl.a.COROUTINE_SUSPENDED ? q10 : tl.l.f28297a;
    }

    @Override // kg.f
    public final Object N(long j10, pg.j jVar, f.a aVar) {
        return vg.e.i(this.f23249e, j10, (pg.d) jVar, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object S(xl.d<? super tl.l> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof og.d0.c
            if (r0 == 0) goto L13
            r0 = r10
            og.d0$c r0 = (og.d0.c) r0
            int r1 = r0.f23277f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23277f = r1
            goto L18
        L13:
            og.d0$c r0 = new og.d0$c
            r0.<init>(r10)
        L18:
            r6 = r0
            java.lang.Object r10 = r6.f23275d
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            int r1 = r6.f23277f
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            mf.a0.k(r10)
            goto L5c
        L28:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L30:
            mf.a0.k(r10)
            sm.g1 r10 = r9.f23260p
            r1 = 0
            r10.setValue(r1)
            yg.j r10 = r9.f23248d
            sm.f1 r10 = r10.h()
            java.lang.Object r10 = r10.getValue()
            java.lang.Long r10 = (java.lang.Long) r10
            if (r10 == 0) goto L5c
            long r3 = r10.longValue()
            mg.sa r1 = r9.f23259o
            long r7 = java.lang.System.currentTimeMillis()
            r6.f23277f = r2
            r2 = r3
            r4 = r7
            java.lang.Object r10 = r1.c(r2, r4, r6)
            if (r10 != r0) goto L5c
            return r0
        L5c:
            tl.l r10 = tl.l.f28297a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: og.d0.S(xl.d):java.lang.Object");
    }

    @Override // og.t
    public final wi.e b() {
        return this.f23258n.b();
    }

    @Override // og.t
    public final void c() {
        this.f23258n.c();
    }

    @Override // og.t
    public final c1 d() {
        return this.f23268x;
    }

    @Override // og.t
    public final void e() {
        this.f23258n.e();
    }

    @Override // og.t
    public final jj.c f() {
        return this.f23258n.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009b A[RETURN] */
    @Override // og.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(xl.d<? super tl.l> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof og.d0.g
            if (r0 == 0) goto L13
            r0 = r12
            og.d0$g r0 = (og.d0.g) r0
            int r1 = r0.f23298g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23298g = r1
            goto L18
        L13:
            og.d0$g r0 = new og.d0$g
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f23296e
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f23298g
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            mf.a0.k(r12)
            goto L9c
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L33:
            og.d0 r2 = r0.f23295d
            mf.a0.k(r12)
            goto L91
        L39:
            mf.a0.k(r12)
            hj.a r12 = r11.f23258n
            jj.k1 r12 = r12.l()
            java.lang.String r2 = r12.b()
            wi.a r6 = r12.f17917a
            bj.b r7 = new bj.b
            r8 = 21
            r9 = 3
            r7.<init>(r9, r8, r5)
            bj.b r8 = new bj.b
            r10 = 22
            r8.<init>(r9, r10, r5)
            fl.q r6 = h7.a.w(r6, r7, r8)
            jj.p1 r7 = jj.p1.f17959b
            wi.j r8 = new wi.j
            r9 = 4
            r8.<init>(r9, r7)
            gl.p r7 = new gl.p
            r7.<init>(r6, r8)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            java.lang.String r8 = "item is null"
            java.util.Objects.requireNonNull(r6, r8)
            gl.r r8 = new gl.r
            r8.<init>(r7, r5, r6)
            jj.o1 r6 = new jj.o1
            r6.<init>(r12, r2)
            wi.f r12 = new wi.f
            r2 = 8
            r12.<init>(r2, r6)
            gl.l r2 = new gl.l
            r2.<init>(r8, r12)
            r0.f23295d = r11
            r0.f23298g = r4
            java.lang.Object r12 = a.f.d(r2, r0)
            if (r12 != r1) goto L90
            return r1
        L90:
            r2 = r11
        L91:
            r0.f23295d = r5
            r0.f23298g = r3
            java.lang.Object r12 = r2.S(r0)
            if (r12 != r1) goto L9c
            return r1
        L9c:
            tl.l r12 = tl.l.f28297a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: og.d0.g(xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002f  */
    @Override // kg.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(long r5, xl.d<? super java.lang.Integer> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof og.d0.d
            if (r0 == 0) goto L13
            r0 = r7
            og.d0$d r0 = (og.d0.d) r0
            int r1 = r0.f23280f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23280f = r1
            goto L18
        L13:
            og.d0$d r0 = new og.d0$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f23278d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f23280f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            mf.a0.k(r7)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            mf.a0.k(r7)
            r0.f23280f = r3
            java.lang.Object r7 = r4.K(r5, r0)
            if (r7 != r1) goto L3b
            return r1
        L3b:
            pg.d r7 = (pg.d) r7
            if (r7 == 0) goto L44
            int r5 = r7.f24053b
            if (r5 == 0) goto L44
            goto L45
        L44:
            r3 = 0
        L45:
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: og.d0.h(long, xl.d):java.lang.Object");
    }

    @Override // og.t
    public final tm.j k() {
        return bi.r.O(this.f23261q, new l0(this, null));
    }

    @Override // og.t
    public final sm.c n() {
        return this.f23265u;
    }

    @Override // og.t
    public final void o() {
        wf.a aVar = (wf.a) this.f23260p.getValue();
        if (aVar != null && aVar.f29804c) {
            this.f23260p.setValue(null);
        }
    }

    @Override // og.t
    public final ij.c q() {
        return this.f23258n.p(null, true);
    }

    @Override // og.t
    public final void r(boolean z10) {
        boolean z11;
        if (this.f23258n.j().f17884d) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!z10) {
            long j10 = currentTimeMillis - this.f23269y;
            if (0 <= j10 && j10 < 300001) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                return;
            }
        }
        bi.z0.g(this.f23247c, null, 0, new f(currentTimeMillis, null), 3);
    }

    @Override // og.t
    public final jj.g s() {
        return this.f23258n.l();
    }

    @Override // og.t
    public final jj.f t() {
        return this.f23258n.g();
    }

    @Override // og.t
    public final int u() {
        long n10 = (this.f23258n.n() - System.currentTimeMillis()) / 1000;
        if (0 >= n10) {
            n10 = 0;
        }
        return (int) n10;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0065 A[RETURN] */
    @Override // og.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object v(xl.d<? super tl.l> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof og.d0.e
            if (r0 == 0) goto L13
            r0 = r8
            og.d0$e r0 = (og.d0.e) r0
            int r1 = r0.f23284g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23284g = r1
            goto L18
        L13:
            og.d0$e r0 = new og.d0$e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f23282e
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f23284g
            r3 = 1
            r4 = 0
            r5 = 2
            if (r2 == 0) goto L39
            if (r2 == r3) goto L33
            if (r2 != r5) goto L2b
            mf.a0.k(r8)
            goto L66
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            og.d0 r2 = r0.f23281d
            mf.a0.k(r8)
            goto L5b
        L39:
            mf.a0.k(r8)
            hj.a r8 = r7.f23258n
            jj.k1 r8 = r8.l()
            wi.a r8 = r8.f17917a
            bj.b r2 = new bj.b
            r6 = 64
            r2.<init>(r5, r6, r4)
            fl.d0 r8 = h7.a.s(r8, r2)
            r0.f23281d = r7
            r0.f23284g = r3
            java.lang.Object r8 = a.f.b(r8, r0)
            if (r8 != r1) goto L5a
            return r1
        L5a:
            r2 = r7
        L5b:
            r0.f23281d = r4
            r0.f23284g = r5
            java.lang.Object r8 = r2.S(r0)
            if (r8 != r1) goto L66
            return r1
        L66:
            tl.l r8 = tl.l.f28297a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: og.d0.v(xl.d):java.lang.Object");
    }

    @Override // og.t
    public final sm.f1<wf.a> x() {
        return this.f23261q;
    }
}
