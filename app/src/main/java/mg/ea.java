package mg;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import java.util.Date;

/* loaded from: classes2.dex */
public final class ea extends m2.i<rg.u> {
    public ea(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // m2.a0
    public final String b() {
        return "INSERT OR REPLACE INTO `TemperatureSyncInfo` (`userId`,`date`,`lastModifyTime`) VALUES (?,?,?)";
    }

    @Override // m2.i
    public final void d(r2.f fVar, rg.u uVar) {
        rg.u uVar2 = uVar;
        fVar.H(1, uVar2.f25621a);
        Date date = uVar2.f25622b;
        gm.l.f(date, "date");
        fVar.p(2, dg.a.a(date));
        fVar.H(3, uVar2.f25623c);
    }
}
