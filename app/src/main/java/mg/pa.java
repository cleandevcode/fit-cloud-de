package mg;

import android.os.CancellationSignal;
import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class pa extends ma {

    /* renamed from: a */
    public final m2.t f21362a;

    /* renamed from: b */
    public final na f21363b;

    /* renamed from: c */
    public final oa f21364c;

    /* loaded from: classes2.dex */
    public class a implements Callable<tl.l> {

        /* renamed from: a */
        public final /* synthetic */ pg.l f21365a;

        public a(pg.l lVar) {
            pa.this = r1;
            this.f21365a = lVar;
        }

        @Override // java.util.concurrent.Callable
        public final tl.l call() {
            pa.this.f21362a.c();
            try {
                pa.this.f21363b.e(this.f21365a);
                pa.this.f21362a.p();
                return tl.l.f28297a;
            } finally {
                pa.this.f21362a.l();
            }
        }
    }

    public pa(AppDatabase appDatabase) {
        this.f21362a = appDatabase;
        this.f21363b = new na(appDatabase);
        this.f21364c = new oa(appDatabase);
    }

    @Override // mg.ma
    public final Object a(pg.l lVar, xl.d<? super tl.l> dVar) {
        return m2.f.g(this.f21362a, new a(lVar), dVar);
    }

    @Override // mg.ma
    public final Object b(String str, int i10, String str2, og.g1 g1Var) {
        m2.y h10 = m2.y.h(3, "SELECT * FROM UsedDialEntity WHERE projectNum=? AND lcd=? AND toolVersion<=?");
        if (str == null) {
            h10.m0(1);
        } else {
            h10.p(1, str);
        }
        h10.H(2, i10);
        if (str2 == null) {
            h10.m0(3);
        } else {
            h10.p(3, str2);
        }
        return m2.f.f(this.f21362a, new CancellationSignal(), new ra(this, h10), g1Var);
    }

    @Override // mg.ma
    public final Object c(int i10, String str, xl.d dVar) {
        return m2.f.g(this.f21362a, new qa(this, str, i10), dVar);
    }
}
