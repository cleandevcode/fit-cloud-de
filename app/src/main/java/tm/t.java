package tm;

import xl.f;

/* loaded from: classes2.dex */
public final class t extends gm.m implements fm.p<Integer, f.b, Integer> {

    /* renamed from: b */
    public final /* synthetic */ r<?> f28370b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(r<?> rVar) {
        super(2);
        this.f28370b = rVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0038, code lost:
        if (r1 == null) goto L5;
     */
    @Override // fm.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Integer A(java.lang.Integer r4, xl.f.b r5) {
        /*
            r3 = this;
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            xl.f$b r5 = (xl.f.b) r5
            xl.f$c r0 = r5.getKey()
            tm.r<?> r1 = r3.f28370b
            xl.f r1 = r1.f28363e
            xl.f$b r1 = r1.b(r0)
            int r2 = pm.g1.K
            pm.g1$b r2 = pm.g1.b.f24341a
            if (r0 == r2) goto L26
            if (r5 == r1) goto L1f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L21
        L1f:
            int r4 = r4 + 1
        L21:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L3b
        L26:
            pm.g1 r1 = (pm.g1) r1
            pm.g1 r5 = (pm.g1) r5
        L2a:
            r0 = 0
            if (r5 != 0) goto L2f
            r5 = r0
            goto L36
        L2f:
            if (r5 != r1) goto L32
            goto L36
        L32:
            boolean r2 = r5 instanceof um.v
            if (r2 != 0) goto L64
        L36:
            if (r5 != r1) goto L3c
            if (r1 != 0) goto L1f
            goto L21
        L3b:
            return r4
        L3c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r5 = ", expected child of "
            r0.append(r5)
            r0.append(r1)
            java.lang.String r5 = ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L64:
            um.v r5 = (um.v) r5
            pm.n r5 = r5.c0()
            if (r5 == 0) goto L71
            pm.g1 r5 = r5.getParent()
            goto L2a
        L71:
            r5 = r0
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: tm.t.A(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
