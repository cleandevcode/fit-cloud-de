package ii;

import android.os.Bundle;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class a implements i2.w {

    /* renamed from: a */
    public final boolean f16886a;

    public a(boolean z10) {
        this.f16886a = z10;
    }

    @Override // i2.w
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("showPrivacyPolicy", this.f16886a);
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
        return (obj instanceof a) && this.f16886a == ((a) obj).f16886a;
    }

    public final int hashCode() {
        boolean z10 = this.f16886a;
        if (z10) {
            return 1;
        }
        return z10 ? 1 : 0;
    }

    public final String toString() {
        return l2.o0.a(android.support.v4.media.d.a("ToPrivacyPolicy(showPrivacyPolicy="), this.f16886a, ')');
    }
}
