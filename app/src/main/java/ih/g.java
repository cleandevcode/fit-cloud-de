package ih;

import l2.o0;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a */
    public final boolean f16837a;

    public g() {
        this(false);
    }

    public g(boolean z10) {
        this.f16837a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f16837a == ((g) obj).f16837a;
    }

    public final int hashCode() {
        boolean z10 = this.f16837a;
        if (z10) {
            return 1;
        }
        return z10 ? 1 : 0;
    }

    public final String toString() {
        return o0.a(android.support.v4.media.d.a("DeviceViewState(promptProgress="), this.f16837a, ')');
    }
}
