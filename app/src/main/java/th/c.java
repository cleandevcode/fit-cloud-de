package th;

import android.os.Bundle;
import ih.c0;

/* loaded from: classes2.dex */
public final class c implements i2.f {

    /* renamed from: a */
    public final int f28179a;

    public c(int i10) {
        this.f28179a = i10;
    }

    public static final c fromBundle(Bundle bundle) {
        if (c0.b(bundle, "bundle", c.class, "position")) {
            return new c(bundle.getInt("position"));
        }
        throw new IllegalArgumentException("Required argument \"position\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f28179a == ((c) obj).f28179a;
    }

    public final int hashCode() {
        return this.f28179a;
    }

    public final String toString() {
        return a1.b.a(android.support.v4.media.d.a("AlarmDetailFragmentArgs(position="), this.f28179a, ')');
    }
}
