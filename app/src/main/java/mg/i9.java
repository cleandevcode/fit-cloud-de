package mg;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class i9 implements Callable<String> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21128a;

    /* renamed from: b */
    public final /* synthetic */ e9 f21129b;

    public i9(e9 e9Var, m2.y yVar) {
        this.f21129b = e9Var;
        this.f21128a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final String call() {
        String str;
        Cursor r10 = o8.b.r(this.f21129b.f20969b, this.f21128a);
        try {
            if (r10.moveToFirst() && !r10.isNull(0)) {
                str = r10.getString(0);
                return str;
            }
            str = null;
            return str;
        } finally {
            r10.close();
            this.f21128a.j();
        }
    }
}
