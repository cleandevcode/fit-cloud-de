package sf;

import com.topstep.fitcloud.pro.function.SportService;

/* loaded from: classes2.dex */
public abstract class r extends x6.a implements lk.b {

    /* renamed from: p */
    public volatile dagger.hilt.android.internal.managers.g f26969p;

    /* renamed from: q */
    public final Object f26970q = new Object();

    /* renamed from: r */
    public boolean f26971r = false;

    @Override // lk.b
    public final Object h() {
        if (this.f26969p == null) {
            synchronized (this.f26970q) {
                if (this.f26969p == null) {
                    this.f26969p = new dagger.hilt.android.internal.managers.g(this);
                }
            }
        }
        return this.f26969p.h();
    }

    @Override // x6.c, android.app.Service
    public final void onCreate() {
        if (!this.f26971r) {
            this.f26971r = true;
            ((x) h()).a((SportService) this);
        }
        super.onCreate();
    }
}
