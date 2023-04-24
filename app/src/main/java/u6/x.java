package u6;

import pm.z1;

/* loaded from: classes.dex */
public final class x {
    /* JADX WARN: Multi-variable type inference failed */
    public static final z1 a(v6.b bVar, androidx.lifecycle.u uVar, mm.f fVar, f fVar2, fm.p pVar) {
        gm.l.f(bVar, "<this>");
        gm.l.f(fVar, "prop1");
        gm.l.f(fVar2, "deliveryMode");
        gm.l.f(pVar, "action");
        return bVar.g(bi.r.t(new s(bVar.f29126e.f28541g, fVar)), uVar, fVar2.a(fVar), new t(pVar, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final z1 b(v6.b bVar, androidx.lifecycle.u uVar, mm.f fVar, f fVar2, fm.p pVar, fm.p pVar2) {
        gm.l.f(bVar, "<this>");
        gm.l.f(fVar, "asyncProp");
        gm.l.f(fVar2, "deliveryMode");
        return a(bVar, uVar, fVar, fVar2.a(fVar), new w(pVar2, pVar, null));
    }
}
