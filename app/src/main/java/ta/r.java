package ta;

import androidx.appcompat.widget.e2;
import androidx.fragment.app.h1;
import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.ConcurrentModificationException;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import sa.o;

/* loaded from: classes.dex */
public final class r {
    public static final ta.v A;
    public static final u B;

    /* renamed from: a */
    public static final ta.s f27915a = new ta.s(Class.class, new qa.w(new k()));

    /* renamed from: b */
    public static final ta.s f27916b = new ta.s(BitSet.class, new qa.w(new v()));

    /* renamed from: c */
    public static final x f27917c;

    /* renamed from: d */
    public static final ta.t f27918d;

    /* renamed from: e */
    public static final ta.t f27919e;

    /* renamed from: f */
    public static final ta.t f27920f;

    /* renamed from: g */
    public static final ta.t f27921g;

    /* renamed from: h */
    public static final ta.s f27922h;

    /* renamed from: i */
    public static final ta.s f27923i;

    /* renamed from: j */
    public static final ta.s f27924j;

    /* renamed from: k */
    public static final b f27925k;

    /* renamed from: l */
    public static final ta.t f27926l;

    /* renamed from: m */
    public static final g f27927m;

    /* renamed from: n */
    public static final h f27928n;

    /* renamed from: o */
    public static final i f27929o;

    /* renamed from: p */
    public static final ta.s f27930p;

    /* renamed from: q */
    public static final ta.s f27931q;

    /* renamed from: r */
    public static final ta.s f27932r;

    /* renamed from: s */
    public static final ta.s f27933s;

    /* renamed from: t */
    public static final ta.s f27934t;

    /* renamed from: u */
    public static final ta.v f27935u;

    /* renamed from: v */
    public static final ta.s f27936v;

    /* renamed from: w */
    public static final ta.s f27937w;

    /* renamed from: x */
    public static final ta.u f27938x;

    /* renamed from: y */
    public static final ta.s f27939y;

    /* renamed from: z */
    public static final t f27940z;

    /* loaded from: classes.dex */
    public class a extends qa.x<AtomicIntegerArray> {
        @Override // qa.x
        public final AtomicIntegerArray a(ya.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.D()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.L()));
                } catch (NumberFormatException e10) {
                    throw new qa.s(e10);
                }
            }
            aVar.k();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // qa.x
        public final void b(ya.b bVar, AtomicIntegerArray atomicIntegerArray) {
            AtomicIntegerArray atomicIntegerArray2 = atomicIntegerArray;
            bVar.b();
            int length = atomicIntegerArray2.length();
            for (int i10 = 0; i10 < length; i10++) {
                bVar.F(atomicIntegerArray2.get(i10));
            }
            bVar.k();
        }
    }

    /* loaded from: classes.dex */
    public class a0 extends qa.x<Number> {
        @Override // qa.x
        public final Number a(ya.a aVar) {
            if (aVar.h0() == 9) {
                aVar.X();
                return null;
            }
            try {
                return Integer.valueOf(aVar.L());
            } catch (NumberFormatException e10) {
                throw new qa.s(e10);
            }
        }

        @Override // qa.x
        public final void b(ya.b bVar, Number number) {
            Number number2 = number;
            if (number2 == null) {
                bVar.y();
            } else {
                bVar.F(number2.intValue());
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends qa.x<Number> {
        @Override // qa.x
        public final Number a(ya.a aVar) {
            if (aVar.h0() == 9) {
                aVar.X();
                return null;
            }
            try {
                return Long.valueOf(aVar.P());
            } catch (NumberFormatException e10) {
                throw new qa.s(e10);
            }
        }

        @Override // qa.x
        public final void b(ya.b bVar, Number number) {
            Number number2 = number;
            if (number2 == null) {
                bVar.y();
            } else {
                bVar.F(number2.longValue());
            }
        }
    }

    /* loaded from: classes.dex */
    public class b0 extends qa.x<AtomicInteger> {
        @Override // qa.x
        public final AtomicInteger a(ya.a aVar) {
            try {
                return new AtomicInteger(aVar.L());
            } catch (NumberFormatException e10) {
                throw new qa.s(e10);
            }
        }

        @Override // qa.x
        public final void b(ya.b bVar, AtomicInteger atomicInteger) {
            bVar.F(atomicInteger.get());
        }
    }

    /* loaded from: classes.dex */
    public class c extends qa.x<Number> {
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
            if (!(number2 instanceof Float)) {
                number2 = Float.valueOf(number2.floatValue());
            }
            bVar.J(number2);
        }
    }

    /* loaded from: classes.dex */
    public class c0 extends qa.x<AtomicBoolean> {
        @Override // qa.x
        public final AtomicBoolean a(ya.a aVar) {
            return new AtomicBoolean(aVar.I());
        }

        @Override // qa.x
        public final void b(ya.b bVar, AtomicBoolean atomicBoolean) {
            bVar.P(atomicBoolean.get());
        }
    }

    /* loaded from: classes.dex */
    public class d extends qa.x<Number> {
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
            } else {
                bVar.E(number2.doubleValue());
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class d0<T extends Enum<T>> extends qa.x<T> {

        /* renamed from: a */
        public final HashMap f27941a = new HashMap();

        /* renamed from: b */
        public final HashMap f27942b = new HashMap();

        /* renamed from: c */
        public final HashMap f27943c = new HashMap();

        /* loaded from: classes.dex */
        public class a implements PrivilegedAction<Field[]> {

            /* renamed from: a */
            public final /* synthetic */ Class f27944a;

            public a(Class cls) {
                this.f27944a = cls;
            }

            @Override // java.security.PrivilegedAction
            public final Field[] run() {
                Field[] declaredFields = this.f27944a.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.isEnumConstant()) {
                        arrayList.add(field);
                    }
                }
                Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                AccessibleObject.setAccessible(fieldArr, true);
                return fieldArr;
            }
        }

        public d0(Class<T> cls) {
            Field[] fieldArr;
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new a(cls))) {
                    Enum r42 = (Enum) field.get(null);
                    String name = r42.name();
                    String str = r42.toString();
                    ra.b bVar = (ra.b) field.getAnnotation(ra.b.class);
                    if (bVar != null) {
                        name = bVar.value();
                        for (String str2 : bVar.alternate()) {
                            this.f27941a.put(str2, r42);
                        }
                    }
                    this.f27941a.put(name, r42);
                    this.f27942b.put(str, r42);
                    this.f27943c.put(r42, name);
                }
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // qa.x
        public final Object a(ya.a aVar) {
            if (aVar.h0() == 9) {
                aVar.X();
                return null;
            }
            String b02 = aVar.b0();
            Enum r02 = (Enum) this.f27941a.get(b02);
            return r02 == null ? (Enum) this.f27942b.get(b02) : r02;
        }

        @Override // qa.x
        public final void b(ya.b bVar, Object obj) {
            Enum r32 = (Enum) obj;
            bVar.L(r32 == null ? null : (String) this.f27943c.get(r32));
        }
    }

    /* loaded from: classes.dex */
    public class e extends qa.x<Character> {
        @Override // qa.x
        public final Character a(ya.a aVar) {
            if (aVar.h0() == 9) {
                aVar.X();
                return null;
            }
            String b02 = aVar.b0();
            if (b02.length() == 1) {
                return Character.valueOf(b02.charAt(0));
            }
            StringBuilder a10 = androidx.activity.result.d.a("Expecting character, got: ", b02, "; at ");
            a10.append(aVar.C());
            throw new qa.s(a10.toString());
        }

        @Override // qa.x
        public final void b(ya.b bVar, Character ch2) {
            Character ch3 = ch2;
            bVar.L(ch3 == null ? null : String.valueOf(ch3));
        }
    }

    /* loaded from: classes.dex */
    public class f extends qa.x<String> {
        @Override // qa.x
        public final String a(ya.a aVar) {
            int h02 = aVar.h0();
            if (h02 != 9) {
                return h02 == 8 ? Boolean.toString(aVar.I()) : aVar.b0();
            }
            aVar.X();
            return null;
        }

        @Override // qa.x
        public final void b(ya.b bVar, String str) {
            bVar.L(str);
        }
    }

    /* loaded from: classes.dex */
    public class g extends qa.x<BigDecimal> {
        @Override // qa.x
        public final BigDecimal a(ya.a aVar) {
            if (aVar.h0() == 9) {
                aVar.X();
                return null;
            }
            String b02 = aVar.b0();
            try {
                return new BigDecimal(b02);
            } catch (NumberFormatException e10) {
                StringBuilder a10 = androidx.activity.result.d.a("Failed parsing '", b02, "' as BigDecimal; at path ");
                a10.append(aVar.C());
                throw new qa.s(a10.toString(), e10);
            }
        }

        @Override // qa.x
        public final void b(ya.b bVar, BigDecimal bigDecimal) {
            bVar.J(bigDecimal);
        }
    }

    /* loaded from: classes.dex */
    public class h extends qa.x<BigInteger> {
        @Override // qa.x
        public final BigInteger a(ya.a aVar) {
            if (aVar.h0() == 9) {
                aVar.X();
                return null;
            }
            String b02 = aVar.b0();
            try {
                return new BigInteger(b02);
            } catch (NumberFormatException e10) {
                StringBuilder a10 = androidx.activity.result.d.a("Failed parsing '", b02, "' as BigInteger; at path ");
                a10.append(aVar.C());
                throw new qa.s(a10.toString(), e10);
            }
        }

        @Override // qa.x
        public final void b(ya.b bVar, BigInteger bigInteger) {
            bVar.J(bigInteger);
        }
    }

    /* loaded from: classes.dex */
    public class i extends qa.x<sa.n> {
        @Override // qa.x
        public final sa.n a(ya.a aVar) {
            if (aVar.h0() == 9) {
                aVar.X();
                return null;
            }
            return new sa.n(aVar.b0());
        }

        @Override // qa.x
        public final void b(ya.b bVar, sa.n nVar) {
            bVar.J(nVar);
        }
    }

    /* loaded from: classes.dex */
    public class j extends qa.x<StringBuilder> {
        @Override // qa.x
        public final StringBuilder a(ya.a aVar) {
            if (aVar.h0() == 9) {
                aVar.X();
                return null;
            }
            return new StringBuilder(aVar.b0());
        }

        @Override // qa.x
        public final void b(ya.b bVar, StringBuilder sb2) {
            StringBuilder sb3 = sb2;
            bVar.L(sb3 == null ? null : sb3.toString());
        }
    }

    /* loaded from: classes.dex */
    public class k extends qa.x<Class> {
        @Override // qa.x
        public final Class a(ya.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // qa.x
        public final void b(ya.b bVar, Class cls) {
            throw new UnsupportedOperationException(h1.a(cls, android.support.v4.media.d.a("Attempted to serialize java.lang.Class: "), ". Forgot to register a type adapter?"));
        }
    }

    /* loaded from: classes.dex */
    public class l extends qa.x<StringBuffer> {
        @Override // qa.x
        public final StringBuffer a(ya.a aVar) {
            if (aVar.h0() == 9) {
                aVar.X();
                return null;
            }
            return new StringBuffer(aVar.b0());
        }

        @Override // qa.x
        public final void b(ya.b bVar, StringBuffer stringBuffer) {
            StringBuffer stringBuffer2 = stringBuffer;
            bVar.L(stringBuffer2 == null ? null : stringBuffer2.toString());
        }
    }

    /* loaded from: classes.dex */
    public class m extends qa.x<URL> {
        @Override // qa.x
        public final URL a(ya.a aVar) {
            if (aVar.h0() == 9) {
                aVar.X();
            } else {
                String b02 = aVar.b0();
                if (!"null".equals(b02)) {
                    return new URL(b02);
                }
            }
            return null;
        }

        @Override // qa.x
        public final void b(ya.b bVar, URL url) {
            URL url2 = url;
            bVar.L(url2 == null ? null : url2.toExternalForm());
        }
    }

    /* loaded from: classes.dex */
    public class n extends qa.x<URI> {
        @Override // qa.x
        public final URI a(ya.a aVar) {
            if (aVar.h0() == 9) {
                aVar.X();
            } else {
                try {
                    String b02 = aVar.b0();
                    if (!"null".equals(b02)) {
                        return new URI(b02);
                    }
                } catch (URISyntaxException e10) {
                    throw new qa.m(e10);
                }
            }
            return null;
        }

        @Override // qa.x
        public final void b(ya.b bVar, URI uri) {
            URI uri2 = uri;
            bVar.L(uri2 == null ? null : uri2.toASCIIString());
        }
    }

    /* loaded from: classes.dex */
    public class o extends qa.x<InetAddress> {
        @Override // qa.x
        public final InetAddress a(ya.a aVar) {
            if (aVar.h0() == 9) {
                aVar.X();
                return null;
            }
            return InetAddress.getByName(aVar.b0());
        }

        @Override // qa.x
        public final void b(ya.b bVar, InetAddress inetAddress) {
            InetAddress inetAddress2 = inetAddress;
            bVar.L(inetAddress2 == null ? null : inetAddress2.getHostAddress());
        }
    }

    /* loaded from: classes.dex */
    public class p extends qa.x<UUID> {
        @Override // qa.x
        public final UUID a(ya.a aVar) {
            if (aVar.h0() == 9) {
                aVar.X();
                return null;
            }
            String b02 = aVar.b0();
            try {
                return UUID.fromString(b02);
            } catch (IllegalArgumentException e10) {
                StringBuilder a10 = androidx.activity.result.d.a("Failed parsing '", b02, "' as UUID; at path ");
                a10.append(aVar.C());
                throw new qa.s(a10.toString(), e10);
            }
        }

        @Override // qa.x
        public final void b(ya.b bVar, UUID uuid) {
            UUID uuid2 = uuid;
            bVar.L(uuid2 == null ? null : uuid2.toString());
        }
    }

    /* loaded from: classes.dex */
    public class q extends qa.x<Currency> {
        @Override // qa.x
        public final Currency a(ya.a aVar) {
            String b02 = aVar.b0();
            try {
                return Currency.getInstance(b02);
            } catch (IllegalArgumentException e10) {
                StringBuilder a10 = androidx.activity.result.d.a("Failed parsing '", b02, "' as Currency; at path ");
                a10.append(aVar.C());
                throw new qa.s(a10.toString(), e10);
            }
        }

        @Override // qa.x
        public final void b(ya.b bVar, Currency currency) {
            bVar.L(currency.getCurrencyCode());
        }
    }

    /* renamed from: ta.r$r */
    /* loaded from: classes.dex */
    public class C0497r extends qa.x<Calendar> {
        @Override // qa.x
        public final Calendar a(ya.a aVar) {
            if (aVar.h0() == 9) {
                aVar.X();
                return null;
            }
            aVar.b();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (aVar.h0() != 4) {
                String R = aVar.R();
                int L = aVar.L();
                if ("year".equals(R)) {
                    i10 = L;
                } else if ("month".equals(R)) {
                    i11 = L;
                } else if ("dayOfMonth".equals(R)) {
                    i12 = L;
                } else if ("hourOfDay".equals(R)) {
                    i13 = L;
                } else if ("minute".equals(R)) {
                    i14 = L;
                } else if ("second".equals(R)) {
                    i15 = L;
                }
            }
            aVar.q();
            return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
        }

        @Override // qa.x
        public final void b(ya.b bVar, Calendar calendar) {
            Calendar calendar2 = calendar;
            if (calendar2 == null) {
                bVar.y();
                return;
            }
            bVar.h();
            bVar.s("year");
            bVar.F(calendar2.get(1));
            bVar.s("month");
            bVar.F(calendar2.get(2));
            bVar.s("dayOfMonth");
            bVar.F(calendar2.get(5));
            bVar.s("hourOfDay");
            bVar.F(calendar2.get(11));
            bVar.s("minute");
            bVar.F(calendar2.get(12));
            bVar.s("second");
            bVar.F(calendar2.get(13));
            bVar.q();
        }
    }

    /* loaded from: classes.dex */
    public class s extends qa.x<Locale> {
        @Override // qa.x
        public final Locale a(ya.a aVar) {
            if (aVar.h0() == 9) {
                aVar.X();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.b0(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (nextToken2 == null && nextToken3 == null) {
                return new Locale(nextToken);
            }
            return nextToken3 == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, nextToken3);
        }

        @Override // qa.x
        public final void b(ya.b bVar, Locale locale) {
            Locale locale2 = locale;
            bVar.L(locale2 == null ? null : locale2.toString());
        }
    }

    /* loaded from: classes.dex */
    public class t extends qa.x<qa.l> {
        public static qa.l c(ya.a aVar, int i10) {
            if (i10 != 0) {
                int i11 = i10 - 1;
                if (i11 != 5) {
                    if (i11 != 6) {
                        if (i11 != 7) {
                            if (i11 == 8) {
                                aVar.X();
                                return qa.n.f24663a;
                            }
                            StringBuilder a10 = android.support.v4.media.d.a("Unexpected token: ");
                            a10.append(a1.b.c(i10));
                            throw new IllegalStateException(a10.toString());
                        }
                        return new qa.q(Boolean.valueOf(aVar.I()));
                    }
                    return new qa.q(new sa.n(aVar.b0()));
                }
                return new qa.q(aVar.b0());
            }
            throw null;
        }

        public static qa.l d(ya.a aVar, int i10) {
            if (i10 != 0) {
                int i11 = i10 - 1;
                if (i11 == 0) {
                    aVar.a();
                    return new qa.j();
                } else if (i11 != 2) {
                    return null;
                } else {
                    aVar.b();
                    return new qa.o();
                }
            }
            throw null;
        }

        public static void e(qa.l lVar, ya.b bVar) {
            boolean z10;
            if (lVar != null && !(lVar instanceof qa.n)) {
                if (lVar instanceof qa.q) {
                    qa.q b10 = lVar.b();
                    Serializable serializable = b10.f24665a;
                    if (serializable instanceof Number) {
                        bVar.J(b10.f());
                        return;
                    } else if (serializable instanceof Boolean) {
                        bVar.P(b10.e());
                        return;
                    } else {
                        bVar.L(b10.i());
                        return;
                    }
                }
                boolean z11 = lVar instanceof qa.j;
                if (z11) {
                    bVar.b();
                    if (z11) {
                        Iterator<qa.l> it = ((qa.j) lVar).iterator();
                        while (it.hasNext()) {
                            e(it.next(), bVar);
                        }
                        bVar.k();
                        return;
                    }
                    throw new IllegalStateException("Not a JSON Array: " + lVar);
                }
                boolean z12 = lVar instanceof qa.o;
                if (z12) {
                    bVar.h();
                    if (z12) {
                        sa.o oVar = sa.o.this;
                        o.e eVar = oVar.f26782f.f26794d;
                        int i10 = oVar.f26781e;
                        while (true) {
                            o.e eVar2 = oVar.f26782f;
                            if (eVar != eVar2) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                if (eVar != eVar2) {
                                    if (oVar.f26781e == i10) {
                                        o.e eVar3 = eVar.f26794d;
                                        bVar.s((String) eVar.f26796f);
                                        e((qa.l) eVar.f26798h, bVar);
                                        eVar = eVar3;
                                    } else {
                                        throw new ConcurrentModificationException();
                                    }
                                } else {
                                    throw new NoSuchElementException();
                                }
                            } else {
                                bVar.q();
                                return;
                            }
                        }
                    } else {
                        throw new IllegalStateException("Not a JSON Object: " + lVar);
                    }
                } else {
                    StringBuilder a10 = android.support.v4.media.d.a("Couldn't write ");
                    a10.append(lVar.getClass());
                    throw new IllegalArgumentException(a10.toString());
                }
            } else {
                bVar.y();
            }
        }

        @Override // qa.x
        public final qa.l a(ya.a aVar) {
            boolean z10;
            qa.l lVar;
            qa.l lVar2;
            if (aVar instanceof ta.f) {
                ta.f fVar = (ta.f) aVar;
                int h02 = fVar.h0();
                if (h02 != 5 && h02 != 2 && h02 != 4 && h02 != 10) {
                    qa.l lVar3 = (qa.l) fVar.y0();
                    fVar.t0();
                    return lVar3;
                }
                StringBuilder a10 = android.support.v4.media.d.a("Unexpected ");
                a10.append(a1.b.c(h02));
                a10.append(" when reading a JsonElement.");
                throw new IllegalStateException(a10.toString());
            }
            int h03 = aVar.h0();
            qa.l d10 = d(aVar, h03);
            if (d10 == null) {
                return c(aVar, h03);
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            while (true) {
                if (aVar.D()) {
                    String str = null;
                    if (d10 instanceof qa.o) {
                        str = aVar.R();
                    }
                    int h04 = aVar.h0();
                    qa.l d11 = d(aVar, h04);
                    if (d11 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (d11 == null) {
                        d11 = c(aVar, h04);
                    }
                    if (d10 instanceof qa.j) {
                        qa.j jVar = (qa.j) d10;
                        if (d11 == null) {
                            jVar.getClass();
                            lVar2 = qa.n.f24663a;
                        } else {
                            lVar2 = d11;
                        }
                        jVar.f24662a.add(lVar2);
                    } else {
                        sa.o<String, qa.l> oVar = ((qa.o) d10).f24664a;
                        if (d11 == null) {
                            lVar = qa.n.f24663a;
                        } else {
                            lVar = d11;
                        }
                        oVar.put(str, lVar);
                    }
                    if (z10) {
                        arrayDeque.addLast(d10);
                        d10 = d11;
                    }
                } else {
                    if (d10 instanceof qa.j) {
                        aVar.k();
                    } else {
                        aVar.q();
                    }
                    if (arrayDeque.isEmpty()) {
                        return d10;
                    }
                    d10 = (qa.l) arrayDeque.removeLast();
                }
            }
        }

        @Override // qa.x
        public final /* bridge */ /* synthetic */ void b(ya.b bVar, qa.l lVar) {
            e(lVar, bVar);
        }
    }

    /* loaded from: classes.dex */
    public class u implements qa.y {
        @Override // qa.y
        public final <T> qa.x<T> a(qa.h hVar, xa.a<T> aVar) {
            Class<? super T> cls = aVar.f30456a;
            if (Enum.class.isAssignableFrom(cls) && cls != Enum.class) {
                if (!cls.isEnum()) {
                    cls = cls.getSuperclass();
                }
                return new d0(cls);
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public class v extends qa.x<BitSet> {
        @Override // qa.x
        public final BitSet a(ya.a aVar) {
            BitSet bitSet = new BitSet();
            aVar.a();
            int h02 = aVar.h0();
            int i10 = 0;
            while (h02 != 2) {
                int b10 = s.c0.b(h02);
                boolean z10 = true;
                if (b10 != 5 && b10 != 6) {
                    if (b10 == 7) {
                        z10 = aVar.I();
                    } else {
                        StringBuilder a10 = android.support.v4.media.d.a("Invalid bitset value type: ");
                        a10.append(a1.b.c(h02));
                        a10.append("; at path ");
                        a10.append(aVar.v());
                        throw new qa.s(a10.toString());
                    }
                } else {
                    int L = aVar.L();
                    if (L == 0) {
                        z10 = false;
                    } else if (L != 1) {
                        StringBuilder a11 = e2.a("Invalid bitset value ", L, ", expected 0 or 1; at path ");
                        a11.append(aVar.C());
                        throw new qa.s(a11.toString());
                    }
                }
                if (z10) {
                    bitSet.set(i10);
                }
                i10++;
                h02 = aVar.h0();
            }
            aVar.k();
            return bitSet;
        }

        @Override // qa.x
        public final void b(ya.b bVar, BitSet bitSet) {
            BitSet bitSet2 = bitSet;
            bVar.b();
            int length = bitSet2.length();
            for (int i10 = 0; i10 < length; i10++) {
                bVar.F(bitSet2.get(i10) ? 1L : 0L);
            }
            bVar.k();
        }
    }

    /* loaded from: classes.dex */
    public class w extends qa.x<Boolean> {
        @Override // qa.x
        public final Boolean a(ya.a aVar) {
            int h02 = aVar.h0();
            if (h02 != 9) {
                return Boolean.valueOf(h02 == 6 ? Boolean.parseBoolean(aVar.b0()) : aVar.I());
            }
            aVar.X();
            return null;
        }

        @Override // qa.x
        public final void b(ya.b bVar, Boolean bool) {
            bVar.I(bool);
        }
    }

    /* loaded from: classes.dex */
    public class x extends qa.x<Boolean> {
        @Override // qa.x
        public final Boolean a(ya.a aVar) {
            if (aVar.h0() == 9) {
                aVar.X();
                return null;
            }
            return Boolean.valueOf(aVar.b0());
        }

        @Override // qa.x
        public final void b(ya.b bVar, Boolean bool) {
            Boolean bool2 = bool;
            bVar.L(bool2 == null ? "null" : bool2.toString());
        }
    }

    /* loaded from: classes.dex */
    public class y extends qa.x<Number> {
        @Override // qa.x
        public final Number a(ya.a aVar) {
            if (aVar.h0() == 9) {
                aVar.X();
                return null;
            }
            try {
                int L = aVar.L();
                if (L <= 255 && L >= -128) {
                    return Byte.valueOf((byte) L);
                }
                StringBuilder a10 = e2.a("Lossy conversion from ", L, " to byte; at path ");
                a10.append(aVar.C());
                throw new qa.s(a10.toString());
            } catch (NumberFormatException e10) {
                throw new qa.s(e10);
            }
        }

        @Override // qa.x
        public final void b(ya.b bVar, Number number) {
            Number number2 = number;
            if (number2 == null) {
                bVar.y();
            } else {
                bVar.F(number2.byteValue());
            }
        }
    }

    /* loaded from: classes.dex */
    public class z extends qa.x<Number> {
        @Override // qa.x
        public final Number a(ya.a aVar) {
            if (aVar.h0() == 9) {
                aVar.X();
                return null;
            }
            try {
                int L = aVar.L();
                if (L <= 65535 && L >= -32768) {
                    return Short.valueOf((short) L);
                }
                StringBuilder a10 = e2.a("Lossy conversion from ", L, " to short; at path ");
                a10.append(aVar.C());
                throw new qa.s(a10.toString());
            } catch (NumberFormatException e10) {
                throw new qa.s(e10);
            }
        }

        @Override // qa.x
        public final void b(ya.b bVar, Number number) {
            Number number2 = number;
            if (number2 == null) {
                bVar.y();
            } else {
                bVar.F(number2.shortValue());
            }
        }
    }

    static {
        w wVar = new w();
        f27917c = new x();
        f27918d = new ta.t(Boolean.TYPE, Boolean.class, wVar);
        f27919e = new ta.t(Byte.TYPE, Byte.class, new y());
        f27920f = new ta.t(Short.TYPE, Short.class, new z());
        f27921g = new ta.t(Integer.TYPE, Integer.class, new a0());
        f27922h = new ta.s(AtomicInteger.class, new qa.w(new b0()));
        f27923i = new ta.s(AtomicBoolean.class, new qa.w(new c0()));
        f27924j = new ta.s(AtomicIntegerArray.class, new qa.w(new a()));
        f27925k = new b();
        new c();
        new d();
        f27926l = new ta.t(Character.TYPE, Character.class, new e());
        f fVar = new f();
        f27927m = new g();
        f27928n = new h();
        f27929o = new i();
        f27930p = new ta.s(String.class, fVar);
        f27931q = new ta.s(StringBuilder.class, new j());
        f27932r = new ta.s(StringBuffer.class, new l());
        f27933s = new ta.s(URL.class, new m());
        f27934t = new ta.s(URI.class, new n());
        f27935u = new ta.v(InetAddress.class, new o());
        f27936v = new ta.s(UUID.class, new p());
        f27937w = new ta.s(Currency.class, new qa.w(new q()));
        f27938x = new ta.u(Calendar.class, GregorianCalendar.class, new C0497r());
        f27939y = new ta.s(Locale.class, new s());
        t tVar = new t();
        f27940z = tVar;
        A = new ta.v(qa.l.class, tVar);
        B = new u();
    }
}
