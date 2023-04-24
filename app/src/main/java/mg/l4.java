package mg;

import android.database.Cursor;
import com.topstep.fitcloud.pro.shared.data.bean.data.OxygenItemBean;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class l4 implements Callable<List<OxygenItemBean>> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21221a;

    /* renamed from: b */
    public final /* synthetic */ x4 f21222b;

    public l4(x4 x4Var, m2.y yVar) {
        this.f21222b = x4Var;
        this.f21221a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final List<OxygenItemBean> call() {
        String string;
        Cursor r10 = o8.b.r(this.f21222b.f21662a, this.f21221a);
        try {
            ArrayList arrayList = new ArrayList(r10.getCount());
            while (r10.moveToNext()) {
                if (r10.isNull(0)) {
                    string = null;
                } else {
                    string = r10.getString(0);
                }
                gm.l.f(string, "str");
                arrayList.add(new OxygenItemBean(r10.getInt(1), dg.a.d(string)));
            }
            return arrayList;
        } finally {
            r10.close();
            this.f21221a.j();
        }
    }
}
