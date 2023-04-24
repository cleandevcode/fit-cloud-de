package im;

import android.support.v4.media.d;
import gm.l;
import mm.h;

/* loaded from: classes2.dex */
public final class a<T> {

    /* renamed from: a */
    public T f17203a;

    public final T a(Object obj, h<?> hVar) {
        l.f(hVar, "property");
        T t10 = this.f17203a;
        if (t10 != null) {
            return t10;
        }
        StringBuilder a10 = d.a("Property ");
        a10.append(hVar.getName());
        a10.append(" should be initialized before get.");
        throw new IllegalStateException(a10.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(h hVar, Object obj) {
        l.f(hVar, "property");
        l.f(obj, "value");
        this.f17203a = obj;
    }
}
