package ph;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.v0;
import com.topstep.fitcloud.pro.ui.data.HeartRateFragment;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;

/* loaded from: classes2.dex */
public abstract class n0 extends u implements lk.b {

    /* renamed from: t0 */
    public ViewComponentManager$FragmentContextWrapper f24190t0;

    /* renamed from: u0 */
    public boolean f24191u0;

    /* renamed from: v0 */
    public volatile dagger.hilt.android.internal.managers.f f24192v0;

    /* renamed from: w0 */
    public final Object f24193w0;

    /* renamed from: x0 */
    public boolean f24194x0;

    public n0(int i10) {
        super(i10);
        this.f24193w0 = new Object();
        this.f24194x0 = false;
    }

    @Override // androidx.fragment.app.r
    public final void A0(Context context) {
        super.A0(context);
        o1();
        if (this.f24194x0) {
            return;
        }
        this.f24194x0 = true;
        ((i0) h()).h0((HeartRateFragment) this);
    }

    @Override // androidx.fragment.app.r
    public final LayoutInflater G0(Bundle bundle) {
        LayoutInflater G0 = super.G0(bundle);
        return G0.cloneInContext(new ViewComponentManager$FragmentContextWrapper(G0, this));
    }

    @Override // lk.b
    public final Object h() {
        if (this.f24192v0 == null) {
            synchronized (this.f24193w0) {
                if (this.f24192v0 == null) {
                    this.f24192v0 = new dagger.hilt.android.internal.managers.f(this);
                }
            }
        }
        return this.f24192v0.h();
    }

    @Override // androidx.fragment.app.r
    public final Context i0() {
        if (super.i0() != null || this.f24191u0) {
            o1();
            return this.f24190t0;
        }
        return null;
    }

    public final void o1() {
        if (this.f24190t0 == null) {
            this.f24190t0 = new ViewComponentManager$FragmentContextWrapper(super.i0(), this);
            this.f24191u0 = gk.a.a(super.i0());
        }
    }

    @Override // androidx.fragment.app.r, androidx.lifecycle.i
    public final v0.b r() {
        return ik.a.b(this, super.r());
    }

    @Override // androidx.fragment.app.r
    public final void z0(Activity activity) {
        boolean z10;
        this.E = true;
        ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper = this.f24190t0;
        if (viewComponentManager$FragmentContextWrapper != null && dagger.hilt.android.internal.managers.f.b(viewComponentManager$FragmentContextWrapper) != activity) {
            z10 = false;
        } else {
            z10 = true;
        }
        h7.a.h(z10, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o1();
        if (!this.f24194x0) {
            this.f24194x0 = true;
            ((i0) h()).h0((HeartRateFragment) this);
        }
    }
}
