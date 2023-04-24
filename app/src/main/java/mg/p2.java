package mg;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class p2 implements Callable<List<rg.g>> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21352a;

    /* renamed from: b */
    public final /* synthetic */ a3 f21353b;

    public p2(a3 a3Var, m2.y yVar) {
        this.f21353b = a3Var;
        this.f21352a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final List<rg.g> call() {
        String string;
        Cursor r10 = o8.b.r(this.f21353b.f20650a, this.f21352a);
        try {
            int o10 = p.b.o(r10, "avgHeartRate");
            int o11 = p.b.o(r10, "userId");
            int o12 = p.b.o(r10, "date");
            int o13 = p.b.o(r10, "lastModifyTime");
            ArrayList arrayList = new ArrayList(r10.getCount());
            while (r10.moveToNext()) {
                int i10 = r10.getInt(o10);
                long j10 = r10.getLong(o11);
                if (r10.isNull(o12)) {
                    string = null;
                } else {
                    string = r10.getString(o12);
                }
                gm.l.f(string, "str");
                arrayList.add(new rg.g(j10, dg.a.c(string), i10, r10.getLong(o13)));
            }
            return arrayList;
        } finally {
            r10.close();
        }
    }

    public final void finalize() {
        this.f21352a.j();
    }
}
