package o5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* renamed from: a */
    public final String f22754a;

    /* renamed from: b */
    public final String f22755b;

    /* renamed from: c */
    public final String f22756c;

    /* renamed from: d */
    public final String f22757d;

    /* renamed from: e */
    public final long f22758e;

    /* renamed from: f */
    public final long f22759f;

    /* renamed from: g */
    public final String f22760g;

    /* renamed from: h */
    public final String f22761h;

    /* renamed from: i */
    public final String f22762i;

    /* renamed from: j */
    public final String f22763j;

    /* renamed from: k */
    public final String f22764k;

    /* renamed from: l */
    public final String f22765l;

    /* renamed from: m */
    public final String f22766m;

    /* renamed from: n */
    public final Set<String> f22767n;

    /* renamed from: o */
    public final String f22768o;

    /* renamed from: p */
    public final Map<String, Integer> f22769p;

    /* renamed from: q */
    public final Map<String, String> f22770q;

    /* renamed from: r */
    public final Map<String, String> f22771r;

    /* renamed from: s */
    public final String f22772s;

    /* renamed from: t */
    public final String f22773t;

    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            gm.l.f(parcel, "source");
            return new j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i10) {
            return new j[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public static String a(String str, JSONObject jSONObject) {
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
            return null;
        }
    }

    public j(Parcel parcel) {
        gm.l.f(parcel, "parcel");
        String readString = parcel.readString();
        d6.n0.f(readString, "jti");
        this.f22754a = readString;
        String readString2 = parcel.readString();
        d6.n0.f(readString2, "iss");
        this.f22755b = readString2;
        String readString3 = parcel.readString();
        d6.n0.f(readString3, "aud");
        this.f22756c = readString3;
        String readString4 = parcel.readString();
        d6.n0.f(readString4, "nonce");
        this.f22757d = readString4;
        this.f22758e = parcel.readLong();
        this.f22759f = parcel.readLong();
        String readString5 = parcel.readString();
        d6.n0.f(readString5, "sub");
        this.f22760g = readString5;
        this.f22761h = parcel.readString();
        this.f22762i = parcel.readString();
        this.f22763j = parcel.readString();
        this.f22764k = parcel.readString();
        this.f22765l = parcel.readString();
        this.f22766m = parcel.readString();
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        this.f22767n = createStringArrayList != null ? Collections.unmodifiableSet(new HashSet(createStringArrayList)) : null;
        this.f22768o = parcel.readString();
        HashMap readHashMap = parcel.readHashMap(gm.j.class.getClassLoader());
        readHashMap = readHashMap instanceof HashMap ? readHashMap : null;
        this.f22769p = readHashMap != null ? Collections.unmodifiableMap(readHashMap) : null;
        HashMap readHashMap2 = parcel.readHashMap(gm.d0.class.getClassLoader());
        readHashMap2 = readHashMap2 instanceof HashMap ? readHashMap2 : null;
        this.f22770q = readHashMap2 != null ? Collections.unmodifiableMap(readHashMap2) : null;
        HashMap readHashMap3 = parcel.readHashMap(gm.d0.class.getClassLoader());
        readHashMap3 = readHashMap3 instanceof HashMap ? readHashMap3 : null;
        this.f22771r = readHashMap3 != null ? Collections.unmodifiableMap(readHashMap3) : null;
        this.f22772s = parcel.readString();
        this.f22773t = parcel.readString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0081, code lost:
        if (gm.l.a(new java.net.URL(r4).getHost(), "www.facebook.com") == false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public j(java.lang.String r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.j.<init>(java.lang.String, java.lang.String):void");
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jti", this.f22754a);
        jSONObject.put("iss", this.f22755b);
        jSONObject.put("aud", this.f22756c);
        jSONObject.put("nonce", this.f22757d);
        jSONObject.put("exp", this.f22758e);
        jSONObject.put("iat", this.f22759f);
        String str = this.f22760g;
        if (str != null) {
            jSONObject.put("sub", str);
        }
        String str2 = this.f22761h;
        if (str2 != null) {
            jSONObject.put("name", str2);
        }
        String str3 = this.f22762i;
        if (str3 != null) {
            jSONObject.put("given_name", str3);
        }
        String str4 = this.f22763j;
        if (str4 != null) {
            jSONObject.put("middle_name", str4);
        }
        String str5 = this.f22764k;
        if (str5 != null) {
            jSONObject.put("family_name", str5);
        }
        String str6 = this.f22765l;
        if (str6 != null) {
            jSONObject.put("email", str6);
        }
        String str7 = this.f22766m;
        if (str7 != null) {
            jSONObject.put("picture", str7);
        }
        if (this.f22767n != null) {
            jSONObject.put("user_friends", new JSONArray((Collection) this.f22767n));
        }
        String str8 = this.f22768o;
        if (str8 != null) {
            jSONObject.put("user_birthday", str8);
        }
        if (this.f22769p != null) {
            jSONObject.put("user_age_range", new JSONObject(this.f22769p));
        }
        if (this.f22770q != null) {
            jSONObject.put("user_hometown", new JSONObject(this.f22770q));
        }
        if (this.f22771r != null) {
            jSONObject.put("user_location", new JSONObject(this.f22771r));
        }
        String str9 = this.f22772s;
        if (str9 != null) {
            jSONObject.put("user_gender", str9);
        }
        String str10 = this.f22773t;
        if (str10 != null) {
            jSONObject.put("user_link", str10);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return gm.l.a(this.f22754a, jVar.f22754a) && gm.l.a(this.f22755b, jVar.f22755b) && gm.l.a(this.f22756c, jVar.f22756c) && gm.l.a(this.f22757d, jVar.f22757d) && this.f22758e == jVar.f22758e && this.f22759f == jVar.f22759f && gm.l.a(this.f22760g, jVar.f22760g) && gm.l.a(this.f22761h, jVar.f22761h) && gm.l.a(this.f22762i, jVar.f22762i) && gm.l.a(this.f22763j, jVar.f22763j) && gm.l.a(this.f22764k, jVar.f22764k) && gm.l.a(this.f22765l, jVar.f22765l) && gm.l.a(this.f22766m, jVar.f22766m) && gm.l.a(this.f22767n, jVar.f22767n) && gm.l.a(this.f22768o, jVar.f22768o) && gm.l.a(this.f22769p, jVar.f22769p) && gm.l.a(this.f22770q, jVar.f22770q) && gm.l.a(this.f22771r, jVar.f22771r) && gm.l.a(this.f22772s, jVar.f22772s) && gm.l.a(this.f22773t, jVar.f22773t);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int a10 = i2.t.a(this.f22757d, i2.t.a(this.f22756c, i2.t.a(this.f22755b, i2.t.a(this.f22754a, 527, 31), 31), 31), 31);
        long j10 = this.f22758e;
        long j11 = this.f22759f;
        int a11 = i2.t.a(this.f22760g, (((a10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31, 31);
        String str = this.f22761h;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (a11 + hashCode) * 31;
        String str2 = this.f22762i;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        String str3 = this.f22763j;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str4 = this.f22764k;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        String str5 = this.f22765l;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        String str6 = this.f22766m;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i16 = (i15 + hashCode6) * 31;
        Set<String> set = this.f22767n;
        if (set == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = set.hashCode();
        }
        int i17 = (i16 + hashCode7) * 31;
        String str7 = this.f22768o;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i18 = (i17 + hashCode8) * 31;
        Map<String, Integer> map = this.f22769p;
        if (map == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = map.hashCode();
        }
        int i19 = (i18 + hashCode9) * 31;
        Map<String, String> map2 = this.f22770q;
        if (map2 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = map2.hashCode();
        }
        int i20 = (i19 + hashCode10) * 31;
        Map<String, String> map3 = this.f22771r;
        if (map3 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = map3.hashCode();
        }
        int i21 = (i20 + hashCode11) * 31;
        String str8 = this.f22772s;
        if (str8 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str8.hashCode();
        }
        int i22 = (i21 + hashCode12) * 31;
        String str9 = this.f22773t;
        if (str9 != null) {
            i10 = str9.hashCode();
        }
        return i22 + i10;
    }

    public final String toString() {
        String jSONObject = a().toString();
        gm.l.e(jSONObject, "claimsJsonObject.toString()");
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        gm.l.f(parcel, "dest");
        parcel.writeString(this.f22754a);
        parcel.writeString(this.f22755b);
        parcel.writeString(this.f22756c);
        parcel.writeString(this.f22757d);
        parcel.writeLong(this.f22758e);
        parcel.writeLong(this.f22759f);
        parcel.writeString(this.f22760g);
        parcel.writeString(this.f22761h);
        parcel.writeString(this.f22762i);
        parcel.writeString(this.f22763j);
        parcel.writeString(this.f22764k);
        parcel.writeString(this.f22765l);
        parcel.writeString(this.f22766m);
        parcel.writeStringList(this.f22767n == null ? null : new ArrayList(this.f22767n));
        parcel.writeString(this.f22768o);
        parcel.writeMap(this.f22769p);
        parcel.writeMap(this.f22770q);
        parcel.writeMap(this.f22771r);
        parcel.writeString(this.f22772s);
        parcel.writeString(this.f22773t);
    }
}
