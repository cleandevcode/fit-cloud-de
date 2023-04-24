package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import androidx.activity.ComponentActivity;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f738a;

    /* renamed from: b */
    public final /* synthetic */ IntentSender.SendIntentException f739b;

    /* renamed from: c */
    public final /* synthetic */ ComponentActivity.b f740c;

    public g(ComponentActivity.b bVar, int i10, IntentSender.SendIntentException sendIntentException) {
        this.f740c = bVar;
        this.f738a = i10;
        this.f739b = sendIntentException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f740c.a(this.f738a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f739b));
    }
}
