package mg;

import android.database.Cursor;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.topstep.fitcloud.pro.shared.data.entity.data.StepItemEntity;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class e8 implements Callable<List<StepItemEntity>> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f20967a;

    /* renamed from: b */
    public final /* synthetic */ s8 f20968b;

    public e8(s8 s8Var, m2.y yVar) {
        this.f20968b = s8Var;
        this.f20967a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final List<StepItemEntity> call() {
        String string;
        String string2;
        Cursor r10 = o8.b.r(this.f20968b.f21418a, this.f20967a);
        try {
            int o10 = p.b.o(r10, "userId");
            int o11 = p.b.o(r10, CrashHianalyticsData.TIME);
            int o12 = p.b.o(r10, "device");
            int o13 = p.b.o(r10, "step");
            int o14 = p.b.o(r10, "distance");
            int o15 = p.b.o(r10, "calorie");
            int o16 = p.b.o(r10, "transformFlag");
            ArrayList arrayList = new ArrayList(r10.getCount());
            while (r10.moveToNext()) {
                long j10 = r10.getLong(o10);
                if (r10.isNull(o11)) {
                    string = null;
                } else {
                    string = r10.getString(o11);
                }
                gm.l.f(string, "str");
                Date d10 = dg.a.d(string);
                if (r10.isNull(o12)) {
                    string2 = null;
                } else {
                    string2 = r10.getString(o12);
                }
                arrayList.add(new StepItemEntity(j10, d10, string2, r10.getInt(o13), r10.getFloat(o14), r10.getFloat(o15), r10.getInt(o16)));
            }
            return arrayList;
        } finally {
            r10.close();
            this.f20967a.j();
        }
    }
}
