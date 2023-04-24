package mg;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;

/* loaded from: classes2.dex */
public final class y6 extends m2.a0 {
    public y6(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // m2.a0
    public final String b() {
        return "UPDATE SleepDetail SET uploadAttempts=? WHERE userId=? AND uploadFlag=0 AND time>=?";
    }
}
