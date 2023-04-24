package t0;

import java.util.Iterator;

/* loaded from: classes.dex */
public class h extends g {

    /* renamed from: m */
    public int f27496m;

    public h(q qVar) {
        super(qVar);
        this.f27488e = qVar instanceof m ? 2 : 3;
    }

    @Override // t0.g
    public final void d(int i10) {
        if (this.f27493j) {
            return;
        }
        this.f27493j = true;
        this.f27490g = i10;
        Iterator it = this.f27494k.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.a(dVar);
        }
    }
}
