package lm;

import java.util.NoSuchElementException;
import ul.x;

/* loaded from: classes2.dex */
public final class l extends x {

    /* renamed from: a */
    public final long f20082a;

    /* renamed from: b */
    public final long f20083b;

    /* renamed from: c */
    public boolean f20084c;

    /* renamed from: d */
    public long f20085d;

    public l(long j10, long j11, long j12) {
        this.f20082a = j12;
        this.f20083b = j11;
        boolean z10 = true;
        int i10 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
        int i11 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        if (i10 <= 0 ? i11 < 0 : i11 > 0) {
            z10 = false;
        }
        this.f20084c = z10;
        this.f20085d = z10 ? j10 : j11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20084c;
    }

    @Override // ul.x
    public final long nextLong() {
        long j10 = this.f20085d;
        if (j10 != this.f20083b) {
            this.f20085d = this.f20082a + j10;
        } else if (!this.f20084c) {
            throw new NoSuchElementException();
        } else {
            this.f20084c = false;
        }
        return j10;
    }
}
