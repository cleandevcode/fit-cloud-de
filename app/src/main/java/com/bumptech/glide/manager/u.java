package com.bumptech.glide.manager;

import android.util.Log;
import com.bumptech.glide.manager.r;

/* loaded from: classes.dex */
public final class u implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ r.e f5780a;

    public u(r.e eVar) {
        this.f5780a = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.f5780a.f5772d;
        r.e eVar = this.f5780a;
        eVar.f5772d = eVar.c();
        if (z10 != this.f5780a.f5772d) {
            if (Log.isLoggable("ConnectivityMonitor", 3)) {
                StringBuilder a10 = android.support.v4.media.d.a("connectivity changed, isConnected: ");
                a10.append(this.f5780a.f5772d);
                Log.d("ConnectivityMonitor", a10.toString());
            }
            r.e eVar2 = this.f5780a;
            m5.l.f().post(new v(eVar2, eVar2.f5772d));
        }
    }
}
