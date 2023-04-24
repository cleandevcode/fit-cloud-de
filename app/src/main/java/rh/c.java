package rh;

import a0.a2;
import android.os.Bundle;

/* loaded from: classes2.dex */
public final class c implements i2.f {

    /* renamed from: a */
    public final String f25671a;

    public c(String str) {
        this.f25671a = str;
    }

    public static final c fromBundle(Bundle bundle) {
        if (ih.c0.b(bundle, "bundle", c.class, "ecgId")) {
            String string = bundle.getString("ecgId");
            if (string != null) {
                return new c(string);
            }
            throw new IllegalArgumentException("Argument \"ecgId\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"ecgId\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && gm.l.a(this.f25671a, ((c) obj).f25671a);
    }

    public final int hashCode() {
        return this.f25671a.hashCode();
    }

    public final String toString() {
        return a2.a(android.support.v4.media.d.a("EcgDetailFragmentArgs(ecgId="), this.f25671a, ')');
    }
}
