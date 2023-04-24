package mg;

import android.database.Cursor;
import com.topstep.fitcloud.pro.model.data.SportTotal;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class n7 implements Callable<SportTotal> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21318a;

    /* renamed from: b */
    public final /* synthetic */ h7 f21319b;

    public n7(h7 h7Var, m2.y yVar) {
        this.f21319b = h7Var;
        this.f21318a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final SportTotal call() {
        SportTotal sportTotal;
        Cursor r10 = o8.b.r(this.f21319b.f21063a, this.f21318a);
        try {
            if (r10.moveToFirst()) {
                sportTotal = new SportTotal(r10.getFloat(1), r10.getInt(0));
            } else {
                sportTotal = null;
            }
            return sportTotal;
        } finally {
            r10.close();
        }
    }

    public final void finalize() {
        this.f21318a.j();
    }
}
