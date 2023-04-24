package mg;

/* loaded from: classes2.dex */
public final class c extends n2.a {
    public c() {
        super(9, 10);
    }

    @Override // n2.a
    public final void a(s2.a aVar) {
        gm.l.f(aVar, "database");
        aVar.o("CREATE TABLE IF NOT EXISTS `NotificationOtherEntity` (`userId` INTEGER NOT NULL, `appName` TEXT NOT NULL, `packageName` TEXT NOT NULL, PRIMARY KEY(`userId`, `packageName`))");
    }
}
