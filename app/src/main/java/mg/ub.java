package mg;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;

/* loaded from: classes2.dex */
public final class ub extends m2.a0 {
    public ub(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // m2.a0
    public final String b() {
        return "UPDATE UserEntity SET phone=?,hasPassword=1 WHERE userId=?";
    }
}
