package t8;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import c8.c;
import h8.j;
import i8.d;
import i8.g;
import i8.w;

/* loaded from: classes.dex */
public final class a extends g<b> {
    public final Bundle A;

    public a(Context context, Looper looper, d dVar, c cVar, h8.c cVar2, j jVar) {
        super(context, looper, 16, dVar, cVar2, jVar);
        Bundle bundle;
        if (cVar == null) {
            bundle = new Bundle();
        } else {
            bundle = new Bundle((Bundle) null);
        }
        this.A = bundle;
    }

    @Override // i8.b, g8.a.e
    public final int i() {
        return 12451000;
    }

    @Override // i8.b, g8.a.e
    public final boolean l() {
        String str;
        d dVar = this.f16663x;
        Account account = dVar.f16608a;
        if (account != null) {
            str = account.name;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            if (((w) dVar.f16611d.get(c8.b.f4588a)) == null) {
                if (!dVar.f16609b.isEmpty()) {
                    return true;
                }
                return false;
            }
            throw null;
        }
        return false;
    }

    @Override // i8.b
    public final /* bridge */ /* synthetic */ IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return queryLocalInterface instanceof b ? (b) queryLocalInterface : new b(iBinder);
    }

    @Override // i8.b
    public final Bundle s() {
        return this.A;
    }

    @Override // i8.b
    public final String v() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // i8.b
    public final String w() {
        return "com.google.android.gms.auth.service.START";
    }
}
