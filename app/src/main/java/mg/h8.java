package mg;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import com.topstep.fitcloud.pro.shared.data.entity.data.StepItemEntity;
import java.util.Date;

/* loaded from: classes2.dex */
public final class h8 extends m2.i<StepItemEntity> {
    public h8(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // m2.a0
    public final String b() {
        return "INSERT OR REPLACE INTO `StepItem` (`userId`,`time`,`device`,`step`,`distance`,`calorie`,`transformFlag`) VALUES (?,?,?,?,?,?,?)";
    }

    @Override // m2.i
    public final void d(r2.f fVar, StepItemEntity stepItemEntity) {
        StepItemEntity stepItemEntity2 = stepItemEntity;
        fVar.H(1, stepItemEntity2.f10088a);
        Date date = stepItemEntity2.f10089b;
        k.f.b(date, "date", date, fVar, 2);
        String str = stepItemEntity2.f10090c;
        if (str == null) {
            fVar.m0(3);
        } else {
            fVar.p(3, str);
        }
        fVar.H(4, stepItemEntity2.f10091d);
        fVar.j0(stepItemEntity2.f10092e, 5);
        fVar.j0(stepItemEntity2.f10093f, 6);
        fVar.H(7, stepItemEntity2.f10094g);
    }
}
