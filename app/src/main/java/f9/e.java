package f9;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import h8.t0;
import h8.v0;

/* loaded from: classes.dex */
public abstract class e extends v8.b {
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 0);
    }

    @Override // v8.b
    public final boolean y0(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 3:
                f8.a aVar = (f8.a) v8.c.a(parcel, f8.a.CREATOR);
                b bVar = (b) v8.c.a(parcel, b.CREATOR);
                v8.c.b(parcel);
                break;
            case 4:
            case 6:
                Status status = (Status) v8.c.a(parcel, Status.CREATOR);
                v8.c.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 7:
                Status status2 = (Status) v8.c.a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) v8.c.a(parcel, GoogleSignInAccount.CREATOR);
                v8.c.b(parcel);
                break;
            case 8:
                v8.c.b(parcel);
                v0 v0Var = (v0) this;
                v0Var.f16028c.post(new t0(v0Var, (k) v8.c.a(parcel, k.CREATOR), 0));
                break;
            case 9:
                g gVar = (g) v8.c.a(parcel, g.CREATOR);
                v8.c.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
