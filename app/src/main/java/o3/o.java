package o3;

import m2.a0;

/* loaded from: classes.dex */
public final class o implements n {

    /* renamed from: a */
    public final m2.t f22621a;

    /* renamed from: b */
    public final b f22622b;

    /* renamed from: c */
    public final c f22623c;

    /* loaded from: classes.dex */
    public class a extends m2.i<m> {
        public a(m2.t tVar) {
            super(tVar);
        }

        @Override // m2.a0
        public final String b() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // m2.i
        public final void d(r2.f fVar, m mVar) {
            mVar.getClass();
            fVar.m0(1);
            byte[] b10 = androidx.work.b.b(null);
            if (b10 == null) {
                fVar.m0(2);
            } else {
                fVar.Q(2, b10);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends a0 {
        public b(m2.t tVar) {
            super(tVar);
        }

        @Override // m2.a0
        public final String b() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* loaded from: classes.dex */
    public class c extends a0 {
        public c(m2.t tVar) {
            super(tVar);
        }

        @Override // m2.a0
        public final String b() {
            return "DELETE FROM WorkProgress";
        }
    }

    public o(m2.t tVar) {
        this.f22621a = tVar;
        new a(tVar);
        this.f22622b = new b(tVar);
        this.f22623c = new c(tVar);
    }

    public final void a(String str) {
        this.f22621a.b();
        r2.f a10 = this.f22622b.a();
        if (str == null) {
            a10.m0(1);
        } else {
            a10.p(1, str);
        }
        this.f22621a.c();
        try {
            a10.r();
            this.f22621a.p();
        } finally {
            this.f22621a.l();
            this.f22622b.c(a10);
        }
    }

    public final void b() {
        this.f22621a.b();
        r2.f a10 = this.f22623c.a();
        this.f22621a.c();
        try {
            a10.r();
            this.f22621a.p();
        } finally {
            this.f22621a.l();
            this.f22623c.c(a10);
        }
    }
}
