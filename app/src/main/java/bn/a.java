package bn;

import dn.e;
import en.g;
import gm.l;
import om.h;
import zm.a0;
import zm.c;
import zm.c0;
import zm.m;
import zm.p;
import zm.r;
import zm.v;
import zm.w;

/* loaded from: classes2.dex */
public final class a implements r {

    /* renamed from: a */
    public static final C0062a f4484a = new C0062a();

    /* renamed from: bn.a$a */
    /* loaded from: classes2.dex */
    public static final class C0062a {
        public static final a0 a(C0062a c0062a, a0 a0Var) {
            c0 c0Var;
            c0062a.getClass();
            if (a0Var != null) {
                c0Var = a0Var.f32535g;
            } else {
                c0Var = null;
            }
            if (c0Var != null) {
                a0Var.getClass();
                a0.a aVar = new a0.a(a0Var);
                aVar.f32548g = null;
                return aVar.a();
            }
            return a0Var;
        }

        public static boolean b(String str) {
            return (h.V("Connection", str) || h.V("Keep-Alive", str) || h.V("Proxy-Authenticate", str) || h.V("Proxy-Authorization", str) || h.V("TE", str) || h.V("Trailers", str) || h.V("Transfer-Encoding", str) || h.V("Upgrade", str)) ? false : true;
        }
    }

    @Override // zm.r
    public final a0 a(g gVar) {
        e eVar;
        Object obj;
        boolean z10;
        p pVar;
        boolean z11;
        e eVar2 = gVar.f13852b;
        System.currentTimeMillis();
        w wVar = gVar.f13856f;
        l.f(wVar, "request");
        b bVar = new b(wVar, null);
        c cVar = wVar.f32750a;
        if (cVar == null) {
            c.b bVar2 = c.f32559n;
            p pVar2 = wVar.f32753d;
            bVar2.getClass();
            cVar = c.b.a(pVar2);
            wVar.f32750a = cVar;
        }
        if (cVar.f32569j) {
            bVar = new b(null, null);
        }
        w wVar2 = bVar.f4485a;
        a0 a0Var = bVar.f4486b;
        if (!(eVar2 instanceof e)) {
            eVar = null;
        } else {
            eVar = eVar2;
        }
        if (eVar == null || (obj = eVar.f13215b) == null) {
            obj = m.f32638a;
        }
        if (wVar2 == null && a0Var == null) {
            a0.a aVar = new a0.a();
            w wVar3 = gVar.f13856f;
            l.f(wVar3, "request");
            aVar.f32542a = wVar3;
            aVar.f32543b = v.HTTP_1_1;
            aVar.f32544c = 504;
            aVar.f32545d = "Unsatisfiable Request (only-if-cached)";
            aVar.f32548g = an.c.f637c;
            aVar.f32552k = -1L;
            aVar.f32553l = System.currentTimeMillis();
            a0 a10 = aVar.a();
            obj.getClass();
            l.f(eVar2, "call");
            return a10;
        } else if (wVar2 == null) {
            l.c(a0Var);
            a0.a aVar2 = new a0.a(a0Var);
            a0 a11 = C0062a.a(f4484a, a0Var);
            a0.a.b("cacheResponse", a11);
            aVar2.f32550i = a11;
            a0 a12 = aVar2.a();
            obj.getClass();
            l.f(eVar2, "call");
            return a12;
        } else {
            if (a0Var != null) {
                obj.getClass();
                l.f(eVar2, "call");
            }
            a0 c10 = gVar.c(wVar2);
            if (a0Var != null) {
                if (c10.f32532d == 304) {
                    a0.a aVar3 = new a0.a(a0Var);
                    C0062a c0062a = f4484a;
                    p pVar3 = a0Var.f32534f;
                    p pVar4 = c10.f32534f;
                    c0062a.getClass();
                    p.a aVar4 = new p.a();
                    int length = pVar3.f32653a.length / 2;
                    int i10 = 0;
                    while (i10 < length) {
                        String f10 = pVar3.f(i10);
                        String j10 = pVar3.j(i10);
                        if (h.V("Warning", f10)) {
                            pVar = pVar3;
                            if (h.a0(j10, "1", false)) {
                                i10++;
                                pVar3 = pVar;
                            }
                        } else {
                            pVar = pVar3;
                        }
                        if (!h.V("Content-Length", f10) && !h.V("Content-Encoding", f10) && !h.V("Content-Type", f10)) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (z11 || !C0062a.b(f10) || pVar4.e(f10) == null) {
                            aVar4.b(f10, j10);
                        }
                        i10++;
                        pVar3 = pVar;
                    }
                    int length2 = pVar4.f32653a.length / 2;
                    for (int i11 = 0; i11 < length2; i11++) {
                        String f11 = pVar4.f(i11);
                        if (!h.V("Content-Length", f11) && !h.V("Content-Encoding", f11) && !h.V("Content-Type", f11)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (!z10 && C0062a.b(f11)) {
                            aVar4.b(f11, pVar4.j(i11));
                        }
                    }
                    aVar3.f32547f = aVar4.c().i();
                    aVar3.f32552k = c10.f32539k;
                    aVar3.f32553l = c10.f32540l;
                    C0062a c0062a2 = f4484a;
                    a0 a13 = C0062a.a(c0062a2, a0Var);
                    a0.a.b("cacheResponse", a13);
                    aVar3.f32550i = a13;
                    a0 a14 = C0062a.a(c0062a2, c10);
                    a0.a.b("networkResponse", a14);
                    aVar3.f32549h = a14;
                    aVar3.a();
                    c0 c0Var = c10.f32535g;
                    l.c(c0Var);
                    c0Var.close();
                    l.c(null);
                    throw null;
                }
                c0 c0Var2 = a0Var.f32535g;
                if (c0Var2 != null) {
                    an.c.b(c0Var2);
                }
            }
            a0.a aVar5 = new a0.a(c10);
            C0062a c0062a3 = f4484a;
            a0 a15 = C0062a.a(c0062a3, a0Var);
            a0.a.b("cacheResponse", a15);
            aVar5.f32550i = a15;
            a0 a16 = C0062a.a(c0062a3, c10);
            a0.a.b("networkResponse", a16);
            aVar5.f32549h = a16;
            return aVar5.a();
        }
    }
}
