package qa;

/* loaded from: classes.dex */
public final class e extends x<Number> {
    @Override // qa.x
    public final Number a(ya.a aVar) {
        if (aVar.h0() == 9) {
            aVar.X();
            return null;
        }
        return Float.valueOf((float) aVar.J());
    }

    @Override // qa.x
    public final void b(ya.b bVar, Number number) {
        Number number2 = number;
        if (number2 == null) {
            bVar.y();
            return;
        }
        float floatValue = number2.floatValue();
        h.a(floatValue);
        if (!(number2 instanceof Float)) {
            number2 = Float.valueOf(floatValue);
        }
        bVar.J(number2);
    }
}
