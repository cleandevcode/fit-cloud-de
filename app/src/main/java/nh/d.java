package nh;

import gm.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y3.b0;
import y3.d1;

/* loaded from: classes2.dex */
public final class d<T> implements b0 {

    /* renamed from: a */
    public final y3.b<T> f22382a;

    public d() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(y3.b<? extends T> bVar) {
        l.f(bVar, "async");
        this.f22382a = bVar;
    }

    public /* synthetic */ d(y3.b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? d1.f30940b : bVar);
    }

    public static d a(y3.b bVar) {
        l.f(bVar, "async");
        return new d(bVar);
    }

    public static /* synthetic */ d copy$default(d dVar, y3.b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = dVar.f22382a;
        }
        dVar.getClass();
        return a(bVar);
    }

    public final y3.b<T> component1() {
        return this.f22382a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && l.a(this.f22382a, ((d) obj).f22382a);
    }

    public final int hashCode() {
        return this.f22382a.hashCode();
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("AsyncState(async=");
        a10.append(this.f22382a);
        a10.append(')');
        return a10.toString();
    }
}
