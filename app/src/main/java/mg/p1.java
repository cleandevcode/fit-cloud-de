package mg;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class p1 implements Callable<Integer> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21350a;

    /* renamed from: b */
    public final /* synthetic */ w1 f21351b;

    public p1(w1 w1Var, m2.y yVar) {
        this.f21351b = w1Var;
        this.f21350a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final Integer call() {
        Integer num;
        Cursor r10 = o8.b.r(this.f21351b.f21571a, this.f21350a);
        try {
            if (r10.moveToFirst() && !r10.isNull(0)) {
                num = Integer.valueOf(r10.getInt(0));
                return num;
            }
            num = null;
            return num;
        } finally {
            r10.close();
            this.f21350a.j();
        }
    }
}
