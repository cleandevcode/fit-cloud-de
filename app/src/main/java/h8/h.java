package h8;

import android.os.Looper;
import java.util.concurrent.Executor;
import x6.j;

/* loaded from: classes.dex */
public final class h<L> {

    /* renamed from: a */
    public final Executor f15956a;

    /* renamed from: b */
    public volatile Object f15957b;

    /* renamed from: c */
    public volatile a f15958c;

    /* loaded from: classes.dex */
    public static final class a<L> {

        /* renamed from: a */
        public final Object f15959a;

        /* renamed from: b */
        public final String f15960b;

        public a(a9.c cVar, String str) {
            this.f15959a = cVar;
            this.f15960b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f15959a == aVar.f15959a && this.f15960b.equals(aVar.f15960b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f15960b.hashCode() + (System.identityHashCode(this.f15959a) * 31);
        }
    }

    /* loaded from: classes.dex */
    public interface b<L> {
        void a(L l10);

        void b();
    }

    public h(Looper looper, j.b bVar, String str) {
        this.f15956a = new w(looper);
        this.f15957b = bVar;
        i8.p.d(str);
        this.f15958c = new a(bVar, str);
    }

    public h(x8.j jVar) {
        this.f15956a = x8.i0.f30419a;
        this.f15957b = jVar;
        i8.p.d("GetCurrentLocation");
        this.f15958c = new a(jVar, "GetCurrentLocation");
    }

    public final void a(b<? super L> bVar) {
        this.f15956a.execute(new j0(this, bVar, 0));
    }
}
