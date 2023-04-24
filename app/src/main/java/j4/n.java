package j4;

import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class n implements t0, i4.t {

    /* renamed from: a */
    public static final n f17452a = new n();

    @Override // i4.t
    public final int b() {
        return 6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0029, code lost:
        if (r5 == 1) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x004b A[RETURN] */
    @Override // i4.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> T d(h4.a r5, java.lang.reflect.Type r6, java.lang.Object r7) {
        /*
            r4 = this;
            h4.c r0 = r5.f15774f
            int r1 = r0.h0()     // Catch: java.lang.Exception -> L4c
            r2 = 6
            r3 = 16
            if (r1 != r2) goto Lf
            r0.J(r3)     // Catch: java.lang.Exception -> L4c
            goto L2b
        Lf:
            int r1 = r0.h0()     // Catch: java.lang.Exception -> L4c
            r2 = 7
            if (r1 != r2) goto L1a
            r0.J(r3)     // Catch: java.lang.Exception -> L4c
            goto L2e
        L1a:
            int r1 = r0.h0()     // Catch: java.lang.Exception -> L4c
            r2 = 2
            if (r1 != r2) goto L31
            int r5 = r0.E()     // Catch: java.lang.Exception -> L4c
            r0.J(r3)     // Catch: java.lang.Exception -> L4c
            r0 = 1
            if (r5 != r0) goto L2e
        L2b:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L4c
            goto L3d
        L2e:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L4c
            goto L3d
        L31:
            r0 = 0
            java.lang.Object r5 = r5.E(r0)     // Catch: java.lang.Exception -> L4c
            if (r5 != 0) goto L39
            return r0
        L39:
            java.lang.Boolean r5 = n4.n.g(r5)     // Catch: java.lang.Exception -> L4c
        L3d:
            java.lang.Class<java.util.concurrent.atomic.AtomicBoolean> r7 = java.util.concurrent.atomic.AtomicBoolean.class
            if (r6 != r7) goto L4b
            java.util.concurrent.atomic.AtomicBoolean r6 = new java.util.concurrent.atomic.AtomicBoolean
            boolean r5 = r5.booleanValue()
            r6.<init>(r5)
            return r6
        L4b:
            return r5
        L4c:
            r5 = move-exception
            e4.d r6 = new e4.d
            java.lang.String r0 = "parseBoolean error, field : "
            java.lang.String r7 = g4.g.a(r0, r7)
            r6.<init>(r7, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.n.d(h4.a, java.lang.reflect.Type, java.lang.Object):java.lang.Object");
    }

    @Override // j4.t0
    public final void e(i0 i0Var, Object obj, Object obj2, Type type, int i10) {
        d1 d1Var = i0Var.f17406j;
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            d1Var.X(e1.WriteNullBooleanAsFalse);
        } else {
            d1Var.write(bool.booleanValue() ? "true" : "false");
        }
    }
}
