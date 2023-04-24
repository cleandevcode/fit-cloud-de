package a0;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: a */
    public final ArrayList f176a;

    public final void a(String str) {
        this.f176a.add(str);
    }

    public final boolean b(Class cls) {
        Iterator it = this.f176a.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((q1) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    public final q1 c(Class cls) {
        Iterator it = this.f176a.iterator();
        while (it.hasNext()) {
            q1 q1Var = (q1) it.next();
            if (q1Var.getClass() == cls) {
                return q1Var;
            }
        }
        return null;
    }
}
