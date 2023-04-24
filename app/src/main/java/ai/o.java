package ai;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.v0;
import androidx.navigation.fragment.NavHostFragment;
import com.topstep.fitcloud.pro.ui.device.game.push.GamePushFragment;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;

/* loaded from: classes2.dex */
public abstract class o extends NavHostFragment implements lk.b {

    /* renamed from: r0 */
    public ViewComponentManager$FragmentContextWrapper f584r0;

    /* renamed from: s0 */
    public boolean f585s0;

    /* renamed from: t0 */
    public volatile dagger.hilt.android.internal.managers.f f586t0;

    /* renamed from: u0 */
    public final Object f587u0 = new Object();

    /* renamed from: v0 */
    public boolean f588v0 = false;

    @Override // androidx.navigation.fragment.NavHostFragment, androidx.fragment.app.r
    public final void A0(Context context) {
        super.A0(context);
        d1();
        if (this.f588v0) {
            return;
        }
        this.f588v0 = true;
        GamePushFragment gamePushFragment = (GamePushFragment) this;
        ((h) h()).J();
    }

    @Override // androidx.fragment.app.r
    public final LayoutInflater G0(Bundle bundle) {
        LayoutInflater G0 = super.G0(bundle);
        return G0.cloneInContext(new ViewComponentManager$FragmentContextWrapper(G0, this));
    }

    public final void d1() {
        if (this.f584r0 == null) {
            this.f584r0 = new ViewComponentManager$FragmentContextWrapper(super.i0(), this);
            this.f585s0 = gk.a.a(super.i0());
        }
    }

    @Override // lk.b
    public final Object h() {
        if (this.f586t0 == null) {
            synchronized (this.f587u0) {
                if (this.f586t0 == null) {
                    this.f586t0 = new dagger.hilt.android.internal.managers.f(this);
                }
            }
        }
        return this.f586t0.h();
    }

    @Override // androidx.fragment.app.r
    public final Context i0() {
        if (super.i0() != null || this.f585s0) {
            d1();
            return this.f584r0;
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
        ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper = this.f584r0;
        if (viewComponentManager$FragmentContextWrapper != null && dagger.hilt.android.internal.managers.f.b(viewComponentManager$FragmentContextWrapper) != activity) {
            z10 = false;
        } else {
            z10 = true;
        }
        h7.a.h(z10, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        d1();
        if (!this.f588v0) {
            this.f588v0 = true;
            GamePushFragment gamePushFragment = (GamePushFragment) this;
            ((h) h()).J();
        }
    }
}
