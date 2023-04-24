package l2;

import java.util.Iterator;

@zl.e(c = "androidx.paging.CachedPageEventFlow$sharedForDownstream$1", f = "CachedPageEventFlow.kt", l = {63, 68}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class k extends zl.i implements fm.p<sm.g<? super ul.v<? extends b1<Object>>>, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public Iterator f19037e;

    /* renamed from: f */
    public int f19038f;

    /* renamed from: g */
    public /* synthetic */ Object f19039g;

    /* renamed from: h */
    public final /* synthetic */ l<Object> f19040h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l<Object> lVar, xl.d<? super k> dVar) {
        super(2, dVar);
        this.f19040h = lVar;
    }

    @Override // fm.p
    public final Object A(sm.g<? super ul.v<? extends b1<Object>>> gVar, xl.d<? super tl.l> dVar) {
        return ((k) p(gVar, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        k kVar = new k(this.f19040h, dVar);
        kVar.f19039g = obj;
        return kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0052  */
    @Override // zl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(java.lang.Object r5) {
        /*
            r4 = this;
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            int r1 = r4.f19038f
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L27
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.util.Iterator r1 = r4.f19037e
            java.lang.Object r3 = r4.f19039g
            sm.g r3 = (sm.g) r3
            mf.a0.k(r5)
            goto L4c
        L16:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1e:
            java.lang.Object r1 = r4.f19039g
            sm.g r1 = (sm.g) r1
            mf.a0.k(r5)
            r3 = r1
            goto L3f
        L27:
            mf.a0.k(r5)
            java.lang.Object r5 = r4.f19039g
            sm.g r5 = (sm.g) r5
            l2.l<java.lang.Object> r1 = r4.f19040h
            l2.b0<T> r1 = r1.f19061a
            r4.f19039g = r5
            r4.f19038f = r3
            java.io.Serializable r1 = r1.a(r4)
            if (r1 != r0) goto L3d
            return r0
        L3d:
            r3 = r5
            r5 = r1
        L3f:
            java.util.List r5 = (java.util.List) r5
            l2.l<java.lang.Object> r1 = r4.f19040h
            pm.z1 r1 = r1.f19064d
            r1.start()
            java.util.Iterator r1 = r5.iterator()
        L4c:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L65
            java.lang.Object r5 = r1.next()
            ul.v r5 = (ul.v) r5
            r4.f19039g = r3
            r4.f19037e = r1
            r4.f19038f = r2
            java.lang.Object r5 = r3.n(r5, r4)
            if (r5 != r0) goto L4c
            return r0
        L65:
            tl.l r5 = tl.l.f28297a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.k.t(java.lang.Object):java.lang.Object");
    }
}
