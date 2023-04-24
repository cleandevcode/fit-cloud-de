package o5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a implements Parcelable {

    /* renamed from: a */
    public final Date f22667a;

    /* renamed from: b */
    public final Set<String> f22668b;

    /* renamed from: c */
    public final Set<String> f22669c;

    /* renamed from: d */
    public final Set<String> f22670d;

    /* renamed from: e */
    public final String f22671e;

    /* renamed from: f */
    public final g f22672f;

    /* renamed from: g */
    public final Date f22673g;

    /* renamed from: h */
    public final String f22674h;

    /* renamed from: i */
    public final String f22675i;

    /* renamed from: j */
    public final Date f22676j;

    /* renamed from: k */
    public final String f22677k;

    /* renamed from: l */
    public static final Date f22664l = new Date(Long.MAX_VALUE);

    /* renamed from: m */
    public static final Date f22665m = new Date();

    /* renamed from: n */
    public static final g f22666n = g.f22721b;
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: o5.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0407a {
        void a();

        void b();
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            gm.l.f(parcel, "source");
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public static a a(JSONObject jSONObject) {
            if (jSONObject.getInt(WiseOpenHianalyticsData.UNION_VERSION) <= 1) {
                String string = jSONObject.getString("token");
                Date date = new Date(jSONObject.getLong("expires_at"));
                JSONArray jSONArray = jSONObject.getJSONArray("permissions");
                JSONArray jSONArray2 = jSONObject.getJSONArray("declined_permissions");
                JSONArray optJSONArray = jSONObject.optJSONArray("expired_permissions");
                Date date2 = new Date(jSONObject.getLong("last_refresh"));
                String string2 = jSONObject.getString("source");
                gm.l.e(string2, "jsonObject.getString(SOURCE_KEY)");
                g valueOf = g.valueOf(string2);
                String string3 = jSONObject.getString("application_id");
                String string4 = jSONObject.getString("user_id");
                Date date3 = new Date(jSONObject.optLong("data_access_expiration_time", 0L));
                String optString = jSONObject.optString("graph_domain", null);
                gm.l.e(string, "token");
                gm.l.e(string3, "applicationId");
                gm.l.e(string4, "userId");
                d6.m0 m0Var = d6.m0.f12709a;
                gm.l.e(jSONArray, "permissionsArray");
                ArrayList C = d6.m0.C(jSONArray);
                gm.l.e(jSONArray2, "declinedPermissionsArray");
                return new a(string, string3, string4, C, d6.m0.C(jSONArray2), optJSONArray == null ? new ArrayList() : d6.m0.C(optJSONArray), valueOf, date, date2, date3, optString);
            }
            throw new p("Unknown AccessToken serialization format.");
        }

        public static a b() {
            return f.f22706f.a().f22710c;
        }

        public static boolean c() {
            a aVar = f.f22706f.a().f22710c;
            if (aVar != null && !new Date().after(aVar.f22667a)) {
                return true;
            }
            return false;
        }
    }

    public a(Parcel parcel) {
        gm.l.f(parcel, "parcel");
        this.f22667a = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        gm.l.e(unmodifiableSet, "unmodifiableSet(HashSet(permissionsList))");
        this.f22668b = unmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        gm.l.e(unmodifiableSet2, "unmodifiableSet(HashSet(permissionsList))");
        this.f22669c = unmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        gm.l.e(unmodifiableSet3, "unmodifiableSet(HashSet(permissionsList))");
        this.f22670d = unmodifiableSet3;
        String readString = parcel.readString();
        d6.n0.f(readString, "token");
        this.f22671e = readString;
        String readString2 = parcel.readString();
        this.f22672f = readString2 != null ? g.valueOf(readString2) : f22666n;
        this.f22673g = new Date(parcel.readLong());
        String readString3 = parcel.readString();
        d6.n0.f(readString3, "applicationId");
        this.f22674h = readString3;
        String readString4 = parcel.readString();
        d6.n0.f(readString4, "userId");
        this.f22675i = readString4;
        this.f22676j = new Date(parcel.readLong());
        this.f22677k = parcel.readString();
    }

    public /* synthetic */ a(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, g gVar, Date date, Date date2, Date date3) {
        this(str, str2, str3, collection, collection2, collection3, gVar, date, date2, date3, "facebook");
    }

    public a(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, g gVar, Date date, Date date2, Date date3, String str4) {
        gm.l.f(str, "accessToken");
        gm.l.f(str2, "applicationId");
        gm.l.f(str3, "userId");
        d6.n0.d(str, "accessToken");
        d6.n0.d(str2, "applicationId");
        d6.n0.d(str3, "userId");
        this.f22667a = date == null ? f22664l : date;
        Set<String> unmodifiableSet = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        gm.l.e(unmodifiableSet, "unmodifiableSet(if (permissions != null) HashSet(permissions) else HashSet())");
        this.f22668b = unmodifiableSet;
        Set<String> unmodifiableSet2 = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        gm.l.e(unmodifiableSet2, "unmodifiableSet(\n            if (declinedPermissions != null) HashSet(declinedPermissions) else HashSet())");
        this.f22669c = unmodifiableSet2;
        Set<String> unmodifiableSet3 = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        gm.l.e(unmodifiableSet3, "unmodifiableSet(\n            if (expiredPermissions != null) HashSet(expiredPermissions) else HashSet())");
        this.f22670d = unmodifiableSet3;
        this.f22671e = str;
        gVar = gVar == null ? f22666n : gVar;
        if (str4 != null && str4.equals("instagram")) {
            int ordinal = gVar.ordinal();
            if (ordinal == 1) {
                gVar = g.f22726g;
            } else if (ordinal == 4) {
                gVar = g.f22728i;
            } else if (ordinal == 5) {
                gVar = g.f22727h;
            }
        }
        this.f22672f = gVar;
        this.f22673g = date2 == null ? f22665m : date2;
        this.f22674h = str2;
        this.f22675i = str3;
        this.f22676j = (date3 == null || date3.getTime() == 0) ? f22664l : date3;
        this.f22677k = str4 == null ? "facebook" : str4;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(WiseOpenHianalyticsData.UNION_VERSION, 1);
        jSONObject.put("token", this.f22671e);
        jSONObject.put("expires_at", this.f22667a.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.f22668b));
        jSONObject.put("declined_permissions", new JSONArray((Collection) this.f22669c));
        jSONObject.put("expired_permissions", new JSONArray((Collection) this.f22670d));
        jSONObject.put("last_refresh", this.f22673g.getTime());
        jSONObject.put("source", this.f22672f.name());
        jSONObject.put("application_id", this.f22674h);
        jSONObject.put("user_id", this.f22675i);
        jSONObject.put("data_access_expiration_time", this.f22676j.getTime());
        String str = this.f22677k;
        if (str != null) {
            jSONObject.put("graph_domain", str);
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
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (gm.l.a(this.f22667a, aVar.f22667a) && gm.l.a(this.f22668b, aVar.f22668b) && gm.l.a(this.f22669c, aVar.f22669c) && gm.l.a(this.f22670d, aVar.f22670d) && gm.l.a(this.f22671e, aVar.f22671e) && this.f22672f == aVar.f22672f && gm.l.a(this.f22673g, aVar.f22673g) && gm.l.a(this.f22674h, aVar.f22674h) && gm.l.a(this.f22675i, aVar.f22675i) && gm.l.a(this.f22676j, aVar.f22676j)) {
                String str = this.f22677k;
                String str2 = aVar.f22677k;
                if (str == null ? str2 == null : gm.l.a(str, str2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f22668b.hashCode();
        int hashCode3 = this.f22669c.hashCode();
        int hashCode4 = this.f22670d.hashCode();
        int a10 = i2.t.a(this.f22671e, (hashCode4 + ((hashCode3 + ((hashCode2 + ((this.f22667a.hashCode() + 527) * 31)) * 31)) * 31)) * 31, 31);
        int hashCode5 = this.f22673g.hashCode();
        int hashCode6 = (this.f22676j.hashCode() + i2.t.a(this.f22675i, i2.t.a(this.f22674h, (hashCode5 + ((this.f22672f.hashCode() + a10) * 31)) * 31, 31), 31)) * 31;
        String str = this.f22677k;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode6 + hashCode;
    }

    public final String toString() {
        StringBuilder a10 = p.a.a("{AccessToken", " token:");
        v vVar = v.f22837a;
        v.i(g0.INCLUDE_ACCESS_TOKENS);
        a10.append("ACCESS_TOKEN_REMOVED");
        a10.append(" permissions:");
        a10.append("[");
        a10.append(TextUtils.join(", ", this.f22668b));
        a10.append("]");
        a10.append("}");
        String sb2 = a10.toString();
        gm.l.e(sb2, "builder.toString()");
        return sb2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        gm.l.f(parcel, "dest");
        parcel.writeLong(this.f22667a.getTime());
        parcel.writeStringList(new ArrayList(this.f22668b));
        parcel.writeStringList(new ArrayList(this.f22669c));
        parcel.writeStringList(new ArrayList(this.f22670d));
        parcel.writeString(this.f22671e);
        parcel.writeString(this.f22672f.name());
        parcel.writeLong(this.f22673g.getTime());
        parcel.writeString(this.f22674h);
        parcel.writeString(this.f22675i);
        parcel.writeLong(this.f22676j.getTime());
        parcel.writeString(this.f22677k);
    }
}
