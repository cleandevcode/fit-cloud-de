package ci;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class k0 implements u6.o {

    /* renamed from: a */
    public final u6.a<j0> f4783a;

    /* renamed from: b */
    public final u6.a<tl.l> f4784b;

    public k0() {
        this(null, null, 3, null);
    }

    public k0(u6.a<j0> aVar, u6.a<tl.l> aVar2) {
        gm.l.f(aVar, "asyncParams");
        gm.l.f(aVar2, "asyncDeleteSong");
        this.f4783a = aVar;
        this.f4784b = aVar2;
    }

    public /* synthetic */ k0(u6.a aVar, u6.a aVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? u6.b0.f28527c : aVar, (i10 & 2) != 0 ? u6.b0.f28527c : aVar2);
    }

    public static k0 copy$default(k0 k0Var, u6.a aVar, u6.a aVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = k0Var.f4783a;
        }
        if ((i10 & 2) != 0) {
            aVar2 = k0Var.f4784b;
        }
        k0Var.getClass();
        gm.l.f(aVar, "asyncParams");
        gm.l.f(aVar2, "asyncDeleteSong");
        return new k0(aVar, aVar2);
    }

    public final u6.a<j0> component1() {
        return this.f4783a;
    }

    public final u6.a<tl.l> component2() {
        return this.f4784b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k0) {
            k0 k0Var = (k0) obj;
            return gm.l.a(this.f4783a, k0Var.f4783a) && gm.l.a(this.f4784b, k0Var.f4784b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4784b.hashCode() + (this.f4783a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("SongPushState(asyncParams=");
        a10.append(this.f4783a);
        a10.append(", asyncDeleteSong=");
        a10.append(this.f4784b);
        a10.append(')');
        return a10.toString();
    }
}
