package com.bumptech.glide.manager;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a implements i {

    /* renamed from: a */
    public final Set<j> f5729a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public boolean f5730b;

    /* renamed from: c */
    public boolean f5731c;

    public final void a() {
        this.f5731c = true;
        Iterator it = m5.l.e(this.f5729a).iterator();
        while (it.hasNext()) {
            ((j) it.next()).onDestroy();
        }
    }

    public final void b() {
        this.f5730b = true;
        Iterator it = m5.l.e(this.f5729a).iterator();
        while (it.hasNext()) {
            ((j) it.next()).onStart();
        }
    }

    public final void c() {
        this.f5730b = false;
        Iterator it = m5.l.e(this.f5729a).iterator();
        while (it.hasNext()) {
            ((j) it.next()).onStop();
        }
    }

    @Override // com.bumptech.glide.manager.i
    public final void f(j jVar) {
        this.f5729a.add(jVar);
        if (this.f5731c) {
            jVar.onDestroy();
        } else if (this.f5730b) {
            jVar.onStart();
        } else {
            jVar.onStop();
        }
    }

    @Override // com.bumptech.glide.manager.i
    public final void g(j jVar) {
        this.f5729a.remove(jVar);
    }
}
