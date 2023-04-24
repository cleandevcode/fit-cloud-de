package lg;

import java.util.List;

/* loaded from: classes2.dex */
public final class p implements sm.f<List<? extends vf.k>> {

    /* renamed from: a */
    public final /* synthetic */ sm.f f19867a;

    /* loaded from: classes2.dex */
    public static final class a<T> implements sm.g {

        /* renamed from: a */
        public final /* synthetic */ sm.g f19868a;

        @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl$flowOxygenRecords$lambda$22$$inlined$map$1$2", f = "DataRepository.kt", l = {223}, m = "emit")
        /* renamed from: lg.p$a$a */
        /* loaded from: classes2.dex */
        public static final class C0358a extends zl.c {

            /* renamed from: d */
            public /* synthetic */ Object f19869d;

            /* renamed from: e */
            public int f19870e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0358a(xl.d dVar) {
                super(dVar);
                a.this = r1;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f19869d = obj;
                this.f19870e |= Integer.MIN_VALUE;
                return a.this.n(null, this);
            }
        }

        public a(sm.g gVar) {
            this.f19868a = gVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x002f  */
        @Override // sm.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object n(java.lang.Object r9, xl.d r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof lg.p.a.C0358a
                if (r0 == 0) goto L13
                r0 = r10
                lg.p$a$a r0 = (lg.p.a.C0358a) r0
                int r1 = r0.f19870e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f19870e = r1
                goto L18
            L13:
                lg.p$a$a r0 = new lg.p$a$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f19869d
                yl.a r1 = yl.a.COROUTINE_SUSPENDED
                int r2 = r0.f19870e
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                mf.a0.k(r10)
                goto L6b
            L27:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L2f:
                mf.a0.k(r10)
                sm.g r10 = r8.f19868a
                java.util.List r9 = (java.util.List) r9
                r2 = 0
                if (r9 == 0) goto L62
                java.util.ArrayList r4 = new java.util.ArrayList
                r5 = 10
                int r5 = ul.l.B(r9, r5)
                r4.<init>(r5)
                java.util.Iterator r9 = r9.iterator()
            L48:
                boolean r5 = r9.hasNext()
                if (r5 == 0) goto L61
                java.lang.Object r5 = r9.next()
                rg.j r5 = (rg.j) r5
                vf.k r6 = new vf.k
                java.util.Date r7 = r5.f25622b
                int r5 = r5.f25627d
                r6.<init>(r7, r5, r2)
                r4.add(r6)
                goto L48
            L61:
                r2 = r4
            L62:
                r0.f19870e = r3
                java.lang.Object r9 = r10.n(r2, r0)
                if (r9 != r1) goto L6b
                return r1
            L6b:
                tl.l r9 = tl.l.f28297a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: lg.p.a.n(java.lang.Object, xl.d):java.lang.Object");
        }
    }

    public p(sm.f fVar) {
        this.f19867a = fVar;
    }

    @Override // sm.f
    public final Object a(sm.g<? super List<? extends vf.k>> gVar, xl.d dVar) {
        Object a10 = this.f19867a.a(new a(gVar), dVar);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
    }
}
