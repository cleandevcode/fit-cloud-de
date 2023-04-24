package mg;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class n4 implements Callable<Integer> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21312a;

    /* renamed from: b */
    public final /* synthetic */ x4 f21313b;

    public n4(x4 x4Var, m2.y yVar) {
        this.f21313b = x4Var;
        this.f21312a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final Integer call() {
        Integer num;
        Cursor r10 = o8.b.r(this.f21313b.f21662a, this.f21312a);
        try {
            if (r10.moveToFirst() && !r10.isNull(0)) {
                num = Integer.valueOf(r10.getInt(0));
                return num;
            }
            num = null;
            return num;
        } finally {
            r10.close();
            this.f21312a.j();
        }
    }
}
