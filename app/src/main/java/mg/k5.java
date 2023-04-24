package mg;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class k5 implements Callable<rg.m> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21195a;

    /* renamed from: b */
    public final /* synthetic */ a6 f21196b;

    public k5(a6 a6Var, m2.y yVar) {
        this.f21196b = a6Var;
        this.f21195a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final rg.m call() {
        Cursor r10 = o8.b.r(this.f21196b.f20665a, this.f21195a);
        try {
            int o10 = p.b.o(r10, "avgPressure");
            int o11 = p.b.o(r10, "userId");
            int o12 = p.b.o(r10, "date");
            int o13 = p.b.o(r10, "lastModifyTime");
            rg.m mVar = null;
            String string = null;
            if (r10.moveToFirst()) {
                int i10 = r10.getInt(o10);
                long j10 = r10.getLong(o11);
                if (!r10.isNull(o12)) {
                    string = r10.getString(o12);
                }
                gm.l.f(string, "str");
                mVar = new rg.m(j10, dg.a.c(string), i10, r10.getLong(o13));
            }
            return mVar;
        } finally {
            r10.close();
            this.f21195a.j();
        }
    }
}
