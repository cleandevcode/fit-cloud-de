package wa;

import java.sql.Timestamp;
import java.util.Date;
import qa.h;
import qa.x;
import qa.y;

/* loaded from: classes.dex */
public final class c extends x<Timestamp> {

    /* renamed from: b */
    public static final a f29772b = new a();

    /* renamed from: a */
    public final x<Date> f29773a;

    /* loaded from: classes.dex */
    public class a implements y {
        @Override // qa.y
        public final <T> x<T> a(h hVar, xa.a<T> aVar) {
            if (aVar.f30456a == Timestamp.class) {
                hVar.getClass();
                return new c(hVar.c(new xa.a<>(Date.class)));
            }
            return null;
        }
    }

    public c(x xVar) {
        this.f29773a = xVar;
    }

    @Override // qa.x
    public final Timestamp a(ya.a aVar) {
        Date a10 = this.f29773a.a(aVar);
        if (a10 != null) {
            return new Timestamp(a10.getTime());
        }
        return null;
    }

    @Override // qa.x
    public final void b(ya.b bVar, Timestamp timestamp) {
        this.f29773a.b(bVar, timestamp);
    }
}
