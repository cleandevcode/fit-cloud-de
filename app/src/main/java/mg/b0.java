package mg;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import java.util.Date;

/* loaded from: classes2.dex */
public final class b0 extends m2.i<rg.c> {
    public b0(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // m2.a0
    public final String b() {
        return "INSERT OR REPLACE INTO `BloodPressureSyncInfo` (`userId`,`date`,`lastModifyTime`) VALUES (?,?,?)";
    }

    @Override // m2.i
    public final void d(r2.f fVar, rg.c cVar) {
        rg.c cVar2 = cVar;
        fVar.H(1, cVar2.f25621a);
        Date date = cVar2.f25622b;
        gm.l.f(date, "date");
        fVar.p(2, dg.a.a(date));
        fVar.H(3, cVar2.f25623c);
    }
}
