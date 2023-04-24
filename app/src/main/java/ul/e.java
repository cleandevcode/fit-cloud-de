package ul;

import java.util.AbstractSet;

/* loaded from: classes2.dex */
public abstract class e<E> extends AbstractSet<E> implements hm.b {
    public abstract int e();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return e();
    }
}
