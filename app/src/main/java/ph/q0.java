package ph;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.v0;
import com.topstep.fitcloud.pro.ui.data.PressureDetailFragment;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import r7.a;
import vf.i;

/* loaded from: classes2.dex */
public abstract class q0<T extends vf.i, U extends r7.a<?>> extends b<T, U> implements lk.b {

    /* renamed from: t0 */
    public ViewComponentManager$FragmentContextWrapper f24211t0;

    /* renamed from: u0 */
    public boolean f24212u0;

    /* renamed from: v0 */
    public volatile dagger.hilt.android.internal.managers.f f24213v0;

    /* renamed from: w0 */
    public final Object f24214w0 = new Object();

    /* renamed from: x0 */
    public boolean f24215x0 = false;

    @Override // androidx.fragment.app.r
    public final void A0(Context context) {
        super.A0(context);
        o1();
        if (this.f24215x0) {
            return;
        }
        this.f24215x0 = true;
        PressureDetailFragment pressureDetailFragment = (PressureDetailFragment) this;
        ((x0) h()).P();
    }

    @Override // androidx.fragment.app.r
    public final LayoutInflater G0(Bundle bundle) {
        LayoutInflater G0 = super.G0(bundle);
        return G0.cloneInContext(new ViewComponentManager$FragmentContextWrapper(G0, this));
    }

    @Override // lk.b
    public final Object h() {
        if (this.f24213v0 == null) {
            synchronized (this.f24214w0) {
                if (this.f24213v0 == null) {
                    this.f24213v0 = new dagger.hilt.android.internal.managers.f(this);
                }
            }
        }
        return this.f24213v0.h();
    }

    @Override // androidx.fragment.app.r
    public final Context i0() {
        if (super.i0() != null || this.f24212u0) {
            o1();
            return this.f24211t0;
        }
        return null;
    }

    public final void o1() {
        if (this.f24211t0 == null) {
            this.f24211t0 = new ViewComponentManager$FragmentContextWrapper(super.i0(), this);
            this.f24212u0 = gk.a.a(super.i0());
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
        ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper = this.f24211t0;
        if (viewComponentManager$FragmentContextWrapper != null && dagger.hilt.android.internal.managers.f.b(viewComponentManager$FragmentContextWrapper) != activity) {
            z10 = false;
        } else {
            z10 = true;
        }
        h7.a.h(z10, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o1();
        if (!this.f24215x0) {
            this.f24215x0 = true;
            PressureDetailFragment pressureDetailFragment = (PressureDetailFragment) this;
            ((x0) h()).P();
        }
    }
}
