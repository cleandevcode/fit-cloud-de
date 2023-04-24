package mg;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class n5 implements Callable<Integer> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21314a;

    /* renamed from: b */
    public final /* synthetic */ a6 f21315b;

    public n5(a6 a6Var, m2.y yVar) {
        this.f21315b = a6Var;
        this.f21314a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final Integer call() {
        Integer num;
        Cursor r10 = o8.b.r(this.f21315b.f20665a, this.f21314a);
        try {
            if (r10.moveToFirst() && !r10.isNull(0)) {
                num = Integer.valueOf(r10.getInt(0));
                return num;
            }
            num = null;
            return num;
        } finally {
            r10.close();
            this.f21314a.j();
        }
    }
}
