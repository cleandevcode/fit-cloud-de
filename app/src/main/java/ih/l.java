package ih;

import androidx.lifecycle.v0;

/* loaded from: classes2.dex */
public abstract class l extends androidx.fragment.app.x implements lk.b {

    /* renamed from: t */
    public volatile dagger.hilt.android.internal.managers.a f16857t;

    /* renamed from: u */
    public final Object f16858u = new Object();

    /* renamed from: v */
    public boolean f16859v = false;

    public l() {
        H(new k(this));
    }

    @Override // lk.b
    public final Object h() {
        if (this.f16857t == null) {
            synchronized (this.f16858u) {
                if (this.f16857t == null) {
                    this.f16857t = new dagger.hilt.android.internal.managers.a(this);
                }
            }
        }
        return this.f16857t.h();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.i
    public final v0.b r() {
        return ik.a.a(this, super.r());
    }
}
