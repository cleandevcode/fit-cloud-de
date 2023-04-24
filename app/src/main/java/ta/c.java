package ta;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import qa.x;
import qa.y;

/* loaded from: classes.dex */
public final class c extends x<Date> {

    /* renamed from: b */
    public static final a f27855b = new a();

    /* renamed from: a */
    public final ArrayList f27856a;

    /* loaded from: classes.dex */
    public class a implements y {
        @Override // qa.y
        public final <T> x<T> a(qa.h hVar, xa.a<T> aVar) {
            if (aVar.f30456a == Date.class) {
                return new c();
            }
            return null;
        }
    }

    public c() {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        this.f27856a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (sa.m.f26774a >= 9) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", locale));
        }
    }

    @Override // qa.x
    public final Date a(ya.a aVar) {
        Date b10;
        if (aVar.h0() == 9) {
            aVar.X();
            return null;
        }
        String b02 = aVar.b0();
        synchronized (this.f27856a) {
            Iterator it = this.f27856a.iterator();
            while (true) {
                if (it.hasNext()) {
                    try {
                        b10 = ((DateFormat) it.next()).parse(b02);
                        break;
                    } catch (ParseException unused) {
                    }
                } else {
                    try {
                        b10 = ua.a.b(b02, new ParsePosition(0));
                        break;
                    } catch (ParseException e10) {
                        StringBuilder a10 = androidx.activity.result.d.a("Failed parsing '", b02, "' as Date; at path ");
                        a10.append(aVar.C());
                        throw new qa.s(a10.toString(), e10);
                    }
                }
            }
        }
        return b10;
    }

    @Override // qa.x
    public final void b(ya.b bVar, Date date) {
        String format;
        Date date2 = date;
        if (date2 == null) {
            bVar.y();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f27856a.get(0);
        synchronized (this.f27856a) {
            format = dateFormat.format(date2);
        }
        bVar.L(format);
    }
}
