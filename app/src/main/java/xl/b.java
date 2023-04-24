package xl;

import fm.l;
import xl.f;
import xl.f.b;

/* loaded from: classes2.dex */
public abstract class b<B extends f.b, E extends B> implements f.c<E> {

    /* renamed from: a */
    public final l<f.b, E> f30621a;

    /* renamed from: b */
    public final f.c<?> f30622b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [fm.l<? super xl.f$b, ? extends E extends B>, fm.l<xl.f$b, E extends B>] */
    public b(f.c<B> cVar, l<? super f.b, ? extends E> lVar) {
        gm.l.f(cVar, "baseKey");
        this.f30621a = lVar;
        this.f30622b = cVar instanceof b ? (f.c<B>) ((b) cVar).f30622b : cVar;
    }
}
