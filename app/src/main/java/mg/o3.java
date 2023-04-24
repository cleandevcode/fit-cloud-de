package mg;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class o3 implements Callable<Integer> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21334a;

    /* renamed from: b */
    public final /* synthetic */ j3 f21335b;

    public o3(j3 j3Var, m2.y yVar) {
        this.f21335b = j3Var;
        this.f21334a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final Integer call() {
        Integer num;
        Cursor r10 = o8.b.r(this.f21335b.f21158b, this.f21334a);
        try {
            if (r10.moveToFirst() && !r10.isNull(0)) {
                num = Integer.valueOf(r10.getInt(0));
                return num;
            }
            num = null;
            return num;
        } finally {
            r10.close();
            this.f21334a.j();
        }
    }
}
