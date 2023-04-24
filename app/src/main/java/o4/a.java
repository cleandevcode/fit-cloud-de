package o4;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import b8.a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import d6.z;

/* loaded from: classes.dex */
public final class a extends InstallReferrerClient {

    /* renamed from: a */
    public int f22658a = 0;

    /* renamed from: b */
    public final Context f22659b;

    /* renamed from: c */
    public b8.a f22660c;

    /* renamed from: d */
    public ServiceConnectionC0406a f22661d;

    /* renamed from: o4.a$a */
    /* loaded from: classes.dex */
    public final class ServiceConnectionC0406a implements ServiceConnection {

        /* renamed from: a */
        public final InstallReferrerStateListener f22662a;

        public ServiceConnectionC0406a(z zVar) {
            a.this = r1;
            this.f22662a = zVar;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            b8.a c0053a;
            tb.a.h("Install Referrer service connected.");
            a aVar = a.this;
            int i10 = a.AbstractBinderC0052a.f4034a;
            if (iBinder == null) {
                c0053a = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                if (queryLocalInterface != null && (queryLocalInterface instanceof b8.a)) {
                    c0053a = (b8.a) queryLocalInterface;
                } else {
                    c0053a = new a.AbstractBinderC0052a.C0053a(iBinder);
                }
            }
            aVar.f22660c = c0053a;
            a.this.f22658a = 2;
            this.f22662a.a(0);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            tb.a.i("Install Referrer service disconnected.");
            a aVar = a.this;
            aVar.f22660c = null;
            aVar.f22658a = 0;
            this.f22662a.b();
        }
    }

    public a(Context context) {
        this.f22659b = context.getApplicationContext();
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public final ReferrerDetails a() {
        boolean z10;
        if (this.f22658a == 2 && this.f22660c != null && this.f22661d != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.f22659b.getPackageName());
            try {
                return new ReferrerDetails(this.f22660c.E(bundle));
            } catch (RemoteException e10) {
                tb.a.i("RemoteException getting install referrer information");
                this.f22658a = 0;
                throw e10;
            }
        }
        throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(d6.z r8) {
        /*
            r7 = this;
            int r0 = r7.f22658a
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L11
            b8.a r4 = r7.f22660c
            if (r4 == 0) goto L11
            o4.a$a r4 = r7.f22661d
            if (r4 == 0) goto L11
            r4 = 1
            goto L12
        L11:
            r4 = 0
        L12:
            if (r4 == 0) goto L1d
            java.lang.String r0 = "Service connection is valid. No need to re-initialize."
            tb.a.h(r0)
            r8.a(r3)
            return
        L1d:
            r4 = 3
            if (r0 != r2) goto L29
            java.lang.String r0 = "Client is already in the process of connecting to the service."
            tb.a.i(r0)
            r8.a(r4)
            return
        L29:
            if (r0 != r4) goto L34
            java.lang.String r0 = "Client was already closed and can't be reused. Please create another instance."
            tb.a.i(r0)
            r8.a(r4)
            return
        L34:
            java.lang.String r0 = "Starting install referrer service setup."
            tb.a.h(r0)
            o4.a$a r0 = new o4.a$a
            r0.<init>(r8)
            r7.f22661d = r0
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r4 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            r0.<init>(r4)
            android.content.ComponentName r4 = new android.content.ComponentName
            java.lang.String r5 = "com.android.vending"
            java.lang.String r6 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            r4.<init>(r5, r6)
            r0.setComponent(r4)
            android.content.Context r4 = r7.f22659b
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            java.util.List r4 = r4.queryIntentServices(r0, r3)
            if (r4 == 0) goto Lbf
            boolean r6 = r4.isEmpty()
            if (r6 != 0) goto Lbf
            java.lang.Object r4 = r4.get(r3)
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ServiceInfo r4 = r4.serviceInfo
            if (r4 == 0) goto Lbf
            java.lang.String r6 = r4.packageName
            java.lang.String r4 = r4.name
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto Lb4
            if (r4 == 0) goto Lb4
            android.content.Context r4 = r7.f22659b
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            r6 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r5, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L90
            int r4 = r4.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L90
            r5 = 80837300(0x4d17ab4, float:4.924835E-36)
            if (r4 < r5) goto L91
            r4 = 1
            goto L92
        L90:
        L91:
            r4 = 0
        L92:
            if (r4 == 0) goto Lb4
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0)
            android.content.Context r0 = r7.f22659b
            o4.a$a r4 = r7.f22661d
            boolean r0 = r0.bindService(r1, r4, r2)
            if (r0 == 0) goto La9
            java.lang.String r8 = "Service was bonded successfully."
            tb.a.h(r8)
            return
        La9:
            java.lang.String r0 = "Connection to service is blocked."
            tb.a.i(r0)
            r7.f22658a = r3
            r8.a(r2)
            return
        Lb4:
            java.lang.String r0 = "Play Store missing or incompatible. Version 8.3.73 or later required."
            tb.a.i(r0)
            r7.f22658a = r3
            r8.a(r1)
            return
        Lbf:
            r7.f22658a = r3
            java.lang.String r0 = "Install Referrer service unavailable on device."
            tb.a.h(r0)
            r8.a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.a.b(d6.z):void");
    }
}
