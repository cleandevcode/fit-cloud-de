package mg;

import android.database.Cursor;
import java.util.concurrent.Callable;
import mg.l9;

/* loaded from: classes2.dex */
public final class y9 implements Callable<l9.a> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21732a;

    /* renamed from: b */
    public final /* synthetic */ la f21733b;

    public y9(la laVar, m2.y yVar) {
        this.f21733b = laVar;
        this.f21732a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final l9.a call() {
        l9.a aVar;
        Cursor r10 = o8.b.r(this.f21733b.f21260a, this.f21732a);
        try {
            if (r10.moveToFirst()) {
                aVar = new l9.a(r10.getFloat(0), r10.getFloat(1));
            } else {
                aVar = null;
            }
            return aVar;
        } finally {
            r10.close();
            this.f21732a.j();
        }
    }
}
