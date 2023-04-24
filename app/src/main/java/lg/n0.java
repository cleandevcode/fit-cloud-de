package lg;

import com.topstep.fitcloud.pro.model.data.SportGoal;
import mg.y8;

/* loaded from: classes2.dex */
public final class n0 implements sm.f<SportGoal> {

    /* renamed from: a */
    public final /* synthetic */ sm.f f19844a;

    /* renamed from: b */
    public final /* synthetic */ Long f19845b;

    /* renamed from: c */
    public final /* synthetic */ long f19846c;

    /* renamed from: d */
    public final /* synthetic */ r0 f19847d;

    /* renamed from: e */
    public final /* synthetic */ int f19848e;

    /* loaded from: classes2.dex */
    public static final class a<T> implements sm.g {

        /* renamed from: a */
        public final /* synthetic */ sm.g f19849a;

        /* renamed from: b */
        public final /* synthetic */ Long f19850b;

        /* renamed from: c */
        public final /* synthetic */ long f19851c;

        /* renamed from: d */
        public final /* synthetic */ r0 f19852d;

        /* renamed from: e */
        public final /* synthetic */ int f19853e;

        @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.SportRepositoryImpl$flowGoal$lambda$5$$inlined$map$1$2", f = "SportRepository.kt", l = {223}, m = "emit")
        /* renamed from: lg.n0$a$a */
        /* loaded from: classes2.dex */
        public static final class C0357a extends zl.c {

            /* renamed from: d */
            public /* synthetic */ Object f19854d;

            /* renamed from: e */
            public int f19855e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0357a(xl.d dVar) {
                super(dVar);
                a.this = r1;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f19854d = obj;
                this.f19855e |= Integer.MIN_VALUE;
                return a.this.n(null, this);
            }
        }

        public a(sm.g gVar, Long l10, long j10, r0 r0Var, int i10) {
            this.f19849a = gVar;
            this.f19850b = l10;
            this.f19851c = j10;
            this.f19852d = r0Var;
            this.f19853e = i10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:77:0x0086, code lost:
            if (r4 == null) goto L42;
         */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0030  */
        @Override // sm.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object n(java.lang.Object r13, xl.d r14) {
            /*
                r12 = this;
                boolean r0 = r14 instanceof lg.n0.a.C0357a
                if (r0 == 0) goto L13
                r0 = r14
                lg.n0$a$a r0 = (lg.n0.a.C0357a) r0
                int r1 = r0.f19855e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f19855e = r1
                goto L18
            L13:
                lg.n0$a$a r0 = new lg.n0$a$a
                r0.<init>(r14)
            L18:
                java.lang.Object r14 = r0.f19854d
                yl.a r1 = yl.a.COROUTINE_SUSPENDED
                int r2 = r0.f19855e
                r3 = 1
                if (r2 == 0) goto L30
                if (r2 != r3) goto L28
                mf.a0.k(r14)
                goto L9f
            L28:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r14)
                throw r13
            L30:
                mf.a0.k(r14)
                sm.g r14 = r12.f19849a
                com.topstep.fitcloud.pro.shared.data.entity.data.SportGoalCache r13 = (com.topstep.fitcloud.pro.shared.data.entity.data.SportGoalCache) r13
                java.lang.Long r2 = r12.f19850b
                long r4 = r2.longValue()
                boolean r2 = hh.b.f(r4)
                if (r2 != 0) goto L60
                if (r13 == 0) goto L4d
                long r4 = r13.f10074c
                long r6 = r12.f19851c
                int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r2 == 0) goto L60
            L4d:
                lg.r0 r5 = r12.f19852d
                pm.e0 r2 = r5.f19894c
                lg.m0 r11 = new lg.m0
                java.lang.Long r6 = r12.f19850b
                long r8 = r12.f19851c
                r10 = 0
                r4 = r11
                r7 = r13
                r4.<init>(r5, r6, r7, r8, r10)
                mf.a0.j(r2, r11)
            L60:
                if (r13 == 0) goto L88
                int r2 = r12.f19853e
                java.util.List<com.topstep.fitcloud.pro.model.data.SportGoal> r13 = r13.f10072a
                r4 = 0
                if (r13 == 0) goto L86
                java.util.Iterator r13 = r13.iterator()
            L6d:
                boolean r5 = r13.hasNext()
                if (r5 == 0) goto L84
                java.lang.Object r5 = r13.next()
                r6 = r5
                com.topstep.fitcloud.pro.model.data.SportGoal r6 = (com.topstep.fitcloud.pro.model.data.SportGoal) r6
                int r6 = r6.f9606a
                if (r6 != r2) goto L80
                r6 = 1
                goto L81
            L80:
                r6 = 0
            L81:
                if (r6 == 0) goto L6d
                r4 = r5
            L84:
                com.topstep.fitcloud.pro.model.data.SportGoal r4 = (com.topstep.fitcloud.pro.model.data.SportGoal) r4
            L86:
                if (r4 != 0) goto L96
            L88:
                com.topstep.fitcloud.pro.model.data.SportGoal r4 = new com.topstep.fitcloud.pro.model.data.SportGoal
                int r6 = r12.f19853e
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 14
                r11 = 0
                r5 = r4
                r5.<init>(r6, r7, r8, r9, r10, r11)
            L96:
                r0.f19855e = r3
                java.lang.Object r13 = r14.n(r4, r0)
                if (r13 != r1) goto L9f
                return r1
            L9f:
                tl.l r13 = tl.l.f28297a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: lg.n0.a.n(java.lang.Object, xl.d):java.lang.Object");
        }
    }

    public n0(y8 y8Var, Long l10, long j10, r0 r0Var, int i10) {
        this.f19844a = y8Var;
        this.f19845b = l10;
        this.f19846c = j10;
        this.f19847d = r0Var;
        this.f19848e = i10;
    }

    @Override // sm.f
    public final Object a(sm.g<? super SportGoal> gVar, xl.d dVar) {
        Object a10 = this.f19844a.a(new a(gVar, this.f19845b, this.f19846c, this.f19847d, this.f19848e), dVar);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
    }
}
