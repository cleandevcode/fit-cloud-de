package lg;

import java.util.List;

/* loaded from: classes2.dex */
public final class h implements sm.f<List<? extends vf.c>> {

    /* renamed from: a */
    public final /* synthetic */ sm.f f19765a;

    /* loaded from: classes2.dex */
    public static final class a<T> implements sm.g {

        /* renamed from: a */
        public final /* synthetic */ sm.g f19766a;

        @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl$flowBloodPressureRecords$lambda$27$$inlined$map$1$2", f = "DataRepository.kt", l = {223}, m = "emit")
        /* renamed from: lg.h$a$a */
        /* loaded from: classes2.dex */
        public static final class C0354a extends zl.c {

            /* renamed from: d */
            public /* synthetic */ Object f19767d;

            /* renamed from: e */
            public int f19768e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0354a(xl.d dVar) {
                super(dVar);
                a.this = r1;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f19767d = obj;
                this.f19768e |= Integer.MIN_VALUE;
                return a.this.n(null, this);
            }
        }

        public a(sm.g gVar) {
            this.f19766a = gVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x002f  */
        @Override // sm.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object n(java.lang.Object r10, xl.d r11) {
            /*
                r9 = this;
                boolean r0 = r11 instanceof lg.h.a.C0354a
                if (r0 == 0) goto L13
                r0 = r11
                lg.h$a$a r0 = (lg.h.a.C0354a) r0
                int r1 = r0.f19768e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f19768e = r1
                goto L18
            L13:
                lg.h$a$a r0 = new lg.h$a$a
                r0.<init>(r11)
            L18:
                java.lang.Object r11 = r0.f19767d
                yl.a r1 = yl.a.COROUTINE_SUSPENDED
                int r2 = r0.f19768e
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                mf.a0.k(r11)
                goto L6d
            L27:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L2f:
                mf.a0.k(r11)
                sm.g r11 = r9.f19766a
                java.util.List r10 = (java.util.List) r10
                r2 = 0
                if (r10 == 0) goto L64
                java.util.ArrayList r4 = new java.util.ArrayList
                r5 = 10
                int r5 = ul.l.B(r10, r5)
                r4.<init>(r5)
                java.util.Iterator r10 = r10.iterator()
            L48:
                boolean r5 = r10.hasNext()
                if (r5 == 0) goto L63
                java.lang.Object r5 = r10.next()
                rg.b r5 = (rg.b) r5
                vf.c r6 = new vf.c
                java.util.Date r7 = r5.f25622b
                int r8 = r5.f25608d
                int r5 = r5.f25609e
                r6.<init>(r7, r8, r5, r2)
                r4.add(r6)
                goto L48
            L63:
                r2 = r4
            L64:
                r0.f19768e = r3
                java.lang.Object r10 = r11.n(r2, r0)
                if (r10 != r1) goto L6d
                return r1
            L6d:
                tl.l r10 = tl.l.f28297a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: lg.h.a.n(java.lang.Object, xl.d):java.lang.Object");
        }
    }

    public h(sm.f fVar) {
        this.f19765a = fVar;
    }

    @Override // sm.f
    public final Object a(sm.g<? super List<? extends vf.c>> gVar, xl.d dVar) {
        Object a10 = this.f19765a.a(new a(gVar), dVar);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
    }
}
