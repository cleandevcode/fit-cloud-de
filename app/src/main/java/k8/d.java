package k8;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import h8.j;
import i8.g;
import i8.t;
import v8.f;

/* loaded from: classes.dex */
public final class d extends g {
    public final t A;

    public d(Context context, Looper looper, i8.d dVar, t tVar, h8.c cVar, j jVar) {
        super(context, looper, 270, dVar, cVar, jVar);
        this.A = tVar;
    }

    @Override // i8.b, g8.a.e
    public final int i() {
        return 203400000;
    }

    @Override // i8.b
    public final /* synthetic */ IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder);
    }

    @Override // i8.b
    public final f8.c[] q() {
        return f.f29173b;
    }

    @Override // i8.b
    public final Bundle s() {
        t tVar = this.A;
        tVar.getClass();
        Bundle bundle = new Bundle();
        String str = tVar.f16716a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // i8.b
    public final String v() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // i8.b
    public final String w() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // i8.b
    public final boolean x() {
        return true;
    }
}
