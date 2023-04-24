package z5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import d6.m0;
import d6.q;
import gm.l;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import o5.v;
import o6.a;
import p5.d;
import x5.e;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public static final c f31963a = new c();

    /* renamed from: b */
    public static Boolean f31964b;

    /* loaded from: classes.dex */
    public enum a {
        MOBILE_APP_INSTALL("MOBILE_APP_INSTALL"),
        CUSTOM_APP_EVENTS("CUSTOM_APP_EVENTS");
        

        /* renamed from: a */
        public final String f31968a;

        a(String str) {
            this.f31968a = str;
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            return (a[]) Arrays.copyOf(values(), 2);
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.f31968a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements ServiceConnection {

        /* renamed from: a */
        public final CountDownLatch f31969a = new CountDownLatch(1);

        /* renamed from: b */
        public IBinder f31970b;

        @Override // android.content.ServiceConnection
        public final void onNullBinding(ComponentName componentName) {
            l.f(componentName, "name");
            this.f31969a.countDown();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            l.f(componentName, "name");
            l.f(iBinder, "serviceBinder");
            this.f31970b = iBinder;
            this.f31969a.countDown();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            l.f(componentName, "name");
        }
    }

    /* renamed from: z5.c$c */
    /* loaded from: classes.dex */
    public enum EnumC0608c {
        OPERATION_SUCCESS,
        SERVICE_NOT_AVAILABLE,
        SERVICE_ERROR;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC0608c[] valuesCustom() {
            return (EnumC0608c[]) Arrays.copyOf(values(), 3);
        }
    }

    public final Intent a(Context context) {
        if (i6.a.b(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent intent = new Intent("ReceiverService");
                intent.setPackage("com.facebook.katana");
                if (packageManager.resolveService(intent, 0) != null && q.a(context, "com.facebook.katana")) {
                    return intent;
                }
                Intent intent2 = new Intent("ReceiverService");
                intent2.setPackage("com.facebook.wakizashi");
                if (packageManager.resolveService(intent2, 0) != null) {
                    if (q.a(context, "com.facebook.wakizashi")) {
                        return intent2;
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return null;
        }
    }

    public final EnumC0608c b(a aVar, String str, List<d> list) {
        EnumC0608c enumC0608c;
        EnumC0608c enumC0608c2 = EnumC0608c.SERVICE_ERROR;
        if (i6.a.b(this)) {
            return null;
        }
        try {
            EnumC0608c enumC0608c3 = EnumC0608c.SERVICE_NOT_AVAILABLE;
            int i10 = e.f30297a;
            Context a10 = v.a();
            Intent a11 = a(a10);
            if (a11 != null) {
                b bVar = new b();
                if (a10.bindService(a11, bVar, 1)) {
                    try {
                        try {
                            bVar.f31969a.await(5L, TimeUnit.SECONDS);
                            IBinder iBinder = bVar.f31970b;
                            if (iBinder != null) {
                                o6.a k10 = a.AbstractBinderC0408a.k(iBinder);
                                Bundle a12 = z5.b.a(aVar, str, list);
                                if (a12 != null) {
                                    k10.d(a12);
                                    m0 m0Var = m0.f12709a;
                                    l.k(a12, "Successfully sent events to the remote service: ");
                                }
                                enumC0608c = EnumC0608c.OPERATION_SUCCESS;
                            } else {
                                enumC0608c = enumC0608c3;
                            }
                            a10.unbindService(bVar);
                            m0 m0Var2 = m0.f12709a;
                            return enumC0608c;
                        } catch (InterruptedException unused) {
                            m0 m0Var3 = m0.f12709a;
                            v vVar = v.f22837a;
                            a10.unbindService(bVar);
                            return enumC0608c2;
                        }
                    } catch (RemoteException unused2) {
                        m0 m0Var4 = m0.f12709a;
                        v vVar2 = v.f22837a;
                        a10.unbindService(bVar);
                        return enumC0608c2;
                    }
                }
                return enumC0608c2;
            }
            return enumC0608c3;
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return null;
        }
    }
}
