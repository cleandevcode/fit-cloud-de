package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import gm.l;
import kotlin.Metadata;
import o5.h;
import o5.i;

/* loaded from: classes.dex */
public final class AuthenticationTokenManager {

    /* renamed from: d */
    public static final a f5808d = new a();

    /* renamed from: e */
    public static AuthenticationTokenManager f5809e;

    /* renamed from: a */
    public final g2.a f5810a;

    /* renamed from: b */
    public final i f5811b;

    /* renamed from: c */
    public h f5812c;

    @Metadata
    /* loaded from: classes.dex */
    public static final class CurrentAuthenticationTokenChangedBroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            l.f(context, "context");
            l.f(intent, "intent");
        }
    }

    /* loaded from: classes.dex */
    public static final class a {
    }

    public AuthenticationTokenManager(g2.a aVar, i iVar) {
        this.f5810a = aVar;
        this.f5811b = iVar;
    }
}
