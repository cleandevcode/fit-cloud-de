package og;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import java.util.List;

/* loaded from: classes2.dex */
public final class o1 implements n1 {

    /* renamed from: a */
    public final AppDatabase f23423a;

    /* renamed from: b */
    public final vg.d f23424b;

    /* renamed from: c */
    public final yg.m f23425c;

    /* renamed from: d */
    public boolean f23426d;

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.ShellRepositoryImpl$flowShell$$inlined$flatMapLatest$1", f = "ShellRepository.kt", l = {190}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends zl.i implements fm.q<sm.g<? super String>, pg.e, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f23427e;

        /* renamed from: f */
        public /* synthetic */ sm.g f23428f;

        /* renamed from: g */
        public /* synthetic */ Object f23429g;

        /* renamed from: h */
        public final /* synthetic */ o1 f23430h;

        /* renamed from: i */
        public final /* synthetic */ nj.c f23431i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d dVar, o1 o1Var, nj.c cVar) {
            super(3, dVar);
            this.f23430h = o1Var;
            this.f23431i = cVar;
        }

        @Override // fm.q
        public final Object j(sm.g<? super String> gVar, pg.e eVar, xl.d<? super tl.l> dVar) {
            a aVar = new a(dVar, this.f23430h, this.f23431i);
            aVar.f23428f = gVar;
            aVar.f23429g = eVar;
            return aVar.t(tl.l.f28297a);
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x0069 A[RETURN] */
        @Override // zl.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object t(java.lang.Object r10) {
            /*
                r9 = this;
                yl.a r0 = yl.a.COROUTINE_SUSPENDED
                int r1 = r9.f23427e
                r2 = 1
                if (r1 == 0) goto L15
                if (r1 != r2) goto Ld
                mf.a0.k(r10)
                goto L6a
            Ld:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L15:
                mf.a0.k(r10)
                sm.g r10 = r9.f23428f
                java.lang.Object r1 = r9.f23429g
                pg.e r1 = (pg.e) r1
                do.a$b r3 = p000do.a.f13275a
                java.lang.String r4 = "ShellRepository"
                r3.t(r4)
                java.lang.Object[] r4 = new java.lang.Object[r2]
                r5 = 0
                r4[r5] = r1
                java.lang.String r6 = "Device shell emit:%s"
                r3.h(r6, r4)
                if (r1 == 0) goto L51
                long r3 = java.lang.System.currentTimeMillis()
                long r6 = r1.f24034b
                long r3 = r3 - r6
                r6 = 0
                int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r8 > 0) goto L46
                r6 = 1296000001(0x4d3f6401, double:6.403090775E-315)
                int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r8 >= 0) goto L46
                r5 = 1
            L46:
                if (r5 != 0) goto L49
                goto L51
            L49:
                java.lang.String r1 = r1.f24035c
                sm.i r3 = new sm.i
                r3.<init>(r1)
                goto L61
            L51:
                og.o1$b r3 = new og.o1$b
                og.o1 r4 = r9.f23430h
                nj.c r5 = r9.f23431i
                r6 = 0
                r3.<init>(r1, r4, r5, r6)
                sm.u0 r1 = new sm.u0
                r1.<init>(r3)
                r3 = r1
            L61:
                r9.f23427e = r2
                java.lang.Object r10 = bi.r.v(r9, r3, r10)
                if (r10 != r0) goto L6a
                return r0
            L6a:
                tl.l r10 = tl.l.f28297a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: og.o1.a.t(java.lang.Object):java.lang.Object");
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.ShellRepositoryImpl$flowShell$1$1", f = "ShellRepository.kt", l = {53, 55, 58, 60}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends zl.i implements fm.p<sm.g<? super String>, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public Object f23432e;

        /* renamed from: f */
        public sm.g f23433f;

        /* renamed from: g */
        public int f23434g;

        /* renamed from: h */
        public /* synthetic */ Object f23435h;

        /* renamed from: i */
        public final /* synthetic */ pg.e f23436i;

        /* renamed from: j */
        public final /* synthetic */ o1 f23437j;

        /* renamed from: k */
        public final /* synthetic */ nj.c f23438k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(pg.e eVar, o1 o1Var, nj.c cVar, xl.d<? super b> dVar) {
            super(2, dVar);
            this.f23436i = eVar;
            this.f23437j = o1Var;
            this.f23438k = cVar;
        }

        @Override // fm.p
        public final Object A(sm.g<? super String> gVar, xl.d<? super tl.l> dVar) {
            return ((b) p(gVar, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            b bVar = new b(this.f23436i, this.f23437j, this.f23438k, dVar);
            bVar.f23435h = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:80:0x00b4 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:81:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x00b9 A[Catch: all -> 0x00c9, TryCatch #0 {all -> 0x00c9, blocks: (B:55:0x0013, B:86:0x00c6, B:60:0x0028, B:83:0x00b9, B:63:0x0037, B:78:0x007a, B:74:0x0062), top: B:92:0x0009 }] */
        @Override // zl.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object t(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 213
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: og.o1.b.t(java.lang.Object):java.lang.Object");
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.ShellRepositoryImpl", f = "ShellRepository.kt", l = {99, 101}, m = "refreshShellSpecify")
    /* loaded from: classes2.dex */
    public static final class c extends zl.c {

        /* renamed from: d */
        public o1 f23439d;

        /* renamed from: e */
        public Object f23440e;

        /* renamed from: f */
        public /* synthetic */ Object f23441f;

        /* renamed from: h */
        public int f23443h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(dVar);
            o1.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f23441f = obj;
            this.f23443h |= Integer.MIN_VALUE;
            return o1.this.d(null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.ShellRepositoryImpl", f = "ShellRepository.kt", l = {76, 78, 81, 86, 95}, m = "requestShellSpecify")
    /* loaded from: classes2.dex */
    public static final class d extends zl.c {

        /* renamed from: d */
        public o1 f23444d;

        /* renamed from: e */
        public String f23445e;

        /* renamed from: f */
        public List f23446f;

        /* renamed from: g */
        public /* synthetic */ Object f23447g;

        /* renamed from: i */
        public int f23449i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(dVar);
            o1.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f23447g = obj;
            this.f23449i |= Integer.MIN_VALUE;
            return o1.this.b(null, false, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.ShellRepositoryImpl", f = "ShellRepository.kt", l = {39}, m = "resetShell")
    /* loaded from: classes2.dex */
    public static final class e extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f23450d;

        /* renamed from: f */
        public int f23452f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(xl.d<? super e> dVar) {
            super(dVar);
            o1.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f23450d = obj;
            this.f23452f |= Integer.MIN_VALUE;
            return o1.this.c(null, this);
        }
    }

    public o1(AppDatabase appDatabase, vg.d dVar, yg.m mVar) {
        gm.l.f(appDatabase, "appDatabase");
        gm.l.f(mVar, "publicStorage");
        this.f23423a = appDatabase;
        this.f23424b = dVar;
        this.f23425c = mVar;
    }

    @Override // og.n1
    public final sm.f<String> a(nj.c cVar) {
        gm.l.f(cVar, "deviceInfo");
        if (cVar.e()) {
            return new sm.i(null);
        }
        return bi.r.O(this.f23423a.u().a(cVar.f()), new a(null, this, cVar));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:(1:(1:(1:(2:14|15)(2:17|18))(3:19|20|21))(7:22|23|24|(1:29)|32|(2:34|(1:36)(1:21))|37))(3:41|42|(3:44|45|(1:47)(6:48|24|(2:26|29)|32|(0)|37))))(2:53|54))(2:55|(2:61|(1:63)(3:64|42|(0)))(2:58|(1:60)(1:54)))|38|(1:40)(1:15)))|66|6|7|(0)(0)|38|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x00a7, code lost:
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x00be, code lost:
        r10 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00ac A[Catch: Exception -> 0x00be, TRY_LEAVE, TryCatch #1 {Exception -> 0x00be, blocks: (B:89:0x0043, B:92:0x004c, B:113:0x0098, B:115:0x009d, B:121:0x00a8, B:123:0x00ac), top: B:139:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00e4 A[PHI: r12 
      PHI: (r12v5 java.lang.Object) = (r12v4 java.lang.Object), (r12v1 java.lang.Object) binds: [B:134:0x00e1, B:85:0x0030] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x005c  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3 */
    @Override // og.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r10, boolean r11, xl.d<? super java.util.List<com.topstep.fitcloud.pro.model.device.DeviceShellSpecify>> r12) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: og.o1.b(java.lang.String, boolean, xl.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x004c, code lost:
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x004d, code lost:
        p000do.a.f13275a.q(r9);
        mf.a0.f(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x002f  */
    @Override // og.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r9, xl.d<? super tl.l> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof og.o1.e
            if (r0 == 0) goto L13
            r0 = r10
            og.o1$e r0 = (og.o1.e) r0
            int r1 = r0.f23452f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23452f = r1
            goto L18
        L13:
            og.o1$e r0 = new og.o1$e
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f23450d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f23452f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            mf.a0.k(r10)     // Catch: java.lang.Throwable -> L4c
            goto L49
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2f:
            mf.a0.k(r10)
            long r4 = java.lang.System.currentTimeMillis()
            r6 = 259200000(0xf731400, double:1.280618154E-315)
            long r4 = r4 - r6
            com.topstep.fitcloud.pro.shared.data.db.AppDatabase r10 = r8.f23423a     // Catch: java.lang.Throwable -> L4c
            mg.b1 r10 = r10.u()     // Catch: java.lang.Throwable -> L4c
            r0.f23452f = r3     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r9 = r10.c(r4, r9, r0)     // Catch: java.lang.Throwable -> L4c
            if (r9 != r1) goto L49
            return r1
        L49:
            tl.l r9 = tl.l.f28297a     // Catch: java.lang.Throwable -> L4c
            goto L55
        L4c:
            r9 = move-exception
            do.a$b r10 = p000do.a.f13275a
            r10.q(r9)
            mf.a0.f(r9)
        L55:
            tl.l r9 = tl.l.f28297a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: og.o1.c(java.lang.String, xl.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(7:5|6|(1:(1:(5:10|11|12|13|14)(2:19|20))(1:21))(2:31|(1:33)(1:34))|22|23|24|(1:26)(3:27|13|14)))|35|6|(0)(0)|22|23|24|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0071, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0072, code lost:
        r9 = r8;
        r8 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.String r8, xl.d<? super java.util.List<com.topstep.fitcloud.pro.model.device.DeviceShellSpecify>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof og.o1.c
            if (r0 == 0) goto L13
            r0 = r9
            og.o1$c r0 = (og.o1.c) r0
            int r1 = r0.f23443h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23443h = r1
            goto L18
        L13:
            og.o1$c r0 = new og.o1$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f23441f
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f23443h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r8 = r0.f23440e
            java.util.List r8 = (java.util.List) r8
            og.o1 r0 = r0.f23439d
            mf.a0.k(r9)     // Catch: java.lang.Exception -> L30
            goto L6e
        L30:
            r9 = move-exception
            goto L75
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            java.lang.Object r8 = r0.f23440e
            java.lang.String r8 = (java.lang.String) r8
            og.o1 r2 = r0.f23439d
            mf.a0.k(r9)
            goto L57
        L44:
            mf.a0.k(r9)
            vg.d r9 = r7.f23424b
            r0.f23439d = r7
            r0.f23440e = r8
            r0.f23443h = r4
            java.lang.Object r9 = r9.a0(r8, r0)
            if (r9 != r1) goto L56
            return r1
        L56:
            r2 = r7
        L57:
            vg.i r9 = (vg.i) r9
            java.util.List r9 = r9.a()
            yg.m r5 = r2.f23425c     // Catch: java.lang.Exception -> L71
            r0.f23439d = r2     // Catch: java.lang.Exception -> L71
            r0.f23440e = r9     // Catch: java.lang.Exception -> L71
            r0.f23443h = r3     // Catch: java.lang.Exception -> L71
            tl.l r8 = r5.q(r8, r9)     // Catch: java.lang.Exception -> L71
            if (r8 != r1) goto L6c
            return r1
        L6c:
            r8 = r9
            r0 = r2
        L6e:
            r0.f23426d = r4     // Catch: java.lang.Exception -> L30
            goto L84
        L71:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L75:
            do.a$b r0 = p000do.a.f13275a
            java.lang.String r1 = "ShellRepository"
            r0.t(r1)
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "set shell specify fail"
            r0.r(r9, r2, r1)
        L84:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: og.o1.d(java.lang.String, xl.d):java.lang.Object");
    }
}
