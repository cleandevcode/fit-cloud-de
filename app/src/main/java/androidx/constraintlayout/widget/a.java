package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import s.c0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public boolean f1992a;

    /* renamed from: b */
    public String f1993b;

    /* renamed from: c */
    public int f1994c;

    /* renamed from: d */
    public int f1995d;

    /* renamed from: e */
    public float f1996e;

    /* renamed from: f */
    public String f1997f;

    /* renamed from: g */
    public boolean f1998g;

    /* renamed from: h */
    public int f1999h;

    public a(a aVar, Object obj) {
        this.f1992a = false;
        this.f1993b = aVar.f1993b;
        this.f1994c = aVar.f1994c;
        c(obj);
    }

    public a(String str, int i10, Object obj, boolean z10) {
        this.f1993b = str;
        this.f1994c = i10;
        this.f1992a = z10;
        c(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        int resourceId;
        int i10;
        Object string;
        float dimension;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R.styleable.CustomAttribute);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        int i11 = 0;
        boolean z10 = false;
        for (int i12 = 0; i12 < indexCount; i12++) {
            int index = obtainStyledAttributes.getIndex(i12);
            int i13 = 1;
            if (index == R.styleable.CustomAttribute_attributeName) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == R.styleable.CustomAttribute_methodName) {
                str = obtainStyledAttributes.getString(index);
                z10 = true;
            } else if (index == R.styleable.CustomAttribute_customBoolean) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i11 = 6;
            } else {
                if (index == R.styleable.CustomAttribute_customColorValue) {
                    i13 = 3;
                } else if (index == R.styleable.CustomAttribute_customColorDrawableValue) {
                    i13 = 4;
                } else {
                    if (index == R.styleable.CustomAttribute_customPixelDimension) {
                        dimension = TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                    } else if (index == R.styleable.CustomAttribute_customDimension) {
                        dimension = obtainStyledAttributes.getDimension(index, 0.0f);
                    } else {
                        if (index == R.styleable.CustomAttribute_customFloatValue) {
                            i10 = 2;
                            string = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                        } else {
                            if (index == R.styleable.CustomAttribute_customIntegerValue) {
                                resourceId = obtainStyledAttributes.getInteger(index, -1);
                            } else if (index == R.styleable.CustomAttribute_customStringValue) {
                                i10 = 5;
                                string = obtainStyledAttributes.getString(index);
                            } else if (index == R.styleable.CustomAttribute_customReference) {
                                i13 = 8;
                                resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                if (resourceId == -1) {
                                    resourceId = obtainStyledAttributes.getInt(index, -1);
                                }
                            }
                            string = Integer.valueOf(resourceId);
                            i10 = i13;
                        }
                        Object obj2 = string;
                        i11 = i10;
                        obj = obj2;
                    }
                    obj = Float.valueOf(dimension);
                    i11 = 7;
                }
                resourceId = obtainStyledAttributes.getColor(index, 0);
                string = Integer.valueOf(resourceId);
                i10 = i13;
                Object obj22 = string;
                i11 = i10;
                obj = obj22;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new a(str, i11, obj, z10));
        }
        obtainStyledAttributes.recycle();
    }

    public static void b(View view, HashMap<String, a> hashMap) {
        String str;
        StringBuilder sb2;
        Class<?> cls = view.getClass();
        for (String str2 : hashMap.keySet()) {
            a aVar = hashMap.get(str2);
            if (!aVar.f1992a) {
                str = a.b.b("set", str2);
            } else {
                str = str2;
            }
            try {
            } catch (IllegalAccessException e10) {
                e = e10;
                sb2 = new StringBuilder();
                sb2.append(" Custom Attribute \"");
                sb2.append(str2);
                sb2.append("\" not found on ");
                sb2.append(cls.getName());
                Log.e("TransitionLayout", sb2.toString());
                e.printStackTrace();
            } catch (NoSuchMethodException e11) {
                Log.e("TransitionLayout", e11.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                StringBuilder sb3 = new StringBuilder();
                sb3.append(cls.getName());
                sb3.append(" must have a method ");
                sb3.append(str);
                Log.e("TransitionLayout", sb3.toString());
            } catch (InvocationTargetException e12) {
                e = e12;
                sb2 = new StringBuilder();
                sb2.append(" Custom Attribute \"");
                sb2.append(str2);
                sb2.append("\" not found on ");
                sb2.append(cls.getName());
                Log.e("TransitionLayout", sb2.toString());
                e.printStackTrace();
            }
            switch (c0.b(aVar.f1994c)) {
                case 0:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f1995d));
                    continue;
                case 1:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(aVar.f1996e));
                    continue;
                case 2:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f1999h));
                    continue;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(aVar.f1999h);
                    method.invoke(view, colorDrawable);
                    continue;
                case 4:
                    cls.getMethod(str, CharSequence.class).invoke(view, aVar.f1997f);
                    continue;
                case 5:
                    cls.getMethod(str, Boolean.TYPE).invoke(view, Boolean.valueOf(aVar.f1998g));
                    continue;
                case 6:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(aVar.f1996e));
                    continue;
                case 7:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f1995d));
                    continue;
                default:
                    continue;
            }
            Log.e("TransitionLayout", e11.getMessage());
            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
            StringBuilder sb32 = new StringBuilder();
            sb32.append(cls.getName());
            sb32.append(" must have a method ");
            sb32.append(str);
            Log.e("TransitionLayout", sb32.toString());
        }
    }

    public final void c(Object obj) {
        switch (c0.b(this.f1994c)) {
            case 0:
            case 7:
                this.f1995d = ((Integer) obj).intValue();
                return;
            case 1:
            case 6:
                this.f1996e = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.f1999h = ((Integer) obj).intValue();
                return;
            case 4:
                this.f1997f = (String) obj;
                return;
            case 5:
                this.f1998g = ((Boolean) obj).booleanValue();
                return;
            default:
                return;
        }
    }
}
