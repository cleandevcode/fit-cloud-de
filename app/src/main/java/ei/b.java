package ei;

import android.os.Bundle;
import android.os.Parcelable;
import com.topstep.fitcloud.pro.model.config.UserInfo;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class b implements i2.f {

    /* renamed from: a */
    public final UserInfo f13690a;

    public b(UserInfo userInfo) {
        this.f13690a = userInfo;
    }

    public static final b fromBundle(Bundle bundle) {
        if (ih.c0.b(bundle, "bundle", b.class, "user")) {
            if (!Parcelable.class.isAssignableFrom(UserInfo.class) && !Serializable.class.isAssignableFrom(UserInfo.class)) {
                throw new UnsupportedOperationException(androidx.fragment.app.h1.a(UserInfo.class, new StringBuilder(), " must implement Parcelable or Serializable or must be an Enum."));
            }
            UserInfo userInfo = (UserInfo) bundle.get("user");
            if (userInfo != null) {
                return new b(userInfo);
            }
            throw new IllegalArgumentException("Argument \"user\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"user\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && gm.l.a(this.f13690a, ((b) obj).f13690a);
    }

    public final int hashCode() {
        return this.f13690a.hashCode();
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("FriendAddFragmentArgs(user=");
        a10.append(this.f13690a);
        a10.append(')');
        return a10.toString();
    }
}
