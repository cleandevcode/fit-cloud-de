package b9;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import c9.l;
import c9.n;
import d9.k;
import i8.p;
import s.h1;
import y8.m;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public static boolean f4039a = false;

    /* renamed from: b */
    public static a f4040b = a.LEGACY;

    /* loaded from: classes.dex */
    public enum a {
        LEGACY,
        LATEST
    }

    public static synchronized int a(Context context) {
        synchronized (c.class) {
            try {
                if (context != null) {
                    Log.d("c", "preferredRenderer: ".concat("null"));
                    if (f4039a) {
                        return 0;
                    }
                    try {
                        n a10 = l.a(context);
                        try {
                            c9.a o10 = a10.o();
                            p.f(o10);
                            p.b.f23722a = o10;
                            m j02 = a10.j0();
                            if (h1.f25977b == null) {
                                p.g(j02, "delegate must not be null");
                                h1.f25977b = j02;
                            }
                            f4039a = true;
                            try {
                                if (a10.n() == 2) {
                                    f4040b = a.LATEST;
                                }
                                a10.p0(new p8.c(context), 0);
                            } catch (RemoteException e10) {
                                Log.e("c", "Failed to retrieve renderer type or log initialization.", e10);
                            }
                            Log.d("c", "loadedRenderer: ".concat(String.valueOf(f4040b)));
                            return 0;
                        } catch (RemoteException e11) {
                            throw new k(e11);
                        }
                    } catch (f8.f e12) {
                        return e12.f14183a;
                    }
                }
                throw new NullPointerException("Context is null");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
