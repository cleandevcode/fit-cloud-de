package l4;

import e4.e;
import i4.t;
import j4.d1;
import j4.i0;
import j4.t0;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.money.Monetary;
import org.javamoney.moneta.Money;

/* loaded from: classes.dex */
public final class a implements t0, t {

    /* renamed from: a */
    public static final a f19391a = new a();

    @Override // i4.t
    public final int b() {
        return 0;
    }

    @Override // i4.t
    public final <T> T d(h4.a aVar, Type type, Object obj) {
        e L = aVar.L();
        Object obj2 = L.get("currency");
        String x10 = obj2 instanceof e ? ((e) obj2).x("currencyCode") : obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = L.get("numberStripped");
        if ((obj3 instanceof BigDecimal) || (obj3 instanceof Integer) || (obj3 instanceof BigInteger)) {
            return (T) Money.of((Number) obj3, Monetary.getCurrency(x10, new String[0]));
        }
        throw new UnsupportedOperationException();
    }

    @Override // j4.t0
    public final void e(i0 i0Var, Object obj, Object obj2, Type type, int i10) {
        Money money = (Money) obj;
        if (money == null) {
            i0Var.u();
            return;
        }
        d1 d1Var = i0Var.f17406j;
        d1Var.F(money.getNumberStripped());
        d1Var.E(',', "currency", money.getCurrency().getCurrencyCode());
        d1Var.write(125);
    }
}
