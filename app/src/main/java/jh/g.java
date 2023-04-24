package jh;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.h1;
import com.topstep.fitcloud.pro.model.auth.FillUserInfo;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class g implements i2.f {

    /* renamed from: a */
    public final FillUserInfo f17786a;

    public g(FillUserInfo fillUserInfo) {
        this.f17786a = fillUserInfo;
    }

    public static final g fromBundle(Bundle bundle) {
        if (ih.c0.b(bundle, "bundle", g.class, "parcelArgs")) {
            if (!Parcelable.class.isAssignableFrom(FillUserInfo.class) && !Serializable.class.isAssignableFrom(FillUserInfo.class)) {
                throw new UnsupportedOperationException(h1.a(FillUserInfo.class, new StringBuilder(), " must implement Parcelable or Serializable or must be an Enum."));
            }
            FillUserInfo fillUserInfo = (FillUserInfo) bundle.get("parcelArgs");
            if (fillUserInfo != null) {
                return new g(fillUserInfo);
            }
            throw new IllegalArgumentException("Argument \"parcelArgs\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"parcelArgs\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && gm.l.a(this.f17786a, ((g) obj).f17786a);
    }

    public final int hashCode() {
        return this.f17786a.hashCode();
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("FillUserFragmentArgs(parcelArgs=");
        a10.append(this.f17786a);
        a10.append(')');
        return a10.toString();
    }
}
