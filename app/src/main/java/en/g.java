package en;

import gm.l;
import java.util.List;
import zm.a0;
import zm.r;
import zm.w;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a */
    public int f13851a;

    /* renamed from: b */
    public final dn.e f13852b;

    /* renamed from: c */
    public final List<r> f13853c;

    /* renamed from: d */
    public final int f13854d;

    /* renamed from: e */
    public final dn.c f13855e;

    /* renamed from: f */
    public final w f13856f;

    /* renamed from: g */
    public final int f13857g;

    /* renamed from: h */
    public final int f13858h;

    /* renamed from: i */
    public final int f13859i;

    /* JADX WARN: Multi-variable type inference failed */
    public g(dn.e eVar, List<? extends r> list, int i10, dn.c cVar, w wVar, int i11, int i12, int i13) {
        l.f(eVar, "call");
        l.f(list, "interceptors");
        l.f(wVar, "request");
        this.f13852b = eVar;
        this.f13853c = list;
        this.f13854d = i10;
        this.f13855e = cVar;
        this.f13856f = wVar;
        this.f13857g = i11;
        this.f13858h = i12;
        this.f13859i = i13;
    }

    public static g b(g gVar, int i10, dn.c cVar, w wVar, int i11) {
        if ((i11 & 1) != 0) {
            i10 = gVar.f13854d;
        }
        int i12 = i10;
        if ((i11 & 2) != 0) {
            cVar = gVar.f13855e;
        }
        dn.c cVar2 = cVar;
        if ((i11 & 4) != 0) {
            wVar = gVar.f13856f;
        }
        w wVar2 = wVar;
        int i13 = (i11 & 8) != 0 ? gVar.f13857g : 0;
        int i14 = (i11 & 16) != 0 ? gVar.f13858h : 0;
        int i15 = (i11 & 32) != 0 ? gVar.f13859i : 0;
        gVar.getClass();
        l.f(wVar2, "request");
        return new g(gVar.f13852b, gVar.f13853c, i12, cVar2, wVar2, i13, i14, i15);
    }

    public final dn.h a() {
        dn.c cVar = this.f13855e;
        if (cVar != null) {
            return cVar.f13188b;
        }
        return null;
    }

    public final a0 c(w wVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        l.f(wVar, "request");
        boolean z13 = false;
        if (this.f13854d < this.f13853c.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f13851a++;
            dn.c cVar = this.f13855e;
            if (cVar != null) {
                if (cVar.f13191e.b(wVar.f32751b)) {
                    if (this.f13851a == 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        StringBuilder a10 = android.support.v4.media.d.a("network interceptor ");
                        a10.append(this.f13853c.get(this.f13854d - 1));
                        a10.append(" must call proceed() exactly once");
                        throw new IllegalStateException(a10.toString().toString());
                    }
                } else {
                    StringBuilder a11 = android.support.v4.media.d.a("network interceptor ");
                    a11.append(this.f13853c.get(this.f13854d - 1));
                    a11.append(" must retain the same host and port");
                    throw new IllegalStateException(a11.toString().toString());
                }
            }
            g b10 = b(this, this.f13854d + 1, null, wVar, 58);
            r rVar = this.f13853c.get(this.f13854d);
            a0 a12 = rVar.a(b10);
            if (a12 != null) {
                if (this.f13855e != null) {
                    if (this.f13854d + 1 < this.f13853c.size() && b10.f13851a != 1) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (!z11) {
                        throw new IllegalStateException(("network interceptor " + rVar + " must call proceed() exactly once").toString());
                    }
                }
                if (a12.f32535g != null) {
                    z13 = true;
                }
                if (z13) {
                    return a12;
                }
                throw new IllegalStateException(("interceptor " + rVar + " returned a response with no body").toString());
            }
            throw new NullPointerException("interceptor " + rVar + " returned null");
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
