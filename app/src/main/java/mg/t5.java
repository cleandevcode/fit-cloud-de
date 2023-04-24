package mg;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import java.util.Date;

/* loaded from: classes2.dex */
public final class t5 extends m2.i<rg.n> {
    public t5(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // m2.a0
    public final String b() {
        return "INSERT OR REPLACE INTO `PressureSyncInfo` (`userId`,`date`,`lastModifyTime`) VALUES (?,?,?)";
    }

    @Override // m2.i
    public final void d(r2.f fVar, rg.n nVar) {
        rg.n nVar2 = nVar;
        fVar.H(1, nVar2.f25621a);
        Date date = nVar2.f25622b;
        gm.l.f(date, "date");
        fVar.p(2, dg.a.a(date));
        fVar.H(3, nVar2.f25623c);
    }
}
