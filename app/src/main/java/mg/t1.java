package mg;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;

/* loaded from: classes2.dex */
public final class t1 extends m2.a0 {
    public t1(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // m2.a0
    public final String b() {
        return "UPDATE EcgRecord SET uploadFlag=1 WHERE ecgId=?";
    }
}
