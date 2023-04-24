package mg;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;

/* loaded from: classes2.dex */
public final class r4 extends m2.a0 {
    public r4(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // m2.a0
    public final String b() {
        return "UPDATE OxygenItem SET uploadAttempts=? WHERE userId=? AND uploadFlag=0 AND time>=?";
    }
}
