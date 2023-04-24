package qa;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes.dex */
public final class g extends x<AtomicLongArray> {

    /* renamed from: a */
    public final /* synthetic */ x f24650a;

    public g(x xVar) {
        this.f24650a = xVar;
    }

    @Override // qa.x
    public final AtomicLongArray a(ya.a aVar) {
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.D()) {
            arrayList.add(Long.valueOf(((Number) this.f24650a.a(aVar)).longValue()));
        }
        aVar.k();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i10 = 0; i10 < size; i10++) {
            atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
        }
        return atomicLongArray;
    }

    @Override // qa.x
    public final void b(ya.b bVar, AtomicLongArray atomicLongArray) {
        AtomicLongArray atomicLongArray2 = atomicLongArray;
        bVar.b();
        int length = atomicLongArray2.length();
        for (int i10 = 0; i10 < length; i10++) {
            this.f24650a.b(bVar, Long.valueOf(atomicLongArray2.get(i10)));
        }
        bVar.k();
    }
}
