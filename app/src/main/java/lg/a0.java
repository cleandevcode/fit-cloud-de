package lg;

import java.util.List;

/* loaded from: classes2.dex */
public final class a0 implements sm.f<List<? extends vf.p>> {

    /* renamed from: a */
    public final /* synthetic */ sm.f f19467a;

    /* loaded from: classes2.dex */
    public static final class a<T> implements sm.g {

        /* renamed from: a */
        public final /* synthetic */ sm.g f19468a;

        @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl$flowStepRecords$lambda$4$$inlined$map$1$2", f = "DataRepository.kt", l = {223}, m = "emit")
        /* renamed from: lg.a0$a$a */
        /* loaded from: classes2.dex */
        public static final class C0351a extends zl.c {

            /* renamed from: d */
            public /* synthetic */ Object f19469d;

            /* renamed from: e */
            public int f19470e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0351a(xl.d dVar) {
                super(dVar);
                a.this = r1;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f19469d = obj;
                this.f19470e |= Integer.MIN_VALUE;
                return a.this.n(null, this);
            }
        }

        public a(sm.g gVar) {
            this.f19468a = gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x002f  */
        @Override // sm.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object n(java.lang.Object r13, xl.d r14) {
            /*
                r12 = this;
                boolean r0 = r14 instanceof lg.a0.a.C0351a
                if (r0 == 0) goto L13
                r0 = r14
                lg.a0$a$a r0 = (lg.a0.a.C0351a) r0
                int r1 = r0.f19470e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f19470e = r1
                goto L18
            L13:
                lg.a0$a$a r0 = new lg.a0$a$a
                r0.<init>(r14)
            L18:
                java.lang.Object r14 = r0.f19469d
                yl.a r1 = yl.a.COROUTINE_SUSPENDED
                int r2 = r0.f19470e
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                mf.a0.k(r14)
                goto L71
            L27:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r14)
                throw r13
            L2f:
                mf.a0.k(r14)
                sm.g r14 = r12.f19468a
                java.util.List r13 = (java.util.List) r13
                if (r13 == 0) goto L67
                java.util.ArrayList r2 = new java.util.ArrayList
                r4 = 10
                int r4 = ul.l.B(r13, r4)
                r2.<init>(r4)
                java.util.Iterator r13 = r13.iterator()
            L47:
                boolean r4 = r13.hasNext()
                if (r4 == 0) goto L68
                java.lang.Object r4 = r13.next()
                com.topstep.fitcloud.pro.shared.data.entity.data.StepRecordEntity r4 = (com.topstep.fitcloud.pro.shared.data.entity.data.StepRecordEntity) r4
                vf.p r11 = new vf.p
                java.util.Date r6 = r4.f25622b
                int r7 = r4.f10096e
                float r8 = r4.f10097f
                float r9 = r4.f10098g
                r10 = 16
                r5 = r11
                r5.<init>(r6, r7, r8, r9, r10)
                r2.add(r11)
                goto L47
            L67:
                r2 = 0
            L68:
                r0.f19470e = r3
                java.lang.Object r13 = r14.n(r2, r0)
                if (r13 != r1) goto L71
                return r1
            L71:
                tl.l r13 = tl.l.f28297a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: lg.a0.a.n(java.lang.Object, xl.d):java.lang.Object");
        }
    }

    public a0(sm.f fVar) {
        this.f19467a = fVar;
    }

    @Override // sm.f
    public final Object a(sm.g<? super List<? extends vf.p>> gVar, xl.d dVar) {
        Object a10 = this.f19467a.a(new a(gVar), dVar);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
    }
}
