package a1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import z0.d;

/* loaded from: classes.dex */
public class h extends n {

    /* renamed from: a */
    public static Class<?> f224a = null;

    /* renamed from: b */
    public static Constructor<?> f225b = null;

    /* renamed from: c */
    public static Method f226c = null;

    /* renamed from: d */
    public static Method f227d = null;

    /* renamed from: e */
    public static boolean f228e = false;

    public static boolean g(int i10, Object obj, String str, boolean z10) {
        h();
        try {
            return ((Boolean) f226c.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void h() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f228e) {
            return;
        }
        f228e = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
            method = null;
            cls = null;
            method2 = null;
        }
        f225b = constructor;
        f224a = cls;
        f226c = method2;
        f227d = method;
    }

    @Override // a1.n
    public Typeface a(Context context, d.c cVar, Resources resources, int i10) {
        d.C0604d[] c0604dArr;
        h();
        try {
            Object newInstance = f225b.newInstance(new Object[0]);
            for (d.C0604d c0604d : cVar.f31843a) {
                File d10 = o.d(context);
                if (d10 == null) {
                    return null;
                }
                try {
                    if (!o.b(d10, resources, c0604d.f31849f)) {
                        return null;
                    }
                    if (!g(c0604d.f31845b, newInstance, d10.getPath(), c0604d.f31846c)) {
                        return null;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    d10.delete();
                }
            }
            h();
            try {
                Object newInstance2 = Array.newInstance(f224a, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f227d.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // a1.n
    public Typeface b(Context context, g1.m[] mVarArr, int i10) {
        File file;
        FileInputStream fileInputStream;
        String readlink;
        if (mVarArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(f(i10, mVarArr).f14832a, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
            } catch (ErrnoException unused) {
            }
            try {
                if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                    file = new File(readlink);
                    if (file != null && file.canRead()) {
                        Typeface createFromFile = Typeface.createFromFile(file);
                        openFileDescriptor.close();
                        return createFromFile;
                    }
                    fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                    Typeface c10 = c(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return c10;
                }
                Typeface c102 = c(context, fileInputStream);
                fileInputStream.close();
                openFileDescriptor.close();
                return c102;
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
            file = null;
            if (file != null) {
                Typeface createFromFile2 = Typeface.createFromFile(file);
                openFileDescriptor.close();
                return createFromFile2;
            }
            fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
        } catch (IOException unused2) {
            return null;
        }
    }
}
