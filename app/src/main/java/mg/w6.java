package mg;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;

/* loaded from: classes2.dex */
public final class w6 extends m2.a0 {
    public w6(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // m2.a0
    public final String b() {
        return "DELETE FROM SleepDetail WHERE userId=? AND uploadFlag=1 AND time=?";
    }
}
