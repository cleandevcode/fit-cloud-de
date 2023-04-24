package mg;

import android.database.Cursor;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class i4 implements Callable<List<rg.i>> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21117a;

    /* renamed from: b */
    public final /* synthetic */ x4 f21118b;

    public i4(x4 x4Var, m2.y yVar) {
        this.f21118b = x4Var;
        this.f21117a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final List<rg.i> call() {
        String string;
        Cursor r10 = o8.b.r(this.f21118b.f21662a, this.f21117a);
        try {
            int o10 = p.b.o(r10, "oxygen");
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
                arrayList.add(new rg.i(j10, dg.a.d(string), i10, r10.getInt(o13), r10.getInt(o14), r10.getInt(o15)));
            }
            return arrayList;
        } finally {
            r10.close();
            this.f21117a.j();
        }
    }
}
