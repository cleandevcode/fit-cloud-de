package mg;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class ca implements Callable<rg.u> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f20816a;

    /* renamed from: b */
    public final /* synthetic */ la f20817b;

    public ca(la laVar, m2.y yVar) {
        this.f20817b = laVar;
        this.f20816a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final rg.u call() {
        Cursor r10 = o8.b.r(this.f20817b.f21260a, this.f20816a);
        try {
            int o10 = p.b.o(r10, "userId");
            int o11 = p.b.o(r10, "date");
            int o12 = p.b.o(r10, "lastModifyTime");
            rg.u uVar = null;
            String string = null;
            if (r10.moveToFirst()) {
                long j10 = r10.getLong(o10);
                if (!r10.isNull(o11)) {
                    string = r10.getString(o11);
                }
                gm.l.f(string, "str");
                uVar = new rg.u(j10, dg.a.c(string), r10.getLong(o12));
            }
            return uVar;
        } finally {
            r10.close();
            this.f20816a.j();
        }
    }
}
