package u8;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;
import c8.a;
import g8.d;
import i8.g;

/* loaded from: classes.dex */
public final class e extends g {
    public final a.C0069a A;

    public e(Context context, Looper looper, i8.d dVar, a.C0069a c0069a, d.a aVar, d.b bVar) {
        super(context, looper, 68, dVar, aVar, bVar);
        a.C0069a.C0070a c0070a = new a.C0069a.C0070a(c0069a == null ? a.C0069a.f4583c : c0069a);
        byte[] bArr = new byte[16];
        c.f28643a.nextBytes(bArr);
        c0070a.f4587b = Base64.encodeToString(bArr, 11);
        this.A = new a.C0069a(c0070a);
    }

    @Override // i8.b, g8.a.e
    public final int i() {
        return 12800000;
    }

    @Override // i8.b
    public final /* synthetic */ IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof f ? (f) queryLocalInterface : new f(iBinder);
    }

    @Override // i8.b
    public final Bundle s() {
        a.C0069a c0069a = this.A;
        c0069a.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", c0069a.f4584a);
        bundle.putString("log_session_id", c0069a.f4585b);
        return bundle;
    }

    @Override // i8.b
    public final String v() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // i8.b
    public final String w() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
