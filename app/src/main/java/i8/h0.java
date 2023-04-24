package i8;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes.dex */
public final class h0 extends j8.a {
    public static final Parcelable.Creator<h0> CREATOR = new i0();

    /* renamed from: a */
    public final int f16670a;

    /* renamed from: b */
    public final Account f16671b;

    /* renamed from: c */
    public final int f16672c;

    /* renamed from: d */
    public final GoogleSignInAccount f16673d;

    public h0(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f16670a = i10;
        this.f16671b = account;
        this.f16672c = i11;
        this.f16673d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int F = o8.b.F(parcel, 20293);
        o8.b.z(parcel, 1, this.f16670a);
        o8.b.B(parcel, 2, this.f16671b, i10);
        o8.b.z(parcel, 3, this.f16672c);
        o8.b.B(parcel, 4, this.f16673d, i10);
        o8.b.J(parcel, F);
    }
}
