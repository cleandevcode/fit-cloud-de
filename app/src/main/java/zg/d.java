package zg;

import sm.g;
import tl.l;

/* loaded from: classes2.dex */
public final class d implements sm.f<Boolean> {

    /* renamed from: a */
    public final /* synthetic */ sm.f f32371a;

    /* renamed from: b */
    public final /* synthetic */ c f32372b;

    /* loaded from: classes2.dex */
    public static final class a<T> implements g {

        /* renamed from: a */
        public final /* synthetic */ g f32373a;

        /* renamed from: b */
        public final /* synthetic */ c f32374b;

        @zl.e(c = "com.topstep.fitcloud.pro.shared.data.version.VersionRepositoryImpl$flowAppUpgradeable$$inlined$map$1$2", f = "VersionRepository.kt", l = {223}, m = "emit")
        /* renamed from: zg.d$a$a */
        /* loaded from: classes2.dex */
        public static final class C0612a extends zl.c {

            /* renamed from: d */
            public /* synthetic */ Object f32375d;

            /* renamed from: e */
            public int f32376e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0612a(xl.d dVar) {
                super(dVar);
                a.this = r1;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f32375d = obj;
                this.f32376e |= Integer.MIN_VALUE;
                return a.this.n(null, this);
            }
        }

        public a(g gVar, c cVar) {
            this.f32373a = gVar;
            this.f32374b = cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x002f  */
        @Override // sm.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object n(java.lang.Object r7, xl.d r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof zg.d.a.C0612a
                if (r0 == 0) goto L13
                r0 = r8
                zg.d$a$a r0 = (zg.d.a.C0612a) r0
                int r1 = r0.f32376e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f32376e = r1
                goto L18
            L13:
                zg.d$a$a r0 = new zg.d$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f32375d
                yl.a r1 = yl.a.COROUTINE_SUSPENDED
                int r2 = r0.f32376e
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                mf.a0.k(r8)
                goto L73
            L27:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L2f:
                mf.a0.k(r8)
                sm.g r8 = r6.f32373a
                java.lang.String r7 = (java.lang.String) r7
                r2 = 0
                if (r7 == 0) goto L42
                int r4 = r7.length()
                if (r4 != 0) goto L40
                goto L42
            L40:
                r4 = 0
                goto L43
            L42:
                r4 = 1
            L43:
                if (r4 == 0) goto L46
                goto L66
            L46:
                zg.c r4 = r6.f32374b
                tl.d r4 = r4.f32356e
                java.lang.Object r4 = r4.getValue()
                java.lang.String r4 = (java.lang.String) r4
                if (r4 == 0) goto L5b
                int r5 = r4.length()
                if (r5 != 0) goto L59
                goto L5b
            L59:
                r5 = 0
                goto L5c
            L5b:
                r5 = 1
            L5c:
                if (r5 == 0) goto L5f
                goto L66
            L5f:
                int r7 = r7.compareTo(r4)
                if (r7 <= 0) goto L66
                r2 = 1
            L66:
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
                r0.f32376e = r3
                java.lang.Object r7 = r8.n(r7, r0)
                if (r7 != r1) goto L73
                return r1
            L73:
                tl.l r7 = tl.l.f28297a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: zg.d.a.n(java.lang.Object, xl.d):java.lang.Object");
        }
    }

    public d(sm.f fVar, c cVar) {
        this.f32371a = fVar;
        this.f32372b = cVar;
    }

    @Override // sm.f
    public final Object a(g<? super Boolean> gVar, xl.d dVar) {
        Object a10 = this.f32371a.a(new a(gVar, this.f32372b), dVar);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : l.f28297a;
    }
}
