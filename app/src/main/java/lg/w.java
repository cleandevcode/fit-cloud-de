package lg;

import java.util.List;

/* loaded from: classes2.dex */
public final class w implements sm.f<List<? extends vf.n>> {

    /* renamed from: a */
    public final /* synthetic */ sm.f f19977a;

    /* loaded from: classes2.dex */
    public static final class a<T> implements sm.g {

        /* renamed from: a */
        public final /* synthetic */ sm.g f19978a;

        @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl$flowSleepRecords$lambda$10$$inlined$map$1$2", f = "DataRepository.kt", l = {223}, m = "emit")
        /* renamed from: lg.w$a$a */
        /* loaded from: classes2.dex */
        public static final class C0361a extends zl.c {

            /* renamed from: d */
            public /* synthetic */ Object f19979d;

            /* renamed from: e */
            public int f19980e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0361a(xl.d dVar) {
                super(dVar);
                a.this = r1;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f19979d = obj;
                this.f19980e |= Integer.MIN_VALUE;
                return a.this.n(null, this);
            }
        }

        public a(sm.g gVar) {
            this.f19978a = gVar;
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
                boolean r0 = r14 instanceof lg.w.a.C0361a
                if (r0 == 0) goto L13
                r0 = r14
                lg.w$a$a r0 = (lg.w.a.C0361a) r0
                int r1 = r0.f19980e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f19980e = r1
                goto L18
            L13:
                lg.w$a$a r0 = new lg.w$a$a
                r0.<init>(r14)
            L18:
                java.lang.Object r14 = r0.f19979d
                yl.a r1 = yl.a.COROUTINE_SUSPENDED
                int r2 = r0.f19980e
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
                sm.g r14 = r12.f19978a
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
                rg.p r4 = (rg.p) r4
                vf.n r11 = new vf.n
                java.util.Date r6 = r4.f25640b
                int r7 = r4.f25641c
                int r8 = r4.f25642d
                int r9 = r4.f25643e
                r10 = 16
                r5 = r11
                r5.<init>(r6, r7, r8, r9, r10)
                r2.add(r11)
                goto L47
            L67:
                r2 = 0
            L68:
                r0.f19980e = r3
                java.lang.Object r13 = r14.n(r2, r0)
                if (r13 != r1) goto L71
                return r1
            L71:
                tl.l r13 = tl.l.f28297a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: lg.w.a.n(java.lang.Object, xl.d):java.lang.Object");
        }
    }

    public w(sm.f fVar) {
        this.f19977a = fVar;
    }

    @Override // sm.f
    public final Object a(sm.g<? super List<? extends vf.n>> gVar, xl.d dVar) {
        Object a10 = this.f19977a.a(new a(gVar), dVar);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
    }
}
