package mg;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import java.util.concurrent.Callable;
import og.o1;

/* loaded from: classes2.dex */
public final class e1 extends b1 {

    /* renamed from: a */
    public final m2.t f20949a;

    /* renamed from: b */
    public final c1 f20950b;

    /* renamed from: c */
    public final d1 f20951c;

    /* loaded from: classes2.dex */
    public class a implements Callable<tl.l> {

        /* renamed from: a */
        public final /* synthetic */ pg.e f20952a;

        public a(pg.e eVar) {
            e1.this = r1;
            this.f20952a = eVar;
        }

        @Override // java.util.concurrent.Callable
        public final tl.l call() {
            e1.this.f20949a.c();
            try {
                e1.this.f20950b.e(this.f20952a);
                e1.this.f20949a.p();
                return tl.l.f28297a;
            } finally {
                e1.this.f20949a.l();
            }
        }
    }

    public e1(AppDatabase appDatabase) {
        this.f20949a = appDatabase;
        this.f20950b = new c1(appDatabase);
        this.f20951c = new d1(appDatabase);
    }

    @Override // mg.b1
    public final sm.u0 a(String str) {
        m2.y h10 = m2.y.h(1, "SELECT * FROM DeviceShellEntity WHERE projectNum=?");
        h10.p(1, str);
        return m2.f.c(this.f20949a, new String[]{"DeviceShellEntity"}, new g1(this, h10));
    }

    @Override // mg.b1
    public final Object b(pg.e eVar, xl.d<? super tl.l> dVar) {
        return m2.f.g(this.f20949a, new a(eVar), dVar);
    }

    @Override // mg.b1
    public final Object c(long j10, String str, o1.e eVar) {
        return m2.f.g(this.f20949a, new f1(this, str, j10), eVar);
    }
}
