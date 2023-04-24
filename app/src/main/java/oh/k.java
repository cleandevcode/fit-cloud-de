package oh;

import androidx.lifecycle.v0;

/* loaded from: classes2.dex */
public abstract class k extends lh.a implements lk.b {

    /* renamed from: u */
    public volatile dagger.hilt.android.internal.managers.a f23547u;

    /* renamed from: v */
    public final Object f23548v = new Object();

    /* renamed from: w */
    public boolean f23549w = false;

    public k() {
        H(new j(this));
    }

    @Override // lk.b
    public final Object h() {
        if (this.f23547u == null) {
            synchronized (this.f23548v) {
                if (this.f23547u == null) {
                    this.f23547u = new dagger.hilt.android.internal.managers.a(this);
                }
            }
        }
        return this.f23547u.h();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.i
    public final v0.b r() {
        return ik.a.a(this, super.r());
    }
}
