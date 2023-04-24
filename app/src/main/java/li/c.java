package li;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.v0;
import com.topstep.fitcloud.pro.ui.settings.wh.WhSettingsFragment;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;

/* loaded from: classes2.dex */
public abstract class c extends lh.i implements lk.b {

    /* renamed from: o0 */
    public ViewComponentManager$FragmentContextWrapper f20030o0;

    /* renamed from: p0 */
    public boolean f20031p0;

    /* renamed from: q0 */
    public volatile dagger.hilt.android.internal.managers.f f20032q0;

    /* renamed from: r0 */
    public final Object f20033r0;

    /* renamed from: s0 */
    public boolean f20034s0;

    public c() {
        this.f20033r0 = new Object();
        this.f20034s0 = false;
    }

    public c(int i10) {
        super(i10);
        this.f20033r0 = new Object();
        this.f20034s0 = false;
    }

    private void g1() {
        if (this.f20030o0 == null) {
            this.f20030o0 = new ViewComponentManager$FragmentContextWrapper(super.i0(), this);
            this.f20031p0 = gk.a.a(super.i0());
        }
    }

    @Override // androidx.fragment.app.r
    public final void A0(Context context) {
        super.A0(context);
        g1();
        if (this.f20034s0) {
            return;
        }
        this.f20034s0 = true;
        ((k) h()).u0((WhSettingsFragment) this);
    }

    @Override // androidx.fragment.app.r
    public final LayoutInflater G0(Bundle bundle) {
        LayoutInflater G0 = super.G0(bundle);
        return G0.cloneInContext(new ViewComponentManager$FragmentContextWrapper(G0, this));
    }

    @Override // lk.b
    public final Object h() {
        if (this.f20032q0 == null) {
            synchronized (this.f20033r0) {
                if (this.f20032q0 == null) {
                    this.f20032q0 = new dagger.hilt.android.internal.managers.f(this);
                }
            }
        }
        return this.f20032q0.h();
    }

    @Override // androidx.fragment.app.r
    public final Context i0() {
        if (super.i0() != null || this.f20031p0) {
            g1();
            return this.f20030o0;
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
        ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper = this.f20030o0;
        if (viewComponentManager$FragmentContextWrapper != null && dagger.hilt.android.internal.managers.f.b(viewComponentManager$FragmentContextWrapper) != activity) {
            z10 = false;
        } else {
            z10 = true;
        }
        h7.a.h(z10, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        g1();
        if (!this.f20034s0) {
            this.f20034s0 = true;
            ((k) h()).u0((WhSettingsFragment) this);
        }
    }
}
