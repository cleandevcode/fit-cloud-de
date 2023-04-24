package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import d8.d;
import d8.e;
import g8.a;
import j8.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import o8.b;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class GoogleSignInOptions extends a implements a.c, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* renamed from: l */
    public static final GoogleSignInOptions f6016l;

    /* renamed from: m */
    public static final Scope f6017m;

    /* renamed from: n */
    public static final Scope f6018n;

    /* renamed from: o */
    public static final Scope f6019o;

    /* renamed from: p */
    public static final d f6020p;

    /* renamed from: a */
    public final int f6021a;

    /* renamed from: b */
    public final ArrayList f6022b;

    /* renamed from: c */
    public Account f6023c;

    /* renamed from: d */
    public boolean f6024d;

    /* renamed from: e */
    public final boolean f6025e;

    /* renamed from: f */
    public final boolean f6026f;

    /* renamed from: g */
    public String f6027g;

    /* renamed from: h */
    public String f6028h;

    /* renamed from: i */
    public ArrayList f6029i;

    /* renamed from: j */
    public String f6030j;

    /* renamed from: k */
    public Map f6031k;

    static {
        Scope scope = new Scope(1, "profile");
        new Scope(1, "email");
        Scope scope2 = new Scope(1, "openid");
        f6017m = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        f6018n = scope3;
        f6019o = new Scope(1, "https://www.googleapis.com/auth/games");
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(f6019o)) {
            Scope scope4 = f6018n;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        f6016l = new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, hashMap, null);
        HashSet hashSet2 = new HashSet();
        HashMap hashMap2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(f6019o)) {
            Scope scope5 = f6018n;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet2), null, false, false, false, null, null, hashMap2, null);
        CREATOR = new e();
        f6020p = new d();
    }

    public GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, Map map, String str3) {
        this.f6021a = i10;
        this.f6022b = arrayList;
        this.f6023c = account;
        this.f6024d = z10;
        this.f6025e = z11;
        this.f6026f = z12;
        this.f6027g = str;
        this.f6028h = str2;
        this.f6029i = new ArrayList(map.values());
        this.f6031k = map;
        this.f6030j = str3;
    }

    public static GoogleSignInOptions e(String str) {
        String str2;
        Account account;
        String str3;
        String str4 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(1, jSONArray.getString(i10)));
        }
        if (jSONObject.has("accountName")) {
            str2 = jSONObject.optString("accountName");
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            account = new Account(str2, "com.google");
        } else {
            account = null;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        boolean z10 = jSONObject.getBoolean("idTokenRequested");
        boolean z11 = jSONObject.getBoolean("serverAuthRequested");
        boolean z12 = jSONObject.getBoolean("forceCodeForRefreshToken");
        if (jSONObject.has("serverClientId")) {
            str3 = jSONObject.optString("serverClientId");
        } else {
            str3 = null;
        }
        if (jSONObject.has("hostedDomain")) {
            str4 = jSONObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, arrayList, account, z10, z11, z12, str3, str4, new HashMap(), null);
    }

    public static HashMap f(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        if (arrayList == null) {
            return hashMap;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            e8.a aVar = (e8.a) it.next();
            hashMap.put(Integer.valueOf(aVar.f13486b), aVar);
        }
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x004a, code lost:
        if (r1.equals(r5.f6023c) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r5 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r5     // Catch: java.lang.ClassCastException -> L86
            java.util.ArrayList r1 = r4.f6029i     // Catch: java.lang.ClassCastException -> L86
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L86
            if (r1 > 0) goto L86
            java.util.ArrayList r1 = r5.f6029i     // Catch: java.lang.ClassCastException -> L86
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L86
            if (r1 <= 0) goto L18
            goto L86
        L18:
            java.util.ArrayList r1 = r4.f6022b     // Catch: java.lang.ClassCastException -> L86
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L86
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.ClassCastException -> L86
            java.util.ArrayList r3 = r5.f6022b     // Catch: java.lang.ClassCastException -> L86
            r2.<init>(r3)     // Catch: java.lang.ClassCastException -> L86
            int r2 = r2.size()     // Catch: java.lang.ClassCastException -> L86
            if (r1 != r2) goto L86
            java.util.ArrayList r1 = r4.f6022b     // Catch: java.lang.ClassCastException -> L86
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.ClassCastException -> L86
            java.util.ArrayList r3 = r5.f6022b     // Catch: java.lang.ClassCastException -> L86
            r2.<init>(r3)     // Catch: java.lang.ClassCastException -> L86
            boolean r1 = r1.containsAll(r2)     // Catch: java.lang.ClassCastException -> L86
            if (r1 != 0) goto L3b
            goto L86
        L3b:
            android.accounts.Account r1 = r4.f6023c     // Catch: java.lang.ClassCastException -> L86
            if (r1 != 0) goto L44
            android.accounts.Account r1 = r5.f6023c     // Catch: java.lang.ClassCastException -> L86
            if (r1 != 0) goto L86
            goto L4c
        L44:
            android.accounts.Account r2 = r5.f6023c     // Catch: java.lang.ClassCastException -> L86
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L86
            if (r1 == 0) goto L86
        L4c:
            java.lang.String r1 = r4.f6027g     // Catch: java.lang.ClassCastException -> L86
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L86
            if (r1 == 0) goto L5d
            java.lang.String r1 = r5.f6027g     // Catch: java.lang.ClassCastException -> L86
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L86
            if (r1 == 0) goto L86
            goto L68
        L5d:
            java.lang.String r1 = r4.f6027g     // Catch: java.lang.ClassCastException -> L86
            java.lang.String r2 = r5.f6027g     // Catch: java.lang.ClassCastException -> L86
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L86
            if (r1 != 0) goto L68
            goto L86
        L68:
            boolean r1 = r4.f6026f     // Catch: java.lang.ClassCastException -> L86
            boolean r2 = r5.f6026f     // Catch: java.lang.ClassCastException -> L86
            if (r1 != r2) goto L86
            boolean r1 = r4.f6024d     // Catch: java.lang.ClassCastException -> L86
            boolean r2 = r5.f6024d     // Catch: java.lang.ClassCastException -> L86
            if (r1 != r2) goto L86
            boolean r1 = r4.f6025e     // Catch: java.lang.ClassCastException -> L86
            boolean r2 = r5.f6025e     // Catch: java.lang.ClassCastException -> L86
            if (r1 != r2) goto L86
            java.lang.String r1 = r4.f6030j     // Catch: java.lang.ClassCastException -> L86
            java.lang.String r5 = r5.f6030j     // Catch: java.lang.ClassCastException -> L86
            boolean r5 = android.text.TextUtils.equals(r1, r5)     // Catch: java.lang.ClassCastException -> L86
            if (r5 == 0) goto L86
            r5 = 1
            return r5
        L86:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f6022b;
        int size = arrayList2.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(((Scope) arrayList2.get(i11)).f6050b);
        }
        Collections.sort(arrayList);
        Account account = this.f6023c;
        int hashCode3 = (arrayList.hashCode() + (1 * 31)) * 31;
        if (account == null) {
            hashCode = 0;
        } else {
            hashCode = account.hashCode();
        }
        int i12 = hashCode3 + hashCode;
        String str = this.f6027g;
        int i13 = i12 * 31;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i14 = ((((((i13 + hashCode2) * 31) + (this.f6026f ? 1 : 0)) * 31) + (this.f6024d ? 1 : 0)) * 31) + (this.f6025e ? 1 : 0);
        String str2 = this.f6030j;
        int i15 = i14 * 31;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i15 + i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int F = b.F(parcel, 20293);
        b.z(parcel, 1, this.f6021a);
        b.E(parcel, 2, new ArrayList(this.f6022b));
        b.B(parcel, 3, this.f6023c, i10);
        b.t(parcel, 4, this.f6024d);
        b.t(parcel, 5, this.f6025e);
        b.t(parcel, 6, this.f6026f);
        b.C(parcel, 7, this.f6027g);
        b.C(parcel, 8, this.f6028h);
        b.E(parcel, 9, this.f6029i);
        b.C(parcel, 10, this.f6030j);
        b.J(parcel, F);
    }
}
