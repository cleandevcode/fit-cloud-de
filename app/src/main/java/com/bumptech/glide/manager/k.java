package com.bumptech.glide.manager;

/* loaded from: classes.dex */
public final class k implements j {

    /* renamed from: a */
    public final /* synthetic */ androidx.lifecycle.k f5734a;

    /* renamed from: b */
    public final /* synthetic */ l f5735b;

    public k(l lVar, androidx.lifecycle.v vVar) {
        this.f5735b = lVar;
        this.f5734a = vVar;
    }

    @Override // com.bumptech.glide.manager.j
    public final void onDestroy() {
        this.f5735b.f5736a.remove(this.f5734a);
    }

    @Override // com.bumptech.glide.manager.j
    public final void onStart() {
    }

    @Override // com.bumptech.glide.manager.j
    public final void onStop() {
    }
}
