package lm;

import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public final class m extends k implements g<Long> {
    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            if (!isEmpty() || !((m) obj).isEmpty()) {
                m mVar = (m) obj;
                if (this.f20079a != mVar.f20079a || this.f20080b != mVar.f20080b) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // lm.g
    public final Long f() {
        return Long.valueOf(this.f20079a);
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j10 = this.f20079a;
        long j11 = 31 * (j10 ^ (j10 >>> 32));
        long j12 = this.f20080b;
        return (int) (j11 + (j12 ^ (j12 >>> 32)));
    }

    @Override // lm.g
    public final Long i() {
        return Long.valueOf(this.f20080b);
    }

    public final boolean isEmpty() {
        if (this.f20079a > this.f20080b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.f20079a + ".." + this.f20080b;
    }
}
