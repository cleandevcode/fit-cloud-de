package on;

import tn.u;

/* loaded from: classes2.dex */
public class k implements pn.e {

    /* renamed from: a */
    public pn.a f23705a;

    /* renamed from: c */
    public e f23707c;

    /* renamed from: e */
    public pn.e f23709e;

    /* renamed from: b */
    public Object f23706b = new Object();

    /* renamed from: d */
    public Object f23708d = null;

    public k(e eVar, pn.a aVar) {
        this.f23707c = eVar;
        this.f23705a = aVar;
    }

    @Override // pn.e
    public final int a() {
        pn.e eVar = this.f23709e;
        if (eVar != null) {
            return eVar.a();
        }
        return 0;
    }

    @Override // pn.e
    public final pn.b b() {
        return this.f23707c;
    }

    @Override // pn.e
    public final u c() {
        return this.f23709e.c();
    }
}
