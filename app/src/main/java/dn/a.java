package dn;

import java.io.IOException;
import zm.a0;
import zm.r;
import zm.u;

/* loaded from: classes2.dex */
public final class a implements r {

    /* renamed from: a */
    public static final a f13182a = new a();

    @Override // zm.r
    public final a0 a(en.g gVar) {
        e eVar = gVar.f13852b;
        eVar.getClass();
        synchronized (eVar) {
            if (eVar.f13225l) {
                if (!eVar.f13224k) {
                    if (!eVar.f13223j) {
                        tl.l lVar = tl.l.f28297a;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        d dVar = eVar.f13219f;
        gm.l.c(dVar);
        u uVar = eVar.f13229p;
        gm.l.f(uVar, "client");
        try {
            c cVar = new c(eVar, eVar.f13215b, dVar, dVar.a(gVar.f13857g, gVar.f13858h, gVar.f13859i, uVar.f32702f, !gm.l.a(gVar.f13856f.f32752c, "GET")).j(uVar, gVar));
            eVar.f13222i = cVar;
            eVar.f13227n = cVar;
            synchronized (eVar) {
                eVar.f13223j = true;
                eVar.f13224k = true;
            }
            if (!eVar.f13226m) {
                return en.g.b(gVar, 0, cVar, null, 61).c(gVar.f13856f);
            }
            throw new IOException("Canceled");
        } catch (k e10) {
            dVar.c(e10.f13263a);
            throw e10;
        } catch (IOException e11) {
            dVar.c(e11);
            throw new k(e11);
        }
    }
}
