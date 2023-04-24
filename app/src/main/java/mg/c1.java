package mg;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;

/* loaded from: classes2.dex */
public final class c1 extends m2.i<pg.e> {
    public c1(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // m2.a0
    public final String b() {
        return "INSERT OR REPLACE INTO `DeviceShellEntity` (`projectNum`,`time`,`url`) VALUES (?,?,?)";
    }

    @Override // m2.i
    public final void d(r2.f fVar, pg.e eVar) {
        pg.e eVar2 = eVar;
        String str = eVar2.f24033a;
        if (str == null) {
            fVar.m0(1);
        } else {
            fVar.p(1, str);
        }
        fVar.H(2, eVar2.f24034b);
        String str2 = eVar2.f24035c;
        if (str2 == null) {
            fVar.m0(3);
        } else {
            fVar.p(3, str2);
        }
    }
}
