package mg;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class v9 implements Callable<rg.t> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21562a;

    /* renamed from: b */
    public final /* synthetic */ la f21563b;

    public v9(la laVar, m2.y yVar) {
        this.f21563b = laVar;
        this.f21562a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final rg.t call() {
        Cursor r10 = o8.b.r(this.f21563b.f21260a, this.f21562a);
        try {
            int o10 = p.b.o(r10, "avgBody");
            int o11 = p.b.o(r10, "avgWrist");
            int o12 = p.b.o(r10, "userId");
            int o13 = p.b.o(r10, "date");
            int o14 = p.b.o(r10, "lastModifyTime");
            rg.t tVar = null;
            String string = null;
            if (r10.moveToFirst()) {
                float f10 = r10.getFloat(o10);
                float f11 = r10.getFloat(o11);
                long j10 = r10.getLong(o12);
                if (!r10.isNull(o13)) {
                    string = r10.getString(o13);
                }
                gm.l.f(string, "str");
                tVar = new rg.t(j10, dg.a.c(string), f10, f11, r10.getLong(o14));
            }
            return tVar;
        } finally {
            r10.close();
            this.f21562a.j();
        }
    }
}
