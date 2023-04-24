package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class d extends ViewPager2.e {

    /* renamed from: a */
    public final /* synthetic */ ViewPager2 f3607a;

    public d(ViewPager2 viewPager2) {
        this.f3607a = viewPager2;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void a(int i10) {
        if (i10 == 0) {
            this.f3607a.c();
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void c(int i10) {
        ViewPager2 viewPager2 = this.f3607a;
        if (viewPager2.f3559d != i10) {
            viewPager2.f3559d = i10;
            viewPager2.f3575t.b();
        }
    }
}
