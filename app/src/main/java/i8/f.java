package i8;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import i8.j;

/* loaded from: classes.dex */
public final class f extends j8.a {
    public static final Parcelable.Creator<f> CREATOR = new a1();

    /* renamed from: o */
    public static final Scope[] f16637o = new Scope[0];

    /* renamed from: p */
    public static final f8.c[] f16638p = new f8.c[0];

    /* renamed from: a */
    public final int f16639a;

    /* renamed from: b */
    public final int f16640b;

    /* renamed from: c */
    public final int f16641c;

    /* renamed from: d */
    public String f16642d;

    /* renamed from: e */
    public IBinder f16643e;

    /* renamed from: f */
    public Scope[] f16644f;

    /* renamed from: g */
    public Bundle f16645g;

    /* renamed from: h */
    public Account f16646h;

    /* renamed from: i */
    public f8.c[] f16647i;

    /* renamed from: j */
    public f8.c[] f16648j;

    /* renamed from: k */
    public final boolean f16649k;

    /* renamed from: l */
    public final int f16650l;

    /* renamed from: m */
    public boolean f16651m;

    /* renamed from: n */
    public final String f16652n;

    public f(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, f8.c[] cVarArr, f8.c[] cVarArr2, boolean z10, int i13, boolean z11, String str2) {
        scopeArr = scopeArr == null ? f16637o : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        cVarArr = cVarArr == null ? f16638p : cVarArr;
        cVarArr2 = cVarArr2 == null ? f16638p : cVarArr2;
        this.f16639a = i10;
        this.f16640b = i11;
        this.f16641c = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f16642d = "com.google.android.gms";
        } else {
            this.f16642d = str;
        }
        if (i10 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i14 = j.a.f16676a;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                j i1Var = queryLocalInterface instanceof j ? (j) queryLocalInterface : new i1(iBinder);
                int i15 = a.f16575b;
                if (i1Var != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            account2 = i1Var.p();
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                        }
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
            }
            this.f16646h = account2;
        } else {
            this.f16643e = iBinder;
            this.f16646h = account;
        }
        this.f16644f = scopeArr;
        this.f16645g = bundle;
        this.f16647i = cVarArr;
        this.f16648j = cVarArr2;
        this.f16649k = z10;
        this.f16650l = i13;
        this.f16651m = z11;
        this.f16652n = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        a1.a(this, parcel, i10);
    }
}
