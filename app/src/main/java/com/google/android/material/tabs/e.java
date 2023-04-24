package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    public final TabLayout f6765a;

    /* renamed from: b */
    public final ViewPager2 f6766b;

    /* renamed from: c */
    public final a f6767c;

    /* renamed from: d */
    public RecyclerView.e<?> f6768d;

    /* renamed from: e */
    public boolean f6769e;

    /* loaded from: classes.dex */
    public interface a {
        void f(TabLayout.g gVar, int i10);
    }

    /* loaded from: classes.dex */
    public static class b extends ViewPager2.e {

        /* renamed from: a */
        public final WeakReference<TabLayout> f6770a;

        /* renamed from: c */
        public int f6772c = 0;

        /* renamed from: b */
        public int f6771b = 0;

        public b(TabLayout tabLayout) {
            this.f6770a = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public final void a(int i10) {
            this.f6771b = this.f6772c;
            this.f6772c = i10;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public final void b(float f10, int i10, int i11) {
            TabLayout tabLayout = this.f6770a.get();
            if (tabLayout != null) {
                int i12 = this.f6772c;
                boolean z10 = false;
                tabLayout.n(i10, f10, i12 != 2 || this.f6771b == 1, (i12 == 2 && this.f6771b == 0) ? true : true);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public final void c(int i10) {
            TabLayout tabLayout = this.f6770a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i10 || i10 >= tabLayout.getTabCount()) {
                return;
            }
            int i11 = this.f6772c;
            tabLayout.l(tabLayout.h(i10), i11 == 0 || (i11 == 2 && this.f6771b == 0));
        }
    }

    /* loaded from: classes.dex */
    public static class c implements TabLayout.d {

        /* renamed from: a */
        public final ViewPager2 f6773a;

        /* renamed from: b */
        public final boolean f6774b;

        public c(ViewPager2 viewPager2, boolean z10) {
            this.f6773a = viewPager2;
            this.f6774b = z10;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void a(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void b(TabLayout.g gVar) {
            ViewPager2 viewPager2 = this.f6773a;
            int i10 = gVar.f6736d;
            boolean z10 = this.f6774b;
            if (!viewPager2.f3569n.f4530a.f3603m) {
                viewPager2.b(i10, z10);
                return;
            }
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void c(TabLayout.g gVar) {
        }
    }

    public e(TabLayout tabLayout, ViewPager2 viewPager2, a aVar) {
        this.f6765a = tabLayout;
        this.f6766b = viewPager2;
        this.f6767c = aVar;
    }

    public final void a() {
        if (!this.f6769e) {
            RecyclerView.e<?> adapter = this.f6766b.getAdapter();
            this.f6768d = adapter;
            if (adapter != null) {
                this.f6769e = true;
                this.f6766b.f3558c.f3589a.add(new b(this.f6765a));
                this.f6765a.a(new c(this.f6766b, true));
                b();
                this.f6765a.n(this.f6766b.getCurrentItem(), 0.0f, true, true);
                return;
            }
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        throw new IllegalStateException("TabLayoutMediator is already attached");
    }

    public final void b() {
        this.f6765a.k();
        RecyclerView.e<?> eVar = this.f6768d;
        if (eVar != null) {
            int e10 = eVar.e();
            for (int i10 = 0; i10 < e10; i10++) {
                TabLayout.g i11 = this.f6765a.i();
                this.f6767c.f(i11, i10);
                this.f6765a.b(i11, false);
            }
            if (e10 > 0) {
                int min = Math.min(this.f6766b.getCurrentItem(), this.f6765a.getTabCount() - 1);
                if (min != this.f6765a.getSelectedTabPosition()) {
                    TabLayout tabLayout = this.f6765a;
                    tabLayout.l(tabLayout.h(min), true);
                }
            }
        }
    }
}
