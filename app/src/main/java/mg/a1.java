package mg;

import android.os.CancellationSignal;
import ch.d;
import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import java.util.ArrayList;
import java.util.List;
import mg.j0;

/* loaded from: classes2.dex */
public final class a1 extends j0 {

    /* renamed from: g */
    public static final /* synthetic */ int f20635g = 0;

    /* renamed from: a */
    public final m2.t f20636a;

    /* renamed from: b */
    public final r0 f20637b;

    /* renamed from: c */
    public final s0 f20638c;

    /* renamed from: d */
    public final t0 f20639d;

    /* renamed from: e */
    public final u0 f20640e;

    /* renamed from: f */
    public final v0 f20641f;

    public a1(AppDatabase appDatabase) {
        this.f20636a = appDatabase;
        this.f20637b = new r0(appDatabase);
        this.f20638c = new s0(appDatabase);
        this.f20639d = new t0(appDatabase);
        this.f20640e = new u0(appDatabase);
        this.f20641f = new v0(appDatabase);
    }

    @Override // mg.j0
    public final Object b(String str, j0.a aVar) {
        m2.y h10 = m2.y.h(1, "SELECT count(*) FROM CityKeyEntity WHERE cid=?");
        if (str == null) {
            h10.m0(1);
        } else {
            h10.p(1, str);
        }
        return m2.f.f(this.f20636a, new CancellationSignal(), new p0(this, h10), aVar);
    }

    @Override // mg.j0
    public final Object c(String str, j0.b bVar) {
        return m2.f.g(this.f20636a, new z0(this, str), bVar);
    }

    @Override // mg.j0
    public final Object d(final String str, d.C0073d c0073d) {
        return m2.w.b(this.f20636a, new fm.l() { // from class: mg.l0
            @Override // fm.l
            public final Object k(Object obj) {
                a1 a1Var = a1.this;
                a1Var.getClass();
                return j0.e(a1Var, str, (xl.d) obj);
            }
        }, c0073d);
    }

    @Override // mg.j0
    public final Object f(String str, j0.b bVar) {
        return m2.f.g(this.f20636a, new n0(this, str), bVar);
    }

    @Override // mg.j0
    public final Object g(pg.b bVar, j0.c cVar) {
        return m2.f.g(this.f20636a, new w0(this, bVar), cVar);
    }

    @Override // mg.j0
    public final Object h(ArrayList arrayList, j0.c cVar) {
        return m2.f.g(this.f20636a, new x0(this, arrayList), cVar);
    }

    @Override // mg.j0
    public final Object i(String str, k0 k0Var) {
        m2.y h10 = m2.y.h(1, "SELECT * FROM CityEntity WHERE cid=?");
        if (str == null) {
            h10.m0(1);
        } else {
            h10.p(1, str);
        }
        return m2.f.f(this.f20636a, new CancellationSignal(), new q0(this, h10), k0Var);
    }

    @Override // mg.j0
    public final Object k(String str, k0 k0Var) {
        m2.y h10 = m2.y.h(1, "SELECT * FROM CityKeyEntity WHERE key=?");
        if (str == null) {
            h10.m0(1);
        } else {
            h10.p(1, str);
        }
        return m2.f.f(this.f20636a, new CancellationSignal(), new o0(this, h10), k0Var);
    }

    @Override // mg.j0
    public final Object l(pg.b bVar, List list, d.a aVar) {
        return m2.w.b(this.f20636a, new m0(this, bVar, list, 0), aVar);
    }

    @Override // mg.j0
    public final Object n(int i10, String str, d.C0073d c0073d) {
        return m2.f.g(this.f20636a, new y0(this, i10, str), c0073d);
    }
}
