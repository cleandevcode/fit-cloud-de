package com.topstep.fitcloud.pro.ui.dialog;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.v0;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import f.q;

/* loaded from: classes2.dex */
public abstract class h extends q implements lk.b {
    public ViewComponentManager$FragmentContextWrapper B0;
    public boolean C0;
    public volatile dagger.hilt.android.internal.managers.f D0;
    public final Object E0 = new Object();
    public boolean F0 = false;

    @Override // androidx.fragment.app.o, androidx.fragment.app.r
    public final void A0(Context context) {
        super.A0(context);
        i1();
        if (this.F0) {
            return;
        }
        this.F0 = true;
        ((f) h()).g0((e) this);
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.r
    public final LayoutInflater G0(Bundle bundle) {
        LayoutInflater G0 = super.G0(bundle);
        return G0.cloneInContext(new ViewComponentManager$FragmentContextWrapper(G0, this));
    }

    @Override // lk.b
    public final Object h() {
        if (this.D0 == null) {
            synchronized (this.E0) {
                if (this.D0 == null) {
                    this.D0 = new dagger.hilt.android.internal.managers.f(this);
                }
            }
        }
        return this.D0.h();
    }

    @Override // androidx.fragment.app.r
    public final Context i0() {
        if (super.i0() != null || this.C0) {
            i1();
            return this.B0;
        }
        return null;
    }

    public final void i1() {
        if (this.B0 == null) {
            this.B0 = new ViewComponentManager$FragmentContextWrapper(super.i0(), this);
            this.C0 = gk.a.a(super.i0());
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
        ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper = this.B0;
        if (viewComponentManager$FragmentContextWrapper != null && dagger.hilt.android.internal.managers.f.b(viewComponentManager$FragmentContextWrapper) != activity) {
            z10 = false;
        } else {
            z10 = true;
        }
        h7.a.h(z10, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        i1();
        if (!this.F0) {
            this.F0 = true;
            ((f) h()).g0((e) this);
        }
    }
}
