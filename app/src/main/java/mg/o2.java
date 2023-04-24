package mg;

import android.database.Cursor;
import com.topstep.fitcloud.pro.shared.data.bean.data.HeartRateItemBean;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class o2 implements Callable<List<HeartRateItemBean>> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21332a;

    /* renamed from: b */
    public final /* synthetic */ a3 f21333b;

    public o2(a3 a3Var, m2.y yVar) {
        this.f21333b = a3Var;
        this.f21332a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final List<HeartRateItemBean> call() {
        String string;
        Cursor r10 = o8.b.r(this.f21333b.f20650a, this.f21332a);
        try {
            ArrayList arrayList = new ArrayList(r10.getCount());
            while (r10.moveToNext()) {
                if (r10.isNull(0)) {
                    string = null;
                } else {
                    string = r10.getString(0);
                }
                gm.l.f(string, "str");
                arrayList.add(new HeartRateItemBean(r10.getInt(1), dg.a.d(string)));
            }
            return arrayList;
        } finally {
            r10.close();
            this.f21332a.j();
        }
    }
}
