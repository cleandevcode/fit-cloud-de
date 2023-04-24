package i8;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class i1 extends w8.a implements j {
    public i1(IBinder iBinder) {
        super("com.google.android.gms.common.internal.IAccountAccessor", iBinder);
    }

    @Override // i8.j
    public final Account p() {
        Parcel k10 = k(a0(), 2);
        Account account = (Account) w8.c.a(k10, Account.CREATOR);
        k10.recycle();
        return account;
    }
}
