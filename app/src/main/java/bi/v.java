package bi;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.v0;
import com.topstep.fitcloud.pro.ui.device.settings.CollectionCodeFragment;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;

/* loaded from: classes2.dex */
public abstract class v extends lh.i implements lk.b {

    /* renamed from: o0 */
    public ViewComponentManager$FragmentContextWrapper f4364o0;

    /* renamed from: p0 */
    public boolean f4365p0;

    /* renamed from: q0 */
    public volatile dagger.hilt.android.internal.managers.f f4366q0;

    /* renamed from: r0 */
    public final Object f4367r0;

    /* renamed from: s0 */
    public boolean f4368s0;

    public v() {
        this.f4367r0 = new Object();
        this.f4368s0 = false;
    }

    public v(int i10) {
        super(i10);
        this.f4367r0 = new Object();
        this.f4368s0 = false;
    }

    private void g1() {
        if (this.f4364o0 == null) {
            this.f4364o0 = new ViewComponentManager$FragmentContextWrapper(super.i0(), this);
            this.f4365p0 = gk.a.a(super.i0());
        }
    }

    @Override // androidx.fragment.app.r
    public final void A0(Context context) {
        super.A0(context);
        g1();
        if (this.f4368s0) {
            return;
        }
        this.f4368s0 = true;
        CollectionCodeFragment collectionCodeFragment = (CollectionCodeFragment) this;
        ((j) h()).l0();
    }

    @Override // androidx.fragment.app.r
    public final LayoutInflater G0(Bundle bundle) {
        LayoutInflater G0 = super.G0(bundle);
        return G0.cloneInContext(new ViewComponentManager$FragmentContextWrapper(G0, this));
    }

    @Override // lk.b
    public final Object h() {
        if (this.f4366q0 == null) {
            synchronized (this.f4367r0) {
                if (this.f4366q0 == null) {
                    this.f4366q0 = new dagger.hilt.android.internal.managers.f(this);
                }
            }
        }
        return this.f4366q0.h();
    }

    @Override // androidx.fragment.app.r
    public final Context i0() {
        if (super.i0() != null || this.f4365p0) {
            g1();
            return this.f4364o0;
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
        ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper = this.f4364o0;
        if (viewComponentManager$FragmentContextWrapper != null && dagger.hilt.android.internal.managers.f.b(viewComponentManager$FragmentContextWrapper) != activity) {
            z10 = false;
        } else {
            z10 = true;
        }
        h7.a.h(z10, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        g1();
        if (!this.f4368s0) {
            this.f4368s0 = true;
            CollectionCodeFragment collectionCodeFragment = (CollectionCodeFragment) this;
            ((j) h()).l0();
        }
    }
}
