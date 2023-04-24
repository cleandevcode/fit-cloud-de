package yg;

import v1.d;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes2.dex */
public final class a {

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.DataStoreKtxKt", f = "DataStoreKtx.kt", l = {14}, m = "readNonNull")
    /* renamed from: yg.a$a */
    /* loaded from: classes2.dex */
    public static final class C0578a<T> extends zl.c {

        /* renamed from: d */
        public d.a f31463d;

        /* renamed from: e */
        public Object f31464e;

        /* renamed from: f */
        public /* synthetic */ Object f31465f;

        /* renamed from: g */
        public int f31466g;

        public C0578a(xl.d<? super C0578a> dVar) {
            super(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f31465f = obj;
            this.f31466g |= Integer.MIN_VALUE;
            return a.a(null, null, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.DataStoreKtxKt", f = "DataStoreKtx.kt", l = {26}, m = "readNullable")
    /* loaded from: classes2.dex */
    public static final class b<T> extends zl.c {

        /* renamed from: d */
        public d.a f31467d;

        /* renamed from: e */
        public Object f31468e;

        /* renamed from: f */
        public /* synthetic */ Object f31469f;

        /* renamed from: g */
        public int f31470g;

        public b(xl.d<? super b> dVar) {
            super(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f31469f = obj;
            this.f31470g |= Integer.MIN_VALUE;
            return a.b(null, null, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.DataStoreKtxKt", f = "DataStoreKtx.kt", l = {40}, m = "write")
    /* loaded from: classes2.dex */
    public static final class c<T> extends zl.c {

        /* renamed from: d */
        public d.a f31471d;

        /* renamed from: e */
        public /* synthetic */ Object f31472e;

        /* renamed from: f */
        public int f31473f;

        public c(xl.d<? super c> dVar) {
            super(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f31472e = obj;
            this.f31473f |= Integer.MIN_VALUE;
            return a.c(null, null, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.DataStoreKtxKt$write$2", f = "DataStoreKtx.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends zl.i implements fm.p<v1.a, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f31474e;

        /* renamed from: f */
        public final /* synthetic */ T f31475f;

        /* renamed from: g */
        public final /* synthetic */ d.a<T> f31476g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(T t10, d.a<T> aVar, xl.d<? super d> dVar) {
            super(2, dVar);
            this.f31475f = t10;
            this.f31476g = aVar;
        }

        @Override // fm.p
        public final Object A(v1.a aVar, xl.d<? super tl.l> dVar) {
            return ((d) p(aVar, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            d dVar2 = new d(this.f31475f, this.f31476g, dVar);
            dVar2.f31474e = obj;
            return dVar2;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            mf.a0.k(obj);
            v1.a aVar = (v1.a) this.f31474e;
            T t10 = this.f31475f;
            if (t10 == 0) {
                Object obj2 = this.f31476g;
                aVar.getClass();
                gm.l.f(obj2, "key");
                aVar.c();
                aVar.f28978a.remove(obj2);
            } else {
                aVar.d(this.f31476g, t10);
            }
            return tl.l.f28297a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object a(s1.i<v1.d> r4, v1.d.a<T> r5, T r6, xl.d<? super T> r7) {
        /*
            boolean r0 = r7 instanceof yg.a.C0578a
            if (r0 == 0) goto L13
            r0 = r7
            yg.a$a r0 = (yg.a.C0578a) r0
            int r1 = r0.f31466g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31466g = r1
            goto L18
        L13:
            yg.a$a r0 = new yg.a$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f31465f
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f31466g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r6 = r0.f31464e
            v1.d$a r5 = r0.f31463d
            mf.a0.k(r7)     // Catch: java.lang.Exception -> L52
            goto L47
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            mf.a0.k(r7)
            sm.f r4 = r4.getData()     // Catch: java.lang.Exception -> L52
            r0.f31463d = r5     // Catch: java.lang.Exception -> L52
            r0.f31464e = r6     // Catch: java.lang.Exception -> L52
            r0.f31466g = r3     // Catch: java.lang.Exception -> L52
            java.lang.Object r7 = bi.r.w(r4, r0)     // Catch: java.lang.Exception -> L52
            if (r7 != r1) goto L47
            return r1
        L47:
            v1.d r7 = (v1.d) r7     // Catch: java.lang.Exception -> L52
            java.lang.Object r4 = r7.b(r5)     // Catch: java.lang.Exception -> L52
            if (r4 != 0) goto L50
            goto L66
        L50:
            r6 = r4
            goto L66
        L52:
            r4 = move-exception
            do.a$b r7 = p000do.a.f13275a
            java.lang.String r0 = "DataStoreExt"
            r7.t(r0)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r1 = 0
            java.lang.String r5 = r5.f28986a
            r0[r1] = r5
            java.lang.String r5 = "read data %s failed"
            r7.r(r4, r5, r0)
        L66:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.a.a(s1.i, v1.d$a, java.lang.Object, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object b(s1.i<v1.d> r4, v1.d.a<T> r5, T r6, xl.d<? super T> r7) {
        /*
            boolean r0 = r7 instanceof yg.a.b
            if (r0 == 0) goto L13
            r0 = r7
            yg.a$b r0 = (yg.a.b) r0
            int r1 = r0.f31470g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31470g = r1
            goto L18
        L13:
            yg.a$b r0 = new yg.a$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f31469f
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f31470g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r6 = r0.f31468e
            v1.d$a r5 = r0.f31467d
            mf.a0.k(r7)     // Catch: java.lang.Exception -> L52
            goto L47
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            mf.a0.k(r7)
            sm.f r4 = r4.getData()     // Catch: java.lang.Exception -> L52
            r0.f31467d = r5     // Catch: java.lang.Exception -> L52
            r0.f31468e = r6     // Catch: java.lang.Exception -> L52
            r0.f31470g = r3     // Catch: java.lang.Exception -> L52
            java.lang.Object r7 = bi.r.w(r4, r0)     // Catch: java.lang.Exception -> L52
            if (r7 != r1) goto L47
            return r1
        L47:
            v1.d r7 = (v1.d) r7     // Catch: java.lang.Exception -> L52
            java.lang.Object r4 = r7.b(r5)     // Catch: java.lang.Exception -> L52
            if (r4 != 0) goto L50
            goto L66
        L50:
            r6 = r4
            goto L66
        L52:
            r4 = move-exception
            do.a$b r7 = p000do.a.f13275a
            java.lang.String r0 = "DataStoreExt"
            r7.t(r0)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r1 = 0
            java.lang.String r5 = r5.f28986a
            r0[r1] = r5
            java.lang.String r5 = "read data %s failed"
            r7.r(r4, r5, r0)
        L66:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.a.b(s1.i, v1.d$a, java.lang.Object, xl.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|25|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0048, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0049, code lost:
        r7 = p000do.a.f13275a;
        r7.t("DataStoreExt");
        r8 = new java.lang.Object[1];
        r8[r3 ? 1 : 0] = r6.f28986a;
        r7.r(r5, "write data %s failed", r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object c(s1.i<v1.d> r5, v1.d.a<T> r6, T r7, xl.d<? super java.lang.Boolean> r8) {
        /*
            boolean r0 = r8 instanceof yg.a.c
            if (r0 == 0) goto L13
            r0 = r8
            yg.a$c r0 = (yg.a.c) r0
            int r1 = r0.f31473f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31473f = r1
            goto L18
        L13:
            yg.a$c r0 = new yg.a$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f31472e
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f31473f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            v1.d$a r6 = r0.f31471d
            mf.a0.k(r8)     // Catch: java.lang.Exception -> L48
            goto L46
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            mf.a0.k(r8)
            yg.a$d r8 = new yg.a$d     // Catch: java.lang.Exception -> L48
            r2 = 0
            r8.<init>(r7, r6, r2)     // Catch: java.lang.Exception -> L48
            r0.f31471d = r6     // Catch: java.lang.Exception -> L48
            r0.f31473f = r4     // Catch: java.lang.Exception -> L48
            java.lang.Object r5 = v1.e.a(r5, r8, r0)     // Catch: java.lang.Exception -> L48
            if (r5 != r1) goto L46
            return r1
        L46:
            r3 = 1
            goto L5b
        L48:
            r5 = move-exception
            do.a$b r7 = p000do.a.f13275a
            java.lang.String r8 = "DataStoreExt"
            r7.t(r8)
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.String r6 = r6.f28986a
            r8[r3] = r6
            java.lang.String r6 = "write data %s failed"
            r7.r(r5, r6, r8)
        L5b:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.a.c(s1.i, v1.d$a, java.lang.Object, xl.d):java.lang.Object");
    }
}
