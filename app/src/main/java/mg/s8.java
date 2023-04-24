package mg;

import android.database.Cursor;
import android.os.CancellationSignal;
import com.topstep.fitcloud.pro.shared.data.bean.data.StepRecordBean;
import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import com.topstep.fitcloud.pro.shared.data.entity.data.StepRecordEntity;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import lg.d;
import mg.v7;

/* loaded from: classes2.dex */
public final class s8 extends v7 {

    /* renamed from: a */
    public final m2.t f21418a;

    /* renamed from: b */
    public final h8 f21419b;

    /* renamed from: c */
    public final k8 f21420c;

    /* renamed from: d */
    public final l8 f21421d;

    /* renamed from: e */
    public final m8 f21422e;

    /* renamed from: f */
    public final n8 f21423f;

    /* renamed from: g */
    public final o8 f21424g;

    /* renamed from: h */
    public final p8 f21425h;

    /* renamed from: i */
    public final q8 f21426i;

    public s8(AppDatabase appDatabase) {
        this.f21418a = appDatabase;
        this.f21419b = new h8(appDatabase);
        this.f21420c = new k8(appDatabase);
        this.f21421d = new l8(appDatabase);
        this.f21422e = new m8(appDatabase);
        this.f21423f = new n8(appDatabase);
        this.f21424g = new o8(appDatabase);
        this.f21425h = new p8(appDatabase);
        this.f21426i = new q8(appDatabase);
    }

    @Override // mg.v7
    public final Object b(long j10, v7.c cVar) {
        return m2.f.g(this.f21418a, new z7(this, j10), cVar);
    }

    @Override // mg.v7
    public final void c(long j10, Date date, Date date2) {
        this.f21418a.b();
        r2.f a10 = this.f21421d.a();
        a10.H(1, j10);
        a10.p(2, dg.a.b(date));
        a10.p(3, dg.a.b(date2));
        this.f21418a.c();
        try {
            a10.r();
            this.f21418a.p();
        } finally {
            this.f21418a.l();
            this.f21421d.c(a10);
        }
    }

    @Override // mg.v7
    public final void d(long j10, String str, Date date, Date date2) {
        this.f21418a.b();
        r2.f a10 = this.f21423f.a();
        a10.H(1, j10);
        if (str == null) {
            a10.m0(2);
        } else {
            a10.p(2, str);
        }
        a10.p(3, dg.a.b(date));
        a10.p(4, dg.a.b(date2));
        this.f21418a.c();
        try {
            a10.r();
            this.f21418a.p();
        } finally {
            this.f21418a.l();
            this.f21423f.c(a10);
        }
    }

    @Override // mg.v7
    public final Object e(long j10, v7.c cVar) {
        return m2.f.g(this.f21418a, new c8(this, j10), cVar);
    }

    @Override // mg.v7
    public final sm.u0 f(long j10, Date date) {
        m2.y b10 = h4.g.b(2, "SELECT * FROM StepRecord WHERE userId=? AND date=?", 1, j10, date, "date");
        b10.p(2, dg.a.a(date));
        return m2.f.c(this.f21418a, new String[]{"StepRecord"}, new f8(this, b10));
    }

    @Override // mg.v7
    public final sm.u0 g(long j10, Date date, Date date2) {
        m2.y b10 = h4.g.b(3, "SELECT * FROM StepRecord WHERE userId=? AND date BETWEEN ? AND ? ORDER BY date ASC", 1, j10, date, "date");
        b10.p(2, dg.a.a(date));
        gm.l.f(date2, "date");
        b10.p(3, dg.a.a(date2));
        return m2.f.c(this.f21418a, new String[]{"StepRecord"}, new g8(this, b10));
    }

    @Override // mg.v7
    public final Object h(List list, v7.g gVar) {
        return m2.f.g(this.f21418a, new r8(this, list), gVar);
    }

    @Override // mg.v7
    public final Object i(StepRecordEntity stepRecordEntity, zl.c cVar) {
        return m2.f.g(this.f21418a, new y7(this, stepRecordEntity), cVar);
    }

    @Override // mg.v7
    public final Object j(ArrayList arrayList, v7.g gVar) {
        return m2.f.g(this.f21418a, new x7(this, arrayList), gVar);
    }

    @Override // mg.v7
    public final Object l(long j10, Date date, Date date2, v7.d dVar) {
        m2.y h10 = m2.y.h(3, "SELECT * FROM StepItem WHERE userId=? AND time BETWEEN ? AND ? ORDER BY time ASC");
        h10.H(1, j10);
        h10.p(2, dg.a.b(date));
        return m2.f.f(this.f21418a, j.a(date2, h10, 3), new e8(this, h10), dVar);
    }

    @Override // mg.v7
    public final v7.b m(long j10, Date date, Date date2) {
        v7.b bVar;
        m2.y h10 = m2.y.h(3, "SELECT SUM(step) AS step,SUM(distance) AS distance,SUM(calorie) AS calorie FROM StepItem WHERE userId=? AND time BETWEEN ? AND ?");
        h10.H(1, j10);
        h10.p(2, dg.a.b(date));
        h10.p(3, dg.a.b(date2));
        this.f21418a.b();
        Cursor r10 = o8.b.r(this.f21418a, h10);
        try {
            if (r10.moveToFirst()) {
                bVar = new v7.b(r10.getFloat(1), r10.getFloat(2), r10.getInt(0));
            } else {
                bVar = null;
            }
            return bVar;
        } finally {
            r10.close();
            h10.j();
        }
    }

    @Override // mg.v7
    public final Object n(long j10, Date date, zl.c cVar) {
        m2.y b10 = h4.g.b(2, "SELECT * FROM StepRecord WHERE userId=? AND date=?", 1, j10, date, "date");
        b10.p(2, dg.a.a(date));
        return m2.f.f(this.f21418a, new CancellationSignal(), new d8(this, b10), cVar);
    }

    @Override // mg.v7
    public final Object o(final long j10, final Date date, final int i10, d.p0 p0Var) {
        return m2.w.b(this.f21418a, new fm.l() { // from class: mg.w7
            @Override // fm.l
            public final Object k(Object obj) {
                s8 s8Var = this;
                s8Var.getClass();
                return v7.p(s8Var, j10, date, i10, (xl.d) obj);
            }
        }, p0Var);
    }

    @Override // mg.v7
    public final Object q(long j10, Date date, v7.e eVar) {
        m2.y b10 = h4.g.b(2, "SELECT * FROM StepRecord WHERE userId=? AND uploadFlag=0 AND date>=?", 1, j10, date, "date");
        b10.p(2, dg.a.a(date));
        return m2.f.f(this.f21418a, new CancellationSignal(), new j8(this, b10), eVar);
    }

    @Override // mg.v7
    public final Object r(long j10, Date date, d.v vVar) {
        m2.y h10 = m2.y.h(2, "SELECT COUNT(*) FROM StepRecord WHERE userId=? AND uploadFlag=0 AND date>=?");
        h10.H(1, j10);
        h10.p(2, dg.a.b(date));
        return m2.f.f(this.f21418a, new CancellationSignal(), new i8(this, h10), vVar);
    }

    @Override // mg.v7
    public final Object s(long j10, StepRecordEntity stepRecordEntity, xl.d<? super tl.l> dVar) {
        return m2.w.b(this.f21418a, new a5(this, j10, stepRecordEntity, 2), dVar);
    }

    @Override // mg.v7
    public final Object t(long j10, ArrayList arrayList, og.r0 r0Var) {
        return m2.w.b(this.f21418a, new k1(this, j10, arrayList, 2), r0Var);
    }

    @Override // mg.v7
    public final Object w(long j10, List<StepRecordBean> list, xl.d<? super tl.l> dVar) {
        return m2.w.b(this.f21418a, new i(this, j10, list, 4), dVar);
    }

    @Override // mg.v7
    public final Object y(long j10, Date date, int i10, v7.e eVar) {
        return m2.f.g(this.f21418a, new a8(i10, j10, this, date), eVar);
    }

    @Override // mg.v7
    public final Object z(long j10, Date date, int i10, d.p0 p0Var) {
        return m2.f.g(this.f21418a, new b8(i10, j10, this, date), p0Var);
    }
}
