package f;

import android.content.res.Resources;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.PriorityBlockingQueue;
import t4.x;

/* loaded from: classes.dex */
public final class s implements f5.c {

    /* renamed from: a */
    public final Object f13974a;

    public s(int i10) {
        if (i10 == 3) {
            this.f13974a = new w.e(2);
        } else if (i10 == 4) {
            this.f13974a = new PriorityBlockingQueue();
        } else if (i10 != 5) {
            this.f13974a = new ArrayDeque();
        } else {
            this.f13974a = new LinkedHashSet();
        }
    }

    public /* synthetic */ s(c9.d dVar) {
        this.f13974a = dVar;
    }

    public final boolean a(sc.h hVar) {
        Iterator it = ((PriorityBlockingQueue) this.f13974a).iterator();
        while (it.hasNext()) {
            sc.h hVar2 = (sc.h) it.next();
            if (hVar2 == hVar) {
                return ((PriorityBlockingQueue) this.f13974a).remove(hVar2);
            }
        }
        return false;
    }

    @Override // f5.c
    public final x c(x xVar, r4.h hVar) {
        Resources resources = (Resources) this.f13974a;
        if (xVar == null) {
            return null;
        }
        return new a5.v(resources, xVar);
    }
}
