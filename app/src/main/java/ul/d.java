package ul;

import java.util.AbstractList;

/* loaded from: classes2.dex */
public abstract class d<E> extends AbstractList<E> implements hm.c {
    public abstract int e();

    public abstract E f(int i10);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i10) {
        return f(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return e();
    }
}
