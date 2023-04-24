package uh;

import android.os.Bundle;
import l2.o0;

/* loaded from: classes2.dex */
public final class q implements i2.f {

    /* renamed from: a */
    public final boolean f28794a;

    public q(boolean z10) {
        this.f28794a = z10;
    }

    public static final q fromBundle(Bundle bundle) {
        if (ih.c0.b(bundle, "bundle", q.class, "isAfterFillUser")) {
            return new q(bundle.getBoolean("isAfterFillUser"));
        }
        throw new IllegalArgumentException("Required argument \"isAfterFillUser\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && this.f28794a == ((q) obj).f28794a;
    }

    public final int hashCode() {
        boolean z10 = this.f28794a;
        if (z10) {
            return 1;
        }
        return z10 ? 1 : 0;
    }

    public final String toString() {
        return o0.a(android.support.v4.media.d.a("DeviceSpecifyFragmentArgs(isAfterFillUser="), this.f28794a, ')');
    }
}
