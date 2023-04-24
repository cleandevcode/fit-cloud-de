package en;

import gm.l;
import java.util.List;
import zm.a0;
import zm.c0;
import zm.p;
import zm.r;
import zm.s;
import zm.w;
import zm.z;

/* loaded from: classes2.dex */
public final class a implements r {

    /* renamed from: a */
    public final zm.j f13848a;

    public a(zm.j jVar) {
        l.f(jVar, "cookieJar");
        this.f13848a = jVar;
    }

    @Override // zm.r
    public final a0 a(g gVar) {
        boolean z10;
        c0 c0Var;
        w wVar = gVar.f13856f;
        wVar.getClass();
        w.a aVar = new w.a(wVar);
        z zVar = wVar.f32754e;
        if (zVar != null) {
            s b10 = zVar.b();
            if (b10 != null) {
                aVar.b("Content-Type", b10.f32678a);
            }
            long a10 = zVar.a();
            if (a10 != -1) {
                aVar.b("Content-Length", String.valueOf(a10));
                aVar.f32758c.d("Transfer-Encoding");
            } else {
                aVar.b("Transfer-Encoding", "chunked");
                aVar.f32758c.d("Content-Length");
            }
        }
        int i10 = 0;
        if (wVar.f32753d.e("Host") == null) {
            aVar.b("Host", an.c.s(wVar.f32751b, false));
        }
        if (wVar.f32753d.e("Connection") == null) {
            aVar.b("Connection", "Keep-Alive");
        }
        if (wVar.f32753d.e("Accept-Encoding") == null && wVar.f32753d.e("Range") == null) {
            aVar.b("Accept-Encoding", "gzip");
            z10 = true;
        } else {
            z10 = false;
        }
        List<zm.i> a11 = this.f13848a.a(wVar.f32751b);
        if (true ^ a11.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            for (Object obj : a11) {
                int i11 = i10 + 1;
                if (i10 >= 0) {
                    zm.i iVar = (zm.i) obj;
                    if (i10 > 0) {
                        sb2.append("; ");
                    }
                    sb2.append(iVar.f32623a);
                    sb2.append('=');
                    sb2.append(iVar.f32624b);
                    i10 = i11;
                } else {
                    h7.a.z();
                    throw null;
                }
            }
            String sb3 = sb2.toString();
            l.e(sb3, "StringBuilder().apply(builderAction).toString()");
            aVar.b("Cookie", sb3);
        }
        if (wVar.f32753d.e("User-Agent") == null) {
            aVar.b("User-Agent", "okhttp/4.9.1");
        }
        a0 c10 = gVar.c(aVar.a());
        e.b(this.f13848a, wVar.f32751b, c10.f32534f);
        a0.a aVar2 = new a0.a(c10);
        aVar2.f32542a = wVar;
        if (z10 && om.h.V("gzip", a0.a(c10, "Content-Encoding")) && e.a(c10) && (c0Var = c10.f32535g) != null) {
            ln.l lVar = new ln.l(c0Var.h());
            p.a i12 = c10.f32534f.i();
            i12.d("Content-Encoding");
            i12.d("Content-Length");
            aVar2.f32547f = i12.c().i();
            aVar2.f32548g = new h(a0.a(c10, "Content-Type"), -1L, new ln.s(lVar));
        }
        return aVar2.a();
    }
}
