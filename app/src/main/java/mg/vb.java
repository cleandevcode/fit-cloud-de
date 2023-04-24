package mg;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;

/* loaded from: classes2.dex */
public final class vb extends m2.a0 {
    public vb(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // m2.a0
    public final String b() {
        return "UPDATE UserEntity SET email=?,hasPassword=1 WHERE userId=?";
    }
}
