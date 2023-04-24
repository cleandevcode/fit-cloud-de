package mg;

import android.database.Cursor;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class q6 implements Callable<rg.p> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21379a;

    /* renamed from: b */
    public final /* synthetic */ c7 f21380b;

    public q6(c7 c7Var, m2.y yVar) {
        this.f21380b = c7Var;
        this.f21379a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final rg.p call() {
        Cursor r10 = o8.b.r(this.f21380b.f20797b, this.f21379a);
        try {
            int o10 = p.b.o(r10, "userId");
            int o11 = p.b.o(r10, CrashHianalyticsData.TIME);
            int o12 = p.b.o(r10, "deepSleep");
            int o13 = p.b.o(r10, "lightSleep");
            int o14 = p.b.o(r10, "soberSleep");
            int o15 = p.b.o(r10, "lastModifyTime");
            rg.p pVar = null;
            String string = null;
            if (r10.moveToFirst()) {
                long j10 = r10.getLong(o10);
                if (!r10.isNull(o11)) {
                    string = r10.getString(o11);
                }
                gm.l.f(string, "str");
                pVar = new rg.p(j10, dg.a.d(string), r10.getInt(o12), r10.getInt(o13), r10.getInt(o14), r10.getLong(o15));
            }
            return pVar;
        } finally {
            r10.close();
        }
    }

    public final void finalize() {
        this.f21379a.j();
    }
}
