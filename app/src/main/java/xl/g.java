package xl;

import fm.p;
import gm.l;
import java.io.Serializable;
import xl.f;

/* loaded from: classes2.dex */
public final class g implements f, Serializable {

    /* renamed from: a */
    public static final g f30632a = new g();

    private final Object readResolve() {
        return f30632a;
    }

    @Override // xl.f
    public final <R> R Z(R r10, p<? super R, ? super f.b, ? extends R> pVar) {
        return r10;
    }

    @Override // xl.f
    public final <E extends f.b> E b(f.c<E> cVar) {
        l.f(cVar, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // xl.f
    public final f s(f fVar) {
        l.f(fVar, "context");
        return fVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // xl.f
    public final f y(f.c<?> cVar) {
        l.f(cVar, "key");
        return this;
    }
}
