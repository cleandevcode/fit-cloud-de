package uk;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class b implements c, d {

    /* renamed from: a */
    public kl.f<c> f28840a;

    /* renamed from: b */
    public volatile boolean f28841b;

    @Override // uk.d
    public final boolean a(c cVar) {
        if (d(cVar)) {
            cVar.c();
            return true;
        }
        return false;
    }

    @Override // uk.d
    public final boolean b(c cVar) {
        if (!this.f28841b) {
            synchronized (this) {
                if (!this.f28841b) {
                    kl.f<c> fVar = this.f28840a;
                    if (fVar == null) {
                        fVar = new kl.f<>();
                        this.f28840a = fVar;
                    }
                    fVar.a(cVar);
                    return true;
                }
            }
        }
        cVar.c();
        return false;
    }

    @Override // uk.c
    public final void c() {
        c[] cVarArr;
        if (this.f28841b) {
            return;
        }
        synchronized (this) {
            if (this.f28841b) {
                return;
            }
            this.f28841b = true;
            kl.f<c> fVar = this.f28840a;
            ArrayList arrayList = null;
            this.f28840a = null;
            if (fVar != null) {
                for (c cVar : fVar.f18628d) {
                    if (cVar instanceof c) {
                        try {
                            cVar.c();
                        } catch (Throwable th2) {
                            h7.a.y(th2);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(th2);
                        }
                    }
                }
                if (arrayList != null) {
                    if (arrayList.size() == 1) {
                        throw kl.d.d((Throwable) arrayList.get(0));
                    }
                    throw new vk.a(arrayList);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0049 A[Catch: all -> 0x004d, DONT_GENERATE, TryCatch #0 {, blocks: (B:42:0x000c, B:44:0x0010, B:46:0x0012, B:48:0x0016, B:62:0x0049, B:51:0x002d, B:59:0x0042, B:54:0x0034, B:57:0x003c, B:64:0x004b), top: B:69:0x000c }] */
    @Override // uk.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(uk.c r8) {
        /*
            r7 = this;
            java.lang.String r0 = "disposable is null"
            java.util.Objects.requireNonNull(r8, r0)
            boolean r0 = r7.f28841b
            r1 = 0
            if (r0 == 0) goto Lb
            return r1
        Lb:
            monitor-enter(r7)
            boolean r0 = r7.f28841b     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L12
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4d
            return r1
        L12:
            kl.f<uk.c> r0 = r7.f28840a     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L4b
            T[] r2 = r0.f18628d     // Catch: java.lang.Throwable -> L4d
            int r3 = r0.f18625a     // Catch: java.lang.Throwable -> L4d
            int r4 = r8.hashCode()     // Catch: java.lang.Throwable -> L4d
            r5 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            int r4 = r4 * r5
            int r5 = r4 >>> 16
            r4 = r4 ^ r5
            r4 = r4 & r3
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L4d
            r6 = 1
            if (r5 != 0) goto L2d
            goto L3a
        L2d:
            boolean r5 = r5.equals(r8)     // Catch: java.lang.Throwable -> L4d
            if (r5 == 0) goto L34
            goto L42
        L34:
            int r4 = r4 + r6
            r4 = r4 & r3
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L4d
            if (r5 != 0) goto L3c
        L3a:
            r8 = 0
            goto L46
        L3c:
            boolean r5 = r5.equals(r8)     // Catch: java.lang.Throwable -> L4d
            if (r5 == 0) goto L34
        L42:
            r0.b(r4, r3, r2)     // Catch: java.lang.Throwable -> L4d
            r8 = 1
        L46:
            if (r8 != 0) goto L49
            goto L4b
        L49:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4d
            return r6
        L4b:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4d
            return r1
        L4d:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4d
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: uk.b.d(uk.c):boolean");
    }
}
