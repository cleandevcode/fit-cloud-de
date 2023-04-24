package dagger.hilt.android.internal.managers;

import android.app.Activity;
import android.app.Application;
import androidx.activity.ComponentActivity;
import ih.v;

/* loaded from: classes2.dex */
public final class a implements lk.b<Object> {

    /* renamed from: a */
    public volatile of.b f12949a;

    /* renamed from: b */
    public final Object f12950b = new Object();

    /* renamed from: c */
    public final Activity f12951c;

    /* renamed from: d */
    public final c f12952d;

    /* renamed from: dagger.hilt.android.internal.managers.a$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC0220a {
        of.a b();
    }

    public a(Activity activity) {
        this.f12951c = activity;
        this.f12952d = new c((ComponentActivity) activity);
    }

    public final Object a() {
        if (!(this.f12951c.getApplication() instanceof lk.b)) {
            if (Application.class.equals(this.f12951c.getApplication().getClass())) {
                throw new IllegalStateException("Hilt Activity must be attached to an @HiltAndroidApp Application. Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?");
            }
            StringBuilder a10 = android.support.v4.media.d.a("Hilt Activity must be attached to an @AndroidEntryPoint Application. Found: ");
            a10.append(this.f12951c.getApplication().getClass());
            throw new IllegalStateException(a10.toString());
        }
        of.a b10 = ((InterfaceC0220a) v.f(this.f12952d, InterfaceC0220a.class)).b();
        Activity activity = this.f12951c;
        b10.getClass();
        activity.getClass();
        b10.getClass();
        return new of.b(b10.f23083a, b10.f23084b);
    }

    @Override // lk.b
    public final Object h() {
        if (this.f12949a == null) {
            synchronized (this.f12950b) {
                if (this.f12949a == null) {
                    this.f12949a = (of.b) a();
                }
            }
        }
        return this.f12949a;
    }
}
