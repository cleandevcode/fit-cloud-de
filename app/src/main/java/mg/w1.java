package mg;

import android.os.CancellationSignal;
import com.topstep.fitcloud.pro.model.data.SimpleEcgRecord;
import com.topstep.fitcloud.pro.shared.data.bean.data.EcgRecordBean;
import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import jg.b;
import lg.d;
import mg.h1;

/* loaded from: classes2.dex */
public final class w1 extends h1 {

    /* renamed from: a */
    public final m2.t f21571a;

    /* renamed from: b */
    public final r1 f21572b;

    /* renamed from: c */
    public final s1 f21573c;

    /* renamed from: d */
    public final t1 f21574d;

    /* renamed from: e */
    public final u1 f21575e;

    /* renamed from: f */
    public final v1 f21576f;

    /* loaded from: classes2.dex */
    public class a implements Callable<tl.l> {

        /* renamed from: a */
        public final /* synthetic */ rg.d f21577a;

        public a(rg.d dVar) {
            w1.this = r1;
            this.f21577a = dVar;
        }

        @Override // java.util.concurrent.Callable
        public final tl.l call() {
            w1.this.f21571a.c();
            try {
                w1.this.f21572b.e(this.f21577a);
                w1.this.f21571a.p();
                return tl.l.f28297a;
            } finally {
                w1.this.f21571a.l();
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Callable<tl.l> {

        /* renamed from: a */
        public final /* synthetic */ List f21579a;

        public b(List list) {
            w1.this = r1;
            this.f21579a = list;
        }

        @Override // java.util.concurrent.Callable
        public final tl.l call() {
            w1.this.f21571a.c();
            try {
                w1.this.f21573c.f(this.f21579a);
                w1.this.f21571a.p();
                return tl.l.f28297a;
            } finally {
                w1.this.f21571a.l();
            }
        }
    }

    public w1(AppDatabase appDatabase) {
        this.f21571a = appDatabase;
        this.f21572b = new r1(appDatabase);
        this.f21573c = new s1(appDatabase);
        this.f21574d = new t1(appDatabase);
        this.f21575e = new u1(appDatabase);
        this.f21576f = new v1(appDatabase);
    }

    @Override // mg.h1
    public final Object a(long j10, b.C0309b c0309b) {
        return m2.f.g(this.f21571a, new m1(this, j10), c0309b);
    }

    @Override // mg.h1
    public final sm.u0 b(long j10, Date date) {
        m2.y b10 = h4.g.b(2, "SELECT ecgId AS ecgId, time AS time FROM EcgRecord WHERE userId=? AND time>=? ORDER BY time ASC", 1, j10, date, "date");
        b10.p(2, dg.a.b(date));
        return m2.f.c(this.f21571a, new String[]{"EcgRecord"}, new o1(this, b10));
    }

    @Override // mg.h1
    public final Object c(rg.d dVar, xl.d<? super tl.l> dVar2) {
        return m2.f.g(this.f21571a, new a(dVar), dVar2);
    }

    @Override // mg.h1
    public final Object d(List<rg.d> list, xl.d<? super tl.l> dVar) {
        return m2.f.g(this.f21571a, new b(list), dVar);
    }

    @Override // mg.h1
    public final Object e(rg.d dVar, h1.b bVar) {
        return m2.f.g(this.f21571a, new x1(this, dVar), bVar);
    }

    @Override // mg.h1
    public final Object f(UUID uuid, zl.c cVar) {
        m2.y h10 = m2.y.h(1, "SELECT * FROM EcgRecord WHERE ecgId=?");
        gm.l.f(uuid, "uuid");
        String uuid2 = uuid.toString();
        gm.l.e(uuid2, "uuid.toString()");
        h10.p(1, uuid2);
        return m2.f.f(this.f21571a, new CancellationSignal(), new n1(this, h10), cVar);
    }

    @Override // mg.h1
    public final Object g(long j10, Date date, d.k0 k0Var) {
        m2.y b10 = h4.g.b(2, "SELECT * FROM EcgRecord WHERE userId=? AND uploadFlag=0 AND time>=?", 1, j10, date, "date");
        return m2.f.f(this.f21571a, j.a(date, b10, 2), new q1(this, b10), k0Var);
    }

    @Override // mg.h1
    public final Object h(long j10, Date date, d.v vVar) {
        m2.y b10 = h4.g.b(2, "SELECT COUNT(*) FROM EcgRecord WHERE userId=? AND uploadFlag=0 AND time>=?", 1, j10, date, "date");
        return m2.f.f(this.f21571a, j.a(date, b10, 2), new p1(this, b10), vVar);
    }

    @Override // mg.h1
    public final Object i(long j10, List<rg.d> list, xl.d<? super tl.l> dVar) {
        return m2.w.b(this.f21571a, new i1(this, j10, list, 0), dVar);
    }

    @Override // mg.h1
    public final Object j(long j10, EcgRecordBean ecgRecordBean, xl.d<? super tl.l> dVar) {
        return m2.w.b(this.f21571a, new j1(this, j10, ecgRecordBean, 0), dVar);
    }

    @Override // mg.h1
    public final Object k(long j10, List<SimpleEcgRecord> list, xl.d<? super tl.l> dVar) {
        return m2.w.b(this.f21571a, new k1(this, j10, list, 0), dVar);
    }

    @Override // mg.h1
    public final Object m(UUID uuid, List list, d.t tVar) {
        return m2.f.g(this.f21571a, new l1(this, list, uuid), tVar);
    }

    @Override // mg.h1
    public final Object n(UUID uuid, zl.c cVar) {
        return m2.f.g(this.f21571a, new y1(this, uuid), cVar);
    }
}
