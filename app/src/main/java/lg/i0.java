package lg;

import com.topstep.fitcloud.pro.model.data.SportRecord;
import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import java.util.List;
import l2.m2;
import l2.n2;
import mg.d9;

/* loaded from: classes2.dex */
public final class i0 extends n2<Integer, SportRecord> {

    /* renamed from: a */
    public final long f19785a;

    /* renamed from: b */
    public final AppDatabase f19786b;

    /* renamed from: c */
    public final vg.d f19787c;

    /* renamed from: d */
    public final yg.j f19788d;

    /* renamed from: e */
    public final yg.u f19789e;

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.SportHistoryRemoteMediator", f = "SportHistoryRemoteMediator.kt", l = {32}, m = "initialize")
    /* loaded from: classes2.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public long f19790d;

        /* renamed from: e */
        public /* synthetic */ Object f19791e;

        /* renamed from: g */
        public int f19793g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d<? super a> dVar) {
            super(dVar);
            i0.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f19791e = obj;
            this.f19793g |= Integer.MIN_VALUE;
            return i0.this.a(this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.SportHistoryRemoteMediator", f = "SportHistoryRemoteMediator.kt", l = {56, 66, 86}, m = "load")
    /* loaded from: classes2.dex */
    public static final class b extends zl.c {

        /* renamed from: d */
        public Object f19794d;

        /* renamed from: e */
        public l2.r0 f19795e;

        /* renamed from: f */
        public m2 f19796f;

        /* renamed from: g */
        public int f19797g;

        /* renamed from: h */
        public /* synthetic */ Object f19798h;

        /* renamed from: j */
        public int f19800j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(dVar);
            i0.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f19798h = obj;
            this.f19800j |= Integer.MIN_VALUE;
            return i0.this.b(null, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.SportHistoryRemoteMediator$load$2", f = "SportHistoryRemoteMediator.kt", l = {89, 91, 95, 98}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends zl.i implements fm.l<xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f19801e;

        /* renamed from: f */
        public final /* synthetic */ l2.r0 f19802f;

        /* renamed from: g */
        public final /* synthetic */ i0 f19803g;

        /* renamed from: h */
        public final /* synthetic */ List<rg.r> f19804h;

        /* renamed from: i */
        public final /* synthetic */ int f19805i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(l2.r0 r0Var, i0 i0Var, List<rg.r> list, int i10, xl.d<? super c> dVar) {
            super(1, dVar);
            this.f19802f = r0Var;
            this.f19803g = i0Var;
            this.f19804h = list;
            this.f19805i = i10;
        }

        @Override // fm.l
        public final Object k(xl.d<? super tl.l> dVar) {
            return new c(this.f19802f, this.f19803g, this.f19804h, this.f19805i, dVar).t(tl.l.f28297a);
        }

        /* JADX WARN: Removed duplicated region for block: B:64:0x0069 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0098 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:80:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
        @Override // zl.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object t(java.lang.Object r14) {
            /*
                r13 = this;
                yl.a r7 = yl.a.COROUTINE_SUSPENDED
                int r0 = r13.f19801e
                r8 = 0
                r9 = 4
                r10 = 3
                r11 = 2
                r12 = 1
                if (r0 == 0) goto L2d
                if (r0 == r12) goto L29
                if (r0 == r11) goto L25
                if (r0 == r10) goto L20
                if (r0 != r9) goto L18
                mf.a0.k(r14)
                goto Lae
            L18:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L20:
                mf.a0.k(r14)
                goto L99
            L25:
                mf.a0.k(r14)
                goto L6a
            L29:
                mf.a0.k(r14)
                goto L55
            L2d:
                mf.a0.k(r14)
                l2.r0 r0 = r13.f19802f
                l2.r0 r1 = l2.r0.REFRESH
                if (r0 != r1) goto L6a
                lg.i0 r0 = r13.f19803g
                yg.j r1 = r0.f19788d
                long r2 = r0.f19785a
                long r4 = yg.l.d(r1, r2)
                lg.i0 r0 = r13.f19803g
                yg.u r1 = r0.f19789e
                long r2 = r0.f19785a
                yg.n r6 = yg.n.SPORT
                r13.f19801e = r12
                r0 = r1
                r1 = r2
                r3 = r6
                r6 = r13
                java.lang.Object r0 = r0.q(r1, r3, r4, r6)
                if (r0 != r7) goto L55
                return r7
            L55:
                lg.i0 r0 = r13.f19803g
                com.topstep.fitcloud.pro.shared.data.db.AppDatabase r0 = r0.f19786b
                mg.d7 r0 = r0.C()
                lg.i0 r1 = r13.f19803g
                long r1 = r1.f19785a
                r13.f19801e = r11
                java.lang.Object r0 = r0.a(r1, r13)
                if (r0 != r7) goto L6a
                return r7
            L6a:
                java.util.List<rg.r> r0 = r13.f19804h
                if (r0 == 0) goto L77
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L75
                goto L77
            L75:
                r0 = 0
                goto L78
            L77:
                r0 = 1
            L78:
                if (r0 == 0) goto L7c
                r1 = r8
                goto L84
            L7c:
                int r0 = r13.f19805i
                int r0 = r0 + r12
                java.lang.Integer r1 = new java.lang.Integer
                r1.<init>(r0)
            L84:
                lg.i0 r0 = r13.f19803g
                com.topstep.fitcloud.pro.shared.data.db.AppDatabase r0 = r0.f19786b
                mg.d9 r0 = r0.E()
                lg.i0 r2 = r13.f19803g
                long r2 = r2.f19785a
                r13.f19801e = r10
                java.lang.Object r0 = r0.p(r2, r1, r13)
                if (r0 != r7) goto L99
                return r7
            L99:
                java.util.List<rg.r> r0 = r13.f19804h
                if (r0 == 0) goto Lb0
                lg.i0 r1 = r13.f19803g
                com.topstep.fitcloud.pro.shared.data.db.AppDatabase r1 = r1.f19786b
                mg.d7 r1 = r1.C()
                r13.f19801e = r9
                java.lang.Object r0 = r1.l(r0, r13)
                if (r0 != r7) goto Lae
                return r7
            Lae:
                tl.l r8 = tl.l.f28297a
            Lb0:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: lg.i0.c.t(java.lang.Object):java.lang.Object");
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.SportHistoryRemoteMediator$load$loadKey$nextKey$1", f = "SportHistoryRemoteMediator.kt", l = {57}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends zl.i implements fm.l<xl.d<? super Integer>, Object> {

        /* renamed from: e */
        public int f19806e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(1, dVar);
            i0.this = r1;
        }

        @Override // fm.l
        public final Object k(xl.d<? super Integer> dVar) {
            return new d(dVar).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f19806e;
            if (i10 != 0) {
                if (i10 == 1) {
                    mf.a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                mf.a0.k(obj);
                d9 E = i0.this.f19786b.E();
                long j10 = i0.this.f19785a;
                this.f19806e = 1;
                obj = E.e(j10, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    public i0(long j10, AppDatabase appDatabase, vg.d dVar, yg.j jVar, yg.u uVar) {
        gm.l.f(appDatabase, "db");
        gm.l.f(dVar, "apiService");
        gm.l.f(jVar, "internalStorage");
        gm.l.f(uVar, "userStorageManager");
        this.f19785a = j10;
        this.f19786b = appDatabase;
        this.f19787c = dVar;
        this.f19788d = jVar;
        this.f19789e = uVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0078 A[Catch: Exception -> 0x007b, TRY_LEAVE, TryCatch #0 {Exception -> 0x007b, blocks: (B:44:0x0029, B:53:0x0052, B:55:0x0078, B:49:0x0038), top: B:60:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    @Override // l2.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(xl.d<? super l2.n2.a> r12) {
        /*
            r11 = this;
            l2.n2$a r0 = l2.n2.a.LAUNCH_INITIAL_REFRESH
            boolean r1 = r12 instanceof lg.i0.a
            if (r1 == 0) goto L15
            r1 = r12
            lg.i0$a r1 = (lg.i0.a) r1
            int r2 = r1.f19793g
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f19793g = r2
            goto L1a
        L15:
            lg.i0$a r1 = new lg.i0$a
            r1.<init>(r12)
        L1a:
            java.lang.Object r12 = r1.f19791e
            yl.a r2 = yl.a.COROUTINE_SUSPENDED
            int r3 = r1.f19793g
            java.lang.String r4 = "SportRepository"
            r5 = 1
            if (r3 == 0) goto L35
            if (r3 != r5) goto L2d
            long r1 = r1.f19790d
            mf.a0.k(r12)     // Catch: java.lang.Exception -> L7b
            goto L52
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L35:
            mf.a0.k(r12)
            yg.j r12 = r11.f19788d     // Catch: java.lang.Exception -> L7b
            long r6 = r11.f19785a     // Catch: java.lang.Exception -> L7b
            long r6 = yg.l.d(r12, r6)     // Catch: java.lang.Exception -> L7b
            yg.u r12 = r11.f19789e     // Catch: java.lang.Exception -> L7b
            long r8 = r11.f19785a     // Catch: java.lang.Exception -> L7b
            yg.n r3 = yg.n.SPORT     // Catch: java.lang.Exception -> L7b
            r1.f19790d = r6     // Catch: java.lang.Exception -> L7b
            r1.f19793g = r5     // Catch: java.lang.Exception -> L7b
            java.lang.Object r12 = r12.u(r8, r3, r1)     // Catch: java.lang.Exception -> L7b
            if (r12 != r2) goto L51
            return r2
        L51:
            r1 = r6
        L52:
            java.lang.Number r12 = (java.lang.Number) r12     // Catch: java.lang.Exception -> L7b
            long r6 = r12.longValue()     // Catch: java.lang.Exception -> L7b
            do.a$b r12 = p000do.a.f13275a     // Catch: java.lang.Exception -> L7b
            r12.t(r4)     // Catch: java.lang.Exception -> L7b
            java.lang.String r3 = "mediator initialize authTime:%d updateTime:%d"
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Exception -> L7b
            r9 = 0
            java.lang.Long r10 = new java.lang.Long     // Catch: java.lang.Exception -> L7b
            r10.<init>(r1)     // Catch: java.lang.Exception -> L7b
            r8[r9] = r10     // Catch: java.lang.Exception -> L7b
            java.lang.Long r9 = new java.lang.Long     // Catch: java.lang.Exception -> L7b
            r9.<init>(r6)     // Catch: java.lang.Exception -> L7b
            r8[r5] = r9     // Catch: java.lang.Exception -> L7b
            r12.b(r3, r8)     // Catch: java.lang.Exception -> L7b
            int r12 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r12 != 0) goto L84
            l2.n2$a r0 = l2.n2.a.SKIP_INITIAL_REFRESH     // Catch: java.lang.Exception -> L7b
            goto L84
        L7b:
            r12 = move-exception
            do.a$b r1 = p000do.a.f13275a
            r1.t(r4)
            r1.q(r12)
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lg.i0.a(xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x00a0 A[Catch: Exception -> 0x00ac, TryCatch #0 {Exception -> 0x00ac, blocks: (B:87:0x0035, B:133:0x0167, B:135:0x016b, B:140:0x0175, B:92:0x004a, B:122:0x00e4, B:124:0x00ec, B:125:0x00fb, B:127:0x0101, B:130:0x0149, B:95:0x005c, B:106:0x009c, B:108:0x00a0, B:118:0x00bf, B:109:0x00a6, B:98:0x0079, B:102:0x0083, B:113:0x00af, B:114:0x00b4, B:115:0x00b5), top: B:144:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00a6 A[Catch: Exception -> 0x00ac, TryCatch #0 {Exception -> 0x00ac, blocks: (B:87:0x0035, B:133:0x0167, B:135:0x016b, B:140:0x0175, B:92:0x004a, B:122:0x00e4, B:124:0x00ec, B:125:0x00fb, B:127:0x0101, B:130:0x0149, B:95:0x005c, B:106:0x009c, B:108:0x00a0, B:118:0x00bf, B:109:0x00a6, B:98:0x0079, B:102:0x0083, B:113:0x00af, B:114:0x00b4, B:115:0x00b5), top: B:144:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00ec A[Catch: Exception -> 0x00ac, TryCatch #0 {Exception -> 0x00ac, blocks: (B:87:0x0035, B:133:0x0167, B:135:0x016b, B:140:0x0175, B:92:0x004a, B:122:0x00e4, B:124:0x00ec, B:125:0x00fb, B:127:0x0101, B:130:0x0149, B:95:0x005c, B:106:0x009c, B:108:0x00a0, B:118:0x00bf, B:109:0x00a6, B:98:0x0079, B:102:0x0083, B:113:0x00af, B:114:0x00b4, B:115:0x00b5), top: B:144:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0166 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x016b A[Catch: Exception -> 0x00ac, TryCatch #0 {Exception -> 0x00ac, blocks: (B:87:0x0035, B:133:0x0167, B:135:0x016b, B:140:0x0175, B:92:0x004a, B:122:0x00e4, B:124:0x00ec, B:125:0x00fb, B:127:0x0101, B:130:0x0149, B:95:0x005c, B:106:0x009c, B:108:0x00a0, B:118:0x00bf, B:109:0x00a6, B:98:0x0079, B:102:0x0083, B:113:0x00af, B:114:0x00b4, B:115:0x00b5), top: B:144:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0066  */
    @Override // l2.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(l2.r0 r36, l2.m2<java.lang.Integer, com.topstep.fitcloud.pro.model.data.SportRecord> r37, xl.d<? super l2.n2.b> r38) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lg.i0.b(l2.r0, l2.m2, xl.d):java.lang.Object");
    }
}
