package p2;

import android.annotation.SuppressLint;
import androidx.activity.e;
import gm.l;
import i2.t;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import om.h;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public final String f23773a;

    /* renamed from: b */
    public final Map<String, C0427a> f23774b;

    /* renamed from: c */
    public final Set<b> f23775c;

    /* renamed from: d */
    public final Set<d> f23776d;

    /* renamed from: p2.a$a */
    /* loaded from: classes.dex */
    public static final class C0427a {

        /* renamed from: a */
        public final String f23777a;

        /* renamed from: b */
        public final String f23778b;

        /* renamed from: c */
        public final boolean f23779c;

        /* renamed from: d */
        public final int f23780d;

        /* renamed from: e */
        public final String f23781e;

        /* renamed from: f */
        public final int f23782f;

        /* renamed from: g */
        public final int f23783g;

        /* renamed from: p2.a$a$a */
        /* loaded from: classes.dex */
        public static final class C0428a {
            @SuppressLint({"SyntheticAccessor"})
            public static boolean a(String str, String str2) {
                boolean z10;
                boolean z11;
                l.f(str, "current");
                if (l.a(str, str2)) {
                    return true;
                }
                if (str.length() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    int i10 = 0;
                    int i11 = 0;
                    int i12 = 0;
                    while (true) {
                        if (i10 < str.length()) {
                            char charAt = str.charAt(i10);
                            int i13 = i12 + 1;
                            if (i12 == 0 && charAt != '(') {
                                break;
                            }
                            if (charAt == '(') {
                                i11++;
                            } else if (charAt == ')' && i11 - 1 == 0 && i12 != str.length() - 1) {
                                break;
                            }
                            i10++;
                            i12 = i13;
                        } else if (i11 == 0) {
                            z11 = true;
                        }
                    }
                }
                z11 = false;
                if (!z11) {
                    return false;
                }
                String substring = str.substring(1, str.length() - 1);
                l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return l.a(om.l.x0(substring).toString(), str2);
            }
        }

        public C0427a(String str, String str2, boolean z10, int i10, String str3, int i11) {
            int i12;
            this.f23777a = str;
            this.f23778b = str2;
            this.f23779c = z10;
            this.f23780d = i10;
            this.f23781e = str3;
            this.f23782f = i11;
            Locale locale = Locale.US;
            l.e(locale, "US");
            String upperCase = str2.toUpperCase(locale);
            l.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (om.l.c0(upperCase, "INT", false)) {
                i12 = 3;
            } else if (!om.l.c0(upperCase, "CHAR", false) && !om.l.c0(upperCase, "CLOB", false) && !om.l.c0(upperCase, "TEXT", false)) {
                if (om.l.c0(upperCase, "BLOB", false)) {
                    i12 = 5;
                } else if (!om.l.c0(upperCase, "REAL", false) && !om.l.c0(upperCase, "FLOA", false) && !om.l.c0(upperCase, "DOUB", false)) {
                    i12 = 1;
                } else {
                    i12 = 4;
                }
            } else {
                i12 = 2;
            }
            this.f23783g = i12;
        }

        /* JADX WARN: Code restructure failed: missing block: B:102:0x0069, code lost:
            r1 = true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean equals(java.lang.Object r6) {
            /*
                r5 = this;
                r0 = 1
                if (r5 != r6) goto L4
                return r0
            L4:
                boolean r1 = r6 instanceof p2.a.C0427a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                int r1 = r5.f23780d
                p2.a$a r6 = (p2.a.C0427a) r6
                int r3 = r6.f23780d
                if (r1 == r3) goto L13
                return r2
            L13:
                java.lang.String r1 = r5.f23777a
                java.lang.String r3 = r6.f23777a
                boolean r1 = gm.l.a(r1, r3)
                if (r1 != 0) goto L1e
                return r2
            L1e:
                boolean r1 = r5.f23779c
                boolean r3 = r6.f23779c
                if (r1 == r3) goto L25
                return r2
            L25:
                int r1 = r5.f23782f
                r3 = 2
                if (r1 != r0) goto L3b
                int r1 = r6.f23782f
                if (r1 != r3) goto L3b
                java.lang.String r1 = r5.f23781e
                if (r1 == 0) goto L3b
                java.lang.String r4 = r6.f23781e
                boolean r1 = p2.a.C0427a.C0428a.a(r1, r4)
                if (r1 != 0) goto L3b
                return r2
            L3b:
                int r1 = r5.f23782f
                if (r1 != r3) goto L50
                int r1 = r6.f23782f
                if (r1 != r0) goto L50
                java.lang.String r1 = r6.f23781e
                if (r1 == 0) goto L50
                java.lang.String r3 = r5.f23781e
                boolean r1 = p2.a.C0427a.C0428a.a(r1, r3)
                if (r1 != 0) goto L50
                return r2
            L50:
                int r1 = r5.f23782f
                if (r1 == 0) goto L6f
                int r3 = r6.f23782f
                if (r1 != r3) goto L6f
                java.lang.String r1 = r5.f23781e
                if (r1 == 0) goto L65
                java.lang.String r3 = r6.f23781e
                boolean r1 = p2.a.C0427a.C0428a.a(r1, r3)
                if (r1 != 0) goto L6b
                goto L69
            L65:
                java.lang.String r1 = r6.f23781e
                if (r1 == 0) goto L6b
            L69:
                r1 = 1
                goto L6c
            L6b:
                r1 = 0
            L6c:
                if (r1 == 0) goto L6f
                return r2
            L6f:
                int r1 = r5.f23783g
                int r6 = r6.f23783g
                if (r1 != r6) goto L76
                goto L77
            L76:
                r0 = 0
            L77:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p2.a.C0427a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            return (((((this.f23777a.hashCode() * 31) + this.f23783g) * 31) + (this.f23779c ? 1231 : 1237)) * 31) + this.f23780d;
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("Column{name='");
            a10.append(this.f23777a);
            a10.append("', type='");
            a10.append(this.f23778b);
            a10.append("', affinity='");
            a10.append(this.f23783g);
            a10.append("', notNull=notNull, primaryKeyPosition=");
            a10.append(this.f23780d);
            a10.append(", defaultValue='");
            return e.b(a10, this.f23781e, "'}");
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final String f23784a;

        /* renamed from: b */
        public final String f23785b;

        /* renamed from: c */
        public final String f23786c;

        /* renamed from: d */
        public final List<String> f23787d;

        /* renamed from: e */
        public final List<String> f23788e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            l.f(list, "columnNames");
            l.f(list2, "referenceColumnNames");
            this.f23784a = str;
            this.f23785b = str2;
            this.f23786c = str3;
            this.f23787d = list;
            this.f23788e = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (l.a(this.f23784a, bVar.f23784a) && l.a(this.f23785b, bVar.f23785b) && l.a(this.f23786c, bVar.f23786c) && l.a(this.f23787d, bVar.f23787d)) {
                    return l.a(this.f23788e, bVar.f23788e);
                }
                return false;
            }
            return false;
        }

        public final int hashCode() {
            int a10 = t.a(this.f23786c, t.a(this.f23785b, this.f23784a.hashCode() * 31, 31), 31);
            return this.f23788e.hashCode() + ((this.f23787d.hashCode() + a10) * 31);
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("ForeignKey{referenceTable='");
            a10.append(this.f23784a);
            a10.append("', onDelete='");
            a10.append(this.f23785b);
            a10.append(" +', onUpdate='");
            a10.append(this.f23786c);
            a10.append("', columnNames=");
            a10.append(this.f23787d);
            a10.append(", referenceColumnNames=");
            return fb.b.a(a10, this.f23788e, '}');
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements Comparable<c> {

        /* renamed from: a */
        public final int f23789a;

        /* renamed from: b */
        public final int f23790b;

        /* renamed from: c */
        public final String f23791c;

        /* renamed from: d */
        public final String f23792d;

        public c(int i10, int i11, String str, String str2) {
            this.f23789a = i10;
            this.f23790b = i11;
            this.f23791c = str;
            this.f23792d = str2;
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            c cVar2 = cVar;
            l.f(cVar2, "other");
            int i10 = this.f23789a - cVar2.f23789a;
            return i10 == 0 ? this.f23790b - cVar2.f23790b : i10;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public final String f23793a;

        /* renamed from: b */
        public final boolean f23794b;

        /* renamed from: c */
        public final List<String> f23795c;

        /* renamed from: d */
        public List<String> f23796d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public d(java.lang.String r6, java.util.List r7) {
            /*
                r5 = this;
                java.lang.String r0 = "columns"
                gm.l.f(r7, r0)
                int r0 = r7.size()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r0)
                r2 = 0
                r3 = 0
            L10:
                if (r3 >= r0) goto L1a
                java.lang.String r4 = "ASC"
                r1.add(r4)
                int r3 = r3 + 1
                goto L10
            L1a:
                r5.<init>(r6, r2, r7, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p2.a.d.<init>(java.lang.String, java.util.List):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Collection, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
        public d(String str, boolean z10, List<String> list, List<String> list2) {
            l.f(list, "columns");
            this.f23793a = str;
            this.f23794b = z10;
            this.f23795c = list;
            this.f23796d = list2;
            if (list2.isEmpty()) {
                int size = list.size();
                list2 = new ArrayList<>(size);
                for (int i10 = 0; i10 < size; i10++) {
                    list2.add("ASC");
                }
            }
            this.f23796d = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f23794b != dVar.f23794b || !l.a(this.f23795c, dVar.f23795c) || !l.a(this.f23796d, dVar.f23796d)) {
                return false;
            }
            if (h.a0(this.f23793a, "index_", false)) {
                return h.a0(dVar.f23793a, "index_", false);
            }
            return l.a(this.f23793a, dVar.f23793a);
        }

        public final int hashCode() {
            int hashCode;
            if (h.a0(this.f23793a, "index_", false)) {
                hashCode = -1184239155;
            } else {
                hashCode = this.f23793a.hashCode();
            }
            int hashCode2 = this.f23795c.hashCode();
            return this.f23796d.hashCode() + ((hashCode2 + (((hashCode * 31) + (this.f23794b ? 1 : 0)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("Index{name='");
            a10.append(this.f23793a);
            a10.append("', unique=");
            a10.append(this.f23794b);
            a10.append(", columns=");
            a10.append(this.f23795c);
            a10.append(", orders=");
            a10.append(this.f23796d);
            a10.append("'}");
            return a10.toString();
        }
    }

    public a(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        this.f23773a = str;
        this.f23774b = map;
        this.f23775c = abstractSet;
        this.f23776d = abstractSet2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:249:0x032f, code lost:
        bi.z0.c(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0332, code lost:
        mf.a0.d(r2, null);
        r7 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0315 A[Catch: all -> 0x0345, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x0345, blocks: (B:200:0x0202, B:205:0x021b, B:206:0x0220, B:208:0x0226, B:211:0x0233, B:215:0x0241, B:235:0x02fc, B:240:0x0315, B:236:0x0301, B:249:0x032f, B:216:0x0261, B:222:0x0284, B:223:0x0290, B:225:0x0296, B:228:0x029d, B:232:0x02b2, B:233:0x02d6), top: B:281:0x0202 }] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0310 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final p2.a a(s2.a r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 864
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.a.a(s2.a, java.lang.String):p2.a");
    }

    public final boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.a(this.f23773a, aVar.f23773a) && l.a(this.f23774b, aVar.f23774b) && l.a(this.f23775c, aVar.f23775c)) {
                Set<d> set2 = this.f23776d;
                if (set2 == null || (set = aVar.f23776d) == null) {
                    return true;
                }
                return l.a(set2, set);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f23774b.hashCode();
        return this.f23775c.hashCode() + ((hashCode + (this.f23773a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("TableInfo{name='");
        a10.append(this.f23773a);
        a10.append("', columns=");
        a10.append(this.f23774b);
        a10.append(", foreignKeys=");
        a10.append(this.f23775c);
        a10.append(", indices=");
        a10.append(this.f23776d);
        a10.append('}');
        return a10.toString();
    }
}
