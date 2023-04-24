package j4;

import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/* loaded from: classes.dex */
public final class p extends i4.e implements t0, u {

    /* renamed from: b */
    public static final p f17456b = new p();

    /* renamed from: a */
    public DatatypeFactory f17457a;

    @Override // i4.t
    public final int b() {
        return 2;
    }

    @Override // j4.u
    public final void c(i0 i0Var, Object obj, j jVar) {
        d1 d1Var = i0Var.f17406j;
        String str = (String) jVar.f17415b;
        Calendar calendar = (Calendar) obj;
        if (str.equals("unixtime")) {
            d1Var.L((int) (calendar.getTimeInMillis() / 1000));
            return;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        simpleDateFormat.setTimeZone(i0Var.f17412p);
        d1Var.Z(simpleDateFormat.format(calendar.getTime()));
    }

    @Override // i4.e, i4.t
    public final <T> T d(h4.a aVar, Type type, Object obj) {
        return (T) f(aVar, type, obj, null, 0);
    }

    @Override // j4.t0
    public final void e(i0 i0Var, Object obj, Object obj2, Type type, int i10) {
        Calendar calendar;
        int i11;
        char[] charArray;
        d1 d1Var = i0Var.f17406j;
        if (obj == null) {
            d1Var.R();
            return;
        }
        if (obj instanceof XMLGregorianCalendar) {
            calendar = ((XMLGregorianCalendar) obj).toGregorianCalendar();
        } else {
            calendar = (Calendar) obj;
        }
        if (d1Var.q(e1.UseISO8601DateFormat)) {
            if (d1Var.q(e1.UseSingleQuotes)) {
                i11 = 39;
            } else {
                i11 = 34;
            }
            d1Var.write(i11);
            int i12 = calendar.get(1);
            int i13 = calendar.get(2) + 1;
            int i14 = calendar.get(5);
            int i15 = calendar.get(11);
            int i16 = calendar.get(12);
            int i17 = calendar.get(13);
            int i18 = calendar.get(14);
            if (i18 != 0) {
                charArray = "0000-00-00T00:00:00.000".toCharArray();
                n4.g.d(charArray, i18, 23);
                n4.g.d(charArray, i17, 19);
                n4.g.d(charArray, i16, 16);
                n4.g.d(charArray, i15, 13);
                n4.g.d(charArray, i14, 10);
                n4.g.d(charArray, i13, 7);
                n4.g.d(charArray, i12, 4);
            } else if (i17 == 0 && i16 == 0 && i15 == 0) {
                charArray = "0000-00-00".toCharArray();
                n4.g.d(charArray, i14, 10);
                n4.g.d(charArray, i13, 7);
                n4.g.d(charArray, i12, 4);
            } else {
                charArray = "0000-00-00T00:00:00".toCharArray();
                n4.g.d(charArray, i17, 19);
                n4.g.d(charArray, i16, 16);
                n4.g.d(charArray, i15, 13);
                n4.g.d(charArray, i14, 10);
                n4.g.d(charArray, i13, 7);
                n4.g.d(charArray, i12, 4);
            }
            d1Var.write(charArray);
            float offset = calendar.getTimeZone().getOffset(calendar.getTimeInMillis()) / 3600000.0f;
            int i19 = (int) offset;
            if (i19 == 0.0d) {
                d1Var.write(90);
            } else {
                if (i19 > 9) {
                    d1Var.write(43);
                } else if (i19 > 0) {
                    d1Var.write(43);
                    d1Var.write(48);
                } else if (i19 < -9) {
                    d1Var.write(45);
                } else {
                    if (i19 < 0) {
                        d1Var.write(45);
                        d1Var.write(48);
                        d1Var.L(-i19);
                    }
                    d1Var.write(58);
                    d1Var.b(String.format("%02d", Integer.valueOf((int) ((offset - i19) * 60.0f))));
                }
                d1Var.L(i19);
                d1Var.write(58);
                d1Var.b(String.format("%02d", Integer.valueOf((int) ((offset - i19) * 60.0f))));
            }
            d1Var.write(i11);
            return;
        }
        i0Var.s(calendar.getTime());
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.Calendar, T] */
    @Override // i4.e
    public final <T> T f(h4.a aVar, Type type, Object obj, String str, int i10) {
        T t10 = (T) w.f17469a.f(aVar, type, obj, str, i10);
        if (t10 instanceof Calendar) {
            return t10;
        }
        Date date = (Date) t10;
        if (date == null) {
            return null;
        }
        h4.c cVar = aVar.f15774f;
        ?? r72 = (T) Calendar.getInstance(cVar.X(), cVar.E0());
        r72.setTime(date);
        return type == XMLGregorianCalendar.class ? (T) g((GregorianCalendar) r72) : r72;
    }

    public final XMLGregorianCalendar g(Calendar calendar) {
        if (this.f17457a == null) {
            try {
                this.f17457a = DatatypeFactory.newInstance();
            } catch (DatatypeConfigurationException e10) {
                throw new IllegalStateException("Could not obtain an instance of DatatypeFactory.", e10);
            }
        }
        return this.f17457a.newXMLGregorianCalendar((GregorianCalendar) calendar);
    }
}
