package mg;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class ba implements Callable<Integer> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f20723a;

    /* renamed from: b */
    public final /* synthetic */ la f20724b;

    public ba(la laVar, m2.y yVar) {
        this.f20724b = laVar;
        this.f20723a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final Integer call() {
        Integer num;
        Cursor r10 = o8.b.r(this.f20724b.f21260a, this.f20723a);
        try {
            if (r10.moveToFirst() && !r10.isNull(0)) {
                num = Integer.valueOf(r10.getInt(0));
                return num;
            }
            num = null;
            return num;
        } finally {
            r10.close();
            this.f20723a.j();
        }
    }
}
