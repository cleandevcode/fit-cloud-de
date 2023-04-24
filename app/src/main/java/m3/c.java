package m3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import f3.m;

/* loaded from: classes.dex */
public abstract class c<T> extends d<T> {

    /* renamed from: h */
    public static final String f20331h = m.e("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g */
    public final a f20332g;

    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
            c.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent != null) {
                c.this.f(intent);
            }
        }
    }

    public c(Context context, r3.a aVar) {
        super(context, aVar);
        this.f20332g = new a();
    }

    @Override // m3.d
    public final void c() {
        m.c().a(f20331h, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f20336b.registerReceiver(this.f20332g, e());
    }

    @Override // m3.d
    public final void d() {
        m.c().a(f20331h, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f20336b.unregisterReceiver(this.f20332g);
    }

    public abstract IntentFilter e();

    public abstract void f(Intent intent);
}
