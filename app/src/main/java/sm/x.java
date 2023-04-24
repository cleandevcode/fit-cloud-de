package sm;

import l2.h;

/* loaded from: classes2.dex */
public final class x implements f<Object> {

    /* renamed from: a */
    public final /* synthetic */ f f27333a;

    /* renamed from: b */
    public final /* synthetic */ fm.p f27334b;

    @zl.e(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", f = "Limit.kt", l = {124}, m = "collect")
    /* loaded from: classes2.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f27335d;

        /* renamed from: e */
        public int f27336e;

        /* renamed from: g */
        public y f27338g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d dVar) {
            super(dVar);
            x.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f27335d = obj;
            this.f27336e |= Integer.MIN_VALUE;
            return x.this.a(null, this);
        }
    }

    public x(h.a aVar, j1 j1Var) {
        this.f27333a = j1Var;
        this.f27334b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0054  */
    @Override // sm.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(sm.g<? super java.lang.Object> r6, xl.d<? super tl.l> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof sm.x.a
            if (r0 == 0) goto L13
            r0 = r7
            sm.x$a r0 = (sm.x.a) r0
            int r1 = r0.f27336e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27336e = r1
            goto L18
        L13:
            sm.x$a r0 = new sm.x$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f27335d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f27336e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            sm.y r6 = r0.f27338g
            mf.a0.k(r7)     // Catch: tm.a -> L29
            goto L51
        L29:
            r7 = move-exception
            goto L4d
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            mf.a0.k(r7)
            sm.f r7 = r5.f27333a
            sm.y r2 = new sm.y
            fm.p r4 = r5.f27334b
            r2.<init>(r4, r6)
            r0.f27338g = r2     // Catch: tm.a -> L4a
            r0.f27336e = r3     // Catch: tm.a -> L4a
            java.lang.Object r6 = r7.a(r2, r0)     // Catch: tm.a -> L4a
            if (r6 != r1) goto L51
            return r1
        L4a:
            r6 = move-exception
            r7 = r6
            r6 = r2
        L4d:
            sm.g<?> r0 = r7.f28300a
            if (r0 != r6) goto L54
        L51:
            tl.l r6 = tl.l.f28297a
            return r6
        L54:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: sm.x.a(sm.g, xl.d):java.lang.Object");
    }
}
