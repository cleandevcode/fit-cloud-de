package sm;

/* loaded from: classes2.dex */
public abstract class a<T> implements f<T> {

    @zl.e(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {230}, m = "collect")
    /* renamed from: sm.a$a */
    /* loaded from: classes2.dex */
    public static final class C0484a extends zl.c {

        /* renamed from: d */
        public tm.r f27108d;

        /* renamed from: e */
        public /* synthetic */ Object f27109e;

        /* renamed from: f */
        public final /* synthetic */ a<T> f27110f;

        /* renamed from: g */
        public int f27111g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0484a(a<T> aVar, xl.d<? super C0484a> dVar) {
            super(dVar);
            this.f27110f = aVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f27109e = obj;
            this.f27111g |= Integer.MIN_VALUE;
            return this.f27110f.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0033  */
    @Override // sm.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(sm.g<? super T> r6, xl.d<? super tl.l> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof sm.a.C0484a
            if (r0 == 0) goto L13
            r0 = r7
            sm.a$a r0 = (sm.a.C0484a) r0
            int r1 = r0.f27111g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27111g = r1
            goto L18
        L13:
            sm.a$a r0 = new sm.a$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f27109e
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f27111g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            tm.r r6 = r0.f27108d
            mf.a0.k(r7)     // Catch: java.lang.Throwable -> L29
            goto L56
        L29:
            r7 = move-exception
            goto L60
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            mf.a0.k(r7)
            tm.r r7 = new tm.r
            xl.f r2 = r0.f32509b
            gm.l.c(r2)
            r7.<init>(r6, r2)
            r0.f27108d = r7     // Catch: java.lang.Throwable -> L5c
            r0.f27111g = r3     // Catch: java.lang.Throwable -> L5c
            r6 = r5
            sm.u0 r6 = (sm.u0) r6     // Catch: java.lang.Throwable -> L5c
            fm.p<sm.g<? super T>, xl.d<? super tl.l>, java.lang.Object> r6 = r6.f27310a     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r6 = r6.A(r7, r0)     // Catch: java.lang.Throwable -> L5c
            if (r6 != r1) goto L50
            goto L52
        L50:
            tl.l r6 = tl.l.f28297a     // Catch: java.lang.Throwable -> L5c
        L52:
            if (r6 != r1) goto L55
            return r1
        L55:
            r6 = r7
        L56:
            r6.u()
            tl.l r6 = tl.l.f28297a
            return r6
        L5c:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L60:
            r6.u()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: sm.a.a(sm.g, xl.d):java.lang.Object");
    }
}
