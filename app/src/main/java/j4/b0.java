package j4;

import java.lang.reflect.Type;
import java.text.DecimalFormat;

/* loaded from: classes.dex */
public final class b0 implements t0, i4.t {

    /* renamed from: b */
    public static b0 f17331b = new b0();

    /* renamed from: a */
    public DecimalFormat f17332a;

    public b0() {
    }

    public b0(String str) {
        this.f17332a = new DecimalFormat(str);
    }

    @Override // i4.t
    public final int b() {
        return 2;
    }

    @Override // i4.t
    public final <T> T d(h4.a aVar, Type type, Object obj) {
        float e02;
        try {
            h4.c cVar = aVar.f15774f;
            if (cVar.h0() == 2) {
                String I0 = cVar.I0();
                cVar.J(16);
                e02 = Float.parseFloat(I0);
            } else if (cVar.h0() == 3) {
                e02 = cVar.e0();
                cVar.J(16);
            } else {
                Object D = aVar.D();
                if (D == null) {
                    return null;
                }
                return (T) n4.n.l(D);
            }
            return (T) Float.valueOf(e02);
        } catch (Exception e10) {
            throw new e4.d(g4.g.a("parseLong error, field : ", obj), e10);
        }
    }

    @Override // j4.t0
    public final void e(i0 i0Var, Object obj, Object obj2, Type type, int i10) {
        d1 d1Var = i0Var.f17406j;
        if (obj == null) {
            d1Var.X(e1.WriteNullNumberAsZero);
            return;
        }
        float floatValue = ((Float) obj).floatValue();
        DecimalFormat decimalFormat = this.f17332a;
        if (decimalFormat != null) {
            d1Var.write(decimalFormat.format(floatValue));
        } else if (floatValue == floatValue && floatValue != Float.POSITIVE_INFINITY && floatValue != Float.NEGATIVE_INFINITY) {
            int i11 = d1Var.f17354b + 15;
            if (i11 > d1Var.f17353a.length) {
                if (d1Var.f17356d == null) {
                    d1Var.j(i11);
                } else {
                    char[] cArr = new char[15];
                    String str = new String(cArr, 0, bi.r.N(floatValue, cArr, 0));
                    d1Var.write(str, 0, str.length());
                    if (!d1Var.q(e1.WriteClassName)) {
                        return;
                    }
                    d1Var.write(70);
                }
            }
            d1Var.f17354b += bi.r.N(floatValue, d1Var.f17353a, d1Var.f17354b);
            if (!d1Var.q(e1.WriteClassName)) {
                return;
            }
            d1Var.write(70);
        } else {
            d1Var.R();
        }
    }
}
