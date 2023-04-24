package lg;

import java.util.Date;

/* loaded from: classes2.dex */
public final class y implements sm.f<vf.p> {

    /* renamed from: a */
    public final /* synthetic */ sm.f f19987a;

    /* renamed from: b */
    public final /* synthetic */ Date f19988b;

    /* loaded from: classes2.dex */
    public static final class a<T> implements sm.g {

        /* renamed from: a */
        public final /* synthetic */ sm.g f19989a;

        /* renamed from: b */
        public final /* synthetic */ Date f19990b;

        @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl$flowStepRecord$$inlined$map$1$2", f = "DataRepository.kt", l = {223}, m = "emit")
        /* renamed from: lg.y$a$a */
        /* loaded from: classes2.dex */
        public static final class C0362a extends zl.c {

            /* renamed from: d */
            public /* synthetic */ Object f19991d;

            /* renamed from: e */
            public int f19992e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0362a(xl.d dVar) {
                super(dVar);
                a.this = r1;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f19991d = obj;
                this.f19992e |= Integer.MIN_VALUE;
                return a.this.n(null, this);
            }
        }

        public a(sm.g gVar, Date date) {
            this.f19989a = gVar;
            this.f19990b = date;
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x002f  */
        @Override // sm.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object n(java.lang.Object r11, xl.d r12) {
            /*
                r10 = this;
                boolean r0 = r12 instanceof lg.y.a.C0362a
                if (r0 == 0) goto L13
                r0 = r12
                lg.y$a$a r0 = (lg.y.a.C0362a) r0
                int r1 = r0.f19992e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f19992e = r1
                goto L18
            L13:
                lg.y$a$a r0 = new lg.y$a$a
                r0.<init>(r12)
            L18:
                java.lang.Object r12 = r0.f19991d
                yl.a r1 = yl.a.COROUTINE_SUSPENDED
                int r2 = r0.f19992e
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                mf.a0.k(r12)
                goto L64
            L27:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L2f:
                mf.a0.k(r12)
                sm.g r12 = r10.f19989a
                com.topstep.fitcloud.pro.shared.data.entity.data.StepRecordEntity r11 = (com.topstep.fitcloud.pro.shared.data.entity.data.StepRecordEntity) r11
                java.util.Date r5 = r10.f19990b
                java.lang.String r2 = "date"
                gm.l.f(r5, r2)
                vf.p r2 = new vf.p
                if (r11 == 0) goto L45
                int r4 = r11.f10096e
                r6 = r4
                goto L47
            L45:
                r4 = 0
                r6 = 0
            L47:
                r4 = 0
                if (r11 == 0) goto L4d
                float r7 = r11.f10097f
                goto L4e
            L4d:
                r7 = 0
            L4e:
                if (r11 == 0) goto L54
                float r11 = r11.f10098g
                r8 = r11
                goto L55
            L54:
                r8 = 0
            L55:
                r9 = 16
                r4 = r2
                r4.<init>(r5, r6, r7, r8, r9)
                r0.f19992e = r3
                java.lang.Object r11 = r12.n(r2, r0)
                if (r11 != r1) goto L64
                return r1
            L64:
                tl.l r11 = tl.l.f28297a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: lg.y.a.n(java.lang.Object, xl.d):java.lang.Object");
        }
    }

    public y(tm.j jVar, Date date) {
        this.f19987a = jVar;
        this.f19988b = date;
    }

    @Override // sm.f
    public final Object a(sm.g<? super vf.p> gVar, xl.d dVar) {
        Object a10 = this.f19987a.a(new a(gVar, this.f19988b), dVar);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
    }
}
