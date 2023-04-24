package com.bumptech.glide.manager;

import com.bumptech.glide.manager.r;

/* loaded from: classes.dex */
public final class t implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ boolean f5778a;

    /* renamed from: b */
    public final /* synthetic */ r.d.a f5779b;

    public t(r.d.a aVar, boolean z10) {
        this.f5779b = aVar;
        this.f5778a = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r.d.a aVar = this.f5779b;
        boolean z10 = this.f5778a;
        aVar.getClass();
        m5.l.a();
        r.d dVar = r.d.this;
        boolean z11 = dVar.f5763a;
        dVar.f5763a = z10;
        if (z11 != z10) {
            dVar.f5764b.a(z10);
        }
    }
}
