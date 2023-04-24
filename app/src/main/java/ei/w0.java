package ei;

import com.topstep.fitcloud.pro.model.config.UserInfo;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class w0 implements u6.o {

    /* renamed from: a */
    public final u6.a<List<UserInfo>> f13796a;

    /* renamed from: b */
    public final u6.a<g> f13797b;

    public w0() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w0(u6.a<? extends List<UserInfo>> aVar, u6.a<g> aVar2) {
        gm.l.f(aVar, "asyncSearch");
        gm.l.f(aVar2, "asyncCheck");
        this.f13796a = aVar;
        this.f13797b = aVar2;
    }

    public /* synthetic */ w0(u6.a aVar, u6.a aVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? u6.b0.f28527c : aVar, (i10 & 2) != 0 ? u6.b0.f28527c : aVar2);
    }

    public static w0 copy$default(w0 w0Var, u6.a aVar, u6.a aVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = w0Var.f13796a;
        }
        if ((i10 & 2) != 0) {
            aVar2 = w0Var.f13797b;
        }
        w0Var.getClass();
        gm.l.f(aVar, "asyncSearch");
        gm.l.f(aVar2, "asyncCheck");
        return new w0(aVar, aVar2);
    }

    public final u6.a<List<UserInfo>> component1() {
        return this.f13796a;
    }

    public final u6.a<g> component2() {
        return this.f13797b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w0) {
            w0 w0Var = (w0) obj;
            return gm.l.a(this.f13796a, w0Var.f13796a) && gm.l.a(this.f13797b, w0Var.f13797b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13797b.hashCode() + (this.f13796a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("FriendSearchViewState(asyncSearch=");
        a10.append(this.f13796a);
        a10.append(", asyncCheck=");
        a10.append(this.f13797b);
        a10.append(')');
        return a10.toString();
    }
}
