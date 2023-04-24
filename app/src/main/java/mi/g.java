package mi;

import androidx.lifecycle.v0;

/* loaded from: classes2.dex */
public abstract class g extends lh.a implements lk.b {

    /* renamed from: u */
    public volatile dagger.hilt.android.internal.managers.a f21817u;

    /* renamed from: v */
    public final Object f21818v = new Object();

    /* renamed from: w */
    public boolean f21819w = false;

    public g() {
        H(new f(this));
    }

    @Override // lk.b
    public final Object h() {
        if (this.f21817u == null) {
            synchronized (this.f21818v) {
                if (this.f21817u == null) {
                    this.f21817u = new dagger.hilt.android.internal.managers.a(this);
                }
            }
        }
        return this.f21817u.h();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.i
    public final v0.b r() {
        return ik.a.a(this, super.r());
    }
}
