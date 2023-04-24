package androidx.lifecycle;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b */
    public boolean f2705b;

    /* renamed from: c */
    public boolean f2706c;

    /* renamed from: a */
    public boolean f2704a = true;

    /* renamed from: d */
    public final ArrayDeque f2707d = new ArrayDeque();

    /* JADX WARN: Removed duplicated region for block: B:53:0x0021 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:41:0x0007, B:42:0x0009, B:44:0x0012, B:46:0x0016, B:53:0x0021, B:55:0x002b), top: B:62:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0020 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r3 = this;
            boolean r0 = r3.f2706c
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1 = 0
            r3.f2706c = r0     // Catch: java.lang.Throwable -> L32
        L9:
            java.util.ArrayDeque r2 = r3.f2707d     // Catch: java.lang.Throwable -> L32
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L32
            r2 = r2 ^ r0
            if (r2 == 0) goto L2f
            boolean r2 = r3.f2705b     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto L1d
            boolean r2 = r3.f2704a     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto L1b
            goto L1d
        L1b:
            r2 = 0
            goto L1e
        L1d:
            r2 = 1
        L1e:
            if (r2 != 0) goto L21
            goto L2f
        L21:
            java.util.ArrayDeque r2 = r3.f2707d     // Catch: java.lang.Throwable -> L32
            java.lang.Object r2 = r2.poll()     // Catch: java.lang.Throwable -> L32
            java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L9
            r2.run()     // Catch: java.lang.Throwable -> L32
            goto L9
        L2f:
            r3.f2706c = r1
            return
        L32:
            r0 = move-exception
            r3.f2706c = r1
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.e.a():void");
    }
}
