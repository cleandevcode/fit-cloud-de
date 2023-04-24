package v6;

import androidx.fragment.app.r;
import androidx.lifecycle.u;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportActivity;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportViewModel;
import fm.p;
import fm.q;
import gm.l;
import gm.t;
import pm.z1;
import u6.v;
import u6.x;
import u6.z;

/* loaded from: classes.dex */
public interface a extends u {

    /* renamed from: v6.a$a */
    /* loaded from: classes.dex */
    public static final class C0526a {
        public static u a(a aVar) {
            try {
                r rVar = aVar instanceof r ? (r) aVar : null;
                u q02 = rVar != null ? rVar.q0() : aVar;
                l.e(q02, "{\n            (this as? …leOwner ?: this\n        }");
                return q02;
            } catch (IllegalStateException unused) {
                return aVar;
            }
        }

        public static z1 b(a aVar, b bVar, mm.f fVar, u6.f fVar2, p pVar, p pVar2) {
            l.f(bVar, "$receiver");
            l.f(fVar, "asyncProp");
            l.f(fVar2, "deliveryMode");
            return x.b(bVar, aVar.a(), fVar, fVar2, pVar, pVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static z1 d(a aVar, b bVar, mm.f fVar, mm.f fVar2, u6.f fVar3, q qVar) {
            l.f(bVar, "$receiver");
            l.f(fVar, "prop1");
            l.f(fVar2, "prop2");
            l.f(fVar3, "deliveryMode");
            l.f(qVar, "action");
            return bVar.g(bi.r.t(new u6.u(bVar.f29126e.f28541g, fVar, fVar2)), aVar.a(), fVar3.a(fVar, fVar2), new v(qVar, null));
        }

        public static z1 e(a aVar, b bVar, mm.f fVar, u6.f fVar2, p pVar) {
            l.f(bVar, "$receiver");
            l.f(fVar, "prop1");
            l.f(fVar2, "deliveryMode");
            l.f(pVar, "action");
            return x.a(bVar, aVar.a(), fVar, fVar2, pVar);
        }

        public static z1 f(a aVar, b bVar, u6.f fVar, p pVar) {
            l.f(bVar, "$receiver");
            l.f(fVar, "deliveryMode");
            l.f(pVar, "action");
            return bVar.g(bVar.f29126e.f28541g, aVar.a(), fVar, pVar);
        }

        public static /* synthetic */ void g(a aVar, EcgHealthReportViewModel ecgHealthReportViewModel, EcgHealthReportActivity.i iVar) {
            EcgHealthReportActivity.g gVar = EcgHealthReportActivity.g.f10707g;
            EcgHealthReportActivity.h hVar = EcgHealthReportActivity.h.f10708g;
            aVar.k(ecgHealthReportViewModel, z.f28636a, iVar);
        }
    }

    z1 G(b bVar, u6.f fVar, p pVar);

    u a();

    z1 e(b bVar, t tVar, u6.f fVar, p pVar);

    z1 k(EcgHealthReportViewModel ecgHealthReportViewModel, u6.f fVar, EcgHealthReportActivity.i iVar);

    z1 n(b bVar, t tVar, u6.f fVar, p pVar, p pVar2);
}
