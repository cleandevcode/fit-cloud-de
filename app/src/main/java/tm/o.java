package tm;

/* loaded from: classes2.dex */
public interface o<T> extends sm.f<T> {

    /* loaded from: classes2.dex */
    public static final class a {
        public static /* synthetic */ sm.f a(o oVar, wm.c cVar, int i10, rm.f fVar, int i11) {
            xl.g gVar = cVar;
            if ((i11 & 1) != 0) {
                gVar = xl.g.f30632a;
            }
            if ((i11 & 2) != 0) {
                i10 = -3;
            }
            if ((i11 & 4) != 0) {
                fVar = rm.f.SUSPEND;
            }
            return oVar.b(gVar, i10, fVar);
        }
    }

    sm.f<T> b(xl.f fVar, int i10, rm.f fVar2);
}
