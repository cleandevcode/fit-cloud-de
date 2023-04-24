package lf;

import android.bluetooth.BluetoothAdapter;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.support.v4.media.d;
import android.util.Log;
import com.realsil.sdk.dfu.DfuService;
import com.realsil.sdk.dfu.a;
import com.realsil.sdk.dfu.b;
import p001if.a;
import ze.g;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public Context f19460a;

    /* renamed from: b */
    public lf.b f19461b;

    /* renamed from: c */
    public com.realsil.sdk.dfu.a f19462c;

    /* renamed from: d */
    public final BinderC0350a f19463d = new BinderC0350a();

    /* renamed from: e */
    public final b f19464e = new b();

    /* renamed from: lf.a$a */
    /* loaded from: classes.dex */
    public class BinderC0350a extends b.a {
        public BinderC0350a() {
            a.this = r1;
        }

        @Override // com.realsil.sdk.dfu.b
        public final void A(g gVar) {
            lf.b bVar = a.this.f19461b;
            if (bVar != null) {
                bVar.A(gVar);
            }
        }

        @Override // com.realsil.sdk.dfu.b
        public final void T(int i10) {
            lf.b bVar = a.this.f19461b;
            if (bVar != null) {
                bVar.z(i10);
            }
        }

        @Override // com.realsil.sdk.dfu.b
        public final void a(int i10) {
            lf.b bVar = a.this.f19461b;
            if (bVar != null) {
                bVar.B(i10);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements ServiceConnection {
        public b() {
            a.this = r1;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            com.realsil.sdk.dfu.a c0117a;
            StringBuilder a10 = d.a("onServiceConnected: className=");
            a10.append(componentName.getClassName());
            a10.append(", packageName=");
            a10.append(componentName.getPackageName());
            ge.b.n(a10.toString());
            a aVar = a.this;
            int i10 = a.AbstractBinderC0116a.f9476a;
            if (iBinder == null) {
                c0117a = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.realsil.sdk.dfu.IRealsilDfu");
                if (queryLocalInterface != null && (queryLocalInterface instanceof com.realsil.sdk.dfu.a)) {
                    c0117a = (com.realsil.sdk.dfu.a) queryLocalInterface;
                } else {
                    c0117a = new a.AbstractBinderC0116a.C0117a(iBinder);
                }
            }
            aVar.f19462c = c0117a;
            a aVar2 = a.this;
            com.realsil.sdk.dfu.a aVar3 = aVar2.f19462c;
            if (aVar3 != null) {
                try {
                    if (aVar3.c0("DfuProxy", aVar2.f19463d)) {
                        a aVar4 = a.this;
                        lf.b bVar = aVar4.f19461b;
                        if (bVar != null) {
                            bVar.C(true, aVar4);
                        }
                    } else {
                        ge.b.d("registerCallback failed, need to unbind");
                        a.this.c();
                    }
                    return;
                } catch (RemoteException e10) {
                    ge.b.f(e10.toString());
                    a.this.c();
                    return;
                }
            }
            lf.b bVar2 = aVar2.f19461b;
            if (bVar2 != null) {
                bVar2.C(false, aVar2);
            }
            ge.b.n("rebind DfuService...");
            a.this.b();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            ge.b.d("Proxy object disconnected with an extreme situations");
            try {
                a aVar = a.this;
                com.realsil.sdk.dfu.a aVar2 = aVar.f19462c;
                if (aVar2 != null) {
                    aVar2.P("DfuProxy", aVar.f19463d);
                }
            } catch (RemoteException e10) {
                ge.b.f(e10.toString());
            }
            a aVar3 = a.this;
            aVar3.f19462c = null;
            lf.b bVar = aVar3.f19461b;
            if (bVar != null) {
                bVar.C(false, null);
                a.this.b();
            }
        }
    }

    public a(Context context, a.b bVar) {
        this.f19460a = context;
        this.f19461b = bVar;
        BluetoothAdapter.getDefaultAdapter();
    }

    public final boolean a() {
        com.realsil.sdk.dfu.a aVar = this.f19462c;
        if (aVar == null) {
            ge.b.d("Proxy not attached to service");
            return false;
        }
        try {
            return aVar.a();
        } catch (RemoteException unused) {
            StringBuilder a10 = d.a("Stack:");
            a10.append(Log.getStackTraceString(new Throwable()));
            ge.b.f(a10.toString());
            return false;
        }
    }

    public final boolean b() {
        try {
            ge.b.n("bindService DfuService ...");
            Intent intent = new Intent(this.f19460a, DfuService.class);
            intent.setAction(com.realsil.sdk.dfu.a.class.getName());
            return this.f19460a.bindService(intent, this.f19464e, 1);
        } catch (Exception e10) {
            StringBuilder a10 = d.a("Unable to bind DfuService ");
            a10.append(e10.toString());
            ge.b.f(a10.toString());
            return false;
        }
    }

    public final void c() {
        synchronized (this.f19464e) {
            com.realsil.sdk.dfu.a aVar = this.f19462c;
            if (aVar != null) {
                try {
                    aVar.P("DfuProxy", this.f19463d);
                    this.f19462c = null;
                    this.f19460a.unbindService(this.f19464e);
                } catch (Exception e10) {
                    ge.b.p("Unable to unbind DfuService: " + e10.toString());
                }
            }
        }
    }

    public final void finalize() {
        this.f19461b = null;
        a();
        c();
    }
}
