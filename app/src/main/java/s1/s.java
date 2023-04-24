package s1;

import java.util.concurrent.CancellationException;
import s1.q;

/* loaded from: classes.dex */
public final class s extends gm.m implements fm.p<q.a<Object>, Throwable, tl.l> {

    /* renamed from: b */
    public static final s f26494b = new s();

    public s() {
        super(2);
    }

    @Override // fm.p
    public final tl.l A(q.a<Object> aVar, Throwable th2) {
        q.a<Object> aVar2 = aVar;
        Throwable th3 = th2;
        gm.l.f(aVar2, "msg");
        if (aVar2 instanceof q.a.b) {
            pm.q<T> qVar = ((q.a.b) aVar2).f26451b;
            if (th3 == null) {
                th3 = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            qVar.J(th3);
        }
        return tl.l.f28297a;
    }
}
