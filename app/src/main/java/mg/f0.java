package mg;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;

/* loaded from: classes2.dex */
public final class f0 extends m2.a0 {
    public f0(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // m2.a0
    public final String b() {
        return "DELETE FROM BloodPressureRecord WHERE userId=?";
    }
}
