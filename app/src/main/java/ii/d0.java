package ii;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.v0;
import com.topstep.fitcloud.pro.ui.settings.FeedbackFragment;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;

/* loaded from: classes2.dex */
public abstract class d0<T> extends nh.b<T> implements lk.b {
    public boolean A0;

    /* renamed from: w0 */
    public ViewComponentManager$FragmentContextWrapper f16911w0;

    /* renamed from: x0 */
    public boolean f16912x0;

    /* renamed from: y0 */
    public volatile dagger.hilt.android.internal.managers.f f16913y0;

    /* renamed from: z0 */
    public final Object f16914z0;

    public d0() {
        this.f16914z0 = new Object();
        this.A0 = false;
    }

    public d0(int i10) {
        super(i10);
        this.f16914z0 = new Object();
        this.A0 = false;
    }

    private void t1() {
        if (this.f16911w0 == null) {
            this.f16911w0 = new ViewComponentManager$FragmentContextWrapper(super.i0(), this);
            this.f16912x0 = gk.a.a(super.i0());
        }
    }

    @Override // androidx.fragment.app.r
    public final void A0(Context context) {
        super.A0(context);
        t1();
        if (this.A0) {
            return;
        }
        this.A0 = true;
        FeedbackFragment feedbackFragment = (FeedbackFragment) this;
        ((x) h()).j0();
    }

    @Override // androidx.fragment.app.r
    public final LayoutInflater G0(Bundle bundle) {
        LayoutInflater G0 = super.G0(bundle);
        return G0.cloneInContext(new ViewComponentManager$FragmentContextWrapper(G0, this));
    }

    @Override // lk.b
    public final Object h() {
        if (this.f16913y0 == null) {
            synchronized (this.f16914z0) {
                if (this.f16913y0 == null) {
                    this.f16913y0 = new dagger.hilt.android.internal.managers.f(this);
                }
            }
        }
        return this.f16913y0.h();
    }

    @Override // androidx.fragment.app.r
    public final Context i0() {
        if (super.i0() != null || this.f16912x0) {
            t1();
            return this.f16911w0;
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
        ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper = this.f16911w0;
        if (viewComponentManager$FragmentContextWrapper != null && dagger.hilt.android.internal.managers.f.b(viewComponentManager$FragmentContextWrapper) != activity) {
            z10 = false;
        } else {
            z10 = true;
        }
        h7.a.h(z10, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        t1();
        if (!this.A0) {
            this.A0 = true;
            FeedbackFragment feedbackFragment = (FeedbackFragment) this;
            ((x) h()).j0();
        }
    }
}
