package mg;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import java.util.Date;

/* loaded from: classes2.dex */
public final class m5 extends m2.i<rg.l> {
    public m5(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // m2.a0
    public final String b() {
        return "INSERT OR REPLACE INTO `PressureItem` (`pressure`,`userId`,`time`,`uploadFlag`,`transformFlag`,`uploadAttempts`) VALUES (?,?,?,?,?,?)";
    }

    @Override // m2.i
    public final void d(r2.f fVar, rg.l lVar) {
        rg.l lVar2 = lVar;
        fVar.H(1, lVar2.f25628f);
        fVar.H(2, lVar2.f10067a);
        Date date = lVar2.f10068b;
        k.f.b(date, "date", date, fVar, 3);
        fVar.H(4, lVar2.f10069c);
        fVar.H(5, lVar2.f10070d);
        fVar.H(6, lVar2.f10071e);
    }
}
