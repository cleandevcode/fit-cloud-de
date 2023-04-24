package mg;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import java.util.ArrayList;
import jg.b;

/* loaded from: classes2.dex */
public abstract class d9 {

    /* renamed from: a */
    public final mf.h0 f20864a;

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.StringTypedDao", f = "StringTypedDao.kt", l = {77}, m = "getLocationInfo")
    /* loaded from: classes2.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public d9 f20865d;

        /* renamed from: e */
        public /* synthetic */ Object f20866e;

        /* renamed from: g */
        public int f20868g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d<? super a> dVar) {
            super(dVar);
            d9.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f20866e = obj;
            this.f20868g |= Integer.MIN_VALUE;
            return d9.this.d(this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.StringTypedDao", f = "StringTypedDao.kt", l = {327}, m = "getSportHistoryNextKey")
    /* loaded from: classes2.dex */
    public static final class b extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f20869d;

        /* renamed from: f */
        public int f20871f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(dVar);
            d9.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f20869d = obj;
            this.f20871f |= Integer.MIN_VALUE;
            return d9.this.e(0L, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.StringTypedDao", f = "StringTypedDao.kt", l = {110}, m = "getWeatherInfo")
    /* loaded from: classes2.dex */
    public static final class c extends zl.c {

        /* renamed from: d */
        public d9 f20872d;

        /* renamed from: e */
        public /* synthetic */ Object f20873e;

        /* renamed from: g */
        public int f20875g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(dVar);
            d9.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f20873e = obj;
            this.f20875g |= Integer.MIN_VALUE;
            return d9.this.f(this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.StringTypedDao", f = "StringTypedDao.kt", l = {209}, m = "saveAllRealtime")
    /* loaded from: classes2.dex */
    public static final class d extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f20876d;

        /* renamed from: f */
        public int f20878f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(dVar);
            d9.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f20876d = obj;
            this.f20878f |= Integer.MIN_VALUE;
            return d9.this.j(0L, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.StringTypedDao", f = "StringTypedDao.kt", l = {246}, m = "saveBloodPressureRealtime")
    /* loaded from: classes2.dex */
    public static final class e extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f20879d;

        /* renamed from: f */
        public int f20881f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(xl.d<? super e> dVar) {
            super(dVar);
            d9.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f20879d = obj;
            this.f20881f |= Integer.MIN_VALUE;
            return d9.this.k(0L, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.StringTypedDao", f = "StringTypedDao.kt", l = {216}, m = "saveHeartRateRealtime")
    /* loaded from: classes2.dex */
    public static final class f extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f20882d;

        /* renamed from: f */
        public int f20884f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(xl.d<? super f> dVar) {
            super(dVar);
            d9.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f20882d = obj;
            this.f20884f |= Integer.MIN_VALUE;
            return d9.this.l(0L, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.StringTypedDao", f = "StringTypedDao.kt", l = {95}, m = "saveLocationInfo")
    /* loaded from: classes2.dex */
    public static final class g extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f20885d;

        /* renamed from: f */
        public int f20887f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(xl.d<? super g> dVar) {
            super(dVar);
            d9.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f20885d = obj;
            this.f20887f |= Integer.MIN_VALUE;
            return d9.this.m(null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.StringTypedDao", f = "StringTypedDao.kt", l = {231}, m = "saveOxygenRealtime")
    /* loaded from: classes2.dex */
    public static final class h extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f20888d;

        /* renamed from: f */
        public int f20890f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(xl.d<? super h> dVar) {
            super(dVar);
            d9.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f20888d = obj;
            this.f20890f |= Integer.MIN_VALUE;
            return d9.this.n(0L, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.StringTypedDao", f = "StringTypedDao.kt", l = {276}, m = "savePressureRealtime")
    /* loaded from: classes2.dex */
    public static final class i extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f20891d;

        /* renamed from: f */
        public int f20893f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(xl.d<? super i> dVar) {
            super(dVar);
            d9.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f20891d = obj;
            this.f20893f |= Integer.MIN_VALUE;
            return d9.this.o(0L, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.StringTypedDao", f = "StringTypedDao.kt", l = {333}, m = "saveSportHistoryNextKey")
    /* loaded from: classes2.dex */
    public static final class j extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f20894d;

        /* renamed from: f */
        public int f20896f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(xl.d<? super j> dVar) {
            super(dVar);
            d9.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f20894d = obj;
            this.f20896f |= Integer.MIN_VALUE;
            return d9.this.p(0L, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.StringTypedDao", f = "StringTypedDao.kt", l = {290}, m = "saveSportTotalCache")
    /* loaded from: classes2.dex */
    public static final class k extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f20897d;

        /* renamed from: f */
        public int f20899f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(xl.d<? super k> dVar) {
            super(dVar);
            d9.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f20897d = obj;
            this.f20899f |= Integer.MIN_VALUE;
            return d9.this.q(0L, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.StringTypedDao", f = "StringTypedDao.kt", l = {261}, m = "saveTemperatureRealtime")
    /* loaded from: classes2.dex */
    public static final class l extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f20900d;

        /* renamed from: f */
        public int f20902f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(xl.d<? super l> dVar) {
            super(dVar);
            d9.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f20900d = obj;
            this.f20902f |= Integer.MIN_VALUE;
            return d9.this.r(0L, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.StringTypedDao", f = "StringTypedDao.kt", l = {128}, m = "saveWeatherInfo")
    /* loaded from: classes2.dex */
    public static final class m extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f20903d;

        /* renamed from: f */
        public int f20905f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(xl.d<? super m> dVar) {
            super(dVar);
            d9.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f20903d = obj;
            this.f20905f |= Integer.MIN_VALUE;
            return d9.this.s(null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.StringTypedDao", f = "StringTypedDao.kt", l = {347}, m = "setSportGoalCache")
    /* loaded from: classes2.dex */
    public static final class n extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f20906d;

        /* renamed from: f */
        public int f20908f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(xl.d<? super n> dVar) {
            super(dVar);
            d9.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f20906d = obj;
            this.f20908f |= Integer.MIN_VALUE;
            return d9.this.t(0L, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.StringTypedDao", f = "StringTypedDao.kt", l = {297, 314}, m = "setSportTotalCacheDirty")
    /* loaded from: classes2.dex */
    public static final class o extends zl.c {

        /* renamed from: d */
        public d9 f20909d;

        /* renamed from: e */
        public long f20910e;

        /* renamed from: f */
        public int f20911f;

        /* renamed from: g */
        public float f20912g;

        /* renamed from: h */
        public /* synthetic */ Object f20913h;

        /* renamed from: j */
        public int f20915j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(xl.d<? super o> dVar) {
            super(dVar);
            d9.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f20913h = obj;
            this.f20915j |= Integer.MIN_VALUE;
            return d9.this.u(0L, 0, 0.0f, this);
        }
    }

    public d9(AppDatabase appDatabase) {
        gm.l.f(appDatabase, "database");
        mf.h0 h0Var = appDatabase.f10052m;
        if (h0Var != null) {
            this.f20864a = h0Var;
        } else {
            gm.l.l("moshi");
            throw null;
        }
    }

    public abstract Object a(long j10, b.C0309b c0309b);

    public abstract sm.u0 b(int i10, long j10);

    public abstract sm.u0 c(long j10);

    /* JADX WARN: Removed duplicated region for block: B:51:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(xl.d<? super com.topstep.fitcloud.pro.model.location.LocationInfo> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof mg.d9.a
            if (r0 == 0) goto L13
            r0 = r7
            mg.d9$a r0 = (mg.d9.a) r0
            int r1 = r0.f20868g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20868g = r1
            goto L18
        L13:
            mg.d9$a r0 = new mg.d9$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f20866e
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f20868g
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            mg.d9 r0 = r0.f20865d
            mf.a0.k(r7)
            goto L45
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            mf.a0.k(r7)
            r4 = 0
            r7 = 100001(0x186a1, float:1.40131E-40)
            r0.f20865d = r6
            r0.f20868g = r3
            java.lang.Object r7 = r6.i(r4, r7, r0)
            if (r7 != r1) goto L44
            return r1
        L44:
            r0 = r6
        L45:
            java.lang.String r7 = (java.lang.String) r7
            r1 = 0
            if (r7 == 0) goto L53
            int r2 = r7.length()
            if (r2 != 0) goto L51
            goto L53
        L51:
            r2 = 0
            goto L54
        L53:
            r2 = 1
        L54:
            r4 = 0
            java.lang.String r5 = "Location"
            if (r2 == 0) goto L66
            do.a$b r7 = p000do.a.f13275a
            r7.t(r5)
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = "getLocationInfo:null"
            r7.h(r1, r0)
            return r4
        L66:
            mf.h0 r0 = r0.f20864a     // Catch: java.lang.Throwable -> L75
            java.lang.Class<com.topstep.fitcloud.pro.model.location.LocationInfo> r2 = com.topstep.fitcloud.pro.model.location.LocationInfo.class
            mf.t r0 = r0.a(r2)     // Catch: java.lang.Throwable -> L75
            java.lang.Object r7 = r0.a(r7)     // Catch: java.lang.Throwable -> L75
            com.topstep.fitcloud.pro.model.location.LocationInfo r7 = (com.topstep.fitcloud.pro.model.location.LocationInfo) r7     // Catch: java.lang.Throwable -> L75
            goto L7f
        L75:
            r7 = move-exception
            do.a$b r0 = p000do.a.f13275a
            r0.q(r7)
            tl.g$a r7 = mf.a0.f(r7)
        L7f:
            boolean r0 = r7 instanceof tl.g.a
            if (r0 == 0) goto L84
            goto L85
        L84:
            r4 = r7
        L85:
            r7 = r4
            com.topstep.fitcloud.pro.model.location.LocationInfo r7 = (com.topstep.fitcloud.pro.model.location.LocationInfo) r7
            do.a$b r0 = p000do.a.f13275a
            r0.t(r5)
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r2[r1] = r7
            java.lang.String r7 = "getLocationInfo:%s"
            r0.h(r7, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.d9.d(xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0046 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(long r5, xl.d<? super java.lang.Integer> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof mg.d9.b
            if (r0 == 0) goto L13
            r0 = r7
            mg.d9$b r0 = (mg.d9.b) r0
            int r1 = r0.f20871f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20871f = r1
            goto L18
        L13:
            mg.d9$b r0 = new mg.d9$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f20869d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f20871f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            mf.a0.k(r7)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            mf.a0.k(r7)
            r7 = 2002(0x7d2, float:2.805E-42)
            r0.f20871f = r3
            java.lang.Object r7 = r4.i(r5, r7, r0)
            if (r7 != r1) goto L3d
            return r1
        L3d:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L46
            java.lang.Integer r5 = om.g.S(r7)
            goto L47
        L46:
            r5 = 0
        L47:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.d9.e(long, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(xl.d<? super com.topstep.fitcloud.pro.model.weather.WeatherInfo> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof mg.d9.c
            if (r0 == 0) goto L13
            r0 = r7
            mg.d9$c r0 = (mg.d9.c) r0
            int r1 = r0.f20875g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20875g = r1
            goto L18
        L13:
            mg.d9$c r0 = new mg.d9$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f20873e
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f20875g
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            mg.d9 r0 = r0.f20872d
            mf.a0.k(r7)
            goto L45
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            mf.a0.k(r7)
            r4 = 0
            r7 = 100002(0x186a2, float:1.40133E-40)
            r0.f20872d = r6
            r0.f20875g = r3
            java.lang.Object r7 = r6.i(r4, r7, r0)
            if (r7 != r1) goto L44
            return r1
        L44:
            r0 = r6
        L45:
            java.lang.String r7 = (java.lang.String) r7
            r1 = 0
            if (r7 == 0) goto L53
            int r2 = r7.length()
            if (r2 != 0) goto L51
            goto L53
        L51:
            r2 = 0
            goto L54
        L53:
            r2 = 1
        L54:
            r4 = 0
            java.lang.String r5 = "Weather"
            if (r2 == 0) goto L66
            do.a$b r7 = p000do.a.f13275a
            r7.t(r5)
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = "getWeatherInfo:null"
            r7.h(r1, r0)
            return r4
        L66:
            mf.h0 r0 = r0.f20864a     // Catch: java.lang.Throwable -> L75
            java.lang.Class<com.topstep.fitcloud.pro.model.weather.WeatherInfo> r2 = com.topstep.fitcloud.pro.model.weather.WeatherInfo.class
            mf.t r0 = r0.a(r2)     // Catch: java.lang.Throwable -> L75
            java.lang.Object r7 = r0.a(r7)     // Catch: java.lang.Throwable -> L75
            com.topstep.fitcloud.pro.model.weather.WeatherInfo r7 = (com.topstep.fitcloud.pro.model.weather.WeatherInfo) r7     // Catch: java.lang.Throwable -> L75
            goto L7f
        L75:
            r7 = move-exception
            do.a$b r0 = p000do.a.f13275a
            r0.q(r7)
            tl.g$a r7 = mf.a0.f(r7)
        L7f:
            boolean r0 = r7 instanceof tl.g.a
            if (r0 == 0) goto L84
            goto L85
        L84:
            r4 = r7
        L85:
            r7 = r4
            com.topstep.fitcloud.pro.model.weather.WeatherInfo r7 = (com.topstep.fitcloud.pro.model.weather.WeatherInfo) r7
            do.a$b r0 = p000do.a.f13275a
            r0.t(r5)
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r2[r1] = r7
            java.lang.String r7 = "getWeatherInfo:%s"
            r0.h(r7, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.d9.f(xl.d):java.lang.Object");
    }

    public abstract Object g(ArrayList arrayList, d dVar);

    public abstract Object h(pg.i iVar, zl.c cVar);

    public abstract Object i(long j10, int i10, zl.c cVar);

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(13:18|19|(1:21)|22|(1:24)|25|(1:27)|28|(1:30)|31|(1:33)|34|(1:36))|11|12|13))|39|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00d0, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00d1, code lost:
        p000do.a.f13275a.q(r8);
        mf.a0.f(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(long r8, vf.a r10, xl.d<? super tl.l> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof mg.d9.d
            if (r0 == 0) goto L13
            r0 = r11
            mg.d9$d r0 = (mg.d9.d) r0
            int r1 = r0.f20878f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20878f = r1
            goto L18
        L13:
            mg.d9$d r0 = new mg.d9$d
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f20876d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f20878f
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            mf.a0.k(r11)     // Catch: java.lang.Throwable -> Ld0
            goto Lcd
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L30:
            mf.a0.k(r11)
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld0
            r11.<init>()     // Catch: java.lang.Throwable -> Ld0
            com.topstep.fitcloud.pro.model.data.HeartRateRealtime r2 = r10.f29257a     // Catch: java.lang.Throwable -> Ld0
            if (r2 == 0) goto L54
            pg.i r2 = new pg.i     // Catch: java.lang.Throwable -> Ld0
            r4 = 1001(0x3e9, float:1.403E-42)
            mf.h0 r5 = r7.f20864a     // Catch: java.lang.Throwable -> Ld0
            java.lang.Class<com.topstep.fitcloud.pro.model.data.HeartRateRealtime> r6 = com.topstep.fitcloud.pro.model.data.HeartRateRealtime.class
            mf.t r5 = r5.a(r6)     // Catch: java.lang.Throwable -> Ld0
            com.topstep.fitcloud.pro.model.data.HeartRateRealtime r6 = r10.f29257a     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r5 = r5.e(r6)     // Catch: java.lang.Throwable -> Ld0
            r2.<init>(r4, r8, r5)     // Catch: java.lang.Throwable -> Ld0
            r11.add(r2)     // Catch: java.lang.Throwable -> Ld0
        L54:
            com.topstep.fitcloud.pro.model.data.OxygenRealtime r2 = r10.f29258b     // Catch: java.lang.Throwable -> Ld0
            if (r2 == 0) goto L70
            pg.i r2 = new pg.i     // Catch: java.lang.Throwable -> Ld0
            r4 = 1002(0x3ea, float:1.404E-42)
            mf.h0 r5 = r7.f20864a     // Catch: java.lang.Throwable -> Ld0
            java.lang.Class<com.topstep.fitcloud.pro.model.data.OxygenRealtime> r6 = com.topstep.fitcloud.pro.model.data.OxygenRealtime.class
            mf.t r5 = r5.a(r6)     // Catch: java.lang.Throwable -> Ld0
            com.topstep.fitcloud.pro.model.data.OxygenRealtime r6 = r10.f29258b     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r5 = r5.e(r6)     // Catch: java.lang.Throwable -> Ld0
            r2.<init>(r4, r8, r5)     // Catch: java.lang.Throwable -> Ld0
            r11.add(r2)     // Catch: java.lang.Throwable -> Ld0
        L70:
            com.topstep.fitcloud.pro.model.data.BloodPressureRealtime r2 = r10.f29259c     // Catch: java.lang.Throwable -> Ld0
            if (r2 == 0) goto L8c
            pg.i r2 = new pg.i     // Catch: java.lang.Throwable -> Ld0
            r4 = 1003(0x3eb, float:1.406E-42)
            mf.h0 r5 = r7.f20864a     // Catch: java.lang.Throwable -> Ld0
            java.lang.Class<com.topstep.fitcloud.pro.model.data.BloodPressureRealtime> r6 = com.topstep.fitcloud.pro.model.data.BloodPressureRealtime.class
            mf.t r5 = r5.a(r6)     // Catch: java.lang.Throwable -> Ld0
            com.topstep.fitcloud.pro.model.data.BloodPressureRealtime r6 = r10.f29259c     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r5 = r5.e(r6)     // Catch: java.lang.Throwable -> Ld0
            r2.<init>(r4, r8, r5)     // Catch: java.lang.Throwable -> Ld0
            r11.add(r2)     // Catch: java.lang.Throwable -> Ld0
        L8c:
            com.topstep.fitcloud.pro.model.data.TemperatureRealtime r2 = r10.f29260d     // Catch: java.lang.Throwable -> Ld0
            if (r2 == 0) goto La8
            pg.i r2 = new pg.i     // Catch: java.lang.Throwable -> Ld0
            r4 = 1005(0x3ed, float:1.408E-42)
            mf.h0 r5 = r7.f20864a     // Catch: java.lang.Throwable -> Ld0
            java.lang.Class<com.topstep.fitcloud.pro.model.data.TemperatureRealtime> r6 = com.topstep.fitcloud.pro.model.data.TemperatureRealtime.class
            mf.t r5 = r5.a(r6)     // Catch: java.lang.Throwable -> Ld0
            com.topstep.fitcloud.pro.model.data.TemperatureRealtime r6 = r10.f29260d     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r5 = r5.e(r6)     // Catch: java.lang.Throwable -> Ld0
            r2.<init>(r4, r8, r5)     // Catch: java.lang.Throwable -> Ld0
            r11.add(r2)     // Catch: java.lang.Throwable -> Ld0
        La8:
            com.topstep.fitcloud.pro.model.data.PressureRealtime r2 = r10.f29261e     // Catch: java.lang.Throwable -> Ld0
            if (r2 == 0) goto Lc4
            pg.i r2 = new pg.i     // Catch: java.lang.Throwable -> Ld0
            r4 = 1006(0x3ee, float:1.41E-42)
            mf.h0 r5 = r7.f20864a     // Catch: java.lang.Throwable -> Ld0
            java.lang.Class<com.topstep.fitcloud.pro.model.data.PressureRealtime> r6 = com.topstep.fitcloud.pro.model.data.PressureRealtime.class
            mf.t r5 = r5.a(r6)     // Catch: java.lang.Throwable -> Ld0
            com.topstep.fitcloud.pro.model.data.PressureRealtime r10 = r10.f29261e     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r10 = r5.e(r10)     // Catch: java.lang.Throwable -> Ld0
            r2.<init>(r4, r8, r10)     // Catch: java.lang.Throwable -> Ld0
            r11.add(r2)     // Catch: java.lang.Throwable -> Ld0
        Lc4:
            r0.f20878f = r3     // Catch: java.lang.Throwable -> Ld0
            java.lang.Object r8 = r7.g(r11, r0)     // Catch: java.lang.Throwable -> Ld0
            if (r8 != r1) goto Lcd
            return r1
        Lcd:
            tl.l r8 = tl.l.f28297a     // Catch: java.lang.Throwable -> Ld0
            goto Ld9
        Ld0:
            r8 = move-exception
            do.a$b r9 = p000do.a.f13275a
            r9.q(r8)
            mf.a0.f(r8)
        Ld9:
            tl.l r8 = tl.l.f28297a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.d9.j(long, vf.a, xl.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0051, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0052, code lost:
        p000do.a.f13275a.q(r7);
        mf.a0.f(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(long r7, com.topstep.fitcloud.pro.model.data.BloodPressureRealtime r9, xl.d<? super tl.l> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof mg.d9.e
            if (r0 == 0) goto L13
            r0 = r10
            mg.d9$e r0 = (mg.d9.e) r0
            int r1 = r0.f20881f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20881f = r1
            goto L18
        L13:
            mg.d9$e r0 = new mg.d9$e
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f20879d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f20881f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            mf.a0.k(r10)     // Catch: java.lang.Throwable -> L51
            goto L4e
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            mf.a0.k(r10)
            pg.i r10 = new pg.i     // Catch: java.lang.Throwable -> L51
            r2 = 1003(0x3eb, float:1.406E-42)
            mf.h0 r4 = r6.f20864a     // Catch: java.lang.Throwable -> L51
            java.lang.Class<com.topstep.fitcloud.pro.model.data.BloodPressureRealtime> r5 = com.topstep.fitcloud.pro.model.data.BloodPressureRealtime.class
            mf.t r4 = r4.a(r5)     // Catch: java.lang.Throwable -> L51
            java.lang.String r9 = r4.e(r9)     // Catch: java.lang.Throwable -> L51
            r10.<init>(r2, r7, r9)     // Catch: java.lang.Throwable -> L51
            r0.f20881f = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r7 = r6.h(r10, r0)     // Catch: java.lang.Throwable -> L51
            if (r7 != r1) goto L4e
            return r1
        L4e:
            tl.l r7 = tl.l.f28297a     // Catch: java.lang.Throwable -> L51
            goto L5a
        L51:
            r7 = move-exception
            do.a$b r8 = p000do.a.f13275a
            r8.q(r7)
            mf.a0.f(r7)
        L5a:
            tl.l r7 = tl.l.f28297a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.d9.k(long, com.topstep.fitcloud.pro.model.data.BloodPressureRealtime, xl.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0051, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0052, code lost:
        p000do.a.f13275a.q(r7);
        mf.a0.f(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(long r7, com.topstep.fitcloud.pro.model.data.HeartRateRealtime r9, xl.d<? super tl.l> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof mg.d9.f
            if (r0 == 0) goto L13
            r0 = r10
            mg.d9$f r0 = (mg.d9.f) r0
            int r1 = r0.f20884f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20884f = r1
            goto L18
        L13:
            mg.d9$f r0 = new mg.d9$f
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f20882d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f20884f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            mf.a0.k(r10)     // Catch: java.lang.Throwable -> L51
            goto L4e
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            mf.a0.k(r10)
            pg.i r10 = new pg.i     // Catch: java.lang.Throwable -> L51
            r2 = 1001(0x3e9, float:1.403E-42)
            mf.h0 r4 = r6.f20864a     // Catch: java.lang.Throwable -> L51
            java.lang.Class<com.topstep.fitcloud.pro.model.data.HeartRateRealtime> r5 = com.topstep.fitcloud.pro.model.data.HeartRateRealtime.class
            mf.t r4 = r4.a(r5)     // Catch: java.lang.Throwable -> L51
            java.lang.String r9 = r4.e(r9)     // Catch: java.lang.Throwable -> L51
            r10.<init>(r2, r7, r9)     // Catch: java.lang.Throwable -> L51
            r0.f20884f = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r7 = r6.h(r10, r0)     // Catch: java.lang.Throwable -> L51
            if (r7 != r1) goto L4e
            return r1
        L4e:
            tl.l r7 = tl.l.f28297a     // Catch: java.lang.Throwable -> L51
            goto L5a
        L51:
            r7 = move-exception
            do.a$b r8 = p000do.a.f13275a
            r8.q(r7)
            mf.a0.f(r7)
        L5a:
            tl.l r7 = tl.l.f28297a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.d9.l(long, com.topstep.fitcloud.pro.model.data.HeartRateRealtime, xl.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0062, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0063, code lost:
        r11 = p000do.a.f13275a;
        r11.t("Location");
        r11.q(r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(com.topstep.fitcloud.pro.model.location.LocationInfo r10, xl.d<? super tl.l> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof mg.d9.g
            if (r0 == 0) goto L13
            r0 = r11
            mg.d9$g r0 = (mg.d9.g) r0
            int r1 = r0.f20887f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20887f = r1
            goto L18
        L13:
            mg.d9$g r0 = new mg.d9$g
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f20885d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f20887f
            java.lang.String r3 = "Location"
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            mf.a0.k(r11)     // Catch: java.lang.Exception -> L62
            goto L6b
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            mf.a0.k(r11)
            do.a$b r11 = p000do.a.f13275a     // Catch: java.lang.Exception -> L62
            r11.t(r3)     // Catch: java.lang.Exception -> L62
            java.lang.String r2 = "saveLocationInfo:%s"
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L62
            r6 = 0
            r5[r6] = r10     // Catch: java.lang.Exception -> L62
            r11.h(r2, r5)     // Catch: java.lang.Exception -> L62
            pg.i r11 = new pg.i     // Catch: java.lang.Exception -> L62
            r5 = 0
            r2 = 100001(0x186a1, float:1.40131E-40)
            mf.h0 r7 = r9.f20864a     // Catch: java.lang.Exception -> L62
            java.lang.Class<com.topstep.fitcloud.pro.model.location.LocationInfo> r8 = com.topstep.fitcloud.pro.model.location.LocationInfo.class
            mf.t r7 = r7.a(r8)     // Catch: java.lang.Exception -> L62
            java.lang.String r10 = r7.e(r10)     // Catch: java.lang.Exception -> L62
            r11.<init>(r2, r5, r10)     // Catch: java.lang.Exception -> L62
            r0.f20887f = r4     // Catch: java.lang.Exception -> L62
            java.lang.Object r10 = r9.h(r11, r0)     // Catch: java.lang.Exception -> L62
            if (r10 != r1) goto L6b
            return r1
        L62:
            r10 = move-exception
            do.a$b r11 = p000do.a.f13275a
            r11.t(r3)
            r11.q(r10)
        L6b:
            tl.l r10 = tl.l.f28297a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.d9.m(com.topstep.fitcloud.pro.model.location.LocationInfo, xl.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0051, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0052, code lost:
        p000do.a.f13275a.q(r7);
        mf.a0.f(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(long r7, com.topstep.fitcloud.pro.model.data.OxygenRealtime r9, xl.d<? super tl.l> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof mg.d9.h
            if (r0 == 0) goto L13
            r0 = r10
            mg.d9$h r0 = (mg.d9.h) r0
            int r1 = r0.f20890f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20890f = r1
            goto L18
        L13:
            mg.d9$h r0 = new mg.d9$h
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f20888d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f20890f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            mf.a0.k(r10)     // Catch: java.lang.Throwable -> L51
            goto L4e
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            mf.a0.k(r10)
            pg.i r10 = new pg.i     // Catch: java.lang.Throwable -> L51
            r2 = 1002(0x3ea, float:1.404E-42)
            mf.h0 r4 = r6.f20864a     // Catch: java.lang.Throwable -> L51
            java.lang.Class<com.topstep.fitcloud.pro.model.data.OxygenRealtime> r5 = com.topstep.fitcloud.pro.model.data.OxygenRealtime.class
            mf.t r4 = r4.a(r5)     // Catch: java.lang.Throwable -> L51
            java.lang.String r9 = r4.e(r9)     // Catch: java.lang.Throwable -> L51
            r10.<init>(r2, r7, r9)     // Catch: java.lang.Throwable -> L51
            r0.f20890f = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r7 = r6.h(r10, r0)     // Catch: java.lang.Throwable -> L51
            if (r7 != r1) goto L4e
            return r1
        L4e:
            tl.l r7 = tl.l.f28297a     // Catch: java.lang.Throwable -> L51
            goto L5a
        L51:
            r7 = move-exception
            do.a$b r8 = p000do.a.f13275a
            r8.q(r7)
            mf.a0.f(r7)
        L5a:
            tl.l r7 = tl.l.f28297a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.d9.n(long, com.topstep.fitcloud.pro.model.data.OxygenRealtime, xl.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0051, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0052, code lost:
        p000do.a.f13275a.q(r7);
        mf.a0.f(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(long r7, com.topstep.fitcloud.pro.model.data.PressureRealtime r9, xl.d<? super tl.l> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof mg.d9.i
            if (r0 == 0) goto L13
            r0 = r10
            mg.d9$i r0 = (mg.d9.i) r0
            int r1 = r0.f20893f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20893f = r1
            goto L18
        L13:
            mg.d9$i r0 = new mg.d9$i
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f20891d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f20893f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            mf.a0.k(r10)     // Catch: java.lang.Throwable -> L51
            goto L4e
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            mf.a0.k(r10)
            pg.i r10 = new pg.i     // Catch: java.lang.Throwable -> L51
            r2 = 1006(0x3ee, float:1.41E-42)
            mf.h0 r4 = r6.f20864a     // Catch: java.lang.Throwable -> L51
            java.lang.Class<com.topstep.fitcloud.pro.model.data.PressureRealtime> r5 = com.topstep.fitcloud.pro.model.data.PressureRealtime.class
            mf.t r4 = r4.a(r5)     // Catch: java.lang.Throwable -> L51
            java.lang.String r9 = r4.e(r9)     // Catch: java.lang.Throwable -> L51
            r10.<init>(r2, r7, r9)     // Catch: java.lang.Throwable -> L51
            r0.f20893f = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r7 = r6.h(r10, r0)     // Catch: java.lang.Throwable -> L51
            if (r7 != r1) goto L4e
            return r1
        L4e:
            tl.l r7 = tl.l.f28297a     // Catch: java.lang.Throwable -> L51
            goto L5a
        L51:
            r7 = move-exception
            do.a$b r8 = p000do.a.f13275a
            r8.q(r7)
            mf.a0.f(r7)
        L5a:
            tl.l r7 = tl.l.f28297a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.d9.o(long, com.topstep.fitcloud.pro.model.data.PressureRealtime, xl.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(5:18|19|(1:21)(1:25)|22|(1:24))|11|12|13))|28|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x004d, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x004e, code lost:
        p000do.a.f13275a.q(r5);
        mf.a0.f(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(long r5, java.lang.Integer r7, xl.d<? super tl.l> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof mg.d9.j
            if (r0 == 0) goto L13
            r0 = r8
            mg.d9$j r0 = (mg.d9.j) r0
            int r1 = r0.f20896f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20896f = r1
            goto L18
        L13:
            mg.d9$j r0 = new mg.d9$j
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f20894d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f20896f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            mf.a0.k(r8)     // Catch: java.lang.Throwable -> L4d
            goto L4a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            mf.a0.k(r8)
            pg.i r8 = new pg.i     // Catch: java.lang.Throwable -> L4d
            r2 = 2002(0x7d2, float:2.805E-42)
            if (r7 == 0) goto L3d
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L4d
            goto L3e
        L3d:
            r7 = 0
        L3e:
            r8.<init>(r2, r5, r7)     // Catch: java.lang.Throwable -> L4d
            r0.f20896f = r3     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r5 = r4.h(r8, r0)     // Catch: java.lang.Throwable -> L4d
            if (r5 != r1) goto L4a
            return r1
        L4a:
            tl.l r5 = tl.l.f28297a     // Catch: java.lang.Throwable -> L4d
            goto L56
        L4d:
            r5 = move-exception
            do.a$b r6 = p000do.a.f13275a
            r6.q(r5)
            mf.a0.f(r5)
        L56:
            tl.l r5 = tl.l.f28297a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.d9.p(long, java.lang.Integer, xl.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0051, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0052, code lost:
        p000do.a.f13275a.q(r7);
        mf.a0.f(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(long r7, com.topstep.fitcloud.pro.shared.data.entity.data.SportTotalCache r9, xl.d<? super tl.l> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof mg.d9.k
            if (r0 == 0) goto L13
            r0 = r10
            mg.d9$k r0 = (mg.d9.k) r0
            int r1 = r0.f20899f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20899f = r1
            goto L18
        L13:
            mg.d9$k r0 = new mg.d9$k
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f20897d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f20899f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            mf.a0.k(r10)     // Catch: java.lang.Throwable -> L51
            goto L4e
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            mf.a0.k(r10)
            pg.i r10 = new pg.i     // Catch: java.lang.Throwable -> L51
            r2 = 2001(0x7d1, float:2.804E-42)
            mf.h0 r4 = r6.f20864a     // Catch: java.lang.Throwable -> L51
            java.lang.Class<com.topstep.fitcloud.pro.shared.data.entity.data.SportTotalCache> r5 = com.topstep.fitcloud.pro.shared.data.entity.data.SportTotalCache.class
            mf.t r4 = r4.a(r5)     // Catch: java.lang.Throwable -> L51
            java.lang.String r9 = r4.e(r9)     // Catch: java.lang.Throwable -> L51
            r10.<init>(r2, r7, r9)     // Catch: java.lang.Throwable -> L51
            r0.f20899f = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r7 = r6.h(r10, r0)     // Catch: java.lang.Throwable -> L51
            if (r7 != r1) goto L4e
            return r1
        L4e:
            tl.l r7 = tl.l.f28297a     // Catch: java.lang.Throwable -> L51
            goto L5a
        L51:
            r7 = move-exception
            do.a$b r8 = p000do.a.f13275a
            r8.q(r7)
            mf.a0.f(r7)
        L5a:
            tl.l r7 = tl.l.f28297a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.d9.q(long, com.topstep.fitcloud.pro.shared.data.entity.data.SportTotalCache, xl.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0051, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0052, code lost:
        p000do.a.f13275a.q(r7);
        mf.a0.f(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(long r7, com.topstep.fitcloud.pro.model.data.TemperatureRealtime r9, xl.d<? super tl.l> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof mg.d9.l
            if (r0 == 0) goto L13
            r0 = r10
            mg.d9$l r0 = (mg.d9.l) r0
            int r1 = r0.f20902f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20902f = r1
            goto L18
        L13:
            mg.d9$l r0 = new mg.d9$l
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f20900d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f20902f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            mf.a0.k(r10)     // Catch: java.lang.Throwable -> L51
            goto L4e
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            mf.a0.k(r10)
            pg.i r10 = new pg.i     // Catch: java.lang.Throwable -> L51
            r2 = 1005(0x3ed, float:1.408E-42)
            mf.h0 r4 = r6.f20864a     // Catch: java.lang.Throwable -> L51
            java.lang.Class<com.topstep.fitcloud.pro.model.data.TemperatureRealtime> r5 = com.topstep.fitcloud.pro.model.data.TemperatureRealtime.class
            mf.t r4 = r4.a(r5)     // Catch: java.lang.Throwable -> L51
            java.lang.String r9 = r4.e(r9)     // Catch: java.lang.Throwable -> L51
            r10.<init>(r2, r7, r9)     // Catch: java.lang.Throwable -> L51
            r0.f20902f = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r7 = r6.h(r10, r0)     // Catch: java.lang.Throwable -> L51
            if (r7 != r1) goto L4e
            return r1
        L4e:
            tl.l r7 = tl.l.f28297a     // Catch: java.lang.Throwable -> L51
            goto L5a
        L51:
            r7 = move-exception
            do.a$b r8 = p000do.a.f13275a
            r8.q(r7)
            mf.a0.f(r7)
        L5a:
            tl.l r7 = tl.l.f28297a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.d9.r(long, com.topstep.fitcloud.pro.model.data.TemperatureRealtime, xl.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0062, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0063, code lost:
        r11 = p000do.a.f13275a;
        r11.t("Weather");
        r11.q(r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s(com.topstep.fitcloud.pro.model.weather.WeatherInfo r10, xl.d<? super tl.l> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof mg.d9.m
            if (r0 == 0) goto L13
            r0 = r11
            mg.d9$m r0 = (mg.d9.m) r0
            int r1 = r0.f20905f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20905f = r1
            goto L18
        L13:
            mg.d9$m r0 = new mg.d9$m
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f20903d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f20905f
            java.lang.String r3 = "Weather"
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            mf.a0.k(r11)     // Catch: java.lang.Exception -> L62
            goto L6b
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            mf.a0.k(r11)
            do.a$b r11 = p000do.a.f13275a     // Catch: java.lang.Exception -> L62
            r11.t(r3)     // Catch: java.lang.Exception -> L62
            java.lang.String r2 = "saveWeatherInfo:%s"
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L62
            r6 = 0
            r5[r6] = r10     // Catch: java.lang.Exception -> L62
            r11.h(r2, r5)     // Catch: java.lang.Exception -> L62
            pg.i r11 = new pg.i     // Catch: java.lang.Exception -> L62
            r5 = 0
            r2 = 100002(0x186a2, float:1.40133E-40)
            mf.h0 r7 = r9.f20864a     // Catch: java.lang.Exception -> L62
            java.lang.Class<com.topstep.fitcloud.pro.model.weather.WeatherInfo> r8 = com.topstep.fitcloud.pro.model.weather.WeatherInfo.class
            mf.t r7 = r7.a(r8)     // Catch: java.lang.Exception -> L62
            java.lang.String r10 = r7.e(r10)     // Catch: java.lang.Exception -> L62
            r11.<init>(r2, r5, r10)     // Catch: java.lang.Exception -> L62
            r0.f20905f = r4     // Catch: java.lang.Exception -> L62
            java.lang.Object r10 = r9.h(r11, r0)     // Catch: java.lang.Exception -> L62
            if (r10 != r1) goto L6b
            return r1
        L62:
            r10 = move-exception
            do.a$b r11 = p000do.a.f13275a
            r11.t(r3)
            r11.q(r10)
        L6b:
            tl.l r10 = tl.l.f28297a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.d9.s(com.topstep.fitcloud.pro.model.weather.WeatherInfo, xl.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0051, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0052, code lost:
        p000do.a.f13275a.q(r7);
        mf.a0.f(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(long r7, com.topstep.fitcloud.pro.shared.data.entity.data.SportGoalCache r9, xl.d<? super tl.l> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof mg.d9.n
            if (r0 == 0) goto L13
            r0 = r10
            mg.d9$n r0 = (mg.d9.n) r0
            int r1 = r0.f20908f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20908f = r1
            goto L18
        L13:
            mg.d9$n r0 = new mg.d9$n
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f20906d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f20908f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            mf.a0.k(r10)     // Catch: java.lang.Throwable -> L51
            goto L4e
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            mf.a0.k(r10)
            pg.i r10 = new pg.i     // Catch: java.lang.Throwable -> L51
            r2 = 2003(0x7d3, float:2.807E-42)
            mf.h0 r4 = r6.f20864a     // Catch: java.lang.Throwable -> L51
            java.lang.Class<com.topstep.fitcloud.pro.shared.data.entity.data.SportGoalCache> r5 = com.topstep.fitcloud.pro.shared.data.entity.data.SportGoalCache.class
            mf.t r4 = r4.a(r5)     // Catch: java.lang.Throwable -> L51
            java.lang.String r9 = r4.e(r9)     // Catch: java.lang.Throwable -> L51
            r10.<init>(r2, r7, r9)     // Catch: java.lang.Throwable -> L51
            r0.f20908f = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r7 = r6.h(r10, r0)     // Catch: java.lang.Throwable -> L51
            if (r7 != r1) goto L4e
            return r1
        L4e:
            tl.l r7 = tl.l.f28297a     // Catch: java.lang.Throwable -> L51
            goto L5a
        L51:
            r7 = move-exception
            do.a$b r8 = p000do.a.f13275a
            r8.q(r7)
            mf.a0.f(r7)
        L5a:
            tl.l r7 = tl.l.f28297a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.d9.t(long, com.topstep.fitcloud.pro.shared.data.entity.data.SportGoalCache, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x007e A[Catch: all -> 0x0078, TRY_LEAVE, TryCatch #0 {all -> 0x0078, blocks: (B:69:0x006f, B:77:0x007e), top: B:92:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u(long r25, int r27, float r28, xl.d<? super tl.l> r29) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.d9.u(long, int, float, xl.d):java.lang.Object");
    }
}
