package l2;

@zl.e(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1", f = "PageFetcherSnapshot.kt", l = {608, 163, 619}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class o1 extends zl.i implements fm.p<z2<b1<Object>>, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public Object f19134e;

    /* renamed from: f */
    public Object f19135f;

    /* renamed from: g */
    public ym.c f19136g;

    /* renamed from: h */
    public int f19137h;

    /* renamed from: i */
    public /* synthetic */ Object f19138i;

    /* renamed from: j */
    public final /* synthetic */ i1<Object, Object> f19139j;

    @zl.e(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2", f = "PageFetcherSnapshot.kt", l = {602}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f19140e;

        /* renamed from: f */
        public final /* synthetic */ i1<Object, Object> f19141f;

        /* renamed from: g */
        public final /* synthetic */ z2<b1<Object>> f19142g;

        /* renamed from: l2.o1$a$a */
        /* loaded from: classes.dex */
        public static final class C0340a implements sm.g<b1<Object>> {

            /* renamed from: a */
            public final /* synthetic */ z2 f19143a;

            @zl.e(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$invokeSuspend$$inlined$collect$1", f = "PageFetcherSnapshot.kt", l = {136}, m = "emit")
            /* renamed from: l2.o1$a$a$a */
            /* loaded from: classes.dex */
            public static final class C0341a extends zl.c {

                /* renamed from: d */
                public /* synthetic */ Object f19144d;

                /* renamed from: e */
                public int f19145e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0341a(xl.d dVar) {
                    super(dVar);
                    C0340a.this = r1;
                }

                @Override // zl.a
                public final Object t(Object obj) {
                    this.f19144d = obj;
                    this.f19145e |= Integer.MIN_VALUE;
                    return C0340a.this.n(null, this);
                }
            }

            public C0340a(z2 z2Var) {
                this.f19143a = z2Var;
            }

            /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
            /* JADX WARN: Removed duplicated region for block: B:35:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x002f  */
            @Override // sm.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object n(l2.b1<java.lang.Object> r5, xl.d<? super tl.l> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof l2.o1.a.C0340a.C0341a
                    if (r0 == 0) goto L13
                    r0 = r6
                    l2.o1$a$a$a r0 = (l2.o1.a.C0340a.C0341a) r0
                    int r1 = r0.f19145e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f19145e = r1
                    goto L18
                L13:
                    l2.o1$a$a$a r0 = new l2.o1$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f19144d
                    yl.a r1 = yl.a.COROUTINE_SUSPENDED
                    int r2 = r0.f19145e
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    mf.a0.k(r6)     // Catch: rm.o -> L3f
                    goto L3f
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L2f:
                    mf.a0.k(r6)
                    l2.b1 r5 = (l2.b1) r5
                    l2.z2 r6 = r4.f19143a     // Catch: rm.o -> L3f
                    r0.f19145e = r3     // Catch: rm.o -> L3f
                    java.lang.Object r5 = r6.d(r5, r0)     // Catch: rm.o -> L3f
                    if (r5 != r1) goto L3f
                    return r1
                L3f:
                    tl.l r5 = tl.l.f28297a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: l2.o1.a.C0340a.n(java.lang.Object, xl.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i1<Object, Object> i1Var, z2<b1<Object>> z2Var, xl.d<? super a> dVar) {
            super(2, dVar);
            this.f19141f = i1Var;
            this.f19142g = z2Var;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new a(this.f19141f, this.f19142g, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f19140e;
            if (i10 != 0) {
                if (i10 == 1) {
                    mf.a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                mf.a0.k(obj);
                sm.c r10 = bi.r.r(this.f19141f.f18984k);
                C0340a c0340a = new C0340a(this.f19142g);
                this.f19140e = 1;
                if (r10.a(c0340a, this) == aVar) {
                    return aVar;
                }
            }
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3", f = "PageFetcherSnapshot.kt", l = {602}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f19147e;

        /* renamed from: f */
        public final /* synthetic */ i1<Object, Object> f19148f;

        /* renamed from: g */
        public final /* synthetic */ rm.g<tl.l> f19149g;

        /* loaded from: classes.dex */
        public static final class a implements sm.g<tl.l> {

            /* renamed from: a */
            public final /* synthetic */ rm.g f19150a;

            public a(rm.g gVar) {
                this.f19150a = gVar;
            }

            @Override // sm.g
            public final Object n(tl.l lVar, xl.d<? super tl.l> dVar) {
                Object p10 = this.f19150a.p(lVar);
                return p10 == yl.a.COROUTINE_SUSPENDED ? p10 : tl.l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i1 i1Var, xl.d dVar, rm.g gVar) {
            super(2, dVar);
            this.f19148f = i1Var;
            this.f19149g = gVar;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new b(this.f19148f, dVar, this.f19149g);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f19147e;
            if (i10 != 0) {
                if (i10 == 1) {
                    mf.a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                mf.a0.k(obj);
                sm.f<tl.l> fVar = this.f19148f.f18977d;
                a aVar2 = new a(this.f19149g);
                this.f19147e = 1;
                if (fVar.a(aVar2, this) == aVar) {
                    return aVar;
                }
            }
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4", f = "PageFetcherSnapshot.kt", l = {602}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f19151e;

        /* renamed from: f */
        public /* synthetic */ Object f19152f;

        /* renamed from: g */
        public final /* synthetic */ rm.g<tl.l> f19153g;

        /* renamed from: h */
        public final /* synthetic */ i1<Object, Object> f19154h;

        /* loaded from: classes.dex */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f19155a;

            static {
                int[] iArr = new int[r0.values().length];
                iArr[0] = 1;
                f19155a = iArr;
            }
        }

        /* loaded from: classes.dex */
        public static final class b implements sm.g<tl.l> {

            /* renamed from: a */
            public final /* synthetic */ i1 f19156a;

            /* renamed from: b */
            public final /* synthetic */ pm.e0 f19157b;

            @zl.e(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1", f = "PageFetcherSnapshot.kt", l = {142, 164, 157, 181, 169, 195, 213, 157, 224, 169, 235, 247, 157, 258, 169, 269}, m = "emit")
            /* loaded from: classes.dex */
            public static final class a extends zl.c {

                /* renamed from: d */
                public /* synthetic */ Object f19158d;

                /* renamed from: e */
                public int f19159e;

                /* renamed from: g */
                public b f19161g;

                /* renamed from: h */
                public Object f19162h;

                /* renamed from: i */
                public Object f19163i;

                /* renamed from: j */
                public Object f19164j;

                /* renamed from: k */
                public Object f19165k;

                /* renamed from: l */
                public Object f19166l;

                /* renamed from: m */
                public i1 f19167m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(xl.d dVar) {
                    super(dVar);
                    b.this = r1;
                }

                @Override // zl.a
                public final Object t(Object obj) {
                    this.f19158d = obj;
                    this.f19159e |= Integer.MIN_VALUE;
                    return b.this.n(null, this);
                }
            }

            public b(i1 i1Var, pm.e0 e0Var) {
                this.f19156a = i1Var;
                this.f19157b = e0Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:202:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:204:0x002d  */
            /* JADX WARN: Removed duplicated region for block: B:205:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:206:0x0047  */
            /* JADX WARN: Removed duplicated region for block: B:207:0x0062  */
            /* JADX WARN: Removed duplicated region for block: B:210:0x0072  */
            /* JADX WARN: Removed duplicated region for block: B:211:0x0085  */
            /* JADX WARN: Removed duplicated region for block: B:212:0x0098  */
            /* JADX WARN: Removed duplicated region for block: B:213:0x00a9  */
            /* JADX WARN: Removed duplicated region for block: B:214:0x00c6  */
            /* JADX WARN: Removed duplicated region for block: B:217:0x00db  */
            /* JADX WARN: Removed duplicated region for block: B:218:0x00f2  */
            /* JADX WARN: Removed duplicated region for block: B:219:0x0105  */
            /* JADX WARN: Removed duplicated region for block: B:220:0x0116  */
            /* JADX WARN: Removed duplicated region for block: B:221:0x0133  */
            /* JADX WARN: Removed duplicated region for block: B:224:0x0145  */
            /* JADX WARN: Removed duplicated region for block: B:234:0x0182  */
            /* JADX WARN: Removed duplicated region for block: B:235:0x0190  */
            /* JADX WARN: Removed duplicated region for block: B:243:0x01c9  */
            /* JADX WARN: Removed duplicated region for block: B:246:0x01d4  */
            /* JADX WARN: Removed duplicated region for block: B:247:0x01d8  */
            /* JADX WARN: Removed duplicated region for block: B:250:0x01e7  */
            /* JADX WARN: Removed duplicated region for block: B:251:0x01ec  */
            /* JADX WARN: Removed duplicated region for block: B:259:0x0233 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:260:0x0234  */
            /* JADX WARN: Removed duplicated region for block: B:262:0x0238  */
            /* JADX WARN: Removed duplicated region for block: B:268:0x025f  */
            /* JADX WARN: Removed duplicated region for block: B:276:0x0278  */
            /* JADX WARN: Removed duplicated region for block: B:281:0x02aa A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:282:0x02ab  */
            /* JADX WARN: Removed duplicated region for block: B:286:0x02bf  */
            /* JADX WARN: Removed duplicated region for block: B:287:0x02c4  */
            /* JADX WARN: Removed duplicated region for block: B:295:0x030d A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:296:0x030e  */
            /* JADX WARN: Removed duplicated region for block: B:298:0x0312  */
            /* JADX WARN: Removed duplicated region for block: B:304:0x033a  */
            /* JADX WARN: Removed duplicated region for block: B:312:0x0353  */
            /* JADX WARN: Removed duplicated region for block: B:318:0x0383 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:319:0x0384  */
            /* JADX WARN: Removed duplicated region for block: B:323:0x0397  */
            /* JADX WARN: Removed duplicated region for block: B:324:0x039c  */
            /* JADX WARN: Removed duplicated region for block: B:332:0x03e1 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:333:0x03e2  */
            /* JADX WARN: Removed duplicated region for block: B:335:0x03e5  */
            /* JADX WARN: Removed duplicated region for block: B:342:0x040e  */
            /* JADX WARN: Type inference failed for: r12v0, types: [tl.l] */
            /* JADX WARN: Type inference failed for: r12v1, types: [ym.b] */
            /* JADX WARN: Type inference failed for: r12v100 */
            /* JADX WARN: Type inference failed for: r12v103 */
            /* JADX WARN: Type inference failed for: r12v104 */
            /* JADX WARN: Type inference failed for: r12v19, types: [ym.b] */
            /* JADX WARN: Type inference failed for: r12v2, types: [ym.b] */
            /* JADX WARN: Type inference failed for: r12v3, types: [ym.b] */
            /* JADX WARN: Type inference failed for: r12v44, types: [ym.b] */
            /* JADX WARN: Type inference failed for: r12v71, types: [ym.b] */
            /* JADX WARN: Type inference failed for: r12v95 */
            /* JADX WARN: Type inference failed for: r12v96 */
            /* JADX WARN: Type inference failed for: r12v99 */
            @Override // sm.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object n(tl.l r12, xl.d<? super tl.l> r13) {
                /*
                    Method dump skipped, instructions count: 1122
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: l2.o1.c.b.n(java.lang.Object, xl.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(i1 i1Var, xl.d dVar, rm.g gVar) {
            super(2, dVar);
            this.f19153g = gVar;
            this.f19154h = i1Var;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((c) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            c cVar = new c(this.f19154h, dVar, this.f19153g);
            cVar.f19152f = obj;
            return cVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f19151e;
            if (i10 == 0) {
                mf.a0.k(obj);
                sm.c r10 = bi.r.r(this.f19153g);
                b bVar = new b(this.f19154h, (pm.e0) this.f19152f);
                this.f19151e = 1;
                if (r10.a(bVar, this) == aVar) {
                    return aVar;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                mf.a0.k(obj);
            }
            return tl.l.f28297a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(i1<Object, Object> i1Var, xl.d<? super o1> dVar) {
        super(2, dVar);
        this.f19139j = i1Var;
    }

    @Override // fm.p
    public final Object A(z2<b1<Object>> z2Var, xl.d<? super tl.l> dVar) {
        return ((o1) p(z2Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        o1 o1Var = new o1(this.f19139j, dVar);
        o1Var.f19138i = obj;
        return o1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00ef  */
    @Override // zl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.o1.t(java.lang.Object):java.lang.Object");
    }
}
