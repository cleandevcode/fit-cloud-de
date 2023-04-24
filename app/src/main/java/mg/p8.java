package mg;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;

/* loaded from: classes2.dex */
public final class p8 extends m2.a0 {
    public p8(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // m2.a0
    public final String b() {
        return "UPDATE StepRecord SET uploadFlag=1 WHERE userId=? AND uploadAttempts=? AND date>=?";
    }
}
