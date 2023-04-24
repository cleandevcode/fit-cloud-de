package mg;

import android.database.Cursor;
import java.util.Date;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class g3 implements Callable<pg.g> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21020a;

    /* renamed from: b */
    public final /* synthetic */ j3 f21021b;

    public g3(j3 j3Var, m2.y yVar) {
        this.f21021b = j3Var;
        this.f21020a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final pg.g call() {
        String string;
        Cursor r10 = o8.b.r(this.f21021b.f21158b, this.f21020a);
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
            this.f21020a.j();
        }
    }
}
