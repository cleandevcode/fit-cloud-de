package mg;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class ob implements Callable<String> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21344a;

    /* renamed from: b */
    public final /* synthetic */ sb f21345b;

    public ob(sb sbVar, m2.y yVar) {
        this.f21345b = sbVar;
        this.f21344a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final String call() {
        String str;
        Cursor r10 = o8.b.r(this.f21345b.f21452a, this.f21344a);
        try {
            if (r10.moveToFirst() && !r10.isNull(0)) {
                str = r10.getString(0);
                return str;
            }
            str = null;
            return str;
        } finally {
            r10.close();
            this.f21344a.j();
        }
    }
}
