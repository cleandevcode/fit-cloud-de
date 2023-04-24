package mg;

import android.database.Cursor;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class t implements Callable<List<rg.a>> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21461a;

    /* renamed from: b */
    public final /* synthetic */ i0 f21462b;

    public t(i0 i0Var, m2.y yVar) {
        this.f21462b = i0Var;
        this.f21461a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final List<rg.a> call() {
        String string;
        Cursor r10 = o8.b.r(this.f21462b.f21100a, this.f21461a);
        try {
            int o10 = p.b.o(r10, "sbp");
            int o11 = p.b.o(r10, "dbp");
            int o12 = p.b.o(r10, "userId");
            int o13 = p.b.o(r10, CrashHianalyticsData.TIME);
            int o14 = p.b.o(r10, "uploadFlag");
            int o15 = p.b.o(r10, "transformFlag");
            int o16 = p.b.o(r10, "uploadAttempts");
            ArrayList arrayList = new ArrayList(r10.getCount());
            while (r10.moveToNext()) {
                int i10 = r10.getInt(o10);
                int i11 = r10.getInt(o11);
                long j10 = r10.getLong(o12);
                if (r10.isNull(o13)) {
                    string = null;
                } else {
                    string = r10.getString(o13);
                }
                gm.l.f(string, "str");
                arrayList.add(new rg.a(j10, dg.a.d(string), i10, i11, r10.getInt(o14), r10.getInt(o15), r10.getInt(o16)));
            }
            return arrayList;
        } finally {
            r10.close();
            this.f21461a.j();
        }
    }
}
