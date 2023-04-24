package mg;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import java.util.Date;

/* loaded from: classes2.dex */
public final class q4 extends m2.i<rg.k> {
    public q4(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // m2.a0
    public final String b() {
        return "INSERT OR REPLACE INTO `OxygenSyncInfo` (`userId`,`date`,`lastModifyTime`) VALUES (?,?,?)";
    }

    @Override // m2.i
    public final void d(r2.f fVar, rg.k kVar) {
        rg.k kVar2 = kVar;
        fVar.H(1, kVar2.f25621a);
        Date date = kVar2.f25622b;
        gm.l.f(date, "date");
        fVar.p(2, dg.a.a(date));
        fVar.H(3, kVar2.f25623c);
    }
}
