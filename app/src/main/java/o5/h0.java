package o5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import d6.m0;
import java.util.Date;
import o5.a;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h0 implements Parcelable {

    /* renamed from: a */
    public final String f22745a;

    /* renamed from: b */
    public final String f22746b;

    /* renamed from: c */
    public final String f22747c;

    /* renamed from: d */
    public final String f22748d;

    /* renamed from: e */
    public final String f22749e;

    /* renamed from: f */
    public final Uri f22750f;

    /* renamed from: g */
    public final Uri f22751g;

    /* renamed from: h */
    public static final String f22744h = h0.class.getSimpleName();
    public static final Parcelable.Creator<h0> CREATOR = new a();

    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<h0> {
        @Override // android.os.Parcelable.Creator
        public final h0 createFromParcel(Parcel parcel) {
            gm.l.f(parcel, "source");
            return new h0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final h0[] newArray(int i10) {
            return new h0[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* loaded from: classes.dex */
        public static final class a implements m0.a {
            @Override // d6.m0.a
            public final void a(p pVar) {
                Log.e(h0.f22744h, gm.l.k(pVar, "Got unexpected exception: "));
            }

            @Override // d6.m0.a
            public final void b(JSONObject jSONObject) {
                String optString;
                Uri uri;
                Uri uri2 = null;
                if (jSONObject == null) {
                    optString = null;
                } else {
                    optString = jSONObject.optString("id");
                }
                if (optString == null) {
                    Log.w(h0.f22744h, "No user ID returned on Me request");
                    return;
                }
                String optString2 = jSONObject.optString("link");
                String optString3 = jSONObject.optString("profile_picture", null);
                String optString4 = jSONObject.optString("first_name");
                String optString5 = jSONObject.optString("middle_name");
                String optString6 = jSONObject.optString("last_name");
                String optString7 = jSONObject.optString("name");
                if (optString2 != null) {
                    uri = Uri.parse(optString2);
                } else {
                    uri = null;
                }
                if (optString3 != null) {
                    uri2 = Uri.parse(optString3);
                }
                j0.f22774d.a().a(new h0(optString, optString4, optString5, optString6, optString7, uri, uri2), true);
            }
        }

        public static void a() {
            Date date = o5.a.f22664l;
            o5.a b10 = a.c.b();
            if (b10 == null) {
                return;
            }
            if (!a.c.c()) {
                j0.f22774d.a().a(null, true);
                return;
            }
            d6.m0 m0Var = d6.m0.f12709a;
            d6.m0.p(new a(), b10.f22671e);
        }
    }

    public h0(Parcel parcel) {
        this.f22745a = parcel.readString();
        this.f22746b = parcel.readString();
        this.f22747c = parcel.readString();
        this.f22748d = parcel.readString();
        this.f22749e = parcel.readString();
        String readString = parcel.readString();
        this.f22750f = readString == null ? null : Uri.parse(readString);
        String readString2 = parcel.readString();
        this.f22751g = readString2 != null ? Uri.parse(readString2) : null;
    }

    public h0(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2) {
        d6.n0.f(str, "id");
        this.f22745a = str;
        this.f22746b = str2;
        this.f22747c = str3;
        this.f22748d = str4;
        this.f22749e = str5;
        this.f22750f = uri;
        this.f22751g = uri2;
    }

    public h0(JSONObject jSONObject) {
        this.f22745a = jSONObject.optString("id", null);
        this.f22746b = jSONObject.optString("first_name", null);
        this.f22747c = jSONObject.optString("middle_name", null);
        this.f22748d = jSONObject.optString("last_name", null);
        this.f22749e = jSONObject.optString("name", null);
        String optString = jSONObject.optString("link_uri", null);
        this.f22750f = optString == null ? null : Uri.parse(optString);
        String optString2 = jSONObject.optString("picture_uri", null);
        this.f22751g = optString2 != null ? Uri.parse(optString2) : null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        Uri uri;
        Uri uri2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof h0) {
            String str5 = this.f22745a;
            return ((str5 == null && ((h0) obj).f22745a == null) || gm.l.a(str5, ((h0) obj).f22745a)) && (((str = this.f22746b) == null && ((h0) obj).f22746b == null) || gm.l.a(str, ((h0) obj).f22746b)) && ((((str2 = this.f22747c) == null && ((h0) obj).f22747c == null) || gm.l.a(str2, ((h0) obj).f22747c)) && ((((str3 = this.f22748d) == null && ((h0) obj).f22748d == null) || gm.l.a(str3, ((h0) obj).f22748d)) && ((((str4 = this.f22749e) == null && ((h0) obj).f22749e == null) || gm.l.a(str4, ((h0) obj).f22749e)) && ((((uri = this.f22750f) == null && ((h0) obj).f22750f == null) || gm.l.a(uri, ((h0) obj).f22750f)) && (((uri2 = this.f22751g) == null && ((h0) obj).f22751g == null) || gm.l.a(uri2, ((h0) obj).f22751g))))));
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f22745a;
        int hashCode = 527 + (str != null ? str.hashCode() : 0);
        String str2 = this.f22746b;
        if (str2 != null) {
            hashCode = (hashCode * 31) + str2.hashCode();
        }
        String str3 = this.f22747c;
        if (str3 != null) {
            hashCode = (hashCode * 31) + str3.hashCode();
        }
        String str4 = this.f22748d;
        if (str4 != null) {
            hashCode = (hashCode * 31) + str4.hashCode();
        }
        String str5 = this.f22749e;
        if (str5 != null) {
            hashCode = (hashCode * 31) + str5.hashCode();
        }
        Uri uri = this.f22750f;
        if (uri != null) {
            hashCode = (hashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.f22751g;
        return uri2 != null ? (hashCode * 31) + uri2.hashCode() : hashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        gm.l.f(parcel, "dest");
        parcel.writeString(this.f22745a);
        parcel.writeString(this.f22746b);
        parcel.writeString(this.f22747c);
        parcel.writeString(this.f22748d);
        parcel.writeString(this.f22749e);
        Uri uri = this.f22750f;
        parcel.writeString(uri == null ? null : uri.toString());
        Uri uri2 = this.f22751g;
        parcel.writeString(uri2 != null ? uri2.toString() : null);
    }
}
