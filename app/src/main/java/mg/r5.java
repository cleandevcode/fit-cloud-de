package mg;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class r5 implements Callable<rg.n> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21396a;

    /* renamed from: b */
    public final /* synthetic */ a6 f21397b;

    public r5(a6 a6Var, m2.y yVar) {
        this.f21397b = a6Var;
        this.f21396a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final rg.n call() {
        Cursor r10 = o8.b.r(this.f21397b.f20665a, this.f21396a);
        try {
            int o10 = p.b.o(r10, "userId");
            int o11 = p.b.o(r10, "date");
            int o12 = p.b.o(r10, "lastModifyTime");
            rg.n nVar = null;
            String string = null;
            if (r10.moveToFirst()) {
                long j10 = r10.getLong(o10);
                if (!r10.isNull(o11)) {
                    string = r10.getString(o11);
                }
                gm.l.f(string, "str");
                nVar = new rg.n(j10, dg.a.c(string), r10.getLong(o12));
            }
            return nVar;
        } finally {
            r10.close();
            this.f21396a.j();
        }
    }
}
