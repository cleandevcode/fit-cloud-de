package sf;

import com.topstep.fitcloud.pro.function.MyNotificationListenerService;

/* loaded from: classes2.dex */
public abstract class p extends bk.a implements lk.b {

    /* renamed from: c */
    public volatile dagger.hilt.android.internal.managers.g f26964c;

    /* renamed from: d */
    public final Object f26965d = new Object();

    /* renamed from: e */
    public boolean f26966e = false;

    @Override // lk.b
    public final Object h() {
        if (this.f26964c == null) {
            synchronized (this.f26965d) {
                if (this.f26964c == null) {
                    this.f26964c = new dagger.hilt.android.internal.managers.g(this);
                }
            }
        }
        return this.f26964c.h();
    }

    @Override // bk.a, android.app.Service
    public void onCreate() {
        if (!this.f26966e) {
            this.f26966e = true;
            ((s) h()).b((MyNotificationListenerService) this);
        }
        super.onCreate();
    }
}
