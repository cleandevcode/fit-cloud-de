package i2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.navigation.common.R;
import i2.d0;
import java.io.Serializable;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: c */
    public static final ThreadLocal<TypedValue> f16223c = new ThreadLocal<>();

    /* renamed from: a */
    public final Context f16224a;

    /* renamed from: b */
    public final j0 f16225b;

    /* loaded from: classes.dex */
    public static final class a {
        public static d0 a(TypedValue typedValue, d0 d0Var, d0 d0Var2, String str, String str2) {
            if (d0Var == null || d0Var == d0Var2) {
                return d0Var == null ? d0Var2 : d0Var;
            }
            throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
        }
    }

    public a0(Context context, j0 j0Var) {
        gm.l.f(context, "context");
        gm.l.f(j0Var, "navigatorProvider");
        this.f16224a = context;
        this.f16225b = j0Var;
    }

    public static i c(TypedArray typedArray, Resources resources, int i10) {
        d0 d0Var;
        Object[] objArr;
        boolean z10;
        d0 pVar;
        d0 d0Var2;
        d0 a10;
        float f10;
        d0 a11;
        int dimension;
        int i11;
        boolean z11;
        boolean z12;
        String str;
        d0 pVar2;
        boolean z13 = typedArray.getBoolean(R.styleable.NavArgument_nullable, false);
        ThreadLocal<TypedValue> threadLocal = f16223c;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(R.styleable.NavArgument_argType);
        if (string != null) {
            String resourcePackageName = resources.getResourcePackageName(i10);
            d0Var = d0.f16257b;
            if (!gm.l.a("integer", string)) {
                d0Var = d0.f16259d;
                if (!gm.l.a("integer[]", string)) {
                    d0Var = d0.f16260e;
                    if (!gm.l.a("long", string)) {
                        d0Var = d0.f16261f;
                        if (!gm.l.a("long[]", string)) {
                            d0Var = d0.f16264i;
                            if (!gm.l.a("boolean", string)) {
                                d0Var = d0.f16265j;
                                if (!gm.l.a("boolean[]", string)) {
                                    d0Var = d0.f16266k;
                                    if (!gm.l.a("string", string)) {
                                        d0 d0Var3 = d0.f16267l;
                                        if (!gm.l.a("string[]", string)) {
                                            d0Var3 = d0.f16262g;
                                            if (!gm.l.a("float", string)) {
                                                d0Var3 = d0.f16263h;
                                                if (!gm.l.a("float[]", string)) {
                                                    d0Var3 = d0.f16258c;
                                                    if (!gm.l.a("reference", string)) {
                                                        if (string.length() == 0) {
                                                            z12 = true;
                                                        } else {
                                                            z12 = false;
                                                        }
                                                        if (!z12) {
                                                            try {
                                                                if (om.h.a0(string, ".", false) && resourcePackageName != null) {
                                                                    str = resourcePackageName + string;
                                                                } else {
                                                                    str = string;
                                                                }
                                                                if (om.h.U(string, "[]", false)) {
                                                                    str = str.substring(0, str.length() - 2);
                                                                    gm.l.e(str, "this as java.lang.String…ing(startIndex, endIndex)");
                                                                    Class<?> cls = Class.forName(str);
                                                                    if (Parcelable.class.isAssignableFrom(cls)) {
                                                                        pVar2 = new d0.m(cls);
                                                                    } else {
                                                                        if (Serializable.class.isAssignableFrom(cls)) {
                                                                            pVar2 = new d0.o(cls);
                                                                        }
                                                                        throw new IllegalArgumentException(str + " is not Serializable or Parcelable.");
                                                                    }
                                                                    d0Var = pVar2;
                                                                } else {
                                                                    Class<?> cls2 = Class.forName(str);
                                                                    if (Parcelable.class.isAssignableFrom(cls2)) {
                                                                        pVar2 = new d0.n(cls2);
                                                                    } else if (Enum.class.isAssignableFrom(cls2)) {
                                                                        pVar2 = new d0.l(cls2);
                                                                    } else {
                                                                        if (Serializable.class.isAssignableFrom(cls2)) {
                                                                            pVar2 = new d0.p(cls2);
                                                                        }
                                                                        throw new IllegalArgumentException(str + " is not Serializable or Parcelable.");
                                                                    }
                                                                    d0Var = pVar2;
                                                                }
                                                            } catch (ClassNotFoundException e10) {
                                                                throw new RuntimeException(e10);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        d0Var = d0Var3;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            d0Var = null;
        }
        int i12 = R.styleable.NavArgument_android_defaultValue;
        if (typedArray.getValue(i12, typedValue)) {
            d0.i iVar = d0.f16258c;
            if (d0Var == iVar) {
                i11 = typedValue.resourceId;
                if (i11 == 0) {
                    if (typedValue.type == 16 && typedValue.data == 0) {
                        i11 = 0;
                    } else {
                        StringBuilder a12 = android.support.v4.media.d.a("unsupported value '");
                        a12.append((Object) typedValue.string);
                        a12.append("' for ");
                        a12.append(d0Var.b());
                        a12.append(". Must be a reference to a resource.");
                        throw new XmlPullParserException(a12.toString());
                    }
                }
            } else {
                int i13 = typedValue.resourceId;
                if (i13 != 0) {
                    if (d0Var == null) {
                        objArr = Integer.valueOf(i13);
                        d0Var = iVar;
                    } else {
                        StringBuilder a13 = android.support.v4.media.d.a("unsupported value '");
                        a13.append((Object) typedValue.string);
                        a13.append("' for ");
                        a13.append(d0Var.b());
                        a13.append(". You must use a \"");
                        throw new XmlPullParserException(androidx.activity.e.b(a13, "reference", "\" type to reference other resources."));
                    }
                } else if (d0Var == d0.f16266k) {
                    objArr = typedArray.getString(i12);
                } else {
                    int i14 = typedValue.type;
                    if (i14 != 3) {
                        if (i14 != 4) {
                            if (i14 != 5) {
                                if (i14 != 18) {
                                    if (i14 >= 16 && i14 <= 31) {
                                        d0.d dVar = d0.f16262g;
                                        if (d0Var == dVar) {
                                            a10 = a.a(typedValue, d0Var, dVar, string, "float");
                                            f10 = typedValue.data;
                                        } else {
                                            a11 = a.a(typedValue, d0Var, d0.f16257b, string, "integer");
                                            dimension = typedValue.data;
                                        }
                                    } else {
                                        StringBuilder a14 = android.support.v4.media.d.a("unsupported argument type ");
                                        a14.append(typedValue.type);
                                        throw new XmlPullParserException(a14.toString());
                                    }
                                } else {
                                    d0Var = a.a(typedValue, d0Var, d0.f16264i, string, "boolean");
                                    if (typedValue.data != 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    objArr = Boolean.valueOf(z11);
                                }
                            } else {
                                a11 = a.a(typedValue, d0Var, d0.f16257b, string, "dimension");
                                dimension = (int) typedValue.getDimension(resources.getDisplayMetrics());
                            }
                            d0Var = a11;
                            i11 = dimension;
                        } else {
                            a10 = a.a(typedValue, d0Var, d0.f16262g, string, "float");
                            f10 = typedValue.getFloat();
                        }
                        d0Var = a10;
                        objArr = Float.valueOf(f10);
                    } else {
                        String obj = typedValue.string.toString();
                        if (d0Var == null) {
                            gm.l.f(obj, "value");
                            try {
                                try {
                                    try {
                                        try {
                                            d0Var2 = d0.f16257b;
                                            d0Var2.c(obj);
                                        } catch (IllegalArgumentException unused) {
                                            d0Var2 = d0.f16264i;
                                            d0Var2.c(obj);
                                        }
                                    } catch (IllegalArgumentException unused2) {
                                        d0Var2 = d0.f16266k;
                                    }
                                } catch (IllegalArgumentException unused3) {
                                    d0Var2 = d0.f16260e;
                                    d0Var2.c(obj);
                                }
                            } catch (IllegalArgumentException unused4) {
                                d0Var2 = d0.f16262g;
                                d0Var2.c(obj);
                            }
                            d0Var = d0Var2;
                        }
                        objArr = d0Var.c(obj);
                    }
                }
            }
            objArr = Integer.valueOf(i11);
        } else {
            objArr = null;
        }
        if (objArr != null) {
            z10 = true;
        } else {
            objArr = null;
            z10 = false;
        }
        if (d0Var == null) {
            d0Var = null;
        }
        if (d0Var == null) {
            if (objArr instanceof Integer) {
                d0Var = d0.f16257b;
            } else if (objArr instanceof int[]) {
                d0Var = d0.f16259d;
            } else if (objArr instanceof Long) {
                d0Var = d0.f16260e;
            } else if (objArr instanceof long[]) {
                d0Var = d0.f16261f;
            } else if (objArr instanceof Float) {
                d0Var = d0.f16262g;
            } else if (objArr instanceof float[]) {
                d0Var = d0.f16263h;
            } else if (objArr instanceof Boolean) {
                d0Var = d0.f16264i;
            } else if (objArr instanceof boolean[]) {
                d0Var = d0.f16265j;
            } else if (!(objArr instanceof String) && objArr != null) {
                if ((objArr instanceof Object[]) && (objArr instanceof String[])) {
                    d0Var = d0.f16267l;
                } else {
                    if (objArr.getClass().isArray()) {
                        Class<?> componentType = objArr.getClass().getComponentType();
                        gm.l.c(componentType);
                        if (Parcelable.class.isAssignableFrom(componentType)) {
                            Class<?> componentType2 = objArr.getClass().getComponentType();
                            if (componentType2 != null) {
                                pVar = new d0.m(componentType2);
                                d0Var = pVar;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                            }
                        }
                    }
                    if (objArr.getClass().isArray()) {
                        Class<?> componentType3 = objArr.getClass().getComponentType();
                        gm.l.c(componentType3);
                        if (Serializable.class.isAssignableFrom(componentType3)) {
                            Class<?> componentType4 = objArr.getClass().getComponentType();
                            if (componentType4 != null) {
                                pVar = new d0.o(componentType4);
                                d0Var = pVar;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                            }
                        }
                    }
                    if (objArr instanceof Parcelable) {
                        pVar = new d0.n(objArr.getClass());
                    } else if (objArr instanceof Enum) {
                        pVar = new d0.l(objArr.getClass());
                    } else if (objArr instanceof Serializable) {
                        pVar = new d0.p(objArr.getClass());
                    } else {
                        StringBuilder a15 = android.support.v4.media.d.a("Object of type ");
                        a15.append(objArr.getClass().getName());
                        a15.append(" is not supported for navigation arguments.");
                        throw new IllegalArgumentException(a15.toString());
                    }
                    d0Var = pVar;
                }
            } else {
                d0Var = d0.f16266k;
            }
        }
        return new i(d0Var, z13, objArr, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:244:0x0202, code lost:
        if (r8.isEmpty() != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0204, code lost:
        r9.f16276c = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0206, code lost:
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x020a, code lost:
        if ((!(r3 instanceof i2.b.a)) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x020c, code lost:
        if (r13 == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x020e, code lost:
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0210, code lost:
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0211, code lost:
        if (r14 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0213, code lost:
        r3.f16408f.e(r13, r9);
        r6.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0227, code lost:
        throw new java.lang.IllegalArgumentException("Cannot have an action with actionId 0".toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x024b, code lost:
        throw new java.lang.UnsupportedOperationException("Cannot add action " + r13 + " to " + r3 + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x028e, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final i2.v a(android.content.res.Resources r27, android.content.res.XmlResourceParser r28, android.util.AttributeSet r29, int r30) {
        /*
            Method dump skipped, instructions count: 655
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.a0.a(android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, int):i2.v");
    }

    @SuppressLint({"ResourceType"})
    public final x b(int i10) {
        int next;
        Resources resources = this.f16224a.getResources();
        XmlResourceParser xml = resources.getXml(i10);
        gm.l.e(xml, "res.getXml(graphResId)");
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e10) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i10) + " line " + xml.getLineNumber(), e10);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            gm.l.e(asAttributeSet, "attrs");
            v a10 = a(resources, xml, asAttributeSet, i10);
            if (a10 instanceof x) {
                return (x) a10;
            }
            throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
        }
        throw new XmlPullParserException("No start tag found");
    }
}
