package a1;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import z0.d;

/* loaded from: classes.dex */
public class j extends h {

    /* renamed from: f */
    public final Class<?> f233f;

    /* renamed from: g */
    public final Constructor<?> f234g;

    /* renamed from: h */
    public final Method f235h;

    /* renamed from: i */
    public final Method f236i;

    /* renamed from: j */
    public final Method f237j;

    /* renamed from: k */
    public final Method f238k;

    /* renamed from: l */
    public final Method f239l;

    public j() {
        Method method;
        Method method2;
        Constructor<?> constructor;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            method3 = m(cls2);
            method4 = n(cls2);
            method5 = cls2.getMethod("freeze", new Class[0]);
            method2 = cls2.getMethod("abortCreation", new Class[0]);
            method = o(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            StringBuilder a10 = android.support.v4.media.d.a("Unable to collect necessary methods for class ");
            a10.append(e10.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", a10.toString(), e10);
            method = null;
            method2 = null;
            constructor = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f233f = cls;
        this.f234g = constructor;
        this.f235h = method3;
        this.f236i = method4;
        this.f237j = method5;
        this.f238k = method2;
        this.f239l = method;
    }

    public static Method m(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public static Method n(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    @Override // a1.h, a1.n
    public final Typeface a(Context context, d.c cVar, Resources resources, int i10) {
        Object obj;
        d.C0604d[] c0604dArr;
        if (!l()) {
            return super.a(context, cVar, resources, i10);
        }
        try {
            obj = this.f234g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (d.C0604d c0604d : cVar.f31843a) {
            if (!i(context, obj, c0604d.f31844a, c0604d.f31848e, c0604d.f31845b, c0604d.f31846c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c0604d.f31847d))) {
                try {
                    this.f238k.invoke(obj, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
                return null;
            }
        }
        if (!k(obj)) {
            return null;
        }
        return j(obj);
    }

    /* JADX WARN: Type inference failed for: r15v2, types: [android.graphics.Typeface$Builder] */
    @Override // a1.h, a1.n
    public final Typeface b(Context context, g1.m[] mVarArr, int i10) {
        Object obj;
        Typeface j10;
        boolean z10;
        if (mVarArr.length < 1) {
            return null;
        }
        if (!l()) {
            g1.m f10 = f(i10, mVarArr);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(f10.f14832a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Object(openFileDescriptor.getFileDescriptor()) { // from class: android.graphics.Typeface$Builder
                    static {
                        throw new NoClassDefFoundError();
                    }

                    public native /* synthetic */ Typeface build();

                    public native /* synthetic */ Typeface$Builder setItalic(boolean z11);

                    public native /* synthetic */ Typeface$Builder setWeight(int i11);
                }.setWeight(f10.f14834c).setItalic(f10.f14835d).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (g1.m mVar : mVarArr) {
            if (mVar.f14836e == 0) {
                Uri uri = mVar.f14832a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, o.e(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        try {
            obj = this.f234g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused2) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        boolean z11 = false;
        for (g1.m mVar2 : mVarArr) {
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(mVar2.f14832a);
            if (byteBuffer != null) {
                try {
                    z10 = ((Boolean) this.f236i.invoke(obj, byteBuffer, Integer.valueOf(mVar2.f14833b), null, Integer.valueOf(mVar2.f14834c), Integer.valueOf(mVar2.f14835d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused3) {
                    z10 = false;
                }
                if (!z10) {
                    try {
                        this.f238k.invoke(obj, new Object[0]);
                    } catch (IllegalAccessException | InvocationTargetException unused4) {
                    }
                    return null;
                }
                z11 = true;
            }
        }
        if (!z11) {
            try {
                this.f238k.invoke(obj, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused5) {
            }
            return null;
        } else if (!k(obj) || (j10 = j(obj)) == null) {
            return null;
        } else {
            return Typeface.create(j10, i10);
        }
    }

    @Override // a1.n
    public final Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        Object obj;
        if (!l()) {
            return super.d(context, resources, i10, str, i11);
        }
        try {
            obj = this.f234g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        if (!i(context, obj, str, 0, -1, -1, null)) {
            try {
                this.f238k.invoke(obj, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
            return null;
        } else if (!k(obj)) {
            return null;
        } else {
            return j(obj);
        }
    }

    public final boolean i(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f235h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface j(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f233f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f239l.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean k(Object obj) {
        try {
            return ((Boolean) this.f237j.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean l() {
        if (this.f235h == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f235h != null;
    }

    public Method o(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
