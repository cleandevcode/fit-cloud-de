package i8;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* loaded from: classes.dex */
public final class a1 implements Parcelable.Creator {
    public static void a(f fVar, Parcel parcel, int i10) {
        int F = o8.b.F(parcel, 20293);
        o8.b.z(parcel, 1, fVar.f16639a);
        o8.b.z(parcel, 2, fVar.f16640b);
        o8.b.z(parcel, 3, fVar.f16641c);
        o8.b.C(parcel, 4, fVar.f16642d);
        o8.b.y(parcel, 5, fVar.f16643e);
        o8.b.D(parcel, 6, fVar.f16644f, i10);
        o8.b.u(parcel, 7, fVar.f16645g);
        o8.b.B(parcel, 8, fVar.f16646h, i10);
        o8.b.D(parcel, 10, fVar.f16647i, i10);
        o8.b.D(parcel, 11, fVar.f16648j, i10);
        o8.b.t(parcel, 12, fVar.f16649k);
        o8.b.z(parcel, 13, fVar.f16650l);
        o8.b.t(parcel, 14, fVar.f16651m);
        o8.b.C(parcel, 15, fVar.f16652n);
        o8.b.J(parcel, F);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int p10 = j8.b.p(parcel);
        Scope[] scopeArr = f.f16637o;
        Bundle bundle = new Bundle();
        f8.c[] cVarArr = f.f16638p;
        f8.c[] cVarArr2 = cVarArr;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        boolean z11 = false;
        while (parcel.dataPosition() < p10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i10 = j8.b.l(parcel, readInt);
                    break;
                case 2:
                    i11 = j8.b.l(parcel, readInt);
                    break;
                case 3:
                    i12 = j8.b.l(parcel, readInt);
                    break;
                case 4:
                    str = j8.b.c(parcel, readInt);
                    break;
                case 5:
                    iBinder = j8.b.k(parcel, readInt);
                    break;
                case 6:
                    scopeArr = (Scope[]) j8.b.d(parcel, readInt, Scope.CREATOR);
                    break;
                case 7:
                    bundle = j8.b.a(parcel, readInt);
                    break;
                case '\b':
                    account = (Account) j8.b.b(parcel, readInt, Account.CREATOR);
                    break;
                case '\t':
                default:
                    j8.b.o(parcel, readInt);
                    break;
                case '\n':
                    cVarArr = (f8.c[]) j8.b.d(parcel, readInt, f8.c.CREATOR);
                    break;
                case 11:
                    cVarArr2 = (f8.c[]) j8.b.d(parcel, readInt, f8.c.CREATOR);
                    break;
                case '\f':
                    z10 = j8.b.g(parcel, readInt);
                    break;
                case '\r':
                    i13 = j8.b.l(parcel, readInt);
                    break;
                case 14:
                    z11 = j8.b.g(parcel, readInt);
                    break;
                case 15:
                    str2 = j8.b.c(parcel, readInt);
                    break;
            }
        }
        j8.b.f(parcel, p10);
        return new f(i10, i11, i12, str, iBinder, scopeArr, bundle, account, cVarArr, cVarArr2, z10, i13, z11, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new f[i10];
    }
}
