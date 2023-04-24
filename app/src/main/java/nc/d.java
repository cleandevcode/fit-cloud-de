package nc;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class d extends WeakReference<mc.b> {

    /* loaded from: classes.dex */
    public interface a {
    }

    public d(mc.b bVar) {
        super(bVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WeakReference) {
            mc.b bVar = get();
            Object obj2 = ((WeakReference) obj).get();
            return bVar != null && (obj2 instanceof mc.b) && bVar.a().equals(((mc.b) obj2).a());
        }
        return false;
    }

    public final int hashCode() {
        if (get() != null) {
            return get().hashCode();
        }
        return 0;
    }
}
