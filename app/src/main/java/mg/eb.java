package mg;

import android.database.Cursor;
import cn.sharesdk.framework.InnerShareParams;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class eb implements Callable<pg.d> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f20972a;

    /* renamed from: b */
    public final /* synthetic */ wa f20973b;

    public eb(wa waVar, m2.y yVar) {
        this.f20973b = waVar;
        this.f20972a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final pg.d call() {
        String string;
        String string2;
        Cursor r10 = o8.b.r(this.f20973b.f21625a, this.f20972a);
        try {
            int o10 = p.b.o(r10, "userId");
            int o11 = p.b.o(r10, InnerShareParams.ADDRESS);
            int o12 = p.b.o(r10, "name");
            int o13 = p.b.o(r10, "hardwareInfo");
            int o14 = p.b.o(r10, "isUnBind");
            int o15 = p.b.o(r10, "lastModifyTime");
            int o16 = p.b.o(r10, "dirty");
            int o17 = p.b.o(r10, "syncSuccessTime");
            pg.d dVar = null;
            String string3 = null;
            if (r10.moveToFirst()) {
                long j10 = r10.getLong(o10);
                if (r10.isNull(o11)) {
                    string = null;
                } else {
                    string = r10.getString(o11);
                }
                if (r10.isNull(o12)) {
                    string2 = null;
                } else {
                    string2 = r10.getString(o12);
                }
                if (!r10.isNull(o13)) {
                    string3 = r10.getString(o13);
                }
                dVar = new pg.d(j10, string, string2, string3, r10.getInt(o14), r10.getLong(o15));
                dVar.f24053b = r10.getInt(o16);
                dVar.f24054c = r10.getLong(o17);
            }
            return dVar;
        } finally {
            r10.close();
        }
    }

    public final void finalize() {
        this.f20972a.j();
    }
}
