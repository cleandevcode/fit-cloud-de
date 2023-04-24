package j4;

import java.lang.reflect.Type;
import java.util.concurrent.atomic.DoubleAdder;
import java.util.concurrent.atomic.LongAdder;

/* loaded from: classes.dex */
public final class b implements t0 {

    /* renamed from: a */
    public static final b f17330a = new b();

    @Override // j4.t0
    public final void e(i0 i0Var, Object obj, Object obj2, Type type, int i10) {
        d1 d1Var = i0Var.f17406j;
        if (obj instanceof LongAdder) {
            d1Var.D('{', "value", ((LongAdder) obj).longValue());
        } else if (obj instanceof DoubleAdder) {
            double doubleValue = ((DoubleAdder) obj).doubleValue();
            d1Var.write(123);
            d1Var.y("value");
            d1Var.v(doubleValue, false);
        } else {
            return;
        }
        d1Var.write(125);
    }
}
