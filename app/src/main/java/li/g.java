package li;

import android.os.Bundle;
import com.topstep.fitcloudpro.R;
import i2.w;

/* loaded from: classes2.dex */
public final class g implements w {

    /* renamed from: a */
    public final int f20037a;

    public g(int i10) {
        this.f20037a = i10;
    }

    @Override // i2.w
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("mode", this.f20037a);
        return bundle;
    }

    @Override // i2.w
    public final int b() {
        return R.id.toWhSettings;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f20037a == ((g) obj).f20037a;
    }

    public final int hashCode() {
        return this.f20037a;
    }

    public final String toString() {
        return a1.b.a(android.support.v4.media.d.a("ToWhSettings(mode="), this.f20037a, ')');
    }
}
