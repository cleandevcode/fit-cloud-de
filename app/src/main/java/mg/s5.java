package mg;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import java.util.Date;

/* loaded from: classes2.dex */
public final class s5 extends m2.i<rg.m> {
    public s5(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // m2.a0
    public final String b() {
        return "INSERT OR REPLACE INTO `PressureRecord` (`avgPressure`,`userId`,`date`,`lastModifyTime`) VALUES (?,?,?,?)";
    }

    @Override // m2.i
    public final void d(r2.f fVar, rg.m mVar) {
        rg.m mVar2 = mVar;
        fVar.H(1, mVar2.f25629d);
        fVar.H(2, mVar2.f25621a);
        Date date = mVar2.f25622b;
        gm.l.f(date, "date");
        fVar.p(3, dg.a.a(date));
        fVar.H(4, mVar2.f25623c);
    }
}
