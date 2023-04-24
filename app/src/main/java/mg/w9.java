package mg;

import android.database.Cursor;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class w9 implements Callable<List<rg.s>> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21623a;

    /* renamed from: b */
    public final /* synthetic */ la f21624b;

    public w9(la laVar, m2.y yVar) {
        this.f21624b = laVar;
        this.f21623a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final List<rg.s> call() {
        String string;
        Cursor r10 = o8.b.r(this.f21624b.f21260a, this.f21623a);
        try {
            int o10 = p.b.o(r10, "body");
            int o11 = p.b.o(r10, "wrist");
            int o12 = p.b.o(r10, "userId");
            int o13 = p.b.o(r10, CrashHianalyticsData.TIME);
            int o14 = p.b.o(r10, "uploadFlag");
            int o15 = p.b.o(r10, "transformFlag");
            int o16 = p.b.o(r10, "uploadAttempts");
            ArrayList arrayList = new ArrayList(r10.getCount());
            while (r10.moveToNext()) {
                float f10 = r10.getFloat(o10);
                float f11 = r10.getFloat(o11);
                long j10 = r10.getLong(o12);
                if (r10.isNull(o13)) {
                    string = null;
                } else {
                    string = r10.getString(o13);
                }
                gm.l.f(string, "str");
                arrayList.add(new rg.s(j10, dg.a.d(string), f10, f11, r10.getInt(o14), r10.getInt(o15), r10.getInt(o16)));
            }
            return arrayList;
        } finally {
            r10.close();
            this.f21623a.j();
        }
    }
}
