package mg;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class aa implements Callable<List<rg.t>> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f20685a;

    /* renamed from: b */
    public final /* synthetic */ la f20686b;

    public aa(la laVar, m2.y yVar) {
        this.f20686b = laVar;
        this.f20685a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final List<rg.t> call() {
        String string;
        Cursor r10 = o8.b.r(this.f20686b.f21260a, this.f20685a);
        try {
            int o10 = p.b.o(r10, "avgBody");
            int o11 = p.b.o(r10, "avgWrist");
            int o12 = p.b.o(r10, "userId");
            int o13 = p.b.o(r10, "date");
            int o14 = p.b.o(r10, "lastModifyTime");
            ArrayList arrayList = new ArrayList(r10.getCount());
            while (r10.moveToNext()) {
                float f10 = r10.getFloat(o10);
                float f11 = r10.getFloat(o11);
                long j10 = r10.getLong(o12);
                if (r10.isNull(o13)) {
                    string = null;
                } else {
                    string = r10.getString(o13);
                }
                gm.l.f(string, "str");
                arrayList.add(new rg.t(j10, dg.a.c(string), f10, f11, r10.getLong(o14)));
            }
            return arrayList;
        } finally {
            r10.close();
        }
    }

    public final void finalize() {
        this.f20685a.j();
    }
}
