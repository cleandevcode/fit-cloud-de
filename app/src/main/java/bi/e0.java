package bi;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.v0;
import com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsFragment;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;

/* loaded from: classes2.dex */
public abstract class e0<T> extends nh.b<T> implements lk.b {
    public boolean A0;

    /* renamed from: w0 */
    public ViewComponentManager$FragmentContextWrapper f4284w0;

    /* renamed from: x0 */
    public boolean f4285x0;

    /* renamed from: y0 */
    public volatile dagger.hilt.android.internal.managers.f f4286y0;

    /* renamed from: z0 */
    public final Object f4287z0;

    public e0() {
        this.f4287z0 = new Object();
        this.A0 = false;
    }

    public e0(int i10) {
        super(i10);
        this.f4287z0 = new Object();
        this.A0 = false;
    }

    @Override // androidx.fragment.app.r
    public final void A0(Context context) {
        super.A0(context);
        t1();
        if (this.A0) {
            return;
        }
        this.A0 = true;
        QrCodeSettingsFragment qrCodeSettingsFragment = (QrCodeSettingsFragment) this;
        ((w0) h()).D();
    }

    @Override // androidx.fragment.app.r
    public final LayoutInflater G0(Bundle bundle) {
        LayoutInflater G0 = super.G0(bundle);
        return G0.cloneInContext(new ViewComponentManager$FragmentContextWrapper(G0, this));
    }

    @Override // lk.b
    public final Object h() {
        if (this.f4286y0 == null) {
            synchronized (this.f4287z0) {
                if (this.f4286y0 == null) {
                    this.f4286y0 = new dagger.hilt.android.internal.managers.f(this);
                }
            }
        }
        return this.f4286y0.h();
    }

    @Override // androidx.fragment.app.r
    public final Context i0() {
        if (super.i0() != null || this.f4285x0) {
            t1();
            return this.f4284w0;
        }
        return null;
    }

    @Override // androidx.fragment.app.r, androidx.lifecycle.i
    public final v0.b r() {
        return ik.a.b(this, super.r());
    }

    public final void t1() {
        if (this.f4284w0 == null) {
            this.f4284w0 = new ViewComponentManager$FragmentContextWrapper(super.i0(), this);
            this.f4285x0 = gk.a.a(super.i0());
        }
    }

    @Override // androidx.fragment.app.r
    public final void z0(Activity activity) {
        boolean z10;
        this.E = true;
        ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper = this.f4284w0;
        if (viewComponentManager$FragmentContextWrapper != null && dagger.hilt.android.internal.managers.f.b(viewComponentManager$FragmentContextWrapper) != activity) {
            z10 = false;
        } else {
            z10 = true;
        }
        h7.a.h(z10, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        t1();
        if (!this.A0) {
            this.A0 = true;
            QrCodeSettingsFragment qrCodeSettingsFragment = (QrCodeSettingsFragment) this;
            ((w0) h()).D();
        }
    }
}
