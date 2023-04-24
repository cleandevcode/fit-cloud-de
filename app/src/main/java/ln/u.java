package ln;

import java.util.concurrent.atomic.AtomicReference;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a */
    public static final t f20138a = new t(0, 0, false, new byte[0]);

    /* renamed from: b */
    public static final int f20139b;

    /* renamed from: c */
    public static final AtomicReference<t>[] f20140c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f20139b = highestOneBit;
        AtomicReference<t>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i10 = 0; i10 < highestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference<>();
        }
        f20140c = atomicReferenceArr;
    }

    public static final void a(t tVar) {
        boolean z10;
        int i10;
        boolean z11 = true;
        if (tVar.f20136f == null && tVar.f20137g == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (tVar.f20134d) {
                return;
            }
            Thread currentThread = Thread.currentThread();
            gm.l.e(currentThread, "Thread.currentThread()");
            AtomicReference<t> atomicReference = f20140c[(int) (currentThread.getId() & (f20139b - 1))];
            t tVar2 = atomicReference.get();
            if (tVar2 == f20138a) {
                return;
            }
            if (tVar2 != null) {
                i10 = tVar2.f20133c;
            } else {
                i10 = 0;
            }
            if (i10 >= 65536) {
                return;
            }
            tVar.f20136f = tVar2;
            tVar.f20132b = 0;
            tVar.f20133c = i10 + DfuBaseService.ERROR_REMOTE_MASK;
            while (true) {
                if (!atomicReference.compareAndSet(tVar2, tVar)) {
                    if (atomicReference.get() != tVar2) {
                        z11 = false;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!z11) {
                tVar.f20136f = null;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final t b() {
        Thread currentThread = Thread.currentThread();
        gm.l.e(currentThread, "Thread.currentThread()");
        AtomicReference<t> atomicReference = f20140c[(int) (currentThread.getId() & (f20139b - 1))];
        t tVar = f20138a;
        t andSet = atomicReference.getAndSet(tVar);
        if (andSet == tVar) {
            return new t();
        }
        if (andSet == null) {
            atomicReference.set(null);
            return new t();
        }
        atomicReference.set(andSet.f20136f);
        andSet.f20136f = null;
        andSet.f20133c = 0;
        return andSet;
    }
}
