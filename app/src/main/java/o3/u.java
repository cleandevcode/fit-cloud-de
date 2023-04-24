package o3;

import android.database.Cursor;
import java.util.ArrayList;
import m2.y;

/* loaded from: classes.dex */
public final class u implements t {

    /* renamed from: a */
    public final m2.t f22656a;

    /* renamed from: b */
    public final a f22657b;

    /* loaded from: classes.dex */
    public class a extends m2.i<s> {
        public a(m2.t tVar) {
            super(tVar);
        }

        @Override // m2.a0
        public final String b() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // m2.i
        public final void d(r2.f fVar, s sVar) {
            s sVar2 = sVar;
            String str = sVar2.f22654a;
            if (str == null) {
                fVar.m0(1);
            } else {
                fVar.p(1, str);
            }
            String str2 = sVar2.f22655b;
            if (str2 == null) {
                fVar.m0(2);
            } else {
                fVar.p(2, str2);
            }
        }
    }

    public u(m2.t tVar) {
        this.f22656a = tVar;
        this.f22657b = new a(tVar);
    }

    public final ArrayList a(String str) {
        y h10 = y.h(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            h10.m0(1);
        } else {
            h10.p(1, str);
        }
        this.f22656a.b();
        Cursor r10 = o8.b.r(this.f22656a, h10);
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
}
