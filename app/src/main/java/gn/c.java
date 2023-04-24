package gn;

import ln.h;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: d */
    public static final ln.h f15517d;

    /* renamed from: e */
    public static final ln.h f15518e;

    /* renamed from: f */
    public static final ln.h f15519f;

    /* renamed from: g */
    public static final ln.h f15520g;

    /* renamed from: h */
    public static final ln.h f15521h;

    /* renamed from: i */
    public static final ln.h f15522i;

    /* renamed from: a */
    public final int f15523a;

    /* renamed from: b */
    public final ln.h f15524b;

    /* renamed from: c */
    public final ln.h f15525c;

    static {
        ln.h hVar = ln.h.f20100d;
        f15517d = h.a.b(":");
        f15518e = h.a.b(":status");
        f15519f = h.a.b(":method");
        f15520g = h.a.b(":path");
        f15521h = h.a.b(":scheme");
        f15522i = h.a.b(":authority");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(String str, String str2) {
        this(h.a.b(str), h.a.b(str2));
        gm.l.f(str, "name");
        gm.l.f(str2, "value");
        ln.h hVar = ln.h.f20100d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(ln.h hVar, String str) {
        this(hVar, h.a.b(str));
        gm.l.f(hVar, "name");
        gm.l.f(str, "value");
        ln.h hVar2 = ln.h.f20100d;
    }

    public c(ln.h hVar, ln.h hVar2) {
        gm.l.f(hVar, "name");
        gm.l.f(hVar2, "value");
        this.f15524b = hVar;
        this.f15525c = hVar2;
        this.f15523a = hVar2.d() + hVar.d() + 32;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                return gm.l.a(this.f15524b, cVar.f15524b) && gm.l.a(this.f15525c, cVar.f15525c);
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        ln.h hVar = this.f15524b;
        int hashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        ln.h hVar2 = this.f15525c;
        return hashCode + (hVar2 != null ? hVar2.hashCode() : 0);
    }

    public final String toString() {
        return this.f15524b.k() + ": " + this.f15525c.k();
    }
}
