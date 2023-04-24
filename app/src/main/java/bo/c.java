package bo;

import ao.f;
import ln.g;
import ln.h;
import mf.b0;
import mf.t;
import mf.v;
import zm.c0;

/* loaded from: classes2.dex */
public final class c<T> implements f<c0, T> {

    /* renamed from: b */
    public static final h f4493b;

    /* renamed from: a */
    public final t<T> f4494a;

    static {
        h hVar = h.f20100d;
        f4493b = h.a.a("EFBBBF");
    }

    public c(t<T> tVar) {
        this.f4494a = tVar;
    }

    @Override // ao.f
    public final Object a(c0 c0Var) {
        c0 c0Var2 = c0Var;
        g h10 = c0Var2.h();
        try {
            h hVar = f4493b;
            if (h10.w(hVar)) {
                h10.skip(hVar.f20103c.length);
            }
            b0 b0Var = new b0(h10);
            T b10 = this.f4494a.b(b0Var);
            if (b0Var.F() == 10) {
                return b10;
            }
            throw new v("JSON document was not fully consumed.");
        } finally {
            c0Var2.close();
        }
    }
}
