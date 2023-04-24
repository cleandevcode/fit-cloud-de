package o5;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: a */
    public final String f22779a;

    /* renamed from: b */
    public final String f22780b;

    /* renamed from: c */
    public final String f22781c;

    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            gm.l.f(parcel, "source");
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i10) {
            return new k[i10];
        }
    }

    public k(Parcel parcel) {
        gm.l.f(parcel, "parcel");
        String readString = parcel.readString();
        d6.n0.f(readString, "alg");
        this.f22779a = readString;
        String readString2 = parcel.readString();
        d6.n0.f(readString2, "typ");
        this.f22780b = readString2;
        String readString3 = parcel.readString();
        d6.n0.f(readString3, "kid");
        this.f22781c = readString3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x006d, code lost:
        if (r7 != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public k(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.String r0 = "typ"
            java.lang.String r1 = "kid"
            java.lang.String r2 = "alg"
            java.lang.String r3 = "encodedHeaderString"
            gm.l.f(r11, r3)
            r10.<init>()
            d6.n0.d(r11, r3)
            r3 = 0
            byte[] r4 = android.util.Base64.decode(r11, r3)
            java.lang.String r5 = "decodedBytes"
            gm.l.e(r4, r5)
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r7 = om.a.f23623a
            r6.<init>(r4, r7)
            r4 = 1
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: org.json.JSONException -> L70
            r7.<init>(r6)     // Catch: org.json.JSONException -> L70
            java.lang.String r6 = r7.optString(r2)     // Catch: org.json.JSONException -> L70
            gm.l.e(r6, r2)     // Catch: org.json.JSONException -> L70
            int r8 = r6.length()     // Catch: org.json.JSONException -> L70
            if (r8 <= 0) goto L37
            r8 = 1
            goto L38
        L37:
            r8 = 0
        L38:
            if (r8 == 0) goto L44
            java.lang.String r8 = "RS256"
            boolean r6 = gm.l.a(r6, r8)     // Catch: org.json.JSONException -> L70
            if (r6 == 0) goto L44
            r6 = 1
            goto L45
        L44:
            r6 = 0
        L45:
            java.lang.String r8 = r7.optString(r1)     // Catch: org.json.JSONException -> L70
            java.lang.String r9 = "jsonObj.optString(\"kid\")"
            gm.l.e(r8, r9)     // Catch: org.json.JSONException -> L70
            int r8 = r8.length()     // Catch: org.json.JSONException -> L70
            if (r8 <= 0) goto L56
            r8 = 1
            goto L57
        L56:
            r8 = 0
        L57:
            java.lang.String r7 = r7.optString(r0)     // Catch: org.json.JSONException -> L70
            java.lang.String r9 = "jsonObj.optString(\"typ\")"
            gm.l.e(r7, r9)     // Catch: org.json.JSONException -> L70
            int r7 = r7.length()     // Catch: org.json.JSONException -> L70
            if (r7 <= 0) goto L68
            r7 = 1
            goto L69
        L68:
            r7 = 0
        L69:
            if (r6 == 0) goto L70
            if (r8 == 0) goto L70
            if (r7 == 0) goto L70
            goto L71
        L70:
            r4 = 0
        L71:
            if (r4 == 0) goto La8
            byte[] r11 = android.util.Base64.decode(r11, r3)
            gm.l.e(r11, r5)
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = om.a.f23623a
            r3.<init>(r11, r4)
            org.json.JSONObject r11 = new org.json.JSONObject
            r11.<init>(r3)
            java.lang.String r2 = r11.getString(r2)
            java.lang.String r3 = "jsonObj.getString(\"alg\")"
            gm.l.e(r2, r3)
            r10.f22779a = r2
            java.lang.String r0 = r11.getString(r0)
            java.lang.String r2 = "jsonObj.getString(\"typ\")"
            gm.l.e(r0, r2)
            r10.f22780b = r0
            java.lang.String r11 = r11.getString(r1)
            java.lang.String r0 = "jsonObj.getString(\"kid\")"
            gm.l.e(r11, r0)
            r10.f22781c = r11
            return
        La8:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid Header"
            java.lang.String r0 = r0.toString()
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.k.<init>(java.lang.String):void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            return gm.l.a(this.f22779a, kVar.f22779a) && gm.l.a(this.f22780b, kVar.f22780b) && gm.l.a(this.f22781c, kVar.f22781c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22781c.hashCode() + i2.t.a(this.f22780b, i2.t.a(this.f22779a, 527, 31), 31);
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.f22779a);
        jSONObject.put("typ", this.f22780b);
        jSONObject.put("kid", this.f22781c);
        String jSONObject2 = jSONObject.toString();
        gm.l.e(jSONObject2, "headerJsonObject.toString()");
        return jSONObject2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        gm.l.f(parcel, "dest");
        parcel.writeString(this.f22779a);
        parcel.writeString(this.f22780b);
        parcel.writeString(this.f22781c);
    }
}
