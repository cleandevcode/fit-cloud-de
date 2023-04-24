package mg;

/* loaded from: classes2.dex */
public final class a extends n2.a {
    public a() {
        super(7, 8);
    }

    @Override // n2.a
    public final void a(s2.a aVar) {
        gm.l.f(aVar, "database");
        aVar.o("CREATE TABLE IF NOT EXISTS `PressureItem` (`pressure` INTEGER NOT NULL, `userId` INTEGER NOT NULL, `time` TEXT NOT NULL, `uploadFlag` INTEGER NOT NULL, `transformFlag` INTEGER NOT NULL, `uploadAttempts` INTEGER NOT NULL, PRIMARY KEY(`userId`, `time`))");
        aVar.o("CREATE TABLE IF NOT EXISTS `PressureRecord` (`avgPressure` INTEGER NOT NULL, `userId` INTEGER NOT NULL, `date` TEXT NOT NULL, `lastModifyTime` INTEGER NOT NULL, PRIMARY KEY(`userId`, `date`))");
    }
}
