package mg;

import android.database.Cursor;
import com.topstep.fitcloud.pro.shared.data.bean.data.BloodPressureItemBean;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class w implements Callable<List<BloodPressureItemBean>> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21567a;

    /* renamed from: b */
    public final /* synthetic */ i0 f21568b;

    public w(i0 i0Var, m2.y yVar) {
        this.f21568b = i0Var;
        this.f21567a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final List<BloodPressureItemBean> call() {
        String string;
        Cursor r10 = o8.b.r(this.f21568b.f21100a, this.f21567a);
        try {
            ArrayList arrayList = new ArrayList(r10.getCount());
            while (r10.moveToNext()) {
                if (r10.isNull(0)) {
                    string = null;
                } else {
                    string = r10.getString(0);
                }
                gm.l.f(string, "str");
                arrayList.add(new BloodPressureItemBean(r10.getInt(1), r10.getInt(2), dg.a.d(string)));
            }
            return arrayList;
        } finally {
            r10.close();
            this.f21567a.j();
        }
    }
}
