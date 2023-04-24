package j4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes.dex */
public final class i0 extends c1 {

    /* renamed from: i */
    public final a1 f17405i;

    /* renamed from: j */
    public final d1 f17406j;

    /* renamed from: k */
    public int f17407k;

    /* renamed from: l */
    public String f17408l;

    /* renamed from: m */
    public SimpleDateFormat f17409m;

    /* renamed from: n */
    public IdentityHashMap<Object, y0> f17410n;

    /* renamed from: o */
    public y0 f17411o;

    /* renamed from: p */
    public TimeZone f17412p;

    /* renamed from: q */
    public Locale f17413q;

    public i0() {
        this(new d1(), a1.f17315i);
    }

    public i0(d1 d1Var, a1 a1Var) {
        this.f17407k = 0;
        this.f17408l = "\t";
        this.f17410n = null;
        this.f17412p = e4.a.f13339a;
        this.f17413q = e4.a.f13340b;
        this.f17406j = d1Var;
        this.f17405i = a1Var;
    }

    public final boolean i(Object obj) {
        y0 y0Var;
        IdentityHashMap<Object, y0> identityHashMap = this.f17410n;
        if (identityHashMap == null || (y0Var = identityHashMap.get(obj)) == null || obj == Collections.emptyMap()) {
            return false;
        }
        Object obj2 = y0Var.f17477c;
        return obj2 == null || (obj2 instanceof Integer) || (obj2 instanceof String);
    }

    public final SimpleDateFormat j(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, this.f17413q);
        simpleDateFormat.setTimeZone(this.f17412p);
        return simpleDateFormat;
    }

    public final String k() {
        SimpleDateFormat simpleDateFormat = this.f17409m;
        if (simpleDateFormat instanceof SimpleDateFormat) {
            return simpleDateFormat.toPattern();
        }
        return null;
    }

    public final t0 l(Class<?> cls) {
        return this.f17405i.e(cls);
    }

    public final d1 m() {
        return this.f17406j;
    }

    public final boolean n(e1 e1Var) {
        return this.f17406j.q(e1Var);
    }

    public final boolean o(Type type) {
        y0 y0Var;
        return this.f17406j.q(e1.WriteClassName) && !(type == null && this.f17406j.q(e1.NotWriteRootClassName) && ((y0Var = this.f17411o) == null || y0Var.f17475a == null));
    }

    public final void p() {
        this.f17406j.write(10);
        for (int i10 = 0; i10 < this.f17407k; i10++) {
            this.f17406j.write(this.f17408l);
        }
    }

    public final void q(y0 y0Var, Object obj, Object obj2) {
        r(y0Var, obj, obj2, 0, 0);
    }

    public final void r(y0 y0Var, Object obj, Object obj2, int i10, int i11) {
        if (this.f17406j.f17360h) {
            return;
        }
        this.f17411o = new y0(y0Var, obj, obj2, i10);
        if (this.f17410n == null) {
            this.f17410n = new IdentityHashMap<>();
        }
        this.f17410n.put(obj, this.f17411o);
    }

    public final void s(Object obj) {
        if (obj == null) {
            this.f17406j.R();
            return;
        }
        try {
            l(obj.getClass()).e(this, obj, null, null, 0);
        } catch (IOException e10) {
            throw new e4.d(e10.getMessage(), e10);
        }
    }

    public final void t(String str) {
        d1 d1Var = this.f17406j;
        if (str == null) {
            d1Var.X(e1.WriteNullStringAsEmpty);
        } else {
            d1Var.Z(str);
        }
    }

    public final String toString() {
        return this.f17406j.toString();
    }

    public final void u() {
        this.f17406j.R();
    }

    public final void v(Object obj) {
        d1 d1Var;
        String str;
        d1 d1Var2;
        String str2;
        y0 y0Var = this.f17411o;
        if (obj == y0Var.f17476b) {
            d1Var2 = this.f17406j;
            str2 = "{\"$ref\":\"@\"}";
        } else {
            y0 y0Var2 = y0Var.f17475a;
            if (y0Var2 == null || obj != y0Var2.f17476b) {
                while (true) {
                    y0 y0Var3 = y0Var.f17475a;
                    if (y0Var3 == null) {
                        break;
                    }
                    y0Var = y0Var3;
                }
                if (obj == y0Var.f17476b) {
                    d1Var = this.f17406j;
                    str = "{\"$ref\":\"$\"}";
                } else {
                    this.f17406j.write("{\"$ref\":\"");
                    this.f17406j.write(this.f17410n.get(obj).toString());
                    d1Var = this.f17406j;
                    str = "\"}";
                }
                d1Var.write(str);
                return;
            }
            d1Var2 = this.f17406j;
            str2 = "{\"$ref\":\"..\"}";
        }
        d1Var2.write(str2);
    }

    public final void w(Object obj, Integer num) {
        try {
            if (obj == null) {
                this.f17406j.R();
            } else {
                l(obj.getClass()).e(this, obj, num, null, 0);
            }
        } catch (IOException e10) {
            throw new e4.d(e10.getMessage(), e10);
        }
    }

    public final void x(Object obj, String str) {
        GZIPOutputStream gZIPOutputStream;
        String replaceAll;
        if (obj instanceof Date) {
            if ("unixtime".equals(str)) {
                this.f17406j.L((int) (((Date) obj).getTime() / 1000));
            } else if ("millis".equals(str)) {
                this.f17406j.P(((Date) obj).getTime());
            } else {
                SimpleDateFormat simpleDateFormat = this.f17409m;
                SimpleDateFormat simpleDateFormat2 = this.f17409m;
                if (simpleDateFormat2 == null) {
                    if (str != null) {
                        try {
                            simpleDateFormat2 = j(str);
                        } catch (IllegalArgumentException unused) {
                            replaceAll = str.replaceAll("T", "'T'");
                        }
                    } else {
                        replaceAll = e4.a.f13343e;
                    }
                    simpleDateFormat2 = j(replaceAll);
                }
                this.f17406j.Z(simpleDateFormat2.format((Date) obj));
            }
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (!"gzip".equals(str) && !"gzip,base64".equals(str)) {
                if ("hex".equals(str)) {
                    this.f17406j.J(bArr);
                    return;
                } else {
                    this.f17406j.s(bArr);
                    return;
                }
            }
            GZIPOutputStream gZIPOutputStream2 = null;
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    if (bArr.length < 512) {
                        gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream, bArr.length);
                    } else {
                        gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    }
                    gZIPOutputStream2 = gZIPOutputStream;
                    gZIPOutputStream2.write(bArr);
                    gZIPOutputStream2.finish();
                    this.f17406j.s(byteArrayOutputStream.toByteArray());
                } finally {
                    n4.g.a(gZIPOutputStream2);
                }
            } catch (IOException e10) {
                throw new e4.d("write gzipBytes error", e10);
            }
        } else if (obj instanceof Collection) {
            Collection collection = (Collection) obj;
            Iterator it = collection.iterator();
            this.f17406j.write(91);
            for (int i10 = 0; i10 < collection.size(); i10++) {
                Object next = it.next();
                if (i10 != 0) {
                    this.f17406j.write(44);
                }
                x(next, str);
            }
            this.f17406j.write(93);
        } else {
            s(obj);
        }
    }

    public i0(d1 d1Var) {
        this(d1Var, a1.f17315i);
    }
}
