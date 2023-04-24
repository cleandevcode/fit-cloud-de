package s1;

import pm.e0;

@zl.e(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {122, 122}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class o extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public fm.p f26430e;

    /* renamed from: f */
    public int f26431f;

    /* renamed from: g */
    public final /* synthetic */ p<Object> f26432g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p<Object> pVar, xl.d<? super o> dVar) {
        super(2, dVar);
        this.f26432g = pVar;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((o) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new o(this.f26432g, dVar);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x005a -> B:50:0x005d). Please submit an issue!!! */
    @Override // zl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(java.lang.Object r7) {
        /*
            r6 = this;
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            int r1 = r6.f26431f
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            mf.a0.k(r7)
            r7 = r6
            goto L5d
        L11:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L19:
            fm.p r1 = r6.f26430e
            mf.a0.k(r7)
            r4 = r1
            r1 = r7
            r7 = r6
            goto L51
        L22:
            mf.a0.k(r7)
            s1.p<java.lang.Object> r7 = r6.f26432g
            java.util.concurrent.atomic.AtomicInteger r7 = r7.f26436d
            int r7 = r7.get()
            if (r7 <= 0) goto L31
            r7 = 1
            goto L32
        L31:
            r7 = 0
        L32:
            if (r7 == 0) goto L6a
            r7 = r6
        L35:
            s1.p<java.lang.Object> r1 = r7.f26432g
            pm.e0 r1 = r1.f26433a
            xl.f r1 = r1.E()
            bi.m0.j(r1)
            s1.p<java.lang.Object> r1 = r7.f26432g
            fm.p<T, xl.d<? super tl.l>, java.lang.Object> r4 = r1.f26434b
            rm.a r1 = r1.f26435c
            r7.f26430e = r4
            r7.f26431f = r3
            java.lang.Object r1 = r1.C(r7)
            if (r1 != r0) goto L51
            return r0
        L51:
            r5 = 0
            r7.f26430e = r5
            r7.f26431f = r2
            java.lang.Object r1 = r4.A(r1, r7)
            if (r1 != r0) goto L5d
            return r0
        L5d:
            s1.p<java.lang.Object> r1 = r7.f26432g
            java.util.concurrent.atomic.AtomicInteger r1 = r1.f26436d
            int r1 = r1.decrementAndGet()
            if (r1 != 0) goto L35
            tl.l r7 = tl.l.f28297a
            return r7
        L6a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.o.t(java.lang.Object):java.lang.Object");
    }
}
