package ii;

import eh.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y3.d1;

/* loaded from: classes2.dex */
public final class i implements y3.b0 {

    /* renamed from: a */
    public final y3.b<j.a> f16938a;

    /* renamed from: b */
    public final y3.b<tl.l> f16939b;

    public i() {
        this(null, null, 3, null);
    }

    public i(y3.b<j.a> bVar, y3.b<tl.l> bVar2) {
        gm.l.f(bVar, "platformAuth");
        gm.l.f(bVar2, "accountDelete");
        this.f16938a = bVar;
        this.f16939b = bVar2;
    }

    public /* synthetic */ i(y3.b bVar, y3.b bVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? d1.f30940b : bVar, (i10 & 2) != 0 ? d1.f30940b : bVar2);
    }

    public static i copy$default(i iVar, y3.b bVar, y3.b bVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = iVar.f16938a;
        }
        if ((i10 & 2) != 0) {
            bVar2 = iVar.f16939b;
        }
        iVar.getClass();
        gm.l.f(bVar, "platformAuth");
        gm.l.f(bVar2, "accountDelete");
        return new i(bVar, bVar2);
    }

    public final y3.b<j.a> component1() {
        return this.f16938a;
    }

    public final y3.b<tl.l> component2() {
        return this.f16939b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return gm.l.a(this.f16938a, iVar.f16938a) && gm.l.a(this.f16939b, iVar.f16939b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16939b.hashCode() + (this.f16938a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("AccountDeleteState(platformAuth=");
        a10.append(this.f16938a);
        a10.append(", accountDelete=");
        a10.append(this.f16939b);
        a10.append(')');
        return a10.toString();
    }
}
