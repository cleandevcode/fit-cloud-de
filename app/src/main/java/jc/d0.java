package jc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class d0 extends b {
    public d0(x xVar) {
        super(xVar);
    }

    @Override // jc.c
    public final void a(List<String> list) {
        HashSet hashSet = new HashSet(this.f17572a.f17630i);
        hashSet.addAll(list);
        if (!hashSet.isEmpty()) {
            this.f17572a.e(hashSet, this);
        } else {
            b();
        }
    }

    @Override // jc.c
    public final void j() {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f17572a.f17625d.iterator();
        while (true) {
            boolean z10 = false;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (y0.a.a(this.f17572a.a(), next) == 0) {
                z10 = true;
            }
            if (z10) {
                this.f17572a.f17630i.add(next);
            } else {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            b();
            return;
        }
        x xVar = this.f17572a;
        if (xVar.f17627f && xVar.f17636o != null) {
            xVar.f17627f = false;
            xVar.f17631j.addAll(arrayList);
            this.f17572a.getClass();
            s5.b bVar = this.f17572a.f17636o;
            gm.l.c(bVar);
            bVar.a(this.f17574c, arrayList);
            return;
        }
        xVar.e(xVar.f17625d, this);
    }
}
