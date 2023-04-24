package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import gm.l;
import kotlin.Metadata;
import o5.a;
import o5.f;
import o5.v;

@Metadata
/* loaded from: classes.dex */
public final class CurrentAccessTokenExpirationBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        l.f(context, "context");
        l.f(intent, "intent");
        if (l.a("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED", intent.getAction()) && v.h()) {
            f a10 = f.f22706f.a();
            a aVar = a10.f22710c;
            a10.b(aVar, aVar);
        }
    }
}
