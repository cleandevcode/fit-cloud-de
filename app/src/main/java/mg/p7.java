package mg;

import android.database.Cursor;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.UUID;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class p7 implements Callable<rg.r> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21358a;

    /* renamed from: b */
    public final /* synthetic */ h7 f21359b;

    public p7(h7 h7Var, m2.y yVar) {
        this.f21359b = h7Var;
        this.f21358a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final rg.r call() {
        String string;
        Cursor r10 = o8.b.r(this.f21359b.f21063a, this.f21358a);
        try {
            int o10 = p.b.o(r10, "userId");
            int o11 = p.b.o(r10, "sportId");
            int o12 = p.b.o(r10, CrashHianalyticsData.TIME);
            int o13 = p.b.o(r10, "duration");
            int o14 = p.b.o(r10, "distance");
            int o15 = p.b.o(r10, "calorie");
            int o16 = p.b.o(r10, "step");
            int o17 = p.b.o(r10, "climb");
            int o18 = p.b.o(r10, "locationType");
            int o19 = p.b.o(r10, "sportType");
            int o20 = p.b.o(r10, "uploadFlag");
            rg.r rVar = null;
            String string2 = null;
            if (r10.moveToFirst()) {
                long j10 = r10.getLong(o10);
                if (r10.isNull(o11)) {
                    string = null;
                } else {
                    string = r10.getString(o11);
                }
                UUID fromString = UUID.fromString(string);
                gm.l.e(fromString, "fromString(str)");
                if (!r10.isNull(o12)) {
                    string2 = r10.getString(o12);
                }
                gm.l.f(string2, "str");
                rVar = new rg.r(j10, fromString, dg.a.d(string2), r10.getInt(o13), r10.getFloat(o14), r10.getFloat(o15), r10.getInt(o16), r10.getFloat(o17), r10.getInt(o18), r10.getInt(o19), r10.getInt(o20));
            }
            return rVar;
        } finally {
            r10.close();
            this.f21358a.j();
        }
    }
}
