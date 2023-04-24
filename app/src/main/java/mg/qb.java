package mg;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class qb implements Callable<uf.c> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21390a;

    /* renamed from: b */
    public final /* synthetic */ sb f21391b;

    public qb(sb sbVar, m2.y yVar) {
        this.f21391b = sbVar;
        this.f21390a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final uf.c call() {
        Cursor r10 = o8.b.r(this.f21391b.f21452a, this.f21390a);
        try {
            uf.c cVar = null;
            String string = null;
            if (r10.moveToFirst()) {
                long j10 = r10.getLong(0);
                int i10 = r10.getInt(1);
                if (!r10.isNull(2)) {
                    string = r10.getString(2);
                }
                cVar = new uf.c(j10, i10, string, r10.getFloat(3), r10.getFloat(4));
            }
            return cVar;
        } finally {
            r10.close();
        }
    }

    public final void finalize() {
        this.f21390a.j();
    }
}
