package mg;

import android.database.Cursor;
import com.topstep.fitcloud.pro.shared.data.entity.data.StepRecordEntity;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class d8 implements Callable<StepRecordEntity> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f20862a;

    /* renamed from: b */
    public final /* synthetic */ s8 f20863b;

    public d8(s8 s8Var, m2.y yVar) {
        this.f20863b = s8Var;
        this.f20862a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final StepRecordEntity call() {
        String string;
        Cursor r10 = o8.b.r(this.f20863b.f21418a, this.f20862a);
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
            StepRecordEntity stepRecordEntity = null;
            String string2 = null;
            if (r10.moveToFirst()) {
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
                    string2 = r10.getString(o17);
                }
                gm.l.f(string2, "str");
                stepRecordEntity = new StepRecordEntity(j10, dg.a.c(string2), string, i10, f10, f11, r10.getLong(o18), i11, i12);
            }
            return stepRecordEntity;
        } finally {
            r10.close();
            this.f20862a.j();
        }
    }
}
