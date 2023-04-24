package mg;

import com.topstep.fitcloud.pro.shared.data.wh.WhMenstruationConfig;

/* loaded from: classes2.dex */
public final class b3 implements sm.f<WhMenstruationConfig> {

    /* renamed from: a */
    public final /* synthetic */ sm.f f20697a;

    /* renamed from: b */
    public final /* synthetic */ c3 f20698b;

    /* loaded from: classes2.dex */
    public static final class a<T> implements sm.g {

        /* renamed from: a */
        public final /* synthetic */ sm.g f20699a;

        /* renamed from: b */
        public final /* synthetic */ c3 f20700b;

        @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.MenstruationTimelineDao$flowMenstruationConfig$$inlined$map$1$2", f = "MenstruationTimelineDao.kt", l = {223}, m = "emit")
        /* renamed from: mg.b3$a$a */
        /* loaded from: classes2.dex */
        public static final class C0374a extends zl.c {

            /* renamed from: d */
            public /* synthetic */ Object f20701d;

            /* renamed from: e */
            public int f20702e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0374a(xl.d dVar) {
                super(dVar);
                a.this = r1;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f20701d = obj;
                this.f20702e |= Integer.MIN_VALUE;
                return a.this.n(null, this);
            }
        }

        public a(sm.g gVar, c3 c3Var) {
            this.f20699a = gVar;
            this.f20700b = c3Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x002f  */
        @Override // sm.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object n(java.lang.Object r11, xl.d r12) {
            /*
                r10 = this;
                boolean r0 = r12 instanceof mg.b3.a.C0374a
                if (r0 == 0) goto L13
                r0 = r12
                mg.b3$a$a r0 = (mg.b3.a.C0374a) r0
                int r1 = r0.f20702e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f20702e = r1
                goto L18
            L13:
                mg.b3$a$a r0 = new mg.b3$a$a
                r0.<init>(r12)
            L18:
                java.lang.Object r12 = r0.f20701d
                yl.a r1 = yl.a.COROUTINE_SUSPENDED
                int r2 = r0.f20702e
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                mf.a0.k(r12)
                goto L56
            L27:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L2f:
                mf.a0.k(r12)
                sm.g r12 = r10.f20699a
                pg.g r11 = (pg.g) r11
                if (r11 == 0) goto L42
                mg.c3 r2 = r10.f20700b
                mf.h0 r2 = r2.f20732a
                com.topstep.fitcloud.pro.shared.data.wh.WhMenstruationConfig r11 = r11.a(r2)
                if (r11 != 0) goto L4d
            L42:
                com.topstep.fitcloud.pro.shared.data.wh.WhMenstruationConfig r11 = new com.topstep.fitcloud.pro.shared.data.wh.WhMenstruationConfig
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 7
                r9 = 0
                r4 = r11
                r4.<init>(r5, r6, r7, r8, r9)
            L4d:
                r0.f20702e = r3
                java.lang.Object r11 = r12.n(r11, r0)
                if (r11 != r1) goto L56
                return r1
            L56:
                tl.l r11 = tl.l.f28297a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: mg.b3.a.n(java.lang.Object, xl.d):java.lang.Object");
        }
    }

    public b3(sm.f fVar, c3 c3Var) {
        this.f20697a = fVar;
        this.f20698b = c3Var;
    }

    @Override // sm.f
    public final Object a(sm.g<? super WhMenstruationConfig> gVar, xl.d dVar) {
        Object a10 = this.f20697a.a(new a(gVar, this.f20698b), dVar);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
    }
}
