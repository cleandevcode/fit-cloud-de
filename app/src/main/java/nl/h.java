package nl;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes2.dex */
public final class h<T> implements e<T> {

    /* renamed from: i */
    public static final int f22460i = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: j */
    public static final Object f22461j = new Object();

    /* renamed from: a */
    public final AtomicLong f22462a;

    /* renamed from: b */
    public int f22463b;

    /* renamed from: c */
    public long f22464c;

    /* renamed from: d */
    public final int f22465d;

    /* renamed from: e */
    public AtomicReferenceArray<Object> f22466e;

    /* renamed from: f */
    public final int f22467f;

    /* renamed from: g */
    public AtomicReferenceArray<Object> f22468g;

    /* renamed from: h */
    public final AtomicLong f22469h;

    public h(int i10) {
        AtomicLong atomicLong = new AtomicLong();
        this.f22462a = atomicLong;
        this.f22469h = new AtomicLong();
        int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i10) - 1));
        int i11 = numberOfLeadingZeros - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(numberOfLeadingZeros + 1);
        this.f22466e = atomicReferenceArray;
        this.f22465d = i11;
        this.f22463b = Math.min(numberOfLeadingZeros / 4, f22460i);
        this.f22468g = atomicReferenceArray;
        this.f22467f = i11;
        this.f22464c = i11 - 1;
        atomicLong.lazySet(0L);
    }

    public final void a(AtomicReferenceArray atomicReferenceArray, Object obj, long j10, int i10) {
        atomicReferenceArray.lazySet(i10, obj);
        this.f22462a.lazySet(j10 + 1);
    }

    @Override // nl.f
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // nl.f
    public final boolean isEmpty() {
        if (this.f22462a.get() == this.f22469h.get()) {
            return true;
        }
        return false;
    }

    @Override // nl.f
    public final boolean offer(T t10) {
        if (t10 != null) {
            AtomicReferenceArray<Object> atomicReferenceArray = this.f22466e;
            long j10 = this.f22462a.get();
            int i10 = this.f22465d;
            int i11 = i10 & ((int) j10);
            if (j10 >= this.f22464c) {
                long j11 = this.f22463b + j10;
                if (atomicReferenceArray.get(((int) j11) & i10) == null) {
                    this.f22464c = j11 - 1;
                } else {
                    long j12 = j10 + 1;
                    if (atomicReferenceArray.get(((int) j12) & i10) != null) {
                        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
                        this.f22466e = atomicReferenceArray2;
                        this.f22464c = (i10 + j10) - 1;
                        atomicReferenceArray2.lazySet(i11, t10);
                        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
                        atomicReferenceArray.lazySet(i11, f22461j);
                        this.f22462a.lazySet(j12);
                        return true;
                    }
                }
            }
            a(atomicReferenceArray, t10, j10, i11);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    @Override // nl.e, nl.f
    public final T poll() {
        boolean z10;
        AtomicReferenceArray<Object> atomicReferenceArray = this.f22468g;
        long j10 = this.f22469h.get();
        int i10 = this.f22467f;
        int i11 = ((int) j10) & i10;
        T t10 = (T) atomicReferenceArray.get(i11);
        if (t10 == f22461j) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (t10 != null && !z10) {
            atomicReferenceArray.lazySet(i11, null);
            this.f22469h.lazySet(j10 + 1);
            return t10;
        } else if (!z10) {
            return null;
        } else {
            int i12 = i10 + 1;
            AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i12);
            atomicReferenceArray.lazySet(i12, null);
            this.f22468g = atomicReferenceArray2;
            T t11 = (T) atomicReferenceArray2.get(i11);
            if (t11 != null) {
                atomicReferenceArray2.lazySet(i11, null);
                this.f22469h.lazySet(j10 + 1);
            }
            return t11;
        }
    }
}
