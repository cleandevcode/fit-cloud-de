package mg;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class t7 implements Callable<List<UUID>> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21476a;

    /* renamed from: b */
    public final /* synthetic */ h7 f21477b;

    public t7(h7 h7Var, m2.y yVar) {
        this.f21477b = h7Var;
        this.f21476a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final List<UUID> call() {
        String string;
        Cursor r10 = o8.b.r(this.f21477b.f21063a, this.f21476a);
        try {
            ArrayList arrayList = new ArrayList(r10.getCount());
            while (r10.moveToNext()) {
                if (r10.isNull(0)) {
                    string = null;
                } else {
                    string = r10.getString(0);
                }
                UUID fromString = UUID.fromString(string);
                gm.l.e(fromString, "fromString(str)");
                arrayList.add(fromString);
            }
            return arrayList;
        } finally {
            r10.close();
            this.f21476a.j();
        }
    }
}
