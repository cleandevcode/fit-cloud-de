package ci;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class d implements i2.f {

    /* renamed from: a */
    public final int f4748a;

    /* renamed from: b */
    public final int f4749b;

    public d(int i10, int i11) {
        this.f4748a = i10;
        this.f4749b = i11;
    }

    public static final d fromBundle(Bundle bundle) {
        if (ih.c0.b(bundle, "bundle", d.class, "formats")) {
            int i10 = bundle.getInt("formats");
            if (bundle.containsKey("remainingSize")) {
                return new d(i10, bundle.getInt("remainingSize"));
            }
            throw new IllegalArgumentException("Required argument \"remainingSize\" is missing and does not have an android:defaultValue");
        }
        throw new IllegalArgumentException("Required argument \"formats\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return this.f4748a == dVar.f4748a && this.f4749b == dVar.f4749b;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f4748a * 31) + this.f4749b;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("AudioSelectFragmentArgs(formats=");
        a10.append(this.f4748a);
        a10.append(", remainingSize=");
        return a1.b.a(a10, this.f4749b, ')');
    }
}
