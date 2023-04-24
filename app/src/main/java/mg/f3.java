package mg;

import android.database.Cursor;
import java.util.Date;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class f3 implements Callable<pg.g> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f20989a;

    /* renamed from: b */
    public final /* synthetic */ j3 f20990b;

    public f3(j3 j3Var, m2.y yVar) {
        this.f20990b = j3Var;
        this.f20989a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final pg.g call() {
        String string;
        Cursor r10 = o8.b.r(this.f20990b.f21158b, this.f20989a);
        try {
            int o10 = p.b.o(r10, "id");
            int o11 = p.b.o(r10, "userId");
            int o12 = p.b.o(r10, "date");
            int o13 = p.b.o(r10, "type");
            int o14 = p.b.o(r10, "extra");
            pg.g gVar = null;
            String string2 = null;
            if (r10.moveToFirst()) {
                long j10 = r10.getLong(o10);
                long j11 = r10.getLong(o11);
                if (r10.isNull(o12)) {
                    string = null;
                } else {
                    string = r10.getString(o12);
                }
                gm.l.f(string, "str");
                Date c10 = dg.a.c(string);
                int i10 = r10.getInt(o13);
                if (!r10.isNull(o14)) {
                    string2 = r10.getString(o14);
                }
                gVar = new pg.g(j10, j11, c10, i10, string2);
            }
            return gVar;
        } finally {
            r10.close();
        }
    }

    public final void finalize() {
        this.f20989a.j();
    }
}
