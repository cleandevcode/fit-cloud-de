package bi;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class v0 implements i2.f {

    /* renamed from: a */
    public final int f4369a;

    public v0(int i10) {
        this.f4369a = i10;
    }

    public static final v0 fromBundle(Bundle bundle) {
        if (ih.c0.b(bundle, "bundle", v0.class, "type")) {
            return new v0(bundle.getInt("type"));
        }
        throw new IllegalArgumentException("Required argument \"type\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v0) && this.f4369a == ((v0) obj).f4369a;
    }

    public final int hashCode() {
        return this.f4369a;
    }

    public final String toString() {
        return a1.b.a(android.support.v4.media.d.a("QrCodeSettingsFragmentArgs(type="), this.f4369a, ')');
    }
}
