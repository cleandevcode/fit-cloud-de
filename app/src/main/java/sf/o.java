package sf;

import com.topstep.fitcloud.pro.function.DeviceService;

/* loaded from: classes2.dex */
public abstract class o extends androidx.lifecycle.x implements lk.b {

    /* renamed from: b */
    public volatile dagger.hilt.android.internal.managers.g f26961b;

    /* renamed from: c */
    public final Object f26962c = new Object();

    /* renamed from: d */
    public boolean f26963d = false;

    @Override // lk.b
    public final Object h() {
        if (this.f26961b == null) {
            synchronized (this.f26962c) {
                if (this.f26961b == null) {
                    this.f26961b = new dagger.hilt.android.internal.managers.g(this);
                }
            }
        }
        return this.f26961b.h();
    }

    @Override // androidx.lifecycle.x, android.app.Service
    public void onCreate() {
        if (!this.f26963d) {
            this.f26963d = true;
            ((k) h()).c((DeviceService) this);
        }
        super.onCreate();
    }
}
