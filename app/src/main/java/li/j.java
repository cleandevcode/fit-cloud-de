package li;

import android.os.Bundle;
import ih.c0;

/* loaded from: classes2.dex */
public final class j implements i2.f {

    /* renamed from: a */
    public final int f20039a;

    public j(int i10) {
        this.f20039a = i10;
    }

    public static final j fromBundle(Bundle bundle) {
        if (c0.b(bundle, "bundle", j.class, "mode")) {
            return new j(bundle.getInt("mode"));
        }
        throw new IllegalArgumentException("Required argument \"mode\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f20039a == ((j) obj).f20039a;
    }

    public final int hashCode() {
        return this.f20039a;
    }

    public final String toString() {
        return a1.b.a(android.support.v4.media.d.a("WhSettingsFragmentArgs(mode="), this.f20039a, ')');
    }
}
