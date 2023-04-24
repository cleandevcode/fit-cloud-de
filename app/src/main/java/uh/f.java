package uh;

import a0.a2;
import android.os.Bundle;

/* loaded from: classes2.dex */
public final class f implements i2.f {

    /* renamed from: a */
    public final boolean f28750a;

    /* renamed from: b */
    public final String f28751b;

    public f(String str, boolean z10) {
        this.f28750a = z10;
        this.f28751b = str;
    }

    public static final f fromBundle(Bundle bundle) {
        if (ih.c0.b(bundle, "bundle", f.class, "isAfterFillUser")) {
            boolean z10 = bundle.getBoolean("isAfterFillUser");
            if (bundle.containsKey("nameSpecify")) {
                return new f(bundle.getString("nameSpecify"), z10);
            }
            throw new IllegalArgumentException("Required argument \"nameSpecify\" is missing and does not have an android:defaultValue");
        }
        throw new IllegalArgumentException("Required argument \"isAfterFillUser\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return this.f28750a == fVar.f28750a && gm.l.a(this.f28751b, fVar.f28751b);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        boolean z10 = this.f28750a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        String str = this.f28751b;
        return i10 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("DeviceBindFragmentArgs(isAfterFillUser=");
        a10.append(this.f28750a);
        a10.append(", nameSpecify=");
        return a2.a(a10, this.f28751b, ')');
    }
}
