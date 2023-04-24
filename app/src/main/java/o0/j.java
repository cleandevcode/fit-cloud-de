package o0;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class j implements Iterator<Object>, hm.a {

    /* renamed from: a */
    public int f22558a;

    /* renamed from: b */
    public final /* synthetic */ i f22559b;

    public j(i<Object> iVar) {
        this.f22559b = iVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22558a < this.f22559b.f();
    }

    @Override // java.util.Iterator
    public final Object next() {
        i iVar = this.f22559b;
        int i10 = this.f22558a;
        this.f22558a = i10 + 1;
        return iVar.g(i10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
