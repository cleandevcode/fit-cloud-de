package j4;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a0 implements Comparable<a0> {

    /* renamed from: a */
    public final n4.c f17298a;

    /* renamed from: b */
    public final boolean f17299b;

    /* renamed from: c */
    public int f17300c;

    /* renamed from: d */
    public final String f17301d;

    /* renamed from: e */
    public String f17302e;

    /* renamed from: f */
    public String f17303f;

    /* renamed from: g */
    public j f17304g;

    /* renamed from: h */
    public String f17305h;

    /* renamed from: i */
    public boolean f17306i;

    /* renamed from: j */
    public boolean f17307j;

    /* renamed from: k */
    public boolean f17308k;

    /* renamed from: l */
    public boolean f17309l = false;

    /* renamed from: m */
    public boolean f17310m;

    /* renamed from: n */
    public boolean f17311n;

    /* renamed from: o */
    public a f17312o;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final t0 f17313a;

        /* renamed from: b */
        public final Class<?> f17314b;

        public a(t0 t0Var, Class<?> cls) {
            this.f17313a = t0Var;
            this.f17314b = cls;
        }
    }

    public a0(Class<?> cls, n4.c cVar) {
        boolean z10;
        e1[] serialzeFeatures;
        f4.d dVar;
        e1[] serialzeFeatures2;
        boolean z11 = false;
        this.f17306i = false;
        this.f17307j = false;
        this.f17308k = false;
        this.f17310m = false;
        this.f17298a = cVar;
        this.f17304g = new j(cls, cVar);
        if (cls != null && (dVar = (f4.d) n4.n.x(cls, f4.d.class)) != null) {
            for (e1 e1Var : dVar.serialzeFeatures()) {
                if (e1Var == e1.WriteEnumUsingToString) {
                    this.f17306i = true;
                } else if (e1Var == e1.WriteEnumUsingName) {
                    this.f17307j = true;
                } else if (e1Var == e1.DisableCircularReferenceDetect) {
                    this.f17308k = true;
                } else {
                    e1 e1Var2 = e1.BrowserCompatible;
                    if (e1Var == e1Var2) {
                        this.f17300c |= e1Var2.f17396a;
                        this.f17311n = true;
                    } else {
                        e1 e1Var3 = e1.WriteMapNullValue;
                        if (e1Var == e1Var3) {
                            this.f17300c |= e1Var3.f17396a;
                        }
                    }
                }
            }
        }
        AccessibleObject accessibleObject = cVar.f21948b;
        n4.n.g0(accessibleObject == null ? cVar.f21949c : accessibleObject);
        StringBuilder sb2 = new StringBuilder();
        sb2.append('\"');
        this.f17301d = androidx.activity.e.b(sb2, cVar.f21947a, "\":");
        f4.b d10 = cVar.d();
        if (d10 != null) {
            e1[] serialzeFeatures3 = d10.serialzeFeatures();
            int length = serialzeFeatures3.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    if ((serialzeFeatures3[i10].f17396a & e1.E) != 0) {
                        z10 = true;
                        break;
                    }
                    i10++;
                } else {
                    z10 = false;
                    break;
                }
            }
            String format = d10.format();
            this.f17305h = format;
            if (format.trim().length() == 0) {
                this.f17305h = null;
            }
            for (e1 e1Var4 : d10.serialzeFeatures()) {
                if (e1Var4 == e1.WriteEnumUsingToString) {
                    this.f17306i = true;
                } else if (e1Var4 == e1.WriteEnumUsingName) {
                    this.f17307j = true;
                } else if (e1Var4 == e1.DisableCircularReferenceDetect) {
                    this.f17308k = true;
                } else if (e1Var4 == e1.BrowserCompatible) {
                    this.f17311n = true;
                }
            }
            this.f17300c = e1.e(d10.serialzeFeatures()) | this.f17300c;
        } else {
            z10 = false;
        }
        this.f17299b = z10;
        this.f17310m = (n4.n.T(cVar.f21948b) || n4.n.S(cVar.f21948b)) ? true : true;
    }

    public final Object a(Object obj) {
        Object obj2;
        n4.c cVar = this.f17298a;
        Method method = cVar.f21948b;
        if (method != null) {
            obj2 = method.invoke(obj, new Object[0]);
        } else {
            obj2 = cVar.f21949c.get(obj);
        }
        if (this.f17305h != null && obj2 != null) {
            Class<?> cls = this.f17298a.f21951e;
            if (cls == Date.class || cls == java.sql.Date.class) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.f17305h, e4.a.f13340b);
                simpleDateFormat.setTimeZone(e4.a.f13339a);
                return simpleDateFormat.format(obj2);
            }
            return obj2;
        }
        return obj2;
    }

    public final Object c(Object obj) {
        Object obj2;
        n4.c cVar = this.f17298a;
        Method method = cVar.f21948b;
        boolean z10 = false;
        if (method != null) {
            obj2 = method.invoke(obj, new Object[0]);
        } else {
            obj2 = cVar.f21949c.get(obj);
        }
        if (this.f17310m) {
            if (obj2 == null) {
                Pattern pattern = n4.n.f22012a;
            } else {
                if (n4.n.f22028q == null && !n4.n.f22029r) {
                    try {
                        n4.n.f22028q = Class.forName("org.hibernate.Hibernate").getMethod("isInitialized", Object.class);
                    } catch (Throwable unused) {
                        n4.n.f22029r = true;
                    }
                }
                Method method2 = n4.n.f22028q;
                if (method2 != null) {
                    try {
                        z10 = ((Boolean) method2.invoke(null, obj2)).booleanValue();
                    } catch (Throwable unused2) {
                    }
                }
                z10 = true;
            }
            if (!z10) {
                return null;
            }
        }
        return obj2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(a0 a0Var) {
        return this.f17298a.compareTo(a0Var.f17298a);
    }

    public final void d(i0 i0Var) {
        String str;
        d1 d1Var = i0Var.f17406j;
        if (d1Var.f17358f) {
            if (e1.c(d1Var.f17355c, this.f17298a.f21955i, e1.UseSingleQuotes)) {
                if (this.f17302e == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append('\'');
                    this.f17302e = androidx.activity.e.b(sb2, this.f17298a.f21947a, "':");
                }
                str = this.f17302e;
            } else {
                str = this.f17301d;
            }
        } else {
            if (this.f17303f == null) {
                this.f17303f = androidx.activity.e.b(new StringBuilder(), this.f17298a.f21947a, ":");
            }
            str = this.f17303f;
        }
        d1Var.write(str);
    }

    public final void e(i0 i0Var, Object obj) {
        int i10;
        t0 t0Var;
        Class<?> cls;
        Class<?> cls2;
        t0 t0Var2;
        if (this.f17312o == null) {
            if (obj == null) {
                cls2 = this.f17298a.f21951e;
                if (cls2 == Byte.TYPE) {
                    cls2 = Byte.class;
                } else if (cls2 == Short.TYPE) {
                    cls2 = Short.class;
                } else if (cls2 == Integer.TYPE) {
                    cls2 = Integer.class;
                } else if (cls2 == Long.TYPE) {
                    cls2 = Long.class;
                } else if (cls2 == Float.TYPE) {
                    cls2 = Float.class;
                } else if (cls2 == Double.TYPE) {
                    cls2 = Double.class;
                } else if (cls2 == Boolean.TYPE) {
                    cls2 = Boolean.class;
                }
            } else {
                cls2 = obj.getClass();
            }
            t0 t0Var3 = null;
            f4.b d10 = this.f17298a.d();
            if (d10 != null && d10.serializeUsing() != Void.class) {
                t0Var2 = (t0) d10.serializeUsing().newInstance();
                this.f17309l = true;
            } else {
                String str = this.f17305h;
                if (str != null) {
                    if (cls2 != Double.TYPE && cls2 != Double.class) {
                        if (cls2 == Float.TYPE || cls2 == Float.class) {
                            t0Var3 = new b0(str);
                        }
                    } else {
                        t0Var3 = new x(str);
                    }
                }
                if (t0Var3 == null) {
                    t0Var2 = i0Var.l(cls2);
                } else {
                    t0Var2 = t0Var3;
                }
            }
            this.f17312o = new a(t0Var2, cls2);
        }
        a aVar = this.f17312o;
        if (this.f17308k) {
            i10 = this.f17298a.f21955i | e1.DisableCircularReferenceDetect.f17396a;
        } else {
            i10 = this.f17298a.f21955i;
        }
        int i11 = i10 | this.f17300c;
        if (obj == null) {
            d1 d1Var = i0Var.f17406j;
            if (this.f17298a.f21951e == Object.class && d1Var.k(e1.E)) {
                d1Var.R();
                return;
            }
            Class<?> cls3 = aVar.f17314b;
            if (Number.class.isAssignableFrom(cls3)) {
                d1Var.W(this.f17300c, e1.WriteNullNumberAsZero.f17396a);
                return;
            } else if (String.class == cls3) {
                d1Var.W(this.f17300c, e1.WriteNullStringAsEmpty.f17396a);
                return;
            } else if (Boolean.class == cls3) {
                d1Var.W(this.f17300c, e1.WriteNullBooleanAsFalse.f17396a);
                return;
            } else if (!Collection.class.isAssignableFrom(cls3) && !cls3.isArray()) {
                t0 t0Var4 = aVar.f17313a;
                if (d1Var.k(e1.E) && (t0Var4 instanceof j0)) {
                    d1Var.R();
                    return;
                }
                n4.c cVar = this.f17298a;
                t0Var4.e(i0Var, null, cVar.f21947a, cVar.f21952f, i11);
                return;
            } else {
                d1Var.W(this.f17300c, e1.WriteNullListAsEmpty.f17396a);
                return;
            }
        }
        if (this.f17298a.f21960n) {
            if (this.f17307j) {
                i0Var.f17406j.Z(((Enum) obj).name());
                return;
            } else if (this.f17306i) {
                i0Var.f17406j.Z(((Enum) obj).toString());
                return;
            }
        }
        Class<?> cls4 = obj.getClass();
        if (cls4 != aVar.f17314b && !this.f17309l) {
            t0Var = i0Var.l(cls4);
        } else {
            t0Var = aVar.f17313a;
        }
        t0 t0Var5 = t0Var;
        String str2 = this.f17305h;
        if (str2 != null && !(t0Var5 instanceof x) && !(t0Var5 instanceof b0)) {
            if (t0Var5 instanceof u) {
                ((u) t0Var5).c(i0Var, obj, this.f17304g);
                return;
            } else {
                i0Var.x(obj, str2);
                return;
            }
        }
        n4.c cVar2 = this.f17298a;
        if (cVar2.f21962p) {
            if (t0Var5 instanceof j0) {
                ((j0) t0Var5).o(i0Var, obj, cVar2.f21947a, cVar2.f21952f, i11, true);
                return;
            } else if (t0Var5 instanceof p0) {
                ((p0) t0Var5).i(i0Var, obj, cVar2.f21947a, cVar2.f21952f, i11, true);
                return;
            }
        }
        if ((this.f17300c & e1.WriteClassName.f17396a) != 0 && cls4 != cVar2.f21951e && (t0Var5 instanceof j0)) {
            ((j0) t0Var5).o(i0Var, obj, cVar2.f21947a, cVar2.f21952f, i11, false);
            return;
        }
        if (this.f17311n && ((cls = cVar2.f21951e) == Long.TYPE || cls == Long.class)) {
            long longValue = ((Long) obj).longValue();
            if (longValue > 9007199254740991L || longValue < -9007199254740991L) {
                i0Var.f17406j.Z(Long.toString(longValue));
                return;
            }
        }
        n4.c cVar3 = this.f17298a;
        t0Var5.e(i0Var, obj, cVar3.f21947a, cVar3.f21952f, i11);
    }
}
