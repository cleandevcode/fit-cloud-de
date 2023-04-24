package mg;

import ah.e;
import android.os.CancellationSignal;
import bh.b;
import bh.c;
import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import com.topstep.fitcloud.pro.shared.data.wh.WhMenstruationConfig;
import java.util.Calendar;
import java.util.Date;
import jg.b;
import mg.c3;

/* loaded from: classes2.dex */
public final class j3 extends c3 {

    /* renamed from: b */
    public final AppDatabase f21158b;

    /* renamed from: c */
    public final a f21159c;

    /* renamed from: d */
    public final b f21160d;

    /* renamed from: e */
    public final c f21161e;

    /* renamed from: f */
    public final d f21162f;

    /* loaded from: classes2.dex */
    public class a extends m2.i<pg.g> {
        public a(m2.t tVar) {
            super(tVar);
        }

        @Override // m2.a0
        public final String b() {
            return "INSERT OR REPLACE INTO `MenstruationTimeline` (`id`,`userId`,`date`,`type`,`extra`) VALUES (nullif(?, 0),?,?,?,?)";
        }

        @Override // m2.i
        public final void d(r2.f fVar, pg.g gVar) {
            pg.g gVar2 = gVar;
            fVar.H(1, gVar2.f24041a);
            fVar.H(2, gVar2.f24042b);
            Date date = gVar2.f24043c;
            gm.l.f(date, "date");
            fVar.p(3, dg.a.a(date));
            fVar.H(4, gVar2.f24044d);
            String str = gVar2.f24045e;
            if (str == null) {
                fVar.m0(5);
            } else {
                fVar.p(5, str);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b extends m2.a0 {
        public b(m2.t tVar) {
            super(tVar);
        }

        @Override // m2.a0
        public final String b() {
            return "DELETE FROM MenstruationTimeline WHERE userId=? AND date>=?";
        }
    }

    /* loaded from: classes2.dex */
    public class c extends m2.a0 {
        public c(m2.t tVar) {
            super(tVar);
        }

        @Override // m2.a0
        public final String b() {
            return "DELETE FROM MenstruationTimeline WHERE userId=? AND type=1 AND date>? AND date<?";
        }
    }

    /* loaded from: classes2.dex */
    public class d extends m2.a0 {
        public d(m2.t tVar) {
            super(tVar);
        }

        @Override // m2.a0
        public final String b() {
            return "DELETE FROM MenstruationTimeline WHERE userId=?";
        }
    }

    public j3(AppDatabase appDatabase) {
        super(appDatabase);
        this.f21158b = appDatabase;
        this.f21159c = new a(appDatabase);
        this.f21160d = new b(appDatabase);
        this.f21161e = new c(appDatabase);
        this.f21162f = new d(appDatabase);
    }

    @Override // mg.c3
    public final Object a(long j10, b.C0309b c0309b) {
        return m2.f.g(this.f21158b, new n3(this, j10), c0309b);
    }

    @Override // mg.c3
    public final Object b(long j10, Date date, Date date2, zl.c cVar) {
        return m2.f.g(this.f21158b, new m3(this, j10, date, date2), cVar);
    }

    @Override // mg.c3
    public final Object c(long j10, Date date, c3.c cVar) {
        return m2.f.g(this.f21158b, new l3(this, j10, date), cVar);
    }

    @Override // mg.c3
    public final sm.u0 d(long j10) {
        m2.y h10 = m2.y.h(1, "SELECT * FROM MenstruationTimeline WHERE userId=? AND type=0 ORDER BY date DESC LIMIT 1");
        h10.H(1, j10);
        return m2.f.c(this.f21158b, new String[]{"MenstruationTimeline"}, new f3(this, h10));
    }

    @Override // mg.c3
    public final Object e(long j10, c3.b bVar) {
        m2.y h10 = m2.y.h(1, "SELECT COUNT(*) FROM MenstruationTimeline WHERE userId=?");
        h10.H(1, j10);
        return m2.f.f(this.f21158b, new CancellationSignal(), new o3(this, h10), bVar);
    }

    @Override // mg.c3
    public final Object f(final long j10, final Calendar calendar, final Date date, xl.d dVar) {
        return m2.w.b(this.f21158b, new fm.l() { // from class: mg.e3
            @Override // fm.l
            public final Object k(Object obj) {
                Object f10;
                f10 = super/*mg.c3*/.f(j10, calendar, date, (xl.d) obj);
                return f10;
            }
        }, dVar);
    }

    @Override // mg.c3
    public final Object i(long j10, Date date, Date date2, c.a aVar) {
        m2.y b10 = h4.g.b(3, "SELECT date FROM MenstruationTimeline WHERE userId=? AND type=1 AND date>? AND date<?", 1, j10, date, "date");
        b10.p(2, dg.a.a(date));
        gm.l.f(date2, "date");
        b10.p(3, dg.a.a(date2));
        return m2.f.f(this.f21158b, new CancellationSignal(), new i3(this, b10), aVar);
    }

    @Override // mg.c3
    public final Object j(long j10, Date date, c3.a aVar) {
        m2.y b10 = h4.g.b(2, "SELECT * FROM MenstruationTimeline WHERE userId=? AND type=0 AND date<=? ORDER BY date DESC LIMIT 1", 1, j10, date, "date");
        b10.p(2, dg.a.a(date));
        return m2.f.f(this.f21158b, new CancellationSignal(), new g3(this, b10), aVar);
    }

    @Override // mg.c3
    public final Object k(long j10, Date date, c3.a aVar) {
        m2.y b10 = h4.g.b(2, "SELECT date FROM MenstruationTimeline WHERE userId=? AND type=0 AND date>? ORDER BY date ASC LIMIT 1", 1, j10, date, "date");
        b10.p(2, dg.a.a(date));
        return m2.f.f(this.f21158b, new CancellationSignal(), new h3(this, b10), aVar);
    }

    @Override // mg.c3
    public final Object l(pg.g gVar, zl.c cVar) {
        return m2.f.g(this.f21158b, new k3(this, gVar), cVar);
    }

    @Override // mg.c3
    public final Object m(long j10, WhMenstruationConfig whMenstruationConfig, e.C0006e c0006e) {
        return m2.w.b(this.f21158b, new j1(this, j10, whMenstruationConfig, 1), c0006e);
    }

    @Override // mg.c3
    public final Object o(final long j10, final Date date, final Date date2, final Date date3, b.a aVar) {
        return m2.w.b(this.f21158b, new fm.l() { // from class: mg.d3
            @Override // fm.l
            public final Object k(Object obj) {
                j3 j3Var = j3.this;
                j3Var.getClass();
                return c3.p(j3Var, j10, date, date2, date3, (xl.d) obj);
            }
        }, aVar);
    }
}
