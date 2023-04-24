package mg;

import com.topstep.fitcloud.pro.shared.data.bean.data.SleepRecordBean;
import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import java.util.Date;
import java.util.List;
import lg.d;
import mg.c6;

/* loaded from: classes2.dex */
public final class c7 extends c6 {

    /* renamed from: b */
    public final m2.t f20797b;

    /* renamed from: c */
    public final o6 f20798c;

    /* renamed from: d */
    public final u6 f20799d;

    /* renamed from: e */
    public final v6 f20800e;

    /* renamed from: f */
    public final w6 f20801f;

    /* renamed from: g */
    public final x6 f20802g;

    /* renamed from: h */
    public final y6 f20803h;

    /* renamed from: i */
    public final z6 f20804i;

    /* renamed from: j */
    public final a7 f20805j;

    /* renamed from: k */
    public final b7 f20806k;

    public c7(AppDatabase appDatabase) {
        this.f20797b = appDatabase;
        this.f20798c = new o6(appDatabase);
        this.f20799d = new u6(appDatabase);
        this.f20800e = new v6(appDatabase);
        this.f20801f = new w6(appDatabase);
        this.f20802g = new x6(appDatabase);
        this.f20803h = new y6(appDatabase);
        this.f20804i = new z6(appDatabase);
        this.f20805j = new a7(appDatabase);
        this.f20806k = new b7(appDatabase);
    }

    @Override // mg.c6
    public final Object b(long j10, Date date, c6.e eVar) {
        return m2.f.g(this.f20797b, new i6(this, j10, date), eVar);
    }

    @Override // mg.c6
    public final Object c(long j10, Date date, c6.d dVar) {
        return m2.f.g(this.f20797b, new h6(this, j10, date), dVar);
    }

    @Override // mg.c6
    public final Object d(long j10, c6.a aVar) {
        return m2.f.g(this.f20797b, new l6(this, j10), aVar);
    }

    @Override // mg.c6
    public final Object e(long j10, c6.a aVar) {
        return m2.f.g(this.f20797b, new m6(this, j10), aVar);
    }

    @Override // mg.c6
    public final sm.u0 f(long j10, Date date) {
        m2.y b10 = h4.g.b(2, "SELECT * FROM SleepRecord WHERE userId=? AND time=?", 1, j10, date, "date");
        b10.p(2, dg.a.b(date));
        return m2.f.c(this.f20797b, new String[]{"SleepRecord"}, new q6(this, b10));
    }

    @Override // mg.c6
    public final sm.u0 g(long j10, Date date, Date date2) {
        m2.y b10 = h4.g.b(3, "SELECT * FROM SleepRecord WHERE userId=? AND time BETWEEN ? AND ? ORDER BY time ASC", 1, j10, date, "date");
        b10.p(2, dg.a.b(date));
        gm.l.f(date2, "date");
        b10.p(3, dg.a.b(date2));
        return m2.f.c(this.f20797b, new String[]{"SleepRecord"}, new r6(this, b10));
    }

    @Override // mg.c6
    public final Object h(rg.o oVar, c6.c cVar) {
        return m2.f.g(this.f20797b, new e6(this, oVar), cVar);
    }

    @Override // mg.c6
    public final Object i(rg.o oVar, c6.d dVar) {
        return m2.f.g(this.f20797b, new g6(this, oVar), dVar);
    }

    @Override // mg.c6
    public final Object j(rg.p pVar, zl.c cVar) {
        return m2.f.g(this.f20797b, new f6(this, pVar), cVar);
    }

    @Override // mg.c6
    public final Object k(long j10, Date date, zl.c cVar) {
        m2.y b10 = h4.g.b(2, "SELECT * FROM SleepDetail WHERE userId=? AND time=?", 1, j10, date, "date");
        return m2.f.f(this.f20797b, j.a(date, b10, 2), new p6(this, b10), cVar);
    }

    @Override // mg.c6
    public final Object l(long j10, Date date, d.y yVar) {
        m2.y b10 = h4.g.b(2, "SELECT * FROM SleepRecord WHERE userId=? AND time=?", 1, j10, date, "date");
        return m2.f.f(this.f20797b, j.a(date, b10, 2), new n6(this, b10), yVar);
    }

    @Override // mg.c6
    public final Object m(final long j10, final Date date, final int i10, d.o0 o0Var) {
        return m2.w.b(this.f20797b, new fm.l() { // from class: mg.d6
            @Override // fm.l
            public final Object k(Object obj) {
                c7 c7Var = this;
                c7Var.getClass();
                return c6.n(c7Var, j10, date, i10, (xl.d) obj);
            }
        }, o0Var);
    }

    @Override // mg.c6
    public final Object o(long j10, Date date, c6.b bVar) {
        m2.y b10 = h4.g.b(2, "SELECT * FROM SleepDetail WHERE userId=? AND uploadFlag=0 AND time>=? ORDER BY time ASC", 1, j10, date, "date");
        return m2.f.f(this.f20797b, j.a(date, b10, 2), new t6(this, b10), bVar);
    }

    @Override // mg.c6
    public final Object p(long j10, Date date, d.v vVar) {
        m2.y b10 = h4.g.b(2, "SELECT COUNT(*) FROM SleepDetail WHERE userId=? AND uploadFlag=0 AND time>=?", 1, j10, date, "date");
        return m2.f.f(this.f20797b, j.a(date, b10, 2), new s6(this, b10), vVar);
    }

    @Override // mg.c6
    public final Object q(long j10, oj.h hVar, d.g0 g0Var) {
        return m2.w.b(this.f20797b, new h(this, j10, hVar, 2), g0Var);
    }

    @Override // mg.c6
    public final Object s(long j10, SleepRecordBean sleepRecordBean, d.y yVar) {
        return m2.w.b(this.f20797b, new a5(this, j10, sleepRecordBean, 1), yVar);
    }

    @Override // mg.c6
    public final Object u(long j10, List<SleepRecordBean> list, xl.d<? super tl.l> dVar) {
        return m2.w.b(this.f20797b, new i(this, j10, list, 3), dVar);
    }

    @Override // mg.c6
    public final Object w(long j10, Date date, int i10, c6.b bVar) {
        return m2.f.g(this.f20797b, new j6(i10, j10, this, date), bVar);
    }

    @Override // mg.c6
    public final Object x(long j10, Date date, int i10, d.o0 o0Var) {
        return m2.f.g(this.f20797b, new k6(i10, j10, this, date), o0Var);
    }
}
