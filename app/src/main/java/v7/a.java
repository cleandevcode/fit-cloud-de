package v7;

import s7.j;

/* loaded from: classes.dex */
public class a extends b<w7.a> {
    public a(w7.a aVar) {
        super(aVar);
    }

    @Override // v7.b, v7.d
    public c a(float f10, float f11) {
        c a10 = super.a(f10, f11);
        if (a10 == null) {
            return null;
        }
        a8.b b10 = this.f29154a.c(j.a.LEFT).b(f10, f11);
        x7.a aVar = (x7.a) ((w7.a) this.f29154a).getBarData().c(a10.f29161f);
        if (aVar.Q()) {
            return g(a10, aVar, (float) b10.f367b, (float) b10.f368c);
        }
        a8.b.c(b10);
        return a10;
    }

    @Override // v7.b
    public final t7.d c() {
        return ((w7.a) this.f29154a).getBarData();
    }

    @Override // v7.b
    public float d(float f10, float f11, float f12, float f13) {
        return Math.abs(f10 - f12);
    }

    public final c g(c cVar, x7.a aVar, float f10, float f11) {
        int i10;
        t7.c cVar2 = (t7.c) aVar.h(f10, f11);
        if (cVar2 == null) {
            return null;
        }
        if (cVar2.f27802d == null) {
            return cVar;
        }
        e[] eVarArr = cVar2.f27803e;
        if (eVarArr.length <= 0) {
            return null;
        }
        int i11 = 0;
        if (eVarArr.length != 0) {
            int length = eVarArr.length;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                boolean z10 = true;
                if (i12 < length) {
                    e eVar = eVarArr[i12];
                    if ((f11 <= eVar.f29166a || f11 > eVar.f29167b) ? false : false) {
                        i10 = i13;
                        break;
                    }
                    i13++;
                    i12++;
                } else {
                    int max = Math.max(eVarArr.length - 1, 0);
                    if (f11 > eVarArr[max].f29167b) {
                        i11 = max;
                    }
                }
            }
            a8.b a10 = ((w7.a) this.f29154a).c(aVar.X()).a(cVar.f29156a, eVarArr[i10].f29167b);
            c cVar3 = new c(cVar2.f27841c, cVar2.f27821a, (float) a10.f367b, (float) a10.f368c, cVar.f29161f, i10, cVar.f29163h);
            a8.b.c(a10);
            return cVar3;
        }
        i10 = i11;
        a8.b a102 = ((w7.a) this.f29154a).c(aVar.X()).a(cVar.f29156a, eVarArr[i10].f29167b);
        c cVar32 = new c(cVar2.f27841c, cVar2.f27821a, (float) a102.f367b, (float) a102.f368c, cVar.f29161f, i10, cVar.f29163h);
        a8.b.c(a102);
        return cVar32;
    }
}
