package o3;

import android.database.Cursor;
import java.util.ArrayList;
import m2.y;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a */
    public final m2.t f22606a;

    /* renamed from: b */
    public final a f22607b;

    /* loaded from: classes.dex */
    public class a extends m2.i<o3.a> {
        public a(m2.t tVar) {
            super(tVar);
        }

        @Override // m2.a0
        public final String b() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // m2.i
        public final void d(r2.f fVar, o3.a aVar) {
            o3.a aVar2 = aVar;
            String str = aVar2.f22604a;
            if (str == null) {
                fVar.m0(1);
            } else {
                fVar.p(1, str);
            }
            String str2 = aVar2.f22605b;
            if (str2 == null) {
                fVar.m0(2);
            } else {
                fVar.p(2, str2);
            }
        }
    }

    public c(m2.t tVar) {
        this.f22606a = tVar;
        this.f22607b = new a(tVar);
    }

    public final ArrayList a(String str) {
        y h10 = y.h(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            h10.m0(1);
        } else {
            h10.p(1, str);
        }
        this.f22606a.b();
        Cursor r10 = o8.b.r(this.f22606a, h10);
        try {
            ArrayList arrayList = new ArrayList(r10.getCount());
            while (r10.moveToNext()) {
                arrayList.add(r10.getString(0));
            }
            return arrayList;
        } finally {
            r10.close();
            h10.j();
        }
    }

    public final boolean b(String str) {
        y h10 = y.h(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        if (str == null) {
            h10.m0(1);
        } else {
            h10.p(1, str);
        }
        this.f22606a.b();
        Cursor r10 = o8.b.r(this.f22606a, h10);
        try {
            boolean z10 = false;
            if (r10.moveToFirst()) {
                z10 = r10.getInt(0) != 0;
            }
            return z10;
        } finally {
            r10.close();
            h10.j();
        }
    }
}
