package e8;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class p extends u8.b implements q {
    public p() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // u8.b
    public final boolean k(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) u8.d.a(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) u8.d.a(parcel, Status.CREATOR);
                u8.d.b(parcel);
                throw new UnsupportedOperationException();
            case 102:
                u8.d.b(parcel);
                V((Status) u8.d.a(parcel, Status.CREATOR));
                break;
            case 103:
                u8.d.b(parcel);
                K((Status) u8.d.a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
