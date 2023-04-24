package androidx.work;

import androidx.work.b;
import f3.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends i {
    @Override // f3.i
    public final b a(ArrayList arrayList) {
        b.a aVar = new b.a();
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashMap.putAll(Collections.unmodifiableMap(((b) it.next()).f3648a));
        }
        aVar.a(hashMap);
        b bVar = new b(aVar.f3649a);
        b.b(bVar);
        return bVar;
    }
}
