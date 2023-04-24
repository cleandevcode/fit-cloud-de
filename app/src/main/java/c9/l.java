package c9;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
public final class l {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a */
    public static Context f4589a;

    /* renamed from: b */
    public static n f4590b;

    public static n a(Context context) {
        Class cls;
        Class cls2;
        n mVar;
        i8.p.f(context);
        Log.d("l", "preferredRenderer: ".concat("null"));
        n nVar = f4590b;
        if (nVar == null) {
            int i10 = f8.g.f14184e;
            int a10 = com.google.android.gms.common.a.a(context, 13400000);
            if (a10 == 0) {
                Log.i("l", "Making Creator dynamically");
                ClassLoader classLoader = b(context).getClassLoader();
                try {
                    i8.p.f(classLoader);
                    try {
                        try {
                            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl").newInstance();
                            if (iBinder == null) {
                                mVar = null;
                            } else {
                                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                                if (queryLocalInterface instanceof n) {
                                    mVar = (n) queryLocalInterface;
                                } else {
                                    mVar = new m(iBinder);
                                }
                            }
                            f4590b = mVar;
                            try {
                                Context b10 = b(context);
                                b10.getClass();
                                mVar.L(new p8.c(b10.getResources()));
                                return f4590b;
                            } catch (RemoteException e10) {
                                throw new d9.k(e10);
                            }
                        } catch (IllegalAccessException unused) {
                            throw new IllegalStateException("Unable to call the default constructor of ".concat(cls.getName()));
                        }
                    } catch (InstantiationException unused2) {
                        throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(cls2.getName()));
                    }
                } catch (ClassNotFoundException unused3) {
                    throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl");
                }
            }
            throw new f8.f(a10);
        }
        return nVar;
    }

    public static Context b(Context context) {
        Context context2;
        Context context3 = f4589a;
        if (context3 == null) {
            context.getApplicationContext();
            try {
                context2 = DynamiteModule.b(context, DynamiteModule.f6072b, "com.google.android.gms.maps_dynamite").f6083a;
            } catch (Exception e10) {
                if (!"com.google.android.gms.maps_dynamite".equals("com.google.android.gms.maps_dynamite")) {
                    try {
                        Log.d("l", "Attempting to load maps_dynamite again.");
                        context2 = DynamiteModule.b(context, DynamiteModule.f6072b, "com.google.android.gms.maps_dynamite").f6083a;
                    } catch (Exception e11) {
                        Log.e("l", "Failed to load maps module, use pre-Chimera", e11);
                        int i10 = f8.g.f14184e;
                        context2 = context.createPackageContext("com.google.android.gms", 3);
                        f4589a = context2;
                        return context2;
                    }
                } else {
                    Log.e("l", "Failed to load maps module, use pre-Chimera", e10);
                    int i11 = f8.g.f14184e;
                }
                try {
                    context2 = context.createPackageContext("com.google.android.gms", 3);
                } catch (PackageManager.NameNotFoundException unused) {
                    context2 = null;
                }
            }
            f4589a = context2;
            return context2;
        }
        return context3;
    }
}
