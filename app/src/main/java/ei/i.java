package ei;

import android.os.Bundle;
import android.os.Parcelable;
import com.topstep.fitcloud.pro.model.friend.Friend;
import com.topstep.fitcloudpro.R;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class i implements i2.w {

    /* renamed from: a */
    public final Friend f13749a;

    /* renamed from: b */
    public final int f13750b = R.id.toEcg;

    public i(Friend friend) {
        this.f13749a = friend;
    }

    @Override // i2.w
    public final Bundle a() {
        Bundle bundle = new Bundle();
        if (Parcelable.class.isAssignableFrom(Friend.class)) {
            Friend friend = this.f13749a;
            gm.l.d(friend, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("friend", friend);
        } else if (Serializable.class.isAssignableFrom(Friend.class)) {
            Friend friend2 = this.f13749a;
            gm.l.d(friend2, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("friend", (Serializable) friend2);
        } else {
            throw new UnsupportedOperationException(androidx.fragment.app.h1.a(Friend.class, new StringBuilder(), " must implement Parcelable or Serializable or must be an Enum."));
        }
        return bundle;
    }

    @Override // i2.w
    public final int b() {
        return this.f13750b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && gm.l.a(this.f13749a, ((i) obj).f13749a);
    }

    public final int hashCode() {
        return this.f13749a.hashCode();
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("ToEcg(friend=");
        a10.append(this.f13749a);
        a10.append(')');
        return a10.toString();
    }
}
