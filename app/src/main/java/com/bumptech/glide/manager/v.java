package com.bumptech.glide.manager;

import com.bumptech.glide.manager.r;

/* loaded from: classes.dex */
public final class v implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ boolean f5781a;

    /* renamed from: b */
    public final /* synthetic */ r.e f5782b;

    public v(r.e eVar, boolean z10) {
        this.f5782b = eVar;
        this.f5781a = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5782b.f5770b.a(this.f5781a);
    }
}
