package i2;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class r {
    @Deprecated

    /* renamed from: m */
    public static final Pattern f16378m = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: a */
    public final String f16379a;

    /* renamed from: b */
    public final String f16380b;

    /* renamed from: c */
    public final String f16381c;

    /* renamed from: f */
    public String f16384f;

    /* renamed from: h */
    public boolean f16386h;

    /* renamed from: i */
    public boolean f16387i;

    /* renamed from: j */
    public String f16388j;

    /* renamed from: l */
    public boolean f16390l;

    /* renamed from: d */
    public final ArrayList f16382d = new ArrayList();

    /* renamed from: e */
    public final LinkedHashMap f16383e = new LinkedHashMap();

    /* renamed from: g */
    public final tl.i f16385g = new tl.i(new c());

    /* renamed from: k */
    public final tl.i f16389k = new tl.i(new b());

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public String f16391a;

        /* renamed from: b */
        public final ArrayList f16392b = new ArrayList();
    }

    /* loaded from: classes.dex */
    public static final class b extends gm.m implements fm.a<Pattern> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(0);
            r.this = r1;
        }

        @Override // fm.a
        public final Pattern m() {
            String str = r.this.f16388j;
            if (str != null) {
                return Pattern.compile(str);
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends gm.m implements fm.a<Pattern> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c() {
            super(0);
            r.this = r1;
        }

        @Override // fm.a
        public final Pattern m() {
            String str = r.this.f16384f;
            if (str != null) {
                return Pattern.compile(str, 2);
            }
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [i2.r] */
    /* JADX WARN: Type inference failed for: r14v23, types: [int] */
    /* JADX WARN: Type inference failed for: r14v38 */
    /* JADX WARN: Type inference failed for: r14v39 */
    public r(String str, String str2, String str3) {
        int i10;
        List list;
        boolean z10;
        boolean z11;
        this.f16379a = str;
        this.f16380b = str2;
        this.f16381c = str3;
        boolean z12 = true;
        if (str != null) {
            Uri parse = Uri.parse(str);
            if (parse.getQuery() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f16386h = z11;
            StringBuilder sb2 = new StringBuilder("^");
            if (!f16378m.matcher(str).find()) {
                sb2.append("http[s]?://");
            }
            Pattern compile = Pattern.compile("\\{(.+?)\\}");
            if (this.f16386h) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str);
                if (matcher.find()) {
                    String substring = str.substring(0, matcher.start());
                    gm.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    gm.l.e(compile, "fillInPattern");
                    this.f16390l = a(substring, sb2, compile);
                }
                for (String str4 : parse.getQueryParameterNames()) {
                    StringBuilder sb3 = new StringBuilder();
                    String queryParameter = parse.getQueryParameter(str4);
                    if (queryParameter == null) {
                        this.f16387i = z12;
                        queryParameter = str4;
                    }
                    Matcher matcher2 = compile.matcher(queryParameter);
                    a aVar = new a();
                    int i11 = 0;
                    ?? r14 = z12;
                    while (matcher2.find()) {
                        String group = matcher2.group((int) r14);
                        if (group != null) {
                            aVar.f16392b.add(group);
                            gm.l.e(queryParameter, "queryParam");
                            String substring2 = queryParameter.substring(i11, matcher2.start());
                            gm.l.e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                            sb3.append(Pattern.quote(substring2));
                            sb3.append("(.+?)?");
                            i11 = matcher2.end();
                            r14 = 1;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    }
                    if (i11 < queryParameter.length()) {
                        String substring3 = queryParameter.substring(i11);
                        gm.l.e(substring3, "this as java.lang.String).substring(startIndex)");
                        sb3.append(Pattern.quote(substring3));
                    }
                    String sb4 = sb3.toString();
                    gm.l.e(sb4, "argRegex.toString()");
                    aVar.f16391a = om.h.Y(sb4, ".*", "\\E.*\\Q");
                    LinkedHashMap linkedHashMap = this.f16383e;
                    gm.l.e(str4, "paramName");
                    linkedHashMap.put(str4, aVar);
                    z12 = true;
                }
            } else {
                gm.l.e(compile, "fillInPattern");
                this.f16390l = a(str, sb2, compile);
            }
            String sb5 = sb2.toString();
            gm.l.e(sb5, "uriRegex.toString()");
            this.f16384f = om.h.Y(sb5, ".*", "\\E.*\\Q");
        }
        if (this.f16381c != null) {
            if (Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.f16381c).matches()) {
                String str5 = this.f16381c;
                gm.l.f(str5, "mimeType");
                List a10 = new om.c("/").a(str5);
                if (!a10.isEmpty()) {
                    ListIterator listIterator = a10.listIterator(a10.size());
                    while (listIterator.hasPrevious()) {
                        if (((String) listIterator.previous()).length() == 0) {
                            z10 = true;
                            continue;
                        } else {
                            z10 = false;
                            continue;
                        }
                        if (!z10) {
                            i10 = 1;
                            list = ul.q.V(a10, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                i10 = 1;
                list = ul.s.f28879a;
                this.f16388j = om.h.Y("^(" + ((String) list.get(0)) + "|[*]+)/(" + ((String) list.get(i10)) + "|[*]+)$", "*|[*]", "[\\s\\S]");
                return;
            }
            throw new IllegalArgumentException(androidx.activity.e.b(android.support.v4.media.d.a("The given mimeType "), this.f16381c, " does not match to required \"type/subtype\" format").toString());
        }
    }

    public static void b(Bundle bundle, String str, String str2, i iVar) {
        if (iVar != null) {
            d0<Object> d0Var = iVar.f16286a;
            d0Var.getClass();
            gm.l.f(str, "key");
            d0Var.d(bundle, str, d0Var.c(str2));
            return;
        }
        bundle.putString(str, str2);
    }

    public final boolean a(String str, StringBuilder sb2, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        boolean z10 = !om.l.c0(str, ".*", false);
        int i10 = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            if (group != null) {
                this.f16382d.add(group);
                String substring = str.substring(i10, matcher.start());
                gm.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb2.append(Pattern.quote(substring));
                sb2.append("([^/]+?)");
                i10 = matcher.end();
                z10 = false;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }
        if (i10 < str.length()) {
            String substring2 = str.substring(i10);
            gm.l.e(substring2, "this as java.lang.String).substring(startIndex)");
            sb2.append(Pattern.quote(substring2));
        }
        sb2.append("($|(\\?(.)*)|(\\#(.)*))");
        return z10;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return gm.l.a(this.f16379a, rVar.f16379a) && gm.l.a(this.f16380b, rVar.f16380b) && gm.l.a(this.f16381c, rVar.f16381c);
    }

    public final int hashCode() {
        String str = this.f16379a;
        int hashCode = ((str != null ? str.hashCode() : 0) + 0) * 31;
        String str2 = this.f16380b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f16381c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
