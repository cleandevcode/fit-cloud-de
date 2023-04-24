package mg;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;

/* loaded from: classes2.dex */
public final class s0 extends m2.i<pg.c> {
    public s0(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // m2.a0
    public final String b() {
        return "INSERT OR REPLACE INTO `CityKeyEntity` (`key`,`cid`,`time`) VALUES (?,?,?)";
    }

    @Override // m2.i
    public final void d(r2.f fVar, pg.c cVar) {
        pg.c cVar2 = cVar;
        String str = cVar2.f24024a;
        if (str == null) {
            fVar.m0(1);
        } else {
            fVar.p(1, str);
        }
        String str2 = cVar2.f24025b;
        if (str2 == null) {
            fVar.m0(2);
        } else {
            fVar.p(2, str2);
        }
        fVar.H(3, cVar2.f24026c);
    }
}
