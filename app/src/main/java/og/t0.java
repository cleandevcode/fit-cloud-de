package og;

/* loaded from: classes2.dex */
public final class t0 implements sm.f<wf.b> {

    /* renamed from: a */
    public final /* synthetic */ sm.f f23489a;

    /* loaded from: classes2.dex */
    public static final class a<T> implements sm.g {

        /* renamed from: a */
        public final /* synthetic */ sm.g f23490a;

        @zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DeviceManagerImpl$special$$inlined$filter$1$2", f = "DeviceManager.kt", l = {223}, m = "emit")
        /* renamed from: og.t0$a$a */
        /* loaded from: classes2.dex */
        public static final class C0417a extends zl.c {

            /* renamed from: d */
            public /* synthetic */ Object f23491d;

            /* renamed from: e */
            public int f23492e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0417a(xl.d dVar) {
                super(dVar);
                a.this = r1;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f23491d = obj;
                this.f23492e |= Integer.MIN_VALUE;
                return a.this.n(null, this);
            }
        }

        public a(sm.g gVar) {
            this.f23490a = gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x002f  */
        @Override // sm.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object n(java.lang.Object r6, xl.d r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof og.t0.a.C0417a
                if (r0 == 0) goto L13
                r0 = r7
                og.t0$a$a r0 = (og.t0.a.C0417a) r0
                int r1 = r0.f23492e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f23492e = r1
                goto L18
            L13:
                og.t0$a$a r0 = new og.t0$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f23491d
                yl.a r1 = yl.a.COROUTINE_SUSPENDED
                int r2 = r0.f23492e
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                mf.a0.k(r7)
                goto L49
            L27:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L2f:
                mf.a0.k(r7)
                sm.g r7 = r5.f23490a
                r2 = r6
                wf.b r2 = (wf.b) r2
                wf.b r4 = wf.b.CONNECTED
                if (r2 != r4) goto L3d
                r2 = 1
                goto L3e
            L3d:
                r2 = 0
            L3e:
                if (r2 == 0) goto L49
                r0.f23492e = r3
                java.lang.Object r6 = r7.n(r6, r0)
                if (r6 != r1) goto L49
                return r1
            L49:
                tl.l r6 = tl.l.f28297a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: og.t0.a.n(java.lang.Object, xl.d):java.lang.Object");
        }
    }

    public t0(sm.t0 t0Var) {
        this.f23489a = t0Var;
    }

    @Override // sm.f
    public final Object a(sm.g<? super wf.b> gVar, xl.d dVar) {
        Object a10 = this.f23489a.a(new a(gVar), dVar);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
    }
}
