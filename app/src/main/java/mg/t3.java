package mg;

import android.database.Cursor;
import android.os.CancellationSignal;
import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import jg.b;
import og.k1;

/* loaded from: classes2.dex */
public final class t3 extends p3 {

    /* renamed from: a */
    public final m2.t f21463a;

    /* renamed from: b */
    public final q3 f21464b;

    /* renamed from: c */
    public final r3 f21465c;

    /* renamed from: d */
    public final s3 f21466d;

    /* loaded from: classes2.dex */
    public class a implements Callable<tl.l> {

        /* renamed from: a */
        public final /* synthetic */ pg.h f21467a;

        public a(pg.h hVar) {
            t3.this = r1;
            this.f21467a = hVar;
        }

        @Override // java.util.concurrent.Callable
        public final tl.l call() {
            t3.this.f21463a.c();
            try {
                t3.this.f21464b.e(this.f21467a);
                t3.this.f21463a.p();
                return tl.l.f28297a;
            } finally {
                t3.this.f21463a.l();
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Callable<tl.l> {

        /* renamed from: a */
        public final /* synthetic */ long f21469a;

        /* renamed from: b */
        public final /* synthetic */ String f21470b;

        public b(long j10, String str) {
            t3.this = r1;
            this.f21469a = j10;
            this.f21470b = str;
        }

        @Override // java.util.concurrent.Callable
        public final tl.l call() {
            r2.f a10 = t3.this.f21465c.a();
            a10.H(1, this.f21469a);
            String str = this.f21470b;
            if (str == null) {
                a10.m0(2);
            } else {
                a10.p(2, str);
            }
            t3.this.f21463a.c();
            try {
                a10.r();
                t3.this.f21463a.p();
                return tl.l.f28297a;
            } finally {
                t3.this.f21463a.l();
                t3.this.f21465c.c(a10);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Callable<List<String>> {

        /* renamed from: a */
        public final /* synthetic */ m2.y f21472a;

        public c(m2.y yVar) {
            t3.this = r1;
            this.f21472a = yVar;
        }

        @Override // java.util.concurrent.Callable
        public final List<String> call() {
            String string;
            Cursor r10 = o8.b.r(t3.this.f21463a, this.f21472a);
            try {
                ArrayList arrayList = new ArrayList(r10.getCount());
                while (r10.moveToNext()) {
                    if (r10.isNull(0)) {
                        string = null;
                    } else {
                        string = r10.getString(0);
                    }
                    arrayList.add(string);
                }
                return arrayList;
            } finally {
                r10.close();
                this.f21472a.j();
            }
        }
    }

    public t3(AppDatabase appDatabase) {
        this.f21463a = appDatabase;
        this.f21464b = new q3(appDatabase);
        this.f21465c = new r3(appDatabase);
        this.f21466d = new s3(appDatabase);
    }

    @Override // mg.p3
    public final Object a(long j10, b.C0309b c0309b) {
        return m2.f.g(this.f21463a, new u3(this, j10), c0309b);
    }

    @Override // mg.p3
    public final Object b(long j10, String str, xl.d<? super tl.l> dVar) {
        return m2.f.g(this.f21463a, new b(j10, str), dVar);
    }

    @Override // mg.p3
    public final Object c(pg.h hVar, xl.d<? super tl.l> dVar) {
        return m2.f.g(this.f21463a, new a(hVar), dVar);
    }

    @Override // mg.p3
    public final Object d(long j10, xl.d<? super List<String>> dVar) {
        m2.y h10 = m2.y.h(1, "SELECT packageName FROM NotificationOtherEntity WHERE userId=?");
        h10.H(1, j10);
        return m2.f.f(this.f21463a, new CancellationSignal(), new c(h10), dVar);
    }

    @Override // mg.p3
    public final Object e(long j10, String str, k1.a aVar) {
        m2.y h10 = m2.y.h(2, "SELECT COUNT(*) FROM NotificationOtherEntity WHERE userId=? AND packageName=?");
        h10.H(1, j10);
        if (str == null) {
            h10.m0(2);
        } else {
            h10.p(2, str);
        }
        return m2.f.f(this.f21463a, new CancellationSignal(), new v3(this, h10), aVar);
    }
}
