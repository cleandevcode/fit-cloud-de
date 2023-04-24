package mg;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;

/* loaded from: classes2.dex */
public final class ga extends m2.a0 {
    public ga(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // m2.a0
    public final String b() {
        return "UPDATE TemperatureItem SET uploadFlag=1 WHERE userId=? AND uploadAttempts=? AND time>=?";
    }
}
