package lg;

import java.util.Date;

/* loaded from: classes2.dex */
public final class u implements sm.f<vf.n> {

    /* renamed from: a */
    public final /* synthetic */ sm.f f19964a;

    /* renamed from: b */
    public final /* synthetic */ Date f19965b;

    /* loaded from: classes2.dex */
    public static final class a<T> implements sm.g {

        /* renamed from: a */
        public final /* synthetic */ sm.g f19966a;

        /* renamed from: b */
        public final /* synthetic */ Date f19967b;

        @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl$flowSleepRecord$$inlined$map$1$2", f = "DataRepository.kt", l = {223}, m = "emit")
        /* renamed from: lg.u$a$a */
        /* loaded from: classes2.dex */
        public static final class C0360a extends zl.c {

            /* renamed from: d */
            public /* synthetic */ Object f19968d;

            /* renamed from: e */
            public int f19969e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0360a(xl.d dVar) {
                super(dVar);
                a.this = r1;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f19968d = obj;
                this.f19969e |= Integer.MIN_VALUE;
                return a.this.n(null, this);
            }
        }

        public a(sm.g gVar, Date date) {
            this.f19966a = gVar;
            this.f19967b = date;
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x002f  */
        @Override // sm.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object n(java.lang.Object r11, xl.d r12) {
            /*
                r10 = this;
                boolean r0 = r12 instanceof lg.u.a.C0360a
                if (r0 == 0) goto L13
                r0 = r12
                lg.u$a$a r0 = (lg.u.a.C0360a) r0
                int r1 = r0.f19969e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f19969e = r1
                goto L18
            L13:
                lg.u$a$a r0 = new lg.u$a$a
                r0.<init>(r12)
            L18:
                java.lang.Object r12 = r0.f19968d
                yl.a r1 = yl.a.COROUTINE_SUSPENDED
                int r2 = r0.f19969e
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                mf.a0.k(r12)
                goto L62
            L27:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L2f:
                mf.a0.k(r12)
                sm.g r12 = r10.f19966a
                rg.p r11 = (rg.p) r11
                java.util.Date r5 = r10.f19967b
                java.lang.String r2 = "time"
                gm.l.f(r5, r2)
                vf.n r2 = new vf.n
                r4 = 0
                if (r11 == 0) goto L45
                int r6 = r11.f25641c
                goto L46
            L45:
                r6 = 0
            L46:
                if (r11 == 0) goto L4b
                int r7 = r11.f25642d
                goto L4c
            L4b:
                r7 = 0
            L4c:
                if (r11 == 0) goto L52
                int r11 = r11.f25643e
                r8 = r11
                goto L53
            L52:
                r8 = 0
            L53:
                r9 = 16
                r4 = r2
                r4.<init>(r5, r6, r7, r8, r9)
                r0.f19969e = r3
                java.lang.Object r11 = r12.n(r2, r0)
                if (r11 != r1) goto L62
                return r1
            L62:
                tl.l r11 = tl.l.f28297a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: lg.u.a.n(java.lang.Object, xl.d):java.lang.Object");
        }
    }

    public u(tm.j jVar, Date date) {
        this.f19964a = jVar;
        this.f19965b = date;
    }

    @Override // sm.f
    public final Object a(sm.g<? super vf.n> gVar, xl.d dVar) {
        Object a10 = this.f19964a.a(new a(gVar, this.f19965b), dVar);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
    }
}
