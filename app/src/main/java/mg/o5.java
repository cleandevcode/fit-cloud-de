package mg;

import android.database.Cursor;
import com.topstep.fitcloud.pro.shared.data.bean.data.PressureItemBean;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class o5 implements Callable<List<PressureItemBean>> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21338a;

    /* renamed from: b */
    public final /* synthetic */ a6 f21339b;

    public o5(a6 a6Var, m2.y yVar) {
        this.f21339b = a6Var;
        this.f21338a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final List<PressureItemBean> call() {
        String string;
        Cursor r10 = o8.b.r(this.f21339b.f20665a, this.f21338a);
        try {
            ArrayList arrayList = new ArrayList(r10.getCount());
            while (r10.moveToNext()) {
                if (r10.isNull(0)) {
                    string = null;
                } else {
                    string = r10.getString(0);
                }
                gm.l.f(string, "str");
                arrayList.add(new PressureItemBean(r10.getInt(1), dg.a.d(string)));
            }
            return arrayList;
        } finally {
            r10.close();
            this.f21338a.j();
        }
    }
}
