package e9;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import g8.a;
import g8.d;

/* loaded from: classes.dex */
public final class b extends a.AbstractC0268a {
    @Override // g8.a.AbstractC0268a
    public final a.e a(Context context, Looper looper, i8.d dVar, a.c cVar, d.a aVar, d.b bVar) {
        a aVar2 = (a) cVar;
        Integer num = dVar.f16616i;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", dVar.f16608a);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return new f9.a(context, looper, dVar, bundle, aVar, bVar);
    }
}
