package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class t<S> extends z<S> {

    /* renamed from: m0 */
    public int f6508m0;

    /* renamed from: n0 */
    public d<S> f6509n0;

    /* renamed from: o0 */
    public com.google.android.material.datepicker.a f6510o0;

    /* loaded from: classes.dex */
    public class a extends y<S> {
        public a() {
            t.this = r1;
        }

        @Override // com.google.android.material.datepicker.y
        public final void a(S s10) {
            Iterator<y<S>> it = t.this.f6533l0.iterator();
            while (it.hasNext()) {
                it.next().a(s10);
            }
        }
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        if (bundle == null) {
            bundle = this.f2516f;
        }
        this.f6508m0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f6509n0 = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f6510o0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.r
    public final View C0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(i0(), this.f6508m0));
        d<S> dVar = this.f6509n0;
        new a();
        return dVar.x();
    }

    @Override // androidx.fragment.app.r
    public final void L0(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f6508m0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f6509n0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f6510o0);
    }
}
