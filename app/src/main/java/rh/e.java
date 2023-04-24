package rh;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class e implements i2.f {

    /* renamed from: a */
    public final String f25686a;

    /* renamed from: b */
    public final String f25687b;

    /* renamed from: c */
    public final long f25688c;

    public e(String str, long j10, String str2) {
        this.f25686a = str;
        this.f25687b = str2;
        this.f25688c = j10;
    }

    public static final e fromBundle(Bundle bundle) {
        if (ih.c0.b(bundle, "bundle", e.class, "ecgId")) {
            String string = bundle.getString("ecgId");
            if (string != null) {
                if (bundle.containsKey("reportUrl")) {
                    String string2 = bundle.getString("reportUrl");
                    if (bundle.containsKey("friendId")) {
                        return new e(string, bundle.getLong("friendId"), string2);
                    }
                    throw new IllegalArgumentException("Required argument \"friendId\" is missing and does not have an android:defaultValue");
                }
                throw new IllegalArgumentException("Required argument \"reportUrl\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Argument \"ecgId\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"ecgId\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return gm.l.a(this.f25686a, eVar.f25686a) && gm.l.a(this.f25687b, eVar.f25687b) && this.f25688c == eVar.f25688c;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f25686a.hashCode() * 31;
        String str = this.f25687b;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j10 = this.f25688c;
        return ((hashCode + hashCode2) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("EcgDetailReportFragmentArgs(ecgId=");
        a10.append(this.f25686a);
        a10.append(", reportUrl=");
        a10.append(this.f25687b);
        a10.append(", friendId=");
        return d4.b.a(a10, this.f25688c, ')');
    }
}
