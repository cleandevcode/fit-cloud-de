package ta;

import qa.x;
import qa.y;
import ta.r;

/* loaded from: classes.dex */
public final class u implements y {

    /* renamed from: a */
    public final /* synthetic */ Class f27950a;

    /* renamed from: b */
    public final /* synthetic */ Class f27951b;

    /* renamed from: c */
    public final /* synthetic */ x f27952c;

    public u(Class cls, Class cls2, r.C0497r c0497r) {
        this.f27950a = cls;
        this.f27951b = cls2;
        this.f27952c = c0497r;
    }

    @Override // qa.y
    public final <T> x<T> a(qa.h hVar, xa.a<T> aVar) {
        Class<? super T> cls = aVar.f30456a;
        if (cls != this.f27950a && cls != this.f27951b) {
            return null;
        }
        return this.f27952c;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("Factory[type=");
        a10.append(this.f27950a.getName());
        a10.append("+");
        a10.append(this.f27951b.getName());
        a10.append(",adapter=");
        a10.append(this.f27952c);
        a10.append("]");
        return a10.toString();
    }
}
