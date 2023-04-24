package mg;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;

/* loaded from: classes2.dex */
public final class l8 extends m2.a0 {
    public l8(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // m2.a0
    public final String b() {
        return "DELETE FROM StepItem WHERE userId=? AND time BETWEEN ? AND ?";
    }
}
