package ii;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class v implements i2.f {

    /* renamed from: a */
    public final boolean f16992a;

    public v(boolean z10) {
        this.f16992a = z10;
    }

    public static final v fromBundle(Bundle bundle) {
        if (ih.c0.b(bundle, "bundle", v.class, "isAfterFillUser")) {
            return new v(bundle.getBoolean("isAfterFillUser"));
        }
        throw new IllegalArgumentException("Required argument \"isAfterFillUser\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && this.f16992a == ((v) obj).f16992a;
    }

    public final int hashCode() {
        boolean z10 = this.f16992a;
        if (z10) {
            return 1;
        }
        return z10 ? 1 : 0;
    }

    public final String toString() {
        return l2.o0.a(android.support.v4.media.d.a("ExerciseGoalFragmentArgs(isAfterFillUser="), this.f16992a, ')');
    }
}
