package ei;

import android.os.Bundle;
import android.os.Parcelable;
import com.topstep.fitcloud.pro.model.friend.Friend;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class w implements i2.f {

    /* renamed from: a */
    public final Friend f13795a;

    public w(Friend friend) {
        this.f13795a = friend;
    }

    public static final w fromBundle(Bundle bundle) {
        if (ih.c0.b(bundle, "bundle", w.class, "friend")) {
            if (!Parcelable.class.isAssignableFrom(Friend.class) && !Serializable.class.isAssignableFrom(Friend.class)) {
                throw new UnsupportedOperationException(androidx.fragment.app.h1.a(Friend.class, new StringBuilder(), " must implement Parcelable or Serializable or must be an Enum."));
            }
            Friend friend = (Friend) bundle.get("friend");
            if (friend != null) {
                return new w(friend);
            }
            throw new IllegalArgumentException("Argument \"friend\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"friend\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && gm.l.a(this.f13795a, ((w) obj).f13795a);
    }

    public final int hashCode() {
        return this.f13795a.hashCode();
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("FriendInfoFragmentArgs(friend=");
        a10.append(this.f13795a);
        a10.append(')');
        return a10.toString();
    }
}
