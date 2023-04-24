package mg;

import android.os.CancellationSignal;
import java.util.concurrent.Callable;
import kg.f;
import mg.sa;

/* loaded from: classes2.dex */
public final class wa extends sa {

    /* renamed from: a */
    public final m2.t f21625a;

    /* renamed from: b */
    public final g f21626b;

    /* renamed from: c */
    public final h f21627c;

    /* renamed from: d */
    public final i f21628d;

    /* renamed from: e */
    public final j f21629e;

    /* renamed from: f */
    public final k f21630f;

    /* renamed from: g */
    public final l f21631g;

    /* renamed from: h */
    public final n f21632h;

    /* renamed from: i */
    public final o f21633i;

    /* renamed from: j */
    public final a f21634j;

    /* loaded from: classes2.dex */
    public class a extends m2.a0 {
        public a(m2.t tVar) {
            super(tVar);
        }

        @Override // m2.a0
        public final String b() {
            return "DELETE FROM ExerciseGoalEntity WHERE userId=?";
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Callable<tl.l> {

        /* renamed from: a */
        public final /* synthetic */ pg.k[] f21635a;

        public b(pg.k[] kVarArr) {
            wa.this = r1;
            this.f21635a = kVarArr;
        }

        @Override // java.util.concurrent.Callable
        public final tl.l call() {
            wa.this.f21625a.c();
            try {
                wa.this.f21626b.g(this.f21635a);
                wa.this.f21625a.p();
                return tl.l.f28297a;
            } finally {
                wa.this.f21625a.l();
            }
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Callable<tl.l> {

        /* renamed from: a */
        public final /* synthetic */ pg.f[] f21637a;

        public c(pg.f[] fVarArr) {
            wa.this = r1;
            this.f21637a = fVarArr;
        }

        @Override // java.util.concurrent.Callable
        public final tl.l call() {
            wa.this.f21625a.c();
            try {
                wa.this.f21628d.g(this.f21637a);
                wa.this.f21625a.p();
                return tl.l.f28297a;
            } finally {
                wa.this.f21625a.l();
            }
        }
    }

    /* loaded from: classes2.dex */
    public class d implements Callable<tl.l> {

        /* renamed from: a */
        public final /* synthetic */ long f21639a;

        /* renamed from: b */
        public final /* synthetic */ long f21640b;

        public d(long j10, long j11) {
            wa.this = r1;
            this.f21639a = j10;
            this.f21640b = j11;
        }

        @Override // java.util.concurrent.Callable
        public final tl.l call() {
            r2.f a10 = wa.this.f21629e.a();
            a10.H(1, this.f21639a);
            a10.H(2, this.f21640b);
            wa.this.f21625a.c();
            try {
                a10.r();
                wa.this.f21625a.p();
                return tl.l.f28297a;
            } finally {
                wa.this.f21625a.l();
                wa.this.f21629e.c(a10);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class e implements Callable<tl.l> {

        /* renamed from: a */
        public final /* synthetic */ long f21642a;

        /* renamed from: b */
        public final /* synthetic */ long f21643b;

        public e(long j10, long j11) {
            wa.this = r1;
            this.f21642a = j10;
            this.f21643b = j11;
        }

        @Override // java.util.concurrent.Callable
        public final tl.l call() {
            r2.f a10 = wa.this.f21630f.a();
            a10.H(1, this.f21642a);
            a10.H(2, this.f21643b);
            wa.this.f21625a.c();
            try {
                a10.r();
                wa.this.f21625a.p();
                return tl.l.f28297a;
            } finally {
                wa.this.f21625a.l();
                wa.this.f21630f.c(a10);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class f implements Callable<tl.l> {

        /* renamed from: a */
        public final /* synthetic */ long f21645a;

        /* renamed from: b */
        public final /* synthetic */ long f21646b;

        public f(long j10, long j11) {
            wa.this = r1;
            this.f21645a = j10;
            this.f21646b = j11;
        }

        @Override // java.util.concurrent.Callable
        public final tl.l call() {
            r2.f a10 = wa.this.f21631g.a();
            a10.H(1, this.f21645a);
            a10.H(2, this.f21646b);
            wa.this.f21625a.c();
            try {
                a10.r();
                wa.this.f21625a.p();
                return tl.l.f28297a;
            } finally {
                wa.this.f21625a.l();
                wa.this.f21631g.c(a10);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class g extends m2.i<pg.k> {
        public g(m2.t tVar) {
            super(tVar);
        }

        @Override // m2.a0
        public final String b() {
            return "INSERT OR REPLACE INTO `UnitConfigEntity` (`userId`,`length`,`weight`,`temperature`,`lastModifyTime`,`dirty`,`syncSuccessTime`) VALUES (?,?,?,?,?,?,?)";
        }

        @Override // m2.i
        public final void d(r2.f fVar, pg.k kVar) {
            pg.k kVar2 = kVar;
            fVar.H(1, kVar2.f24055d);
            fVar.H(2, kVar2.f24056e);
            fVar.H(3, kVar2.f24057f);
            fVar.H(4, kVar2.f24058g);
            fVar.H(5, kVar2.f24059h);
            fVar.H(6, kVar2.f24053b);
            fVar.H(7, kVar2.f24054c);
        }
    }

    /* loaded from: classes2.dex */
    public class h extends m2.i<pg.d> {
        public h(m2.t tVar) {
            super(tVar);
        }

        @Override // m2.a0
        public final String b() {
            return "INSERT OR REPLACE INTO `DeviceBindEntity` (`userId`,`address`,`name`,`hardwareInfo`,`isUnBind`,`lastModifyTime`,`dirty`,`syncSuccessTime`) VALUES (?,?,?,?,?,?,?,?)";
        }

        @Override // m2.i
        public final void d(r2.f fVar, pg.d dVar) {
            pg.d dVar2 = dVar;
            fVar.H(1, dVar2.f24027d);
            String str = dVar2.f24028e;
            if (str == null) {
                fVar.m0(2);
            } else {
                fVar.p(2, str);
            }
            String str2 = dVar2.f24029f;
            if (str2 == null) {
                fVar.m0(3);
            } else {
                fVar.p(3, str2);
            }
            String str3 = dVar2.f24030g;
            if (str3 == null) {
                fVar.m0(4);
            } else {
                fVar.p(4, str3);
            }
            fVar.H(5, dVar2.f24031h);
            fVar.H(6, dVar2.f24032i);
            fVar.H(7, dVar2.f24053b);
            fVar.H(8, dVar2.f24054c);
        }
    }

    /* loaded from: classes2.dex */
    public class i extends m2.i<pg.f> {
        public i(m2.t tVar) {
            super(tVar);
        }

        @Override // m2.a0
        public final String b() {
            return "INSERT OR REPLACE INTO `ExerciseGoalEntity` (`userId`,`step`,`distance`,`calorie`,`lastModifyTime`,`dirty`,`syncSuccessTime`) VALUES (?,?,?,?,?,?,?)";
        }

        @Override // m2.i
        public final void d(r2.f fVar, pg.f fVar2) {
            pg.f fVar3 = fVar2;
            fVar.H(1, fVar3.f24036d);
            fVar.H(2, fVar3.f24037e);
            fVar.j0(fVar3.f24038f, 3);
            fVar.H(4, fVar3.f24039g);
            fVar.H(5, fVar3.f24040h);
            fVar.H(6, fVar3.f24053b);
            fVar.H(7, fVar3.f24054c);
        }
    }

    /* loaded from: classes2.dex */
    public class j extends m2.a0 {
        public j(m2.t tVar) {
            super(tVar);
        }

        @Override // m2.a0
        public final String b() {
            return "UPDATE UnitConfigEntity SET lastModifyTime=?,dirty=1 WHERE userId=? AND dirty=2";
        }
    }

    /* loaded from: classes2.dex */
    public class k extends m2.a0 {
        public k(m2.t tVar) {
            super(tVar);
        }

        @Override // m2.a0
        public final String b() {
            return "UPDATE DeviceBindEntity SET lastModifyTime=?,dirty=1 WHERE userId=? AND dirty=2";
        }
    }

    /* loaded from: classes2.dex */
    public class l extends m2.a0 {
        public l(m2.t tVar) {
            super(tVar);
        }

        @Override // m2.a0
        public final String b() {
            return "UPDATE DeviceBindEntity SET lastModifyTime=?,dirty=1,isUnbind=1 WHERE userId=? AND isUnBind=0";
        }
    }

    /* loaded from: classes2.dex */
    public class m extends m2.a0 {
        public m(m2.t tVar) {
            super(tVar);
        }

        @Override // m2.a0
        public final String b() {
            return "UPDATE ExerciseGoalEntity SET lastModifyTime=?,dirty=1 WHERE userId=? AND dirty=2";
        }
    }

    /* loaded from: classes2.dex */
    public class n extends m2.a0 {
        public n(m2.t tVar) {
            super(tVar);
        }

        @Override // m2.a0
        public final String b() {
            return "DELETE FROM UnitConfigEntity WHERE userId=?";
        }
    }

    /* loaded from: classes2.dex */
    public class o extends m2.a0 {
        public o(m2.t tVar) {
            super(tVar);
        }

        @Override // m2.a0
        public final String b() {
            return "DELETE FROM DeviceBindEntity WHERE userId=?";
        }
    }

    public wa(m2.t tVar) {
        this.f21625a = tVar;
        this.f21626b = new g(tVar);
        this.f21627c = new h(tVar);
        this.f21628d = new i(tVar);
        this.f21629e = new j(tVar);
        this.f21630f = new k(tVar);
        this.f21631g = new l(tVar);
        new m(tVar);
        this.f21632h = new n(tVar);
        this.f21633i = new o(tVar);
        this.f21634j = new a(tVar);
    }

    @Override // mg.sa
    public final Object a(long j10, long j11, xl.d<? super tl.l> dVar) {
        return m2.f.g(this.f21625a, new e(j11, j10), dVar);
    }

    @Override // mg.sa
    public final Object b(long j10, long j11, xl.d<? super tl.l> dVar) {
        return m2.f.g(this.f21625a, new d(j11, j10), dVar);
    }

    @Override // mg.sa
    public final Object c(long j10, long j11, xl.d<? super tl.l> dVar) {
        return m2.f.g(this.f21625a, new f(j11, j10), dVar);
    }

    @Override // mg.sa
    public final Object e(long j10, sa.a aVar) {
        return m2.f.g(this.f21625a, new za(this, j10), aVar);
    }

    @Override // mg.sa
    public final Object f(long j10, sa.a aVar) {
        return m2.f.g(this.f21625a, new ab(this, j10), aVar);
    }

    @Override // mg.sa
    public final Object g(long j10, sa.a aVar) {
        return m2.f.g(this.f21625a, new ya(this, j10), aVar);
    }

    @Override // mg.sa
    public final sm.u0 h(long j10) {
        m2.y h10 = m2.y.h(1, "SELECT * FROM DeviceBindEntity WHERE userId=?");
        h10.H(1, j10);
        return m2.f.c(this.f21625a, new String[]{"DeviceBindEntity"}, new eb(this, h10));
    }

    @Override // mg.sa
    public final sm.u0 i(long j10) {
        m2.y h10 = m2.y.h(1, "SELECT * FROM ExerciseGoalEntity WHERE userId=?");
        h10.H(1, j10);
        return m2.f.c(this.f21625a, new String[]{"ExerciseGoalEntity"}, new gb(this, h10));
    }

    @Override // mg.sa
    public final sm.u0 j(long j10) {
        m2.y h10 = m2.y.h(1, "SELECT * FROM UnitConfigEntity WHERE userId=?");
        h10.H(1, j10);
        return m2.f.c(this.f21625a, new String[]{"UnitConfigEntity"}, new cb(this, h10));
    }

    @Override // mg.sa
    public final Object k(pg.d[] dVarArr, zl.c cVar) {
        return m2.f.g(this.f21625a, new xa(this, dVarArr), cVar);
    }

    @Override // mg.sa
    public final Object l(pg.f[] fVarArr, xl.d<? super tl.l> dVar) {
        return m2.f.g(this.f21625a, new c(fVarArr), dVar);
    }

    @Override // mg.sa
    public final Object m(pg.k[] kVarArr, xl.d<? super tl.l> dVar) {
        return m2.f.g(this.f21625a, new b(kVarArr), dVar);
    }

    @Override // mg.sa
    public final Object n(long j10, zl.c cVar) {
        m2.y h10 = m2.y.h(1, "SELECT * FROM DeviceBindEntity WHERE userId=?");
        h10.H(1, j10);
        return m2.f.f(this.f21625a, new CancellationSignal(), new db(this, h10), cVar);
    }

    @Override // mg.sa
    public final Object o(long j10, zl.c cVar) {
        m2.y h10 = m2.y.h(1, "SELECT * FROM ExerciseGoalEntity WHERE userId=?");
        h10.H(1, j10);
        return m2.f.f(this.f21625a, new CancellationSignal(), new fb(this, h10), cVar);
    }

    @Override // mg.sa
    public final Object p(long j10, zl.c cVar) {
        m2.y h10 = m2.y.h(1, "SELECT * FROM UnitConfigEntity WHERE userId=?");
        h10.H(1, j10);
        return m2.f.f(this.f21625a, new CancellationSignal(), new bb(this, h10), cVar);
    }

    @Override // mg.sa
    public final Object q(final pg.d dVar, final pg.d dVar2, f.a aVar) {
        return m2.w.b(this.f21625a, new fm.l() { // from class: mg.va
            @Override // fm.l
            public final Object k(Object obj) {
                wa waVar = wa.this;
                waVar.getClass();
                return sa.r(waVar, dVar, dVar2, (xl.d) obj);
            }
        }, aVar);
    }

    @Override // mg.sa
    public final Object s(final pg.f fVar, final pg.f fVar2, f.a aVar) {
        return m2.w.b(this.f21625a, new fm.l() { // from class: mg.ua
            @Override // fm.l
            public final Object k(Object obj) {
                wa waVar = wa.this;
                waVar.getClass();
                return sa.t(waVar, fVar, fVar2, (xl.d) obj);
            }
        }, aVar);
    }

    @Override // mg.sa
    public final Object u(final pg.k kVar, final pg.k kVar2, f.a aVar) {
        return m2.w.b(this.f21625a, new fm.l() { // from class: mg.ta
            @Override // fm.l
            public final Object k(Object obj) {
                wa waVar = wa.this;
                waVar.getClass();
                return sa.v(waVar, kVar, kVar2, (xl.d) obj);
            }
        }, aVar);
    }
}
