package ei;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class a<T> implements u6.o {

    /* renamed from: a */
    public final u6.a<T> f13683a;

    public a() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(u6.a<? extends T> aVar) {
        gm.l.f(aVar, "async");
        this.f13683a = aVar;
    }

    public /* synthetic */ a(u6.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? u6.b0.f28527c : aVar);
    }

    public static a a(u6.a aVar) {
        gm.l.f(aVar, "async");
        return new a(aVar);
    }

    public static /* synthetic */ a copy$default(a aVar, u6.a aVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar2 = aVar.f13683a;
        }
        aVar.getClass();
        return a(aVar2);
    }

    public final u6.a<T> component1() {
        return this.f13683a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && gm.l.a(this.f13683a, ((a) obj).f13683a);
    }

    public final int hashCode() {
        return this.f13683a.hashCode();
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("AsyncState(async=");
        a10.append(this.f13683a);
        a10.append(')');
        return a10.toString();
    }
}
