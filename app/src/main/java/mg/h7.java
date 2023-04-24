package mg;

import android.database.Cursor;
import android.os.CancellationSignal;
import com.topstep.fitcloud.pro.model.data.SportHeartRate;
import com.topstep.fitcloud.pro.model.data.SportLatLng;
import com.topstep.fitcloud.pro.model.data.SportRecord;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import lg.h0;
import lg.r0;
import mg.d7;

/* loaded from: classes2.dex */
public final class h7 extends d7 {

    /* renamed from: a */
    public final m2.t f21063a;

    /* renamed from: b */
    public final d f21064b;

    /* renamed from: c */
    public final e f21065c;

    /* renamed from: d */
    public final f f21066d;

    /* renamed from: e */
    public final g f21067e;

    /* renamed from: f */
    public final h f21068f;

    /* renamed from: g */
    public final i f21069g;

    /* renamed from: h */
    public final j f21070h;

    /* renamed from: i */
    public final k f21071i;

    /* loaded from: classes2.dex */
    public class a implements Callable<tl.l> {

        /* renamed from: a */
        public final /* synthetic */ List f21072a;

        public a(List list) {
            h7.this = r1;
            this.f21072a = list;
        }

        @Override // java.util.concurrent.Callable
        public final tl.l call() {
            h7.this.f21063a.c();
            try {
                h7.this.f21064b.f(this.f21072a);
                h7.this.f21063a.p();
                return tl.l.f28297a;
            } finally {
                h7.this.f21063a.l();
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Callable<tl.l> {

        /* renamed from: a */
        public final /* synthetic */ long f21074a;

        public b(long j10) {
            h7.this = r1;
            this.f21074a = j10;
        }

        @Override // java.util.concurrent.Callable
        public final tl.l call() {
            r2.f a10 = h7.this.f21066d.a();
            a10.H(1, this.f21074a);
            h7.this.f21063a.c();
            try {
                a10.r();
                h7.this.f21063a.p();
                return tl.l.f28297a;
            } finally {
                h7.this.f21063a.l();
                h7.this.f21066d.c(a10);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Callable<Integer> {

        /* renamed from: a */
        public final /* synthetic */ m2.y f21076a;

        public c(m2.y yVar) {
            h7.this = r1;
            this.f21076a = yVar;
        }

        @Override // java.util.concurrent.Callable
        public final Integer call() {
            Integer num;
            Cursor r10 = o8.b.r(h7.this.f21063a, this.f21076a);
            try {
                if (r10.moveToFirst() && !r10.isNull(0)) {
                    num = Integer.valueOf(r10.getInt(0));
                    return num;
                }
                num = null;
                return num;
            } finally {
                r10.close();
                this.f21076a.j();
            }
        }
    }

    /* loaded from: classes2.dex */
    public class d extends m2.i<rg.r> {
        public d(m2.t tVar) {
            super(tVar);
        }

        @Override // m2.a0
        public final String b() {
            return "INSERT OR REPLACE INTO `SportRecord` (`userId`,`sportId`,`time`,`duration`,`distance`,`calorie`,`step`,`climb`,`locationType`,`sportType`,`uploadFlag`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // m2.i
        public final void d(r2.f fVar, rg.r rVar) {
            rg.r rVar2 = rVar;
            fVar.H(1, rVar2.f25649a);
            UUID uuid = rVar2.f25650b;
            gm.l.f(uuid, "uuid");
            String uuid2 = uuid.toString();
            gm.l.e(uuid2, "uuid.toString()");
            fVar.p(2, uuid2);
            Date date = rVar2.f25651c;
            k.f.b(date, "date", date, fVar, 3);
            fVar.H(4, rVar2.f25652d);
            fVar.j0(rVar2.f25653e, 5);
            fVar.j0(rVar2.f25654f, 6);
            fVar.H(7, rVar2.f25655g);
            fVar.j0(rVar2.f25656h, 8);
            fVar.H(9, rVar2.f25657i);
            fVar.H(10, rVar2.f25658j);
            fVar.H(11, rVar2.f25659k);
        }
    }

    /* loaded from: classes2.dex */
    public class e extends m2.i<rg.q> {
        public e(m2.t tVar) {
            super(tVar);
        }

        @Override // m2.a0
        public final String b() {
            return "INSERT OR REPLACE INTO `SportDetail` (`sportId`,`time`,`latLngs`,`heartRates`) VALUES (?,?,?,?)";
        }

        @Override // m2.i
        public final void d(r2.f fVar, rg.q qVar) {
            boolean z10;
            String e10;
            boolean z11;
            rg.q qVar2 = qVar;
            UUID uuid = qVar2.f25645a;
            gm.l.f(uuid, "uuid");
            String uuid2 = uuid.toString();
            gm.l.e(uuid2, "uuid.toString()");
            fVar.p(1, uuid2);
            Date date = qVar2.f25646b;
            k.f.b(date, "date", date, fVar, 2);
            List<SportLatLng> list = qVar2.f25647c;
            if (list != null && !list.isEmpty()) {
                z10 = false;
            } else {
                z10 = true;
            }
            String str = null;
            if (z10) {
                e10 = null;
            } else {
                e10 = qg.a.f24816a.b(mf.l0.d(List.class, SportLatLng.class)).e(list);
            }
            if (e10 == null) {
                fVar.m0(3);
            } else {
                fVar.p(3, e10);
            }
            List<SportHeartRate> list2 = qVar2.f25648d;
            if (list2 != null && !list2.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11) {
                str = qg.a.f24816a.b(mf.l0.d(List.class, SportHeartRate.class)).e(list2);
            }
            if (str == null) {
                fVar.m0(4);
            } else {
                fVar.p(4, str);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class f extends m2.a0 {
        public f(m2.t tVar) {
            super(tVar);
        }

        @Override // m2.a0
        public final String b() {
            return "DELETE FROM SportRecord WHERE userId=? AND uploadFlag!=0";
        }
    }

    /* loaded from: classes2.dex */
    public class g extends m2.a0 {
        public g(m2.t tVar) {
            super(tVar);
        }

        @Override // m2.a0
        public final String b() {
            return "DELETE FROM SportRecord WHERE time<?";
        }
    }

    /* loaded from: classes2.dex */
    public class h extends m2.a0 {
        public h(m2.t tVar) {
            super(tVar);
        }

        @Override // m2.a0
        public final String b() {
            return "DELETE FROM SportDetail WHERE time<?";
        }
    }

    /* loaded from: classes2.dex */
    public class i extends m2.a0 {
        public i(m2.t tVar) {
            super(tVar);
        }

        @Override // m2.a0
        public final String b() {
            return "UPDATE SportRecord SET uploadFlag=1 WHERE sportId=?";
        }
    }

    /* loaded from: classes2.dex */
    public class j extends m2.a0 {
        public j(m2.t tVar) {
            super(tVar);
        }

        @Override // m2.a0
        public final String b() {
            return "DELETE FROM SportDetail WHERE sportId=?";
        }
    }

    /* loaded from: classes2.dex */
    public class k extends m2.a0 {
        public k(m2.t tVar) {
            super(tVar);
        }

        @Override // m2.a0
        public final String b() {
            return "DELETE FROM SportRecord WHERE userId=?";
        }
    }

    public h7(m2.t tVar) {
        this.f21063a = tVar;
        this.f21064b = new d(tVar);
        this.f21065c = new e(tVar);
        this.f21066d = new f(tVar);
        this.f21067e = new g(tVar);
        this.f21068f = new h(tVar);
        this.f21069g = new i(tVar);
        this.f21070h = new j(tVar);
        this.f21071i = new k(tVar);
    }

    @Override // mg.d7
    public final Object a(long j10, xl.d<? super tl.l> dVar) {
        return m2.f.g(this.f21063a, new b(j10), dVar);
    }

    @Override // mg.d7
    public final Object c(UUID uuid, d7.a aVar) {
        return m2.f.g(this.f21063a, new l7(this, uuid), aVar);
    }

    @Override // mg.d7
    public final Object d(xl.d<? super tl.l> dVar) {
        return m2.w.b(this.f21063a, new fm.l() { // from class: mg.e7
            @Override // fm.l
            public final Object k(Object obj) {
                h7 h7Var = h7.this;
                h7Var.getClass();
                return d7.e(h7Var, (xl.d) obj);
            }
        }, dVar);
    }

    @Override // mg.d7
    public final Object f(Date date, d7.b bVar) {
        return m2.f.g(this.f21063a, new j7(this, date), bVar);
    }

    @Override // mg.d7
    public final Object g(Date date, d7.b bVar) {
        return m2.f.g(this.f21063a, new i7(this, date), bVar);
    }

    @Override // mg.d7
    public final Object h(long j10, d7.a aVar) {
        return m2.f.g(this.f21063a, new m7(this, j10), aVar);
    }

    @Override // mg.d7
    public final sm.u0 i(long j10) {
        m2.y h10 = m2.y.h(1, "SELECT COUNT(*) AS count,SUM(distance) AS distance FROM SportRecord WHERE userId=? AND uploadFlag=0");
        h10.H(1, j10);
        return m2.f.c(this.f21063a, new String[]{"SportRecord"}, new n7(this, h10));
    }

    @Override // mg.d7
    public final Object j(rg.q qVar, zl.c cVar) {
        return m2.f.g(this.f21063a, new g7(this, qVar), cVar);
    }

    @Override // mg.d7
    public final Object k(rg.r rVar, zl.c cVar) {
        return m2.f.g(this.f21063a, new u7(this, rVar), cVar);
    }

    @Override // mg.d7
    public final Object l(List<rg.r> list, xl.d<? super tl.l> dVar) {
        return m2.f.g(this.f21063a, new a(list), dVar);
    }

    @Override // mg.d7
    public final Object m(UUID uuid, zl.c cVar) {
        m2.y h10 = m2.y.h(1, "SELECT * FROM SportDetail WHERE sportId=?");
        gm.l.f(uuid, "uuid");
        String uuid2 = uuid.toString();
        gm.l.e(uuid2, "uuid.toString()");
        h10.p(1, uuid2);
        return m2.f.f(this.f21063a, new CancellationSignal(), new q7(this, h10), cVar);
    }

    @Override // mg.d7
    public final Object n(UUID uuid, r0.c cVar) {
        m2.y h10 = m2.y.h(1, "SELECT * FROM SportRecord WHERE sportId=?");
        gm.l.f(uuid, "uuid");
        String uuid2 = uuid.toString();
        gm.l.e(uuid2, "uuid.toString()");
        h10.p(1, uuid2);
        return m2.f.f(this.f21063a, new CancellationSignal(), new p7(this, h10), cVar);
    }

    @Override // mg.d7
    public final Object o(long j10, d7.a aVar) {
        m2.y h10 = m2.y.h(1, "SELECT sportId FROM SportRecord WHERE userId=?");
        h10.H(1, j10);
        return m2.f.f(this.f21063a, new CancellationSignal(), new t7(this, h10), aVar);
    }

    @Override // mg.d7
    public final Object p(long j10, xl.d<? super Integer> dVar) {
        m2.y h10 = m2.y.h(1, "SELECT COUNT(*) FROM SportRecord WHERE userId=?");
        h10.H(1, j10);
        return m2.f.f(this.f21063a, new CancellationSignal(), new c(h10), dVar);
    }

    @Override // mg.d7
    public final Object q(long j10, int i10, int i11, h0.b bVar) {
        m2.y h10 = m2.y.h(3, "SELECT * FROM SportRecord WHERE userId=? ORDER BY time DESC LIMIT ? OFFSET ?");
        h10.H(1, j10);
        h10.H(2, i10);
        h10.H(3, i11);
        return m2.f.f(this.f21063a, new CancellationSignal(), new o7(this, h10), bVar);
    }

    @Override // mg.d7
    public final Object r(long j10, r0.h hVar) {
        m2.y h10 = m2.y.h(1, "SELECT * FROM SportRecord WHERE userId=? AND uploadFlag=0 ");
        h10.H(1, j10);
        return m2.f.f(this.f21063a, new CancellationSignal(), new r7(this, h10), hVar);
    }

    @Override // mg.d7
    public final Object s(long j10, r0.a aVar) {
        m2.y h10 = m2.y.h(1, "SELECT COUNT(*) FROM SportRecord WHERE userId=? AND uploadFlag=0 ");
        h10.H(1, j10);
        return m2.f.f(this.f21063a, new CancellationSignal(), new s7(this, h10), aVar);
    }

    @Override // mg.d7
    public final Object t(long j10, SportRecord sportRecord, xl.d<? super tl.l> dVar) {
        return m2.w.b(this.f21063a, new i1(this, j10, sportRecord, 2), dVar);
    }

    @Override // mg.d7
    public final Object v(final long j10, final oj.j jVar, final boolean z10, lg.s0 s0Var) {
        return m2.w.b(this.f21063a, new fm.l() { // from class: mg.f7
            @Override // fm.l
            public final Object k(Object obj) {
                h7 h7Var = h7.this;
                h7Var.getClass();
                return d7.w(h7Var, j10, jVar, z10, (xl.d) obj);
            }
        }, s0Var);
    }

    @Override // mg.d7
    public final Object x(UUID uuid, r0.h hVar) {
        return m2.f.g(this.f21063a, new k7(this, uuid), hVar);
    }
}
