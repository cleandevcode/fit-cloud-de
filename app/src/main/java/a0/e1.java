package a0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class e1 implements y.m {

    /* renamed from: b */
    public int f48b;

    public e1(int i10) {
        this.f48b = i10;
    }

    @Override // y.m
    public final e a() {
        return y.m.f30737a;
    }

    @Override // y.m
    public final ArrayList b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y.n nVar = (y.n) it.next();
            s.h1.e("The camera info doesn't contain internal implementation.", nVar instanceof a0);
            Integer c10 = ((a0) nVar).c();
            if (c10 != null && c10.intValue() == this.f48b) {
                arrayList.add(nVar);
            }
        }
        return arrayList;
    }
}
