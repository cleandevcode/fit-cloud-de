package i2;

import androidx.lifecycle.k;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements androidx.lifecycle.s {

    /* renamed from: a */
    public final /* synthetic */ int f16320a;

    /* renamed from: b */
    public final /* synthetic */ Object f16321b;

    public /* synthetic */ l(int i10, Object obj) {
        this.f16320a = i10;
        this.f16321b = obj;
    }

    @Override // androidx.lifecycle.s
    public final void d(androidx.lifecycle.u uVar, k.b bVar) {
        boolean z10;
        switch (this.f16320a) {
            case 0:
                m mVar = (m) this.f16321b;
                gm.l.f(mVar, "this$0");
                mVar.f16338q = bVar.a();
                if (mVar.f16324c != null) {
                    Iterator<j> it = mVar.f16328g.iterator();
                    while (it.hasNext()) {
                        j next = it.next();
                        next.getClass();
                        next.f16296d = bVar.a();
                        next.d();
                    }
                    return;
                }
                return;
            default:
                q2.a aVar = (q2.a) this.f16321b;
                gm.l.f(aVar, "this$0");
                if (bVar == k.b.ON_START) {
                    z10 = true;
                } else if (bVar == k.b.ON_STOP) {
                    z10 = false;
                } else {
                    return;
                }
                aVar.f24510f = z10;
                return;
        }
    }
}
