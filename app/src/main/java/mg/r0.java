package mg;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;

/* loaded from: classes2.dex */
public final class r0 extends m2.i<pg.b> {
    public r0(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // m2.a0
    public final String b() {
        return "INSERT OR REPLACE INTO `CityEntity` (`cid`,`locality`,`lat`,`lng`,`errorCount`) VALUES (?,?,?,?,?)";
    }

    @Override // m2.i
    public final void d(r2.f fVar, pg.b bVar) {
        pg.b bVar2 = bVar;
        String str = bVar2.f24019a;
        if (str == null) {
            fVar.m0(1);
        } else {
            fVar.p(1, str);
        }
        String str2 = bVar2.f24020b;
        if (str2 == null) {
            fVar.m0(2);
        } else {
            fVar.p(2, str2);
        }
        Double d10 = bVar2.f24021c;
        if (d10 == null) {
            fVar.m0(3);
        } else {
            fVar.j0(d10.doubleValue(), 3);
        }
        Double d11 = bVar2.f24022d;
        if (d11 == null) {
            fVar.m0(4);
        } else {
            fVar.j0(d11.doubleValue(), 4);
        }
        fVar.H(5, bVar2.f24023e);
    }
}
