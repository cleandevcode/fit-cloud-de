package t0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a */
    public q f27499a;

    /* renamed from: b */
    public ArrayList<q> f27500b = new ArrayList<>();

    public n(q qVar) {
        this.f27499a = null;
        this.f27499a = qVar;
    }

    public static long a(g gVar, long j10) {
        q qVar = gVar.f27487d;
        if (qVar instanceof l) {
            return j10;
        }
        int size = gVar.f27494k.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) gVar.f27494k.get(i10);
            if (dVar instanceof g) {
                g gVar2 = (g) dVar;
                if (gVar2.f27487d != qVar) {
                    j11 = Math.min(j11, a(gVar2, gVar2.f27489f + j10));
                }
            }
        }
        if (gVar == qVar.f27517i) {
            long j12 = j10 - qVar.j();
            return Math.min(Math.min(j11, a(qVar.f27516h, j12)), j12 - qVar.f27516h.f27489f);
        }
        return j11;
    }

    public static long b(g gVar, long j10) {
        q qVar = gVar.f27487d;
        if (qVar instanceof l) {
            return j10;
        }
        int size = gVar.f27494k.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) gVar.f27494k.get(i10);
            if (dVar instanceof g) {
                g gVar2 = (g) dVar;
                if (gVar2.f27487d != qVar) {
                    j11 = Math.max(j11, b(gVar2, gVar2.f27489f + j10));
                }
            }
        }
        if (gVar == qVar.f27516h) {
            long j12 = j10 + qVar.j();
            return Math.max(Math.max(j11, b(qVar.f27517i, j12)), j12 - qVar.f27517i.f27489f);
        }
        return j11;
    }
}
