package mg;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;

/* loaded from: classes2.dex */
public final class u5 extends m2.a0 {
    public u5(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // m2.a0
    public final String b() {
        return "UPDATE PressureItem SET uploadAttempts=? WHERE userId=? AND uploadFlag=0 AND time>=?";
    }
}
