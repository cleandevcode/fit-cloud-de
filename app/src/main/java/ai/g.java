package ai;

import android.os.Bundle;
import com.topstep.fitcloudpro.R;
import i2.w;

/* loaded from: classes2.dex */
public final class g implements w {

    /* renamed from: a */
    public final int f562a;

    public g(int i10) {
        this.f562a = i10;
    }

    @Override // i2.w
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("type", this.f562a);
        return bundle;
    }

    @Override // i2.w
    public final int b() {
        return R.id.toDetail;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f562a == ((g) obj).f562a;
    }

    public final int hashCode() {
        return this.f562a;
    }

    public final String toString() {
        return a1.b.a(android.support.v4.media.d.a("ToDetail(type="), this.f562a, ')');
    }
}
