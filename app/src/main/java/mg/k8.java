package mg;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import com.topstep.fitcloud.pro.shared.data.entity.data.StepRecordEntity;
import java.util.Date;

/* loaded from: classes2.dex */
public final class k8 extends m2.i<StepRecordEntity> {
    public k8(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // m2.a0
    public final String b() {
        return "INSERT OR REPLACE INTO `StepRecord` (`device`,`step`,`distance`,`calorie`,`uploadFlag`,`uploadAttempts`,`userId`,`date`,`lastModifyTime`) VALUES (?,?,?,?,?,?,?,?,?)";
    }

    @Override // m2.i
    public final void d(r2.f fVar, StepRecordEntity stepRecordEntity) {
        StepRecordEntity stepRecordEntity2 = stepRecordEntity;
        String str = stepRecordEntity2.f10095d;
        if (str == null) {
            fVar.m0(1);
        } else {
            fVar.p(1, str);
        }
        fVar.H(2, stepRecordEntity2.f10096e);
        fVar.j0(stepRecordEntity2.f10097f, 3);
        fVar.j0(stepRecordEntity2.f10098g, 4);
        fVar.H(5, stepRecordEntity2.f10099h);
        fVar.H(6, stepRecordEntity2.f10100i);
        fVar.H(7, stepRecordEntity2.f25621a);
        Date date = stepRecordEntity2.f25622b;
        gm.l.f(date, "date");
        fVar.p(8, dg.a.a(date));
        fVar.H(9, stepRecordEntity2.f25623c);
    }
}
