package uh;

import androidx.lifecycle.v0;

/* loaded from: classes2.dex */
public abstract class v extends lh.a implements lk.b {

    /* renamed from: u */
    public volatile dagger.hilt.android.internal.managers.a f28801u;

    /* renamed from: v */
    public final Object f28802v = new Object();

    /* renamed from: w */
    public boolean f28803w = false;

    public v() {
        H(new u(this));
    }

    @Override // lk.b
    public final Object h() {
        if (this.f28801u == null) {
            synchronized (this.f28802v) {
                if (this.f28801u == null) {
                    this.f28801u = new dagger.hilt.android.internal.managers.a(this);
                }
            }
        }
        return this.f28801u.h();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.i
    public final v0.b r() {
        return ik.a.a(this, super.r());
    }
}
