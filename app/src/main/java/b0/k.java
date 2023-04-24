package b0;

import b0.j;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class k implements Enumeration<Map<String, i>> {

    /* renamed from: a */
    public final Enumeration<Map<String, i>> f3961a;

    public k(j.a aVar) {
        this.f3961a = Collections.enumeration(aVar.f3957a);
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.f3961a.hasMoreElements();
    }

    @Override // java.util.Enumeration
    public final Map<String, i> nextElement() {
        return new HashMap(this.f3961a.nextElement());
    }
}
