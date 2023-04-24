package of;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class b0 implements wk.d<Throwable> {

    /* renamed from: a */
    public final Set<Class<? extends Throwable>> f23089a;

    public b0(HashSet hashSet) {
        this.f23089a = hashSet;
    }

    public final boolean a(Throwable th2) {
        Class<?> cls = th2.getClass();
        for (Class<? extends Throwable> cls2 : this.f23089a) {
            if (cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0040, code lost:
        if (r3 == r0.f29433a.size()) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0047, code lost:
        if (a(r0) != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x004d  */
    @Override // wk.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void accept(java.lang.Throwable r6) {
        /*
            r5 = this;
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            java.lang.String r0 = "t"
            gm.l.f(r6, r0)
            boolean r0 = r6 instanceof vk.d
            if (r0 == 0) goto L10
            java.lang.Throwable r0 = r6.getCause()
            goto L11
        L10:
            r0 = r6
        L11:
            r1 = 0
            if (r0 != 0) goto L15
            goto L49
        L15:
            boolean r2 = r0 instanceof vk.a
            if (r2 == 0) goto L43
            vk.a r0 = (vk.a) r0
            java.util.List<java.lang.Throwable> r2 = r0.f29433a
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L22:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r2.next()
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 != 0) goto L33
            int r3 = r3 + 1
            goto L22
        L33:
            boolean r4 = r5.a(r4)
            if (r4 == 0) goto L22
            goto L49
        L3a:
            java.util.List<java.lang.Throwable> r0 = r0.f29433a
            int r0 = r0.size()
            if (r3 != r0) goto L4a
            goto L49
        L43:
            boolean r0 = r5.a(r0)
            if (r0 == 0) goto L4a
        L49:
            r1 = 1
        L4a:
            if (r1 == 0) goto L4d
            return
        L4d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: of.b0.accept(java.lang.Object):void");
    }
}
