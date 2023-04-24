package ih;

import a0.a2;
import android.os.Bundle;
import cn.sharesdk.framework.InnerShareParams;

/* loaded from: classes2.dex */
public final class d0 implements i2.f {

    /* renamed from: a */
    public final int f16829a;

    /* renamed from: b */
    public final String f16830b;

    public d0(int i10, String str) {
        this.f16829a = i10;
        this.f16830b = str;
    }

    public static final d0 fromBundle(Bundle bundle) {
        if (c0.b(bundle, "bundle", d0.class, InnerShareParams.TITLE)) {
            int i10 = bundle.getInt(InnerShareParams.TITLE);
            if (bundle.containsKey(InnerShareParams.URL)) {
                String string = bundle.getString(InnerShareParams.URL);
                if (string != null) {
                    return new d0(i10, string);
                }
                throw new IllegalArgumentException("Argument \"url\" is marked as non-null but was passed a null value.");
            }
            throw new IllegalArgumentException("Required argument \"url\" is missing and does not have an android:defaultValue");
        }
        throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            return this.f16829a == d0Var.f16829a && gm.l.a(this.f16830b, d0Var.f16830b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16830b.hashCode() + (this.f16829a * 31);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("WebViewFragmentArgs(title=");
        a10.append(this.f16829a);
        a10.append(", url=");
        return a2.a(a10, this.f16830b, ')');
    }
}
