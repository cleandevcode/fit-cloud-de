package mg;

import com.topstep.fitcloud.pro.model.data.EcgReport;
import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class r1 extends m2.i<rg.d> {
    public r1(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // m2.a0
    public final String b() {
        return "INSERT OR REPLACE INTO `EcgRecord` (`userId`,`ecgId`,`time`,`type`,`sampleBase`,`scaleValue`,`lastModifyTime`,`deviceAddress`,`detail`,`reports`,`uploadFlag`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
    }

    @Override // m2.i
    public final void d(r2.f fVar, rg.d dVar) {
        boolean z10;
        String e10;
        boolean z11;
        rg.d dVar2 = dVar;
        fVar.H(1, dVar2.f25610a);
        UUID uuid = dVar2.f25611b;
        gm.l.f(uuid, "uuid");
        String uuid2 = uuid.toString();
        gm.l.e(uuid2, "uuid.toString()");
        fVar.p(2, uuid2);
        Date date = dVar2.f25612c;
        k.f.b(date, "date", date, fVar, 3);
        fVar.H(4, dVar2.f25613d);
        fVar.H(5, dVar2.f25614e);
        fVar.H(6, dVar2.f25615f);
        fVar.H(7, dVar2.f25616g);
        String str = dVar2.f25617h;
        if (str == null) {
            fVar.m0(8);
        } else {
            fVar.p(8, str);
        }
        List<Integer> list = dVar2.f25618i;
        if (list != null && !list.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        String str2 = null;
        if (z10) {
            e10 = null;
        } else {
            e10 = qg.a.f24816a.b(mf.l0.d(List.class, Integer.class)).e(list);
        }
        if (e10 == null) {
            fVar.m0(9);
        } else {
            fVar.p(9, e10);
        }
        List<EcgReport> list2 = dVar2.f25619j;
        if (list2 != null && !list2.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            str2 = qg.a.f24816a.b(mf.l0.d(List.class, EcgReport.class)).e(list2);
        }
        if (str2 == null) {
            fVar.m0(10);
        } else {
            fVar.p(10, str2);
        }
        fVar.H(11, dVar2.f25620k);
    }
}
