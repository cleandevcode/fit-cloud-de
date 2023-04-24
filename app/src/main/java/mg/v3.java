package mg;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class v3 implements Callable<Integer> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21508a;

    /* renamed from: b */
    public final /* synthetic */ t3 f21509b;

    public v3(t3 t3Var, m2.y yVar) {
        this.f21509b = t3Var;
        this.f21508a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final Integer call() {
        Integer num;
        Cursor r10 = o8.b.r(this.f21509b.f21463a, this.f21508a);
        try {
            if (r10.moveToFirst() && !r10.isNull(0)) {
                num = Integer.valueOf(r10.getInt(0));
                return num;
            }
            num = null;
            return num;
        } finally {
            r10.close();
            this.f21508a.j();
        }
    }
}
