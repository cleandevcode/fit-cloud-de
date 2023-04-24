package s0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import t0.p;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b */
    public int f26295b;

    /* renamed from: c */
    public boolean f26296c;

    /* renamed from: d */
    public final d f26297d;

    /* renamed from: e */
    public final a f26298e;

    /* renamed from: f */
    public c f26299f;

    /* renamed from: i */
    public q0.e f26302i;

    /* renamed from: a */
    public HashSet<c> f26294a = null;

    /* renamed from: g */
    public int f26300g = 0;

    /* renamed from: h */
    public int f26301h = Integer.MIN_VALUE;

    /* loaded from: classes.dex */
    public enum a {
        /* JADX INFO: Fake field, exist only in values array */
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public c(d dVar, a aVar) {
        this.f26297d = dVar;
        this.f26298e = aVar;
    }

    public final void a(c cVar, int i10) {
        b(cVar, i10, Integer.MIN_VALUE, false);
    }

    public final boolean b(c cVar, int i10, int i11, boolean z10) {
        if (cVar == null) {
            j();
            return true;
        } else if (z10 || i(cVar)) {
            this.f26299f = cVar;
            if (cVar.f26294a == null) {
                cVar.f26294a = new HashSet<>();
            }
            HashSet<c> hashSet = this.f26299f.f26294a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.f26300g = i10;
            this.f26301h = i11;
            return true;
        } else {
            return false;
        }
    }

    public final void c(int i10, p pVar, ArrayList arrayList) {
        HashSet<c> hashSet = this.f26294a;
        if (hashSet != null) {
            Iterator<c> it = hashSet.iterator();
            while (it.hasNext()) {
                t0.j.a(it.next().f26297d, i10, arrayList, pVar);
            }
        }
    }

    public final int d() {
        if (this.f26296c) {
            return this.f26295b;
        }
        return 0;
    }

    public final int e() {
        c cVar;
        if (this.f26297d.f26331j0 == 8) {
            return 0;
        }
        int i10 = this.f26301h;
        if (i10 != Integer.MIN_VALUE && (cVar = this.f26299f) != null && cVar.f26297d.f26331j0 == 8) {
            return i10;
        }
        return this.f26300g;
    }

    public final c f() {
        switch (this.f26298e.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return this.f26297d.M;
            case 2:
                return this.f26297d.N;
            case 3:
                return this.f26297d.K;
            case 4:
                return this.f26297d.L;
            default:
                throw new AssertionError(this.f26298e.name());
        }
    }

    public final boolean g() {
        HashSet<c> hashSet = this.f26294a;
        if (hashSet == null) {
            return false;
        }
        Iterator<c> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f26299f != null;
    }

    public final boolean i(c cVar) {
        boolean z10;
        boolean z11;
        a aVar = a.CENTER_Y;
        a aVar2 = a.RIGHT;
        a aVar3 = a.CENTER_X;
        a aVar4 = a.LEFT;
        a aVar5 = a.BASELINE;
        boolean z12 = false;
        if (cVar == null) {
            return false;
        }
        a aVar6 = cVar.f26298e;
        a aVar7 = this.f26298e;
        if (aVar6 != aVar7) {
            switch (aVar7.ordinal()) {
                case 0:
                case 7:
                case 8:
                    return false;
                case 1:
                case 3:
                    if (aVar6 != aVar4 && aVar6 != aVar2) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (cVar.f26297d instanceof g) {
                        return (z10 || aVar6 == aVar3) ? true : true;
                    }
                    return z10;
                case 2:
                case 4:
                    if (aVar6 != a.TOP && aVar6 != a.BOTTOM) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (cVar.f26297d instanceof g) {
                        return (z11 || aVar6 == aVar) ? true : true;
                    }
                    return z11;
                case 5:
                    if (aVar6 == aVar4 || aVar6 == aVar2) {
                        return false;
                    }
                    return true;
                case 6:
                    if (aVar6 == aVar5 || aVar6 == aVar3 || aVar6 == aVar) {
                        return false;
                    }
                    return true;
                default:
                    throw new AssertionError(this.f26298e.name());
            }
        } else if (aVar7 == aVar5 && (!cVar.f26297d.F || !this.f26297d.F)) {
            return false;
        } else {
            return true;
        }
    }

    public final void j() {
        HashSet<c> hashSet;
        c cVar = this.f26299f;
        if (cVar != null && (hashSet = cVar.f26294a) != null) {
            hashSet.remove(this);
            if (this.f26299f.f26294a.size() == 0) {
                this.f26299f.f26294a = null;
            }
        }
        this.f26294a = null;
        this.f26299f = null;
        this.f26300g = 0;
        this.f26301h = Integer.MIN_VALUE;
        this.f26296c = false;
        this.f26295b = 0;
    }

    public final void k() {
        q0.e eVar = this.f26302i;
        if (eVar == null) {
            this.f26302i = new q0.e(1);
        } else {
            eVar.d();
        }
    }

    public final void l(int i10) {
        this.f26295b = i10;
        this.f26296c = true;
    }

    public final String toString() {
        return this.f26297d.f26333k0 + ":" + this.f26298e.toString();
    }
}
