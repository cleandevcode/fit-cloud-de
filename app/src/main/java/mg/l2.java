package mg;

import android.database.Cursor;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class l2 implements Callable<List<rg.f>> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21216a;

    /* renamed from: b */
    public final /* synthetic */ a3 f21217b;

    public l2(a3 a3Var, m2.y yVar) {
        this.f21217b = a3Var;
        this.f21216a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final List<rg.f> call() {
        String string;
        Cursor r10 = o8.b.r(this.f21217b.f20650a, this.f21216a);
        try {
            int o10 = p.b.o(r10, "heartRate");
            int o11 = p.b.o(r10, "userId");
            int o12 = p.b.o(r10, CrashHianalyticsData.TIME);
            int o13 = p.b.o(r10, "uploadFlag");
            int o14 = p.b.o(r10, "transformFlag");
            int o15 = p.b.o(r10, "uploadAttempts");
            ArrayList arrayList = new ArrayList(r10.getCount());
            while (r10.moveToNext()) {
                int i10 = r10.getInt(o10);
                long j10 = r10.getLong(o11);
                if (r10.isNull(o12)) {
                    string = null;
                } else {
                    string = r10.getString(o12);
                }
                gm.l.f(string, "str");
                arrayList.add(new rg.f(j10, dg.a.d(string), i10, r10.getInt(o13), r10.getInt(o14), r10.getInt(o15)));
            }
            return arrayList;
        } finally {
            r10.close();
            this.f21216a.j();
        }
    }
}
