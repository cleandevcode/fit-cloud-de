package hi;

import android.os.Bundle;
import com.topstep.fitcloudpro.R;
import i2.w;
import l2.o0;

/* loaded from: classes2.dex */
public final class b implements w {

    /* renamed from: a */
    public final boolean f16098a;

    public b(boolean z10) {
        this.f16098a = z10;
    }

    @Override // i2.w
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("showPrivacyPolicy", this.f16098a);
        return bundle;
    }

    @Override // i2.w
    public final int b() {
        return R.id.to_privacy_policy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f16098a == ((b) obj).f16098a;
    }

    public final int hashCode() {
        boolean z10 = this.f16098a;
        if (z10) {
            return 1;
        }
        return z10 ? 1 : 0;
    }

    public final String toString() {
        return o0.a(android.support.v4.media.d.a("ToPrivacyPolicy(showPrivacyPolicy="), this.f16098a, ')');
    }
}
