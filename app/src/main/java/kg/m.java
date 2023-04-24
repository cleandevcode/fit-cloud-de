package kg;

import android.content.Context;
import android.net.Uri;
import bi.r;
import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import fh.b;
import fm.p;
import java.util.Date;
import kg.f;
import mf.a0;
import mg.hb;
import pm.e0;
import sm.b1;
import sm.t0;

/* loaded from: classes2.dex */
public final class m extends kg.f<pg.m> implements k {

    /* renamed from: b */
    public final e0 f18532b;

    /* renamed from: c */
    public final yg.j f18533c;

    /* renamed from: d */
    public final vg.d f18534d;

    /* renamed from: e */
    public final AppDatabase f18535e;

    /* renamed from: f */
    public final Context f18536f;

    /* renamed from: g */
    public final t0 f18537g;

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.config.UserInfoRepositoryImpl", f = "UserInfoRepository.kt", l = {150}, m = "getNewDataCount")
    /* loaded from: classes2.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f18538d;

        /* renamed from: f */
        public int f18540f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d<? super a> dVar) {
            super(dVar);
            m.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f18538d = obj;
            this.f18540f |= Integer.MIN_VALUE;
            return m.this.h(0L, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.config.UserInfoRepositoryImpl", f = "UserInfoRepository.kt", l = {141, 144}, m = "isCurrentUserShouldBindEmail")
    /* loaded from: classes2.dex */
    public static final class b extends zl.c {

        /* renamed from: d */
        public m f18541d;

        /* renamed from: e */
        public long f18542e;

        /* renamed from: f */
        public /* synthetic */ Object f18543f;

        /* renamed from: h */
        public int f18545h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(dVar);
            m.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f18543f = obj;
            this.f18545h |= Integer.MIN_VALUE;
            return m.this.H(this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.config.UserInfoRepositoryImpl", f = "UserInfoRepository.kt", l = {135, 136}, m = "modifyIdentityId")
    /* loaded from: classes2.dex */
    public static final class c extends zl.c {

        /* renamed from: d */
        public m f18546d;

        /* renamed from: e */
        public String f18547e;

        /* renamed from: f */
        public long f18548f;

        /* renamed from: g */
        public /* synthetic */ Object f18549g;

        /* renamed from: i */
        public int f18551i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(dVar);
            m.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f18549g = obj;
            this.f18551i |= Integer.MIN_VALUE;
            return m.this.B(0L, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.config.UserInfoRepositoryImpl$modifyUserInfo$1", f = "UserInfoRepository.kt", l = {113}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f18552e;

        /* renamed from: g */
        public final /* synthetic */ long f18554g;

        /* renamed from: h */
        public final /* synthetic */ Date f18555h;

        /* renamed from: i */
        public final /* synthetic */ Integer f18556i;

        /* renamed from: j */
        public final /* synthetic */ Float f18557j;

        /* renamed from: k */
        public final /* synthetic */ Float f18558k;

        /* renamed from: l */
        public final /* synthetic */ Uri f18559l;

        /* renamed from: m */
        public final /* synthetic */ String f18560m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j10, Date date, Integer num, Float f10, Float f11, Uri uri, String str, xl.d<? super d> dVar) {
            super(2, dVar);
            m.this = r1;
            this.f18554g = j10;
            this.f18555h = date;
            this.f18556i = num;
            this.f18557j = f10;
            this.f18558k = f11;
            this.f18559l = uri;
            this.f18560m = str;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((d) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new d(this.f18554g, this.f18555h, this.f18556i, this.f18557j, this.f18558k, this.f18559l, this.f18560m, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f18552e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                hb H = m.this.f18535e.H();
                long j10 = this.f18554g;
                Date date = this.f18555h;
                Integer num = this.f18556i;
                Float f10 = this.f18557j;
                Float f11 = this.f18558k;
                Uri uri = this.f18559l;
                String str = this.f18560m;
                this.f18552e = 1;
                if (H.j(j10, date, num, f10, f11, uri, str, this) == aVar) {
                    return aVar;
                }
            }
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.config.UserInfoRepositoryImpl", f = "UserInfoRepository.kt", l = {118, 120, 122}, m = "rebind")
    /* loaded from: classes2.dex */
    public static final class e extends zl.c {

        /* renamed from: d */
        public m f18561d;

        /* renamed from: e */
        public String f18562e;

        /* renamed from: f */
        public long f18563f;

        /* renamed from: g */
        public boolean f18564g;

        /* renamed from: h */
        public /* synthetic */ Object f18565h;

        /* renamed from: j */
        public int f18567j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(xl.d<? super e> dVar) {
            super(dVar);
            m.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f18565h = obj;
            this.f18567j |= Integer.MIN_VALUE;
            return m.this.z(0L, null, false, null, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.config.UserInfoRepositoryImpl", f = "UserInfoRepository.kt", l = {177, 187, 189, 197}, m = "updateSyncRemoteData")
    /* loaded from: classes2.dex */
    public static final class f extends zl.c {

        /* renamed from: d */
        public Object f18568d;

        /* renamed from: e */
        public Object f18569e;

        /* renamed from: f */
        public String f18570f;

        /* renamed from: g */
        public String f18571g;

        /* renamed from: h */
        public long f18572h;

        /* renamed from: i */
        public /* synthetic */ Object f18573i;

        /* renamed from: k */
        public int f18575k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(xl.d<? super f> dVar) {
            super(dVar);
            m.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f18573i = obj;
            this.f18575k |= Integer.MIN_VALUE;
            return m.this.N(0L, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(e0 e0Var, yg.b bVar, vg.d dVar, AppDatabase appDatabase, Context context) {
        super(bVar);
        gm.l.f(e0Var, "applicationScope");
        gm.l.f(appDatabase, "appDatabase");
        this.f18532b = e0Var;
        this.f18533c = bVar;
        this.f18534d = dVar;
        this.f18535e = appDatabase;
        this.f18536f = context;
        this.f18537g = r.M(r.O(bVar.f31487f, new n(this, null)), e0Var, b1.a.f27123a, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0064 A[RETURN] */
    @Override // kg.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object B(long r6, java.lang.String r8, xl.d<? super tl.l> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof kg.m.c
            if (r0 == 0) goto L13
            r0 = r9
            kg.m$c r0 = (kg.m.c) r0
            int r1 = r0.f18551i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18551i = r1
            goto L18
        L13:
            kg.m$c r0 = new kg.m$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f18549g
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f18551i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            mf.a0.k(r9)
            goto L65
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            long r6 = r0.f18548f
            java.lang.String r8 = r0.f18547e
            kg.m r2 = r0.f18546d
            mf.a0.k(r9)
            goto L51
        L3c:
            mf.a0.k(r9)
            vg.d r9 = r5.f18534d
            r0.f18546d = r5
            r0.f18547e = r8
            r0.f18548f = r6
            r0.f18551i = r4
            java.lang.Object r9 = r9.c0(r6, r8, r0)
            if (r9 != r1) goto L50
            return r1
        L50:
            r2 = r5
        L51:
            com.topstep.fitcloud.pro.shared.data.db.AppDatabase r9 = r2.f18535e
            mg.hb r9 = r9.H()
            r2 = 0
            r0.f18546d = r2
            r0.f18547e = r2
            r0.f18551i = r3
            java.lang.Object r6 = r9.p(r6, r8, r0)
            if (r6 != r1) goto L65
            return r1
        L65:
            tl.l r6 = tl.l.f28297a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kg.m.B(long, java.lang.String, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0064  */
    @Override // kg.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object H(xl.d<? super java.lang.Boolean> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof kg.m.b
            if (r0 == 0) goto L13
            r0 = r8
            kg.m$b r0 = (kg.m.b) r0
            int r1 = r0.f18545h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18545h = r1
            goto L18
        L13:
            kg.m$b r0 = new kg.m$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f18543f
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f18545h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            mf.a0.k(r8)
            goto L76
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L32:
            long r5 = r0.f18542e
            kg.m r2 = r0.f18541d
            mf.a0.k(r8)
            goto L59
        L3a:
            mf.a0.k(r8)
            yg.j r8 = r7.f18533c
            java.lang.Long r8 = yg.l.a(r8)
            if (r8 == 0) goto L98
            long r5 = r8.longValue()
            yg.j r8 = r7.f18533c
            r0.f18541d = r7
            r0.f18542e = r5
            r0.f18545h = r4
            java.lang.Object r8 = r8.n(r0)
            if (r8 != r1) goto L58
            return r1
        L58:
            r2 = r7
        L59:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r8 == r3) goto L64
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        L64:
            com.topstep.fitcloud.pro.shared.data.db.AppDatabase r8 = r2.f18535e
            mg.hb r8 = r8.H()
            r2 = 0
            r0.f18541d = r2
            r0.f18545h = r3
            java.lang.Object r8 = r8.f(r5, r0)
            if (r8 != r1) goto L76
            return r1
        L76:
            java.lang.String r8 = (java.lang.String) r8
            do.a$b r0 = p000do.a.f13275a
            java.lang.String r1 = "UserInfoRepository"
            r0.t(r1)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r2 = 0
            r1[r2] = r8
            java.lang.String r3 = "isCurrentUserShouldBindEmail:%s"
            r0.h(r3, r1)
            if (r8 == 0) goto L93
            int r8 = r8.length()
            if (r8 != 0) goto L92
            goto L93
        L92:
            r4 = 0
        L93:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
            return r8
        L98:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kg.m.H(xl.d):java.lang.Object");
    }

    @Override // kg.k
    public final void I(long j10, Date date, Integer num, Float f10, Float f11, Uri uri, String str) {
        a0.j(this.f18532b, new d(j10, date, num, f10, f11, uri, str, null));
    }

    @Override // kg.f
    public final Object K(long j10, zl.c cVar) {
        return this.f18535e.H().e(j10, cVar);
    }

    @Override // kg.f
    public final Object L(long j10, f.a aVar) {
        return vg.e.g(this.f18534d, j10, aVar);
    }

    @Override // kg.f
    public final Object M(pg.j jVar, pg.j jVar2, f.a aVar) {
        Object l10 = this.f18535e.H().l((pg.m) jVar, (pg.m) jVar2, aVar);
        return l10 == yl.a.COROUTINE_SUSPENDED ? l10 : tl.l.f28297a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x00ad, code lost:
        if (gm.l.a(r0.getScheme(), "file") == false) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0127 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x002e  */
    @Override // kg.f
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object N(long r19, pg.m r21, xl.d<? super pg.m> r22) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kg.m.N(long, pg.m, xl.d):java.lang.Object");
    }

    @Override // kg.k
    public final t0 a() {
        return this.f18537g;
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
            boolean r0 = r7 instanceof kg.m.a
            if (r0 == 0) goto L13
            r0 = r7
            kg.m$a r0 = (kg.m.a) r0
            int r1 = r0.f18540f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18540f = r1
            goto L18
        L13:
            kg.m$a r0 = new kg.m$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f18538d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f18540f
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
            r0.f18540f = r3
            java.lang.Object r7 = r4.K(r5, r0)
            if (r7 != r1) goto L3b
            return r1
        L3b:
            pg.m r7 = (pg.m) r7
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
        throw new UnsupportedOperationException("Method not decompiled: kg.m.h(long, xl.d):java.lang.Object");
    }

    @Override // kg.k
    public final l m(long j10) {
        return new l(this.f18535e.H().g(j10));
    }

    @Override // kg.k
    public final Object p(long j10, xl.d<? super String> dVar) {
        return this.f18535e.H().h(j10, dVar);
    }

    @Override // kg.k
    public final Object w(long j10, String str, String str2, b.C0253b c0253b) {
        Object n10 = this.f18534d.n(j10, str, str2, c0253b);
        return n10 == yl.a.COROUTINE_SUSPENDED ? n10 : tl.l.f28297a;
    }

    @Override // kg.k
    public final sm.f<uf.d> y(long j10) {
        return this.f18535e.H().c(j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x008b  */
    @Override // kg.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object z(long r17, java.lang.String r19, boolean r20, java.lang.String r21, java.lang.String r22, xl.d<? super tl.l> r23) {
        /*
            r16 = this;
            r0 = r16
            r1 = r23
            boolean r2 = r1 instanceof kg.m.e
            if (r2 == 0) goto L17
            r2 = r1
            kg.m$e r2 = (kg.m.e) r2
            int r3 = r2.f18567j
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f18567j = r3
            goto L1c
        L17:
            kg.m$e r2 = new kg.m$e
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f18565h
            yl.a r10 = yl.a.COROUTINE_SUSPENDED
            int r3 = r2.f18567j
            r11 = 3
            r12 = 2
            r4 = 1
            if (r3 == 0) goto L4c
            if (r3 == r4) goto L3d
            if (r3 == r12) goto L39
            if (r3 != r11) goto L31
            mf.a0.k(r1)
            goto L94
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            mf.a0.k(r1)
            goto L88
        L3d:
            boolean r3 = r2.f18564g
            long r4 = r2.f18563f
            java.lang.String r6 = r2.f18562e
            kg.m r7 = r2.f18561d
            mf.a0.k(r1)
            r15 = r3
            r13 = r4
            r1 = r6
            goto L72
        L4c:
            mf.a0.k(r1)
            vg.d r3 = r0.f18534d
            r2.f18561d = r0
            r1 = r19
            r2.f18562e = r1
            r13 = r17
            r2.f18563f = r13
            r15 = r20
            r2.f18564g = r15
            r2.f18567j = r4
            r4 = r17
            r6 = r19
            r7 = r21
            r8 = r22
            r9 = r2
            java.lang.Object r3 = r3.V(r4, r6, r7, r8, r9)
            if (r3 != r10) goto L71
            return r10
        L71:
            r7 = r0
        L72:
            r3 = 0
            com.topstep.fitcloud.pro.shared.data.db.AppDatabase r4 = r7.f18535e
            mg.hb r4 = r4.H()
            r2.f18561d = r3
            r2.f18562e = r3
            if (r15 == 0) goto L8b
            r2.f18567j = r12
            java.lang.Object r1 = r4.q(r13, r1, r2)
            if (r1 != r10) goto L88
            return r10
        L88:
            tl.l r1 = tl.l.f28297a
            return r1
        L8b:
            r2.f18567j = r11
            java.lang.Object r1 = r4.o(r13, r1, r2)
            if (r1 != r10) goto L94
            return r10
        L94:
            tl.l r1 = tl.l.f28297a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kg.m.z(long, java.lang.String, boolean, java.lang.String, java.lang.String, xl.d):java.lang.Object");
    }
}
