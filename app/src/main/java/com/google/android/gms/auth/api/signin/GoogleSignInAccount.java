package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import d8.c;
import i8.p;
import j8.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import o8.b;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new c();

    /* renamed from: a */
    public final int f6003a;

    /* renamed from: b */
    public final String f6004b;

    /* renamed from: c */
    public final String f6005c;

    /* renamed from: d */
    public final String f6006d;

    /* renamed from: e */
    public final String f6007e;

    /* renamed from: f */
    public final Uri f6008f;

    /* renamed from: g */
    public String f6009g;

    /* renamed from: h */
    public final long f6010h;

    /* renamed from: i */
    public final String f6011i;

    /* renamed from: j */
    public final List f6012j;

    /* renamed from: k */
    public final String f6013k;

    /* renamed from: l */
    public final String f6014l;

    /* renamed from: m */
    public final HashSet f6015m = new HashSet();

    public GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, ArrayList arrayList, String str7, String str8) {
        this.f6003a = i10;
        this.f6004b = str;
        this.f6005c = str2;
        this.f6006d = str3;
        this.f6007e = str4;
        this.f6008f = uri;
        this.f6009g = str5;
        this.f6010h = j10;
        this.f6011i = str6;
        this.f6012j = arrayList;
        this.f6013k = str7;
        this.f6014l = str8;
    }

    public static GoogleSignInAccount f(String str) {
        Uri uri;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        if (!TextUtils.isEmpty(optString)) {
            uri = Uri.parse(optString);
        } else {
            uri = null;
        }
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(1, jSONArray.getString(i10)));
        }
        String optString2 = jSONObject.optString("id");
        if (jSONObject.has("tokenId")) {
            str2 = jSONObject.optString("tokenId");
        } else {
            str2 = null;
        }
        if (jSONObject.has("email")) {
            str3 = jSONObject.optString("email");
        } else {
            str3 = null;
        }
        if (jSONObject.has("displayName")) {
            str4 = jSONObject.optString("displayName");
        } else {
            str4 = null;
        }
        if (jSONObject.has("givenName")) {
            str5 = jSONObject.optString("givenName");
        } else {
            str5 = null;
        }
        if (jSONObject.has("familyName")) {
            str6 = jSONObject.optString("familyName");
        } else {
            str6 = null;
        }
        Long valueOf = Long.valueOf(parseLong);
        String string = jSONObject.getString("obfuscatedIdentifier");
        long longValue = valueOf.longValue();
        p.d(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, str2, str3, str4, uri, null, longValue, string, new ArrayList(hashSet), str5, str6);
        if (jSONObject.has("serverAuthCode")) {
            str7 = jSONObject.optString("serverAuthCode");
        } else {
            str7 = null;
        }
        googleSignInAccount.f6009g = str7;
        return googleSignInAccount;
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet(this.f6012j);
        hashSet.addAll(this.f6015m);
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof GoogleSignInAccount) {
            GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
            return googleSignInAccount.f6011i.equals(this.f6011i) && googleSignInAccount.e().equals(e());
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f6011i.hashCode() + 527) * 31) + e().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int F = b.F(parcel, 20293);
        b.z(parcel, 1, this.f6003a);
        b.C(parcel, 2, this.f6004b);
        b.C(parcel, 3, this.f6005c);
        b.C(parcel, 4, this.f6006d);
        b.C(parcel, 5, this.f6007e);
        b.B(parcel, 6, this.f6008f, i10);
        b.C(parcel, 7, this.f6009g);
        b.A(parcel, 8, this.f6010h);
        b.C(parcel, 9, this.f6011i);
        b.E(parcel, 10, this.f6012j);
        b.C(parcel, 11, this.f6013k);
        b.C(parcel, 12, this.f6014l);
        b.J(parcel, F);
    }
}
