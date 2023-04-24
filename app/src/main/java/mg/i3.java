package mg;

import android.database.Cursor;
import java.util.Date;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class i3 implements Callable<Date> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21115a;

    /* renamed from: b */
    public final /* synthetic */ j3 f21116b;

    public i3(j3 j3Var, m2.y yVar) {
        this.f21116b = j3Var;
        this.f21115a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final Date call() {
        Cursor r10 = o8.b.r(this.f21116b.f21158b, this.f21115a);
        try {
            Date date = null;
            String string = null;
            if (r10.moveToFirst()) {
                if (!r10.isNull(0)) {
                    string = r10.getString(0);
                }
                gm.l.f(string, "str");
                date = dg.a.c(string);
            }
            return date;
        } finally {
            r10.close();
            this.f21115a.j();
        }
    }
}
