package mg;

import android.os.CancellationSignal;
import com.topstep.fitcloud.pro.shared.data.bean.data.BloodPressureRecordBean;
import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import lg.d;
import mg.e;

/* loaded from: classes2.dex */
public final class i0 extends e {

    /* renamed from: a */
    public final m2.t f21100a;

    /* renamed from: b */
    public final u f21101b;

    /* renamed from: c */
    public final a0 f21102c;

    /* renamed from: d */
    public final b0 f21103d;

    /* renamed from: e */
    public final c0 f21104e;

    /* renamed from: f */
    public final d0 f21105f;

    /* renamed from: g */
    public final e0 f21106g;

    /* renamed from: h */
    public final f0 f21107h;

    /* renamed from: i */
    public final g0 f21108i;

    public i0(AppDatabase appDatabase) {
        this.f21100a = appDatabase;
        this.f21101b = new u(appDatabase);
        this.f21102c = new a0(appDatabase);
        this.f21103d = new b0(appDatabase);
        this.f21104e = new c0(appDatabase);
        this.f21105f = new d0(appDatabase);
        this.f21106g = new e0(appDatabase);
        this.f21107h = new f0(appDatabase);
        this.f21108i = new g0(appDatabase);
    }

    @Override // mg.e
    public final Object b(long j10, e.b bVar) {
        return m2.f.g(this.f21100a, new p(this, j10), bVar);
    }

    @Override // mg.e
    public final Object c(long j10, e.b bVar) {
        return m2.f.g(this.f21100a, new q(this, j10), bVar);
    }

    @Override // mg.e
    public final Object d(long j10, e.b bVar) {
        return m2.f.g(this.f21100a, new r(this, j10), bVar);
    }

    @Override // mg.e
    public final sm.u0 e(long j10, Date date, Date date2) {
        m2.y b10 = h4.g.b(3, "SELECT * FROM BloodPressureRecord WHERE userId=? AND date BETWEEN ? AND ? ORDER BY date ASC", 1, j10, date, "date");
        b10.p(2, dg.a.a(date));
        gm.l.f(date2, "date");
        b10.p(3, dg.a.a(date2));
        return m2.f.c(this.f21100a, new String[]{"BloodPressureRecord"}, new x(this, b10));
    }

    @Override // mg.e
    public final Object f(List list, zl.c cVar) {
        return m2.f.g(this.f21100a, new h0(this, list), cVar);
    }

    @Override // mg.e
    public final Object g(rg.b bVar, e.C0377e c0377e) {
        return m2.f.g(this.f21100a, new l(this, bVar), c0377e);
    }

    @Override // mg.e
    public final Object h(ArrayList arrayList, e.d dVar) {
        return m2.f.g(this.f21100a, new k(this, arrayList), dVar);
    }

    @Override // mg.e
    public final Object i(rg.c cVar, d.r rVar) {
        return m2.f.g(this.f21100a, new m(this, cVar), rVar);
    }

    @Override // mg.e
    public final Object k(long j10, Date date, Date date2, e.c cVar) {
        m2.y h10 = m2.y.h(3, "SELECT * FROM BloodPressureItem WHERE userId=? AND time BETWEEN ? AND ?");
        h10.H(1, j10);
        h10.p(2, dg.a.b(date));
        return m2.f.f(this.f21100a, j.a(date2, h10, 3), new t(this, h10), cVar);
    }

    @Override // mg.e
    public final Object l(long j10, Date date, Date date2, zl.c cVar) {
        m2.y h10 = m2.y.h(3, "SELECT AVG(sbp) AS avgSbp,AVG(dbp) AS avgDbp FROM BloodPressureItem WHERE userId=? AND time BETWEEN ? AND ?");
        h10.H(1, j10);
        h10.p(2, dg.a.b(date));
        return m2.f.f(this.f21100a, j.a(date2, h10, 3), new v(this, h10), cVar);
    }

    @Override // mg.e
    public final Object m(long j10, Date date, zl.c cVar) {
        m2.y b10 = h4.g.b(2, "SELECT * FROM BloodPressureRecord WHERE userId=? AND date=?", 1, j10, date, "date");
        b10.p(2, dg.a.a(date));
        return m2.f.f(this.f21100a, new CancellationSignal(), new s(this, b10), cVar);
    }

    @Override // mg.e
    public final Object n(long j10, Date date, d.r rVar) {
        m2.y b10 = h4.g.b(2, "SELECT * FROM BloodPressureSyncInfo WHERE userId=? AND date=?", 1, j10, date, "date");
        b10.p(2, dg.a.a(date));
        return m2.f.f(this.f21100a, new CancellationSignal(), new z(this, b10), rVar);
    }

    @Override // mg.e
    public final Object o(final long j10, final Calendar calendar, final Date date, final int i10, d.i0 i0Var) {
        return m2.w.b(this.f21100a, new fm.l() { // from class: mg.g
            @Override // fm.l
            public final Object k(Object obj) {
                i0 i0Var2 = i0.this;
                i0Var2.getClass();
                return e.p(i0Var2, j10, calendar, date, i10, (xl.d) obj);
            }
        }, i0Var);
    }

    @Override // mg.e
    public final Object q(long j10, Date date, f fVar) {
        m2.y b10 = h4.g.b(2, "SELECT time AS time,sbp AS sbp,dbp AS dbp FROM BloodPressureItem WHERE userId=? AND uploadFlag=0 AND time>=? ORDER BY time ASC", 1, j10, date, "date");
        return m2.f.f(this.f21100a, j.a(date, b10, 2), new w(this, b10), fVar);
    }

    @Override // mg.e
    public final Object r(long j10, Date date, d.v vVar) {
        m2.y b10 = h4.g.b(2, "SELECT COUNT(*) FROM BloodPressureItem WHERE userId=? AND uploadFlag=0 AND time>=?", 1, j10, date, "date");
        return m2.f.f(this.f21100a, j.a(date, b10, 2), new y(this, b10), vVar);
    }

    @Override // mg.e
    public final Object s(long j10, ArrayList arrayList, og.r0 r0Var) {
        return m2.w.b(this.f21100a, new h(this, j10, arrayList, 0), r0Var);
    }

    @Override // mg.e
    public final Object u(long j10, List<BloodPressureRecordBean> list, xl.d<? super tl.l> dVar) {
        return m2.w.b(this.f21100a, new i(this, j10, list, 0), dVar);
    }

    @Override // mg.e
    public final Object w(long j10, Date date, int i10, f fVar) {
        return m2.f.g(this.f21100a, new n(i10, j10, this, date), fVar);
    }

    @Override // mg.e
    public final Object x(long j10, Date date, int i10, d.i0 i0Var) {
        return m2.f.g(this.f21100a, new o(i10, j10, this, date), i0Var);
    }
}
