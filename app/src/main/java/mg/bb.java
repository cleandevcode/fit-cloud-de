package mg;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class bb implements Callable<pg.k> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f20725a;

    /* renamed from: b */
    public final /* synthetic */ wa f20726b;

    public bb(wa waVar, m2.y yVar) {
        this.f20726b = waVar;
        this.f20725a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final pg.k call() {
        pg.k kVar;
        Cursor r10 = o8.b.r(this.f20726b.f21625a, this.f20725a);
        try {
            int o10 = p.b.o(r10, "userId");
            int o11 = p.b.o(r10, "length");
            int o12 = p.b.o(r10, "weight");
            int o13 = p.b.o(r10, "temperature");
            int o14 = p.b.o(r10, "lastModifyTime");
            int o15 = p.b.o(r10, "dirty");
            int o16 = p.b.o(r10, "syncSuccessTime");
            if (r10.moveToFirst()) {
                kVar = new pg.k(r10.getLong(o10), r10.getInt(o11), r10.getInt(o12), r10.getInt(o13), r10.getLong(o14));
                kVar.f24053b = r10.getInt(o15);
                kVar.f24054c = r10.getLong(o16);
            } else {
                kVar = null;
            }
            return kVar;
        } finally {
            r10.close();
            this.f20725a.j();
        }
    }
}
