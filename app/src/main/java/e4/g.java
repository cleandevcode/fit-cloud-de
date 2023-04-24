package e4;

import j4.a1;
import j4.j0;
import j4.t0;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class g implements e4.c {

    /* renamed from: f */
    public static ConcurrentHashMap f13355f = new ConcurrentHashMap(128, 0.75f, 1);

    /* renamed from: a */
    public final String f13356a;

    /* renamed from: b */
    public z[] f13357b;

    /* renamed from: c */
    public a1 f13358c;

    /* renamed from: d */
    public h4.k f13359d;

    /* renamed from: e */
    public boolean f13360e;

    /* loaded from: classes.dex */
    public static class a implements z {

        /* renamed from: a */
        public final int f13361a;

        public a(int i10) {
            this.f13361a = i10;
        }

        @Override // e4.g.z
        public final Object a(g gVar, Object obj, Object obj2) {
            int i10 = this.f13361a;
            gVar.getClass();
            return g.f(i10, obj2);
        }
    }

    /* loaded from: classes.dex */
    public static class a0 implements z {

        /* renamed from: a */
        public static final a0 f13362a = new a0();

        public static Integer b(g gVar, Object obj) {
            int i10;
            gVar.getClass();
            if (obj != null) {
                if (obj instanceof Collection) {
                    i10 = ((Collection) obj).size();
                } else if (obj instanceof Object[]) {
                    i10 = ((Object[]) obj).length;
                } else if (obj.getClass().isArray()) {
                    i10 = Array.getLength(obj);
                } else {
                    int i11 = 0;
                    if (obj instanceof Map) {
                        for (Object obj2 : ((Map) obj).values()) {
                            if (obj2 != null) {
                                i11++;
                            }
                        }
                    } else {
                        j0 g10 = gVar.g(obj.getClass());
                        if (g10 != null) {
                            try {
                                for (j4.a0 a0Var : g10.f17419j) {
                                    if (a0Var.c(obj) != null) {
                                        i11++;
                                    }
                                }
                            } catch (Exception e10) {
                                StringBuilder a10 = android.support.v4.media.d.a("evalSize error : ");
                                a10.append(gVar.f13356a);
                                throw new e4.h(a10.toString(), e10);
                            }
                        }
                    }
                    i10 = i11;
                }
                return Integer.valueOf(i10);
            }
            i10 = -1;
            return Integer.valueOf(i10);
        }

        @Override // e4.g.z
        public final /* bridge */ /* synthetic */ Object a(g gVar, Object obj, Object obj2) {
            return b(gVar, obj2);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends t {

        /* renamed from: e */
        public final double f13363e;

        /* renamed from: f */
        public final int f13364f;

        public b(String str, boolean z10, double d10, int i10) {
            super(str, z10);
            this.f13363e = d10;
            this.f13364f = i10;
        }

        @Override // e4.g.c
        public final boolean a(g gVar, Object obj, Object obj2, Object obj3) {
            Object b10 = b(gVar, obj, obj3);
            if (b10 != null && (b10 instanceof Number)) {
                double doubleValue = ((Number) b10).doubleValue();
                int b11 = s.c0.b(this.f13364f);
                return b11 != 0 ? b11 != 1 ? b11 != 2 ? b11 != 3 ? b11 != 4 ? b11 == 5 && doubleValue <= this.f13363e : doubleValue < this.f13363e : doubleValue >= this.f13363e : doubleValue > this.f13363e : doubleValue != this.f13363e : doubleValue == this.f13363e;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class b0 extends t {

        /* renamed from: e */
        public final String[] f13365e;

        /* renamed from: f */
        public final boolean f13366f;

        public b0(String str, boolean z10, String[] strArr, boolean z11) {
            super(str, z10);
            this.f13365e = strArr;
            this.f13366f = z11;
        }

        @Override // e4.g.c
        public final boolean a(g gVar, Object obj, Object obj2, Object obj3) {
            String[] strArr;
            Object b10 = b(gVar, obj, obj3);
            for (String str : this.f13365e) {
                if (str == b10 || (str != null && str.equals(b10))) {
                    return !this.f13366f;
                }
            }
            return this.f13366f;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        boolean a(g gVar, Object obj, Object obj2, Object obj3);
    }

    /* loaded from: classes.dex */
    public static class c0 extends t {

        /* renamed from: e */
        public final String f13367e;

        /* renamed from: f */
        public final int f13368f;

        public c0(String str, boolean z10, String str2, int i10) {
            super(str, z10);
            this.f13367e = str2;
            this.f13368f = i10;
        }

        @Override // e4.g.c
        public final boolean a(g gVar, Object obj, Object obj2, Object obj3) {
            Object b10 = b(gVar, obj, obj3);
            int i10 = this.f13368f;
            if (i10 == 1) {
                return this.f13367e.equals(b10);
            }
            if (i10 == 2) {
                return !this.f13367e.equals(b10);
            }
            if (b10 == null) {
                return false;
            }
            int compareTo = this.f13367e.compareTo(b10.toString());
            int i11 = this.f13368f;
            return i11 == 4 ? compareTo <= 0 : i11 == 3 ? compareTo < 0 : i11 == 6 ? compareTo >= 0 : i11 == 5 && compareTo > 0;
        }
    }

    /* loaded from: classes.dex */
    public static class d implements c {

        /* renamed from: a */
        public boolean f13369a;

        /* renamed from: b */
        public ArrayList f13370b;

        public d(t tVar, c cVar, boolean z10) {
            ArrayList arrayList = new ArrayList(2);
            this.f13370b = arrayList;
            arrayList.add(tVar);
            this.f13370b.add(cVar);
            this.f13369a = z10;
        }

        @Override // e4.g.c
        public final boolean a(g gVar, Object obj, Object obj2, Object obj3) {
            if (this.f13369a) {
                Iterator it = this.f13370b.iterator();
                while (it.hasNext()) {
                    if (!((c) it.next()).a(gVar, obj, obj2, obj3)) {
                        return false;
                    }
                }
                return true;
            }
            Iterator it2 = this.f13370b.iterator();
            while (it2.hasNext()) {
                if (((c) it2.next()).a(gVar, obj, obj2, obj3)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class d0 implements z {

        /* renamed from: a */
        public static final d0 f13371a = new d0();

        @Override // e4.g.z
        public final Object a(g gVar, Object obj, Object obj2) {
            return obj2 == null ? "null" : obj2 instanceof Collection ? "array" : obj2 instanceof Number ? "number" : obj2 instanceof Boolean ? "boolean" : ((obj2 instanceof String) || (obj2 instanceof UUID) || (obj2 instanceof Enum)) ? "string" : "object";
        }
    }

    /* loaded from: classes.dex */
    public static class e implements z {

        /* renamed from: a */
        public final c f13372a;

        public e(c cVar) {
            this.f13372a = cVar;
        }

        @Override // e4.g.z
        public final Object a(g gVar, Object obj, Object obj2) {
            if (obj2 == null) {
                return null;
            }
            e4.b bVar = new e4.b();
            if (!(obj2 instanceof Iterable)) {
                if (this.f13372a.a(gVar, obj, obj2, obj2)) {
                    return obj2;
                }
                return null;
            }
            for (Object obj3 : (Iterable) obj2) {
                if (this.f13372a.a(gVar, obj, obj2, obj3)) {
                    bVar.add(obj3);
                }
            }
            return bVar;
        }
    }

    /* loaded from: classes.dex */
    public static class e0 extends t {

        /* renamed from: e */
        public final Object f13373e;

        /* renamed from: f */
        public boolean f13374f;

        public e0(String str, boolean z10, Boolean bool, boolean z11) {
            super(str, z10);
            this.f13374f = true;
            if (bool == null) {
                throw new IllegalArgumentException("value is null");
            }
            this.f13373e = bool;
            this.f13374f = z11;
        }

        @Override // e4.g.c
        public final boolean a(g gVar, Object obj, Object obj2, Object obj3) {
            boolean equals = this.f13373e.equals(b(gVar, obj, obj3));
            return !this.f13374f ? !equals : equals;
        }
    }

    /* loaded from: classes.dex */
    public static class f implements z {

        /* renamed from: a */
        public static final f f13375a = new f();

        public static Object b(Object obj) {
            if (obj == null) {
                return null;
            }
            if (obj instanceof Float) {
                return Double.valueOf(Math.floor(((Float) obj).floatValue()));
            }
            if (obj instanceof Double) {
                return Double.valueOf(Math.floor(((Double) obj).doubleValue()));
            }
            if (obj instanceof BigDecimal) {
                return ((BigDecimal) obj).setScale(0, RoundingMode.FLOOR);
            }
            if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof BigInteger)) {
                return obj;
            }
            throw new UnsupportedOperationException();
        }

        @Override // e4.g.z
        public final Object a(g gVar, Object obj, Object obj2) {
            if (obj2 instanceof e4.b) {
                e4.b bVar = (e4.b) ((e4.b) obj2).clone();
                for (int i10 = 0; i10 < bVar.size(); i10++) {
                    Object obj3 = bVar.get(i10);
                    Object b10 = b(obj3);
                    if (b10 != obj3) {
                        bVar.set(i10, b10);
                    }
                }
                return bVar;
            }
            return b(obj2);
        }
    }

    /* loaded from: classes.dex */
    public static class f0 implements z {

        /* renamed from: b */
        public static final f0 f13376b = new f0(false);

        /* renamed from: c */
        public static final f0 f13377c = new f0(true);

        /* renamed from: d */
        public static final f0 f13378d = new f0(true);

        /* renamed from: a */
        public boolean f13379a;

        public f0(boolean z10) {
            this.f13379a = z10;
        }

        @Override // e4.g.z
        public final Object a(g gVar, Object obj, Object obj2) {
            if (!this.f13379a) {
                gVar.getClass();
                if (obj2 == null) {
                    return null;
                }
                j0 g10 = gVar.g(obj2.getClass());
                if (g10 != null) {
                    try {
                        return g10.l(obj2);
                    } catch (Exception e10) {
                        StringBuilder a10 = android.support.v4.media.d.a("jsonpath error, path ");
                        a10.append(gVar.f13356a);
                        throw new e4.h(a10.toString(), e10);
                    }
                } else if (obj2 instanceof Map) {
                    return ((Map) obj2).values();
                } else {
                    if (obj2 instanceof Collection) {
                        return (Collection) obj2;
                    }
                    throw new UnsupportedOperationException();
                }
            }
            ArrayList arrayList = new ArrayList();
            gVar.c(arrayList, obj2);
            return arrayList;
        }
    }

    /* renamed from: e4.g$g */
    /* loaded from: classes.dex */
    public static class C0236g extends t {

        /* renamed from: e */
        public final long f13380e;

        /* renamed from: f */
        public final long f13381f;

        /* renamed from: g */
        public final boolean f13382g;

        public C0236g(String str, boolean z10, long j10, long j11, boolean z11) {
            super(str, z10);
            this.f13380e = j10;
            this.f13381f = j11;
            this.f13382g = z11;
        }

        @Override // e4.g.c
        public final boolean a(g gVar, Object obj, Object obj2, Object obj3) {
            Object b10 = b(gVar, obj, obj3);
            if (b10 == null) {
                return false;
            }
            if (b10 instanceof Number) {
                long c02 = n4.n.c0((Number) b10);
                if (c02 >= this.f13380e && c02 <= this.f13381f) {
                    return !this.f13382g;
                }
            }
            return this.f13382g;
        }
    }

    /* loaded from: classes.dex */
    public static class h extends t {

        /* renamed from: e */
        public final long[] f13383e;

        /* renamed from: f */
        public final boolean f13384f;

        public h(String str, boolean z10, long[] jArr, boolean z11) {
            super(str, z10);
            this.f13383e = jArr;
            this.f13384f = z11;
        }

        @Override // e4.g.c
        public final boolean a(g gVar, Object obj, Object obj2, Object obj3) {
            Object b10 = b(gVar, obj, obj3);
            if (b10 == null) {
                return false;
            }
            if (b10 instanceof Number) {
                long c02 = n4.n.c0((Number) b10);
                for (long j10 : this.f13383e) {
                    if (j10 == c02) {
                        return !this.f13384f;
                    }
                }
            }
            return this.f13384f;
        }
    }

    /* loaded from: classes.dex */
    public static class i extends t {

        /* renamed from: e */
        public final Long[] f13385e;

        /* renamed from: f */
        public final boolean f13386f;

        public i(String str, boolean z10, Long[] lArr, boolean z11) {
            super(str, z10);
            this.f13385e = lArr;
            this.f13386f = z11;
        }

        @Override // e4.g.c
        public final boolean a(g gVar, Object obj, Object obj2, Object obj3) {
            Object b10 = b(gVar, obj, obj3);
            int i10 = 0;
            if (b10 == null) {
                Long[] lArr = this.f13385e;
                int length = lArr.length;
                while (i10 < length) {
                    if (lArr[i10] != null) {
                        i10++;
                    }
                }
                return this.f13386f;
            }
            if (b10 instanceof Number) {
                long c02 = n4.n.c0((Number) b10);
                Long[] lArr2 = this.f13385e;
                int length2 = lArr2.length;
                while (i10 < length2) {
                    Long l10 = lArr2[i10];
                    if (l10 == null || l10.longValue() != c02) {
                        i10++;
                    }
                }
            }
            return this.f13386f;
            return !this.f13386f;
        }
    }

    /* loaded from: classes.dex */
    public static class j extends t {

        /* renamed from: e */
        public final long f13387e;

        /* renamed from: f */
        public final int f13388f;

        /* renamed from: g */
        public BigDecimal f13389g;

        /* renamed from: h */
        public Float f13390h;

        /* renamed from: i */
        public Double f13391i;

        public j(String str, boolean z10, long j10, int i10) {
            super(str, z10);
            this.f13387e = j10;
            this.f13388f = i10;
        }

        @Override // e4.g.c
        public final boolean a(g gVar, Object obj, Object obj2, Object obj3) {
            Object b10 = b(gVar, obj, obj3);
            if (b10 != null && (b10 instanceof Number)) {
                if (b10 instanceof BigDecimal) {
                    if (this.f13389g == null) {
                        this.f13389g = BigDecimal.valueOf(this.f13387e);
                    }
                    int compareTo = this.f13389g.compareTo((BigDecimal) b10);
                    int b11 = s.c0.b(this.f13388f);
                    return b11 != 0 ? b11 != 1 ? b11 != 2 ? b11 != 3 ? b11 != 4 ? b11 == 5 && compareTo >= 0 : compareTo > 0 : compareTo <= 0 : compareTo < 0 : compareTo != 0 : compareTo == 0;
                } else if (b10 instanceof Float) {
                    if (this.f13390h == null) {
                        this.f13390h = Float.valueOf((float) this.f13387e);
                    }
                    int compareTo2 = this.f13390h.compareTo((Float) b10);
                    int b12 = s.c0.b(this.f13388f);
                    return b12 != 0 ? b12 != 1 ? b12 != 2 ? b12 != 3 ? b12 != 4 ? b12 == 5 && compareTo2 >= 0 : compareTo2 > 0 : compareTo2 <= 0 : compareTo2 < 0 : compareTo2 != 0 : compareTo2 == 0;
                } else if (!(b10 instanceof Double)) {
                    long c02 = n4.n.c0((Number) b10);
                    int b13 = s.c0.b(this.f13388f);
                    return b13 != 0 ? b13 != 1 ? b13 != 2 ? b13 != 3 ? b13 != 4 ? b13 == 5 && c02 <= this.f13387e : c02 < this.f13387e : c02 >= this.f13387e : c02 > this.f13387e : c02 != this.f13387e : c02 == this.f13387e;
                } else {
                    if (this.f13391i == null) {
                        this.f13391i = Double.valueOf(this.f13387e);
                    }
                    int compareTo3 = this.f13391i.compareTo((Double) b10);
                    int b14 = s.c0.b(this.f13388f);
                    return b14 != 0 ? b14 != 1 ? b14 != 2 ? b14 != 3 ? b14 != 4 ? b14 == 5 && compareTo3 >= 0 : compareTo3 > 0 : compareTo3 <= 0 : compareTo3 < 0 : compareTo3 != 0 : compareTo3 == 0;
                }
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class k {

        /* renamed from: e */
        public static final Pattern f13392e = Pattern.compile("'\\s*,\\s*'");

        /* renamed from: a */
        public final String f13393a;

        /* renamed from: b */
        public int f13394b;

        /* renamed from: c */
        public char f13395c;

        /* renamed from: d */
        public int f13396d;

        public k(String str) {
            this.f13393a = str;
            e();
        }

        public static boolean c(char c10) {
            return c10 == '-' || c10 == '+' || (c10 >= '0' && c10 <= '9');
        }

        public final void a(char c10) {
            if (this.f13395c == ' ') {
                e();
            }
            if (this.f13395c == c10) {
                if (d()) {
                    return;
                }
                e();
                return;
            }
            throw new e4.h("expect '" + c10 + ", but '" + this.f13395c + "'");
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0041  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x003b -> B:48:0x003d). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final e4.g.c b(e4.g.t r7) {
            /*
                r6 = this;
                char r0 = r6.f13395c
                r1 = 1
                r2 = 0
                r3 = 38
                if (r0 != r3) goto La
                r4 = 1
                goto Lb
            La:
                r4 = 0
            Lb:
                if (r0 != r3) goto L17
                java.lang.String r0 = r6.f13393a
                int r5 = r6.f13394b
                char r0 = r0.charAt(r5)
                if (r0 == r3) goto L27
            L17:
                char r0 = r6.f13395c
                r3 = 124(0x7c, float:1.74E-43)
                if (r0 != r3) goto L58
                java.lang.String r0 = r6.f13393a
                int r5 = r6.f13394b
                char r0 = r0.charAt(r5)
                if (r0 != r3) goto L58
            L27:
                r6.e()
                r6.e()
                char r0 = r6.f13395c
                r3 = 40
                if (r0 != r3) goto L35
                r0 = r6
                goto L3d
            L35:
                r1 = 0
                r0 = r6
            L37:
                char r3 = r0.f13395c
                r5 = 32
                if (r3 != r5) goto L41
            L3d:
                r0.e()
                goto L37
            L41:
                java.lang.Object r2 = r0.f(r2)
                e4.g$c r2 = (e4.g.c) r2
                e4.g$d r3 = new e4.g$d
                r3.<init>(r7, r2, r4)
                if (r1 == 0) goto L57
                char r7 = r0.f13395c
                r1 = 41
                if (r7 != r1) goto L57
                r0.e()
            L57:
                r7 = r3
            L58:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: e4.g.k.b(e4.g$t):e4.g$c");
        }

        public final boolean d() {
            return this.f13394b >= this.f13393a.length();
        }

        public final void e() {
            String str = this.f13393a;
            int i10 = this.f13394b;
            this.f13394b = i10 + 1;
            this.f13395c = str.charAt(i10);
        }

        /* JADX WARN: Code restructure failed: missing block: B:1015:0x0441, code lost:
            if (r1 == '|') goto L291;
         */
        /* JADX WARN: Code restructure failed: missing block: B:1193:0x06b7, code lost:
            if (r1 == '|') goto L430;
         */
        /* JADX WARN: Code restructure failed: missing block: B:1238:0x0747, code lost:
            if (r2 == '|') goto L540;
         */
        /* JADX WARN: Code restructure failed: missing block: B:1260:0x0792, code lost:
            if (r2 == '|') goto L563;
         */
        /* JADX WARN: Code restructure failed: missing block: B:1278:0x07d7, code lost:
            if (r2 == '|') goto L584;
         */
        /* JADX WARN: Code restructure failed: missing block: B:1299:0x0817, code lost:
            if (r1 == '|') goto L606;
         */
        /* JADX WARN: Code restructure failed: missing block: B:1314:0x084d, code lost:
            if (r1 == '|') goto L622;
         */
        /* JADX WARN: Code restructure failed: missing block: B:1337:0x089a, code lost:
            if (r2 == '|') goto L649;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:774:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:792:0x00df  */
        /* JADX WARN: Removed duplicated region for block: B:806:0x0124  */
        /* JADX WARN: Removed duplicated region for block: B:865:0x0231  */
        /* JADX WARN: Type inference failed for: r1v122, types: [e4.g$t, e4.g$r] */
        /* JADX WARN: Type inference failed for: r1v123, types: [e4.g$c] */
        /* JADX WARN: Type inference failed for: r1v124, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r21v0, types: [e4.g$k] */
        /* JADX WARN: Type inference failed for: r2v91, types: [e4.g$t, e4.g$r] */
        /* JADX WARN: Type inference failed for: r2v92, types: [e4.g$c] */
        /* JADX WARN: Type inference failed for: r2v93, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v11 */
        /* JADX WARN: Type inference failed for: r9v13, types: [e4.g$t] */
        /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v15, types: [e4.g$c] */
        /* JADX WARN: Type inference failed for: r9v17 */
        /* JADX WARN: Type inference failed for: r9v19, types: [e4.g$t] */
        /* JADX WARN: Type inference failed for: r9v20, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v21, types: [e4.g$c] */
        /* JADX WARN: Type inference failed for: r9v31 */
        /* JADX WARN: Type inference failed for: r9v32 */
        /* JADX WARN: Type inference failed for: r9v33 */
        /* JADX WARN: Type inference failed for: r9v34 */
        /* JADX WARN: Type inference failed for: r9v35 */
        /* JADX WARN: Type inference failed for: r9v36 */
        /* JADX WARN: Type inference failed for: r9v5 */
        /* JADX WARN: Type inference failed for: r9v7, types: [e4.g$t] */
        /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v9, types: [e4.g$c] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object f(boolean r22) {
            /*
                Method dump skipped, instructions count: 2348
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: e4.g.k.f(boolean):java.lang.Object");
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x000c, code lost:
            if (r1 != '-') goto L5;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0019 -> B:20:0x000e). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final long g() {
            /*
                r3 = this;
                int r0 = r3.f13394b
                int r0 = r0 + (-1)
                char r1 = r3.f13395c
                r2 = 43
                if (r1 == r2) goto Le
                r2 = 45
                if (r1 != r2) goto L11
            Le:
                r3.e()
            L11:
                char r1 = r3.f13395c
                r2 = 48
                if (r1 < r2) goto L1c
                r2 = 57
                if (r1 > r2) goto L1c
                goto Le
            L1c:
                int r1 = r3.f13394b
                int r1 = r1 + (-1)
                java.lang.String r2 = r3.f13393a
                java.lang.String r0 = r2.substring(r0, r1)
                long r0 = java.lang.Long.parseLong(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: e4.g.k.g():long");
        }

        public final String h() {
            l();
            char c10 = this.f13395c;
            if (c10 != '\\' && !Character.isJavaIdentifierStart(c10)) {
                StringBuilder a10 = android.support.v4.media.d.a("illeal jsonpath syntax. ");
                a10.append(this.f13393a);
                throw new e4.h(a10.toString());
            }
            StringBuilder sb2 = new StringBuilder();
            while (!d()) {
                char c11 = this.f13395c;
                if (c11 == '\\') {
                    e();
                    sb2.append(this.f13395c);
                    if (d()) {
                        return sb2.toString();
                    }
                } else if (!Character.isJavaIdentifierPart(c11)) {
                    break;
                } else {
                    sb2.append(this.f13395c);
                }
                e();
            }
            if (d() && Character.isJavaIdentifierPart(this.f13395c)) {
                sb2.append(this.f13395c);
            }
            return sb2.toString();
        }

        public final z i() {
            boolean z10;
            boolean z11 = true;
            if (this.f13396d == 0 && this.f13393a.length() == 1) {
                if (c(this.f13395c)) {
                    return new a(this.f13395c - '0');
                }
                char c10 = this.f13395c;
                if ((c10 >= 'a' && c10 <= 'z') || (c10 >= 'A' && c10 <= 'Z')) {
                    return new u(Character.toString(c10), false);
                }
            }
            while (!d()) {
                l();
                char c11 = this.f13395c;
                if (c11 == '$') {
                    e();
                    l();
                    if (this.f13395c == '?') {
                        return new e((c) f(false));
                    }
                } else if (c11 != '.' && c11 != '/') {
                    if (c11 == '[') {
                        Object f10 = f(true);
                        if (f10 instanceof z) {
                            return (z) f10;
                        }
                        return new e((c) f10);
                    } else if (this.f13396d == 0) {
                        return new u(h(), false);
                    } else {
                        if (c11 == '?') {
                            return new e((c) f(false));
                        }
                        StringBuilder a10 = android.support.v4.media.d.a("not support jsonpath : ");
                        a10.append(this.f13393a);
                        throw new e4.h(a10.toString());
                    }
                } else {
                    e();
                    if (c11 == '.' && this.f13395c == '.') {
                        e();
                        int length = this.f13393a.length();
                        int i10 = this.f13394b;
                        if (length > i10 + 3 && this.f13395c == '[' && this.f13393a.charAt(i10) == '*' && this.f13393a.charAt(this.f13394b + 1) == ']' && this.f13393a.charAt(this.f13394b + 2) == '.') {
                            e();
                            e();
                            e();
                            e();
                        }
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    char c12 = this.f13395c;
                    if (c12 != '*' && (!z10 || c12 != '[')) {
                        if (c(c12)) {
                            Object f11 = f(false);
                            if (f11 instanceof z) {
                                return (z) f11;
                            }
                            return new e((c) f11);
                        }
                        String h10 = h();
                        if (this.f13395c == '(') {
                            e();
                            if (this.f13395c == ')') {
                                if (!d()) {
                                    e();
                                }
                                if (!"size".equals(h10) && !"length".equals(h10)) {
                                    if ("max".equals(h10)) {
                                        return n.f13403a;
                                    }
                                    if ("min".equals(h10)) {
                                        return o.f13404a;
                                    }
                                    if ("keySet".equals(h10)) {
                                        return l.f13397a;
                                    }
                                    if ("type".equals(h10)) {
                                        return d0.f13371a;
                                    }
                                    if ("floor".equals(h10)) {
                                        return f.f13375a;
                                    }
                                    StringBuilder a11 = android.support.v4.media.d.a("not support jsonpath : ");
                                    a11.append(this.f13393a);
                                    throw new e4.h(a11.toString());
                                }
                                return a0.f13362a;
                            }
                            StringBuilder a12 = android.support.v4.media.d.a("not support jsonpath : ");
                            a12.append(this.f13393a);
                            throw new e4.h(a12.toString());
                        }
                        return new u(h10, z10);
                    }
                    if (c12 != '[') {
                        z11 = false;
                    }
                    if (!d()) {
                        e();
                    }
                    if (z10) {
                        if (z11) {
                            return f0.f13378d;
                        }
                        return f0.f13377c;
                    }
                    return f0.f13376b;
                }
            }
            return null;
        }

        public final String j() {
            char c10 = this.f13395c;
            e();
            int i10 = this.f13394b - 1;
            while (this.f13395c != c10 && !d()) {
                e();
            }
            String substring = this.f13393a.substring(i10, d() ? this.f13394b : this.f13394b - 1);
            a(c10);
            return substring;
        }

        public final Object k() {
            l();
            if (c(this.f13395c)) {
                return Long.valueOf(g());
            }
            char c10 = this.f13395c;
            if (c10 == '\"' || c10 == '\'') {
                return j();
            }
            if (c10 == 'n') {
                if ("null".equals(h())) {
                    return null;
                }
                throw new e4.h(this.f13393a);
            }
            throw new UnsupportedOperationException();
        }

        public final void l() {
            while (true) {
                char c10 = this.f13395c;
                if (c10 > ' ') {
                    return;
                }
                if (c10 != ' ' && c10 != '\r' && c10 != '\n' && c10 != '\t' && c10 != '\f' && c10 != '\b') {
                    return;
                }
                e();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class l implements z {

        /* renamed from: a */
        public static final l f13397a = new l();

        @Override // e4.g.z
        public final Object a(g gVar, Object obj, Object obj2) {
            j0 g10;
            j4.a0[] a0VarArr;
            gVar.getClass();
            if (obj2 != null) {
                if (obj2 instanceof Map) {
                    return ((Map) obj2).keySet();
                }
                if (!(obj2 instanceof Collection) && !(obj2 instanceof Object[]) && !obj2.getClass().isArray() && (g10 = gVar.g(obj2.getClass())) != null) {
                    try {
                        HashSet hashSet = new HashSet();
                        for (j4.a0 a0Var : g10.f17419j) {
                            if (a0Var.c(obj2) != null) {
                                hashSet.add(a0Var.f17298a.f21947a);
                            }
                        }
                        return hashSet;
                    } catch (Exception e10) {
                        StringBuilder a10 = android.support.v4.media.d.a("evalKeySet error : ");
                        a10.append(gVar.f13356a);
                        throw new e4.h(a10.toString(), e10);
                    }
                }
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class m extends t {

        /* renamed from: e */
        public final String f13398e;

        /* renamed from: f */
        public final String f13399f;

        /* renamed from: g */
        public final String[] f13400g;

        /* renamed from: h */
        public final int f13401h;

        /* renamed from: i */
        public final boolean f13402i;

        public m(String str, boolean z10, String str2, String str3, String[] strArr, boolean z11) {
            super(str, z10);
            this.f13398e = str2;
            this.f13399f = str3;
            this.f13400g = strArr;
            this.f13402i = z11;
            int length = str2 != null ? str2.length() + 0 : 0;
            length = str3 != null ? length + str3.length() : length;
            if (strArr != null) {
                for (String str4 : strArr) {
                    length += str4.length();
                }
            }
            this.f13401h = length;
        }

        @Override // e4.g.c
        public final boolean a(g gVar, Object obj, Object obj2, Object obj3) {
            int i10;
            Object b10 = b(gVar, obj, obj3);
            if (b10 == null) {
                return false;
            }
            String obj4 = b10.toString();
            if (obj4.length() < this.f13401h) {
                return this.f13402i;
            }
            String str = this.f13398e;
            if (str == null) {
                i10 = 0;
            } else if (!obj4.startsWith(str)) {
                return this.f13402i;
            } else {
                i10 = this.f13398e.length() + 0;
            }
            String[] strArr = this.f13400g;
            if (strArr != null) {
                for (String str2 : strArr) {
                    int indexOf = obj4.indexOf(str2, i10);
                    if (indexOf == -1) {
                        return this.f13402i;
                    }
                    i10 = indexOf + str2.length();
                }
            }
            String str3 = this.f13399f;
            return (str3 == null || obj4.endsWith(str3)) ? !this.f13402i : this.f13402i;
        }
    }

    /* loaded from: classes.dex */
    public static class n implements z {

        /* renamed from: a */
        public static final n f13403a = new n();

        @Override // e4.g.z
        public final Object a(g gVar, Object obj, Object obj2) {
            if (obj2 instanceof Collection) {
                Object obj3 = null;
                for (Object obj4 : (Collection) obj2) {
                    if (obj4 != null && (obj3 == null || g.a(obj3, obj4) < 0)) {
                        obj3 = obj4;
                    }
                }
                return obj3;
            }
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    public static class o implements z {

        /* renamed from: a */
        public static final o f13404a = new o();

        @Override // e4.g.z
        public final Object a(g gVar, Object obj, Object obj2) {
            if (obj2 instanceof Collection) {
                Object obj3 = null;
                for (Object obj4 : (Collection) obj2) {
                    if (obj4 != null && (obj3 == null || g.a(obj3, obj4) > 0)) {
                        obj3 = obj4;
                    }
                }
                return obj3;
            }
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    public static class p implements z {

        /* renamed from: a */
        public final int[] f13405a;

        public p(int[] iArr) {
            this.f13405a = iArr;
        }

        @Override // e4.g.z
        public final Object a(g gVar, Object obj, Object obj2) {
            e4.b bVar = new e4.b(this.f13405a.length);
            int i10 = 0;
            while (true) {
                int[] iArr = this.f13405a;
                if (i10 >= iArr.length) {
                    return bVar;
                }
                int i11 = iArr[i10];
                gVar.getClass();
                bVar.add(g.f(i11, obj2));
                i10++;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class q implements z {

        /* renamed from: a */
        public final String[] f13406a;

        /* renamed from: b */
        public final long[] f13407b;

        public q(String[] strArr) {
            this.f13406a = strArr;
            this.f13407b = new long[strArr.length];
            int i10 = 0;
            while (true) {
                long[] jArr = this.f13407b;
                if (i10 >= jArr.length) {
                    return;
                }
                jArr[i10] = n4.n.t(strArr[i10]);
                i10++;
            }
        }

        @Override // e4.g.z
        public final Object a(g gVar, Object obj, Object obj2) {
            ArrayList arrayList = new ArrayList(this.f13406a.length);
            int i10 = 0;
            while (true) {
                String[] strArr = this.f13406a;
                if (i10 >= strArr.length) {
                    return arrayList;
                }
                arrayList.add(gVar.h(obj2, strArr[i10], this.f13407b[i10]));
                i10++;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class r extends t {
        public r(String str, boolean z10) {
            super(str, z10);
        }

        @Override // e4.g.c
        public final boolean a(g gVar, Object obj, Object obj2, Object obj3) {
            return gVar.h(obj3, this.f13409a, this.f13410b) != null;
        }
    }

    /* loaded from: classes.dex */
    public static class s extends t {
        public s(String str, boolean z10) {
            super(str, z10);
        }

        @Override // e4.g.c
        public final boolean a(g gVar, Object obj, Object obj2, Object obj3) {
            return b(gVar, obj, obj3) == null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class t implements c {

        /* renamed from: d */
        public static long f13408d = n4.n.t("type");

        /* renamed from: a */
        public final String f13409a;

        /* renamed from: b */
        public final long f13410b;

        /* renamed from: c */
        public z f13411c;

        public t(String str, boolean z10) {
            z zVar;
            this.f13409a = str;
            long t10 = n4.n.t(str);
            this.f13410b = t10;
            if (z10) {
                if (t10 == f13408d) {
                    zVar = d0.f13371a;
                } else if (t10 == 5614464919154503228L) {
                    zVar = a0.f13362a;
                } else {
                    throw new e4.h(a.b.b("unsupported funciton : ", str));
                }
                this.f13411c = zVar;
            }
        }

        public final Object b(g gVar, Object obj, Object obj2) {
            z zVar = this.f13411c;
            return zVar != null ? zVar.a(gVar, obj, obj2) : gVar.h(obj2, this.f13409a, this.f13410b);
        }
    }

    /* loaded from: classes.dex */
    public static class u implements z {

        /* renamed from: a */
        public final String f13412a;

        /* renamed from: b */
        public final long f13413b;

        /* renamed from: c */
        public final boolean f13414c;

        public u(String str, boolean z10) {
            this.f13412a = str;
            this.f13413b = n4.n.t(str);
            this.f13414c = z10;
        }

        @Override // e4.g.z
        public final Object a(g gVar, Object obj, Object obj2) {
            if (this.f13414c) {
                ArrayList arrayList = new ArrayList();
                gVar.d(obj2, this.f13412a, arrayList);
                return arrayList;
            }
            return gVar.h(obj2, this.f13412a, this.f13413b);
        }
    }

    /* loaded from: classes.dex */
    public static class v implements z {

        /* renamed from: a */
        public final int f13415a;

        /* renamed from: b */
        public final int f13416b;

        /* renamed from: c */
        public final int f13417c;

        public v(int i10, int i11, int i12) {
            this.f13415a = i10;
            this.f13416b = i11;
            this.f13417c = i12;
        }

        @Override // e4.g.z
        public final Object a(g gVar, Object obj, Object obj2) {
            int intValue = a0.b(gVar, obj2).intValue();
            int i10 = this.f13415a;
            if (i10 < 0) {
                i10 += intValue;
            }
            int i11 = this.f13416b;
            if (i11 < 0) {
                i11 += intValue;
            }
            int i12 = ((i11 - i10) / this.f13417c) + 1;
            if (i12 == -1) {
                return null;
            }
            ArrayList arrayList = new ArrayList(i12);
            while (i10 <= i11 && i10 < intValue) {
                arrayList.add(g.f(i10, obj2));
                i10 += this.f13417c;
            }
            return arrayList;
        }
    }

    /* loaded from: classes.dex */
    public static class w extends t {

        /* renamed from: e */
        public final z f13418e;

        /* renamed from: f */
        public final int f13419f;

        public w(String str, boolean z10, z zVar, int i10) {
            super(str, z10);
            this.f13418e = zVar;
            this.f13419f = i10;
        }

        @Override // e4.g.c
        public final boolean a(g gVar, Object obj, Object obj2, Object obj3) {
            Object b10 = b(gVar, obj, obj3);
            if (b10 != null && (b10 instanceof Number)) {
                Object a10 = this.f13418e.a(gVar, obj, obj);
                if ((a10 instanceof Integer) || (a10 instanceof Long) || (a10 instanceof Short) || (a10 instanceof Byte)) {
                    long c02 = n4.n.c0((Number) a10);
                    if ((b10 instanceof Integer) || (b10 instanceof Long) || (b10 instanceof Short) || (b10 instanceof Byte)) {
                        long c03 = n4.n.c0((Number) b10);
                        int b11 = s.c0.b(this.f13419f);
                        if (b11 == 0) {
                            return c03 == c02;
                        } else if (b11 == 1) {
                            return c03 != c02;
                        } else if (b11 == 2) {
                            return c03 > c02;
                        } else if (b11 == 3) {
                            return c03 >= c02;
                        } else if (b11 == 4) {
                            return c03 < c02;
                        } else if (b11 == 5) {
                            return c03 <= c02;
                        }
                    } else if (b10 instanceof BigDecimal) {
                        int compareTo = BigDecimal.valueOf(c02).compareTo((BigDecimal) b10);
                        int b12 = s.c0.b(this.f13419f);
                        return b12 != 0 ? b12 != 1 ? b12 != 2 ? b12 != 3 ? b12 != 4 ? b12 == 5 && compareTo >= 0 : compareTo > 0 : compareTo <= 0 : compareTo < 0 : compareTo != 0 : compareTo == 0;
                    }
                }
                throw new UnsupportedOperationException();
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class x extends t {

        /* renamed from: e */
        public final Pattern f13420e;

        public x(String str, boolean z10, Pattern pattern) {
            super(str, z10);
            this.f13420e = pattern;
        }

        @Override // e4.g.c
        public final boolean a(g gVar, Object obj, Object obj2, Object obj3) {
            Object b10 = b(gVar, obj, obj3);
            if (b10 == null) {
                return false;
            }
            return this.f13420e.matcher(b10.toString()).matches();
        }
    }

    /* loaded from: classes.dex */
    public static class y extends t {

        /* renamed from: e */
        public final Pattern f13421e;

        /* renamed from: f */
        public final boolean f13422f;

        public y(String str, String str2, boolean z10, boolean z11) {
            super(str, z10);
            this.f13421e = Pattern.compile(str2);
            this.f13422f = z11;
        }

        @Override // e4.g.c
        public final boolean a(g gVar, Object obj, Object obj2, Object obj3) {
            Object b10 = b(gVar, obj, obj3);
            if (b10 == null) {
                return false;
            }
            boolean matches = this.f13421e.matcher(b10.toString()).matches();
            return this.f13422f ? !matches : matches;
        }
    }

    /* loaded from: classes.dex */
    public interface z {
        Object a(g gVar, Object obj, Object obj2);
    }

    public g(String str) {
        this(str, a1.f17315i, h4.k.f15845u);
    }

    public g(String str, a1 a1Var, h4.k kVar) {
        if (str == null || str.length() == 0) {
            throw new e4.h("json-path can not be null or empty");
        }
        this.f13356a = str;
        this.f13358c = a1Var;
        this.f13359d = kVar;
        this.f13360e = true;
    }

    public static int a(Object obj, Object obj2) {
        Object d10;
        Object f10;
        if (obj.getClass() != obj2.getClass()) {
            Class<?> cls = obj.getClass();
            Class<?> cls2 = obj2.getClass();
            if (cls == BigDecimal.class) {
                if (cls2 == Integer.class) {
                    f10 = new BigDecimal(((Integer) obj2).intValue());
                } else if (cls2 == Long.class) {
                    f10 = new BigDecimal(((Long) obj2).longValue());
                } else if (cls2 == Float.class) {
                    f10 = new BigDecimal(((Float) obj2).floatValue());
                } else if (cls2 == Double.class) {
                    f10 = new BigDecimal(((Double) obj2).doubleValue());
                }
                obj2 = f10;
            } else if (cls == Long.class) {
                if (cls2 == Integer.class) {
                    f10 = new Long(((Integer) obj2).intValue());
                    obj2 = f10;
                } else {
                    if (cls2 == BigDecimal.class) {
                        d10 = new BigDecimal(((Long) obj).longValue());
                    } else if (cls2 == Float.class) {
                        d10 = new Float((float) ((Long) obj).longValue());
                    } else if (cls2 == Double.class) {
                        d10 = new Double(((Long) obj).longValue());
                    }
                    obj = d10;
                }
            } else if (cls == Integer.class) {
                if (cls2 == Long.class) {
                    d10 = new Long(((Integer) obj).intValue());
                } else if (cls2 == BigDecimal.class) {
                    d10 = new BigDecimal(((Integer) obj).intValue());
                } else if (cls2 == Float.class) {
                    d10 = new Float(((Integer) obj).intValue());
                } else if (cls2 == Double.class) {
                    d10 = new Double(((Integer) obj).intValue());
                }
                obj = d10;
            } else if (cls == Double.class) {
                if (cls2 == Integer.class) {
                    f10 = new Double(((Integer) obj2).intValue());
                } else if (cls2 == Long.class) {
                    f10 = new Double(((Long) obj2).longValue());
                } else if (cls2 == Float.class) {
                    f10 = new Double(((Float) obj2).floatValue());
                }
                obj2 = f10;
            } else if (cls == Float.class) {
                if (cls2 == Integer.class) {
                    f10 = new Float(((Integer) obj2).intValue());
                } else if (cls2 == Long.class) {
                    f10 = new Float((float) ((Long) obj2).longValue());
                } else if (cls2 == Double.class) {
                    d10 = new Double(((Float) obj).floatValue());
                    obj = d10;
                }
                obj2 = f10;
            }
        }
        return ((Comparable) obj).compareTo(obj2);
    }

    public static g b(String str) {
        if (str != null) {
            g gVar = (g) f13355f.get(str);
            if (gVar == null) {
                g gVar2 = new g(str);
                if (f13355f.size() < 1024) {
                    f13355f.putIfAbsent(str, gVar2);
                    return (g) f13355f.get(str);
                }
                return gVar2;
            }
            return gVar;
        }
        throw new e4.h("jsonpath can not be null");
    }

    public static Object f(int i10, Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            if (i10 >= 0) {
                if (i10 < list.size()) {
                    return list.get(i10);
                }
                return null;
            } else if (Math.abs(i10) <= list.size()) {
                return list.get(list.size() + i10);
            } else {
                return null;
            }
        } else if (obj.getClass().isArray()) {
            int length = Array.getLength(obj);
            if (i10 >= 0) {
                if (i10 < length) {
                    return Array.get(obj, i10);
                }
                return null;
            } else if (Math.abs(i10) <= length) {
                return Array.get(obj, length + i10);
            } else {
                return null;
            }
        } else if (obj instanceof Map) {
            Map map = (Map) obj;
            Object obj2 = map.get(Integer.valueOf(i10));
            return obj2 == null ? map.get(Integer.toString(i10)) : obj2;
        } else if (!(obj instanceof Collection)) {
            if (i10 == 0) {
                return obj;
            }
            throw new UnsupportedOperationException();
        } else {
            int i11 = 0;
            for (Object obj3 : (Collection) obj) {
                if (i11 == i10) {
                    return obj3;
                }
                i11++;
            }
            return null;
        }
    }

    public final void c(ArrayList arrayList, Object obj) {
        Collection l10;
        Class<?> cls = obj.getClass();
        j0 g10 = g(cls);
        if (g10 != null) {
            try {
                l10 = g10.l(obj);
            } catch (Exception e10) {
                StringBuilder a10 = android.support.v4.media.d.a("jsonpath error, path ");
                a10.append(this.f13356a);
                throw new e4.h(a10.toString(), e10);
            }
        } else if (obj instanceof Map) {
            l10 = ((Map) obj).values();
        } else if (obj instanceof Collection) {
            l10 = (Collection) obj;
        } else {
            l10 = null;
        }
        if (l10 != null) {
            for (Object obj2 : l10) {
                if (obj2 != null && !h4.k.g(obj2.getClass())) {
                    c(arrayList, obj2);
                } else {
                    arrayList.add(obj2);
                }
            }
            return;
        }
        throw new UnsupportedOperationException(cls.getName());
    }

    public final void d(Object obj, String str, ArrayList arrayList) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object value = entry.getValue();
                if (str.equals(entry.getKey())) {
                    if (value instanceof Collection) {
                        arrayList.addAll((Collection) value);
                    } else {
                        arrayList.add(value);
                    }
                } else if (value != null && !h4.k.g(value.getClass())) {
                    d(value, str, arrayList);
                }
            }
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                if (!h4.k.g(obj2.getClass())) {
                    d(obj2, str, arrayList);
                }
            }
        } else {
            j0 g10 = g(obj.getClass());
            if (g10 != null) {
                try {
                    j4.a0 j10 = g10.j(str);
                    if (j10 != null) {
                        try {
                            arrayList.add(j10.c(obj));
                            return;
                        } catch (IllegalAccessException e10) {
                            throw new e4.d("getFieldValue error." + str, e10);
                        } catch (InvocationTargetException e11) {
                            throw new e4.d("getFieldValue error." + str, e11);
                        }
                    }
                    Iterator it = g10.l(obj).iterator();
                    while (it.hasNext()) {
                        d(it.next(), str, arrayList);
                    }
                } catch (Exception e12) {
                    StringBuilder a10 = android.support.v4.media.d.a("jsonpath error, path ");
                    a10.append(this.f13356a);
                    a10.append(", segement ");
                    a10.append(str);
                    throw new e4.h(a10.toString(), e12);
                }
            } else if (obj instanceof List) {
                List list = (List) obj;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    d(list.get(i10), str, arrayList);
                }
            }
        }
    }

    @Override // e4.c
    public final String e() {
        return e4.a.t(this.f13356a);
    }

    public final j0 g(Class<?> cls) {
        t0 e10 = this.f13358c.e(cls);
        if (e10 instanceof j0) {
            return (j0) e10;
        }
        return null;
    }

    public final Object h(Object obj, String str, long j10) {
        int i10;
        int i11;
        e4.b bVar = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            try {
                obj = (e4.e) e4.a.n((String) obj, this.f13359d, e4.a.f13344f);
            } catch (Exception unused) {
            }
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            Object obj2 = map.get(str);
            if (obj2 == null) {
                if (5614464919154503228L == j10 || -1580386065683472715L == j10) {
                    return Integer.valueOf(map.size());
                }
                return obj2;
            }
            return obj2;
        }
        j0 g10 = g(obj.getClass());
        if (g10 != null) {
            try {
                return g10.k(obj, str, j10);
            } catch (Exception e10) {
                StringBuilder a10 = android.support.v4.media.d.a("jsonpath error, path ");
                a10.append(this.f13356a);
                a10.append(", segement ");
                a10.append(str);
                throw new e4.h(a10.toString(), e10);
            }
        }
        int i12 = 0;
        if (obj instanceof List) {
            List list = (List) obj;
            if (5614464919154503228L != j10 && -1580386065683472715L != j10) {
                while (i12 < list.size()) {
                    Object obj3 = list.get(i12);
                    if (obj3 == list) {
                        if (bVar == null) {
                            bVar = new e4.b(list.size());
                        }
                    } else {
                        obj3 = h(obj3, str, j10);
                        if (obj3 instanceof Collection) {
                            Collection<?> collection = (Collection) obj3;
                            if (bVar == null) {
                                bVar = new e4.b(list.size());
                            }
                            bVar.addAll(collection);
                        } else if (obj3 != null || !this.f13360e) {
                            if (bVar == null) {
                                bVar = new e4.b(list.size());
                            }
                        }
                        i12++;
                    }
                    bVar.add(obj3);
                    i12++;
                }
                if (bVar == null) {
                    return Collections.emptyList();
                }
                return bVar;
            }
            i11 = list.size();
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (5614464919154503228L != j10 && -1580386065683472715L != j10) {
                e4.b bVar2 = new e4.b(objArr.length);
                while (i12 < objArr.length) {
                    Object obj4 = objArr[i12];
                    if (obj4 != objArr) {
                        obj4 = h(obj4, str, j10);
                        if (obj4 instanceof Collection) {
                            bVar2.addAll((Collection) obj4);
                        } else if (obj4 == null && this.f13360e) {
                        }
                        i12++;
                    }
                    bVar2.add(obj4);
                    i12++;
                }
                return bVar2;
            }
            i11 = objArr.length;
        } else {
            if (obj instanceof Enum) {
                Enum r92 = (Enum) obj;
                if (-4270347329889690746L == j10) {
                    return r92.name();
                }
                if (-1014497654951707614L == j10) {
                    i11 = r92.ordinal();
                }
            }
            if (obj instanceof Calendar) {
                Calendar calendar = (Calendar) obj;
                if (8963398325558730460L == j10) {
                    i10 = 1;
                } else if (-811277319855450459L == j10) {
                    i10 = 2;
                } else if (-3851359326990528739L == j10) {
                    i10 = 5;
                } else if (4647432019745535567L == j10) {
                    i10 = 11;
                } else if (6607618197526598121L == j10) {
                    i10 = 12;
                } else if (-6586085717218287427L == j10) {
                    i10 = 13;
                }
                i11 = calendar.get(i10);
            }
            return null;
        }
        return Integer.valueOf(i11);
    }

    public final void i() {
        if (this.f13357b != null) {
            return;
        }
        if ("*".equals(this.f13356a)) {
            this.f13357b = new z[]{f0.f13376b};
            return;
        }
        String str = this.f13356a;
        k kVar = new k(str);
        if (str != null && str.length() != 0) {
            z[] zVarArr = new z[8];
            while (true) {
                z i10 = kVar.i();
                if (i10 == null) {
                    break;
                }
                if (i10 instanceof u) {
                    u uVar = (u) i10;
                    if (!uVar.f13414c && uVar.f13412a.equals("*")) {
                    }
                }
                int i11 = kVar.f13396d;
                if (i11 == zVarArr.length) {
                    z[] zVarArr2 = new z[(i11 * 3) / 2];
                    System.arraycopy(zVarArr, 0, zVarArr2, 0, i11);
                    zVarArr = zVarArr2;
                }
                int i12 = kVar.f13396d;
                kVar.f13396d = i12 + 1;
                zVarArr[i12] = i10;
            }
            int i13 = kVar.f13396d;
            if (i13 != zVarArr.length) {
                z[] zVarArr3 = new z[i13];
                System.arraycopy(zVarArr, 0, zVarArr3, 0, i13);
                zVarArr = zVarArr3;
            }
            this.f13357b = zVarArr;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final boolean j() {
        try {
            i();
            int i10 = 0;
            while (true) {
                z[] zVarArr = this.f13357b;
                if (i10 >= zVarArr.length) {
                    return true;
                }
                Class<?> cls = zVarArr[i10].getClass();
                if (cls != a.class && cls != u.class) {
                    return false;
                }
                i10++;
            }
        } catch (e4.h unused) {
            return false;
        }
    }
}
