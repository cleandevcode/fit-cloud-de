package wa;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import qa.h;
import qa.s;
import qa.x;
import qa.y;

/* loaded from: classes.dex */
public final class a extends x<Date> {

    /* renamed from: b */
    public static final C0544a f29768b = new C0544a();

    /* renamed from: a */
    public final SimpleDateFormat f29769a = new SimpleDateFormat("MMM d, yyyy");

    /* renamed from: wa.a$a */
    /* loaded from: classes.dex */
    public class C0544a implements y {
        @Override // qa.y
        public final <T> x<T> a(h hVar, xa.a<T> aVar) {
            if (aVar.f30456a == Date.class) {
                return new a();
            }
            return null;
        }
    }

    @Override // qa.x
    public final Date a(ya.a aVar) {
        java.util.Date parse;
        if (aVar.h0() == 9) {
            aVar.X();
            return null;
        }
        String b02 = aVar.b0();
        try {
            synchronized (this) {
                parse = this.f29769a.parse(b02);
            }
            return new Date(parse.getTime());
        } catch (ParseException e10) {
            StringBuilder a10 = androidx.activity.result.d.a("Failed parsing '", b02, "' as SQL Date; at path ");
            a10.append(aVar.C());
            throw new s(a10.toString(), e10);
        }
    }

    @Override // qa.x
    public final void b(ya.b bVar, Date date) {
        String format;
        Date date2 = date;
        if (date2 == null) {
            bVar.y();
            return;
        }
        synchronized (this) {
            format = this.f29769a.format((java.util.Date) date2);
        }
        bVar.L(format);
    }
}
