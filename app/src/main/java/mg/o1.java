package mg;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import mg.h1;

/* loaded from: classes2.dex */
public final class o1 implements Callable<List<h1.a>> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21330a;

    /* renamed from: b */
    public final /* synthetic */ w1 f21331b;

    public o1(w1 w1Var, m2.y yVar) {
        this.f21331b = w1Var;
        this.f21330a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final List<h1.a> call() {
        String string;
        Cursor r10 = o8.b.r(this.f21331b.f21571a, this.f21330a);
        try {
            ArrayList arrayList = new ArrayList(r10.getCount());
            while (r10.moveToNext()) {
                String str = null;
                if (r10.isNull(0)) {
                    string = null;
                } else {
                    string = r10.getString(0);
                }
                UUID fromString = UUID.fromString(string);
                gm.l.e(fromString, "fromString(str)");
                if (!r10.isNull(1)) {
                    str = r10.getString(1);
                }
                gm.l.f(str, "str");
                arrayList.add(new h1.a(fromString, dg.a.d(str)));
            }
            return arrayList;
        } finally {
            r10.close();
        }
    }

    public final void finalize() {
        this.f21330a.j();
    }
}
