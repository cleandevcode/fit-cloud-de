package zl;

import gm.l;
import xl.e;
import xl.f;

/* loaded from: classes2.dex */
public abstract class c extends a {

    /* renamed from: b */
    public final xl.f f32509b;

    /* renamed from: c */
    public transient xl.d<Object> f32510c;

    public c(xl.d<Object> dVar) {
        this(dVar, dVar != null ? dVar.e() : null);
    }

    public c(xl.d<Object> dVar, xl.f fVar) {
        super(dVar);
        this.f32509b = fVar;
    }

    @Override // xl.d
    public xl.f e() {
        xl.f fVar = this.f32509b;
        l.c(fVar);
        return fVar;
    }

    @Override // zl.a
    public void u() {
        xl.d<?> dVar = this.f32510c;
        if (dVar != null && dVar != this) {
            xl.f e10 = e();
            int i10 = xl.e.f30629b0;
            f.b b10 = e10.b(e.a.f30630a);
            l.c(b10);
            ((xl.e) b10).L(dVar);
        }
        this.f32510c = b.f32508a;
    }
}
