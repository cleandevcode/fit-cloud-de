package mg;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;

/* loaded from: classes2.dex */
public final class r3 extends m2.a0 {
    public r3(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // m2.a0
    public final String b() {
        return "DELETE FROM NotificationOtherEntity WHERE userId=? AND packageName=?";
    }
}
