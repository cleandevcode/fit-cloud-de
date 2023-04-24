package z7;

import t7.j;
import t7.k;

/* loaded from: classes.dex */
public abstract class c extends d {

    /* renamed from: f */
    public a f32024f;

    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a */
        public int f32025a;

        /* renamed from: b */
        public int f32026b;

        /* renamed from: c */
        public int f32027c;

        public a() {
            c.this = r1;
        }

        public final void a(w7.d dVar, x7.e eVar) {
            c.this.f32029b.getClass();
            float max = Math.max(0.0f, Math.min(1.0f, 1.0f));
            float lowestVisibleX = ((r7.a) dVar).getLowestVisibleX();
            float highestVisibleX = ((r7.a) dVar).getHighestVisibleX();
            T A = eVar.A(lowestVisibleX, Float.NaN, j.a.DOWN);
            T A2 = eVar.A(highestVisibleX, Float.NaN, j.a.UP);
            this.f32025a = A == 0 ? 0 : eVar.l(A);
            int l10 = A2 != 0 ? eVar.l(A2) : 0;
            this.f32026b = l10;
            this.f32027c = (int) ((l10 - this.f32025a) * max);
        }
    }

    public c(p7.a aVar, a8.g gVar) {
        super(aVar, gVar);
        this.f32024f = new a();
    }

    public static boolean l(x7.b bVar) {
        return bVar.isVisible() && (bVar.R() || bVar.j());
    }

    public final boolean k(k kVar, x7.b bVar) {
        if (kVar == null) {
            return false;
        }
        this.f32029b.getClass();
        return ((float) bVar.l(kVar)) < ((float) bVar.Y()) * 1.0f;
    }
}
