package mg;

import android.database.Cursor;
import cn.sharesdk.framework.InnerShareParams;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class g1 implements Callable<pg.e> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21014a;

    /* renamed from: b */
    public final /* synthetic */ e1 f21015b;

    public g1(e1 e1Var, m2.y yVar) {
        this.f21015b = e1Var;
        this.f21014a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final pg.e call() {
        String string;
        Cursor r10 = o8.b.r(this.f21015b.f20949a, this.f21014a);
        try {
            int o10 = p.b.o(r10, "projectNum");
            int o11 = p.b.o(r10, CrashHianalyticsData.TIME);
            int o12 = p.b.o(r10, InnerShareParams.URL);
            pg.e eVar = null;
            String string2 = null;
            if (r10.moveToFirst()) {
                if (r10.isNull(o10)) {
                    string = null;
                } else {
                    string = r10.getString(o10);
                }
                long j10 = r10.getLong(o11);
                if (!r10.isNull(o12)) {
                    string2 = r10.getString(o12);
                }
                eVar = new pg.e(string, j10, string2);
            }
            return eVar;
        } finally {
            r10.close();
        }
    }

    public final void finalize() {
        this.f21014a.j();
    }
}
