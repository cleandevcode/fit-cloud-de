package mg;

import android.content.Context;

/* loaded from: classes2.dex */
public final class d extends n2.a {

    /* renamed from: c */
    public final /* synthetic */ mf.h0 f20820c;

    /* renamed from: d */
    public final /* synthetic */ Context f20821d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(mf.h0 h0Var, Context context) {
        super(10, 11);
        this.f20820c = h0Var;
        this.f20821d = context;
    }

    @Override // n2.a
    public final void a(s2.a aVar) {
        gm.l.f(aVar, "database");
        aVar.o("CREATE TABLE IF NOT EXISTS `UnitConfigEntity` (`userId` INTEGER NOT NULL, `length` INTEGER NOT NULL, `weight` INTEGER NOT NULL, `temperature` INTEGER NOT NULL, `lastModifyTime` INTEGER NOT NULL, `dirty` INTEGER NOT NULL, `syncSuccessTime` INTEGER NOT NULL, PRIMARY KEY(`userId`))");
        aVar.o("CREATE TABLE IF NOT EXISTS `DeviceBindEntity` (`userId` INTEGER NOT NULL, `address` TEXT, `name` TEXT, `hardwareInfo` TEXT, `isUnBind` INTEGER NOT NULL, `lastModifyTime` INTEGER NOT NULL, `dirty` INTEGER NOT NULL, `syncSuccessTime` INTEGER NOT NULL, PRIMARY KEY(`userId`))");
        aVar.o("CREATE TABLE IF NOT EXISTS `ExerciseGoalEntity` (`userId` INTEGER NOT NULL, `step` INTEGER NOT NULL, `distance` REAL NOT NULL, `calorie` INTEGER NOT NULL, `lastModifyTime` INTEGER NOT NULL, `dirty` INTEGER NOT NULL, `syncSuccessTime` INTEGER NOT NULL, PRIMARY KEY(`userId`))");
        aVar.o("CREATE TABLE IF NOT EXISTS `StringTypedEntity` (`userId` INTEGER NOT NULL, `type` INTEGER NOT NULL, `data` TEXT, PRIMARY KEY(`userId`, `type`))");
        aVar.o("CREATE TABLE IF NOT EXISTS `UsedDialEntity` (`projectNum` TEXT NOT NULL, `dialNum` INTEGER NOT NULL, `lcd` INTEGER NOT NULL, `toolVersion` TEXT NOT NULL, `binVersion` INTEGER NOT NULL, `imgUrl` TEXT, `deviceImgUrl` TEXT, `binUrl` TEXT NOT NULL, `name` TEXT, `binSize` INTEGER NOT NULL, PRIMARY KEY(`projectNum`, `dialNum`))");
        androidx.appcompat.widget.e2.b(aVar, "CREATE TABLE IF NOT EXISTS `CityEntity` (`cid` TEXT NOT NULL, `locality` TEXT NOT NULL, `lat` REAL, `lng` REAL, `errorCount` INTEGER NOT NULL, PRIMARY KEY(`cid`))", "CREATE TABLE IF NOT EXISTS `CityKeyEntity` (`key` TEXT NOT NULL, `cid` TEXT NOT NULL, `time` INTEGER NOT NULL, PRIMARY KEY(`key`))", "CREATE TABLE IF NOT EXISTS `DeviceShellEntity` (`projectNum` TEXT NOT NULL, `time` INTEGER NOT NULL, `url` TEXT, PRIMARY KEY(`projectNum`))", "CREATE TABLE IF NOT EXISTS `PressureSyncInfo` (`userId` INTEGER NOT NULL, `date` TEXT NOT NULL, `lastModifyTime` INTEGER NOT NULL, PRIMARY KEY(`userId`, `date`))");
        try {
            p000do.a.f13275a.b("start UserMigrate", new Object[0]);
            new p5.e(aVar).q();
        } catch (Exception e10) {
            p000do.a.f13275a.q(e10);
        }
        try {
            p000do.a.f13275a.b("start EcgMigrate", new Object[0]);
            new w.d(aVar).d();
        } catch (Exception e11) {
            p000do.a.f13275a.q(e11);
        }
        try {
            p000do.a.f13275a.b("start SportMigrate", new Object[0]);
            new w.j(3, aVar).c();
        } catch (Exception e12) {
            p000do.a.f13275a.q(e12);
        }
        try {
            p000do.a.f13275a.b("start MenstruationTimelineMigrate", new Object[0]);
            new w.e(aVar).c(this.f20820c);
        } catch (Exception e13) {
            p000do.a.f13275a.q(e13);
        }
        try {
            p000do.a.f13275a.b("start SharedPreferencesMigrate", new Object[0]);
            new a5.b(this.f20821d, aVar).d(this.f20820c);
        } catch (Exception e14) {
            p000do.a.f13275a.q(e14);
        }
        aVar.o("DROP TABLE CacheDialStyle");
        aVar.o("DROP TABLE DialInfo");
    }
}
