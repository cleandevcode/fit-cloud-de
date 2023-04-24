package mg;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import java.util.Date;

/* loaded from: classes2.dex */
public final class s2 extends m2.i<rg.g> {
    public s2(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // m2.a0
    public final String b() {
        return "INSERT OR REPLACE INTO `HeartRateRecord` (`avgHeartRate`,`userId`,`date`,`lastModifyTime`) VALUES (?,?,?,?)";
    }

    @Override // m2.i
    public final void d(r2.f fVar, rg.g gVar) {
        rg.g gVar2 = gVar;
        fVar.H(1, gVar2.f25625d);
        fVar.H(2, gVar2.f25621a);
        Date date = gVar2.f25622b;
        gm.l.f(date, "date");
        fVar.p(3, dg.a.a(date));
        fVar.H(4, gVar2.f25623c);
    }
}
