package j4;

import java.lang.reflect.Type;
import java.text.DecimalFormat;

/* loaded from: classes.dex */
public final class x implements t0 {

    /* renamed from: b */
    public static final x f17470b = new x();

    /* renamed from: a */
    public DecimalFormat f17471a;

    public x() {
        this.f17471a = null;
    }

    public x(String str) {
        this.f17471a = new DecimalFormat(str);
    }

    @Override // j4.t0
    public final void e(i0 i0Var, Object obj, Object obj2, Type type, int i10) {
        d1 d1Var = i0Var.f17406j;
        if (obj == null) {
            d1Var.X(e1.WriteNullNumberAsZero);
            return;
        }
        double doubleValue = ((Double) obj).doubleValue();
        if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
            d1Var.R();
            return;
        }
        DecimalFormat decimalFormat = this.f17471a;
        if (decimalFormat == null) {
            d1Var.v(doubleValue, true);
        } else {
            d1Var.write(decimalFormat.format(doubleValue));
        }
    }
}
