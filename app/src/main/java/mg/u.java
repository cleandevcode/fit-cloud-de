package mg;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import java.util.Date;

/* loaded from: classes2.dex */
public final class u extends m2.i<rg.a> {
    public u(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // m2.a0
    public final String b() {
        return "INSERT OR REPLACE INTO `BloodPressureItem` (`sbp`,`dbp`,`userId`,`time`,`uploadFlag`,`transformFlag`,`uploadAttempts`) VALUES (?,?,?,?,?,?,?)";
    }

    @Override // m2.i
    public final void d(r2.f fVar, rg.a aVar) {
        rg.a aVar2 = aVar;
        fVar.H(1, aVar2.f25606f);
        fVar.H(2, aVar2.f25607g);
        fVar.H(3, aVar2.f10067a);
        Date date = aVar2.f10068b;
        k.f.b(date, "date", date, fVar, 4);
        fVar.H(5, aVar2.f10069c);
        fVar.H(6, aVar2.f10070d);
        fVar.H(7, aVar2.f10071e);
    }
}
