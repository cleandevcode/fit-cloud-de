package zm;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a */
    public final boolean f32657a;

    /* renamed from: b */
    public final String f32658b;

    /* renamed from: c */
    public final String f32659c;

    /* renamed from: d */
    public final String f32660d;

    /* renamed from: e */
    public final String f32661e;

    /* renamed from: f */
    public final int f32662f;

    /* renamed from: g */
    public final List<String> f32663g;

    /* renamed from: h */
    public final List<String> f32664h;

    /* renamed from: i */
    public final String f32665i;

    /* renamed from: j */
    public final String f32666j;

    /* renamed from: l */
    public static final b f32656l = new b();

    /* renamed from: k */
    public static final char[] f32655k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public String f32667a;

        /* renamed from: d */
        public String f32670d;

        /* renamed from: f */
        public final ArrayList f32672f;

        /* renamed from: g */
        public ArrayList f32673g;

        /* renamed from: h */
        public String f32674h;

        /* renamed from: b */
        public String f32668b = "";

        /* renamed from: c */
        public String f32669c = "";

        /* renamed from: e */
        public int f32671e = -1;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f32672f = arrayList;
            arrayList.add("");
        }

        public final q a() {
            int b10;
            ArrayList arrayList;
            String str;
            String str2;
            String str3 = this.f32667a;
            if (str3 != null) {
                b bVar = q.f32656l;
                String d10 = b.d(bVar, this.f32668b, 0, 0, false, 7);
                String d11 = b.d(bVar, this.f32669c, 0, 0, false, 7);
                String str4 = this.f32670d;
                if (str4 != null) {
                    int i10 = this.f32671e;
                    if (i10 != -1) {
                        b10 = i10;
                    } else {
                        String str5 = this.f32667a;
                        gm.l.c(str5);
                        bVar.getClass();
                        b10 = b.b(str5);
                    }
                    ArrayList arrayList2 = this.f32672f;
                    ArrayList arrayList3 = new ArrayList(ul.l.B(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(b.d(q.f32656l, (String) it.next(), 0, 0, false, 7));
                    }
                    ArrayList<String> arrayList4 = this.f32673g;
                    if (arrayList4 != null) {
                        arrayList = new ArrayList(ul.l.B(arrayList4, 10));
                        for (String str6 : arrayList4) {
                            if (str6 != null) {
                                str2 = b.d(q.f32656l, str6, 0, 0, true, 3);
                            } else {
                                str2 = null;
                            }
                            arrayList.add(str2);
                        }
                    } else {
                        arrayList = null;
                    }
                    String str7 = this.f32674h;
                    if (str7 != null) {
                        str = b.d(q.f32656l, str7, 0, 0, false, 7);
                    } else {
                        str = null;
                    }
                    return new q(str3, d10, d11, str4, b10, arrayList3, arrayList, str, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        public final void b(String str) {
            this.f32673g = str != null ? b.e(b.a(q.f32656l, str, 0, 0, " \"'<>#", true, false, true, false, null, 211)) : null;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:348:0x027d
            	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        public final void c(zm.q r26, java.lang.String r27) {
            /*
                Method dump skipped, instructions count: 1126
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: zm.q.a.c(zm.q, java.lang.String):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:114:0x009c, code lost:
            if (r1 != zm.q.b.b(r3)) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x0030, code lost:
            if (r1 != false) goto L59;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String toString() {
            /*
                Method dump skipped, instructions count: 306
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: zm.q.a.toString():java.lang.String");
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        /* JADX WARN: Removed duplicated region for block: B:281:0x01a2 A[LOOP:2: B:279:0x019c->B:281:0x01a2, LOOP_END] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.String a(zm.q.b r17, java.lang.String r18, int r19, int r20, java.lang.String r21, boolean r22, boolean r23, boolean r24, boolean r25, java.nio.charset.Charset r26, int r27) {
            /*
                Method dump skipped, instructions count: 477
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: zm.q.b.a(zm.q$b, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset, int):java.lang.String");
        }

        public static int b(String str) {
            gm.l.f(str, "scheme");
            int hashCode = str.hashCode();
            if (hashCode != 3213448) {
                if (hashCode == 99617003 && str.equals("https")) {
                    return 443;
                }
            } else if (str.equals("http")) {
                return 80;
            }
            return -1;
        }

        public static boolean c(int i10, int i11, String str) {
            int i12 = i10 + 2;
            return i12 < i11 && str.charAt(i10) == '%' && an.c.o(str.charAt(i10 + 1)) != -1 && an.c.o(str.charAt(i12)) != -1;
        }

        public static String d(b bVar, String str, int i10, int i11, boolean z10, int i12) {
            int i13;
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 4) != 0) {
                z10 = false;
            }
            bVar.getClass();
            gm.l.f(str, "$this$percentDecode");
            int i14 = i10;
            while (i14 < i11) {
                char charAt = str.charAt(i14);
                if (charAt != '%' && (charAt != '+' || !z10)) {
                    i14++;
                } else {
                    ln.e eVar = new ln.e();
                    eVar.n0(i10, i14, str);
                    while (i14 < i11) {
                        int codePointAt = str.codePointAt(i14);
                        if (codePointAt == 37 && (i13 = i14 + 2) < i11) {
                            int o10 = an.c.o(str.charAt(i14 + 1));
                            int o11 = an.c.o(str.charAt(i13));
                            if (o10 != -1 && o11 != -1) {
                                eVar.b0((o10 << 4) + o11);
                                i14 = Character.charCount(codePointAt) + i13;
                            }
                            eVar.q0(codePointAt);
                            i14 += Character.charCount(codePointAt);
                        } else {
                            if (codePointAt == 43 && z10) {
                                eVar.b0(32);
                                i14++;
                            }
                            eVar.q0(codePointAt);
                            i14 += Character.charCount(codePointAt);
                        }
                    }
                    return eVar.L();
                }
            }
            String substring = str.substring(i10, i11);
            gm.l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        public static ArrayList e(String str) {
            String str2;
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= str.length()) {
                int g02 = om.l.g0(str, '&', i10, false, 4);
                if (g02 == -1) {
                    g02 = str.length();
                }
                int g03 = om.l.g0(str, '=', i10, false, 4);
                if (g03 == -1 || g03 > g02) {
                    String substring = str.substring(i10, g02);
                    gm.l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    str2 = null;
                } else {
                    String substring2 = str.substring(i10, g03);
                    gm.l.e(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    str2 = str.substring(g03 + 1, g02);
                    gm.l.e(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                arrayList.add(str2);
                i10 = g02 + 1;
            }
            return arrayList;
        }
    }

    public q(String str, String str2, String str3, String str4, int i10, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.f32658b = str;
        this.f32659c = str2;
        this.f32660d = str3;
        this.f32661e = str4;
        this.f32662f = i10;
        this.f32663g = arrayList;
        this.f32664h = arrayList2;
        this.f32665i = str5;
        this.f32666j = str6;
        this.f32657a = gm.l.a(str, "https");
    }

    public final String a() {
        if (this.f32660d.length() == 0) {
            return "";
        }
        int g02 = om.l.g0(this.f32666j, ':', this.f32658b.length() + 3, false, 4) + 1;
        int g03 = om.l.g0(this.f32666j, '@', 0, false, 6);
        String str = this.f32666j;
        if (str != null) {
            String substring = str.substring(g02, g03);
            gm.l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final String b() {
        int g02 = om.l.g0(this.f32666j, '/', this.f32658b.length() + 3, false, 4);
        String str = this.f32666j;
        int d10 = an.c.d(g02, str.length(), str, "?#");
        String str2 = this.f32666j;
        if (str2 != null) {
            String substring = str2.substring(g02, d10);
            gm.l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final ArrayList c() {
        int g02 = om.l.g0(this.f32666j, '/', this.f32658b.length() + 3, false, 4);
        String str = this.f32666j;
        int d10 = an.c.d(g02, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (g02 < d10) {
            int i10 = g02 + 1;
            int e10 = an.c.e(this.f32666j, '/', i10, d10);
            String str2 = this.f32666j;
            if (str2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String substring = str2.substring(i10, e10);
            gm.l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            arrayList.add(substring);
            g02 = e10;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f32664h == null) {
            return null;
        }
        int g02 = om.l.g0(this.f32666j, '?', 0, false, 6) + 1;
        String str = this.f32666j;
        int e10 = an.c.e(str, '#', g02, str.length());
        String str2 = this.f32666j;
        if (str2 != null) {
            String substring = str2.substring(g02, e10);
            gm.l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final String e() {
        if (this.f32659c.length() == 0) {
            return "";
        }
        int length = this.f32658b.length() + 3;
        String str = this.f32666j;
        int d10 = an.c.d(length, str.length(), str, ":@");
        String str2 = this.f32666j;
        if (str2 != null) {
            String substring = str2.substring(length, d10);
            gm.l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof q) && gm.l.a(((q) obj).f32666j, this.f32666j);
    }

    public final String f() {
        a aVar;
        try {
            aVar = new a();
            aVar.c(this, "/...");
        } catch (IllegalArgumentException unused) {
            aVar = null;
        }
        gm.l.c(aVar);
        b bVar = f32656l;
        aVar.f32668b = b.a(bVar, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
        aVar.f32669c = b.a(bVar, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
        return aVar.a().f32666j;
    }

    public final URI g() {
        int i10;
        String substring;
        String str;
        String str2;
        a aVar = new a();
        aVar.f32667a = this.f32658b;
        aVar.f32668b = e();
        aVar.f32669c = a();
        aVar.f32670d = this.f32661e;
        int i11 = this.f32662f;
        b bVar = f32656l;
        String str3 = this.f32658b;
        bVar.getClass();
        if (i11 != b.b(str3)) {
            i10 = this.f32662f;
        } else {
            i10 = -1;
        }
        aVar.f32671e = i10;
        aVar.f32672f.clear();
        aVar.f32672f.addAll(c());
        aVar.b(d());
        String str4 = null;
        if (this.f32665i == null) {
            substring = null;
        } else {
            int g02 = om.l.g0(this.f32666j, '#', 0, false, 6) + 1;
            String str5 = this.f32666j;
            if (str5 != null) {
                substring = str5.substring(g02);
                gm.l.e(substring, "(this as java.lang.String).substring(startIndex)");
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        aVar.f32674h = substring;
        String str6 = aVar.f32670d;
        if (str6 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            gm.l.e(compile, "compile(pattern)");
            str = compile.matcher(str6).replaceAll("");
            gm.l.e(str, "nativePattern.matcher(in…).replaceAll(replacement)");
        } else {
            str = null;
        }
        aVar.f32670d = str;
        int size = aVar.f32672f.size();
        for (int i12 = 0; i12 < size; i12++) {
            ArrayList arrayList = aVar.f32672f;
            arrayList.set(i12, b.a(f32656l, (String) arrayList.get(i12), 0, 0, "[]", true, true, false, false, null, 227));
        }
        ArrayList arrayList2 = aVar.f32673g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i13 = 0; i13 < size2; i13++) {
                String str7 = (String) arrayList2.get(i13);
                if (str7 != null) {
                    str2 = b.a(f32656l, str7, 0, 0, "\\^`{|}", true, true, true, false, null, 195);
                } else {
                    str2 = null;
                }
                arrayList2.set(i13, str2);
            }
        }
        String str8 = aVar.f32674h;
        if (str8 != null) {
            str4 = b.a(f32656l, str8, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163);
        }
        aVar.f32674h = str4;
        String aVar2 = aVar.toString();
        try {
            return new URI(aVar2);
        } catch (URISyntaxException e10) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                gm.l.e(compile2, "compile(pattern)");
                String replaceAll = compile2.matcher(aVar2).replaceAll("");
                gm.l.e(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
                URI create = URI.create(replaceAll);
                gm.l.e(create, "try {\n        val stripp…e) // Unexpected!\n      }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final int hashCode() {
        return this.f32666j.hashCode();
    }

    public final String toString() {
        return this.f32666j;
    }
}
