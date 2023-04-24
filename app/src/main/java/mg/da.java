package mg;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import java.util.Date;

/* loaded from: classes2.dex */
public final class da extends m2.i<rg.t> {
    public da(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // m2.a0
    public final String b() {
        return "INSERT OR REPLACE INTO `TemperatureRecord` (`avgBody`,`avgWrist`,`userId`,`date`,`lastModifyTime`) VALUES (?,?,?,?,?)";
    }

    @Override // m2.i
    public final void d(r2.f fVar, rg.t tVar) {
        rg.t tVar2 = tVar;
        fVar.j0(tVar2.f25662d, 1);
        fVar.j0(tVar2.f25663e, 2);
        fVar.H(3, tVar2.f25621a);
        Date date = tVar2.f25622b;
        gm.l.f(date, "date");
        fVar.p(4, dg.a.a(date));
        fVar.H(5, tVar2.f25623c);
    }
}
