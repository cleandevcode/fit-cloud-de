package ik;

import android.os.Looper;
import bi.r;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class f implements ek.a {

    /* renamed from: a */
    public final HashSet f17103a = new HashSet();

    public final void a() {
        boolean z10;
        if (r.f4340a == null) {
            r.f4340a = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == r.f4340a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Iterator it = this.f17103a.iterator();
            while (it.hasNext()) {
                ((kk.a) it.next()).a();
            }
            return;
        }
        throw new IllegalStateException("Must be called on the Main thread.");
    }
}
