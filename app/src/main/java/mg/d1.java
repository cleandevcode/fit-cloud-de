package mg;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;

/* loaded from: classes2.dex */
public final class d1 extends m2.a0 {
    public d1(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // m2.a0
    public final String b() {
        return "UPDATE DeviceShellEntity SET time=0 WHERE projectNum=? AND time<?";
    }
}
