package mg;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class q5 implements Callable<Integer> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21377a;

    /* renamed from: b */
    public final /* synthetic */ a6 f21378b;

    public q5(a6 a6Var, m2.y yVar) {
        this.f21378b = a6Var;
        this.f21377a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final Integer call() {
        Integer num;
        Cursor r10 = o8.b.r(this.f21378b.f20665a, this.f21377a);
        try {
            if (r10.moveToFirst() && !r10.isNull(0)) {
                num = Integer.valueOf(r10.getInt(0));
                return num;
            }
            num = null;
            return num;
        } finally {
            r10.close();
            this.f21377a.j();
        }
    }
}
