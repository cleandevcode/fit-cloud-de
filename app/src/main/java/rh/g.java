package rh;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class g implements u6.o {

    /* renamed from: a */
    public final u6.a<String> f25691a;

    public g() {
        this(null, 1, null);
    }

    public g(u6.a<String> aVar) {
        gm.l.f(aVar, "asyncReport");
        this.f25691a = aVar;
    }

    public /* synthetic */ g(u6.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? u6.b0.f28527c : aVar);
    }

    public static g copy$default(g gVar, u6.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = gVar.f25691a;
        }
        gVar.getClass();
        gm.l.f(aVar, "asyncReport");
        return new g(aVar);
    }

    public final u6.a<String> component1() {
        return this.f25691a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && gm.l.a(this.f25691a, ((g) obj).f25691a);
    }

    public final int hashCode() {
        return this.f25691a.hashCode();
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("EcgDetailReportViewState(asyncReport=");
        a10.append(this.f25691a);
        a10.append(')');
        return a10.toString();
    }
}
