package en;

import androidx.appcompat.widget.e2;
import dn.c;
import gm.l;
import java.io.IOException;
import java.net.ProtocolException;
import ln.s;
import zm.a0;
import zm.c0;
import zm.m;
import zm.r;
import zm.w;
import zm.z;

/* loaded from: classes2.dex */
public final class b implements r {

    /* renamed from: a */
    public final boolean f13849a;

    public b(boolean z10) {
        this.f13849a = z10;
    }

    @Override // zm.r
    public final a0 a(g gVar) {
        a0.a aVar;
        a0.a aVar2;
        c0 hVar;
        long j10;
        boolean z10;
        dn.c cVar = gVar.f13855e;
        l.c(cVar);
        w wVar = gVar.f13856f;
        z zVar = wVar.f32754e;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            m mVar = cVar.f13190d;
            dn.e eVar = cVar.f13189c;
            mVar.getClass();
            l.f(eVar, "call");
            cVar.f13192f.d(wVar);
            m mVar2 = cVar.f13190d;
            dn.e eVar2 = cVar.f13189c;
            mVar2.getClass();
            l.f(eVar2, "call");
            Long l10 = null;
            boolean z11 = true;
            if (f.d(wVar.f32752c) && zVar != null) {
                if (om.h.V("100-continue", wVar.f32753d.e("Expect"))) {
                    try {
                        cVar.f13192f.f();
                        aVar = cVar.b(true);
                        m mVar3 = cVar.f13190d;
                        dn.e eVar3 = cVar.f13189c;
                        mVar3.getClass();
                        l.f(eVar3, "call");
                        z10 = false;
                    } catch (IOException e10) {
                        m mVar4 = cVar.f13190d;
                        dn.e eVar4 = cVar.f13189c;
                        mVar4.getClass();
                        l.f(eVar4, "call");
                        cVar.c(e10);
                        throw e10;
                    }
                } else {
                    z10 = true;
                    aVar = null;
                }
                if (aVar == null) {
                    cVar.f13187a = false;
                    z zVar2 = wVar.f32754e;
                    l.c(zVar2);
                    long a10 = zVar2.a();
                    m mVar5 = cVar.f13190d;
                    dn.e eVar5 = cVar.f13189c;
                    mVar5.getClass();
                    l.f(eVar5, "call");
                    ln.r rVar = new ln.r(new c.a(cVar, cVar.f13192f.g(wVar, a10), a10));
                    zVar.c(rVar);
                    rVar.close();
                } else {
                    cVar.f13189c.f(cVar, true, false, null);
                    if (cVar.f13188b.f13245f == null) {
                        z11 = false;
                    }
                    if (!z11) {
                        cVar.f13192f.getConnection().k();
                    }
                }
                z11 = z10;
            } else {
                cVar.f13189c.f(cVar, true, false, null);
                aVar = null;
            }
            try {
                cVar.f13192f.a();
                if (aVar == null) {
                    aVar = cVar.b(false);
                    l.c(aVar);
                    if (z11) {
                        m mVar6 = cVar.f13190d;
                        dn.e eVar6 = cVar.f13189c;
                        mVar6.getClass();
                        l.f(eVar6, "call");
                        z11 = false;
                    }
                }
                aVar.f32542a = wVar;
                aVar.f32546e = cVar.f13188b.f13243d;
                aVar.f32552k = currentTimeMillis;
                aVar.f32553l = System.currentTimeMillis();
                a0 a11 = aVar.a();
                int i10 = a11.f32532d;
                if (i10 == 100) {
                    a0.a b10 = cVar.b(false);
                    l.c(b10);
                    if (z11) {
                        m mVar7 = cVar.f13190d;
                        dn.e eVar7 = cVar.f13189c;
                        mVar7.getClass();
                        l.f(eVar7, "call");
                    }
                    b10.f32542a = wVar;
                    b10.f32546e = cVar.f13188b.f13243d;
                    b10.f32552k = currentTimeMillis;
                    b10.f32553l = System.currentTimeMillis();
                    a11 = b10.a();
                    i10 = a11.f32532d;
                }
                m mVar8 = cVar.f13190d;
                dn.e eVar8 = cVar.f13189c;
                mVar8.getClass();
                l.f(eVar8, "call");
                if (this.f13849a && i10 == 101) {
                    aVar2 = new a0.a(a11);
                    hVar = an.c.f637c;
                } else {
                    aVar2 = new a0.a(a11);
                    try {
                        String a12 = a0.a(a11, "Content-Type");
                        long b11 = cVar.f13192f.b(a11);
                        hVar = new h(a12, b11, new s(new c.b(cVar, cVar.f13192f.e(a11), b11)));
                    } catch (IOException e11) {
                        m mVar9 = cVar.f13190d;
                        dn.e eVar9 = cVar.f13189c;
                        mVar9.getClass();
                        l.f(eVar9, "call");
                        cVar.c(e11);
                        throw e11;
                    }
                }
                aVar2.f32548g = hVar;
                a0 a13 = aVar2.a();
                if (om.h.V("close", a13.f32529a.f32753d.e("Connection")) || om.h.V("close", a0.a(a13, "Connection"))) {
                    cVar.f13192f.getConnection().k();
                }
                if (i10 == 204 || i10 == 205) {
                    c0 c0Var = a13.f32535g;
                    if (c0Var != null) {
                        j10 = c0Var.a();
                    } else {
                        j10 = -1;
                    }
                    if (j10 > 0) {
                        StringBuilder a14 = e2.a("HTTP ", i10, " had non-zero Content-Length: ");
                        c0 c0Var2 = a13.f32535g;
                        if (c0Var2 != null) {
                            l10 = Long.valueOf(c0Var2.a());
                        }
                        a14.append(l10);
                        throw new ProtocolException(a14.toString());
                    }
                }
                return a13;
            } catch (IOException e12) {
                m mVar10 = cVar.f13190d;
                dn.e eVar10 = cVar.f13189c;
                mVar10.getClass();
                l.f(eVar10, "call");
                cVar.c(e12);
                throw e12;
            }
        } catch (IOException e13) {
            m mVar11 = cVar.f13190d;
            dn.e eVar11 = cVar.f13189c;
            mVar11.getClass();
            l.f(eVar11, "call");
            cVar.c(e13);
            throw e13;
        }
    }
}
