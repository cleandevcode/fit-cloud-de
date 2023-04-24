package ei;

import com.topstep.fitcloud.pro.model.friend.Friend;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class z0 implements u6.o {

    /* renamed from: a */
    public final u6.a<List<Friend>> f13816a;

    public z0() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z0(u6.a<? extends List<Friend>> aVar) {
        gm.l.f(aVar, "asyncFriends");
        this.f13816a = aVar;
    }

    public /* synthetic */ z0(u6.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? u6.b0.f28527c : aVar);
    }

    public static z0 copy$default(z0 z0Var, u6.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = z0Var.f13816a;
        }
        z0Var.getClass();
        gm.l.f(aVar, "asyncFriends");
        return new z0(aVar);
    }

    public final u6.a<List<Friend>> component1() {
        return this.f13816a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z0) && gm.l.a(this.f13816a, ((z0) obj).f13816a);
    }

    public final int hashCode() {
        return this.f13816a.hashCode();
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("FriendViewState(asyncFriends=");
        a10.append(this.f13816a);
        a10.append(')');
        return a10.toString();
    }
}
