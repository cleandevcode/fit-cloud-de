package ph;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.v0;
import com.topstep.fitcloud.pro.ui.data.ExerciseFragment;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;

/* loaded from: classes2.dex */
public abstract class l0 extends y implements lk.b {

    /* renamed from: p0 */
    public ViewComponentManager$FragmentContextWrapper f24176p0;

    /* renamed from: q0 */
    public boolean f24177q0;

    /* renamed from: r0 */
    public volatile dagger.hilt.android.internal.managers.f f24178r0;

    /* renamed from: s0 */
    public final Object f24179s0;

    /* renamed from: t0 */
    public boolean f24180t0;

    public l0(int i10) {
        super(i10);
        this.f24179s0 = new Object();
        this.f24180t0 = false;
    }

    @Override // androidx.fragment.app.r
    public final void A0(Context context) {
        super.A0(context);
        h1();
        if (this.f24180t0) {
            return;
        }
        this.f24180t0 = true;
        ((c0) h()).U((ExerciseFragment) this);
    }

    @Override // androidx.fragment.app.r
    public final LayoutInflater G0(Bundle bundle) {
        LayoutInflater G0 = super.G0(bundle);
        return G0.cloneInContext(new ViewComponentManager$FragmentContextWrapper(G0, this));
    }

    @Override // lk.b
    public final Object h() {
        if (this.f24178r0 == null) {
            synchronized (this.f24179s0) {
                if (this.f24178r0 == null) {
                    this.f24178r0 = new dagger.hilt.android.internal.managers.f(this);
                }
            }
        }
        return this.f24178r0.h();
    }

    public final void h1() {
        if (this.f24176p0 == null) {
            this.f24176p0 = new ViewComponentManager$FragmentContextWrapper(super.i0(), this);
            this.f24177q0 = gk.a.a(super.i0());
        }
    }

    @Override // androidx.fragment.app.r
    public final Context i0() {
        if (super.i0() != null || this.f24177q0) {
            h1();
            return this.f24176p0;
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
        ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper = this.f24176p0;
        if (viewComponentManager$FragmentContextWrapper != null && dagger.hilt.android.internal.managers.f.b(viewComponentManager$FragmentContextWrapper) != activity) {
            z10 = false;
        } else {
            z10 = true;
        }
        h7.a.h(z10, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        h1();
        if (!this.f24180t0) {
            this.f24180t0 = true;
            ((c0) h()).U((ExerciseFragment) this);
        }
    }
}
