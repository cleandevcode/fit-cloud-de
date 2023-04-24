package com.bumptech.glide.manager;

import android.content.Context;
import com.bumptech.glide.manager.b;
import com.bumptech.glide.o;

/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: a */
    public final Context f5732a;

    /* renamed from: b */
    public final b.a f5733b;

    public d(Context context, o.c cVar) {
        this.f5732a = context.getApplicationContext();
        this.f5733b = cVar;
    }

    @Override // com.bumptech.glide.manager.j
    public final void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.j
    public final void onStart() {
        r a10 = r.a(this.f5732a);
        b.a aVar = this.f5733b;
        synchronized (a10) {
            a10.f5759b.add(aVar);
            if (!a10.f5760c && !a10.f5759b.isEmpty()) {
                a10.f5760c = a10.f5758a.a();
            }
        }
    }

    @Override // com.bumptech.glide.manager.j
    public final void onStop() {
        r a10 = r.a(this.f5732a);
        b.a aVar = this.f5733b;
        synchronized (a10) {
            a10.f5759b.remove(aVar);
            if (a10.f5760c && a10.f5759b.isEmpty()) {
                a10.f5758a.b();
                a10.f5760c = false;
            }
        }
    }
}
