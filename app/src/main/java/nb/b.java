package nb;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b<TResult> extends mb.b<TResult> {

    /* renamed from: b */
    public boolean f22215b;

    /* renamed from: c */
    public TResult f22216c;

    /* renamed from: a */
    public final Object f22214a = new Object();

    /* renamed from: d */
    public ArrayList f22217d = new ArrayList();

    public final void a() {
        synchronized (this.f22214a) {
            Iterator it = this.f22217d.iterator();
            while (it.hasNext()) {
                try {
                    ((mb.a) it.next()).onComplete();
                } catch (RuntimeException e10) {
                    throw e10;
                } catch (Exception e11) {
                    throw new RuntimeException(e11);
                }
            }
            this.f22217d = null;
        }
    }
}
