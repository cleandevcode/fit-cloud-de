package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class e extends ViewPager2.e {

    /* renamed from: a */
    public final /* synthetic */ ViewPager2 f3608a;

    public e(ViewPager2 viewPager2) {
        this.f3608a = viewPager2;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void c(int i10) {
        this.f3608a.clearFocus();
        if (this.f3608a.hasFocus()) {
            this.f3608a.f3565j.requestFocus(2);
        }
    }
}
