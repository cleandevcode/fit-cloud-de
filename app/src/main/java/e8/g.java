package e8;

import android.accounts.Account;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import g8.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class g extends i8.g {
    public final GoogleSignInOptions A;

    public g(Context context, Looper looper, i8.d dVar, GoogleSignInOptions googleSignInOptions, d.a aVar, d.b bVar) {
        super(context, looper, 91, dVar, aVar, bVar);
        Account account;
        String str;
        String str2;
        HashSet hashSet;
        HashMap hashMap;
        boolean z10;
        boolean z11;
        boolean z12;
        if (googleSignInOptions != null) {
            new HashSet();
            new HashMap();
            hashSet = new HashSet(googleSignInOptions.f6022b);
            boolean z13 = googleSignInOptions.f6025e;
            boolean z14 = googleSignInOptions.f6026f;
            boolean z15 = googleSignInOptions.f6024d;
            String str3 = googleSignInOptions.f6027g;
            Account account2 = googleSignInOptions.f6023c;
            String str4 = googleSignInOptions.f6028h;
            str = str3;
            account = account2;
            hashMap = GoogleSignInOptions.f(googleSignInOptions.f6029i);
            str2 = str4;
            z11 = z13;
            z12 = z14;
            z10 = z15;
        } else {
            account = null;
            str = null;
            str2 = null;
            hashSet = new HashSet();
            hashMap = new HashMap();
            z10 = false;
            z11 = false;
            z12 = false;
        }
        byte[] bArr = new byte[16];
        u8.c.f28643a.nextBytes(bArr);
        String encodeToString = Base64.encodeToString(bArr, 11);
        if (!dVar.f16610c.isEmpty()) {
            for (Scope scope : dVar.f16610c) {
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        if (hashSet.contains(GoogleSignInOptions.f6019o)) {
            Scope scope2 = GoogleSignInOptions.f6018n;
            if (hashSet.contains(scope2)) {
                hashSet.remove(scope2);
            }
        }
        if (z10 && (account == null || !hashSet.isEmpty())) {
            hashSet.add(GoogleSignInOptions.f6017m);
        }
        this.A = new GoogleSignInOptions(3, new ArrayList(hashSet), account, z10, z11, z12, str, str2, hashMap, encodeToString);
    }

    @Override // i8.b, g8.a.e
    public final int i() {
        return 12451000;
    }

    @Override // i8.b
    public final /* synthetic */ IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof r ? (r) queryLocalInterface : new r(iBinder);
    }

    @Override // i8.b
    public final String v() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // i8.b
    public final String w() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
