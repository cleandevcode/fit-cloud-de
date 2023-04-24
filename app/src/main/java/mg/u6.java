package mg;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import java.util.Date;

/* loaded from: classes2.dex */
public final class u6 extends m2.i<rg.p> {
    public u6(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // m2.a0
    public final String b() {
        return "INSERT OR REPLACE INTO `SleepRecord` (`userId`,`time`,`deepSleep`,`lightSleep`,`soberSleep`,`lastModifyTime`) VALUES (?,?,?,?,?,?)";
    }

    @Override // m2.i
    public final void d(r2.f fVar, rg.p pVar) {
        rg.p pVar2 = pVar;
        fVar.H(1, pVar2.f25639a);
        Date date = pVar2.f25640b;
        k.f.b(date, "date", date, fVar, 2);
        fVar.H(3, pVar2.f25641c);
        fVar.H(4, pVar2.f25642d);
        fVar.H(5, pVar2.f25643e);
        fVar.H(6, pVar2.f25644f);
    }
}
