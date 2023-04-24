package mg;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import java.util.Date;

/* loaded from: classes2.dex */
public final class m2 extends m2.i<rg.f> {
    public m2(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // m2.a0
    public final String b() {
        return "INSERT OR REPLACE INTO `HeartRateItem` (`heartRate`,`userId`,`time`,`uploadFlag`,`transformFlag`,`uploadAttempts`) VALUES (?,?,?,?,?,?)";
    }

    @Override // m2.i
    public final void d(r2.f fVar, rg.f fVar2) {
        rg.f fVar3 = fVar2;
        fVar.H(1, fVar3.f25624f);
        fVar.H(2, fVar3.f10067a);
        Date date = fVar3.f10068b;
        k.f.b(date, "date", date, fVar, 3);
        fVar.H(4, fVar3.f10069c);
        fVar.H(5, fVar3.f10070d);
        fVar.H(6, fVar3.f10071e);
    }
}
