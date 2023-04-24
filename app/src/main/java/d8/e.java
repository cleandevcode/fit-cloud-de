package d8;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int p10 = j8.b.p(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        Account account = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (parcel.dataPosition() < p10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i10 = j8.b.l(parcel, readInt);
                    break;
                case 2:
                    arrayList2 = j8.b.e(parcel, readInt, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) j8.b.b(parcel, readInt, Account.CREATOR);
                    break;
                case 4:
                    z10 = j8.b.g(parcel, readInt);
                    break;
                case 5:
                    z11 = j8.b.g(parcel, readInt);
                    break;
                case 6:
                    z12 = j8.b.g(parcel, readInt);
                    break;
                case 7:
                    str = j8.b.c(parcel, readInt);
                    break;
                case '\b':
                    str2 = j8.b.c(parcel, readInt);
                    break;
                case '\t':
                    arrayList = j8.b.e(parcel, readInt, e8.a.CREATOR);
                    break;
                case '\n':
                    str3 = j8.b.c(parcel, readInt);
                    break;
                default:
                    j8.b.o(parcel, readInt);
                    break;
            }
        }
        j8.b.f(parcel, p10);
        return new GoogleSignInOptions(i10, arrayList2, account, z10, z11, z12, str, str2, GoogleSignInOptions.f(arrayList), str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInOptions[i10];
    }
}
