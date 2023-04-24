package d8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;

/* loaded from: classes.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int p10 = j8.b.p(parcel);
        String str = "";
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = "";
        while (parcel.dataPosition() < p10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 4) {
                if (c10 != 7) {
                    if (c10 != '\b') {
                        j8.b.o(parcel, readInt);
                    } else {
                        str2 = j8.b.c(parcel, readInt);
                    }
                } else {
                    googleSignInAccount = (GoogleSignInAccount) j8.b.b(parcel, readInt, GoogleSignInAccount.CREATOR);
                }
            } else {
                str = j8.b.c(parcel, readInt);
            }
        }
        j8.b.f(parcel, p10);
        return new SignInAccount(str, googleSignInAccount, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SignInAccount[i10];
    }
}
