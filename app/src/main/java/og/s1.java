package og;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;

/* loaded from: classes2.dex */
public final class s1 implements r1 {

    /* renamed from: a */
    public final vg.d f23482a;

    /* renamed from: b */
    public final dk.a<lg.r0> f23483b;

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.WechatSportRepositoryImpl", f = "WeChatSportRepository.kt", l = {37, 38}, m = "getLink")
    /* loaded from: classes2.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public s1 f23484d;

        /* renamed from: e */
        public long f23485e;

        /* renamed from: f */
        public /* synthetic */ Object f23486f;

        /* renamed from: h */
        public int f23488h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d<? super a> dVar) {
            super(dVar);
            s1.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f23486f = obj;
            this.f23488h |= Integer.MIN_VALUE;
            return s1.this.a(0L, this);
        }
    }

    public s1(AppDatabase appDatabase, vg.d dVar, dk.a<lg.r0> aVar) {
        gm.l.f(appDatabase, "appDatabase");
        gm.l.f(aVar, "sportRepository");
        this.f23482a = dVar;
        this.f23483b = aVar;
        appDatabase.E();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0062 A[RETURN] */
    @Override // og.r1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r6, xl.d<? super java.lang.String> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof og.s1.a
            if (r0 == 0) goto L13
            r0 = r8
            og.s1$a r0 = (og.s1.a) r0
            int r1 = r0.f23488h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23488h = r1
            goto L18
        L13:
            og.s1$a r0 = new og.s1$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f23486f
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f23488h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            mf.a0.k(r8)
            goto L63
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            long r6 = r0.f23485e
            og.s1 r2 = r0.f23484d
            mf.a0.k(r8)
            goto L53
        L3a:
            mf.a0.k(r8)
            dk.a<lg.r0> r8 = r5.f23483b
            java.lang.Object r8 = r8.get()
            lg.r0 r8 = (lg.r0) r8
            r0.f23484d = r5
            r0.f23485e = r6
            r0.f23488h = r4
            java.lang.Object r8 = r8.k(r6, r0)
            if (r8 != r1) goto L52
            return r1
        L52:
            r2 = r5
        L53:
            vg.d r8 = r2.f23482a
            r2 = 0
            r0.f23484d = r2
            r0.f23488h = r3
            java.lang.String r2 = "release"
            java.lang.Object r8 = r8.a(r6, r2, r0)
            if (r8 != r1) goto L63
            return r1
        L63:
            vg.k r8 = (vg.k) r8
            T r6 = r8.f29381c
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: og.s1.a(long, xl.d):java.lang.Object");
    }
}
