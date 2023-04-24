package f9;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import g8.d;

/* loaded from: classes.dex */
public final class a extends i8.g<f> implements e9.f {
    public final boolean A;
    public final i8.d B;
    public final Bundle C;
    public final Integer D;

    public a(Context context, Looper looper, i8.d dVar, Bundle bundle, d.a aVar, d.b bVar) {
        super(context, looper, 44, dVar, aVar, bVar);
        this.A = true;
        this.B = dVar;
        this.C = bundle;
        this.D = dVar.f16616i;
    }

    @Override // i8.b, g8.a.e
    public final int i() {
        return 12451000;
    }

    @Override // i8.b, g8.a.e
    public final boolean l() {
        return this.A;
    }

    @Override // i8.b
    public final /* synthetic */ IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof f ? (f) queryLocalInterface : new f(iBinder);
    }

    @Override // i8.b
    public final Bundle s() {
        if (!this.f16579c.getPackageName().equals(this.B.f16613f)) {
            this.C.putString("com.google.android.gms.signin.internal.realClientPackageName", this.B.f16613f);
        }
        return this.C;
    }

    @Override // i8.b
    public final String v() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // i8.b
    public final String w() {
        return "com.google.android.gms.signin.service.START";
    }
}
