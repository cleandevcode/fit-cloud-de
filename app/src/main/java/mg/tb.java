package mg;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;

/* loaded from: classes2.dex */
public final class tb extends m2.i<pg.m> {
    public tb(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // m2.a0
    public final String b() {
        return "INSERT OR REPLACE INTO `UserEntity` (`userId`,`phone`,`email`,`nickName`,`sex`,`birthday`,`height`,`weight`,`avatar`,`identityId`,`hasProfile`,`hasPassword`,`hasIdentity`,`lastModifyTime`,`dirty`,`syncSuccessTime`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    @Override // m2.i
    public final void d(r2.f fVar, pg.m mVar) {
        pg.m mVar2 = mVar;
        fVar.H(1, mVar2.f24070d);
        String str = mVar2.f24071e;
        if (str == null) {
            fVar.m0(2);
        } else {
            fVar.p(2, str);
        }
        String str2 = mVar2.f24072f;
        if (str2 == null) {
            fVar.m0(3);
        } else {
            fVar.p(3, str2);
        }
        String str3 = mVar2.f24073g;
        if (str3 == null) {
            fVar.m0(4);
        } else {
            fVar.p(4, str3);
        }
        fVar.H(5, mVar2.f24074h);
        String str4 = mVar2.f24075i;
        if (str4 == null) {
            fVar.m0(6);
        } else {
            fVar.p(6, str4);
        }
        fVar.j0(mVar2.f24076j, 7);
        fVar.j0(mVar2.f24077k, 8);
        String str5 = mVar2.f24078l;
        if (str5 == null) {
            fVar.m0(9);
        } else {
            fVar.p(9, str5);
        }
        String str6 = mVar2.f24079m;
        if (str6 == null) {
            fVar.m0(10);
        } else {
            fVar.p(10, str6);
        }
        fVar.H(11, mVar2.f24080n);
        fVar.H(12, mVar2.f24081o);
        fVar.H(13, mVar2.f24082p);
        fVar.H(14, mVar2.f24083q);
        fVar.H(15, mVar2.f24053b);
        fVar.H(16, mVar2.f24054c);
    }
}
