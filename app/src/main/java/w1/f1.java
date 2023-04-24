package w1;

import java.util.Map;
import w1.s;

/* loaded from: classes.dex */
public final class f1 extends g1<Object, Object> {
    public f1(int i10) {
        super(i10);
    }

    @Override // w1.g1
    public final void h() {
        if (!this.f29573d) {
            for (int i10 = 0; i10 < e(); i10++) {
                ((s.a) d(i10).getKey()).q();
            }
            for (Map.Entry<Object, Object> entry : f()) {
                ((s.a) entry.getKey()).q();
            }
        }
        super.h();
    }

    @Override // w1.g1, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((s.a) obj, obj2);
    }
}
