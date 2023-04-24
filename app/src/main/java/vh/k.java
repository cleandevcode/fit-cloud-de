package vh;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.v0;
import com.topstep.fitcloud.pro.ui.device.contacts.ContactsFragment;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;

/* loaded from: classes2.dex */
public abstract class k extends lh.i implements lk.b {

    /* renamed from: o0 */
    public ViewComponentManager$FragmentContextWrapper f29413o0;

    /* renamed from: p0 */
    public boolean f29414p0;

    /* renamed from: q0 */
    public volatile dagger.hilt.android.internal.managers.f f29415q0;

    /* renamed from: r0 */
    public final Object f29416r0;

    /* renamed from: s0 */
    public boolean f29417s0;

    public k() {
        this.f29416r0 = new Object();
        this.f29417s0 = false;
    }

    public k(int i10) {
        super(i10);
        this.f29416r0 = new Object();
        this.f29417s0 = false;
    }

    @Override // androidx.fragment.app.r
    public final void A0(Context context) {
        super.A0(context);
        g1();
        if (this.f29417s0) {
            return;
        }
        this.f29417s0 = true;
        ContactsFragment contactsFragment = (ContactsFragment) this;
        ((d) h()).B();
    }

    @Override // androidx.fragment.app.r
    public final LayoutInflater G0(Bundle bundle) {
        LayoutInflater G0 = super.G0(bundle);
        return G0.cloneInContext(new ViewComponentManager$FragmentContextWrapper(G0, this));
    }

    public final void g1() {
        if (this.f29413o0 == null) {
            this.f29413o0 = new ViewComponentManager$FragmentContextWrapper(super.i0(), this);
            this.f29414p0 = gk.a.a(super.i0());
        }
    }

    @Override // lk.b
    public final Object h() {
        if (this.f29415q0 == null) {
            synchronized (this.f29416r0) {
                if (this.f29415q0 == null) {
                    this.f29415q0 = new dagger.hilt.android.internal.managers.f(this);
                }
            }
        }
        return this.f29415q0.h();
    }

    @Override // androidx.fragment.app.r
    public final Context i0() {
        if (super.i0() != null || this.f29414p0) {
            g1();
            return this.f29413o0;
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
        ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper = this.f29413o0;
        if (viewComponentManager$FragmentContextWrapper != null && dagger.hilt.android.internal.managers.f.b(viewComponentManager$FragmentContextWrapper) != activity) {
            z10 = false;
        } else {
            z10 = true;
        }
        h7.a.h(z10, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        g1();
        if (!this.f29417s0) {
            this.f29417s0 = true;
            ContactsFragment contactsFragment = (ContactsFragment) this;
            ((d) h()).B();
        }
    }
}
