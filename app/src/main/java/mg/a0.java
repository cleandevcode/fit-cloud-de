package mg;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import java.util.Date;

/* loaded from: classes2.dex */
public final class a0 extends m2.i<rg.b> {
    public a0(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // m2.a0
    public final String b() {
        return "INSERT OR REPLACE INTO `BloodPressureRecord` (`avgSbp`,`avgDbp`,`userId`,`date`,`lastModifyTime`) VALUES (?,?,?,?,?)";
    }

    @Override // m2.i
    public final void d(r2.f fVar, rg.b bVar) {
        rg.b bVar2 = bVar;
        fVar.H(1, bVar2.f25608d);
        fVar.H(2, bVar2.f25609e);
        fVar.H(3, bVar2.f25621a);
        Date date = bVar2.f25622b;
        gm.l.f(date, "date");
        fVar.p(4, dg.a.a(date));
        fVar.H(5, bVar2.f25623c);
    }
}
