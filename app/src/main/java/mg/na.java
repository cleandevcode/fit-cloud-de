package mg;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;

/* loaded from: classes2.dex */
public final class na extends m2.i<pg.l> {
    public na(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // m2.a0
    public final String b() {
        return "INSERT OR REPLACE INTO `UsedDialEntity` (`projectNum`,`dialNum`,`lcd`,`toolVersion`,`binVersion`,`imgUrl`,`deviceImgUrl`,`binUrl`,`name`,`binSize`) VALUES (?,?,?,?,?,?,?,?,?,?)";
    }

    @Override // m2.i
    public final void d(r2.f fVar, pg.l lVar) {
        pg.l lVar2 = lVar;
        String str = lVar2.f24060a;
        if (str == null) {
            fVar.m0(1);
        } else {
            fVar.p(1, str);
        }
        fVar.H(2, lVar2.f24061b);
        fVar.H(3, lVar2.f24062c);
        String str2 = lVar2.f24063d;
        if (str2 == null) {
            fVar.m0(4);
        } else {
            fVar.p(4, str2);
        }
        fVar.H(5, lVar2.f24064e);
        String str3 = lVar2.f24065f;
        if (str3 == null) {
            fVar.m0(6);
        } else {
            fVar.p(6, str3);
        }
        String str4 = lVar2.f24066g;
        if (str4 == null) {
            fVar.m0(7);
        } else {
            fVar.p(7, str4);
        }
        String str5 = lVar2.f24067h;
        if (str5 == null) {
            fVar.m0(8);
        } else {
            fVar.p(8, str5);
        }
        String str6 = lVar2.f24068i;
        if (str6 == null) {
            fVar.m0(9);
        } else {
            fVar.p(9, str6);
        }
        fVar.H(10, lVar2.f24069j);
    }
}
