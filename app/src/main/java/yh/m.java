package yh;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.v0;
import com.topstep.fitcloudpro.R;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;

/* loaded from: classes2.dex */
public abstract class m extends lh.i implements lk.b {

    /* renamed from: o0 */
    public ViewComponentManager$FragmentContextWrapper f31758o0;

    /* renamed from: p0 */
    public boolean f31759p0;

    /* renamed from: q0 */
    public volatile dagger.hilt.android.internal.managers.f f31760q0;

    /* renamed from: r0 */
    public final Object f31761r0;

    /* renamed from: s0 */
    public boolean f31762s0;

    public m() {
        super(R.layout.fragment_dial_packet_list);
        this.f31761r0 = new Object();
        this.f31762s0 = false;
    }

    @Override // androidx.fragment.app.r
    public final void A0(Context context) {
        super.A0(context);
        g1();
        if (this.f31762s0) {
            return;
        }
        this.f31762s0 = true;
        ((f) h()).d0((e) this);
    }

    @Override // androidx.fragment.app.r
    public final LayoutInflater G0(Bundle bundle) {
        LayoutInflater G0 = super.G0(bundle);
        return G0.cloneInContext(new ViewComponentManager$FragmentContextWrapper(G0, this));
    }

    public final void g1() {
        if (this.f31758o0 == null) {
            this.f31758o0 = new ViewComponentManager$FragmentContextWrapper(super.i0(), this);
            this.f31759p0 = gk.a.a(super.i0());
        }
    }

    @Override // lk.b
    public final Object h() {
        if (this.f31760q0 == null) {
            synchronized (this.f31761r0) {
                if (this.f31760q0 == null) {
                    this.f31760q0 = new dagger.hilt.android.internal.managers.f(this);
                }
            }
        }
        return this.f31760q0.h();
    }

    @Override // androidx.fragment.app.r
    public final Context i0() {
        if (super.i0() != null || this.f31759p0) {
            g1();
            return this.f31758o0;
        }
        return null;
    }

    @Override // androidx.fragment.app.r, androidx.lifecycle.i
    public final v0.b r() {
        return ik.a.b(this, super.r());
    }

    @Override // androidx.fragment.app.r
    public final void z0(Activity activity) {
        boolean z10;
        this.E = true;
        ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper = this.f31758o0;
        if (viewComponentManager$FragmentContextWrapper != null && dagger.hilt.android.internal.managers.f.b(viewComponentManager$FragmentContextWrapper) != activity) {
            z10 = false;
        } else {
            z10 = true;
        }
        h7.a.h(z10, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        g1();
        if (!this.f31762s0) {
            this.f31762s0 = true;
            ((f) h()).d0((e) this);
        }
    }
}
