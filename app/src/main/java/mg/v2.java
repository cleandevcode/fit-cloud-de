package mg;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;

/* loaded from: classes2.dex */
public final class v2 extends m2.a0 {
    public v2(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // m2.a0
    public final String b() {
        return "UPDATE HeartRateItem SET uploadFlag=1 WHERE userId=? AND uploadAttempts=? AND time>=?";
    }
}
