package ei;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class p implements u6.o {

    /* renamed from: a */
    public final u6.a<tl.l> f13775a;

    /* renamed from: b */
    public final u6.a<yf.a> f13776b;

    public p() {
        this(null, null, 3, null);
    }

    public p(u6.a<tl.l> aVar, u6.a<yf.a> aVar2) {
        gm.l.f(aVar, "asyncRemove");
        gm.l.f(aVar2, "asyncRequestTotal");
        this.f13775a = aVar;
        this.f13776b = aVar2;
    }

    public /* synthetic */ p(u6.a aVar, u6.a aVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? u6.b0.f28527c : aVar, (i10 & 2) != 0 ? u6.b0.f28527c : aVar2);
    }

    public static p copy$default(p pVar, u6.a aVar, u6.a aVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = pVar.f13775a;
        }
        if ((i10 & 2) != 0) {
            aVar2 = pVar.f13776b;
        }
        pVar.getClass();
        gm.l.f(aVar, "asyncRemove");
        gm.l.f(aVar2, "asyncRequestTotal");
        return new p(aVar, aVar2);
    }

    public final u6.a<tl.l> component1() {
        return this.f13775a;
    }

    public final u6.a<yf.a> component2() {
        return this.f13776b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            return gm.l.a(this.f13775a, pVar.f13775a) && gm.l.a(this.f13776b, pVar.f13776b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13776b.hashCode() + (this.f13775a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("FriendDataViewState(asyncRemove=");
        a10.append(this.f13775a);
        a10.append(", asyncRequestTotal=");
        a10.append(this.f13776b);
        a10.append(')');
        return a10.toString();
    }
}
