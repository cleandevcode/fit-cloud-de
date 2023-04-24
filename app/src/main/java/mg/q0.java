package mg;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class q0 implements Callable<pg.b> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21371a;

    /* renamed from: b */
    public final /* synthetic */ a1 f21372b;

    public q0(a1 a1Var, m2.y yVar) {
        this.f21372b = a1Var;
        this.f21371a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final pg.b call() {
        String string;
        String string2;
        Double valueOf;
        Cursor r10 = o8.b.r(this.f21372b.f20636a, this.f21371a);
        try {
            int o10 = p.b.o(r10, "cid");
            int o11 = p.b.o(r10, "locality");
            int o12 = p.b.o(r10, "lat");
            int o13 = p.b.o(r10, "lng");
            int o14 = p.b.o(r10, "errorCount");
            pg.b bVar = null;
            Double valueOf2 = null;
            if (r10.moveToFirst()) {
                if (r10.isNull(o10)) {
                    string = null;
                } else {
                    string = r10.getString(o10);
                }
                if (r10.isNull(o11)) {
                    string2 = null;
                } else {
                    string2 = r10.getString(o11);
                }
                if (r10.isNull(o12)) {
                    valueOf = null;
                } else {
                    valueOf = Double.valueOf(r10.getDouble(o12));
                }
                if (!r10.isNull(o13)) {
                    valueOf2 = Double.valueOf(r10.getDouble(o13));
                }
                bVar = new pg.b(string, string2, valueOf, valueOf2, r10.getInt(o14));
            }
            return bVar;
        } finally {
            r10.close();
            this.f21371a.j();
        }
    }
}
