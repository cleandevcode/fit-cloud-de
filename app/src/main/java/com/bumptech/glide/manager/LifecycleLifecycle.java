package com.bumptech.glide.manager;

import androidx.lifecycle.c0;
import androidx.lifecycle.k;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class LifecycleLifecycle implements i, androidx.lifecycle.t {

    /* renamed from: a */
    public final HashSet f5727a = new HashSet();

    /* renamed from: b */
    public final androidx.lifecycle.k f5728b;

    public LifecycleLifecycle(androidx.lifecycle.v vVar) {
        this.f5728b = vVar;
        vVar.a(this);
    }

    @Override // com.bumptech.glide.manager.i
    public final void f(j jVar) {
        this.f5727a.add(jVar);
        if (this.f5728b.b() == k.c.DESTROYED) {
            jVar.onDestroy();
        } else if (this.f5728b.b().a(k.c.STARTED)) {
            jVar.onStart();
        } else {
            jVar.onStop();
        }
    }

    @Override // com.bumptech.glide.manager.i
    public final void g(j jVar) {
        this.f5727a.remove(jVar);
    }

    @c0(k.b.ON_DESTROY)
    public void onDestroy(androidx.lifecycle.u uVar) {
        Iterator it = m5.l.e(this.f5727a).iterator();
        while (it.hasNext()) {
            ((j) it.next()).onDestroy();
        }
        uVar.a0().c(this);
    }

    @c0(k.b.ON_START)
    public void onStart(androidx.lifecycle.u uVar) {
        Iterator it = m5.l.e(this.f5727a).iterator();
        while (it.hasNext()) {
            ((j) it.next()).onStart();
        }
    }

    @c0(k.b.ON_STOP)
    public void onStop(androidx.lifecycle.u uVar) {
        Iterator it = m5.l.e(this.f5727a).iterator();
        while (it.hasNext()) {
            ((j) it.next()).onStop();
        }
    }
}
