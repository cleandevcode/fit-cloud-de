package c6;

import android.annotation.TargetApi;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import d6.j0;
import d6.m0;
import d6.v;
import d6.w;
import gm.l;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static final a f4540a = new a();

    /* renamed from: b */
    public static final HashMap<String, NsdManager.RegistrationListener> f4541b = new HashMap<>();

    /* renamed from: c6.a$a */
    /* loaded from: classes.dex */
    public static final class C0068a implements NsdManager.RegistrationListener {

        /* renamed from: a */
        public final /* synthetic */ String f4542a;

        /* renamed from: b */
        public final /* synthetic */ String f4543b;

        public C0068a(String str, String str2) {
            this.f4542a = str;
            this.f4543b = str2;
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public final void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i10) {
            l.f(nsdServiceInfo, "serviceInfo");
            a aVar = a.f4540a;
            a.a(this.f4543b);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public final void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
            l.f(nsdServiceInfo, "NsdServiceInfo");
            if (l.a(this.f4542a, nsdServiceInfo.getServiceName())) {
                return;
            }
            a aVar = a.f4540a;
            a.a(this.f4543b);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public final void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
            l.f(nsdServiceInfo, "serviceInfo");
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public final void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i10) {
            l.f(nsdServiceInfo, "serviceInfo");
        }
    }

    public static final void a(String str) {
        if (i6.a.b(a.class)) {
            return;
        }
        try {
            f4540a.b(str);
        } catch (Throwable th2) {
            i6.a.a(a.class, th2);
        }
    }

    public static final boolean c() {
        if (i6.a.b(a.class)) {
            return false;
        }
        try {
            w wVar = w.f12811a;
            v b10 = w.b(o5.v.b());
            if (b10 == null) {
                return false;
            }
            if (!b10.f12797c.contains(j0.f12696c)) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            i6.a.a(a.class, th2);
            return false;
        }
    }

    @TargetApi(16)
    public final void b(String str) {
        if (i6.a.b(this)) {
            return;
        }
        try {
            NsdManager.RegistrationListener registrationListener = f4541b.get(str);
            if (registrationListener != null) {
                Object systemService = o5.v.a().getSystemService("servicediscovery");
                if (systemService != null) {
                    try {
                        ((NsdManager) systemService).unregisterService(registrationListener);
                    } catch (IllegalArgumentException unused) {
                        m0 m0Var = m0.f12709a;
                        m0 m0Var2 = m0.f12709a;
                        o5.v vVar = o5.v.f22837a;
                    }
                    f4541b.remove(str);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
            }
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }

    @TargetApi(16)
    public final boolean d(String str) {
        if (i6.a.b(this)) {
            return false;
        }
        try {
            HashMap<String, NsdManager.RegistrationListener> hashMap = f4541b;
            if (hashMap.containsKey(str)) {
                return true;
            }
            o5.v vVar = o5.v.f22837a;
            String replace = "14.1.0".replace('.', '|');
            l.e(replace, "this as java.lang.String…replace(oldChar, newChar)");
            String str2 = "fbsdk_" + l.k(replace, "android-") + '_' + ((Object) str);
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType("_fb._tcp.");
            nsdServiceInfo.setServiceName(str2);
            nsdServiceInfo.setPort(80);
            Object systemService = o5.v.a().getSystemService("servicediscovery");
            if (systemService != null) {
                C0068a c0068a = new C0068a(str2, str);
                hashMap.put(str, c0068a);
                ((NsdManager) systemService).registerService(nsdServiceInfo, 1, c0068a);
                return true;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return false;
        }
    }
}
