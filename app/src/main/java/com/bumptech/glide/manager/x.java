package com.bumptech.glide.manager;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class x implements j {

    /* renamed from: a */
    public final Set<j5.h<?>> f5790a = Collections.newSetFromMap(new WeakHashMap());

    @Override // com.bumptech.glide.manager.j
    public final void onDestroy() {
        Iterator it = m5.l.e(this.f5790a).iterator();
        while (it.hasNext()) {
            ((j5.h) it.next()).onDestroy();
        }
    }

    @Override // com.bumptech.glide.manager.j
    public final void onStart() {
        Iterator it = m5.l.e(this.f5790a).iterator();
        while (it.hasNext()) {
            ((j5.h) it.next()).onStart();
        }
    }

    @Override // com.bumptech.glide.manager.j
    public final void onStop() {
        Iterator it = m5.l.e(this.f5790a).iterator();
        while (it.hasNext()) {
            ((j5.h) it.next()).onStop();
        }
    }
}
