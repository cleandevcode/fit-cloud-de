package mg;

import android.database.Cursor;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class o0 implements Callable<pg.c> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21328a;

    /* renamed from: b */
    public final /* synthetic */ a1 f21329b;

    public o0(a1 a1Var, m2.y yVar) {
        this.f21329b = a1Var;
        this.f21328a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final pg.c call() {
        String string;
        Cursor r10 = o8.b.r(this.f21329b.f20636a, this.f21328a);
        try {
            int o10 = p.b.o(r10, "key");
            int o11 = p.b.o(r10, "cid");
            int o12 = p.b.o(r10, CrashHianalyticsData.TIME);
            pg.c cVar = null;
            String string2 = null;
            if (r10.moveToFirst()) {
                if (r10.isNull(o10)) {
                    string = null;
                } else {
                    string = r10.getString(o10);
                }
                if (!r10.isNull(o11)) {
                    string2 = r10.getString(o11);
                }
                cVar = new pg.c(string, r10.getLong(o12), string2);
            }
            return cVar;
        } finally {
            r10.close();
            this.f21328a.j();
        }
    }
}
