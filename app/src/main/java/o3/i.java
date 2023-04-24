package o3;

import android.database.Cursor;
import m2.a0;
import m2.y;

/* loaded from: classes.dex */
public final class i implements h {

    /* renamed from: a */
    public final m2.t f22614a;

    /* renamed from: b */
    public final a f22615b;

    /* renamed from: c */
    public final b f22616c;

    /* loaded from: classes.dex */
    public class a extends m2.i<g> {
        public a(m2.t tVar) {
            super(tVar);
        }

        @Override // m2.a0
        public final String b() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        @Override // m2.i
        public final void d(r2.f fVar, g gVar) {
            g gVar2 = gVar;
            String str = gVar2.f22612a;
            if (str == null) {
                fVar.m0(1);
            } else {
                fVar.p(1, str);
            }
            fVar.H(2, gVar2.f22613b);
        }
    }

    /* loaded from: classes.dex */
    public class b extends a0 {
        public b(m2.t tVar) {
            super(tVar);
        }

        @Override // m2.a0
        public final String b() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public i(m2.t tVar) {
        this.f22614a = tVar;
        this.f22615b = new a(tVar);
        this.f22616c = new b(tVar);
    }

    public final g a(String str) {
        y h10 = y.h(1, "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?");
        if (str == null) {
            h10.m0(1);
        } else {
            h10.p(1, str);
        }
        this.f22614a.b();
        Cursor r10 = o8.b.r(this.f22614a, h10);
        try {
            return r10.moveToFirst() ? new g(r10.getString(p.b.o(r10, "work_spec_id")), r10.getInt(p.b.o(r10, "system_id"))) : null;
        } finally {
            r10.close();
            h10.j();
        }
    }

    public final void b(g gVar) {
        this.f22614a.b();
        this.f22614a.c();
        try {
            this.f22615b.e(gVar);
            this.f22614a.p();
        } finally {
            this.f22614a.l();
        }
    }

    public final void c(String str) {
        this.f22614a.b();
        r2.f a10 = this.f22616c.a();
        if (str == null) {
            a10.m0(1);
        } else {
            a10.p(1, str);
        }
        this.f22614a.c();
        try {
            a10.r();
            this.f22614a.p();
        } finally {
            this.f22614a.l();
            this.f22616c.c(a10);
        }
    }
}
