package s0;

import java.util.ArrayList;
import t0.p;

/* loaded from: classes.dex */
public class i extends d implements h {

    /* renamed from: s0 */
    public d[] f26391s0 = new d[4];

    /* renamed from: t0 */
    public int f26392t0 = 0;

    public final void R(int i10, p pVar, ArrayList arrayList) {
        for (int i11 = 0; i11 < this.f26392t0; i11++) {
            pVar.a(this.f26391s0[i11]);
        }
        for (int i12 = 0; i12 < this.f26392t0; i12++) {
            t0.j.a(this.f26391s0[i12], i10, arrayList, pVar);
        }
    }

    @Override // s0.h
    public void a() {
    }
}
