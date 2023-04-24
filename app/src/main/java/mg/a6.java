package mg;

import android.os.CancellationSignal;
import com.topstep.fitcloud.pro.shared.data.bean.data.PressureRecordBean;
import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import lg.d;
import mg.y4;

/* loaded from: classes2.dex */
public final class a6 extends y4 {

    /* renamed from: a */
    public final m2.t f20665a;

    /* renamed from: b */
    public final m5 f20666b;

    /* renamed from: c */
    public final s5 f20667c;

    /* renamed from: d */
    public final t5 f20668d;

    /* renamed from: e */
    public final u5 f20669e;

    /* renamed from: f */
    public final v5 f20670f;

    /* renamed from: g */
    public final w5 f20671g;

    /* renamed from: h */
    public final x5 f20672h;

    /* renamed from: i */
    public final y5 f20673i;

    public a6(AppDatabase appDatabase) {
        this.f20665a = appDatabase;
        this.f20666b = new m5(appDatabase);
        this.f20667c = new s5(appDatabase);
        this.f20668d = new t5(appDatabase);
        this.f20669e = new u5(appDatabase);
        this.f20670f = new v5(appDatabase);
        this.f20671g = new w5(appDatabase);
        this.f20672h = new x5(appDatabase);
        this.f20673i = new y5(appDatabase);
    }

    @Override // mg.y4
    public final Object b(long j10, y4.a aVar) {
        return m2.f.g(this.f20665a, new h5(this, j10), aVar);
    }

    @Override // mg.y4
    public final Object c(long j10, y4.a aVar) {
        return m2.f.g(this.f20665a, new i5(this, j10), aVar);
    }

    @Override // mg.y4
    public final Object d(long j10, y4.a aVar) {
        return m2.f.g(this.f20665a, new j5(this, j10), aVar);
    }

    @Override // mg.y4
    public final sm.u0 e(long j10, Date date, Date date2) {
        m2.y b10 = h4.g.b(3, "SELECT * FROM PressureRecord WHERE userId=? AND date BETWEEN ? AND ? ORDER BY date ASC", 1, j10, date, "date");
        b10.p(2, dg.a.a(date));
        gm.l.f(date2, "date");
        b10.p(3, dg.a.a(date2));
        return m2.f.c(this.f20665a, new String[]{"PressureRecord"}, new p5(this, b10));
    }

    @Override // mg.y4
    public final Object f(List list, zl.c cVar) {
        return m2.f.g(this.f20665a, new z5(this, list), cVar);
    }

    @Override // mg.y4
    public final Object g(rg.m mVar, y4.d dVar) {
        return m2.f.g(this.f20665a, new d5(this, mVar), dVar);
    }

    @Override // mg.y4
    public final Object h(ArrayList arrayList, y4.c cVar) {
        return m2.f.g(this.f20665a, new c5(this, arrayList), cVar);
    }

    @Override // mg.y4
    public final Object i(rg.n nVar, d.x xVar) {
        return m2.f.g(this.f20665a, new e5(this, nVar), xVar);
    }

    @Override // mg.y4
    public final Object k(long j10, Date date, Date date2, y4.b bVar) {
        m2.y h10 = m2.y.h(3, "SELECT * FROM PressureItem WHERE userId=? AND time BETWEEN ? AND ?");
        h10.H(1, j10);
        h10.p(2, dg.a.b(date));
        return m2.f.f(this.f20665a, j.a(date2, h10, 3), new l5(this, h10), bVar);
    }

    @Override // mg.y4
    public final Object l(long j10, Date date, Date date2, zl.c cVar) {
        m2.y h10 = m2.y.h(3, "SELECT AVG(pressure) FROM PressureItem WHERE userId=? AND time BETWEEN ? AND ?");
        h10.H(1, j10);
        h10.p(2, dg.a.b(date));
        return m2.f.f(this.f20665a, j.a(date2, h10, 3), new n5(this, h10), cVar);
    }

    @Override // mg.y4
    public final Object m(long j10, Date date, zl.c cVar) {
        m2.y b10 = h4.g.b(2, "SELECT * FROM PressureRecord WHERE userId=? AND date=?", 1, j10, date, "date");
        b10.p(2, dg.a.a(date));
        return m2.f.f(this.f20665a, new CancellationSignal(), new k5(this, b10), cVar);
    }

    @Override // mg.y4
    public final Object n(long j10, Date date, d.x xVar) {
        m2.y b10 = h4.g.b(2, "SELECT * FROM PressureSyncInfo WHERE userId=? AND date=?", 1, j10, date, "date");
        b10.p(2, dg.a.a(date));
        return m2.f.f(this.f20665a, new CancellationSignal(), new r5(this, b10), xVar);
    }

    @Override // mg.y4
    public final Object o(long j10, Calendar calendar, Date date, int i10, d.n0 n0Var) {
        return m2.w.b(this.f20665a, new b5(this, j10, calendar, date, i10, 0), n0Var);
    }

    @Override // mg.y4
    public final Object q(long j10, Date date, z4 z4Var) {
        m2.y b10 = h4.g.b(2, "SELECT time AS time,pressure AS pressure FROM PressureItem WHERE userId=? AND uploadFlag=0 AND time>=? ORDER BY time ASC", 1, j10, date, "date");
        return m2.f.f(this.f20665a, j.a(date, b10, 2), new o5(this, b10), z4Var);
    }

    @Override // mg.y4
    public final Object r(long j10, Date date, d.v vVar) {
        m2.y b10 = h4.g.b(2, "SELECT COUNT(*) FROM PressureItem WHERE userId=? AND uploadFlag=0 AND time>=?", 1, j10, date, "date");
        return m2.f.f(this.f20665a, j.a(date, b10, 2), new q5(this, b10), vVar);
    }

    @Override // mg.y4
    public final Object s(long j10, ArrayList arrayList, og.r0 r0Var) {
        return m2.w.b(this.f20665a, new a5(this, j10, arrayList, 0), r0Var);
    }

    @Override // mg.y4
    public final Object u(long j10, List<PressureRecordBean> list, xl.d<? super tl.l> dVar) {
        return m2.w.b(this.f20665a, new i1(this, j10, list, 1), dVar);
    }

    @Override // mg.y4
    public final Object w(long j10, Date date, int i10, z4 z4Var) {
        return m2.f.g(this.f20665a, new f5(i10, j10, this, date), z4Var);
    }

    @Override // mg.y4
    public final Object x(long j10, Date date, int i10, d.n0 n0Var) {
        return m2.f.g(this.f20665a, new g5(i10, j10, this, date), n0Var);
    }
}
