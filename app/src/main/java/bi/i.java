package bi;

import android.os.Bundle;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class i implements i2.w {

    /* renamed from: a */
    public final int f4315a;

    public i(int i10) {
        this.f4315a = i10;
    }

    @Override // i2.w
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("type", this.f4315a);
        return bundle;
    }

    @Override // i2.w
    public final int b() {
        return R.id.toQrCodeSettings;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f4315a == ((i) obj).f4315a;
    }

    public final int hashCode() {
        return this.f4315a;
    }

    public final String toString() {
        return a1.b.a(android.support.v4.media.d.a("ToQrCodeSettings(type="), this.f4315a, ')');
    }
}
