package mg;

import android.database.Cursor;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class r6 implements Callable<List<rg.p>> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21398a;

    /* renamed from: b */
    public final /* synthetic */ c7 f21399b;

    public r6(c7 c7Var, m2.y yVar) {
        this.f21399b = c7Var;
        this.f21398a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final List<rg.p> call() {
        String string;
        Cursor r10 = o8.b.r(this.f21399b.f20797b, this.f21398a);
        try {
            int o10 = p.b.o(r10, "userId");
            int o11 = p.b.o(r10, CrashHianalyticsData.TIME);
            int o12 = p.b.o(r10, "deepSleep");
            int o13 = p.b.o(r10, "lightSleep");
            int o14 = p.b.o(r10, "soberSleep");
            int o15 = p.b.o(r10, "lastModifyTime");
            ArrayList arrayList = new ArrayList(r10.getCount());
            while (r10.moveToNext()) {
                long j10 = r10.getLong(o10);
                if (r10.isNull(o11)) {
                    string = null;
                } else {
                    string = r10.getString(o11);
                }
                gm.l.f(string, "str");
                arrayList.add(new rg.p(j10, dg.a.d(string), r10.getInt(o12), r10.getInt(o13), r10.getInt(o14), r10.getLong(o15)));
            }
            return arrayList;
        } finally {
            r10.close();
        }
    }

    public final void finalize() {
        this.f21398a.j();
    }
}
