package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import androidx.lifecycle.i0;
import androidx.lifecycle.k;

/* loaded from: classes.dex */
public final class f0 implements u {

    /* renamed from: i */
    public static final f0 f2713i = new f0();

    /* renamed from: e */
    public Handler f2718e;

    /* renamed from: a */
    public int f2714a = 0;

    /* renamed from: b */
    public int f2715b = 0;

    /* renamed from: c */
    public boolean f2716c = true;

    /* renamed from: d */
    public boolean f2717d = true;

    /* renamed from: f */
    public final v f2719f = new v(this);

    /* renamed from: g */
    public a f2720g = new a();

    /* renamed from: h */
    public b f2721h = new b();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            f0.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            f0 f0Var = f0.this;
            if (f0Var.f2715b == 0) {
                f0Var.f2716c = true;
                f0Var.f2719f.f(k.b.ON_PAUSE);
            }
            f0 f0Var2 = f0.this;
            if (f0Var2.f2714a == 0 && f0Var2.f2716c) {
                f0Var2.f2719f.f(k.b.ON_STOP);
                f0Var2.f2717d = true;
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements i0.a {
        public b() {
            f0.this = r1;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    @Override // androidx.lifecycle.u
    public final v a0() {
        return this.f2719f;
    }

    public final void c() {
        int i10 = this.f2715b + 1;
        this.f2715b = i10;
        if (i10 == 1) {
            if (!this.f2716c) {
                this.f2718e.removeCallbacks(this.f2720g);
                return;
            }
            this.f2719f.f(k.b.ON_RESUME);
            this.f2716c = false;
        }
    }
}
