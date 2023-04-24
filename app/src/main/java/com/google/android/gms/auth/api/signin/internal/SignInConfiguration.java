package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import e8.t;
import i8.p;
import j8.a;
import o8.b;

/* loaded from: classes.dex */
public final class SignInConfiguration extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new t();

    /* renamed from: a */
    public final String f6035a;

    /* renamed from: b */
    public GoogleSignInOptions f6036b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        p.d(str);
        this.f6035a = str;
        this.f6036b = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SignInConfiguration) {
            SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
            if (this.f6035a.equals(signInConfiguration.f6035a)) {
                GoogleSignInOptions googleSignInOptions = this.f6036b;
                GoogleSignInOptions googleSignInOptions2 = signInConfiguration.f6036b;
                if (googleSignInOptions == null) {
                    if (googleSignInOptions2 == null) {
                        return true;
                    }
                } else if (googleSignInOptions.equals(googleSignInOptions2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f6035a;
        int i10 = 1 * 31;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = i10 + hashCode;
        GoogleSignInOptions googleSignInOptions = this.f6036b;
        int i13 = i12 * 31;
        if (googleSignInOptions != null) {
            i11 = googleSignInOptions.hashCode();
        }
        return i13 + i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int F = b.F(parcel, 20293);
        b.C(parcel, 2, this.f6035a);
        b.B(parcel, 5, this.f6036b, i10);
        b.J(parcel, F);
    }
}
