package androidx.viewpager2.adapter;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ FragmentStateAdapter f3552a;

    public c(FragmentStateAdapter fragmentStateAdapter) {
        this.f3552a = fragmentStateAdapter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FragmentStateAdapter fragmentStateAdapter = this.f3552a;
        fragmentStateAdapter.f3533j = false;
        fragmentStateAdapter.B();
    }
}
