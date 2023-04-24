package wa;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import qa.h;
import qa.s;
import qa.x;
import qa.y;

/* loaded from: classes.dex */
public final class b extends x<Time> {

    /* renamed from: b */
    public static final a f29770b = new a();

    /* renamed from: a */
    public final SimpleDateFormat f29771a = new SimpleDateFormat("hh:mm:ss a");

    /* loaded from: classes.dex */
    public class a implements y {
        @Override // qa.y
        public final <T> x<T> a(h hVar, xa.a<T> aVar) {
            if (aVar.f30456a == Time.class) {
                return new b();
            }
            return null;
        }
    }

    @Override // qa.x
    public final Time a(ya.a aVar) {
        Time time;
        if (aVar.h0() == 9) {
            aVar.X();
            return null;
        }
        String b02 = aVar.b0();
        try {
            synchronized (this) {
                time = new Time(this.f29771a.parse(b02).getTime());
            }
            return time;
        } catch (ParseException e10) {
            StringBuilder a10 = androidx.activity.result.d.a("Failed parsing '", b02, "' as SQL Time; at path ");
            a10.append(aVar.C());
            throw new s(a10.toString(), e10);
        }
    }

    @Override // qa.x
    public final void b(ya.b bVar, Time time) {
        String format;
        Time time2 = time;
        if (time2 == null) {
            bVar.y();
            return;
        }
        synchronized (this) {
            format = this.f29771a.format((Date) time2);
        }
        bVar.L(format);
    }
}
