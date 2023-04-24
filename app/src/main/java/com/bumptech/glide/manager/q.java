package com.bumptech.glide.manager;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a */
    public final Set<i5.d> f5754a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public final HashSet f5755b = new HashSet();

    /* renamed from: c */
    public boolean f5756c;

    public final boolean a(i5.d dVar) {
        boolean z10 = true;
        if (dVar == null) {
            return true;
        }
        boolean remove = this.f5754a.remove(dVar);
        if (!this.f5755b.remove(dVar) && !remove) {
            z10 = false;
        }
        if (z10) {
            dVar.clear();
        }
        return z10;
    }

    public final void b() {
        Iterator it = m5.l.e(this.f5754a).iterator();
        while (it.hasNext()) {
            i5.d dVar = (i5.d) it.next();
            if (!dVar.i() && !dVar.g()) {
                dVar.clear();
                if (this.f5756c) {
                    this.f5755b.add(dVar);
                } else {
                    dVar.h();
                }
            }
        }
    }

    public final String toString() {
        return super.toString() + "{numRequests=" + this.f5754a.size() + ", isPaused=" + this.f5756c + "}";
    }
}
