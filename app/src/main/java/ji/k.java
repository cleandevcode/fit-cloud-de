package ji;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.v0;
import com.topstep.fitcloud.pro.ui.settings.assist.AssistFragment;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;

/* loaded from: classes2.dex */
public abstract class k extends lh.i implements lk.b {

    /* renamed from: o0 */
    public ViewComponentManager$FragmentContextWrapper f17855o0;

    /* renamed from: p0 */
    public boolean f17856p0;

    /* renamed from: q0 */
    public volatile dagger.hilt.android.internal.managers.f f17857q0;

    /* renamed from: r0 */
    public final Object f17858r0;

    /* renamed from: s0 */
    public boolean f17859s0;

    public k() {
        this.f17858r0 = new Object();
        this.f17859s0 = false;
    }

    public k(int i10) {
        super(i10);
        this.f17858r0 = new Object();
        this.f17859s0 = false;
    }

    private void g1() {
        if (this.f17855o0 == null) {
            this.f17855o0 = new ViewComponentManager$FragmentContextWrapper(super.i0(), this);
            this.f17856p0 = gk.a.a(super.i0());
        }
    }

    @Override // androidx.fragment.app.r
    public final void A0(Context context) {
        super.A0(context);
        g1();
        if (this.f17859s0) {
            return;
        }
        this.f17859s0 = true;
        ((a) h()).G((AssistFragment) this);
    }

    @Override // androidx.fragment.app.r
    public final LayoutInflater G0(Bundle bundle) {
        LayoutInflater G0 = super.G0(bundle);
        return G0.cloneInContext(new ViewComponentManager$FragmentContextWrapper(G0, this));
    }

    @Override // lk.b
    public final Object h() {
        if (this.f17857q0 == null) {
            synchronized (this.f17858r0) {
                if (this.f17857q0 == null) {
                    this.f17857q0 = new dagger.hilt.android.internal.managers.f(this);
                }
            }
        }
        return this.f17857q0.h();
    }

    @Override // androidx.fragment.app.r
    public final Context i0() {
        if (super.i0() != null || this.f17856p0) {
            g1();
            return this.f17855o0;
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
        ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper = this.f17855o0;
        if (viewComponentManager$FragmentContextWrapper != null && dagger.hilt.android.internal.managers.f.b(viewComponentManager$FragmentContextWrapper) != activity) {
            z10 = false;
        } else {
            z10 = true;
        }
        h7.a.h(z10, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        g1();
        if (!this.f17859s0) {
            this.f17859s0 = true;
            ((a) h()).G((AssistFragment) this);
        }
    }
}
