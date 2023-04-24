package v7;

import java.util.ArrayList;
import s7.j;
import t7.j;
import t7.k;
import w7.b;

/* loaded from: classes.dex */
public class b<T extends w7.b> implements d {

    /* renamed from: a */
    public T f29154a;

    /* renamed from: b */
    public ArrayList f29155b = new ArrayList();

    public b(T t10) {
        this.f29154a = t10;
    }

    public static float f(ArrayList arrayList, float f10, j.a aVar) {
        float f11 = Float.MAX_VALUE;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            c cVar = (c) arrayList.get(i10);
            if (cVar.f29163h == aVar) {
                float abs = Math.abs(cVar.f29159d - f10);
                if (abs < f11) {
                    f11 = abs;
                }
            }
        }
        return f11;
    }

    @Override // v7.d
    public c a(float f10, float f11) {
        a8.b b10 = this.f29154a.c(j.a.LEFT).b(f10, f11);
        a8.b.c(b10);
        return e((float) b10.f367b, f10, f11);
    }

    public ArrayList b(x7.d dVar, int i10, float f10) {
        k A;
        j.a aVar = j.a.CLOSEST;
        ArrayList arrayList = new ArrayList();
        ArrayList<k> M = dVar.M(f10);
        if (M.size() == 0 && (A = dVar.A(f10, Float.NaN, aVar)) != null) {
            M = dVar.M(A.b());
        }
        if (M.size() == 0) {
            return arrayList;
        }
        for (k kVar : M) {
            a8.b a10 = this.f29154a.c(dVar.X()).a(kVar.b(), kVar.a());
            arrayList.add(new c(kVar.b(), kVar.a(), (float) a10.f367b, (float) a10.f368c, i10, dVar.X()));
        }
        return arrayList;
    }

    public t7.d c() {
        return this.f29154a.getData();
    }

    public float d(float f10, float f11, float f12, float f13) {
        return (float) Math.hypot(f10 - f12, f11 - f13);
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [x7.d] */
    public final c e(float f10, float f11, float f12) {
        this.f29155b.clear();
        t7.d c10 = c();
        if (c10 != null) {
            int d10 = c10.d();
            for (int i10 = 0; i10 < d10; i10++) {
                ?? c11 = c10.c(i10);
                if (c11.c0()) {
                    this.f29155b.addAll(b(c11, i10, f10));
                }
            }
        }
        ArrayList arrayList = this.f29155b;
        c cVar = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        j.a aVar = j.a.LEFT;
        float f13 = f(arrayList, f12, aVar);
        j.a aVar2 = j.a.RIGHT;
        if (f13 >= f(arrayList, f12, aVar2)) {
            aVar = aVar2;
        }
        float maxHighlightDistance = this.f29154a.getMaxHighlightDistance();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            c cVar2 = (c) arrayList.get(i11);
            if (cVar2.f29163h == aVar) {
                float d11 = d(f11, f12, cVar2.f29158c, cVar2.f29159d);
                if (d11 < maxHighlightDistance) {
                    cVar = cVar2;
                    maxHighlightDistance = d11;
                }
            }
        }
        return cVar;
    }
}
