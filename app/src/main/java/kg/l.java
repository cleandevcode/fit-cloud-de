package kg;

import com.topstep.fitcloud.pro.model.config.UserInfo;

/* loaded from: classes2.dex */
public final class l implements sm.f<UserInfo> {

    /* renamed from: a */
    public final /* synthetic */ sm.f f18527a;

    /* loaded from: classes2.dex */
    public static final class a<T> implements sm.g {

        /* renamed from: a */
        public final /* synthetic */ sm.g f18528a;

        @zl.e(c = "com.topstep.fitcloud.pro.shared.data.config.UserInfoRepositoryImpl$flowUserInfo$$inlined$map$1$2", f = "UserInfoRepository.kt", l = {223}, m = "emit")
        /* renamed from: kg.l$a$a */
        /* loaded from: classes2.dex */
        public static final class C0320a extends zl.c {

            /* renamed from: d */
            public /* synthetic */ Object f18529d;

            /* renamed from: e */
            public int f18530e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0320a(xl.d dVar) {
                super(dVar);
                a.this = r1;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f18529d = obj;
                this.f18530e |= Integer.MIN_VALUE;
                return a.this.n(null, this);
            }
        }

        public a(sm.g gVar) {
            this.f18528a = gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0033  */
        @Override // sm.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object n(java.lang.Object r22, xl.d r23) {
            /*
                r21 = this;
                r0 = r21
                r1 = r23
                boolean r2 = r1 instanceof kg.l.a.C0320a
                if (r2 == 0) goto L17
                r2 = r1
                kg.l$a$a r2 = (kg.l.a.C0320a) r2
                int r3 = r2.f18530e
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                r5 = r3 & r4
                if (r5 == 0) goto L17
                int r3 = r3 - r4
                r2.f18530e = r3
                goto L1c
            L17:
                kg.l$a$a r2 = new kg.l$a$a
                r2.<init>(r1)
            L1c:
                java.lang.Object r1 = r2.f18529d
                yl.a r3 = yl.a.COROUTINE_SUSPENDED
                int r4 = r2.f18530e
                r5 = 1
                if (r4 == 0) goto L33
                if (r4 != r5) goto L2b
                mf.a0.k(r1)
                goto L85
            L2b:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L33:
                mf.a0.k(r1)
                sm.g r1 = r0.f18528a
                r4 = r22
                pg.m r4 = (pg.m) r4
                com.topstep.fitcloud.pro.model.config.UserInfo r15 = new com.topstep.fitcloud.pro.model.config.UserInfo
                long r7 = r4.f24070d
                java.lang.String r9 = r4.f24071e
                java.lang.String r10 = r4.f24072f
                java.lang.String r11 = r4.f24073g
                int r12 = r4.f24074h
                java.lang.String r13 = r4.f24075i
                float r14 = r4.f24076j
                float r6 = r4.f24077k
                java.lang.String r5 = r4.f24078l
                java.lang.String r0 = r4.f24079m
                r16 = r6
                int r6 = r4.f24081o
                r17 = 0
                r20 = r3
                r3 = 1
                if (r6 != r3) goto L60
                r18 = 1
                goto L62
            L60:
                r18 = 0
            L62:
                int r4 = r4.f24082p
                if (r4 != r3) goto L6b
                r3 = r16
                r19 = 1
                goto L6f
            L6b:
                r3 = r16
                r19 = 0
            L6f:
                r6 = r15
                r4 = r15
                r15 = r3
                r16 = r5
                r17 = r0
                r6.<init>(r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                r0 = 1
                r2.f18530e = r0
                java.lang.Object r0 = r1.n(r4, r2)
                r1 = r20
                if (r0 != r1) goto L85
                return r1
            L85:
                tl.l r0 = tl.l.f28297a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kg.l.a.n(java.lang.Object, xl.d):java.lang.Object");
        }
    }

    public l(sm.f fVar) {
        this.f18527a = fVar;
    }

    @Override // sm.f
    public final Object a(sm.g<? super UserInfo> gVar, xl.d dVar) {
        Object a10 = this.f18527a.a(new a(gVar), dVar);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
    }
}
