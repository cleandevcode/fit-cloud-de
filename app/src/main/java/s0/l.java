package s0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class l extends d {

    /* renamed from: s0 */
    public ArrayList<d> f26400s0 = new ArrayList<>();

    @Override // s0.d
    public void D() {
        this.f26400s0.clear();
        super.D();
    }

    @Override // s0.d
    public final void G(p.g gVar) {
        super.G(gVar);
        int size = this.f26400s0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f26400s0.get(i10).G(gVar);
        }
    }

    public void R() {
        ArrayList<d> arrayList = this.f26400s0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = this.f26400s0.get(i10);
            if (dVar instanceof l) {
                ((l) dVar).R();
            }
        }
    }
}
