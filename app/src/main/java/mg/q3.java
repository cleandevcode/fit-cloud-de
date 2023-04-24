package mg;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;

/* loaded from: classes2.dex */
public final class q3 extends m2.i<pg.h> {
    public q3(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // m2.a0
    public final String b() {
        return "INSERT OR REPLACE INTO `NotificationOtherEntity` (`userId`,`appName`,`packageName`) VALUES (?,?,?)";
    }

    @Override // m2.i
    public final void d(r2.f fVar, pg.h hVar) {
        pg.h hVar2 = hVar;
        fVar.H(1, hVar2.f24046a);
        String str = hVar2.f24047b;
        if (str == null) {
            fVar.m0(2);
        } else {
            fVar.p(2, str);
        }
        String str2 = hVar2.f24048c;
        if (str2 == null) {
            fVar.m0(3);
        } else {
            fVar.p(3, str2);
        }
    }
}
