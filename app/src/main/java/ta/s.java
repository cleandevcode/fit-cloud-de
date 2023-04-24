package ta;

import qa.x;
import qa.y;

/* loaded from: classes.dex */
public final class s implements y {

    /* renamed from: a */
    public final /* synthetic */ Class f27945a;

    /* renamed from: b */
    public final /* synthetic */ x f27946b;

    public s(Class cls, x xVar) {
        this.f27945a = cls;
        this.f27946b = xVar;
    }

    @Override // qa.y
    public final <T> x<T> a(qa.h hVar, xa.a<T> aVar) {
        if (aVar.f30456a == this.f27945a) {
            return this.f27946b;
        }
        return null;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("Factory[type=");
        a10.append(this.f27945a.getName());
        a10.append(",adapter=");
        a10.append(this.f27946b);
        a10.append("]");
        return a10.toString();
    }
}
