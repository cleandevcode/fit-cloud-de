package rc;

import com.polidea.rxandroidble3.internal.RxBleLog;
import tc.j0;
import tc.l0;

/* loaded from: classes.dex */
public final class h0 implements d0 {

    /* renamed from: a */
    public final l0 f25485a;

    /* renamed from: b */
    public final h f25486b;

    /* renamed from: c */
    public final y f25487c;

    /* renamed from: d */
    public final d f25488d;

    public h0(l0 l0Var, h hVar, y yVar, d dVar) {
        this.f25485a = l0Var;
        this.f25486b = hVar;
        this.f25487c = yVar;
        this.f25488d = dVar;
    }

    @Override // rc.d0
    public final d6.b0 a(uc.f fVar, uc.c... cVarArr) {
        boolean z10;
        uc.f fVar2;
        boolean z11 = true;
        boolean z12 = true;
        for (uc.c cVar : cVarArr) {
            z12 &= cVar.equals(uc.c.f28655m);
        }
        boolean z13 = !z12;
        if (fVar.f28675b != 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        tk.m<q, q> mVar = j0.f27986a;
        if ((!z10 || z13) ? false : false) {
            RxBleLog.d("ScanSettings.callbackType != CALLBACK_TYPE_ALL_MATCHES but no (or only empty) filters are specified. Falling back to callbackType emulation.", new Object[0]);
            mVar = this.f25487c.a(fVar.f28675b);
            fVar2 = new uc.f(fVar.f28674a, 1, fVar.f28676c, fVar.f28677d, fVar.f28678e, fVar.f28679f, fVar.f28680g);
        } else {
            fVar2 = fVar;
        }
        return new d6.b0(new qc.j0(this.f25485a, this.f25486b, this.f25488d, fVar2, new g(new r[0]), cVarArr), mVar);
    }
}
