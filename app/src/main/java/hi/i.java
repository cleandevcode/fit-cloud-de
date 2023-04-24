package hi;

import android.os.Bundle;
import ih.c0;
import l2.o0;

/* loaded from: classes2.dex */
public final class i implements i2.f {

    /* renamed from: a */
    public final boolean f16116a;

    public i(boolean z10) {
        this.f16116a = z10;
    }

    public static final i fromBundle(Bundle bundle) {
        if (c0.b(bundle, "bundle", i.class, "showPrivacyPolicy")) {
            return new i(bundle.getBoolean("showPrivacyPolicy"));
        }
        throw new IllegalArgumentException("Required argument \"showPrivacyPolicy\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f16116a == ((i) obj).f16116a;
    }

    public final int hashCode() {
        boolean z10 = this.f16116a;
        if (z10) {
            return 1;
        }
        return z10 ? 1 : 0;
    }

    public final String toString() {
        return o0.a(android.support.v4.media.d.a("PrivacyPolicyFragmentArgs(showPrivacyPolicy="), this.f16116a, ')');
    }
}
