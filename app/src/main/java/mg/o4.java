package mg;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class o4 implements Callable<rg.k> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21336a;

    /* renamed from: b */
    public final /* synthetic */ x4 f21337b;

    public o4(x4 x4Var, m2.y yVar) {
        this.f21337b = x4Var;
        this.f21336a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final rg.k call() {
        Cursor r10 = o8.b.r(this.f21337b.f21662a, this.f21336a);
        try {
            int o10 = p.b.o(r10, "userId");
            int o11 = p.b.o(r10, "date");
            int o12 = p.b.o(r10, "lastModifyTime");
            rg.k kVar = null;
            String string = null;
            if (r10.moveToFirst()) {
                long j10 = r10.getLong(o10);
                if (!r10.isNull(o11)) {
                    string = r10.getString(o11);
                }
                gm.l.f(string, "str");
                kVar = new rg.k(j10, dg.a.c(string), r10.getLong(o12));
            }
            return kVar;
        } finally {
            r10.close();
            this.f21336a.j();
        }
    }
}
