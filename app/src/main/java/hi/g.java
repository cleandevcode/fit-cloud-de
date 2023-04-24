package hi;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.v0;
import com.topstep.fitcloud.pro.ui.policy.PrivacyPolicyFragment;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;

/* loaded from: classes2.dex */
public abstract class g extends lh.c implements lk.b {

    /* renamed from: m0 */
    public ViewComponentManager$FragmentContextWrapper f16108m0;

    /* renamed from: n0 */
    public boolean f16109n0;

    /* renamed from: o0 */
    public volatile dagger.hilt.android.internal.managers.f f16110o0;

    /* renamed from: p0 */
    public final Object f16111p0;

    /* renamed from: q0 */
    public boolean f16112q0;

    public g() {
        this.f16111p0 = new Object();
        this.f16112q0 = false;
    }

    public g(int i10) {
        super(i10);
        this.f16111p0 = new Object();
        this.f16112q0 = false;
    }

    @Override // androidx.fragment.app.r
    public final void A0(Context context) {
        super.A0(context);
        e1();
        if (this.f16112q0) {
            return;
        }
        this.f16112q0 = true;
        ((j) h()).w0((PrivacyPolicyFragment) this);
    }

    @Override // androidx.fragment.app.r
    public final LayoutInflater G0(Bundle bundle) {
        LayoutInflater G0 = super.G0(bundle);
        return G0.cloneInContext(new ViewComponentManager$FragmentContextWrapper(G0, this));
    }

    public final void e1() {
        if (this.f16108m0 == null) {
            this.f16108m0 = new ViewComponentManager$FragmentContextWrapper(super.i0(), this);
            this.f16109n0 = gk.a.a(super.i0());
        }
    }

    @Override // lk.b
    public final Object h() {
        if (this.f16110o0 == null) {
            synchronized (this.f16111p0) {
                if (this.f16110o0 == null) {
                    this.f16110o0 = new dagger.hilt.android.internal.managers.f(this);
                }
            }
        }
        return this.f16110o0.h();
    }

    @Override // androidx.fragment.app.r
    public final Context i0() {
        if (super.i0() != null || this.f16109n0) {
            e1();
            return this.f16108m0;
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
        ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper = this.f16108m0;
        if (viewComponentManager$FragmentContextWrapper != null && dagger.hilt.android.internal.managers.f.b(viewComponentManager$FragmentContextWrapper) != activity) {
            z10 = false;
        } else {
            z10 = true;
        }
        h7.a.h(z10, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        e1();
        if (!this.f16112q0) {
            this.f16112q0 = true;
            ((j) h()).w0((PrivacyPolicyFragment) this);
        }
    }
}
