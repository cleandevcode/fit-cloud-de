package n5;

import android.util.Log;
import j1.f;
import n5.d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static final C0389a f22038a = new C0389a();

    /* renamed from: n5.a$a */
    /* loaded from: classes.dex */
    public class C0389a implements e<Object> {
        @Override // n5.a.e
        public final void a(Object obj) {
        }
    }

    /* loaded from: classes.dex */
    public interface b<T> {
        T a();
    }

    /* loaded from: classes.dex */
    public static final class c<T> implements j1.d<T> {

        /* renamed from: a */
        public final b<T> f22039a;

        /* renamed from: b */
        public final e<T> f22040b;

        /* renamed from: c */
        public final j1.d<T> f22041c;

        public c(f fVar, b bVar, e eVar) {
            this.f22041c = fVar;
            this.f22039a = bVar;
            this.f22040b = eVar;
        }

        @Override // j1.d
        public final T acquire() {
            T acquire = this.f22041c.acquire();
            if (acquire == null) {
                acquire = this.f22039a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    StringBuilder a10 = android.support.v4.media.d.a("Created new ");
                    a10.append(acquire.getClass());
                    Log.v("FactoryPools", a10.toString());
                }
            }
            if (acquire instanceof d) {
                ((d) acquire).e().f22042a = false;
            }
            return acquire;
        }

        @Override // j1.d
        public final boolean release(T t10) {
            if (t10 instanceof d) {
                ((d) t10).e().f22042a = true;
            }
            this.f22040b.a(t10);
            return this.f22041c.release(t10);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        d.a e();
    }

    /* loaded from: classes.dex */
    public interface e<T> {
        void a(T t10);
    }

    public static c a(int i10, b bVar) {
        return new c(new f(i10), bVar, f22038a);
    }
}
