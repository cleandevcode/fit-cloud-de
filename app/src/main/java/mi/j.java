package mi;

import androidx.lifecycle.v0;

/* loaded from: classes2.dex */
public abstract class j extends lh.a implements lk.b {

    /* renamed from: u */
    public volatile dagger.hilt.android.internal.managers.a f21829u;

    /* renamed from: v */
    public final Object f21830v = new Object();

    /* renamed from: w */
    public boolean f21831w = false;

    public j() {
        H(new i(this));
    }

    @Override // lk.b
    public final Object h() {
        if (this.f21829u == null) {
            synchronized (this.f21830v) {
                if (this.f21829u == null) {
                    this.f21829u = new dagger.hilt.android.internal.managers.a(this);
                }
            }
        }
        return this.f21829u.h();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.i
    public final v0.b r() {
        return ik.a.a(this, super.r());
    }
}
