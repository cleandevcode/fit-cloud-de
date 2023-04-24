package ta;

import qa.x;
import s.c0;

/* loaded from: classes.dex */
public final class j extends x<Number> {

    /* renamed from: b */
    public static final i f27875b = new i(new j());

    /* renamed from: a */
    public final qa.v f27876a = qa.u.f24667b;

    @Override // qa.x
    public final Number a(ya.a aVar) {
        int h02 = aVar.h0();
        int b10 = c0.b(h02);
        if (b10 != 5 && b10 != 6) {
            if (b10 == 8) {
                aVar.X();
                return null;
            }
            StringBuilder a10 = android.support.v4.media.d.a("Expecting number, got: ");
            a10.append(a1.b.c(h02));
            a10.append("; at path ");
            a10.append(aVar.v());
            throw new qa.s(a10.toString());
        }
        return this.f27876a.a(aVar);
    }

    @Override // qa.x
    public final void b(ya.b bVar, Number number) {
        bVar.J(number);
    }
}
