package ei;

import android.os.Bundle;
import android.os.Parcelable;
import com.topstep.fitcloud.pro.model.config.UserInfo;
import com.topstep.fitcloudpro.R;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class p0 implements i2.w {

    /* renamed from: a */
    public final UserInfo f13777a;

    /* renamed from: b */
    public final int f13778b = R.id.toAdd;

    public p0(UserInfo userInfo) {
        this.f13777a = userInfo;
    }

    @Override // i2.w
    public final Bundle a() {
        Bundle bundle = new Bundle();
        if (Parcelable.class.isAssignableFrom(UserInfo.class)) {
            UserInfo userInfo = this.f13777a;
            gm.l.d(userInfo, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("user", userInfo);
        } else if (Serializable.class.isAssignableFrom(UserInfo.class)) {
            UserInfo userInfo2 = this.f13777a;
            gm.l.d(userInfo2, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("user", (Serializable) userInfo2);
        } else {
            throw new UnsupportedOperationException(androidx.fragment.app.h1.a(UserInfo.class, new StringBuilder(), " must implement Parcelable or Serializable or must be an Enum."));
        }
        return bundle;
    }

    @Override // i2.w
    public final int b() {
        return this.f13778b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0) && gm.l.a(this.f13777a, ((p0) obj).f13777a);
    }

    public final int hashCode() {
        return this.f13777a.hashCode();
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("ToAdd(user=");
        a10.append(this.f13777a);
        a10.append(')');
        return a10.toString();
    }
}
