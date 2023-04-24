package ei;

import com.topstep.fitcloud.pro.model.friend.FriendMsg;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class i0 implements u6.o {

    /* renamed from: a */
    public final u6.a<List<FriendMsg>> f13751a;

    /* renamed from: b */
    public final u6.a<Boolean> f13752b;

    public i0() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i0(u6.a<? extends List<FriendMsg>> aVar, u6.a<Boolean> aVar2) {
        gm.l.f(aVar, "asyncMsgs");
        gm.l.f(aVar2, "asyncProcess");
        this.f13751a = aVar;
        this.f13752b = aVar2;
    }

    public /* synthetic */ i0(u6.a aVar, u6.a aVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? u6.b0.f28527c : aVar, (i10 & 2) != 0 ? u6.b0.f28527c : aVar2);
    }

    public static i0 copy$default(i0 i0Var, u6.a aVar, u6.a aVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = i0Var.f13751a;
        }
        if ((i10 & 2) != 0) {
            aVar2 = i0Var.f13752b;
        }
        i0Var.getClass();
        gm.l.f(aVar, "asyncMsgs");
        gm.l.f(aVar2, "asyncProcess");
        return new i0(aVar, aVar2);
    }

    public final u6.a<List<FriendMsg>> component1() {
        return this.f13751a;
    }

    public final u6.a<Boolean> component2() {
        return this.f13752b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i0) {
            i0 i0Var = (i0) obj;
            return gm.l.a(this.f13751a, i0Var.f13751a) && gm.l.a(this.f13752b, i0Var.f13752b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13752b.hashCode() + (this.f13751a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("FriendMsgViewState(asyncMsgs=");
        a10.append(this.f13751a);
        a10.append(", asyncProcess=");
        a10.append(this.f13752b);
        a10.append(')');
        return a10.toString();
    }
}
