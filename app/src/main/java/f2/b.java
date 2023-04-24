package f2;

import a0.q;
import android.content.Context;

/* loaded from: classes.dex */
public class b<D> {

    /* renamed from: a */
    public int f14044a;

    /* renamed from: b */
    public a<D> f14045b;

    /* renamed from: c */
    public boolean f14046c = false;

    /* renamed from: d */
    public boolean f14047d = false;

    /* renamed from: e */
    public boolean f14048e = true;

    /* renamed from: f */
    public boolean f14049f = false;

    /* loaded from: classes.dex */
    public interface a<D> {
    }

    public b(Context context) {
        context.getApplicationContext();
    }

    public final void a() {
        f2.a aVar = (f2.a) this;
        if (aVar.f14040h != null) {
            if (!aVar.f14046c) {
                aVar.f14049f = true;
            }
            if (aVar.f14041i != null) {
                aVar.f14040h.getClass();
            } else {
                aVar.f14040h.getClass();
                f2.a<D>.RunnableC0247a runnableC0247a = aVar.f14040h;
                runnableC0247a.f14055d.set(true);
                if (runnableC0247a.f14053b.cancel(false)) {
                    aVar.f14041i = aVar.f14040h;
                }
            }
            aVar.f14040h = null;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        tb.a.d(this, sb2);
        sb2.append(" id=");
        return q.b(sb2, this.f14044a, "}");
    }
}
