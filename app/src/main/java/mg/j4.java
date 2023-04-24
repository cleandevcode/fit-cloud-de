package mg;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import java.util.Date;

/* loaded from: classes2.dex */
public final class j4 extends m2.i<rg.i> {
    public j4(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // m2.a0
    public final String b() {
        return "INSERT OR REPLACE INTO `OxygenItem` (`oxygen`,`userId`,`time`,`uploadFlag`,`transformFlag`,`uploadAttempts`) VALUES (?,?,?,?,?,?)";
    }

    @Override // m2.i
    public final void d(r2.f fVar, rg.i iVar) {
        rg.i iVar2 = iVar;
        fVar.H(1, iVar2.f25626f);
        fVar.H(2, iVar2.f10067a);
        Date date = iVar2.f10068b;
        k.f.b(date, "date", date, fVar, 3);
        fVar.H(4, iVar2.f10069c);
        fVar.H(5, iVar2.f10070d);
        fVar.H(6, iVar2.f10071e);
    }
}
