package mg;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;

/* loaded from: classes2.dex */
public final class oa extends m2.a0 {
    public oa(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // m2.a0
    public final String b() {
        return "DELETE FROM UsedDialEntity WHERE projectNum=? AND dialNum=?";
    }
}
