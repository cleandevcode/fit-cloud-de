package xh;

import android.os.Bundle;
import ih.c0;

/* loaded from: classes2.dex */
public final class b implements i2.f {

    /* renamed from: a */
    public final int f30548a;

    public b(int i10) {
        this.f30548a = i10;
    }

    public static final b fromBundle(Bundle bundle) {
        if (c0.b(bundle, "bundle", b.class, "position")) {
            return new b(bundle.getInt("position"));
        }
        throw new IllegalArgumentException("Required argument \"position\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f30548a == ((b) obj).f30548a;
    }

    public final int hashCode() {
        return this.f30548a;
    }

    public final String toString() {
        return a1.b.a(android.support.v4.media.d.a("DialComponentEditFragmentArgs(position="), this.f30548a, ')');
    }
}
