package mg;

import android.os.CancellationSignal;
import com.topstep.fitcloud.pro.shared.data.bean.data.OxygenRecordBean;
import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import lg.d;
import mg.w3;

/* loaded from: classes2.dex */
public final class x4 extends w3 {

    /* renamed from: a */
    public final m2.t f21662a;

    /* renamed from: b */
    public final j4 f21663b;

    /* renamed from: c */
    public final p4 f21664c;

    /* renamed from: d */
    public final q4 f21665d;

    /* renamed from: e */
    public final r4 f21666e;

    /* renamed from: f */
    public final s4 f21667f;

    /* renamed from: g */
    public final t4 f21668g;

    /* renamed from: h */
    public final u4 f21669h;

    /* renamed from: i */
    public final v4 f21670i;

    public x4(AppDatabase appDatabase) {
        this.f21662a = appDatabase;
        this.f21663b = new j4(appDatabase);
        this.f21664c = new p4(appDatabase);
        this.f21665d = new q4(appDatabase);
        this.f21666e = new r4(appDatabase);
        this.f21667f = new s4(appDatabase);
        this.f21668g = new t4(appDatabase);
        this.f21669h = new u4(appDatabase);
        this.f21670i = new v4(appDatabase);
    }

    @Override // mg.w3
    public final Object b(long j10, w3.a aVar) {
        return m2.f.g(this.f21662a, new e4(this, j10), aVar);
    }

    @Override // mg.w3
    public final Object c(long j10, w3.a aVar) {
        return m2.f.g(this.f21662a, new f4(this, j10), aVar);
    }

    @Override // mg.w3
    public final Object d(long j10, w3.a aVar) {
        return m2.f.g(this.f21662a, new g4(this, j10), aVar);
    }

    @Override // mg.w3
    public final sm.u0 e(long j10, Date date, Date date2) {
        m2.y b10 = h4.g.b(3, "SELECT * FROM OxygenRecord WHERE userId=? AND date BETWEEN ? AND ? ORDER BY date ASC", 1, j10, date, "date");
        b10.p(2, dg.a.a(date));
        gm.l.f(date2, "date");
        b10.p(3, dg.a.a(date2));
        return m2.f.c(this.f21662a, new String[]{"OxygenRecord"}, new m4(this, b10));
    }

    @Override // mg.w3
    public final Object f(List list, zl.c cVar) {
        return m2.f.g(this.f21662a, new w4(this, list), cVar);
    }

    @Override // mg.w3
    public final Object g(rg.j jVar, w3.d dVar) {
        return m2.f.g(this.f21662a, new a4(this, jVar), dVar);
    }

    @Override // mg.w3
    public final Object h(ArrayList arrayList, w3.c cVar) {
        return m2.f.g(this.f21662a, new z3(this, arrayList), cVar);
    }

    @Override // mg.w3
    public final Object i(rg.k kVar, d.w wVar) {
        return m2.f.g(this.f21662a, new b4(this, kVar), wVar);
    }

    @Override // mg.w3
    public final Object k(long j10, Date date, Date date2, w3.b bVar) {
        m2.y h10 = m2.y.h(3, "SELECT * FROM OxygenItem WHERE userId=? AND time BETWEEN ? AND ?");
        h10.H(1, j10);
        h10.p(2, dg.a.b(date));
        return m2.f.f(this.f21662a, j.a(date2, h10, 3), new i4(this, h10), bVar);
    }

    @Override // mg.w3
    public final Object l(long j10, Date date, Date date2, zl.c cVar) {
        m2.y h10 = m2.y.h(3, "SELECT AVG(oxygen) FROM OxygenItem WHERE userId=? AND time BETWEEN ? AND ?");
        h10.H(1, j10);
        h10.p(2, dg.a.b(date));
        return m2.f.f(this.f21662a, j.a(date2, h10, 3), new k4(this, h10), cVar);
    }

    @Override // mg.w3
    public final Object m(long j10, Date date, zl.c cVar) {
        m2.y b10 = h4.g.b(2, "SELECT * FROM OxygenRecord WHERE userId=? AND date=?", 1, j10, date, "date");
        b10.p(2, dg.a.a(date));
        return m2.f.f(this.f21662a, new CancellationSignal(), new h4(this, b10), cVar);
    }

    @Override // mg.w3
    public final Object n(long j10, Date date, d.w wVar) {
        m2.y b10 = h4.g.b(2, "SELECT * FROM OxygenSyncInfo WHERE userId=? AND date=?", 1, j10, date, "date");
        b10.p(2, dg.a.a(date));
        return m2.f.f(this.f21662a, new CancellationSignal(), new o4(this, b10), wVar);
    }

    @Override // mg.w3
    public final Object o(final long j10, final Calendar calendar, final Date date, final int i10, d.m0 m0Var) {
        return m2.w.b(this.f21662a, new fm.l() { // from class: mg.y3
            @Override // fm.l
            public final Object k(Object obj) {
                x4 x4Var = x4.this;
                x4Var.getClass();
                return w3.p(x4Var, j10, calendar, date, i10, (xl.d) obj);
            }
        }, m0Var);
    }

    @Override // mg.w3
    public final Object q(long j10, Date date, x3 x3Var) {
        m2.y b10 = h4.g.b(2, "SELECT time AS time,oxygen AS oxygen FROM OxygenItem WHERE userId=? AND uploadFlag=0 AND time>=? ORDER BY time ASC", 1, j10, date, "date");
        return m2.f.f(this.f21662a, j.a(date, b10, 2), new l4(this, b10), x3Var);
    }

    @Override // mg.w3
    public final Object r(long j10, Date date, d.v vVar) {
        m2.y b10 = h4.g.b(2, "SELECT COUNT(*) FROM OxygenItem WHERE userId=? AND uploadFlag=0 AND time>=?", 1, j10, date, "date");
        return m2.f.f(this.f21662a, j.a(date, b10, 2), new n4(this, b10), vVar);
    }

    @Override // mg.w3
    public final Object s(long j10, ArrayList arrayList, og.r0 r0Var) {
        return m2.w.b(this.f21662a, new i(this, j10, arrayList, 2), r0Var);
    }

    @Override // mg.w3
    public final Object u(long j10, List<OxygenRecordBean> list, xl.d<? super tl.l> dVar) {
        return m2.w.b(this.f21662a, new k1(this, j10, list, 1), dVar);
    }

    @Override // mg.w3
    public final Object w(long j10, Date date, int i10, x3 x3Var) {
        return m2.f.g(this.f21662a, new c4(i10, j10, this, date), x3Var);
    }

    @Override // mg.w3
    public final Object x(long j10, Date date, int i10, d.m0 m0Var) {
        return m2.f.g(this.f21662a, new d4(i10, j10, this, date), m0Var);
    }
}
