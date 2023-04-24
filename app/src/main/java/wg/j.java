package wg;

import gm.l;
import mf.e0;
import mf.t;
import mf.v;
import mf.y;
import p000do.a;

/* loaded from: classes2.dex */
public final class j extends t<String> {
    public j() {
        a.b bVar = p000do.a.f13275a;
        bVar.t("JsonAdapter");
        bVar.b("create new StringNotBlankJsonAdapter", new Object[0]);
    }

    @Override // mf.t
    public final String b(y yVar) {
        l.f(yVar, "reader");
        String E = yVar.E();
        if (E != null && !om.h.W(E)) {
            return E;
        }
        throw new v(a.b.b("Expected a NotBlank String but was ", E));
    }

    @Override // mf.t
    public final void f(e0 e0Var, String str) {
        l.f(e0Var, "writer");
        e0Var.I(str);
    }

    public final String toString() {
        return "NotBlankStringJsonAdapter";
    }
}
