package d6;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;

/* loaded from: classes.dex */
public abstract class g0 implements ServiceConnection {

    /* renamed from: a */
    public final Context f12680a;

    /* renamed from: b */
    public final f0 f12681b;

    /* renamed from: c */
    public a f12682c;

    /* renamed from: d */
    public boolean f12683d;

    /* renamed from: e */
    public Messenger f12684e;

    /* renamed from: f */
    public final int f12685f;

    /* renamed from: g */
    public final int f12686g;

    /* renamed from: h */
    public final String f12687h;

    /* renamed from: i */
    public final int f12688i;

    /* renamed from: j */
    public final String f12689j;

    /* loaded from: classes.dex */
    public interface a {
    }

    public g0(Context context, String str, String str2) {
        gm.l.f(str, "applicationId");
        Context applicationContext = context.getApplicationContext();
        this.f12680a = applicationContext != null ? applicationContext : context;
        this.f12685f = 65536;
        this.f12686g = 65537;
        this.f12687h = str;
        this.f12688i = 20121101;
        this.f12689j = str2;
        this.f12681b = new f0(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0065, code lost:
        if (r5 != false) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.g0.a(android.os.Bundle):void");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        gm.l.f(componentName, "name");
        gm.l.f(iBinder, WiseOpenHianalyticsData.UNION_SERVICE);
        this.f12684e = new Messenger(iBinder);
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.f12687h);
        String str = this.f12689j;
        if (str != null) {
            bundle.putString("com.facebook.platform.extra.NONCE", str);
        }
        Message obtain = Message.obtain((Handler) null, this.f12685f);
        obtain.arg1 = this.f12688i;
        obtain.setData(bundle);
        obtain.replyTo = new Messenger(this.f12681b);
        try {
            Messenger messenger = this.f12684e;
            if (messenger == null) {
                return;
            }
            messenger.send(obtain);
        } catch (RemoteException unused) {
            a(null);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        gm.l.f(componentName, "name");
        this.f12684e = null;
        try {
            this.f12680a.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        a(null);
    }
}
