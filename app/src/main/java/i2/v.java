package i2;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.navigation.common.R;
import i2.j0;
import i2.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class v {

    /* renamed from: j */
    public static final /* synthetic */ int f16402j = 0;

    /* renamed from: a */
    public final String f16403a;

    /* renamed from: b */
    public x f16404b;

    /* renamed from: c */
    public String f16405c;

    /* renamed from: d */
    public CharSequence f16406d;

    /* renamed from: e */
    public final ArrayList f16407e;

    /* renamed from: f */
    public final o0.i<e> f16408f;

    /* renamed from: g */
    public LinkedHashMap f16409g;

    /* renamed from: h */
    public int f16410h;

    /* renamed from: i */
    public String f16411i;

    /* loaded from: classes.dex */
    public static final class a {
        public static String a(String str) {
            if (str != null) {
                return a.b.b("android-app://androidx.navigation/", str);
            }
            return "";
        }

        public static String b(Context context, int i10) {
            String valueOf;
            gm.l.f(context, "context");
            if (i10 <= 16777215) {
                return String.valueOf(i10);
            }
            try {
                valueOf = context.getResources().getResourceName(i10);
            } catch (Resources.NotFoundException unused) {
                valueOf = String.valueOf(i10);
            }
            gm.l.e(valueOf, "try {\n                co….toString()\n            }");
            return valueOf;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Comparable<b> {

        /* renamed from: a */
        public final v f16412a;

        /* renamed from: b */
        public final Bundle f16413b;

        /* renamed from: c */
        public final boolean f16414c;

        /* renamed from: d */
        public final boolean f16415d;

        /* renamed from: e */
        public final int f16416e;

        public b(v vVar, Bundle bundle, boolean z10, boolean z11, int i10) {
            gm.l.f(vVar, "destination");
            this.f16412a = vVar;
            this.f16413b = bundle;
            this.f16414c = z10;
            this.f16415d = z11;
            this.f16416e = i10;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public final int compareTo(b bVar) {
            gm.l.f(bVar, "other");
            boolean z10 = this.f16414c;
            if (!z10 || bVar.f16414c) {
                if (z10 || !bVar.f16414c) {
                    Bundle bundle = this.f16413b;
                    if (bundle == null || bVar.f16413b != null) {
                        if (bundle != null || bVar.f16413b == null) {
                            if (bundle != null) {
                                int size = bundle.size();
                                Bundle bundle2 = bVar.f16413b;
                                gm.l.c(bundle2);
                                int size2 = size - bundle2.size();
                                if (size2 > 0) {
                                    return 1;
                                }
                                if (size2 < 0) {
                                    return -1;
                                }
                            }
                            boolean z11 = this.f16415d;
                            if (!z11 || bVar.f16415d) {
                                if (z11 || !bVar.f16415d) {
                                    return this.f16416e - bVar.f16416e;
                                }
                                return -1;
                            }
                            return 1;
                        }
                        return -1;
                    }
                    return 1;
                }
                return -1;
            }
            return 1;
        }
    }

    static {
        new LinkedHashMap();
    }

    public v(h0<? extends v> h0Var) {
        gm.l.f(h0Var, "navigator");
        LinkedHashMap linkedHashMap = j0.f16308b;
        this.f16403a = j0.a.a(h0Var.getClass());
        this.f16407e = new ArrayList();
        this.f16408f = new o0.i<>();
        this.f16409g = new LinkedHashMap();
    }

    public final void e(r rVar) {
        Map<String, i> k10 = k();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, i>> it = k10.entrySet().iterator();
        while (true) {
            boolean z10 = true;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, i> next = it.next();
            i value = next.getValue();
            if ((value.f16287b || value.f16288c) ? false : false) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            String str = (String) obj;
            ArrayList arrayList2 = rVar.f16382d;
            Collection<r.a> values = rVar.f16383e.values();
            ArrayList arrayList3 = new ArrayList();
            for (r.a aVar : values) {
                ul.n.D(aVar.f16392b, arrayList3);
            }
            if (!ul.q.Q(arrayList3, arrayList2).contains(str)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            this.f16407e.add(rVar);
            return;
        }
        StringBuilder a10 = android.support.v4.media.d.a("Deep link ");
        a10.append(rVar.f16379a);
        a10.append(" can't be used to open destination ");
        a10.append(this);
        a10.append(".\nFollowing required arguments are missing: ");
        a10.append(arrayList);
        throw new IllegalArgumentException(a10.toString().toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x01a0  */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.HashSet, java.util.AbstractCollection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.v.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x0098 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle f(android.os.Bundle r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L14
            java.util.LinkedHashMap r0 = r5.f16409g
            if (r0 == 0) goto Lf
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            if (r0 == 0) goto L14
            r6 = 0
            return r6
        L14:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.util.LinkedHashMap r1 = r5.f16409g
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L23:
            boolean r2 = r1.hasNext()
            java.lang.String r3 = "name"
            if (r2 == 0) goto L4f
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r2 = r2.getValue()
            i2.i r2 = (i2.i) r2
            r2.getClass()
            gm.l.f(r4, r3)
            boolean r3 = r2.f16288c
            if (r3 == 0) goto L23
            i2.d0<java.lang.Object> r3 = r2.f16286a
            java.lang.Object r2 = r2.f16289d
            r3.d(r0, r4, r2)
            goto L23
        L4f:
            if (r6 == 0) goto Lbc
            r0.putAll(r6)
            java.util.LinkedHashMap r6 = r5.f16409g
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L5e:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto Lbc
            java.lang.Object r1 = r6.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            i2.i r1 = (i2.i) r1
            r1.getClass()
            gm.l.f(r2, r3)
            boolean r4 = r1.f16287b
            if (r4 != 0) goto L8d
            boolean r4 = r0.containsKey(r2)
            if (r4 == 0) goto L8d
            java.lang.Object r4 = r0.get(r2)
            if (r4 != 0) goto L8d
            goto L94
        L8d:
            i2.d0<java.lang.Object> r4 = r1.f16286a     // Catch: java.lang.ClassCastException -> L94
            r4.a(r0, r2)     // Catch: java.lang.ClassCastException -> L94
            r4 = 1
            goto L95
        L94:
            r4 = 0
        L95:
            if (r4 == 0) goto L98
            goto L5e
        L98:
            java.lang.String r6 = "Wrong argument type for '"
            java.lang.String r0 = "' in argument bundle. "
            java.lang.StringBuilder r6 = androidx.activity.result.d.a(r6, r2, r0)
            i2.d0<java.lang.Object> r0 = r1.f16286a
            java.lang.String r0 = r0.b()
            r6.append(r0)
            java.lang.String r0 = " expected."
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
        Lbc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.v.f(android.os.Bundle):android.os.Bundle");
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        Set<String> keySet;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = this.f16410h * 31;
        String str = this.f16411i;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i18 = i17 + i10;
        Iterator it = this.f16407e.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            int i19 = i18 * 31;
            String str2 = rVar.f16379a;
            if (str2 != null) {
                i14 = str2.hashCode();
            } else {
                i14 = 0;
            }
            int i20 = (i19 + i14) * 31;
            String str3 = rVar.f16380b;
            if (str3 != null) {
                i15 = str3.hashCode();
            } else {
                i15 = 0;
            }
            int i21 = (i20 + i15) * 31;
            String str4 = rVar.f16381c;
            if (str4 != null) {
                i16 = str4.hashCode();
            } else {
                i16 = 0;
            }
            i18 = i21 + i16;
        }
        o0.j a10 = o0.k.a(this.f16408f);
        while (a10.hasNext()) {
            e eVar = (e) a10.next();
            int i22 = ((i18 * 31) + eVar.f16274a) * 31;
            b0 b0Var = eVar.f16275b;
            if (b0Var != null) {
                i12 = b0Var.hashCode();
            } else {
                i12 = 0;
            }
            i18 = i22 + i12;
            Bundle bundle = eVar.f16276c;
            if (bundle != null && (keySet = bundle.keySet()) != null) {
                for (String str5 : keySet) {
                    int i23 = i18 * 31;
                    Bundle bundle2 = eVar.f16276c;
                    gm.l.c(bundle2);
                    Object obj = bundle2.get(str5);
                    if (obj != null) {
                        i13 = obj.hashCode();
                    } else {
                        i13 = 0;
                    }
                    i18 = i23 + i13;
                }
            }
        }
        for (String str6 : k().keySet()) {
            int a11 = t.a(str6, i18 * 31, 31);
            i iVar = k().get(str6);
            if (iVar != null) {
                i11 = iVar.hashCode();
            } else {
                i11 = 0;
            }
            i18 = a11 + i11;
        }
        return i18;
    }

    public final int[] i(v vVar) {
        x xVar;
        ul.g gVar = new ul.g();
        x xVar2 = this;
        while (true) {
            x xVar3 = xVar2.f16404b;
            if (vVar != null) {
                xVar = vVar.f16404b;
            } else {
                xVar = null;
            }
            if (xVar != null) {
                x xVar4 = vVar.f16404b;
                gm.l.c(xVar4);
                if (xVar4.q(xVar2.f16410h, true) == xVar2) {
                    gVar.addFirst(xVar2);
                    break;
                }
            }
            if (xVar3 == null || xVar3.f16419l != xVar2.f16410h) {
                gVar.addFirst(xVar2);
            }
            if (gm.l.a(xVar3, vVar) || xVar3 == null) {
                break;
            }
            xVar2 = xVar3;
        }
        List<v> Y = ul.q.Y(gVar);
        ArrayList arrayList = new ArrayList(ul.l.B(Y, 10));
        for (v vVar2 : Y) {
            arrayList.add(Integer.valueOf(vVar2.f16410h));
        }
        return ul.q.X(arrayList);
    }

    public final e j(int i10) {
        boolean z10;
        e eVar;
        if (this.f16408f.f() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            eVar = null;
        } else {
            eVar = (e) this.f16408f.d(i10, null);
        }
        if (eVar == null) {
            x xVar = this.f16404b;
            if (xVar == null) {
                return null;
            }
            return xVar.j(i10);
        }
        return eVar;
    }

    public final Map<String, i> k() {
        return ul.z.E(this.f16409g);
    }

    public b n(j4.j jVar) {
        Bundle bundle;
        boolean z10;
        int i10;
        int i11;
        int i12;
        List list;
        int i13;
        List list2;
        boolean z11;
        boolean z12;
        Matcher matcher;
        Bundle bundle2;
        boolean z13;
        Matcher matcher2;
        Uri uri;
        Iterator it;
        String str;
        Matcher matcher3;
        Matcher matcher4 = null;
        if (this.f16407e.isEmpty()) {
            return null;
        }
        Iterator it2 = this.f16407e.iterator();
        b bVar = null;
        while (it2.hasNext()) {
            r rVar = (r) it2.next();
            Uri uri2 = (Uri) jVar.f17416c;
            if (uri2 != null) {
                Map<String, i> k10 = k();
                rVar.getClass();
                Pattern pattern = (Pattern) rVar.f16385g.getValue();
                if (pattern != null) {
                    matcher = pattern.matcher(uri2.toString());
                } else {
                    matcher = matcher4;
                }
                if (matcher != null && matcher.matches()) {
                    bundle2 = new Bundle();
                    int size = rVar.f16382d.size();
                    int i14 = 0;
                    while (i14 < size) {
                        String str2 = (String) rVar.f16382d.get(i14);
                        i14++;
                        String decode = Uri.decode(matcher.group(i14));
                        i iVar = k10.get(str2);
                        try {
                            gm.l.e(decode, "value");
                            r.b(bundle2, str2, decode, iVar);
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    if (rVar.f16386h) {
                        Iterator it3 = rVar.f16383e.keySet().iterator();
                        while (it3.hasNext()) {
                            String str3 = (String) it3.next();
                            r.a aVar = (r.a) rVar.f16383e.get(str3);
                            String queryParameter = uri2.getQueryParameter(str3);
                            if (rVar.f16387i) {
                                String uri3 = uri2.toString();
                                gm.l.e(uri3, "deepLink.toString()");
                                String u02 = om.l.u0(uri3, '?');
                                if (!gm.l.a(u02, uri3)) {
                                    queryParameter = u02;
                                }
                            }
                            if (queryParameter != null) {
                                gm.l.c(aVar);
                                matcher2 = Pattern.compile(aVar.f16391a, 32).matcher(queryParameter);
                                if (!matcher2.matches()) {
                                    break;
                                }
                            } else {
                                matcher2 = null;
                            }
                            Bundle bundle3 = new Bundle();
                            try {
                                gm.l.c(aVar);
                                int size2 = aVar.f16392b.size();
                                int i15 = 0;
                                while (i15 < size2) {
                                    if (matcher2 != null) {
                                        try {
                                            str = matcher2.group(i15 + 1);
                                            if (str == null) {
                                                str = "";
                                            }
                                        } catch (IllegalArgumentException unused2) {
                                            uri = uri2;
                                            it = it3;
                                        }
                                    } else {
                                        str = null;
                                    }
                                    String str4 = (String) aVar.f16392b.get(i15);
                                    uri = uri2;
                                    try {
                                        i iVar2 = k10.get(str4);
                                        it = it3;
                                        if (str != null) {
                                            try {
                                                StringBuilder sb2 = new StringBuilder();
                                                matcher3 = matcher2;
                                                sb2.append('{');
                                                sb2.append(str4);
                                                sb2.append('}');
                                                if (!gm.l.a(str, sb2.toString())) {
                                                    r.b(bundle3, str4, str, iVar2);
                                                }
                                            } catch (IllegalArgumentException unused3) {
                                                it3 = it;
                                                uri2 = uri;
                                            }
                                        } else {
                                            matcher3 = matcher2;
                                        }
                                        i15++;
                                        it3 = it;
                                        uri2 = uri;
                                        matcher2 = matcher3;
                                    } catch (IllegalArgumentException unused4) {
                                        it = it3;
                                        it3 = it;
                                        uri2 = uri;
                                    }
                                }
                                uri = uri2;
                                it = it3;
                                bundle2.putAll(bundle3);
                            } catch (IllegalArgumentException unused5) {
                                uri = uri2;
                            }
                            it3 = it;
                            uri2 = uri;
                        }
                    }
                    for (Map.Entry<String, i> entry : k10.entrySet()) {
                        String key = entry.getKey();
                        i value = entry.getValue();
                        if (value != null && !value.f16287b && !value.f16288c) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13 || bundle2.containsKey(key)) {
                        }
                    }
                    bundle = bundle2;
                }
                bundle2 = null;
                bundle = bundle2;
            } else {
                bundle = null;
            }
            String str5 = (String) jVar.f17415b;
            if (str5 != null && gm.l.a(str5, rVar.f16380b)) {
                z10 = true;
            } else {
                z10 = false;
            }
            String str6 = (String) jVar.f17417d;
            if (str6 != null) {
                rVar.getClass();
                if (rVar.f16381c != null) {
                    Pattern pattern2 = (Pattern) rVar.f16389k.getValue();
                    gm.l.c(pattern2);
                    if (pattern2.matcher(str6).matches()) {
                        String str7 = rVar.f16381c;
                        gm.l.f(str7, "mimeType");
                        List a10 = new om.c("/").a(str7);
                        if (!a10.isEmpty()) {
                            ListIterator listIterator = a10.listIterator(a10.size());
                            while (listIterator.hasPrevious()) {
                                if (((String) listIterator.previous()).length() == 0) {
                                    z12 = true;
                                    continue;
                                } else {
                                    z12 = false;
                                    continue;
                                }
                                if (!z12) {
                                    i12 = 1;
                                    list = ul.q.V(a10, listIterator.nextIndex() + 1);
                                    break;
                                }
                            }
                        }
                        i12 = 1;
                        list = ul.s.f28879a;
                        String str8 = (String) list.get(0);
                        String str9 = (String) list.get(i12);
                        List a11 = new om.c("/").a(str6);
                        if (!a11.isEmpty()) {
                            ListIterator listIterator2 = a11.listIterator(a11.size());
                            while (listIterator2.hasPrevious()) {
                                if (((String) listIterator2.previous()).length() == 0) {
                                    z11 = true;
                                    continue;
                                } else {
                                    z11 = false;
                                    continue;
                                }
                                if (!z11) {
                                    i13 = 1;
                                    list2 = ul.q.V(a11, listIterator2.nextIndex() + 1);
                                    break;
                                }
                            }
                        }
                        i13 = 1;
                        list2 = ul.s.f28879a;
                        i11 = 0;
                        String str10 = (String) list2.get(i13);
                        if (gm.l.a(str8, (String) list2.get(0))) {
                            i11 = 2;
                        }
                        if (gm.l.a(str9, str10)) {
                            i11++;
                        }
                        i10 = i11;
                    }
                }
                i11 = -1;
                i10 = i11;
            } else {
                i10 = -1;
            }
            if (bundle != null || z10 || i10 > -1) {
                b bVar2 = new b(this, bundle, rVar.f16390l, z10, i10);
                if (bVar == null || bVar2.compareTo(bVar) > 0) {
                    bVar = bVar2;
                }
            }
            matcher4 = null;
        }
        return bVar;
    }

    public void o(Context context, AttributeSet attributeSet) {
        Object obj;
        gm.l.f(context, "context");
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.Navigator);
        gm.l.e(obtainAttributes, "context.resources.obtain…s, R.styleable.Navigator)");
        String string = obtainAttributes.getString(R.styleable.Navigator_route);
        if (string == null) {
            this.f16410h = 0;
            this.f16405c = null;
        } else if (!om.h.W(string)) {
            String a10 = a.a(string);
            this.f16410h = a10.hashCode();
            this.f16405c = null;
            e(new r(a10, null, null));
        } else {
            throw new IllegalArgumentException("Cannot have an empty route".toString());
        }
        ArrayList arrayList = this.f16407e;
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (gm.l.a(((r) obj).f16379a, a.a(this.f16411i))) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        gm.e0.a(arrayList);
        arrayList.remove(obj);
        this.f16411i = string;
        int i10 = R.styleable.Navigator_android_id;
        if (obtainAttributes.hasValue(i10)) {
            int resourceId = obtainAttributes.getResourceId(i10, 0);
            this.f16410h = resourceId;
            this.f16405c = null;
            this.f16405c = a.b(context, resourceId);
        }
        this.f16406d = obtainAttributes.getText(R.styleable.Navigator_android_label);
        tl.l lVar = tl.l.f28297a;
        obtainAttributes.recycle();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("(");
        String str = this.f16405c;
        if (str == null) {
            sb2.append("0x");
            str = Integer.toHexString(this.f16410h);
        }
        sb2.append(str);
        sb2.append(")");
        String str2 = this.f16411i;
        if (!(str2 == null || om.h.W(str2))) {
            sb2.append(" route=");
            sb2.append(this.f16411i);
        }
        if (this.f16406d != null) {
            sb2.append(" label=");
            sb2.append(this.f16406d);
        }
        String sb3 = sb2.toString();
        gm.l.e(sb3, "sb.toString()");
        return sb3;
    }
}
