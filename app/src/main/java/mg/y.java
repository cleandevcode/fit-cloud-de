package mg;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class y implements Callable<Integer> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21682a;

    /* renamed from: b */
    public final /* synthetic */ i0 f21683b;

    public y(i0 i0Var, m2.y yVar) {
        this.f21683b = i0Var;
        this.f21682a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final Integer call() {
        Integer num;
        Cursor r10 = o8.b.r(this.f21683b.f21100a, this.f21682a);
        try {
            if (r10.moveToFirst() && !r10.isNull(0)) {
                num = Integer.valueOf(r10.getInt(0));
                return num;
            }
            num = null;
            return num;
        } finally {
            r10.close();
            this.f21682a.j();
        }
    }
}
