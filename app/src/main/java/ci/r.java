package ci;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.v0;
import com.topstep.fitcloud.pro.ui.device.song.push.AudioSelectFragment;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;

/* loaded from: classes2.dex */
public abstract class r extends lh.i implements lk.b {

    /* renamed from: o0 */
    public ViewComponentManager$FragmentContextWrapper f4819o0;

    /* renamed from: p0 */
    public boolean f4820p0;

    /* renamed from: q0 */
    public volatile dagger.hilt.android.internal.managers.f f4821q0;

    /* renamed from: r0 */
    public final Object f4822r0;

    /* renamed from: s0 */
    public boolean f4823s0;

    public r() {
        this.f4822r0 = new Object();
        this.f4823s0 = false;
    }

    public r(int i10) {
        super(i10);
        this.f4822r0 = new Object();
        this.f4823s0 = false;
    }

    private void g1() {
        if (this.f4819o0 == null) {
            this.f4819o0 = new ViewComponentManager$FragmentContextWrapper(super.i0(), this);
            this.f4820p0 = gk.a.a(super.i0());
        }
    }

    @Override // androidx.fragment.app.r
    public final void A0(Context context) {
        super.A0(context);
        g1();
        if (this.f4823s0) {
            return;
        }
        this.f4823s0 = true;
        AudioSelectFragment audioSelectFragment = (AudioSelectFragment) this;
        ((e) h()).b0();
    }

    @Override // androidx.fragment.app.r
    public final LayoutInflater G0(Bundle bundle) {
        LayoutInflater G0 = super.G0(bundle);
        return G0.cloneInContext(new ViewComponentManager$FragmentContextWrapper(G0, this));
    }

    @Override // lk.b
    public final Object h() {
        if (this.f4821q0 == null) {
            synchronized (this.f4822r0) {
                if (this.f4821q0 == null) {
                    this.f4821q0 = new dagger.hilt.android.internal.managers.f(this);
                }
            }
        }
        return this.f4821q0.h();
    }

    @Override // androidx.fragment.app.r
    public final Context i0() {
        if (super.i0() != null || this.f4820p0) {
            g1();
            return this.f4819o0;
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
        ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper = this.f4819o0;
        if (viewComponentManager$FragmentContextWrapper != null && dagger.hilt.android.internal.managers.f.b(viewComponentManager$FragmentContextWrapper) != activity) {
            z10 = false;
        } else {
            z10 = true;
        }
        h7.a.h(z10, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        g1();
        if (!this.f4823s0) {
            this.f4823s0 = true;
            AudioSelectFragment audioSelectFragment = (AudioSelectFragment) this;
            ((e) h()).b0();
        }
    }
}
