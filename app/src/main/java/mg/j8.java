package mg;

import android.database.Cursor;
import com.topstep.fitcloud.pro.shared.data.entity.data.StepRecordEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class j8 implements Callable<List<StepRecordEntity>> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21171a;

    /* renamed from: b */
    public final /* synthetic */ s8 f21172b;

    public j8(s8 s8Var, m2.y yVar) {
        this.f21172b = s8Var;
        this.f21171a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final List<StepRecordEntity> call() {
        String string;
        Cursor r10 = o8.b.r(this.f21172b.f21418a, this.f21171a);
        try {
            int o10 = p.b.o(r10, "device");
            int o11 = p.b.o(r10, "step");
            int o12 = p.b.o(r10, "distance");
            int o13 = p.b.o(r10, "calorie");
            int o14 = p.b.o(r10, "uploadFlag");
            int o15 = p.b.o(r10, "uploadAttempts");
            int o16 = p.b.o(r10, "userId");
            int o17 = p.b.o(r10, "date");
            int o18 = p.b.o(r10, "lastModifyTime");
            ArrayList arrayList = new ArrayList(r10.getCount());
            while (r10.moveToNext()) {
                String str = null;
                if (r10.isNull(o10)) {
                    string = null;
                } else {
                    string = r10.getString(o10);
                }
                int i10 = r10.getInt(o11);
                float f10 = r10.getFloat(o12);
                float f11 = r10.getFloat(o13);
                int i11 = r10.getInt(o14);
                int i12 = r10.getInt(o15);
                long j10 = r10.getLong(o16);
                if (!r10.isNull(o17)) {
                    str = r10.getString(o17);
                }
                gm.l.f(str, "str");
                arrayList.add(new StepRecordEntity(j10, dg.a.c(str), string, i10, f10, f11, r10.getLong(o18), i11, i12));
            }
            return arrayList;
        } finally {
            r10.close();
            this.f21171a.j();
        }
    }
}
