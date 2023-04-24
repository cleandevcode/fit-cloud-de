package a1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import z0.d;

/* loaded from: classes.dex */
public final class i extends n {

    /* renamed from: a */
    public static final Class<?> f229a;

    /* renamed from: b */
    public static final Constructor<?> f230b;

    /* renamed from: c */
    public static final Method f231c;

    /* renamed from: d */
    public static final Method f232d;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi24Impl", e10.getClass().getName(), e10);
            cls = null;
            method = null;
            method2 = null;
        }
        f230b = constructor;
        f229a = cls;
        f231c = method2;
        f232d = method;
    }

    public static boolean g(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z10) {
        try {
            return ((Boolean) f231c.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // a1.n
    public final Typeface a(Context context, d.c cVar, Resources resources, int i10) {
        Object obj;
        d.C0604d[] c0604dArr;
        MappedByteBuffer mappedByteBuffer;
        try {
            obj = f230b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (d.C0604d c0604d : cVar.f31843a) {
            int i11 = c0604d.f31849f;
            File d10 = o.d(context);
            if (d10 != null) {
                try {
                    if (o.b(d10, resources, i11)) {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(d10);
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                            } finally {
                                break;
                            }
                        } catch (IOException unused2) {
                            mappedByteBuffer = null;
                        }
                        if (mappedByteBuffer != null || !g(obj, mappedByteBuffer, c0604d.f31848e, c0604d.f31845b, c0604d.f31846c)) {
                            return null;
                        }
                    }
                } finally {
                    d10.delete();
                }
            }
            mappedByteBuffer = null;
            if (mappedByteBuffer != null) {
                return null;
            }
        }
        try {
            Object newInstance = Array.newInstance(f229a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f232d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused3) {
            return null;
        }
    }

    @Override // a1.n
    public final Typeface b(Context context, g1.m[] mVarArr, int i10) {
        Object obj;
        Typeface typeface;
        try {
            obj = f230b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        o0.h hVar = new o0.h();
        for (g1.m mVar : mVarArr) {
            Uri uri = mVar.f14832a;
            ByteBuffer byteBuffer = (ByteBuffer) hVar.getOrDefault(uri, null);
            if (byteBuffer == null) {
                byteBuffer = o.e(context, uri);
                hVar.put(uri, byteBuffer);
            }
            if (byteBuffer == null || !g(obj, byteBuffer, mVar.f14833b, mVar.f14834c, mVar.f14835d)) {
                return null;
            }
        }
        try {
            Object newInstance = Array.newInstance(f229a, 1);
            Array.set(newInstance, 0, obj);
            typeface = (Typeface) f232d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused2) {
            typeface = null;
        }
        if (typeface == null) {
            return null;
        }
        return Typeface.create(typeface, i10);
    }
}
