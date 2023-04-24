package mg;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class s7 implements Callable<Integer> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21416a;

    /* renamed from: b */
    public final /* synthetic */ h7 f21417b;

    public s7(h7 h7Var, m2.y yVar) {
        this.f21417b = h7Var;
        this.f21416a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final Integer call() {
        Integer num;
        Cursor r10 = o8.b.r(this.f21417b.f21063a, this.f21416a);
        try {
            if (r10.moveToFirst() && !r10.isNull(0)) {
                num = Integer.valueOf(r10.getInt(0));
                return num;
            }
            num = null;
            return num;
        } finally {
            r10.close();
            this.f21416a.j();
        }
    }
}
