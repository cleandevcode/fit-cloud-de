package mg;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import java.util.Date;

/* loaded from: classes2.dex */
public final class t2 extends m2.i<rg.h> {
    public t2(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // m2.a0
    public final String b() {
        return "INSERT OR REPLACE INTO `HeartRateSyncInfo` (`userId`,`date`,`lastModifyTime`) VALUES (?,?,?)";
    }

    @Override // m2.i
    public final void d(r2.f fVar, rg.h hVar) {
        rg.h hVar2 = hVar;
        fVar.H(1, hVar2.f25621a);
        Date date = hVar2.f25622b;
        gm.l.f(date, "date");
        fVar.p(2, dg.a.a(date));
        fVar.H(3, hVar2.f25623c);
    }
}
