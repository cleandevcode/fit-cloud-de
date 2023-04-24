package mg;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class fb implements Callable<pg.f> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21007a;

    /* renamed from: b */
    public final /* synthetic */ wa f21008b;

    public fb(wa waVar, m2.y yVar) {
        this.f21008b = waVar;
        this.f21007a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final pg.f call() {
        pg.f fVar;
        Cursor r10 = o8.b.r(this.f21008b.f21625a, this.f21007a);
        try {
            int o10 = p.b.o(r10, "userId");
            int o11 = p.b.o(r10, "step");
            int o12 = p.b.o(r10, "distance");
            int o13 = p.b.o(r10, "calorie");
            int o14 = p.b.o(r10, "lastModifyTime");
            int o15 = p.b.o(r10, "dirty");
            int o16 = p.b.o(r10, "syncSuccessTime");
            if (r10.moveToFirst()) {
                fVar = new pg.f(r10.getLong(o10), r10.getInt(o11), r10.getFloat(o12), r10.getInt(o13), r10.getLong(o14));
                fVar.f24053b = r10.getInt(o15);
                fVar.f24054c = r10.getLong(o16);
            } else {
                fVar = null;
            }
            return fVar;
        } finally {
            r10.close();
            this.f21007a.j();
        }
    }
}
