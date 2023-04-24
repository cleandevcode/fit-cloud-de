package a0;

import a0.b0;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class g1<T> {

    /* renamed from: a */
    public final androidx.lifecycle.a0<b<T>> f71a = new androidx.lifecycle.a0<>();

    /* renamed from: b */
    public final HashMap f72b = new HashMap();

    /* loaded from: classes.dex */
    public static final class a<T> implements androidx.lifecycle.b0<b<T>> {

        /* renamed from: a */
        public final AtomicBoolean f73a = new AtomicBoolean(true);

        /* renamed from: b */
        public final l1<? super T> f74b;

        /* renamed from: c */
        public final Executor f75c;

        public a(Executor executor, androidx.camera.view.a aVar) {
            this.f75c = executor;
            this.f74b = aVar;
        }

        @Override // androidx.lifecycle.b0
        public final void a(Object obj) {
            this.f75c.execute(new s.q(this, (b) obj, 8));
        }
    }

    /* loaded from: classes.dex */
    public static final class b<T> {

        /* renamed from: a */
        public final T f76a;

        /* renamed from: b */
        public final Throwable f77b = null;

        /* JADX WARN: Multi-variable type inference failed */
        public b(b0.a aVar) {
            this.f76a = aVar;
        }

        public final String toString() {
            boolean z10;
            StringBuilder a10;
            Object obj;
            StringBuilder a11 = android.support.v4.media.d.a("[Result: <");
            if (this.f77b == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                a10 = android.support.v4.media.d.a("Value: ");
                obj = this.f76a;
            } else {
                a10 = android.support.v4.media.d.a("Error: ");
                obj = this.f77b;
            }
            a10.append(obj);
            a11.append(a10.toString());
            a11.append(">]");
            return a11.toString();
        }
    }
}
