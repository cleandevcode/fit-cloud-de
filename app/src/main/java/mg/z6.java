package mg;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;

/* loaded from: classes2.dex */
public final class z6 extends m2.a0 {
    public z6(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // m2.a0
    public final String b() {
        return "UPDATE SleepDetail SET uploadFlag=1 WHERE userId=? AND uploadAttempts=? AND time>=?";
    }
}
