package ih;

import androidx.lifecycle.v0;

/* loaded from: classes2.dex */
public abstract class n extends lh.a implements lk.b {

    /* renamed from: u */
    public volatile dagger.hilt.android.internal.managers.a f16861u;

    /* renamed from: v */
    public final Object f16862v = new Object();

    /* renamed from: w */
    public boolean f16863w = false;

    public n() {
        H(new m(this));
    }

    @Override // lk.b
    public final Object h() {
        if (this.f16861u == null) {
            synchronized (this.f16862v) {
                if (this.f16861u == null) {
                    this.f16861u = new dagger.hilt.android.internal.managers.a(this);
                }
            }
        }
        return this.f16861u.h();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.i
    public final v0.b r() {
        return ik.a.a(this, super.r());
    }
}
