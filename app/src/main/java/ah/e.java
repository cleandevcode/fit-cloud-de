package ah;

import bi.r;
import bi.z0;
import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import com.topstep.fitcloud.pro.shared.data.wh.WhMenstruationConfig;
import com.topstep.fitcloud.pro.shared.data.wh.WhRemindConfig;
import gm.l;
import java.util.Calendar;
import java.util.Date;
import kg.k;
import mg.b3;
import mg.b9;
import mg.c3;
import mg.c9;
import mg.d9;
import pm.e0;
import sm.b1;
import sm.i;
import sm.m0;
import sm.t0;
import yg.b0;
import yg.j;
import yg.u;

/* loaded from: classes2.dex */
public final class e implements ah.a {

    /* renamed from: a */
    public final e0 f484a;

    /* renamed from: b */
    public final j f485b;

    /* renamed from: c */
    public final AppDatabase f486c;

    /* renamed from: d */
    public final u f487d;

    /* renamed from: e */
    public final k f488e;

    /* renamed from: f */
    public final t0 f489f;

    /* renamed from: g */
    public bh.b f490g;

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.wh.WomenHealthRepositoryImpl", f = "WomenHealthRepository.kt", l = {135}, m = "getConfigByMode")
    /* loaded from: classes2.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public e f491d;

        /* renamed from: e */
        public int f492e;

        /* renamed from: f */
        public /* synthetic */ Object f493f;

        /* renamed from: h */
        public int f495h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d<? super a> dVar) {
            super(dVar);
            e.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f493f = obj;
            this.f495h |= Integer.MIN_VALUE;
            return e.this.c(0, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.wh.WomenHealthRepositoryImpl", f = "WomenHealthRepository.kt", l = {242}, m = "getConfigForDevice")
    /* loaded from: classes2.dex */
    public static final class b extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f496d;

        /* renamed from: f */
        public int f498f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(dVar);
            e.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f496d = obj;
            this.f498f |= Integer.MIN_VALUE;
            return e.this.f(null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.wh.WomenHealthRepositoryImpl", f = "WomenHealthRepository.kt", l = {223}, m = "getMenstruationResult")
    /* loaded from: classes2.dex */
    public static final class c extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f499d;

        /* renamed from: f */
        public int f501f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(dVar);
            e.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f499d = obj;
            this.f501f |= Integer.MIN_VALUE;
            return e.this.e(null, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.wh.WomenHealthRepositoryImpl", f = "WomenHealthRepository.kt", l = {117, 117}, m = "isWomenHealthEnabled")
    /* loaded from: classes2.dex */
    public static final class d extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f502d;

        /* renamed from: f */
        public int f504f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(dVar);
            e.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f502d = obj;
            this.f504f |= Integer.MIN_VALUE;
            return e.this.h(this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.wh.WomenHealthRepositoryImpl", f = "WomenHealthRepository.kt", l = {145, 153, 161, 163}, m = "setConfig")
    /* renamed from: ah.e$e */
    /* loaded from: classes2.dex */
    public static final class C0006e extends zl.c {

        /* renamed from: d */
        public e f505d;

        /* renamed from: e */
        public gg.b f506e;

        /* renamed from: f */
        public long f507f;

        /* renamed from: g */
        public /* synthetic */ Object f508g;

        /* renamed from: i */
        public int f510i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0006e(xl.d<? super C0006e> dVar) {
            super(dVar);
            e.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f508g = obj;
            this.f510i |= Integer.MIN_VALUE;
            return e.this.b(null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.wh.WomenHealthRepositoryImpl", f = "WomenHealthRepository.kt", l = {104, 106, 108, 111}, m = "setWomenHealthEnabled")
    /* loaded from: classes2.dex */
    public static final class f extends zl.c {

        /* renamed from: d */
        public e f511d;

        /* renamed from: e */
        public long f512e;

        /* renamed from: f */
        public /* synthetic */ Object f513f;

        /* renamed from: h */
        public int f515h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(xl.d<? super f> dVar) {
            super(dVar);
            e.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f513f = obj;
            this.f515h |= Integer.MIN_VALUE;
            return e.this.d(false, this);
        }
    }

    public e(e0 e0Var, yg.b bVar, AppDatabase appDatabase, b0 b0Var, k kVar) {
        l.f(e0Var, "applicationScope");
        l.f(appDatabase, "appDatabase");
        l.f(kVar, "userInfoRepository");
        this.f484a = e0Var;
        this.f485b = bVar;
        this.f486c = appDatabase;
        this.f487d = b0Var;
        this.f488e = kVar;
        this.f489f = r.M(r.O(bVar.f31487f, new ah.f(this, null)), e0Var, b1.a.f27123a, null);
        z0.g(e0Var, null, 0, new ah.b(this, null), 3);
    }

    public static gg.b j(e eVar, int i10) {
        WhRemindConfig whRemindConfig = new WhRemindConfig(false, 0, 0, 0, 15, null);
        WhMenstruationConfig whMenstruationConfig = new WhMenstruationConfig(0, 0, null, 7, null);
        eVar.getClass();
        return new gg.b(i10, whRemindConfig.f10111a, whRemindConfig.f10112b, whRemindConfig.f10113c, whRemindConfig.f10114d, whMenstruationConfig.f10104a, whMenstruationConfig.f10105b, whMenstruationConfig.f10106c);
    }

    @Override // ah.a
    public final t0 a() {
        return this.f489f;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00f0  */
    @Override // ah.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(gg.b r13, xl.d<? super tl.l> r14) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ah.e.b(gg.b, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0035  */
    @Override // ah.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(int r7, xl.d<? super gg.b> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ah.e.a
            if (r0 == 0) goto L13
            r0 = r8
            ah.e$a r0 = (ah.e.a) r0
            int r1 = r0.f495h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f495h = r1
            goto L18
        L13:
            ah.e$a r0 = new ah.e$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f493f
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f495h
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            int r7 = r0.f492e
            ah.e r0 = r0.f491d
            mf.a0.k(r8)     // Catch: java.lang.Exception -> L2b
            goto L6b
        L2b:
            r8 = move-exception
            goto L70
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            mf.a0.k(r8)
            sm.t0 r8 = r6.f489f
            java.lang.Object r8 = r8.getValue()
            gg.b r8 = (gg.b) r8
            if (r8 == 0) goto L4d
            int r2 = r8.f15335a
            if (r2 != r7) goto L47
            return r8
        L47:
            r4 = 3
            if (r7 == r4) goto L4d
            if (r2 == r4) goto L4d
            return r8
        L4d:
            yg.j r8 = r6.f485b
            java.lang.Long r8 = yg.l.b(r8)
            if (r8 == 0) goto L7a
            long r4 = r8.longValue()
            sm.m0 r8 = r6.k(r7, r4)     // Catch: java.lang.Exception -> L6e
            r0.f491d = r6     // Catch: java.lang.Exception -> L6e
            r0.f492e = r7     // Catch: java.lang.Exception -> L6e
            r0.f495h = r3     // Catch: java.lang.Exception -> L6e
            java.lang.Object r8 = bi.r.w(r8, r0)     // Catch: java.lang.Exception -> L6e
            if (r8 != r1) goto L6a
            return r1
        L6a:
            r0 = r6
        L6b:
            gg.b r8 = (gg.b) r8     // Catch: java.lang.Exception -> L2b
            goto L79
        L6e:
            r8 = move-exception
            r0 = r6
        L70:
            do.a$b r1 = p000do.a.f13275a
            r1.q(r8)
            gg.b r8 = j(r0, r7)
        L79:
            return r8
        L7a:
            gg.b r7 = j(r6, r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ah.e.c(int, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x008b  */
    @Override // ah.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(boolean r10, xl.d<? super tl.l> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof ah.e.f
            if (r0 == 0) goto L13
            r0 = r11
            ah.e$f r0 = (ah.e.f) r0
            int r1 = r0.f515h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f515h = r1
            goto L18
        L13:
            ah.e$f r0 = new ah.e$f
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f513f
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f515h
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L49
            if (r2 == r6) goto L41
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            mf.a0.k(r11)
            goto La6
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            mf.a0.k(r11)
            goto L98
        L3d:
            mf.a0.k(r11)
            goto L88
        L41:
            long r2 = r0.f512e
            ah.e r10 = r0.f511d
            mf.a0.k(r11)
            goto L6f
        L49:
            mf.a0.k(r11)
            yg.j r11 = r9.f485b
            java.lang.Long r11 = yg.l.b(r11)
            if (r11 == 0) goto La9
            long r7 = r11.longValue()
            if (r10 == 0) goto L9b
            com.topstep.fitcloud.pro.shared.data.db.AppDatabase r10 = r9.f486c
            mg.c3 r10 = r10.x()
            r0.f511d = r9
            r0.f512e = r7
            r0.f515h = r6
            java.lang.Object r11 = r10.h(r7, r0)
            if (r11 != r1) goto L6d
            return r1
        L6d:
            r10 = r9
            r2 = r7
        L6f:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            r11 = r11 ^ r6
            r7 = 0
            if (r11 == 0) goto L8b
            gg.b r11 = j(r10, r6)
            r0.f511d = r7
            r0.f515h = r5
            java.lang.Object r10 = r10.b(r11, r0)
            if (r10 != r1) goto L88
            return r1
        L88:
            tl.l r10 = tl.l.f28297a
            return r10
        L8b:
            yg.u r10 = r10.f487d
            r0.f511d = r7
            r0.f515h = r4
            java.lang.Object r10 = r10.j(r2, r0)
            if (r10 != r1) goto L98
            return r1
        L98:
            tl.l r10 = tl.l.f28297a
            return r10
        L9b:
            yg.u r10 = r9.f487d
            r0.f515h = r3
            java.lang.Object r10 = r10.o(r7, r0)
            if (r10 != r1) goto La6
            return r1
        La6:
            tl.l r10 = tl.l.f28297a
            return r10
        La9:
            tl.l r10 = tl.l.f28297a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ah.e.d(boolean, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0032  */
    @Override // ah.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(java.util.Calendar r8, java.util.Date r9, xl.d<? super gg.a> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof ah.e.c
            if (r0 == 0) goto L13
            r0 = r10
            ah.e$c r0 = (ah.e.c) r0
            int r1 = r0.f501f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f501f = r1
            goto L18
        L13:
            ah.e$c r0 = new ah.e$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f499d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f501f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            mf.a0.k(r10)     // Catch: java.lang.Exception -> L28
            goto L5c
        L28:
            r8 = move-exception
            goto L60
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            mf.a0.k(r10)
            yg.j r10 = r7.f485b
            java.lang.Long r10 = yg.l.b(r10)
            if (r10 == 0) goto L65
            long r5 = r10.longValue()
            bh.b r10 = r7.l(r5)
            sm.t0 r2 = r7.f489f
            java.lang.Object r2 = r2.getValue()
            gg.b r2 = (gg.b) r2
            if (r2 == 0) goto L52
            int r2 = r2.f15338d
            goto L53
        L52:
            r2 = 3
        L53:
            r0.f501f = r4     // Catch: java.lang.Exception -> L28
            java.lang.Object r10 = r10.c(r8, r9, r2, r0)     // Catch: java.lang.Exception -> L28
            if (r10 != r1) goto L5c
            return r1
        L5c:
            gg.a r10 = (gg.a) r10     // Catch: java.lang.Exception -> L28
            r3 = r10
            goto L65
        L60:
            do.a$b r9 = p000do.a.f13275a
            r9.q(r8)
        L65:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ah.e.e(java.util.Calendar, java.util.Date, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0032  */
    @Override // ah.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(gg.b r8, xl.d<? super nj.n> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ah.e.b
            if (r0 == 0) goto L13
            r0 = r9
            ah.e$b r0 = (ah.e.b) r0
            int r1 = r0.f498f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f498f = r1
            goto L18
        L13:
            ah.e$b r0 = new ah.e$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f496d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f498f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            mf.a0.k(r9)     // Catch: java.lang.Exception -> L28
            goto L4e
        L28:
            r8 = move-exception
            goto L52
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            mf.a0.k(r9)
            yg.j r9 = r7.f485b
            java.lang.Long r9 = yg.l.b(r9)
            if (r9 == 0) goto L57
            long r5 = r9.longValue()
            bh.b r9 = r7.l(r5)
            r0.f498f = r4     // Catch: java.lang.Exception -> L28
            java.lang.Object r9 = r9.b(r8, r0)     // Catch: java.lang.Exception -> L28
            if (r9 != r1) goto L4e
            return r1
        L4e:
            nj.n r9 = (nj.n) r9     // Catch: java.lang.Exception -> L28
            r3 = r9
            goto L57
        L52:
            do.a$b r9 = p000do.a.f13275a
            r9.q(r8)
        L57:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ah.e.f(gg.b, xl.d):java.lang.Object");
    }

    @Override // ah.a
    public final void g() {
        Long b10 = yg.l.b(this.f485b);
        if (b10 != null) {
            long longValue = b10.longValue();
            bh.b bVar = this.f490g;
            if (bVar != null && bVar.f4193a == longValue) {
                bVar.f4195c.clear();
                bVar.f4196d = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005e  */
    @Override // ah.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(xl.d<? super java.lang.Boolean> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ah.e.d
            if (r0 == 0) goto L13
            r0 = r8
            ah.e$d r0 = (ah.e.d) r0
            int r1 = r0.f504f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f504f = r1
            goto L18
        L13:
            ah.e$d r0 = new ah.e$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f502d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f504f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            mf.a0.k(r8)
            goto L5b
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L32:
            mf.a0.k(r8)
            goto L50
        L36:
            mf.a0.k(r8)
            yg.j r8 = r7.f485b
            java.lang.Long r8 = yg.l.b(r8)
            if (r8 == 0) goto L64
            long r5 = r8.longValue()
            yg.u r8 = r7.f487d
            r0.f504f = r4
            tm.j r8 = r8.s(r5)
            if (r8 != r1) goto L50
            return r1
        L50:
            sm.f r8 = (sm.f) r8
            r0.f504f = r3
            java.lang.Object r8 = bi.r.w(r8, r0)
            if (r8 != r1) goto L5b
            return r1
        L5b:
            if (r8 == 0) goto L5e
            goto L5f
        L5e:
            r4 = 0
        L5f:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
            return r8
        L64:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ah.e.h(xl.d):java.lang.Object");
    }

    @Override // ah.a
    public final Object i(Calendar calendar, Date date, boolean z10, xl.d<? super tl.l> dVar) {
        Object a10;
        Long b10 = yg.l.b(this.f485b);
        return (b10 == null || (a10 = l(b10.longValue()).a(calendar, date, z10, dVar)) != yl.a.COROUTINE_SUSPENDED) ? tl.l.f28297a : a10;
    }

    public final m0 k(int i10, long j10) {
        sm.f b3Var;
        if (i10 == 3) {
            d9 E = this.f486c.E();
            b3Var = new b9(E.b(3002, j10), E);
        } else {
            c3 x10 = this.f486c.x();
            b3Var = new b3(x10.d(j10), x10);
        }
        i iVar = new i(Integer.valueOf(i10));
        d9 E2 = this.f486c.E();
        return r.p(iVar, new c9(E2.b(3001, j10), E2), b3Var, new ah.d(this, null));
    }

    public final bh.b l(long j10) {
        bh.b bVar = this.f490g;
        if (bVar == null || bVar.f4193a != j10) {
            bh.b bVar2 = new bh.b(j10, this.f486c.x());
            this.f490g = bVar2;
            return bVar2;
        }
        return bVar;
    }
}
