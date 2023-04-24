package fn;

import ln.g;
import om.l;
import zm.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a */
    public long f14776a = 262144;

    /* renamed from: b */
    public final g f14777b;

    public a(g gVar) {
        this.f14777b = gVar;
    }

    public final p a() {
        boolean z10;
        p.a aVar = new p.a();
        while (true) {
            String G = this.f14777b.G(this.f14776a);
            this.f14776a -= G.length();
            if (G.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return aVar.c();
            }
            int g02 = l.g0(G, ':', 1, false, 4);
            if (g02 != -1) {
                String substring = G.substring(0, g02);
                gm.l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String substring2 = G.substring(g02 + 1);
                gm.l.e(substring2, "(this as java.lang.String).substring(startIndex)");
                aVar.b(substring, substring2);
            } else {
                if (G.charAt(0) == ':') {
                    G = G.substring(1);
                    gm.l.e(G, "(this as java.lang.String).substring(startIndex)");
                }
                aVar.b("", G);
            }
        }
    }
}
