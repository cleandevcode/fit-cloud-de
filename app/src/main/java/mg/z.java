package mg;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class z implements Callable<rg.c> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21736a;

    /* renamed from: b */
    public final /* synthetic */ i0 f21737b;

    public z(i0 i0Var, m2.y yVar) {
        this.f21737b = i0Var;
        this.f21736a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final rg.c call() {
        Cursor r10 = o8.b.r(this.f21737b.f21100a, this.f21736a);
        try {
            int o10 = p.b.o(r10, "userId");
            int o11 = p.b.o(r10, "date");
            int o12 = p.b.o(r10, "lastModifyTime");
            rg.c cVar = null;
            String string = null;
            if (r10.moveToFirst()) {
                long j10 = r10.getLong(o10);
                if (!r10.isNull(o11)) {
                    string = r10.getString(o11);
                }
                gm.l.f(string, "str");
                cVar = new rg.c(j10, dg.a.c(string), r10.getLong(o12));
            }
            return cVar;
        } finally {
            r10.close();
            this.f21736a.j();
        }
    }
}
