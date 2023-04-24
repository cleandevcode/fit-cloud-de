package mg;

import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import java.util.Date;
import java.util.concurrent.Callable;
import jg.b;
import kg.f;
import kg.m;

/* loaded from: classes2.dex */
public final class sb extends hb {

    /* renamed from: a */
    public final m2.t f21452a;

    /* renamed from: b */
    public final tb f21453b;

    /* renamed from: c */
    public final ub f21454c;

    /* renamed from: d */
    public final vb f21455d;

    /* renamed from: e */
    public final wb f21456e;

    /* renamed from: f */
    public final xb f21457f;

    /* renamed from: g */
    public final yb f21458g;

    /* loaded from: classes2.dex */
    public class a implements Callable<String> {

        /* renamed from: a */
        public final /* synthetic */ m2.y f21459a;

        public a(m2.y yVar) {
            sb.this = r1;
            this.f21459a = yVar;
        }

        @Override // java.util.concurrent.Callable
        public final String call() {
            String str;
            Cursor r10 = o8.b.r(sb.this.f21452a, this.f21459a);
            try {
                if (r10.moveToFirst() && !r10.isNull(0)) {
                    str = r10.getString(0);
                    return str;
                }
                str = null;
                return str;
            } finally {
                r10.close();
                this.f21459a.j();
            }
        }
    }

    public sb(AppDatabase appDatabase) {
        this.f21452a = appDatabase;
        this.f21453b = new tb(appDatabase);
        this.f21454c = new ub(appDatabase);
        this.f21455d = new vb(appDatabase);
        this.f21456e = new wb(appDatabase);
        this.f21457f = new xb(appDatabase);
        this.f21458g = new yb(appDatabase);
    }

    @Override // mg.hb
    public final Object a(long j10, b.C0309b c0309b) {
        return m2.f.g(this.f21452a, new kb(this, j10), c0309b);
    }

    @Override // mg.hb
    public final sm.u0 b(long j10) {
        m2.y h10 = m2.y.h(1, "SELECT userId AS userId,sex AS sex,birthday AS birthday,height AS height,weight AS weight FROM UserEntity WHERE userId=?");
        h10.H(1, j10);
        return m2.f.c(this.f21452a, new String[]{"UserEntity"}, new qb(this, h10));
    }

    @Override // mg.hb
    public final sm.u0 c(long j10) {
        m2.y h10 = m2.y.h(1, "SELECT nickName AS nickName,sex AS sex,avatar AS avatar,identityId AS identityId FROM UserEntity WHERE userId=?");
        h10.H(1, j10);
        return m2.f.c(this.f21452a, new String[]{"UserEntity"}, new rb(this, h10));
    }

    @Override // mg.hb
    public final Object d(pg.m[] mVarArr, zl.c cVar) {
        return m2.f.g(this.f21452a, new zb(this, mVarArr), cVar);
    }

    @Override // mg.hb
    public final Object e(long j10, zl.c cVar) {
        m2.y h10 = m2.y.h(1, "SELECT * FROM UserEntity WHERE userId=?");
        h10.H(1, j10);
        return m2.f.f(this.f21452a, new CancellationSignal(), new mb(this, h10), cVar);
    }

    @Override // mg.hb
    public final Object f(long j10, zl.c cVar) {
        m2.y h10 = m2.y.h(1, "SELECT email FROM UserEntity WHERE userId=?");
        h10.H(1, j10);
        return m2.f.f(this.f21452a, new CancellationSignal(), new ob(this, h10), cVar);
    }

    @Override // mg.hb
    public final sm.u0 g(long j10) {
        m2.y h10 = m2.y.h(1, "SELECT * FROM UserEntity WHERE userId=?");
        h10.H(1, j10);
        return m2.f.c(this.f21452a, new String[]{"UserEntity"}, new pb(this, h10));
    }

    @Override // mg.hb
    public final Object h(long j10, xl.d<? super String> dVar) {
        m2.y h10 = m2.y.h(1, "SELECT identityId FROM UserEntity WHERE userId=?");
        h10.H(1, j10);
        return m2.f.f(this.f21452a, new CancellationSignal(), new a(h10), dVar);
    }

    @Override // mg.hb
    public final Object i(long j10, b.f fVar) {
        m2.y h10 = m2.y.h(1, "SELECT phone FROM UserEntity WHERE userId=?");
        h10.H(1, j10);
        return m2.f.f(this.f21452a, new CancellationSignal(), new nb(this, h10), fVar);
    }

    @Override // mg.hb
    public final Object j(final long j10, final Date date, final Integer num, final Float f10, final Float f11, final Uri uri, final String str, xl.d<? super tl.l> dVar) {
        return m2.w.b(this.f21452a, new fm.l() { // from class: mg.ib
            @Override // fm.l
            public final Object k(Object obj) {
                sb sbVar = sb.this;
                sbVar.getClass();
                return hb.k(sbVar, j10, date, num, f10, f11, uri, str, (xl.d) obj);
            }
        }, dVar);
    }

    @Override // mg.hb
    public final Object l(pg.m mVar, pg.m mVar2, f.a aVar) {
        return m2.w.b(this.f21452a, new m0(this, mVar, mVar2, 1), aVar);
    }

    @Override // mg.hb
    public final Object n(long j10, String str, m.f fVar) {
        return m2.f.g(this.f21452a, new jb(this, str, j10), fVar);
    }

    @Override // mg.hb
    public final Object o(long j10, String str, m.e eVar) {
        return m2.f.g(this.f21452a, new bc(this, str, j10), eVar);
    }

    @Override // mg.hb
    public final Object p(long j10, String str, m.c cVar) {
        return m2.f.g(this.f21452a, new lb(this, str, j10), cVar);
    }

    @Override // mg.hb
    public final Object q(long j10, String str, m.e eVar) {
        return m2.f.g(this.f21452a, new ac(this, str, j10), eVar);
    }
}
