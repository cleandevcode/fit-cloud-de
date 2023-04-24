package mg;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class x implements Callable<List<rg.b>> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21648a;

    /* renamed from: b */
    public final /* synthetic */ i0 f21649b;

    public x(i0 i0Var, m2.y yVar) {
        this.f21649b = i0Var;
        this.f21648a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final List<rg.b> call() {
        String string;
        Cursor r10 = o8.b.r(this.f21649b.f21100a, this.f21648a);
        try {
            int o10 = p.b.o(r10, "avgSbp");
            int o11 = p.b.o(r10, "avgDbp");
            int o12 = p.b.o(r10, "userId");
            int o13 = p.b.o(r10, "date");
            int o14 = p.b.o(r10, "lastModifyTime");
            ArrayList arrayList = new ArrayList(r10.getCount());
            while (r10.moveToNext()) {
                int i10 = r10.getInt(o10);
                int i11 = r10.getInt(o11);
                long j10 = r10.getLong(o12);
                if (r10.isNull(o13)) {
                    string = null;
                } else {
                    string = r10.getString(o13);
                }
                gm.l.f(string, "str");
                arrayList.add(new rg.b(j10, dg.a.c(string), i10, i11, r10.getLong(o14)));
            }
            return arrayList;
        } finally {
            r10.close();
        }
    }

    public final void finalize() {
        this.f21648a.j();
    }
}
