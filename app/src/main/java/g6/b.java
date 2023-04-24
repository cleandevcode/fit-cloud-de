package g6;

import gm.l;
import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ int f15012a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f15012a) {
            case 0:
                f6.b bVar = (f6.b) obj;
                f6.b bVar2 = (f6.b) obj2;
                if (i6.a.b(c.class)) {
                    return 0;
                }
                try {
                    l.e(bVar2, "o2");
                    return bVar.a(bVar2);
                } catch (Throwable th2) {
                    i6.a.a(c.class, th2);
                    return 0;
                }
            default:
                rj.a aVar = (rj.a) obj;
                rj.a aVar2 = (rj.a) obj2;
                int i10 = (aVar.f25761e * 60) + aVar.f25762f;
                int i11 = (aVar2.f25761e * 60) + aVar2.f25762f;
                if (i10 > i11) {
                    return 1;
                }
                if (i10 < i11) {
                    return -1;
                }
                return aVar.f25757a - aVar2.f25757a;
        }
    }
}
