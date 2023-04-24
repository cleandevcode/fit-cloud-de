package mg;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import java.util.Date;

/* loaded from: classes2.dex */
public final class x9 extends m2.i<rg.s> {
    public x9(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // m2.a0
    public final String b() {
        return "INSERT OR REPLACE INTO `TemperatureItem` (`body`,`wrist`,`userId`,`time`,`uploadFlag`,`transformFlag`,`uploadAttempts`) VALUES (?,?,?,?,?,?,?)";
    }

    @Override // m2.i
    public final void d(r2.f fVar, rg.s sVar) {
        rg.s sVar2 = sVar;
        fVar.j0(sVar2.f25660f, 1);
        fVar.j0(sVar2.f25661g, 2);
        fVar.H(3, sVar2.f10067a);
        Date date = sVar2.f10068b;
        k.f.b(date, "date", date, fVar, 4);
        fVar.H(5, sVar2.f10069c);
        fVar.H(6, sVar2.f10070d);
        fVar.H(7, sVar2.f10071e);
    }
}
