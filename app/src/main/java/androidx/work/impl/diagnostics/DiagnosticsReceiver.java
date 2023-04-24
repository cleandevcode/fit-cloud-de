package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import f3.m;
import f3.o;
import g3.l;
import java.util.Collections;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f3718a = m.e("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        m.c().a(f3718a, "Requesting diagnostics", new Throwable[0]);
        try {
            l d10 = l.d(context);
            d10.getClass();
            d10.a(Collections.singletonList(new o.a(DiagnosticsWorker.class).a()));
        } catch (IllegalStateException e10) {
            m.c().b(f3718a, "WorkManager is not initialized", e10);
        }
    }
}
