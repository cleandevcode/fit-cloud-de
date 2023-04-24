package mg;

import android.os.CancellationSignal;
import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import java.util.ArrayList;
import jg.b;
import mg.d9;

/* loaded from: classes2.dex */
public final class e9 extends d9 {

    /* renamed from: b */
    public final AppDatabase f20969b;

    /* renamed from: c */
    public final a f20970c;

    /* renamed from: d */
    public final b f20971d;

    /* loaded from: classes2.dex */
    public class a extends m2.i<pg.i> {
        public a(m2.t tVar) {
            super(tVar);
        }

        @Override // m2.a0
        public final String b() {
            return "INSERT OR REPLACE INTO `StringTypedEntity` (`userId`,`type`,`data`) VALUES (?,?,?)";
        }

        @Override // m2.i
        public final void d(r2.f fVar, pg.i iVar) {
            pg.i iVar2 = iVar;
            fVar.H(1, iVar2.f24049a);
            fVar.H(2, iVar2.f24050b);
            String str = iVar2.f24051c;
            if (str == null) {
                fVar.m0(3);
            } else {
                fVar.p(3, str);
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
            return "DELETE FROM StringTypedEntity WHERE userId=?";
        }
    }

    public e9(AppDatabase appDatabase) {
        super(appDatabase);
        this.f20969b = appDatabase;
        this.f20970c = new a(appDatabase);
        this.f20971d = new b(appDatabase);
    }

    @Override // mg.d9
    public final Object a(long j10, b.C0309b c0309b) {
        return m2.f.g(this.f20969b, new h9(this, j10), c0309b);
    }

    @Override // mg.d9
    public final sm.u0 b(int i10, long j10) {
        m2.y h10 = m2.y.h(2, "SELECT data FROM StringTypedEntity WHERE userId=? AND type=?");
        h10.H(1, j10);
        h10.H(2, i10);
        return m2.f.c(this.f20969b, new String[]{"StringTypedEntity"}, new j9(this, h10));
    }

    @Override // mg.d9
    public final sm.u0 c(long j10) {
        m2.y h10 = m2.y.h(3, "SELECT * FROM StringTypedEntity WHERE userId=? AND type>=? AND type<=?");
        h10.H(1, j10);
        h10.H(2, 1001);
        h10.H(3, 1006);
        return m2.f.c(this.f20969b, new String[]{"StringTypedEntity"}, new k9(this, h10));
    }

    @Override // mg.d9
    public final Object g(ArrayList arrayList, d9.d dVar) {
        return m2.f.g(this.f20969b, new g9(this, arrayList), dVar);
    }

    @Override // mg.d9
    public final Object h(pg.i iVar, zl.c cVar) {
        return m2.f.g(this.f20969b, new f9(this, iVar), cVar);
    }

    @Override // mg.d9
    public final Object i(long j10, int i10, zl.c cVar) {
        m2.y h10 = m2.y.h(2, "SELECT data FROM StringTypedEntity WHERE userId=? AND type=?");
        h10.H(1, j10);
        h10.H(2, i10);
        return m2.f.f(this.f20969b, new CancellationSignal(), new i9(this, h10), cVar);
    }
}
