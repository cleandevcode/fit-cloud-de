package zh;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.v0;
import com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomFragment;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;

/* loaded from: classes2.dex */
public abstract class m extends lh.h implements lk.b {

    /* renamed from: v0 */
    public ViewComponentManager$FragmentContextWrapper f32468v0;

    /* renamed from: w0 */
    public boolean f32469w0;

    /* renamed from: x0 */
    public volatile dagger.hilt.android.internal.managers.f f32470x0;

    /* renamed from: y0 */
    public final Object f32471y0;

    /* renamed from: z0 */
    public boolean f32472z0;

    public m() {
        this.f32471y0 = new Object();
        this.f32472z0 = false;
    }

    public m(int i10) {
        super(i10);
        this.f32471y0 = new Object();
        this.f32472z0 = false;
    }

    @Override // androidx.fragment.app.r
    public final void A0(Context context) {
        super.A0(context);
        r1();
        if (this.f32472z0) {
            return;
        }
        this.f32472z0 = true;
        ((e) h()).z((DialCustomFragment) this);
    }

    @Override // androidx.fragment.app.r
    public final LayoutInflater G0(Bundle bundle) {
        LayoutInflater G0 = super.G0(bundle);
        return G0.cloneInContext(new ViewComponentManager$FragmentContextWrapper(G0, this));
    }

    @Override // lk.b
    public final Object h() {
        if (this.f32470x0 == null) {
            synchronized (this.f32471y0) {
                if (this.f32470x0 == null) {
                    this.f32470x0 = new dagger.hilt.android.internal.managers.f(this);
                }
            }
        }
        return this.f32470x0.h();
    }

    @Override // androidx.fragment.app.r
    public final Context i0() {
        if (super.i0() != null || this.f32469w0) {
            r1();
            return this.f32468v0;
        }
        return null;
    }

    @Override // androidx.fragment.app.r, androidx.lifecycle.i
    public final v0.b r() {
        return ik.a.b(this, super.r());
    }

    public final void r1() {
        if (this.f32468v0 == null) {
            this.f32468v0 = new ViewComponentManager$FragmentContextWrapper(super.i0(), this);
            this.f32469w0 = gk.a.a(super.i0());
        }
    }

    @Override // androidx.fragment.app.r
    public final void z0(Activity activity) {
        boolean z10;
        this.E = true;
        ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper = this.f32468v0;
        if (viewComponentManager$FragmentContextWrapper != null && dagger.hilt.android.internal.managers.f.b(viewComponentManager$FragmentContextWrapper) != activity) {
            z10 = false;
        } else {
            z10 = true;
        }
        h7.a.h(z10, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        r1();
        if (!this.f32472z0) {
            this.f32472z0 = true;
            ((e) h()).z((DialCustomFragment) this);
        }
    }
}
