package mg;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class s6 implements Callable<Integer> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21414a;

    /* renamed from: b */
    public final /* synthetic */ c7 f21415b;

    public s6(c7 c7Var, m2.y yVar) {
        this.f21415b = c7Var;
        this.f21414a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final Integer call() {
        Integer num;
        Cursor r10 = o8.b.r(this.f21415b.f20797b, this.f21414a);
        try {
            if (r10.moveToFirst() && !r10.isNull(0)) {
                num = Integer.valueOf(r10.getInt(0));
                return num;
            }
            num = null;
            return num;
        } finally {
            r10.close();
            this.f21414a.j();
        }
    }
}
