package qa;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class f extends x<AtomicLong> {

    /* renamed from: a */
    public final /* synthetic */ x f24649a;

    public f(x xVar) {
        this.f24649a = xVar;
    }

    @Override // qa.x
    public final AtomicLong a(ya.a aVar) {
        return new AtomicLong(((Number) this.f24649a.a(aVar)).longValue());
    }

    @Override // qa.x
    public final void b(ya.b bVar, AtomicLong atomicLong) {
        this.f24649a.b(bVar, Long.valueOf(atomicLong.get()));
    }
}
