package sm;

/* loaded from: classes2.dex */
public final class h implements f<Object> {

    /* renamed from: a */
    public final /* synthetic */ Object[] f27183a;

    @zl.e(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1", f = "Builders.kt", l = {114}, m = "collect")
    /* loaded from: classes2.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f27184d;

        /* renamed from: e */
        public int f27185e;

        /* renamed from: g */
        public h f27187g;

        /* renamed from: h */
        public g f27188h;

        /* renamed from: i */
        public int f27189i;

        /* renamed from: j */
        public int f27190j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d dVar) {
            super(dVar);
            h.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f27184d = obj;
            this.f27185e |= Integer.MIN_VALUE;
            return h.this.a(null, this);
        }
    }

    public h(Object[] objArr) {
        this.f27183a = objArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0057 -> B:41:0x005a). Please submit an issue!!! */
    @Override // sm.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(sm.g<? super java.lang.Object> r8, xl.d<? super tl.l> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof sm.h.a
            if (r0 == 0) goto L13
            r0 = r9
            sm.h$a r0 = (sm.h.a) r0
            int r1 = r0.f27185e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27185e = r1
            goto L18
        L13:
            sm.h$a r0 = new sm.h$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f27184d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f27185e
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r8 = r0.f27190j
            int r2 = r0.f27189i
            sm.g r4 = r0.f27188h
            sm.h r5 = r0.f27187g
            mf.a0.k(r9)
            r9 = r4
            goto L5a
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            mf.a0.k(r9)
            java.lang.Object[] r9 = r7.f27183a
            int r9 = r9.length
            r2 = 0
            r5 = r7
            r6 = r9
            r9 = r8
            r8 = r6
        L43:
            if (r2 >= r8) goto L5c
            java.lang.Object[] r4 = r5.f27183a
            r4 = r4[r2]
            r0.f27187g = r5
            r0.f27188h = r9
            r0.f27189i = r2
            r0.f27190j = r8
            r0.f27185e = r3
            java.lang.Object r4 = r9.n(r4, r0)
            if (r4 != r1) goto L5a
            return r1
        L5a:
            int r2 = r2 + r3
            goto L43
        L5c:
            tl.l r8 = tl.l.f28297a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: sm.h.a(sm.g, xl.d):java.lang.Object");
    }
}
