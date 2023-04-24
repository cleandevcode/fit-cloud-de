package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import d8.f;
import i8.p;
import j8.a;
import o8.b;

/* loaded from: classes.dex */
public class SignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new f();
    @Deprecated

    /* renamed from: a */
    public String f6032a;

    /* renamed from: b */
    public GoogleSignInAccount f6033b;
    @Deprecated

    /* renamed from: c */
    public String f6034c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f6033b = googleSignInAccount;
        p.e("8.3 and 8.4 SDKs require non-null email", str);
        this.f6032a = str;
        p.e("8.3 and 8.4 SDKs require non-null userId", str2);
        this.f6034c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int F = b.F(parcel, 20293);
        b.C(parcel, 4, this.f6032a);
        b.B(parcel, 7, this.f6033b, i10);
        b.C(parcel, 8, this.f6034c);
        b.J(parcel, F);
    }
}
