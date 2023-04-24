package jh;

import androidx.lifecycle.v0;

/* loaded from: classes2.dex */
public abstract class m extends lh.a implements lk.b {

    /* renamed from: u */
    public volatile dagger.hilt.android.internal.managers.a f17810u;

    /* renamed from: v */
    public final Object f17811v = new Object();

    /* renamed from: w */
    public boolean f17812w = false;

    public m() {
        H(new l(this));
    }

    @Override // lk.b
    public final Object h() {
        if (this.f17810u == null) {
            synchronized (this.f17811v) {
                if (this.f17810u == null) {
                    this.f17810u = new dagger.hilt.android.internal.managers.a(this);
                }
            }
        }
        return this.f17810u.h();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.i
    public final v0.b r() {
        return ik.a.a(this, super.r());
    }
}
