package gh;

import bi.z0;
import com.topstep.fitcloud.pro.model.data.EcgRecord;
import com.xinyan.algorithm.MrAlgorithm;
import gm.l;
import gm.x;
import java.util.ArrayList;
import java.util.List;
import mf.a0;
import p000do.a;
import pm.j;
import yg.m;

/* loaded from: classes2.dex */
public final class d extends dh.b<EcgRecord, vf.d> {

    /* renamed from: b */
    public final m f15353b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(wm.b bVar, m mVar) {
        super(bVar);
        l.f(mVar, "publicStorage");
        this.f15353b = mVar;
    }

    @Override // dh.b
    public final Object a(EcgRecord ecgRecord, xl.d<? super vf.d> dVar) {
        boolean z10;
        EcgRecord ecgRecord2 = ecgRecord;
        if (ecgRecord2.getType() != 0) {
            List<Integer> detail = ecgRecord2.getDetail();
            if (detail != null && !detail.isEmpty()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                j jVar = new j(1, a0.i(dVar));
                jVar.u();
                c cVar = new c(new ArrayList(), this, jVar);
                x xVar = new x();
                MrAlgorithm mrAlgorithm = new MrAlgorithm();
                mrAlgorithm.enableLog(a.f15343a);
                z0.n(new b(this, mrAlgorithm, cVar, xVar, null));
                a.b bVar = p000do.a.f13275a;
                bVar.t("EcgAlgorithmUseCase");
                bVar.p("Init result:%b", Boolean.valueOf(xVar.f15506a));
                if (xVar.f15506a) {
                    mrAlgorithm.pushWaveData(ecgRecord2.getIntArraysForAlgorithm());
                    mrAlgorithm.term();
                    return jVar.t();
                }
                throw new dh.a();
            }
        }
        return new vf.d(0);
    }
}
