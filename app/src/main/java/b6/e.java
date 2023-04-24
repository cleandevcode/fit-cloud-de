package b6;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.s2;
import cn.sharesdk.framework.InnerShareParams;
import gm.l;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public static final HashMap f4015d = new HashMap();

    /* renamed from: a */
    public final WeakReference<Activity> f4016a;

    /* renamed from: b */
    public final Handler f4017b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public final AtomicBoolean f4018c = new AtomicBoolean(false);

    /* loaded from: classes.dex */
    public static final class a {
        public static void a(Activity activity) {
            l.f(activity, InnerShareParams.ACTIVITY);
            int hashCode = activity.hashCode();
            HashMap hashMap = e.f4015d;
            HashMap hashMap2 = null;
            if (!i6.a.b(e.class)) {
                try {
                    hashMap2 = e.f4015d;
                } catch (Throwable th2) {
                    i6.a.a(e.class, th2);
                }
            }
            Integer valueOf = Integer.valueOf(hashCode);
            Object obj = hashMap2.get(valueOf);
            if (obj == null) {
                obj = new e(activity);
                hashMap2.put(valueOf, obj);
            }
            e eVar = (e) obj;
            if (!i6.a.b(e.class)) {
                try {
                    if (!i6.a.b(eVar) && !eVar.f4018c.getAndSet(true)) {
                        int i10 = x5.e.f30297a;
                        View b10 = x5.e.b(eVar.f4016a.get());
                        if (b10 != null) {
                            ViewTreeObserver viewTreeObserver = b10.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.addOnGlobalLayoutListener(eVar);
                                eVar.a();
                            }
                        }
                    }
                } catch (Throwable th3) {
                    i6.a.a(e.class, th3);
                }
            }
        }

        public static void b(Activity activity) {
            l.f(activity, InnerShareParams.ACTIVITY);
            int hashCode = activity.hashCode();
            HashMap hashMap = e.f4015d;
            HashMap hashMap2 = null;
            if (!i6.a.b(e.class)) {
                try {
                    hashMap2 = e.f4015d;
                } catch (Throwable th2) {
                    i6.a.a(e.class, th2);
                }
            }
            e eVar = (e) hashMap2.remove(Integer.valueOf(hashCode));
            if (eVar != null && !i6.a.b(e.class)) {
                try {
                    if (!i6.a.b(eVar) && eVar.f4018c.getAndSet(false)) {
                        int i10 = x5.e.f30297a;
                        View b10 = x5.e.b(eVar.f4016a.get());
                        if (b10 != null) {
                            ViewTreeObserver viewTreeObserver = b10.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.removeOnGlobalLayoutListener(eVar);
                            }
                        }
                    }
                } catch (Throwable th3) {
                    i6.a.a(e.class, th3);
                }
            }
        }
    }

    public e(Activity activity) {
        this.f4016a = new WeakReference<>(activity);
    }

    public final void a() {
        if (i6.a.b(this)) {
            return;
        }
        try {
            s2 s2Var = new s2(10, this);
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                s2Var.run();
            } else {
                this.f4017b.post(s2Var);
            }
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (i6.a.b(this)) {
            return;
        }
        try {
            a();
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }
}
