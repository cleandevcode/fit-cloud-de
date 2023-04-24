package mg;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class s implements Callable<rg.b> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21412a;

    /* renamed from: b */
    public final /* synthetic */ i0 f21413b;

    public s(i0 i0Var, m2.y yVar) {
        this.f21413b = i0Var;
        this.f21412a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final rg.b call() {
        Cursor r10 = o8.b.r(this.f21413b.f21100a, this.f21412a);
        try {
            int o10 = p.b.o(r10, "avgSbp");
            int o11 = p.b.o(r10, "avgDbp");
            int o12 = p.b.o(r10, "userId");
            int o13 = p.b.o(r10, "date");
            int o14 = p.b.o(r10, "lastModifyTime");
            rg.b bVar = null;
            String string = null;
            if (r10.moveToFirst()) {
                int i10 = r10.getInt(o10);
                int i11 = r10.getInt(o11);
                long j10 = r10.getLong(o12);
                if (!r10.isNull(o13)) {
                    string = r10.getString(o13);
                }
                gm.l.f(string, "str");
                bVar = new rg.b(j10, dg.a.c(string), i10, i11, r10.getLong(o14));
            }
            return bVar;
        } finally {
            r10.close();
            this.f21412a.j();
        }
    }
}
