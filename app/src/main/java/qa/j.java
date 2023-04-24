package qa;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j extends l implements Iterable<l> {

    /* renamed from: a */
    public final ArrayList<l> f24662a = new ArrayList<>();

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof j) && ((j) obj).f24662a.equals(this.f24662a));
    }

    public final int hashCode() {
        return this.f24662a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<l> iterator() {
        return this.f24662a.iterator();
    }
}
