package mg;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class k4 implements Callable<Integer> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21193a;

    /* renamed from: b */
    public final /* synthetic */ x4 f21194b;

    public k4(x4 x4Var, m2.y yVar) {
        this.f21194b = x4Var;
        this.f21193a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final Integer call() {
        Integer num;
        Cursor r10 = o8.b.r(this.f21194b.f21662a, this.f21193a);
        try {
            if (r10.moveToFirst() && !r10.isNull(0)) {
                num = Integer.valueOf(r10.getInt(0));
                return num;
            }
            num = null;
            return num;
        } finally {
            r10.close();
            this.f21193a.j();
        }
    }
}
