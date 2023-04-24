package mg;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class rb implements Callable<uf.d> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21410a;

    /* renamed from: b */
    public final /* synthetic */ sb f21411b;

    public rb(sb sbVar, m2.y yVar) {
        this.f21411b = sbVar;
        this.f21410a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final uf.d call() {
        String string;
        String string2;
        Cursor r10 = o8.b.r(this.f21411b.f21452a, this.f21410a);
        try {
            uf.d dVar = null;
            String string3 = null;
            if (r10.moveToFirst()) {
                if (r10.isNull(0)) {
                    string = null;
                } else {
                    string = r10.getString(0);
                }
                int i10 = r10.getInt(1);
                if (r10.isNull(2)) {
                    string2 = null;
                } else {
                    string2 = r10.getString(2);
                }
                if (!r10.isNull(3)) {
                    string3 = r10.getString(3);
                }
                dVar = new uf.d(string, i10, string2, string3);
            }
            return dVar;
        } finally {
            r10.close();
        }
    }

    public final void finalize() {
        this.f21410a.j();
    }
}
