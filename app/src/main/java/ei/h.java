package ei;

import android.os.Bundle;
import android.os.Parcelable;
import com.topstep.fitcloud.pro.model.friend.Friend;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class h implements i2.f {

    /* renamed from: a */
    public final Friend f13742a;

    public h(Friend friend) {
        this.f13742a = friend;
    }

    public static final h fromBundle(Bundle bundle) {
        if (ih.c0.b(bundle, "bundle", h.class, "friend")) {
            if (!Parcelable.class.isAssignableFrom(Friend.class) && !Serializable.class.isAssignableFrom(Friend.class)) {
                throw new UnsupportedOperationException(androidx.fragment.app.h1.a(Friend.class, new StringBuilder(), " must implement Parcelable or Serializable or must be an Enum."));
            }
            Friend friend = (Friend) bundle.get("friend");
            if (friend != null) {
                return new h(friend);
            }
            throw new IllegalArgumentException("Argument \"friend\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"friend\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && gm.l.a(this.f13742a, ((h) obj).f13742a);
    }

    public final int hashCode() {
        return this.f13742a.hashCode();
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("FriendDataFragmentArgs(friend=");
        a10.append(this.f13742a);
        a10.append(')');
        return a10.toString();
    }
}
