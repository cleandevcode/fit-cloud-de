package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import java.util.HashSet;

@Deprecated
/* loaded from: classes.dex */
public final class n extends Fragment {

    /* renamed from: a */
    public final com.bumptech.glide.manager.a f5738a;

    /* renamed from: b */
    public final a f5739b;

    /* renamed from: c */
    public final HashSet f5740c;

    /* renamed from: d */
    public com.bumptech.glide.o f5741d;

    /* renamed from: e */
    public n f5742e;

    /* renamed from: f */
    public Fragment f5743f;

    /* loaded from: classes.dex */
    public class a implements p {
        public a() {
            n.this = r1;
        }

        public final String toString() {
            return super.toString() + "{fragment=" + n.this + "}";
        }
    }

    public n() {
        com.bumptech.glide.manager.a aVar = new com.bumptech.glide.manager.a();
        this.f5739b = new a();
        this.f5740c = new HashSet();
        this.f5738a = aVar;
    }

    public final void a(Activity activity) {
        n nVar = this.f5742e;
        if (nVar != null) {
            nVar.f5740c.remove(this);
            this.f5742e = null;
        }
        o oVar = com.bumptech.glide.b.b(activity).f5664e;
        oVar.getClass();
        n d10 = oVar.d(activity.getFragmentManager());
        this.f5742e = d10;
        if (!equals(d10)) {
            this.f5742e.f5740c.add(this);
        }
    }

    @Override // android.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            a(activity);
        } catch (IllegalStateException e10) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e10);
            }
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f5738a.a();
        n nVar = this.f5742e;
        if (nVar != null) {
            nVar.f5740c.remove(this);
            this.f5742e = null;
        }
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        n nVar = this.f5742e;
        if (nVar != null) {
            nVar.f5740c.remove(this);
            this.f5742e = null;
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f5738a.b();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f5738a.c();
    }

    @Override // android.app.Fragment
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f5743f;
        }
        sb2.append(parentFragment);
        sb2.append("}");
        return sb2.toString();
    }
}
