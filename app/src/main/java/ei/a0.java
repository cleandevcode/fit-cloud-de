package ei;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class a0 implements u6.o {

    /* renamed from: a */
    public final u6.a<tl.l> f13684a;

    public a0() {
        this(null, 1, null);
    }

    public a0(u6.a<tl.l> aVar) {
        gm.l.f(aVar, "asyncRemove");
        this.f13684a = aVar;
    }

    public /* synthetic */ a0(u6.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? u6.b0.f28527c : aVar);
    }

    public static a0 copy$default(a0 a0Var, u6.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = a0Var.f13684a;
        }
        a0Var.getClass();
        gm.l.f(aVar, "asyncRemove");
        return new a0(aVar);
    }

    public final u6.a<tl.l> component1() {
        return this.f13684a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && gm.l.a(this.f13684a, ((a0) obj).f13684a);
    }

    public final int hashCode() {
        return this.f13684a.hashCode();
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("FriendInfoViewState(asyncRemove=");
        a10.append(this.f13684a);
        a10.append(')');
        return a10.toString();
    }
}
