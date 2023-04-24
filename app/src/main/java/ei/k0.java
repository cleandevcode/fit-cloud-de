package ei;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class k0 implements i2.f {

    /* renamed from: a */
    public final long f13760a;

    public k0(long j10) {
        this.f13760a = j10;
    }

    public static final k0 fromBundle(Bundle bundle) {
        if (ih.c0.b(bundle, "bundle", k0.class, "friendId")) {
            return new k0(bundle.getLong("friendId"));
        }
        throw new IllegalArgumentException("Required argument \"friendId\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && this.f13760a == ((k0) obj).f13760a;
    }

    public final int hashCode() {
        long j10 = this.f13760a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        return d4.b.a(android.support.v4.media.d.a("FriendRenameFragmentArgs(friendId="), this.f13760a, ')');
    }
}
