package mg;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class j9 implements Callable<String> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21173a;

    /* renamed from: b */
    public final /* synthetic */ e9 f21174b;

    public j9(e9 e9Var, m2.y yVar) {
        this.f21174b = e9Var;
        this.f21173a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final String call() {
        String str;
        Cursor r10 = o8.b.r(this.f21174b.f20969b, this.f21173a);
        try {
            if (r10.moveToFirst() && !r10.isNull(0)) {
                str = r10.getString(0);
                return str;
            }
            str = null;
            return str;
        } finally {
            r10.close();
        }
    }

    public final void finalize() {
        this.f21173a.j();
    }
}
