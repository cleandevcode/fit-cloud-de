package hi;

import androidx.lifecycle.v0;

/* loaded from: classes2.dex */
public abstract class e extends lh.a implements lk.b {

    /* renamed from: u */
    public volatile dagger.hilt.android.internal.managers.a f16100u;

    /* renamed from: v */
    public final Object f16101v = new Object();

    /* renamed from: w */
    public boolean f16102w = false;

    public e() {
        H(new d(this));
    }

    @Override // lk.b
    public final Object h() {
        if (this.f16100u == null) {
            synchronized (this.f16101v) {
                if (this.f16100u == null) {
                    this.f16100u = new dagger.hilt.android.internal.managers.a(this);
                }
            }
        }
        return this.f16100u.h();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.i
    public final v0.b r() {
        return ik.a.a(this, super.r());
    }
}
