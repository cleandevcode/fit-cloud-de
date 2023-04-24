package xk;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class b implements uk.c {

    /* renamed from: a */
    public static final b f30613a;

    /* renamed from: b */
    public static final /* synthetic */ b[] f30614b;

    static {
        b bVar = new b();
        f30613a = bVar;
        f30614b = new b[]{bVar};
    }

    public static boolean a(AtomicReference<uk.c> atomicReference) {
        uk.c andSet;
        uk.c cVar = atomicReference.get();
        b bVar = f30613a;
        if (cVar == bVar || (andSet = atomicReference.getAndSet(bVar)) == bVar) {
            return false;
        }
        if (andSet != null) {
            andSet.c();
            return true;
        }
        return true;
    }

    public static boolean d(uk.c cVar) {
        return cVar == f30613a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0020, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean e(java.util.concurrent.atomic.AtomicReference<uk.c> r4, uk.c r5) {
        /*
        L0:
            java.lang.Object r0 = r4.get()
            uk.c r0 = (uk.c) r0
            xk.b r1 = xk.b.f30613a
            r2 = 0
            if (r0 != r1) goto L11
            if (r5 == 0) goto L10
            r5.c()
        L10:
            return r2
        L11:
            boolean r1 = r4.compareAndSet(r0, r5)
            r3 = 1
            if (r1 == 0) goto L1a
            r2 = 1
            goto L20
        L1a:
            java.lang.Object r1 = r4.get()
            if (r1 == r0) goto L11
        L20:
            if (r2 == 0) goto L0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: xk.b.e(java.util.concurrent.atomic.AtomicReference, uk.c):boolean");
    }

    public static void f() {
        ol.a.a(new vk.c("Disposable already set!"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0020, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean g(java.util.concurrent.atomic.AtomicReference<uk.c> r4, uk.c r5) {
        /*
        L0:
            java.lang.Object r0 = r4.get()
            uk.c r0 = (uk.c) r0
            xk.b r1 = xk.b.f30613a
            r2 = 0
            if (r0 != r1) goto L11
            if (r5 == 0) goto L10
            r5.c()
        L10:
            return r2
        L11:
            boolean r1 = r4.compareAndSet(r0, r5)
            r3 = 1
            if (r1 == 0) goto L1a
            r2 = 1
            goto L20
        L1a:
            java.lang.Object r1 = r4.get()
            if (r1 == r0) goto L11
        L20:
            if (r2 == 0) goto L0
            if (r0 == 0) goto L27
            r0.c()
        L27:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: xk.b.g(java.util.concurrent.atomic.AtomicReference, uk.c):boolean");
    }

    public static boolean h(AtomicReference<uk.c> atomicReference, uk.c cVar) {
        boolean z10;
        Objects.requireNonNull(cVar, "d is null");
        while (true) {
            if (!atomicReference.compareAndSet(null, cVar)) {
                if (atomicReference.get() != null) {
                    z10 = false;
                    break;
                }
            } else {
                z10 = true;
                break;
            }
        }
        if (z10) {
            return true;
        }
        cVar.c();
        if (atomicReference.get() != f30613a) {
            f();
        }
        return false;
    }

    public static boolean i(uk.c cVar, uk.c cVar2) {
        if (cVar2 == null) {
            ol.a.a(new NullPointerException("next is null"));
            return false;
        } else if (cVar != null) {
            cVar2.c();
            f();
            return false;
        } else {
            return true;
        }
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f30614b.clone();
    }

    @Override // uk.c
    public final void c() {
    }
}
