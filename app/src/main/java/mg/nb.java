package mg;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class nb implements Callable<String> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21322a;

    /* renamed from: b */
    public final /* synthetic */ sb f21323b;

    public nb(sb sbVar, m2.y yVar) {
        this.f21323b = sbVar;
        this.f21322a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final String call() {
        String str;
        Cursor r10 = o8.b.r(this.f21323b.f21452a, this.f21322a);
        try {
            if (r10.moveToFirst() && !r10.isNull(0)) {
                str = r10.getString(0);
                return str;
            }
            str = null;
            return str;
        } finally {
            r10.close();
            this.f21322a.j();
        }
    }
}
