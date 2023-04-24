package androidx.viewpager2.adapter;

import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class a implements View.OnLayoutChangeListener {

    /* renamed from: a */
    public final /* synthetic */ FrameLayout f3546a;

    /* renamed from: b */
    public final /* synthetic */ f f3547b;

    /* renamed from: c */
    public final /* synthetic */ FragmentStateAdapter f3548c;

    public a(FragmentStateAdapter fragmentStateAdapter, FrameLayout frameLayout, f fVar) {
        this.f3548c = fragmentStateAdapter;
        this.f3546a = frameLayout;
        this.f3547b = fVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (this.f3546a.getParent() != null) {
            this.f3546a.removeOnLayoutChangeListener(this);
            this.f3548c.D(this.f3547b);
        }
    }
}
