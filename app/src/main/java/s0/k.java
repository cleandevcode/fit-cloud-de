package s0;

import androidx.constraintlayout.widget.ConstraintLayout;
import t0.b;

/* loaded from: classes.dex */
public class k extends i {

    /* renamed from: u0 */
    public int f26394u0 = 0;

    /* renamed from: v0 */
    public int f26395v0 = 0;

    /* renamed from: w0 */
    public int f26396w0 = 0;

    /* renamed from: x0 */
    public int f26397x0 = 0;

    /* renamed from: y0 */
    public int f26398y0 = 0;

    /* renamed from: z0 */
    public int f26399z0 = 0;
    public boolean A0 = false;
    public int B0 = 0;
    public int C0 = 0;
    public b.a D0 = new b.a();
    public b.InterfaceC0491b E0 = null;

    public void S(int i10, int i11, int i12, int i13) {
    }

    public final void T(d dVar, int i10, int i11, int i12, int i13) {
        b.InterfaceC0491b interfaceC0491b;
        boolean z10;
        d dVar2;
        while (true) {
            interfaceC0491b = this.E0;
            if (interfaceC0491b != null || (dVar2 = this.W) == null) {
                break;
            }
            this.E0 = ((e) dVar2).f26359w0;
        }
        b.a aVar = this.D0;
        aVar.f27464a = i10;
        aVar.f27465b = i12;
        aVar.f27466c = i11;
        aVar.f27467d = i13;
        ((ConstraintLayout.b) interfaceC0491b).b(dVar, aVar);
        dVar.O(this.D0.f27468e);
        dVar.L(this.D0.f27469f);
        b.a aVar2 = this.D0;
        dVar.F = aVar2.f27471h;
        int i14 = aVar2.f27470g;
        dVar.f26319d0 = i14;
        if (i14 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        dVar.F = z10;
    }

    @Override // s0.i, s0.h
    public final void a() {
        for (int i10 = 0; i10 < this.f26392t0; i10++) {
            d dVar = this.f26391s0[i10];
            if (dVar != null) {
                dVar.H = true;
            }
        }
    }
}
