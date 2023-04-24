package mg;

import kg.f;

/* loaded from: classes2.dex */
public abstract class sa {

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.UserConfigDao", f = "UserConfigDao.kt", l = {103, 104, 105}, m = "deleteAccount")
    /* loaded from: classes2.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public sa f21429d;

        /* renamed from: e */
        public long f21430e;

        /* renamed from: f */
        public /* synthetic */ Object f21431f;

        /* renamed from: h */
        public int f21433h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d<? super a> dVar) {
            super(dVar);
            sa.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f21431f = obj;
            this.f21433h |= Integer.MIN_VALUE;
            return sa.this.d(0L, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.UserConfigDao", f = "UserConfigDao.kt", l = {59, 61}, m = "saveSyncDeviceBind$suspendImpl")
    /* loaded from: classes2.dex */
    public static final class b extends zl.c {

        /* renamed from: d */
        public sa f21434d;

        /* renamed from: e */
        public pg.d f21435e;

        /* renamed from: f */
        public pg.d f21436f;

        /* renamed from: g */
        public /* synthetic */ Object f21437g;

        /* renamed from: i */
        public int f21439i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(dVar);
            sa.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f21437g = obj;
            this.f21439i |= Integer.MIN_VALUE;
            return sa.r(sa.this, null, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.UserConfigDao", f = "UserConfigDao.kt", l = {80, 83}, m = "saveSyncExerciseGoalConfig$suspendImpl")
    /* loaded from: classes2.dex */
    public static final class c extends zl.c {

        /* renamed from: d */
        public sa f21440d;

        /* renamed from: e */
        public pg.f f21441e;

        /* renamed from: f */
        public pg.f f21442f;

        /* renamed from: g */
        public /* synthetic */ Object f21443g;

        /* renamed from: i */
        public int f21445i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(dVar);
            sa.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f21443g = obj;
            this.f21445i |= Integer.MIN_VALUE;
            return sa.t(sa.this, null, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.UserConfigDao", f = "UserConfigDao.kt", l = {27, 30}, m = "saveSyncUnitConfig$suspendImpl")
    /* loaded from: classes2.dex */
    public static final class d extends zl.c {

        /* renamed from: d */
        public sa f21446d;

        /* renamed from: e */
        public pg.k f21447e;

        /* renamed from: f */
        public pg.k f21448f;

        /* renamed from: g */
        public /* synthetic */ Object f21449g;

        /* renamed from: i */
        public int f21451i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(dVar);
            sa.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f21449g = obj;
            this.f21451i |= Integer.MIN_VALUE;
            return sa.v(sa.this, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object r(mg.sa r9, pg.d r10, pg.d r11, xl.d<? super tl.l> r12) {
        /*
            boolean r0 = r12 instanceof mg.sa.b
            if (r0 == 0) goto L13
            r0 = r12
            mg.sa$b r0 = (mg.sa.b) r0
            int r1 = r0.f21439i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21439i = r1
            goto L18
        L13:
            mg.sa$b r0 = new mg.sa$b
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f21437g
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f21439i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            mf.a0.k(r12)
            goto L7c
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            pg.d r11 = r0.f21436f
            pg.d r10 = r0.f21435e
            mg.sa r9 = r0.f21434d
            mf.a0.k(r12)
            goto L50
        L3c:
            mf.a0.k(r12)
            long r5 = r11.f24027d
            r0.f21434d = r9
            r0.f21435e = r10
            r0.f21436f = r11
            r0.f21439i = r4
            java.lang.Object r12 = r9.n(r5, r0)
            if (r12 != r1) goto L50
            return r1
        L50:
            pg.d r12 = (pg.d) r12
            r2 = 0
            if (r10 != 0) goto L58
            if (r12 == 0) goto L63
            goto L65
        L58:
            if (r12 == 0) goto L65
            long r5 = r10.f24032i
            long r7 = r12.f24032i
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 == 0) goto L63
            goto L65
        L63:
            r10 = 0
            goto L66
        L65:
            r10 = 1
        L66:
            if (r10 != 0) goto L7f
            pg.d[] r10 = new pg.d[r4]
            r10[r2] = r11
            r11 = 0
            r0.f21434d = r11
            r0.f21435e = r11
            r0.f21436f = r11
            r0.f21439i = r3
            java.lang.Object r9 = r9.k(r10, r0)
            if (r9 != r1) goto L7c
            return r1
        L7c:
            tl.l r9 = tl.l.f28297a
            return r9
        L7f:
            tl.l r9 = tl.l.f28297a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.sa.r(mg.sa, pg.d, pg.d, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object t(mg.sa r9, pg.f r10, pg.f r11, xl.d<? super tl.l> r12) {
        /*
            boolean r0 = r12 instanceof mg.sa.c
            if (r0 == 0) goto L13
            r0 = r12
            mg.sa$c r0 = (mg.sa.c) r0
            int r1 = r0.f21445i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21445i = r1
            goto L18
        L13:
            mg.sa$c r0 = new mg.sa$c
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f21443g
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f21445i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            mf.a0.k(r12)
            goto L7c
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            pg.f r11 = r0.f21442f
            pg.f r10 = r0.f21441e
            mg.sa r9 = r0.f21440d
            mf.a0.k(r12)
            goto L50
        L3c:
            mf.a0.k(r12)
            long r5 = r11.f24036d
            r0.f21440d = r9
            r0.f21441e = r10
            r0.f21442f = r11
            r0.f21445i = r4
            java.lang.Object r12 = r9.o(r5, r0)
            if (r12 != r1) goto L50
            return r1
        L50:
            pg.f r12 = (pg.f) r12
            r2 = 0
            if (r10 != 0) goto L58
            if (r12 == 0) goto L63
            goto L65
        L58:
            if (r12 == 0) goto L65
            long r5 = r10.f24040h
            long r7 = r12.f24040h
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 == 0) goto L63
            goto L65
        L63:
            r10 = 0
            goto L66
        L65:
            r10 = 1
        L66:
            if (r10 != 0) goto L7f
            pg.f[] r10 = new pg.f[r4]
            r10[r2] = r11
            r11 = 0
            r0.f21440d = r11
            r0.f21441e = r11
            r0.f21442f = r11
            r0.f21445i = r3
            java.lang.Object r9 = r9.l(r10, r0)
            if (r9 != r1) goto L7c
            return r1
        L7c:
            tl.l r9 = tl.l.f28297a
            return r9
        L7f:
            tl.l r9 = tl.l.f28297a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.sa.t(mg.sa, pg.f, pg.f, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object v(mg.sa r9, pg.k r10, pg.k r11, xl.d<? super tl.l> r12) {
        /*
            boolean r0 = r12 instanceof mg.sa.d
            if (r0 == 0) goto L13
            r0 = r12
            mg.sa$d r0 = (mg.sa.d) r0
            int r1 = r0.f21451i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21451i = r1
            goto L18
        L13:
            mg.sa$d r0 = new mg.sa$d
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f21449g
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f21451i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            mf.a0.k(r12)
            goto L7c
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            pg.k r11 = r0.f21448f
            pg.k r10 = r0.f21447e
            mg.sa r9 = r0.f21446d
            mf.a0.k(r12)
            goto L50
        L3c:
            mf.a0.k(r12)
            long r5 = r11.f24055d
            r0.f21446d = r9
            r0.f21447e = r10
            r0.f21448f = r11
            r0.f21451i = r4
            java.lang.Object r12 = r9.p(r5, r0)
            if (r12 != r1) goto L50
            return r1
        L50:
            pg.k r12 = (pg.k) r12
            r2 = 0
            if (r10 != 0) goto L58
            if (r12 == 0) goto L63
            goto L65
        L58:
            if (r12 == 0) goto L65
            long r5 = r10.f24059h
            long r7 = r12.f24059h
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 == 0) goto L63
            goto L65
        L63:
            r10 = 0
            goto L66
        L65:
            r10 = 1
        L66:
            if (r10 != 0) goto L7f
            pg.k[] r10 = new pg.k[r4]
            r10[r2] = r11
            r11 = 0
            r0.f21446d = r11
            r0.f21447e = r11
            r0.f21448f = r11
            r0.f21451i = r3
            java.lang.Object r9 = r9.m(r10, r0)
            if (r9 != r1) goto L7c
            return r1
        L7c:
            tl.l r9 = tl.l.f28297a
            return r9
        L7f:
            tl.l r9 = tl.l.f28297a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.sa.v(mg.sa, pg.k, pg.k, xl.d):java.lang.Object");
    }

    public abstract Object a(long j10, long j11, xl.d<? super tl.l> dVar);

    public abstract Object b(long j10, long j11, xl.d<? super tl.l> dVar);

    public abstract Object c(long j10, long j11, xl.d<? super tl.l> dVar);

    /* JADX WARN: Removed duplicated region for block: B:40:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x006e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(long r7, xl.d<? super tl.l> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof mg.sa.a
            if (r0 == 0) goto L13
            r0 = r9
            mg.sa$a r0 = (mg.sa.a) r0
            int r1 = r0.f21433h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21433h = r1
            goto L18
        L13:
            mg.sa$a r0 = new mg.sa$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f21431f
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f21433h
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            mf.a0.k(r9)
            goto L6f
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            long r7 = r0.f21430e
            mg.sa r2 = r0.f21429d
            mf.a0.k(r9)
            goto L63
        L3d:
            long r7 = r0.f21430e
            mg.sa r2 = r0.f21429d
            mf.a0.k(r9)
            goto L56
        L45:
            mf.a0.k(r9)
            r0.f21429d = r6
            r0.f21430e = r7
            r0.f21433h = r5
            java.lang.Object r9 = r6.g(r7, r0)
            if (r9 != r1) goto L55
            return r1
        L55:
            r2 = r6
        L56:
            r0.f21429d = r2
            r0.f21430e = r7
            r0.f21433h = r4
            java.lang.Object r9 = r2.e(r7, r0)
            if (r9 != r1) goto L63
            return r1
        L63:
            r9 = 0
            r0.f21429d = r9
            r0.f21433h = r3
            java.lang.Object r7 = r2.f(r7, r0)
            if (r7 != r1) goto L6f
            return r1
        L6f:
            tl.l r7 = tl.l.f28297a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.sa.d(long, xl.d):java.lang.Object");
    }

    public abstract Object e(long j10, a aVar);

    public abstract Object f(long j10, a aVar);

    public abstract Object g(long j10, a aVar);

    public abstract sm.u0 h(long j10);

    public abstract sm.u0 i(long j10);

    public abstract sm.u0 j(long j10);

    public abstract Object k(pg.d[] dVarArr, zl.c cVar);

    public abstract Object l(pg.f[] fVarArr, xl.d<? super tl.l> dVar);

    public abstract Object m(pg.k[] kVarArr, xl.d<? super tl.l> dVar);

    public abstract Object n(long j10, zl.c cVar);

    public abstract Object o(long j10, zl.c cVar);

    public abstract Object p(long j10, zl.c cVar);

    public Object q(pg.d dVar, pg.d dVar2, f.a aVar) {
        return r(this, dVar, dVar2, aVar);
    }

    public Object s(pg.f fVar, pg.f fVar2, f.a aVar) {
        return t(this, fVar, fVar2, aVar);
    }

    public Object u(pg.k kVar, pg.k kVar2, f.a aVar) {
        return v(this, kVar, kVar2, aVar);
    }
}
