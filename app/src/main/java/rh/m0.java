package rh;

import androidx.lifecycle.v0;

/* loaded from: classes2.dex */
public abstract class m0 extends lh.a implements lk.b {

    /* renamed from: u */
    public volatile dagger.hilt.android.internal.managers.a f25717u;

    /* renamed from: v */
    public final Object f25718v = new Object();

    /* renamed from: w */
    public boolean f25719w = false;

    public m0() {
        H(new l0(this));
    }

    @Override // lk.b
    public final Object h() {
        if (this.f25717u == null) {
            synchronized (this.f25718v) {
                if (this.f25717u == null) {
                    this.f25717u = new dagger.hilt.android.internal.managers.a(this);
                }
            }
        }
        return this.f25717u.h();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.i
    public final v0.b r() {
        return ik.a.a(this, super.r());
    }
}
