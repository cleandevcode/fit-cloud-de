package mg;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class k9 implements Callable<List<pg.i>> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21203a;

    /* renamed from: b */
    public final /* synthetic */ e9 f21204b;

    public k9(e9 e9Var, m2.y yVar) {
        this.f21204b = e9Var;
        this.f21203a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final List<pg.i> call() {
        String string;
        Cursor r10 = o8.b.r(this.f21204b.f20969b, this.f21203a);
        try {
            int o10 = p.b.o(r10, "userId");
            int o11 = p.b.o(r10, "type");
            int o12 = p.b.o(r10, "data");
            ArrayList arrayList = new ArrayList(r10.getCount());
            while (r10.moveToNext()) {
                long j10 = r10.getLong(o10);
                int i10 = r10.getInt(o11);
                if (r10.isNull(o12)) {
                    string = null;
                } else {
                    string = r10.getString(o12);
                }
                arrayList.add(new pg.i(i10, j10, string));
            }
            return arrayList;
        } finally {
            r10.close();
        }
    }

    public final void finalize() {
        this.f21203a.j();
    }
}
