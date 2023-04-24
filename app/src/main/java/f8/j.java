package f8;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

@SuppressLint({"HandlerLeak"})
/* loaded from: classes.dex */
public final class j extends v8.j {

    /* renamed from: a */
    public final Context f14187a;

    /* renamed from: b */
    public final /* synthetic */ d f14188b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(d dVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f14188b = dVar;
        this.f14187a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        PendingIntent activity;
        int i10 = message.what;
        boolean z10 = true;
        if (i10 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i10);
            return;
        }
        int c10 = this.f14188b.c(this.f14187a);
        this.f14188b.getClass();
        AtomicBoolean atomicBoolean = com.google.android.gms.common.a.f6043a;
        if (c10 != 1 && c10 != 2 && c10 != 3 && c10 != 9) {
            z10 = false;
        }
        if (z10) {
            d dVar = this.f14188b;
            Context context = this.f14187a;
            Intent a10 = dVar.a(context, c10, "n");
            if (a10 == null) {
                activity = null;
            } else {
                activity = PendingIntent.getActivity(context, 0, a10, w8.d.f29761a | 134217728);
            }
            dVar.g(context, c10, activity);
        }
    }
}
