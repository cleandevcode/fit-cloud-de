package android.net.ssl;

import android.annotation.NonNull;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public /* synthetic */ class SSLSockets {
    static {
        throw new NoClassDefFoundError();
    }

    public static native /* synthetic */ boolean isSupportedSocket(@NonNull SSLSocket sSLSocket);

    public static native /* synthetic */ void setUseSessionTickets(@NonNull SSLSocket sSLSocket, boolean z10);
}
