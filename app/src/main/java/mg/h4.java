package mg;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class h4 implements Callable<rg.j> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21056a;

    /* renamed from: b */
    public final /* synthetic */ x4 f21057b;

    public h4(x4 x4Var, m2.y yVar) {
        this.f21057b = x4Var;
        this.f21056a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final rg.j call() {
        Cursor r10 = o8.b.r(this.f21057b.f21662a, this.f21056a);
        try {
            int o10 = p.b.o(r10, "avgOxygen");
            int o11 = p.b.o(r10, "userId");
            int o12 = p.b.o(r10, "date");
            int o13 = p.b.o(r10, "lastModifyTime");
            rg.j jVar = null;
            String string = null;
            if (r10.moveToFirst()) {
                int i10 = r10.getInt(o10);
                long j10 = r10.getLong(o11);
                if (!r10.isNull(o12)) {
                    string = r10.getString(o12);
                }
                gm.l.f(string, "str");
                jVar = new rg.j(j10, dg.a.c(string), i10, r10.getLong(o13));
            }
            return jVar;
        } finally {
            r10.close();
            this.f21056a.j();
        }
    }
}
