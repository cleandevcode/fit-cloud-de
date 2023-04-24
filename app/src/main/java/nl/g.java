package nl;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes2.dex */
public final class g<E> extends AtomicReferenceArray<E> implements e<E> {

    /* renamed from: f */
    public static final Integer f22454f = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* renamed from: a */
    public final int f22455a;

    /* renamed from: b */
    public final AtomicLong f22456b;

    /* renamed from: c */
    public long f22457c;

    /* renamed from: d */
    public final AtomicLong f22458d;

    /* renamed from: e */
    public final int f22459e;

    public g(int i10) {
        super(1 << (32 - Integer.numberOfLeadingZeros(i10 - 1)));
        this.f22455a = length() - 1;
        this.f22456b = new AtomicLong();
        this.f22458d = new AtomicLong();
        this.f22459e = Math.min(i10 / 4, f22454f.intValue());
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
        return this.f22456b.get() == this.f22458d.get();
    }

    @Override // nl.f
    public final boolean offer(E e10) {
        if (e10 != null) {
            int i10 = this.f22455a;
            long j10 = this.f22456b.get();
            int i11 = ((int) j10) & i10;
            if (j10 >= this.f22457c) {
                long j11 = this.f22459e + j10;
                if (get(i10 & ((int) j11)) == null) {
                    this.f22457c = j11;
                } else if (get(i11) != null) {
                    return false;
                }
            }
            lazySet(i11, e10);
            this.f22456b.lazySet(j10 + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    @Override // nl.e, nl.f
    public final E poll() {
        long j10 = this.f22458d.get();
        int i10 = ((int) j10) & this.f22455a;
        E e10 = get(i10);
        if (e10 == null) {
            return null;
        }
        this.f22458d.lazySet(j10 + 1);
        lazySet(i10, null);
        return e10;
    }
}
