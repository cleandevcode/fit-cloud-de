package mg;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;

/* loaded from: classes2.dex */
public final class y5 extends m2.a0 {
    public y5(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // m2.a0
    public final String b() {
        return "DELETE FROM PressureSyncInfo WHERE userId=?";
    }
}