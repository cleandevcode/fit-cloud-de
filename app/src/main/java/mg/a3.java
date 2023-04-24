package mg;

import android.os.CancellationSignal;
import com.topstep.fitcloud.pro.shared.data.bean.data.HeartRateRecordBean;
import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import lg.d;
import mg.z1;

/* loaded from: classes2.dex */
public final class a3 extends z1 {

    /* renamed from: a */
    public final m2.t f20650a;

    /* renamed from: b */
    public final m2 f20651b;

    /* renamed from: c */
    public final s2 f20652c;

    /* renamed from: d */
    public final t2 f20653d;

    /* renamed from: e */
    public final u2 f20654e;

    /* renamed from: f */
    public final v2 f20655f;

    /* renamed from: g */
    public final w2 f20656g;

    /* renamed from: h */
    public final x2 f20657h;

    /* renamed from: i */
    public final y2 f20658i;

    public a3(AppDatabase appDatabase) {
        this.f20650a = appDatabase;
        this.f20651b = new m2(appDatabase);
        this.f20652c = new s2(appDatabase);
        this.f20653d = new t2(appDatabase);
        this.f20654e = new u2(appDatabase);
        this.f20655f = new v2(appDatabase);
        this.f20656g = new w2(appDatabase);
        this.f20657h = new x2(appDatabase);
        this.f20658i = new y2(appDatabase);
    }

    @Override // mg.z1
    public final Object b(long j10, z1.a aVar) {
        return m2.f.g(this.f20650a, new h2(this, j10), aVar);
    }

    @Override // mg.z1
    public final Object c(long j10, z1.a aVar) {
        return m2.f.g(this.f20650a, new i2(this, j10), aVar);
    }

    @Override // mg.z1
    public final Object d(long j10, z1.a aVar) {
        return m2.f.g(this.f20650a, new j2(this, j10), aVar);
    }

    @Override // mg.z1
    public final sm.u0 e(long j10, Date date, Date date2) {
        m2.y b10 = h4.g.b(3, "SELECT * FROM HeartRateRecord WHERE userId=? AND date BETWEEN ? AND ? ORDER BY date ASC", 1, j10, date, "date");
        b10.p(2, dg.a.a(date));
        gm.l.f(date2, "date");
        b10.p(3, dg.a.a(date2));
        return m2.f.c(this.f20650a, new String[]{"HeartRateRecord"}, new p2(this, b10));
    }

    @Override // mg.z1
    public final Object f(List list, zl.c cVar) {
        return m2.f.g(this.f20650a, new z2(this, list), cVar);
    }

    @Override // mg.z1
    public final Object g(rg.g gVar, z1.d dVar) {
        return m2.f.g(this.f20650a, new d2(this, gVar), dVar);
    }

    @Override // mg.z1
    public final Object h(ArrayList arrayList, z1.c cVar) {
        return m2.f.g(this.f20650a, new c2(this, arrayList), cVar);
    }

    @Override // mg.z1
    public final Object i(rg.h hVar, d.u uVar) {
        return m2.f.g(this.f20650a, new e2(this, hVar), uVar);
    }

    @Override // mg.z1
    public final Object k(long j10, Date date, Date date2, z1.b bVar) {
        m2.y h10 = m2.y.h(3, "SELECT * FROM HeartRateItem WHERE userId=? AND time BETWEEN ? AND ?");
        h10.H(1, j10);
        h10.p(2, dg.a.b(date));
        return m2.f.f(this.f20650a, j.a(date2, h10, 3), new l2(this, h10), bVar);
    }

    @Override // mg.z1
    public final Object l(long j10, Date date, Date date2, zl.c cVar) {
        m2.y h10 = m2.y.h(3, "SELECT AVG(heartRate) FROM HeartRateItem WHERE userId=? AND time BETWEEN ? AND ?");
        h10.H(1, j10);
        h10.p(2, dg.a.b(date));
        return m2.f.f(this.f20650a, j.a(date2, h10, 3), new n2(this, h10), cVar);
    }

    @Override // mg.z1
    public final Object m(long j10, Date date, zl.c cVar) {
        m2.y b10 = h4.g.b(2, "SELECT * FROM HeartRateRecord WHERE userId=? AND date=?", 1, j10, date, "date");
        b10.p(2, dg.a.a(date));
        return m2.f.f(this.f20650a, new CancellationSignal(), new k2(this, b10), cVar);
    }

    @Override // mg.z1
    public final Object n(long j10, Date date, d.u uVar) {
        m2.y b10 = h4.g.b(2, "SELECT * FROM HeartRateSyncInfo WHERE userId=? AND date=?", 1, j10, date, "date");
        b10.p(2, dg.a.a(date));
        return m2.f.f(this.f20650a, new CancellationSignal(), new r2(this, b10), uVar);
    }

    @Override // mg.z1
    public final Object o(final long j10, final Calendar calendar, final Date date, final int i10, d.l0 l0Var) {
        return m2.w.b(this.f20650a, new fm.l() { // from class: mg.b2
            @Override // fm.l
            public final Object k(Object obj) {
                a3 a3Var = a3.this;
                a3Var.getClass();
                return z1.p(a3Var, j10, calendar, date, i10, (xl.d) obj);
            }
        }, l0Var);
    }

    @Override // mg.z1
    public final Object q(long j10, Date date, a2 a2Var) {
        m2.y b10 = h4.g.b(2, "SELECT time AS time,heartRate AS heartRate FROM HeartRateItem WHERE userId=? AND uploadFlag=0 AND time>=? ORDER BY time ASC", 1, j10, date, "date");
        return m2.f.f(this.f20650a, j.a(date, b10, 2), new o2(this, b10), a2Var);
    }

    @Override // mg.z1
    public final Object r(long j10, Date date, d.v vVar) {
        m2.y b10 = h4.g.b(2, "SELECT COUNT(*) FROM HeartRateItem WHERE userId=? AND uploadFlag=0 AND time>=?", 1, j10, date, "date");
        return m2.f.f(this.f20650a, j.a(date, b10, 2), new q2(this, b10), vVar);
    }

    @Override // mg.z1
    public final Object s(long j10, ArrayList arrayList, og.r0 r0Var) {
        return m2.w.b(this.f20650a, new h(this, j10, arrayList, 1), r0Var);
    }

    @Override // mg.z1
    public final Object u(long j10, List<HeartRateRecordBean> list, xl.d<? super tl.l> dVar) {
        return m2.w.b(this.f20650a, new i(this, j10, list, 1), dVar);
    }

    @Override // mg.z1
    public final Object w(long j10, Date date, int i10, a2 a2Var) {
        return m2.f.g(this.f20650a, new f2(i10, j10, this, date), a2Var);
    }

    @Override // mg.z1
    public final Object x(long j10, Date date, int i10, d.l0 l0Var) {
        return m2.f.g(this.f20650a, new g2(i10, j10, this, date), l0Var);
    }
}
