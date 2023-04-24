package n6;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.common.R;
import d6.m0;
import d6.n0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import n6.s;
import n6.v;
import o5.a;
import org.json.JSONObject;
import s.r0;

/* loaded from: classes.dex */
public final class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new b();

    /* renamed from: a */
    public w[] f22111a;

    /* renamed from: b */
    public int f22112b;

    /* renamed from: c */
    public androidx.fragment.app.r f22113c;

    /* renamed from: d */
    public c f22114d;

    /* renamed from: e */
    public a f22115e;

    /* renamed from: f */
    public boolean f22116f;

    /* renamed from: g */
    public d f22117g;

    /* renamed from: h */
    public Map<String, String> f22118h;

    /* renamed from: i */
    public LinkedHashMap f22119i;

    /* renamed from: j */
    public s f22120j;

    /* renamed from: k */
    public int f22121k;

    /* renamed from: l */
    public int f22122l;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b();
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable.Creator<p> {
        @Override // android.os.Parcelable.Creator
        public final p createFromParcel(Parcel parcel) {
            gm.l.f(parcel, "source");
            return new p(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final p[] newArray(int i10) {
            return new p[i10];
        }
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    /* loaded from: classes.dex */
    public static final class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a */
        public final o f22123a;

        /* renamed from: b */
        public Set<String> f22124b;

        /* renamed from: c */
        public final n6.d f22125c;

        /* renamed from: d */
        public final String f22126d;

        /* renamed from: e */
        public String f22127e;

        /* renamed from: f */
        public boolean f22128f;

        /* renamed from: g */
        public String f22129g;

        /* renamed from: h */
        public String f22130h;

        /* renamed from: i */
        public String f22131i;

        /* renamed from: j */
        public String f22132j;

        /* renamed from: k */
        public boolean f22133k;

        /* renamed from: l */
        public final y f22134l;

        /* renamed from: m */
        public boolean f22135m;

        /* renamed from: n */
        public boolean f22136n;

        /* renamed from: o */
        public final String f22137o;

        /* renamed from: p */
        public final String f22138p;

        /* renamed from: q */
        public final String f22139q;

        /* renamed from: r */
        public final n6.a f22140r;

        /* loaded from: classes.dex */
        public static final class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                gm.l.f(parcel, "source");
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d(Parcel parcel) {
            String str = n0.f12718a;
            String readString = parcel.readString();
            n0.f(readString, "loginBehavior");
            this.f22123a = o.valueOf(readString);
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.f22124b = new HashSet(arrayList);
            String readString2 = parcel.readString();
            this.f22125c = readString2 != null ? n6.d.valueOf(readString2) : n6.d.NONE;
            String readString3 = parcel.readString();
            n0.f(readString3, "applicationId");
            this.f22126d = readString3;
            String readString4 = parcel.readString();
            n0.f(readString4, "authId");
            this.f22127e = readString4;
            this.f22128f = parcel.readByte() != 0;
            this.f22129g = parcel.readString();
            String readString5 = parcel.readString();
            n0.f(readString5, "authType");
            this.f22130h = readString5;
            this.f22131i = parcel.readString();
            this.f22132j = parcel.readString();
            this.f22133k = parcel.readByte() != 0;
            String readString6 = parcel.readString();
            this.f22134l = readString6 != null ? y.valueOf(readString6) : y.FACEBOOK;
            this.f22135m = parcel.readByte() != 0;
            this.f22136n = parcel.readByte() != 0;
            String readString7 = parcel.readString();
            n0.f(readString7, "nonce");
            this.f22137o = readString7;
            this.f22138p = parcel.readString();
            this.f22139q = parcel.readString();
            String readString8 = parcel.readString();
            this.f22140r = readString8 == null ? null : n6.a.valueOf(readString8);
        }

        public d(o oVar, Set<String> set, n6.d dVar, String str, String str2, String str3, y yVar, String str4, String str5, String str6, n6.a aVar) {
            gm.l.f(oVar, "loginBehavior");
            gm.l.f(dVar, "defaultAudience");
            gm.l.f(str, "authType");
            this.f22123a = oVar;
            this.f22124b = set;
            this.f22125c = dVar;
            this.f22130h = str;
            this.f22126d = str2;
            this.f22127e = str3;
            this.f22134l = yVar == null ? y.FACEBOOK : yVar;
            if (str4 != null) {
                if (!(str4.length() == 0)) {
                    this.f22137o = str4;
                    this.f22138p = str5;
                    this.f22139q = str6;
                    this.f22140r = aVar;
                }
            }
            String uuid = UUID.randomUUID().toString();
            gm.l.e(uuid, "randomUUID().toString()");
            this.f22137o = uuid;
            this.f22138p = str5;
            this.f22139q = str6;
            this.f22140r = aVar;
        }

        public final boolean a() {
            boolean z10;
            Iterator<String> it = this.f22124b.iterator();
            do {
                z10 = false;
                if (!it.hasNext()) {
                    return false;
                }
                String next = it.next();
                v.a aVar = v.f22170f;
                if (next != null && (om.h.a0(next, "publish", false) || om.h.a0(next, "manage", false) || v.f22171g.contains(next))) {
                    z10 = true;
                    continue;
                }
            } while (!z10);
            return true;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            gm.l.f(parcel, "dest");
            parcel.writeString(this.f22123a.name());
            parcel.writeStringList(new ArrayList(this.f22124b));
            parcel.writeString(this.f22125c.name());
            parcel.writeString(this.f22126d);
            parcel.writeString(this.f22127e);
            parcel.writeByte(this.f22128f ? (byte) 1 : (byte) 0);
            parcel.writeString(this.f22129g);
            parcel.writeString(this.f22130h);
            parcel.writeString(this.f22131i);
            parcel.writeString(this.f22132j);
            parcel.writeByte(this.f22133k ? (byte) 1 : (byte) 0);
            parcel.writeString(this.f22134l.name());
            parcel.writeByte(this.f22135m ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f22136n ? (byte) 1 : (byte) 0);
            parcel.writeString(this.f22137o);
            parcel.writeString(this.f22138p);
            parcel.writeString(this.f22139q);
            n6.a aVar = this.f22140r;
            parcel.writeString(aVar == null ? null : aVar.name());
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new b();

        /* renamed from: a */
        public final a f22141a;

        /* renamed from: b */
        public final o5.a f22142b;

        /* renamed from: c */
        public final o5.h f22143c;

        /* renamed from: d */
        public final String f22144d;

        /* renamed from: e */
        public final String f22145e;

        /* renamed from: f */
        public final d f22146f;

        /* renamed from: g */
        public Map<String, String> f22147g;

        /* renamed from: h */
        public HashMap f22148h;

        /* loaded from: classes.dex */
        public enum a {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR("error");
            

            /* renamed from: a */
            public final String f22153a;

            a(String str) {
                this.f22153a = str;
            }

            /* renamed from: values  reason: to resolve conflict with enum method */
            public static a[] valuesCustom() {
                return (a[]) Arrays.copyOf(values(), 3);
            }
        }

        /* loaded from: classes.dex */
        public static final class b implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public final e createFromParcel(Parcel parcel) {
                gm.l.f(parcel, "source");
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final e[] newArray(int i10) {
                return new e[i10];
            }
        }

        public e(Parcel parcel) {
            String readString = parcel.readString();
            this.f22141a = a.valueOf(readString == null ? "error" : readString);
            this.f22142b = (o5.a) parcel.readParcelable(o5.a.class.getClassLoader());
            this.f22143c = (o5.h) parcel.readParcelable(o5.h.class.getClassLoader());
            this.f22144d = parcel.readString();
            this.f22145e = parcel.readString();
            this.f22146f = (d) parcel.readParcelable(d.class.getClassLoader());
            this.f22147g = m0.K(parcel);
            this.f22148h = m0.K(parcel);
        }

        public e(d dVar, a aVar, o5.a aVar2, String str, String str2) {
            this(dVar, aVar, aVar2, null, str, str2);
        }

        public e(d dVar, a aVar, o5.a aVar2, o5.h hVar, String str, String str2) {
            this.f22146f = dVar;
            this.f22142b = aVar2;
            this.f22143c = hVar;
            this.f22144d = str;
            this.f22141a = aVar;
            this.f22145e = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            gm.l.f(parcel, "dest");
            parcel.writeString(this.f22141a.name());
            parcel.writeParcelable(this.f22142b, i10);
            parcel.writeParcelable(this.f22143c, i10);
            parcel.writeString(this.f22144d);
            parcel.writeString(this.f22145e);
            parcel.writeParcelable(this.f22146f, i10);
            m0 m0Var = m0.f12709a;
            m0.P(parcel, this.f22147g);
            m0.P(parcel, this.f22148h);
        }
    }

    public p(Parcel parcel) {
        gm.l.f(parcel, "source");
        this.f22112b = -1;
        Parcelable[] readParcelableArray = parcel.readParcelableArray(w.class.getClassLoader());
        readParcelableArray = readParcelableArray == null ? new Parcelable[0] : readParcelableArray;
        ArrayList arrayList = new ArrayList();
        int length = readParcelableArray.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Parcelable parcelable = readParcelableArray[i10];
            w wVar = parcelable instanceof w ? (w) parcelable : null;
            if (wVar != null) {
                wVar.f22182b = this;
            }
            if (wVar != null) {
                arrayList.add(wVar);
            }
            i10++;
        }
        Object[] array = arrayList.toArray(new w[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        this.f22111a = (w[]) array;
        this.f22112b = parcel.readInt();
        this.f22117g = (d) parcel.readParcelable(d.class.getClassLoader());
        HashMap K = m0.K(parcel);
        this.f22118h = K == null ? null : ul.z.H(K);
        HashMap K2 = m0.K(parcel);
        this.f22119i = K2 != null ? ul.z.H(K2) : null;
    }

    public final void a(String str, String str2, boolean z10) {
        Map<String, String> map = this.f22118h;
        if (map == null) {
            map = new HashMap<>();
        }
        if (this.f22118h == null) {
            this.f22118h = map;
        }
        if (map.containsKey(str) && z10) {
            str2 = ((Object) map.get(str)) + ',' + str2;
        }
        map.put(str, str2);
    }

    public final boolean b() {
        int checkCallingOrSelfPermission;
        String string;
        if (this.f22116f) {
            return true;
        }
        androidx.fragment.app.x f10 = f();
        if (f10 == null) {
            checkCallingOrSelfPermission = -1;
        } else {
            checkCallingOrSelfPermission = f10.checkCallingOrSelfPermission("android.permission.INTERNET");
        }
        if (checkCallingOrSelfPermission != 0) {
            androidx.fragment.app.x f11 = f();
            String str = null;
            if (f11 == null) {
                string = null;
            } else {
                string = f11.getString(R.string.com_facebook_internet_permission_error_title);
            }
            if (f11 != null) {
                str = f11.getString(R.string.com_facebook_internet_permission_error_message);
            }
            d dVar = this.f22117g;
            ArrayList arrayList = new ArrayList();
            if (string != null) {
                arrayList.add(string);
            }
            if (str != null) {
                arrayList.add(str);
            }
            d(new e(dVar, e.a.ERROR, null, TextUtils.join(": ", arrayList), null));
            return false;
        }
        this.f22116f = true;
        return true;
    }

    public final void d(e eVar) {
        gm.l.f(eVar, "outcome");
        w g10 = g();
        if (g10 != null) {
            i(g10.f(), eVar.f22141a.f22153a, eVar.f22144d, eVar.f22145e, g10.f22181a);
        }
        Map<String, String> map = this.f22118h;
        if (map != null) {
            eVar.f22147g = map;
        }
        LinkedHashMap linkedHashMap = this.f22119i;
        if (linkedHashMap != null) {
            eVar.f22148h = linkedHashMap;
        }
        this.f22111a = null;
        int i10 = -1;
        this.f22112b = -1;
        this.f22117g = null;
        this.f22118h = null;
        this.f22121k = 0;
        this.f22122l = 0;
        c cVar = this.f22114d;
        if (cVar != null) {
            r rVar = (r) ((r0) cVar).f26165b;
            int i11 = r.f22157p0;
            gm.l.f(rVar, "this$0");
            rVar.f22160n0 = null;
            if (eVar.f22141a == e.a.CANCEL) {
                i10 = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("com.facebook.LoginFragment:Result", eVar);
            Intent intent = new Intent();
            intent.putExtras(bundle);
            androidx.fragment.app.x f02 = rVar.f0();
            if (rVar.t0() && f02 != null) {
                f02.setResult(i10, intent);
                f02.finish();
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(e eVar) {
        e eVar2;
        gm.l.f(eVar, "outcome");
        if (eVar.f22142b != null) {
            Date date = o5.a.f22664l;
            if (a.c.c()) {
                e.a aVar = e.a.ERROR;
                if (eVar.f22142b != null) {
                    o5.a b10 = a.c.b();
                    o5.a aVar2 = eVar.f22142b;
                    if (b10 != null) {
                        try {
                            if (gm.l.a(b10.f22675i, aVar2.f22675i)) {
                                eVar2 = new e(this.f22117g, e.a.SUCCESS, eVar.f22142b, eVar.f22143c, null, null);
                                d(eVar2);
                                return;
                            }
                        } catch (Exception e10) {
                            d dVar = this.f22117g;
                            String message = e10.getMessage();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add("Caught exception");
                            if (message != null) {
                                arrayList.add(message);
                            }
                            d(new e(dVar, aVar, null, TextUtils.join(": ", arrayList), null));
                            return;
                        }
                    }
                    d dVar2 = this.f22117g;
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add("User logged in as different Facebook user.");
                    eVar2 = new e(dVar2, aVar, null, TextUtils.join(": ", arrayList2), null);
                    d(eVar2);
                    return;
                }
                throw new o5.p("Can't validate without a token");
            }
        }
        d(eVar);
    }

    public final androidx.fragment.app.x f() {
        androidx.fragment.app.r rVar = this.f22113c;
        if (rVar == null) {
            return null;
        }
        return rVar.f0();
    }

    public final w g() {
        w[] wVarArr;
        int i10 = this.f22112b;
        if (i10 < 0 || (wVarArr = this.f22111a) == null) {
            return null;
        }
        return wVarArr[i10];
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0020, code lost:
        if (gm.l.a(r1, r2) != false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final n6.s h() {
        /*
            r4 = this;
            n6.s r0 = r4.f22120j
            if (r0 == 0) goto L22
            boolean r1 = i6.a.b(r0)
            r2 = 0
            if (r1 == 0) goto Ld
        Lb:
            r1 = r2
            goto L15
        Ld:
            java.lang.String r1 = r0.f22164a     // Catch: java.lang.Throwable -> L10
            goto L15
        L10:
            r1 = move-exception
            i6.a.a(r0, r1)
            goto Lb
        L15:
            n6.p$d r3 = r4.f22117g
            if (r3 != 0) goto L1a
            goto L1c
        L1a:
            java.lang.String r2 = r3.f22126d
        L1c:
            boolean r1 = gm.l.a(r1, r2)
            if (r1 != 0) goto L3e
        L22:
            n6.s r0 = new n6.s
            androidx.fragment.app.x r1 = r4.f()
            if (r1 != 0) goto L2e
            android.content.Context r1 = o5.v.a()
        L2e:
            n6.p$d r2 = r4.f22117g
            if (r2 != 0) goto L37
            java.lang.String r2 = o5.v.b()
            goto L39
        L37:
            java.lang.String r2 = r2.f22126d
        L39:
            r0.<init>(r1, r2)
            r4.f22120j = r0
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.p.h():n6.s");
    }

    public final void i(String str, String str2, String str3, String str4, HashMap hashMap) {
        boolean z10;
        d dVar = this.f22117g;
        String str5 = "fb_mobile_login_method_complete";
        if (dVar == null) {
            h().a("fb_mobile_login_method_complete", str);
            return;
        }
        s h10 = h();
        String str6 = dVar.f22127e;
        if (dVar.f22135m) {
            str5 = "foa_mobile_login_method_complete";
        }
        if (!i6.a.b(h10)) {
            try {
                ScheduledExecutorService scheduledExecutorService = s.f22163d;
                Bundle a10 = s.a.a(str6);
                if (str2 != null) {
                    a10.putString("2_result", str2);
                }
                if (str3 != null) {
                    a10.putString("5_error_message", str3);
                }
                if (str4 != null) {
                    a10.putString("4_error_code", str4);
                }
                if (hashMap != null && (!hashMap.isEmpty())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        if (((String) entry.getKey()) != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    a10.putString("6_extras", new JSONObject(linkedHashMap).toString());
                }
                a10.putString("3_method", str);
                h10.f22165b.a(a10, str5);
            } catch (Throwable th2) {
                i6.a.a(h10, th2);
            }
        }
    }

    public final void j() {
        String str;
        String str2;
        w g10 = g();
        if (g10 != null) {
            i(g10.f(), "skipped", null, null, g10.f22181a);
        }
        w[] wVarArr = this.f22111a;
        while (wVarArr != null) {
            int i10 = this.f22112b;
            boolean z10 = true;
            if (i10 >= wVarArr.length - 1) {
                break;
            }
            this.f22112b = i10 + 1;
            w g11 = g();
            boolean z11 = false;
            if (g11 != null) {
                if ((g11 instanceof c0) && !b()) {
                    a("no_internet_permission", "1", false);
                    continue;
                } else {
                    d dVar = this.f22117g;
                    if (dVar == null) {
                        continue;
                    } else {
                        int o10 = g11.o(dVar);
                        this.f22121k = 0;
                        s h10 = h();
                        if (o10 > 0) {
                            String str3 = dVar.f22127e;
                            String f10 = g11.f();
                            if (dVar.f22135m) {
                                str2 = "foa_mobile_login_method_start";
                            } else {
                                str2 = "fb_mobile_login_method_start";
                            }
                            if (!i6.a.b(h10)) {
                                try {
                                    ScheduledExecutorService scheduledExecutorService = s.f22163d;
                                    Bundle a10 = s.a.a(str3);
                                    a10.putString("3_method", f10);
                                    h10.f22165b.a(a10, str2);
                                } catch (Throwable th2) {
                                    i6.a.a(h10, th2);
                                }
                            }
                            this.f22122l = o10;
                        } else {
                            String str4 = dVar.f22127e;
                            String f11 = g11.f();
                            if (dVar.f22135m) {
                                str = "foa_mobile_login_method_not_tried";
                            } else {
                                str = "fb_mobile_login_method_not_tried";
                            }
                            if (!i6.a.b(h10)) {
                                try {
                                    ScheduledExecutorService scheduledExecutorService2 = s.f22163d;
                                    Bundle a11 = s.a.a(str4);
                                    a11.putString("3_method", f11);
                                    h10.f22165b.a(a11, str);
                                } catch (Throwable th3) {
                                    i6.a.a(h10, th3);
                                }
                            }
                            a("not_tried", g11.f(), true);
                        }
                        if (o10 <= 0) {
                            z10 = false;
                        }
                        z11 = z10;
                        continue;
                    }
                }
            }
            if (z11) {
                return;
            }
        }
        d dVar2 = this.f22117g;
        if (dVar2 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("Login attempt failed.");
            d(new e(dVar2, e.a.ERROR, null, TextUtils.join(": ", arrayList), null));
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        gm.l.f(parcel, "dest");
        parcel.writeParcelableArray(this.f22111a, i10);
        parcel.writeInt(this.f22112b);
        parcel.writeParcelable(this.f22117g, i10);
        m0 m0Var = m0.f12709a;
        m0.P(parcel, this.f22118h);
        m0.P(parcel, this.f22119i);
    }

    public p(androidx.fragment.app.r rVar) {
        gm.l.f(rVar, "fragment");
        this.f22112b = -1;
        if (this.f22113c != null) {
            throw new o5.p("Can't set fragment once it is already set.");
        }
        this.f22113c = rVar;
    }
}
