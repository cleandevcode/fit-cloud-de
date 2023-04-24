package mg;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class pb implements Callable<pg.m> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21367a;

    /* renamed from: b */
    public final /* synthetic */ sb f21368b;

    public pb(sb sbVar, m2.y yVar) {
        this.f21368b = sbVar;
        this.f21367a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final pg.m call() {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        Cursor r10 = o8.b.r(this.f21368b.f21452a, this.f21367a);
        try {
            int o10 = p.b.o(r10, "userId");
            int o11 = p.b.o(r10, "phone");
            int o12 = p.b.o(r10, "email");
            int o13 = p.b.o(r10, "nickName");
            int o14 = p.b.o(r10, "sex");
            int o15 = p.b.o(r10, "birthday");
            int o16 = p.b.o(r10, "height");
            int o17 = p.b.o(r10, "weight");
            int o18 = p.b.o(r10, "avatar");
            int o19 = p.b.o(r10, "identityId");
            int o20 = p.b.o(r10, "hasProfile");
            int o21 = p.b.o(r10, "hasPassword");
            int o22 = p.b.o(r10, "hasIdentity");
            int o23 = p.b.o(r10, "lastModifyTime");
            int o24 = p.b.o(r10, "dirty");
            int o25 = p.b.o(r10, "syncSuccessTime");
            pg.m mVar = null;
            String string6 = null;
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
                if (r10.isNull(o13)) {
                    string3 = null;
                } else {
                    string3 = r10.getString(o13);
                }
                int i10 = r10.getInt(o14);
                if (r10.isNull(o15)) {
                    string4 = null;
                } else {
                    string4 = r10.getString(o15);
                }
                float f10 = r10.getFloat(o16);
                float f11 = r10.getFloat(o17);
                if (r10.isNull(o18)) {
                    string5 = null;
                } else {
                    string5 = r10.getString(o18);
                }
                if (!r10.isNull(o19)) {
                    string6 = r10.getString(o19);
                }
                pg.m mVar2 = new pg.m(j10, string, string2, string3, i10, string4, f10, f11, string5, string6, r10.getInt(o20), r10.getInt(o21), r10.getInt(o22), r10.getLong(o23));
                mVar2.f24053b = r10.getInt(o24);
                mVar2.f24054c = r10.getLong(o25);
                mVar = mVar2;
            }
            return mVar;
        } finally {
            r10.close();
        }
    }

    public final void finalize() {
        this.f21367a.j();
    }
}
