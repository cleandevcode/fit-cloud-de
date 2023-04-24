package zg;

import sm.g;
import tl.l;

/* loaded from: classes2.dex */
public final class f implements sm.f<Boolean> {

    /* renamed from: a */
    public final /* synthetic */ sm.f f32382a;

    /* renamed from: b */
    public final /* synthetic */ zg.a f32383b;

    /* loaded from: classes2.dex */
    public static final class a<T> implements g {

        /* renamed from: a */
        public final /* synthetic */ g f32384a;

        /* renamed from: b */
        public final /* synthetic */ zg.a f32385b;

        @zl.e(c = "com.topstep.fitcloud.pro.shared.data.version.VersionRepositoryImpl$flowHardwareUpgradeable$lambda$3$$inlined$map$1$2", f = "VersionRepository.kt", l = {223}, m = "emit")
        /* renamed from: zg.f$a$a */
        /* loaded from: classes2.dex */
        public static final class C0613a extends zl.c {

            /* renamed from: d */
            public /* synthetic */ Object f32386d;

            /* renamed from: e */
            public int f32387e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0613a(xl.d dVar) {
                super(dVar);
                a.this = r1;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f32386d = obj;
                this.f32387e |= Integer.MIN_VALUE;
                return a.this.n(null, this);
            }
        }

        public a(g gVar, zg.a aVar) {
            this.f32384a = gVar;
            this.f32385b = aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x002f  */
        @Override // sm.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object n(java.lang.Object r8, xl.d r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof zg.f.a.C0613a
                if (r0 == 0) goto L13
                r0 = r9
                zg.f$a$a r0 = (zg.f.a.C0613a) r0
                int r1 = r0.f32387e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f32387e = r1
                goto L18
            L13:
                zg.f$a$a r0 = new zg.f$a$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f32386d
                yl.a r1 = yl.a.COROUTINE_SUSPENDED
                int r2 = r0.f32387e
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                mf.a0.k(r9)
                goto L71
            L27:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L2f:
                mf.a0.k(r9)
                sm.g r9 = r7.f32384a
                nj.c r8 = (nj.c) r8
                zg.a r2 = r7.f32385b
                r2.getClass()
                java.lang.String r4 = "deviceInfo"
                gm.l.f(r8, r4)
                boolean r4 = r8.e()
                r5 = 0
                if (r4 == 0) goto L48
                goto L64
            L48:
                java.lang.String r4 = r2.f32349a
                java.lang.String r6 = r8.f()
                boolean r4 = gm.l.a(r4, r6)
                if (r4 != 0) goto L55
                goto L64
            L55:
                eg.a r4 = r2.f32350b
                java.lang.String r8 = r4.c(r8)
                java.lang.String r2 = r2.f32351c
                int r8 = r2.compareTo(r8)
                if (r8 <= 0) goto L64
                r5 = 1
            L64:
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r5)
                r0.f32387e = r3
                java.lang.Object r8 = r9.n(r8, r0)
                if (r8 != r1) goto L71
                return r1
            L71:
                tl.l r8 = tl.l.f28297a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: zg.f.a.n(java.lang.Object, xl.d):java.lang.Object");
        }
    }

    public f(sm.b bVar, zg.a aVar) {
        this.f32382a = bVar;
        this.f32383b = aVar;
    }

    @Override // sm.f
    public final Object a(g<? super Boolean> gVar, xl.d dVar) {
        Object a10 = this.f32382a.a(new a(gVar, this.f32383b), dVar);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : l.f28297a;
    }
}
