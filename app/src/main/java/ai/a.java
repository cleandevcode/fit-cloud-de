package ai;

import android.os.Bundle;
import ih.c0;

/* loaded from: classes2.dex */
public final class a implements i2.f {

    /* renamed from: a */
    public final int f520a;

    public a(int i10) {
        this.f520a = i10;
    }

    public static final a fromBundle(Bundle bundle) {
        if (c0.b(bundle, "bundle", a.class, "type")) {
            return new a(bundle.getInt("type"));
        }
        throw new IllegalArgumentException("Required argument \"type\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f520a == ((a) obj).f520a;
    }

    public final int hashCode() {
        return this.f520a;
    }

    public final String toString() {
        return a1.b.a(android.support.v4.media.d.a("GameDetailFragmentArgs(type="), this.f520a, ')');
    }
}
