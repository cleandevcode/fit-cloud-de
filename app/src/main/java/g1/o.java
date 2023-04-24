package g1;

import android.os.Handler;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class o<T> implements Runnable {

    /* renamed from: a */
    public Callable<T> f14840a;

    /* renamed from: b */
    public j1.a<T> f14841b;

    /* renamed from: c */
    public Handler f14842c;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ j1.a f14843a;

        /* renamed from: b */
        public final /* synthetic */ Object f14844b;

        public a(j1.a aVar, Object obj) {
            this.f14843a = aVar;
            this.f14844b = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            this.f14843a.accept(this.f14844b);
        }
    }

    public o(Handler handler, i iVar, j jVar) {
        this.f14840a = iVar;
        this.f14841b = jVar;
        this.f14842c = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        T t10;
        try {
            t10 = this.f14840a.call();
        } catch (Exception unused) {
            t10 = null;
        }
        this.f14842c.post(new a(this.f14841b, t10));
    }
}
