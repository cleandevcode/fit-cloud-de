package ih;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.v0;
import com.topstep.fitcloud.pro.ui.MineFragment;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;

/* loaded from: classes2.dex */
public abstract class o<T> extends nh.a<T> implements lk.b {

    /* renamed from: p0 */
    public ViewComponentManager$FragmentContextWrapper f16864p0;

    /* renamed from: q0 */
    public boolean f16865q0;

    /* renamed from: r0 */
    public volatile dagger.hilt.android.internal.managers.f f16866r0;

    /* renamed from: s0 */
    public final Object f16867s0;

    /* renamed from: t0 */
    public boolean f16868t0;

    public o() {
        this.f16867s0 = new Object();
        this.f16868t0 = false;
    }

    public o(int i10) {
        super(i10);
        this.f16867s0 = new Object();
        this.f16868t0 = false;
    }

    @Override // androidx.fragment.app.r
    public final void A0(Context context) {
        super.A0(context);
        i1();
        if (this.f16868t0) {
            return;
        }
        this.f16868t0 = true;
        MineFragment mineFragment = (MineFragment) this;
        ((z) h()).f0();
    }

    @Override // androidx.fragment.app.r
    public final LayoutInflater G0(Bundle bundle) {
        LayoutInflater G0 = super.G0(bundle);
        return G0.cloneInContext(new ViewComponentManager$FragmentContextWrapper(G0, this));
    }

    @Override // lk.b
    public final Object h() {
        if (this.f16866r0 == null) {
            synchronized (this.f16867s0) {
                if (this.f16866r0 == null) {
                    this.f16866r0 = new dagger.hilt.android.internal.managers.f(this);
                }
            }
        }
        return this.f16866r0.h();
    }

    @Override // androidx.fragment.app.r
    public final Context i0() {
        if (super.i0() != null || this.f16865q0) {
            i1();
            return this.f16864p0;
        }
        return null;
    }

    public final void i1() {
        if (this.f16864p0 == null) {
            this.f16864p0 = new ViewComponentManager$FragmentContextWrapper(super.i0(), this);
            this.f16865q0 = gk.a.a(super.i0());
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
        ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper = this.f16864p0;
        if (viewComponentManager$FragmentContextWrapper != null && dagger.hilt.android.internal.managers.f.b(viewComponentManager$FragmentContextWrapper) != activity) {
            z10 = false;
        } else {
            z10 = true;
        }
        h7.a.h(z10, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        i1();
        if (!this.f16868t0) {
            this.f16868t0 = true;
            MineFragment mineFragment = (MineFragment) this;
            ((z) h()).f0();
        }
    }
}
