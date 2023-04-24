package mg;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class k2 implements Callable<rg.g> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21189a;

    /* renamed from: b */
    public final /* synthetic */ a3 f21190b;

    public k2(a3 a3Var, m2.y yVar) {
        this.f21190b = a3Var;
        this.f21189a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final rg.g call() {
        Cursor r10 = o8.b.r(this.f21190b.f20650a, this.f21189a);
        try {
            int o10 = p.b.o(r10, "avgHeartRate");
            int o11 = p.b.o(r10, "userId");
            int o12 = p.b.o(r10, "date");
            int o13 = p.b.o(r10, "lastModifyTime");
            rg.g gVar = null;
            String string = null;
            if (r10.moveToFirst()) {
                int i10 = r10.getInt(o10);
                long j10 = r10.getLong(o11);
                if (!r10.isNull(o12)) {
                    string = r10.getString(o12);
                }
                gm.l.f(string, "str");
                gVar = new rg.g(j10, dg.a.c(string), i10, r10.getLong(o13));
            }
            return gVar;
        } finally {
            r10.close();
            this.f21189a.j();
        }
    }
}
