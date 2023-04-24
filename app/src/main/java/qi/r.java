package qi;

import pm.e0;

@zl.e(c = "com.topstep.fitcloud.pro.utils.SingleAsyncAction$execute$1", f = "SingleAsyncState.kt", l = {39, 42, 45, 47, 49}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class r extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f24872e;

    /* renamed from: f */
    public /* synthetic */ Object f24873f;

    /* renamed from: g */
    public final /* synthetic */ s<Object> f24874g;

    /* renamed from: h */
    public final /* synthetic */ long f24875h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s<Object> sVar, long j10, xl.d<? super r> dVar) {
        super(2, dVar);
        this.f24874g = sVar;
        this.f24875h = j10;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((r) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        r rVar = new r(this.f24874g, this.f24875h, dVar);
        rVar.f24873f = obj;
        return rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00a8  */
    @Override // zl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(java.lang.Object r13) {
        /*
            r12 = this;
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            int r1 = r12.f24872e
            r2 = 0
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L3e
            if (r1 == r7) goto L36
            if (r1 == r6) goto L2e
            if (r1 == r5) goto L2a
            if (r1 == r4) goto L23
            if (r1 != r3) goto L1b
            mf.a0.k(r13)
            goto Lbb
        L1b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L23:
            java.lang.Object r1 = r12.f24873f
            mf.a0.k(r13)
            goto La0
        L2a:
            mf.a0.k(r13)     // Catch: java.lang.Throwable -> L7b
            goto L85
        L2e:
            java.lang.Object r1 = r12.f24873f
            pm.e0 r1 = (pm.e0) r1
            mf.a0.k(r13)
            goto L6e
        L36:
            java.lang.Object r1 = r12.f24873f
            pm.e0 r1 = (pm.e0) r1
            mf.a0.k(r13)
            goto L5b
        L3e:
            mf.a0.k(r13)
            java.lang.Object r13 = r12.f24873f
            r1 = r13
            pm.e0 r1 = (pm.e0) r1
            qi.s<java.lang.Object> r13 = r12.f24874g
            sm.g1 r13 = r13.f24877b
            y3.p r8 = new y3.p
            r8.<init>(r2)
            r12.f24873f = r1
            r12.f24872e = r7
            r13.setValue(r8)
            tl.l r13 = tl.l.f28297a
            if (r13 != r0) goto L5b
            return r0
        L5b:
            long r8 = r12.f24875h
            r10 = 0
            int r13 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r13 <= 0) goto L6e
            r12.f24873f = r1
            r12.f24872e = r6
            java.lang.Object r13 = mf.a0.g(r8, r12)
            if (r13 != r0) goto L6e
            return r0
        L6e:
            qi.s<java.lang.Object> r13 = r12.f24874g
            r12.f24873f = r2     // Catch: java.lang.Throwable -> L7b
            r12.f24872e = r5     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r13 = r13.a(r12)     // Catch: java.lang.Throwable -> L7b
            if (r13 != r0) goto L85
            return r0
        L7b:
            r13 = move-exception
            do.a$b r1 = p000do.a.f13275a
            r1.q(r13)
            tl.g$a r13 = mf.a0.f(r13)
        L85:
            qi.s<java.lang.Object> r1 = r12.f24874g
            boolean r5 = r13 instanceof tl.g.a
            r5 = r5 ^ r7
            if (r5 == 0) goto L9f
            sm.g1 r1 = r1.f24877b
            y3.c1 r5 = new y3.c1
            r5.<init>(r13)
            r12.f24873f = r13
            r12.f24872e = r4
            r1.setValue(r5)
            tl.l r1 = tl.l.f28297a
            if (r1 != r0) goto L9f
            return r0
        L9f:
            r1 = r13
        La0:
            qi.s<java.lang.Object> r13 = r12.f24874g
            java.lang.Throwable r4 = tl.g.a(r1)
            if (r4 == 0) goto Lbb
            sm.g1 r13 = r13.f24877b
            y3.j r5 = new y3.j
            r5.<init>(r2, r4)
            r12.f24873f = r1
            r12.f24872e = r3
            r13.setValue(r5)
            tl.l r13 = tl.l.f28297a
            if (r13 != r0) goto Lbb
            return r0
        Lbb:
            tl.l r13 = tl.l.f28297a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: qi.r.t(java.lang.Object):java.lang.Object");
    }
}
