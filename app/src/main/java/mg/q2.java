package mg;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class q2 implements Callable<Integer> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21375a;

    /* renamed from: b */
    public final /* synthetic */ a3 f21376b;

    public q2(a3 a3Var, m2.y yVar) {
        this.f21376b = a3Var;
        this.f21375a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final Integer call() {
        Integer num;
        Cursor r10 = o8.b.r(this.f21376b.f20650a, this.f21375a);
        try {
            if (r10.moveToFirst() && !r10.isNull(0)) {
                num = Integer.valueOf(r10.getInt(0));
                return num;
            }
            num = null;
            return num;
        } finally {
            r10.close();
            this.f21375a.j();
        }
    }
}
