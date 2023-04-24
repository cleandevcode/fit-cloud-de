package ii;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.v0;
import com.topstep.fitcloud.pro.ui.settings.EditIdentityIdFragment;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;

/* loaded from: classes2.dex */
public abstract class a0<T> extends nh.a<T> implements lk.b {

    /* renamed from: p0 */
    public ViewComponentManager$FragmentContextWrapper f16887p0;

    /* renamed from: q0 */
    public boolean f16888q0;

    /* renamed from: r0 */
    public volatile dagger.hilt.android.internal.managers.f f16889r0;

    /* renamed from: s0 */
    public final Object f16890s0;

    /* renamed from: t0 */
    public boolean f16891t0;

    public a0() {
        this.f16890s0 = new Object();
        this.f16891t0 = false;
    }

    public a0(int i10) {
        super(i10);
        this.f16890s0 = new Object();
        this.f16891t0 = false;
    }

    private void i1() {
        if (this.f16887p0 == null) {
            this.f16887p0 = new ViewComponentManager$FragmentContextWrapper(super.i0(), this);
            this.f16888q0 = gk.a.a(super.i0());
        }
    }

    @Override // androidx.fragment.app.r
    public final void A0(Context context) {
        super.A0(context);
        i1();
        if (this.f16891t0) {
            return;
        }
        this.f16891t0 = true;
        EditIdentityIdFragment editIdentityIdFragment = (EditIdentityIdFragment) this;
        ((s) h()).p();
    }

    @Override // androidx.fragment.app.r
    public final LayoutInflater G0(Bundle bundle) {
        LayoutInflater G0 = super.G0(bundle);
        return G0.cloneInContext(new ViewComponentManager$FragmentContextWrapper(G0, this));
    }

    @Override // lk.b
    public final Object h() {
        if (this.f16889r0 == null) {
            synchronized (this.f16890s0) {
                if (this.f16889r0 == null) {
                    this.f16889r0 = new dagger.hilt.android.internal.managers.f(this);
                }
            }
        }
        return this.f16889r0.h();
    }

    @Override // androidx.fragment.app.r
    public final Context i0() {
        if (super.i0() != null || this.f16888q0) {
            i1();
            return this.f16887p0;
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
        ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper = this.f16887p0;
        if (viewComponentManager$FragmentContextWrapper != null && dagger.hilt.android.internal.managers.f.b(viewComponentManager$FragmentContextWrapper) != activity) {
            z10 = false;
        } else {
            z10 = true;
        }
        h7.a.h(z10, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        i1();
        if (!this.f16891t0) {
            this.f16891t0 = true;
            EditIdentityIdFragment editIdentityIdFragment = (EditIdentityIdFragment) this;
            ((s) h()).p();
        }
    }
}
