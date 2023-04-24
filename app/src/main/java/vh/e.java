package vh;

import java.util.ArrayList;
import y3.d1;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a */
    public final y3.b<ArrayList<rj.c>> f29395a;

    public e() {
        this(0);
    }

    public /* synthetic */ e(int i10) {
        this(d1.f30940b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(y3.b<? extends ArrayList<rj.c>> bVar) {
        gm.l.f(bVar, "requestContacts");
        this.f29395a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && gm.l.a(this.f29395a, ((e) obj).f29395a);
    }

    public final int hashCode() {
        return this.f29395a.hashCode();
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("ContactsState(requestContacts=");
        a10.append(this.f29395a);
        a10.append(')');
        return a10.toString();
    }
}
