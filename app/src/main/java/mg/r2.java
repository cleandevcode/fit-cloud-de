package mg;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class r2 implements Callable<rg.h> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21394a;

    /* renamed from: b */
    public final /* synthetic */ a3 f21395b;

    public r2(a3 a3Var, m2.y yVar) {
        this.f21395b = a3Var;
        this.f21394a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final rg.h call() {
        Cursor r10 = o8.b.r(this.f21395b.f20650a, this.f21394a);
        try {
            int o10 = p.b.o(r10, "userId");
            int o11 = p.b.o(r10, "date");
            int o12 = p.b.o(r10, "lastModifyTime");
            rg.h hVar = null;
            String string = null;
            if (r10.moveToFirst()) {
                long j10 = r10.getLong(o10);
                if (!r10.isNull(o11)) {
                    string = r10.getString(o11);
                }
                gm.l.f(string, "str");
                hVar = new rg.h(j10, dg.a.c(string), r10.getLong(o12));
            }
            return hVar;
        } finally {
            r10.close();
            this.f21394a.j();
        }
    }
}
