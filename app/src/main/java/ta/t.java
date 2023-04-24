package ta;

import qa.x;
import qa.y;

/* loaded from: classes.dex */
public final class t implements y {

    /* renamed from: a */
    public final /* synthetic */ Class f27947a;

    /* renamed from: b */
    public final /* synthetic */ Class f27948b;

    /* renamed from: c */
    public final /* synthetic */ x f27949c;

    public t(Class cls, Class cls2, x xVar) {
        this.f27947a = cls;
        this.f27948b = cls2;
        this.f27949c = xVar;
    }

    @Override // qa.y
    public final <T> x<T> a(qa.h hVar, xa.a<T> aVar) {
        Class<? super T> cls = aVar.f30456a;
        if (cls != this.f27947a && cls != this.f27948b) {
            return null;
        }
        return this.f27949c;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("Factory[type=");
        a10.append(this.f27948b.getName());
        a10.append("+");
        a10.append(this.f27947a.getName());
        a10.append(",adapter=");
        a10.append(this.f27949c);
        a10.append("]");
        return a10.toString();
    }
}
