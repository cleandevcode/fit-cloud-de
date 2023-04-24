package p;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import b.b;

/* loaded from: classes.dex */
public abstract class f implements ServiceConnection {

    /* loaded from: classes.dex */
    public class a extends e {
        public a(b.b bVar, ComponentName componentName) {
            super(bVar, componentName);
        }
    }

    public abstract void a(ComponentName componentName, a aVar);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b.b c0046a;
        int i10 = b.a.f3922a;
        if (iBinder == null) {
            c0046a = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof b.b)) {
                c0046a = (b.b) queryLocalInterface;
            } else {
                c0046a = new b.a.C0046a(iBinder);
            }
        }
        a(componentName, new a(c0046a, componentName));
    }
}
