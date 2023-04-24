package mg;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import java.util.Date;

/* loaded from: classes2.dex */
public final class p4 extends m2.i<rg.j> {
    public p4(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // m2.a0
    public final String b() {
        return "INSERT OR REPLACE INTO `OxygenRecord` (`avgOxygen`,`userId`,`date`,`lastModifyTime`) VALUES (?,?,?,?)";
    }

    @Override // m2.i
    public final void d(r2.f fVar, rg.j jVar) {
        rg.j jVar2 = jVar;
        fVar.H(1, jVar2.f25627d);
        fVar.H(2, jVar2.f25621a);
        Date date = jVar2.f25622b;
        gm.l.f(date, "date");
        fVar.p(3, dg.a.a(date));
        fVar.H(4, jVar2.f25623c);
    }
}
