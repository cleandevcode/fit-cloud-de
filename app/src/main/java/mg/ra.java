package mg;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class ra implements Callable<List<pg.l>> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21408a;

    /* renamed from: b */
    public final /* synthetic */ pa f21409b;

    public ra(pa paVar, m2.y yVar) {
        this.f21409b = paVar;
        this.f21408a = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final List<pg.l> call() {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        Cursor r10 = o8.b.r(this.f21409b.f21362a, this.f21408a);
        try {
            int o10 = p.b.o(r10, "projectNum");
            int o11 = p.b.o(r10, "dialNum");
            int o12 = p.b.o(r10, "lcd");
            int o13 = p.b.o(r10, "toolVersion");
            int o14 = p.b.o(r10, "binVersion");
            int o15 = p.b.o(r10, "imgUrl");
            int o16 = p.b.o(r10, "deviceImgUrl");
            int o17 = p.b.o(r10, "binUrl");
            int o18 = p.b.o(r10, "name");
            int o19 = p.b.o(r10, "binSize");
            ArrayList arrayList = new ArrayList(r10.getCount());
            while (r10.moveToNext()) {
                String str = null;
                if (r10.isNull(o10)) {
                    string = null;
                } else {
                    string = r10.getString(o10);
                }
                int i10 = r10.getInt(o11);
                int i11 = r10.getInt(o12);
                if (r10.isNull(o13)) {
                    string2 = null;
                } else {
                    string2 = r10.getString(o13);
                }
                int i12 = r10.getInt(o14);
                if (r10.isNull(o15)) {
                    string3 = null;
                } else {
                    string3 = r10.getString(o15);
                }
                if (r10.isNull(o16)) {
                    string4 = null;
                } else {
                    string4 = r10.getString(o16);
                }
                if (r10.isNull(o17)) {
                    string5 = null;
                } else {
                    string5 = r10.getString(o17);
                }
                if (!r10.isNull(o18)) {
                    str = r10.getString(o18);
                }
                arrayList.add(new pg.l(string, i10, i11, string2, i12, string3, string4, string5, str, r10.getLong(o19)));
            }
            return arrayList;
        } finally {
            r10.close();
            this.f21408a.j();
        }
    }
}
