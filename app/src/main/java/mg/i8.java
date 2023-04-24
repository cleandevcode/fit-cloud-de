package mg;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class i8 implements Callable<Integer> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21126a;

    /* renamed from: b */
    public final /* synthetic */ s8 f21127b;

    public i8(s8 s8Var, m2.y yVar) {
        this.f21127b = s8Var;
        this.f21126a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final Integer call() {
        Integer num;
        Cursor r10 = o8.b.r(this.f21127b.f21418a, this.f21126a);
        try {
            if (r10.moveToFirst() && !r10.isNull(0)) {
                num = Integer.valueOf(r10.getInt(0));
                return num;
            }
            num = null;
            return num;
        } finally {
            r10.close();
            this.f21126a.j();
        }
    }
}
