package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.j0;
import java.util.HashSet;

/* loaded from: classes.dex */
public class w extends androidx.fragment.app.r {

    /* renamed from: l0 */
    public final com.bumptech.glide.manager.a f5783l0;

    /* renamed from: m0 */
    public final a f5784m0;

    /* renamed from: n0 */
    public final HashSet f5785n0;

    /* renamed from: o0 */
    public w f5786o0;

    /* renamed from: p0 */
    public com.bumptech.glide.o f5787p0;

    /* renamed from: q0 */
    public androidx.fragment.app.r f5788q0;

    /* loaded from: classes.dex */
    public class a implements p {
        public a() {
            w.this = r1;
        }

        public final String toString() {
            return super.toString() + "{fragment=" + w.this + "}";
        }
    }

    public w() {
        com.bumptech.glide.manager.a aVar = new com.bumptech.glide.manager.a();
        this.f5784m0 = new a();
        this.f5785n0 = new HashSet();
        this.f5783l0 = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.fragment.app.r] */
    @Override // androidx.fragment.app.r
    public final void A0(Context context) {
        super.A0(context);
        w wVar = this;
        while (true) {
            ?? r02 = wVar.f2537v;
            if (r02 == 0) {
                break;
            }
            wVar = r02;
        }
        j0 j0Var = wVar.f2534s;
        if (j0Var == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
                return;
            }
            return;
        }
        try {
            c1(i0(), j0Var);
        } catch (IllegalStateException e10) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", e10);
            }
        }
    }

    @Override // androidx.fragment.app.r
    public final void D0() {
        this.E = true;
        this.f5783l0.a();
        w wVar = this.f5786o0;
        if (wVar != null) {
            wVar.f5785n0.remove(this);
            this.f5786o0 = null;
        }
    }

    @Override // androidx.fragment.app.r
    public final void F0() {
        this.E = true;
        this.f5788q0 = null;
        w wVar = this.f5786o0;
        if (wVar != null) {
            wVar.f5785n0.remove(this);
            this.f5786o0 = null;
        }
    }

    @Override // androidx.fragment.app.r
    public final void M0() {
        this.E = true;
        this.f5783l0.b();
    }

    @Override // androidx.fragment.app.r
    public final void N0() {
        this.E = true;
        this.f5783l0.c();
    }

    public final void c1(Context context, j0 j0Var) {
        w wVar = this.f5786o0;
        if (wVar != null) {
            wVar.f5785n0.remove(this);
            this.f5786o0 = null;
        }
        w e10 = com.bumptech.glide.b.b(context).f5664e.e(j0Var, null);
        this.f5786o0 = e10;
        if (!equals(e10)) {
            this.f5786o0.f5785n0.add(this);
        }
    }

    @Override // androidx.fragment.app.r
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{parent=");
        androidx.fragment.app.r rVar = this.f2537v;
        if (rVar == null) {
            rVar = this.f5788q0;
        }
        return androidx.fragment.app.n.a(sb2, rVar, "}");
    }
}
