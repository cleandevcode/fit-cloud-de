package ei;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.v0;
import androidx.navigation.fragment.NavHostFragment;
import com.topstep.fitcloud.pro.ui.friend.FriendFragment;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;

/* loaded from: classes2.dex */
public abstract class d1 extends NavHostFragment implements lk.b {

    /* renamed from: r0 */
    public ViewComponentManager$FragmentContextWrapper f13707r0;

    /* renamed from: s0 */
    public boolean f13708s0;

    /* renamed from: t0 */
    public volatile dagger.hilt.android.internal.managers.f f13709t0;

    /* renamed from: u0 */
    public final Object f13710u0 = new Object();

    /* renamed from: v0 */
    public boolean f13711v0 = false;

    @Override // androidx.navigation.fragment.NavHostFragment, androidx.fragment.app.r
    public final void A0(Context context) {
        super.A0(context);
        d1();
        if (this.f13711v0) {
            return;
        }
        this.f13711v0 = true;
        FriendFragment friendFragment = (FriendFragment) this;
        ((v) h()).d();
    }

    @Override // androidx.fragment.app.r
    public final LayoutInflater G0(Bundle bundle) {
        LayoutInflater G0 = super.G0(bundle);
        return G0.cloneInContext(new ViewComponentManager$FragmentContextWrapper(G0, this));
    }

    public final void d1() {
        if (this.f13707r0 == null) {
            this.f13707r0 = new ViewComponentManager$FragmentContextWrapper(super.i0(), this);
            this.f13708s0 = gk.a.a(super.i0());
        }
    }

    @Override // lk.b
    public final Object h() {
        if (this.f13709t0 == null) {
            synchronized (this.f13710u0) {
                if (this.f13709t0 == null) {
                    this.f13709t0 = new dagger.hilt.android.internal.managers.f(this);
                }
            }
        }
        return this.f13709t0.h();
    }

    @Override // androidx.fragment.app.r
    public final Context i0() {
        if (super.i0() != null || this.f13708s0) {
            d1();
            return this.f13707r0;
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
        ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper = this.f13707r0;
        if (viewComponentManager$FragmentContextWrapper != null && dagger.hilt.android.internal.managers.f.b(viewComponentManager$FragmentContextWrapper) != activity) {
            z10 = false;
        } else {
            z10 = true;
        }
        h7.a.h(z10, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        d1();
        if (!this.f13711v0) {
            this.f13711v0 = true;
            FriendFragment friendFragment = (FriendFragment) this;
            ((v) h()).d();
        }
    }
}
