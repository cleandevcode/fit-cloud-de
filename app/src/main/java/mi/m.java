package mi;

import androidx.lifecycle.v0;

/* loaded from: classes2.dex */
public abstract class m extends lh.a implements lk.b {

    /* renamed from: u */
    public volatile dagger.hilt.android.internal.managers.a f21843u;

    /* renamed from: v */
    public final Object f21844v = new Object();

    /* renamed from: w */
    public boolean f21845w = false;

    public m() {
        H(new l(this));
    }

    @Override // lk.b
    public final Object h() {
        if (this.f21843u == null) {
            synchronized (this.f21844v) {
                if (this.f21843u == null) {
                    this.f21843u = new dagger.hilt.android.internal.managers.a(this);
                }
            }
        }
        return this.f21843u.h();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.i
    public final v0.b r() {
        return ik.a.a(this, super.r());
    }
}
