package qa;

/* loaded from: classes.dex */
public final class d extends x<Number> {
    @Override // qa.x
    public final Number a(ya.a aVar) {
        if (aVar.h0() == 9) {
            aVar.X();
            return null;
        }
        return Double.valueOf(aVar.J());
    }

    @Override // qa.x
    public final void b(ya.b bVar, Number number) {
        Number number2 = number;
        if (number2 == null) {
            bVar.y();
            return;
        }
        double doubleValue = number2.doubleValue();
        h.a(doubleValue);
        bVar.E(doubleValue);
    }
}
