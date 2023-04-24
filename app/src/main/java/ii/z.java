package ii;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.v0;
import com.topstep.fitcloud.pro.ui.settings.AccountManageFragment;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;

/* loaded from: classes2.dex */
public abstract class z extends lh.c implements lk.b {

    /* renamed from: m0 */
    public ViewComponentManager$FragmentContextWrapper f17019m0;

    /* renamed from: n0 */
    public boolean f17020n0;

    /* renamed from: o0 */
    public volatile dagger.hilt.android.internal.managers.f f17021o0;

    /* renamed from: p0 */
    public final Object f17022p0;

    /* renamed from: q0 */
    public boolean f17023q0;

    public z() {
        this.f17022p0 = new Object();
        this.f17023q0 = false;
    }

    public z(int i10) {
        super(i10);
        this.f17022p0 = new Object();
        this.f17023q0 = false;
    }

    @Override // androidx.fragment.app.r
    public final void A0(Context context) {
        super.A0(context);
        e1();
        if (this.f17023q0) {
            return;
        }
        this.f17023q0 = true;
        AccountManageFragment accountManageFragment = (AccountManageFragment) this;
        ((n) h()).b();
    }

    @Override // androidx.fragment.app.r
    public final LayoutInflater G0(Bundle bundle) {
        LayoutInflater G0 = super.G0(bundle);
        return G0.cloneInContext(new ViewComponentManager$FragmentContextWrapper(G0, this));
    }

    public final void e1() {
        if (this.f17019m0 == null) {
            this.f17019m0 = new ViewComponentManager$FragmentContextWrapper(super.i0(), this);
            this.f17020n0 = gk.a.a(super.i0());
        }
    }

    @Override // lk.b
    public final Object h() {
        if (this.f17021o0 == null) {
            synchronized (this.f17022p0) {
                if (this.f17021o0 == null) {
                    this.f17021o0 = new dagger.hilt.android.internal.managers.f(this);
                }
            }
        }
        return this.f17021o0.h();
    }

    @Override // androidx.fragment.app.r
    public final Context i0() {
        if (super.i0() != null || this.f17020n0) {
            e1();
            return this.f17019m0;
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
        ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper = this.f17019m0;
        if (viewComponentManager$FragmentContextWrapper != null && dagger.hilt.android.internal.managers.f.b(viewComponentManager$FragmentContextWrapper) != activity) {
            z10 = false;
        } else {
            z10 = true;
        }
        h7.a.h(z10, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        e1();
        if (!this.f17023q0) {
            this.f17023q0 = true;
            AccountManageFragment accountManageFragment = (AccountManageFragment) this;
            ((n) h()).b();
        }
    }
}
