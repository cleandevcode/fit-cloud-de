package i0;

import androidx.camera.core.j;
import java.util.ArrayDeque;
import s.x2;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c */
    public final x2 f16196c;

    /* renamed from: b */
    public final Object f16195b = new Object();

    /* renamed from: a */
    public final ArrayDeque<j> f16194a = new ArrayDeque<>(3);

    public c(x2 x2Var) {
        this.f16196c = x2Var;
    }

    public final void a(j jVar) {
        j jVar2;
        synchronized (this.f16195b) {
            try {
                if (this.f16194a.size() >= 3) {
                    synchronized (this.f16195b) {
                        jVar2 = this.f16194a.removeLast();
                    }
                } else {
                    jVar2 = null;
                }
                this.f16194a.addFirst(jVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f16196c != null && jVar2 != null) {
            jVar2.close();
        }
    }
}
