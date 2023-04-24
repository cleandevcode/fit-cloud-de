package ul;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class j implements Iterator<Character>, hm.a {
    public abstract char a();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Character next() {
        return Character.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
