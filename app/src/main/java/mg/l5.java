package mg;

import android.database.Cursor;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class l5 implements Callable<List<rg.l>> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21223a;

    /* renamed from: b */
    public final /* synthetic */ a6 f21224b;

    public l5(a6 a6Var, m2.y yVar) {
        this.f21224b = a6Var;
        this.f21223a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final List<rg.l> call() {
        String string;
        Cursor r10 = o8.b.r(this.f21224b.f20665a, this.f21223a);
        try {
            int o10 = p.b.o(r10, "pressure");
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
                arrayList.add(new rg.l(j10, dg.a.d(string), i10, r10.getInt(o13), r10.getInt(o14), r10.getInt(o15)));
            }
            return arrayList;
        } finally {
            r10.close();
            this.f21223a.j();
        }
    }
}
