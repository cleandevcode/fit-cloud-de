package og;

/* loaded from: classes2.dex */
public final class x0 {

    /* loaded from: classes2.dex */
    public static final class a implements sm.f<Boolean> {

        /* renamed from: a */
        public final /* synthetic */ sm.f f23520a;

        /* renamed from: og.x0$a$a */
        /* loaded from: classes2.dex */
        public static final class C0419a<T> implements sm.g {

            /* renamed from: a */
            public final /* synthetic */ sm.g f23521a;

            @zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DeviceManagerKt$flowStateConnected$$inlined$map$1$2", f = "DeviceManager.kt", l = {223}, m = "emit")
            /* renamed from: og.x0$a$a$a */
            /* loaded from: classes2.dex */
            public static final class C0420a extends zl.c {

                /* renamed from: d */
                public /* synthetic */ Object f23522d;

                /* renamed from: e */
                public int f23523e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0420a(xl.d dVar) {
                    super(dVar);
                    C0419a.this = r1;
                }

                @Override // zl.a
                public final Object t(Object obj) {
                    this.f23522d = obj;
                    this.f23523e |= Integer.MIN_VALUE;
                    return C0419a.this.n(null, this);
                }
            }

            public C0419a(sm.g gVar) {
                this.f23521a = gVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:33:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x002f  */
            @Override // sm.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object n(java.lang.Object r5, xl.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof og.x0.a.C0419a.C0420a
                    if (r0 == 0) goto L13
                    r0 = r6
                    og.x0$a$a$a r0 = (og.x0.a.C0419a.C0420a) r0
                    int r1 = r0.f23523e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f23523e = r1
                    goto L18
                L13:
                    og.x0$a$a$a r0 = new og.x0$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f23522d
                    yl.a r1 = yl.a.COROUTINE_SUSPENDED
                    int r2 = r0.f23523e
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    mf.a0.k(r6)
                    goto L4a
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L2f:
                    mf.a0.k(r6)
                    sm.g r6 = r4.f23521a
                    wf.b r5 = (wf.b) r5
                    wf.b r2 = wf.b.CONNECTED
                    if (r5 != r2) goto L3c
                    r5 = 1
                    goto L3d
                L3c:
                    r5 = 0
                L3d:
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                    r0.f23523e = r3
                    java.lang.Object r5 = r6.n(r5, r0)
                    if (r5 != r1) goto L4a
                    return r1
                L4a:
                    tl.l r5 = tl.l.f28297a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: og.x0.a.C0419a.n(java.lang.Object, xl.d):java.lang.Object");
            }
        }

        public a(sm.f1 f1Var) {
            this.f23520a = f1Var;
        }

        @Override // sm.f
        public final Object a(sm.g<? super Boolean> gVar, xl.d dVar) {
            Object a10 = this.f23520a.a(new C0419a(gVar), dVar);
            return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements wk.e {

        /* renamed from: a */
        public final /* synthetic */ fm.l f23525a;

        public b(fm.l lVar) {
            this.f23525a = lVar;
        }

        @Override // wk.e
        public final /* synthetic */ Object apply(Object obj) {
            return this.f23525a.k(obj);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements wk.f {

        /* renamed from: a */
        public final /* synthetic */ fm.l f23526a = m0.f23405b;

        @Override // wk.f
        public final /* synthetic */ boolean test(Object obj) {
            return ((Boolean) this.f23526a.k(obj)).booleanValue();
        }
    }

    public static final sm.f<Boolean> a(t tVar) {
        gm.l.f(tVar, "<this>");
        return bi.r.t(new a(tVar.J()));
    }

    public static final boolean b(t tVar) {
        gm.l.f(tVar, "<this>");
        return tVar.J().getValue() == wf.b.CONNECTED;
    }
}
