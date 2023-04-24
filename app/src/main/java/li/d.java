package li;

import android.os.Bundle;
import ih.c0;

/* loaded from: classes2.dex */
public final class d implements i2.f {

    /* renamed from: a */
    public final int f20035a;

    public d(int i10) {
        this.f20035a = i10;
    }

    public static final d fromBundle(Bundle bundle) {
        if (c0.b(bundle, "bundle", d.class, "mode")) {
            return new d(bundle.getInt("mode"));
        }
        throw new IllegalArgumentException("Required argument \"mode\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f20035a == ((d) obj).f20035a;
    }

    public final int hashCode() {
        return this.f20035a;
    }

    public final String toString() {
        return a1.b.a(android.support.v4.media.d.a("WhDetailFragmentArgs(mode="), this.f20035a, ')');
    }
}
