package mg;

import android.os.CancellationSignal;
import com.topstep.fitcloud.pro.shared.data.bean.data.TemperatureRecordBean;
import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import lg.d;
import mg.l9;

/* loaded from: classes2.dex */
public final class la extends l9 {

    /* renamed from: a */
    public final m2.t f21260a;

    /* renamed from: b */
    public final x9 f21261b;

    /* renamed from: c */
    public final da f21262c;

    /* renamed from: d */
    public final ea f21263d;

    /* renamed from: e */
    public final fa f21264e;

    /* renamed from: f */
    public final ga f21265f;

    /* renamed from: g */
    public final ha f21266g;

    /* renamed from: h */
    public final ia f21267h;

    /* renamed from: i */
    public final ja f21268i;

    public la(AppDatabase appDatabase) {
        this.f21260a = appDatabase;
        this.f21261b = new x9(appDatabase);
        this.f21262c = new da(appDatabase);
        this.f21263d = new ea(appDatabase);
        this.f21264e = new fa(appDatabase);
        this.f21265f = new ga(appDatabase);
        this.f21266g = new ha(appDatabase);
        this.f21267h = new ia(appDatabase);
        this.f21268i = new ja(appDatabase);
    }

    @Override // mg.l9
    public final Object b(long j10, l9.b bVar) {
        return m2.f.g(this.f21260a, new s9(this, j10), bVar);
    }

    @Override // mg.l9
    public final Object c(long j10, l9.b bVar) {
        return m2.f.g(this.f21260a, new t9(this, j10), bVar);
    }

    @Override // mg.l9
    public final Object d(long j10, l9.b bVar) {
        return m2.f.g(this.f21260a, new u9(this, j10), bVar);
    }

    @Override // mg.l9
    public final sm.u0 e(long j10, Date date, Date date2) {
        m2.y b10 = h4.g.b(3, "SELECT * FROM TemperatureRecord WHERE userId=? AND date BETWEEN ? AND ? ORDER BY date ASC", 1, j10, date, "date");
        b10.p(2, dg.a.a(date));
        gm.l.f(date2, "date");
        b10.p(3, dg.a.a(date2));
        return m2.f.c(this.f21260a, new String[]{"TemperatureRecord"}, new aa(this, b10));
    }

    @Override // mg.l9
    public final Object f(List list, zl.c cVar) {
        return m2.f.g(this.f21260a, new ka(this, list), cVar);
    }

    @Override // mg.l9
    public final Object g(rg.t tVar, l9.e eVar) {
        return m2.f.g(this.f21260a, new o9(this, tVar), eVar);
    }

    @Override // mg.l9
    public final Object h(ArrayList arrayList, l9.d dVar) {
        return m2.f.g(this.f21260a, new n9(this, arrayList), dVar);
    }

    @Override // mg.l9
    public final Object i(rg.u uVar, d.z zVar) {
        return m2.f.g(this.f21260a, new p9(this, uVar), zVar);
    }

    @Override // mg.l9
    public final Object k(long j10, Date date, Date date2, l9.c cVar) {
        m2.y h10 = m2.y.h(3, "SELECT * FROM TemperatureItem WHERE userId=? AND time BETWEEN ? AND ?");
        h10.H(1, j10);
        h10.p(2, dg.a.b(date));
        return m2.f.f(this.f21260a, j.a(date2, h10, 3), new w9(this, h10), cVar);
    }

    @Override // mg.l9
    public final Object l(long j10, Date date, Date date2, zl.c cVar) {
        m2.y h10 = m2.y.h(3, "SELECT AVG(body) AS avgBody,AVG(wrist) AS avgWrist FROM TemperatureItem WHERE userId=? AND time BETWEEN ? AND ?");
        h10.H(1, j10);
        h10.p(2, dg.a.b(date));
        return m2.f.f(this.f21260a, j.a(date2, h10, 3), new y9(this, h10), cVar);
    }

    @Override // mg.l9
    public final Object m(long j10, Date date, zl.c cVar) {
        m2.y b10 = h4.g.b(2, "SELECT * FROM TemperatureRecord WHERE userId=? AND date=?", 1, j10, date, "date");
        b10.p(2, dg.a.a(date));
        return m2.f.f(this.f21260a, new CancellationSignal(), new v9(this, b10), cVar);
    }

    @Override // mg.l9
    public final Object n(long j10, Date date, d.z zVar) {
        m2.y b10 = h4.g.b(2, "SELECT * FROM TemperatureSyncInfo WHERE userId=? AND date=?", 1, j10, date, "date");
        b10.p(2, dg.a.a(date));
        return m2.f.f(this.f21260a, new CancellationSignal(), new ca(this, b10), zVar);
    }

    @Override // mg.l9
    public final Object o(long j10, Calendar calendar, Date date, int i10, d.q0 q0Var) {
        return m2.w.b(this.f21260a, new b5(this, j10, calendar, date, i10, 1), q0Var);
    }

    @Override // mg.l9
    public final Object q(long j10, Date date, m9 m9Var) {
        m2.y b10 = h4.g.b(2, "SELECT time AS time,body AS body,wrist AS wrist FROM TemperatureItem WHERE userId=? AND uploadFlag=0 AND time>=? ORDER BY time ASC", 1, j10, date, "date");
        return m2.f.f(this.f21260a, j.a(date, b10, 2), new z9(this, b10), m9Var);
    }

    @Override // mg.l9
    public final Object r(long j10, Date date, d.v vVar) {
        m2.y b10 = h4.g.b(2, "SELECT COUNT(*) FROM TemperatureItem WHERE userId=? AND uploadFlag=0 AND time>=?", 1, j10, date, "date");
        return m2.f.f(this.f21260a, j.a(date, b10, 2), new ba(this, b10), vVar);
    }

    @Override // mg.l9
    public final Object s(long j10, ArrayList arrayList, og.r0 r0Var) {
        return m2.w.b(this.f21260a, new i1(this, j10, arrayList, 3), r0Var);
    }

    @Override // mg.l9
    public final Object u(long j10, List<TemperatureRecordBean> list, xl.d<? super tl.l> dVar) {
        return m2.w.b(this.f21260a, new j1(this, j10, list, 2), dVar);
    }

    @Override // mg.l9
    public final Object w(long j10, Date date, int i10, m9 m9Var) {
        return m2.f.g(this.f21260a, new q9(i10, j10, this, date), m9Var);
    }

    @Override // mg.l9
    public final Object x(long j10, Date date, int i10, d.q0 q0Var) {
        return m2.f.g(this.f21260a, new r9(i10, j10, this, date), q0Var);
    }
}
