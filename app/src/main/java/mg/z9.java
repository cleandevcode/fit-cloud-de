package mg;

import android.database.Cursor;
import com.topstep.fitcloud.pro.shared.data.bean.data.TemperatureItemBean;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class z9 implements Callable<List<TemperatureItemBean>> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21792a;

    /* renamed from: b */
    public final /* synthetic */ la f21793b;

    public z9(la laVar, m2.y yVar) {
        this.f21793b = laVar;
        this.f21792a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final List<TemperatureItemBean> call() {
        String string;
        Cursor r10 = o8.b.r(this.f21793b.f21260a, this.f21792a);
        try {
            ArrayList arrayList = new ArrayList(r10.getCount());
            while (r10.moveToNext()) {
                if (r10.isNull(0)) {
                    string = null;
                } else {
                    string = r10.getString(0);
                }
                gm.l.f(string, "str");
                arrayList.add(new TemperatureItemBean(dg.a.d(string), r10.getFloat(1), r10.getFloat(2)));
            }
            return arrayList;
        } finally {
            r10.close();
            this.f21792a.j();
        }
    }
}
