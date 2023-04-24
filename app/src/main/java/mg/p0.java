package mg;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class p0 implements Callable<Integer> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21348a;

    /* renamed from: b */
    public final /* synthetic */ a1 f21349b;

    public p0(a1 a1Var, m2.y yVar) {
        this.f21349b = a1Var;
        this.f21348a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final Integer call() {
        Integer num;
        Cursor r10 = o8.b.r(this.f21349b.f20636a, this.f21348a);
        try {
            if (r10.moveToFirst() && !r10.isNull(0)) {
                num = Integer.valueOf(r10.getInt(0));
                return num;
            }
            num = null;
            return num;
        } finally {
            r10.close();
            this.f21348a.j();
        }
    }
}
