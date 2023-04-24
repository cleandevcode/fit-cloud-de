package mg;

import android.database.Cursor;
import java.util.concurrent.Callable;
import mg.e;

/* loaded from: classes2.dex */
public final class v implements Callable<e.a> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21506a;

    /* renamed from: b */
    public final /* synthetic */ i0 f21507b;

    public v(i0 i0Var, m2.y yVar) {
        this.f21507b = i0Var;
        this.f21506a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final e.a call() {
        e.a aVar;
        Cursor r10 = o8.b.r(this.f21507b.f21100a, this.f21506a);
        try {
            if (r10.moveToFirst()) {
                aVar = new e.a(r10.getInt(0), r10.getInt(1));
            } else {
                aVar = null;
            }
            return aVar;
        } finally {
            r10.close();
            this.f21506a.j();
        }
    }
}
