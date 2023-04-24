package ii;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.v0;
import com.topstep.fitcloud.pro.ui.settings.EditUserFragment;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;

/* loaded from: classes2.dex */
public abstract class b0 extends lh.h implements lk.b {

    /* renamed from: v0 */
    public ViewComponentManager$FragmentContextWrapper f16894v0;

    /* renamed from: w0 */
    public boolean f16895w0;

    /* renamed from: x0 */
    public volatile dagger.hilt.android.internal.managers.f f16896x0;

    /* renamed from: y0 */
    public final Object f16897y0;

    /* renamed from: z0 */
    public boolean f16898z0;

    public b0() {
        this.f16897y0 = new Object();
        this.f16898z0 = false;
    }

    public b0(int i10) {
        super(i10);
        this.f16897y0 = new Object();
        this.f16898z0 = false;
    }

    private void r1() {
        if (this.f16894v0 == null) {
            this.f16894v0 = new ViewComponentManager$FragmentContextWrapper(super.i0(), this);
            this.f16895w0 = gk.a.a(super.i0());
        }
    }

    @Override // androidx.fragment.app.r
    public final void A0(Context context) {
        super.A0(context);
        r1();
        if (this.f16898z0) {
            return;
        }
        this.f16898z0 = true;
        ((u) h()).V((EditUserFragment) this);
    }

    @Override // androidx.fragment.app.r
    public final LayoutInflater G0(Bundle bundle) {
        LayoutInflater G0 = super.G0(bundle);
        return G0.cloneInContext(new ViewComponentManager$FragmentContextWrapper(G0, this));
    }

    @Override // lk.b
    public final Object h() {
        if (this.f16896x0 == null) {
            synchronized (this.f16897y0) {
                if (this.f16896x0 == null) {
                    this.f16896x0 = new dagger.hilt.android.internal.managers.f(this);
                }
            }
        }
        return this.f16896x0.h();
    }

    @Override // androidx.fragment.app.r
    public final Context i0() {
        if (super.i0() != null || this.f16895w0) {
            r1();
            return this.f16894v0;
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
        ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper = this.f16894v0;
        if (viewComponentManager$FragmentContextWrapper != null && dagger.hilt.android.internal.managers.f.b(viewComponentManager$FragmentContextWrapper) != activity) {
            z10 = false;
        } else {
            z10 = true;
        }
        h7.a.h(z10, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        r1();
        if (!this.f16898z0) {
            this.f16898z0 = true;
            ((u) h()).V((EditUserFragment) this);
        }
    }
}
