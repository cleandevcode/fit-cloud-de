package h4;

import e4.g;
import i4.o;
import i4.t;
import i4.x;
import j4.a1;
import j4.d0;
import j4.f1;
import j4.o0;
import java.io.Closeable;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import n4.n;

/* loaded from: classes.dex */
public final class a implements Closeable {

    /* renamed from: a */
    public final Object f15769a;

    /* renamed from: b */
    public final l f15770b;

    /* renamed from: c */
    public k f15771c;

    /* renamed from: d */
    public String f15772d;

    /* renamed from: e */
    public SimpleDateFormat f15773e;

    /* renamed from: f */
    public final c f15774f;

    /* renamed from: g */
    public j f15775g;

    /* renamed from: h */
    public j[] f15776h;

    /* renamed from: i */
    public int f15777i;

    /* renamed from: j */
    public ArrayList f15778j;

    /* renamed from: k */
    public int f15779k;

    /* renamed from: l */
    public ArrayList f15780l;

    /* renamed from: m */
    public ArrayList f15781m;

    /* renamed from: n */
    public int f15782n;

    /* renamed from: h4.a$a */
    /* loaded from: classes.dex */
    public static class C0282a {

        /* renamed from: a */
        public final j f15783a;

        /* renamed from: b */
        public final String f15784b;

        /* renamed from: c */
        public i4.l f15785c;

        /* renamed from: d */
        public j f15786d;

        public C0282a(j jVar, String str) {
            this.f15783a = jVar;
            this.f15784b = str;
        }
    }

    static {
        new HashSet().addAll(Arrays.asList(Boolean.TYPE, Byte.TYPE, Short.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE, Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class, BigInteger.class, BigDecimal.class, String.class));
    }

    public a(Object obj, h hVar, k kVar) {
        int i10;
        this.f15772d = e4.a.f13343e;
        this.f15777i = 0;
        this.f15779k = 0;
        this.f15780l = null;
        this.f15781m = null;
        this.f15782n = 0;
        this.f15774f = hVar;
        this.f15769a = obj;
        this.f15771c = kVar;
        this.f15770b = kVar.f15855e;
        char c10 = hVar.f15818d;
        if (c10 == '{') {
            hVar.next();
            i10 = 12;
        } else if (c10 != '[') {
            hVar.nextToken();
            return;
        } else {
            hVar.next();
            i10 = 14;
        }
        hVar.f15815a = i10;
    }

    public a(String str, k kVar, int i10) {
        this(str, new h(str, i10), kVar);
    }

    public final void C(Object obj) {
        Object obj2;
        Object obj3;
        j jVar;
        n4.c cVar;
        ArrayList arrayList = this.f15778j;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0282a c0282a = (C0282a) this.f15778j.get(i10);
            String str = c0282a.f15784b;
            j jVar2 = c0282a.f15786d;
            Object obj4 = null;
            if (jVar2 != null) {
                obj2 = jVar2.f15833a;
            } else {
                obj2 = null;
            }
            if (str.startsWith("$")) {
                int i11 = 0;
                while (true) {
                    if (i11 < this.f15777i) {
                        if (str.equals(this.f15776h[i11].toString())) {
                            obj3 = this.f15776h[i11].f15833a;
                            break;
                        }
                        i11++;
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                if (obj3 == null) {
                    try {
                        e4.g gVar = new e4.g(str, a1.f17315i, this.f15771c);
                        if (gVar.j()) {
                            if (obj == null) {
                                obj3 = null;
                            } else {
                                gVar.i();
                                Object obj5 = obj;
                                int i12 = 0;
                                while (true) {
                                    g.z[] zVarArr = gVar.f13357b;
                                    if (i12 >= zVarArr.length) {
                                        break;
                                    }
                                    obj5 = zVarArr[i12].a(gVar, obj, obj5);
                                    i12++;
                                }
                                obj3 = obj5;
                            }
                        }
                    } catch (e4.h unused) {
                    }
                }
            } else {
                obj3 = c0282a.f15783a.f15833a;
            }
            i4.l lVar = c0282a.f15785c;
            if (lVar != null) {
                if (obj3 != null && obj3.getClass() == e4.e.class && (cVar = lVar.f16452a) != null && !Map.class.isAssignableFrom(cVar.f21951e)) {
                    Object obj6 = this.f15776h[0].f15833a;
                    e4.g b10 = e4.g.b(str);
                    if (b10.j()) {
                        if (obj6 != null) {
                            b10.i();
                            obj4 = obj6;
                            int i13 = 0;
                            while (true) {
                                g.z[] zVarArr2 = b10.f13357b;
                                if (i13 >= zVarArr2.length) {
                                    break;
                                }
                                obj4 = zVarArr2[i13].a(b10, obj6, obj4);
                                i13++;
                            }
                        }
                        obj3 = obj4;
                    }
                }
                Class<?> cls = lVar.f16453b;
                if (cls != null && !cls.isInstance(obj2) && (jVar = c0282a.f15786d.f15834b) != null) {
                    while (true) {
                        if (jVar == null) {
                            break;
                        } else if (lVar.f16453b.isInstance(jVar.f15833a)) {
                            obj2 = jVar.f15833a;
                            break;
                        } else {
                            jVar = jVar.f15834b;
                        }
                    }
                }
                lVar.d(obj2, obj3);
            }
        }
    }

    public final Object D() {
        return E(null);
    }

    public final Object E(Object obj) {
        Map eVar;
        Collection bVar;
        Collection hashSet;
        c cVar = this.f15774f;
        int h02 = cVar.h0();
        if (h02 != 2) {
            if (h02 != 3) {
                if (h02 != 4) {
                    if (h02 != 12) {
                        if (h02 != 14) {
                            if (h02 != 18) {
                                if (h02 != 26) {
                                    switch (h02) {
                                        case 6:
                                            cVar.nextToken();
                                            return Boolean.TRUE;
                                        case 7:
                                            cVar.nextToken();
                                            return Boolean.FALSE;
                                        case 8:
                                            cVar.nextToken();
                                            return null;
                                        case 9:
                                            cVar.J(18);
                                            if (cVar.h0() == 18) {
                                                cVar.J(10);
                                                a(10);
                                                long longValue = cVar.b0().longValue();
                                                a(2);
                                                a(11);
                                                return new Date(longValue);
                                            }
                                            throw new e4.d("syntax error");
                                        default:
                                            switch (h02) {
                                                case 20:
                                                    if (cVar.k()) {
                                                        return null;
                                                    }
                                                    StringBuilder a10 = android.support.v4.media.d.a("unterminated json string, ");
                                                    a10.append(cVar.h());
                                                    throw new e4.d(a10.toString());
                                                case 21:
                                                    cVar.nextToken();
                                                    hashSet = new HashSet();
                                                    break;
                                                case 22:
                                                    cVar.nextToken();
                                                    hashSet = new TreeSet();
                                                    break;
                                                case 23:
                                                    cVar.nextToken();
                                                    return null;
                                                default:
                                                    StringBuilder a11 = android.support.v4.media.d.a("syntax error, ");
                                                    a11.append(cVar.h());
                                                    throw new e4.d(a11.toString());
                                            }
                                            I(hashSet, obj);
                                            return hashSet;
                                    }
                                }
                                byte[] R = cVar.R();
                                cVar.nextToken();
                                return R;
                            } else if ("NaN".equals(cVar.W())) {
                                cVar.nextToken();
                                return null;
                            } else {
                                StringBuilder a12 = android.support.v4.media.d.a("syntax error, ");
                                a12.append(cVar.h());
                                throw new e4.d(a12.toString());
                            }
                        }
                        if (this.f15774f.I(b.UseNativeJavaObject)) {
                            bVar = new ArrayList();
                        } else {
                            bVar = new e4.b();
                        }
                        I(bVar, obj);
                        if (cVar.I(b.UseObjectArray)) {
                            return bVar.toArray();
                        }
                        return bVar;
                    }
                    if (this.f15774f.I(b.UseNativeJavaObject)) {
                        if (cVar.I(b.OrderedField)) {
                            eVar = new HashMap();
                        } else {
                            eVar = new LinkedHashMap();
                        }
                    } else {
                        eVar = new e4.e(cVar.I(b.OrderedField));
                    }
                    return R(eVar, obj);
                }
                String W = cVar.W();
                cVar.J(16);
                if (cVar.I(b.AllowISO8601DateFormat)) {
                    h hVar = new h(W);
                    try {
                        if (hVar.t1(true)) {
                            return hVar.f15824j.getTime();
                        }
                    } finally {
                        hVar.close();
                    }
                }
                return W;
            }
            Number A0 = cVar.A0(cVar.I(b.UseBigDecimal));
            cVar.nextToken();
            return A0;
        }
        Number b02 = cVar.b0();
        cVar.nextToken();
        return b02;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0055 A[Catch: all -> 0x00dd, LOOP:1: B:78:0x0055->B:80:0x005d, LOOP_START, TryCatch #0 {all -> 0x00dd, blocks: (B:76:0x0049, B:78:0x0055, B:80:0x005d, B:81:0x0063, B:86:0x0076, B:88:0x007b, B:103:0x00c8, B:105:0x00d0, B:90:0x0087, B:92:0x008f, B:97:0x00a6, B:93:0x009b, B:96:0x00a2, B:98:0x00aa, B:100:0x00b4, B:102:0x00c2, B:101:0x00ba), top: B:112:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0076 A[Catch: all -> 0x00dd, TRY_ENTER, TryCatch #0 {all -> 0x00dd, blocks: (B:76:0x0049, B:78:0x0055, B:80:0x005d, B:81:0x0063, B:86:0x0076, B:88:0x007b, B:103:0x00c8, B:105:0x00d0, B:90:0x0087, B:92:0x008f, B:97:0x00a6, B:93:0x009b, B:96:0x00a2, B:98:0x00aa, B:100:0x00b4, B:102:0x00c2, B:101:0x00ba), top: B:112:0x0049 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F(java.lang.reflect.Type r9, java.util.Collection r10, java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.a.F(java.lang.reflect.Type, java.util.Collection, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x010e A[Catch: all -> 0x0115, ClassCastException -> 0x0117, TRY_LEAVE, TryCatch #0 {ClassCastException -> 0x0117, blocks: (B:103:0x0039, B:105:0x0043, B:107:0x0049, B:108:0x004d, B:128:0x0077, B:153:0x0102, B:155:0x010e, B:129:0x007d, B:132:0x0084, B:134:0x0098, B:135:0x009d, B:136:0x00a4, B:137:0x00a5, B:138:0x00b9, B:139:0x00bd, B:152:0x00fe, B:140:0x00c0, B:141:0x00c3, B:143:0x00d2, B:145:0x00dd, B:146:0x00e4, B:147:0x00e8, B:149:0x00f0, B:150:0x00f5, B:151:0x00fa), top: B:166:0x0039, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0111 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I(java.util.Collection r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.a.I(java.util.Collection, java.lang.Object):void");
    }

    public final void J(Object obj, String str) {
        Type type;
        this.f15774f.y0();
        ArrayList arrayList = this.f15780l;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            type = null;
            while (it.hasNext()) {
                type = ((i4.k) it.next()).a();
            }
        } else {
            type = null;
        }
        if (type == null) {
            D();
        } else {
            P(null, type);
        }
        if (obj instanceof i4.i) {
            ((i4.i) obj).a();
            return;
        }
        ArrayList arrayList2 = this.f15781m;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((i4.j) it2.next()).a();
            }
        }
        if (this.f15779k == 1) {
            this.f15779k = 0;
        }
    }

    public final e4.e L() {
        Object R = R(new e4.e(this.f15774f.I(b.OrderedField)), null);
        if (R instanceof e4.e) {
            return (e4.e) R;
        }
        if (R == null) {
            return null;
        }
        return new e4.e((Map) R);
    }

    public final Object P(String str, Type type) {
        Class<?> A;
        int h02 = this.f15774f.h0();
        if (h02 == 8) {
            this.f15774f.nextToken();
            if (n.U || (A = n.A(type)) == null) {
                return null;
            }
            String name = A.getName();
            if (!"java.util.Optional".equals(name)) {
                return null;
            }
            if (n.T == null) {
                try {
                    n.T = Class.forName(name).getMethod("empty", new Class[0]).invoke(null, new Object[0]);
                } catch (Throwable unused) {
                    n.U = true;
                }
            }
            return n.T;
        }
        if (h02 == 4) {
            if (type == byte[].class) {
                byte[] R = this.f15774f.R();
                this.f15774f.nextToken();
                return R;
            } else if (type == char[].class) {
                String W = this.f15774f.W();
                this.f15774f.nextToken();
                return W.toCharArray();
            }
        }
        t d10 = this.f15771c.d(type);
        try {
            if (d10.getClass() == o.class) {
                if (this.f15774f.h0() != 12 && this.f15774f.h0() != 14) {
                    throw new e4.d("syntax error,expect start with { or [,but actually start with " + this.f15774f.z0());
                }
                return ((o) d10).f(this, type, str, 0);
            }
            return d10.d(this, type, str);
        } catch (e4.d e10) {
            throw e10;
        } catch (Throwable th2) {
            throw new e4.d(th2.getMessage(), th2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:564:0x029c, code lost:
        r5.J(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x02a7, code lost:
        if (r5.h0() != 13) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x02a9, code lost:
        r5.J(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x02b4, code lost:
        if ((r17.f15771c.d(r11) instanceof i4.o) == false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x02b6, code lost:
        r12 = n4.n.b(r18, r11, r17.f15771c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x02bc, code lost:
        if (r12 != null) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x02c0, code lost:
        if (r11 != java.lang.Cloneable.class) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x02c2, code lost:
        r12 = new java.util.HashMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:575:0x02ce, code lost:
        if ("java.util.Collections$EmptyMap".equals(r10) == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x02d0, code lost:
        r12 = java.util.Collections.emptyMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x02db, code lost:
        if ("java.util.Collections$UnmodifiableMap".equals(r10) == false) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x02dd, code lost:
        r12 = java.util.Collections.unmodifiableMap(new java.util.HashMap());
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x02e7, code lost:
        r12 = r11.newInstance();
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x02ee, code lost:
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x02ef, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x02f7, code lost:
        throw new e4.d("create instance error", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x02f8, code lost:
        i0(2);
        r4 = r17.f15775g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:587:0x02fe, code lost:
        if (r4 == null) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:588:0x0300, code lost:
        if (r19 == null) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x0304, code lost:
        if ((r19 instanceof java.lang.Integer) != false) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:592:0x030a, code lost:
        if ((r4.f15835c instanceof java.lang.Integer) != false) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:593:0x030c, code lost:
        X();
     */
    /* JADX WARN: Code restructure failed: missing block: B:595:0x0313, code lost:
        if (r18.size() <= 0) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:596:0x0315, code lost:
        r0 = n4.n.b(r18, r11, r17.f15771c);
        i0(0);
        W(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:598:0x0325, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x0326, code lost:
        r0 = r17.f15771c.d(r11);
        r4 = r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:600:0x0334, code lost:
        if (r3.isAssignableFrom(r4) == false) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:601:0x0336, code lost:
        if (r4 == r3) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x033a, code lost:
        if (r4 == i4.a0.class) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:606:0x033f, code lost:
        if ((r0 instanceof i4.r) == false) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:607:0x0341, code lost:
        i0(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x034c, code lost:
        return r0.d(r17, r11, r19);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0211 A[Catch: all -> 0x0652, TryCatch #1 {all -> 0x0652, blocks: (B:441:0x0070, B:443:0x0074, B:446:0x007e, B:449:0x0091, B:453:0x00a6, B:529:0x0211, B:530:0x0217, B:532:0x0222, B:534:0x022a, B:538:0x023e, B:540:0x024c, B:563:0x0295, B:564:0x029c, B:566:0x02a9, B:567:0x02ac, B:569:0x02b6, B:573:0x02c2, B:574:0x02c8, B:576:0x02d0, B:577:0x02d5, B:579:0x02dd, B:580:0x02e7, B:584:0x02f0, B:585:0x02f7, B:586:0x02f8, B:589:0x0302, B:591:0x0306, B:593:0x030c, B:594:0x030f, B:596:0x0315, B:599:0x0326, B:607:0x0341, B:608:0x0345, B:605:0x033d, B:541:0x0251, B:544:0x025c, B:549:0x0269, B:551:0x026f, B:556:0x027c, B:560:0x0284, B:615:0x0357, B:617:0x035d, B:619:0x0365, B:621:0x036f, B:623:0x0380, B:624:0x0385, B:626:0x038d, B:628:0x0391, B:630:0x0397, B:633:0x039c, B:635:0x03a0, B:659:0x03f4, B:661:0x03fc, B:664:0x0405, B:665:0x041d, B:636:0x03a3, B:638:0x03ab, B:641:0x03b0, B:655:0x03e3, B:656:0x03e6, B:642:0x03b6, B:645:0x03bf, B:648:0x03c5, B:651:0x03cb, B:652:0x03d4, B:654:0x03de, B:658:0x03ec, B:666:0x041e, B:667:0x043c, B:669:0x043f, B:671:0x0443, B:673:0x0449, B:682:0x045d, B:688:0x046f, B:690:0x047e, B:692:0x0489, B:693:0x0491, B:704:0x04ba, B:706:0x04c8, B:709:0x04d1, B:712:0x04e1, B:713:0x04ff, B:700:0x04a1, B:702:0x04ab, B:703:0x04b0, B:716:0x0504, B:718:0x050e, B:719:0x0511, B:721:0x051c, B:722:0x0520, B:724:0x052b, B:727:0x0532, B:730:0x053c, B:731:0x0541, B:734:0x0546, B:736:0x054b, B:740:0x0556, B:742:0x055e, B:744:0x0573, B:748:0x059a, B:750:0x05a2, B:753:0x05aa, B:755:0x05ae, B:756:0x05b5, B:758:0x05ba, B:759:0x05bd, B:761:0x05c5, B:764:0x05cf, B:767:0x05d9, B:768:0x05dd, B:769:0x05e1, B:770:0x05f9, B:745:0x0581, B:746:0x058d, B:771:0x05fa, B:773:0x060c, B:776:0x0613, B:779:0x061f, B:780:0x063d, B:677:0x0451, B:456:0x00b9, B:457:0x00d7, B:460:0x00dc, B:462:0x00e7, B:464:0x00eb, B:466:0x00ef, B:469:0x00f5, B:476:0x0104, B:478:0x010c, B:481:0x011f, B:482:0x0137, B:483:0x0138, B:484:0x013d, B:495:0x0152, B:496:0x0158, B:498:0x015f, B:500:0x0169, B:504:0x0177, B:507:0x0180, B:508:0x0198, B:503:0x0173, B:499:0x0164, B:509:0x0199, B:510:0x01b1, B:516:0x01bb, B:518:0x01c3, B:521:0x01d6, B:522:0x01f6, B:523:0x01f7, B:524:0x01fc, B:525:0x01fd, B:527:0x0207, B:781:0x063e, B:782:0x0645, B:783:0x0646, B:784:0x064b, B:785:0x064c, B:786:0x0651), top: B:791:0x0070, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0295 A[Catch: all -> 0x0652, TryCatch #1 {all -> 0x0652, blocks: (B:441:0x0070, B:443:0x0074, B:446:0x007e, B:449:0x0091, B:453:0x00a6, B:529:0x0211, B:530:0x0217, B:532:0x0222, B:534:0x022a, B:538:0x023e, B:540:0x024c, B:563:0x0295, B:564:0x029c, B:566:0x02a9, B:567:0x02ac, B:569:0x02b6, B:573:0x02c2, B:574:0x02c8, B:576:0x02d0, B:577:0x02d5, B:579:0x02dd, B:580:0x02e7, B:584:0x02f0, B:585:0x02f7, B:586:0x02f8, B:589:0x0302, B:591:0x0306, B:593:0x030c, B:594:0x030f, B:596:0x0315, B:599:0x0326, B:607:0x0341, B:608:0x0345, B:605:0x033d, B:541:0x0251, B:544:0x025c, B:549:0x0269, B:551:0x026f, B:556:0x027c, B:560:0x0284, B:615:0x0357, B:617:0x035d, B:619:0x0365, B:621:0x036f, B:623:0x0380, B:624:0x0385, B:626:0x038d, B:628:0x0391, B:630:0x0397, B:633:0x039c, B:635:0x03a0, B:659:0x03f4, B:661:0x03fc, B:664:0x0405, B:665:0x041d, B:636:0x03a3, B:638:0x03ab, B:641:0x03b0, B:655:0x03e3, B:656:0x03e6, B:642:0x03b6, B:645:0x03bf, B:648:0x03c5, B:651:0x03cb, B:652:0x03d4, B:654:0x03de, B:658:0x03ec, B:666:0x041e, B:667:0x043c, B:669:0x043f, B:671:0x0443, B:673:0x0449, B:682:0x045d, B:688:0x046f, B:690:0x047e, B:692:0x0489, B:693:0x0491, B:704:0x04ba, B:706:0x04c8, B:709:0x04d1, B:712:0x04e1, B:713:0x04ff, B:700:0x04a1, B:702:0x04ab, B:703:0x04b0, B:716:0x0504, B:718:0x050e, B:719:0x0511, B:721:0x051c, B:722:0x0520, B:724:0x052b, B:727:0x0532, B:730:0x053c, B:731:0x0541, B:734:0x0546, B:736:0x054b, B:740:0x0556, B:742:0x055e, B:744:0x0573, B:748:0x059a, B:750:0x05a2, B:753:0x05aa, B:755:0x05ae, B:756:0x05b5, B:758:0x05ba, B:759:0x05bd, B:761:0x05c5, B:764:0x05cf, B:767:0x05d9, B:768:0x05dd, B:769:0x05e1, B:770:0x05f9, B:745:0x0581, B:746:0x058d, B:771:0x05fa, B:773:0x060c, B:776:0x0613, B:779:0x061f, B:780:0x063d, B:677:0x0451, B:456:0x00b9, B:457:0x00d7, B:460:0x00dc, B:462:0x00e7, B:464:0x00eb, B:466:0x00ef, B:469:0x00f5, B:476:0x0104, B:478:0x010c, B:481:0x011f, B:482:0x0137, B:483:0x0138, B:484:0x013d, B:495:0x0152, B:496:0x0158, B:498:0x015f, B:500:0x0169, B:504:0x0177, B:507:0x0180, B:508:0x0198, B:503:0x0173, B:499:0x0164, B:509:0x0199, B:510:0x01b1, B:516:0x01bb, B:518:0x01c3, B:521:0x01d6, B:522:0x01f6, B:523:0x01f7, B:524:0x01fc, B:525:0x01fd, B:527:0x0207, B:781:0x063e, B:782:0x0645, B:783:0x0646, B:784:0x064b, B:785:0x064c, B:786:0x0651), top: B:791:0x0070, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:669:0x043f A[Catch: all -> 0x0652, TryCatch #1 {all -> 0x0652, blocks: (B:441:0x0070, B:443:0x0074, B:446:0x007e, B:449:0x0091, B:453:0x00a6, B:529:0x0211, B:530:0x0217, B:532:0x0222, B:534:0x022a, B:538:0x023e, B:540:0x024c, B:563:0x0295, B:564:0x029c, B:566:0x02a9, B:567:0x02ac, B:569:0x02b6, B:573:0x02c2, B:574:0x02c8, B:576:0x02d0, B:577:0x02d5, B:579:0x02dd, B:580:0x02e7, B:584:0x02f0, B:585:0x02f7, B:586:0x02f8, B:589:0x0302, B:591:0x0306, B:593:0x030c, B:594:0x030f, B:596:0x0315, B:599:0x0326, B:607:0x0341, B:608:0x0345, B:605:0x033d, B:541:0x0251, B:544:0x025c, B:549:0x0269, B:551:0x026f, B:556:0x027c, B:560:0x0284, B:615:0x0357, B:617:0x035d, B:619:0x0365, B:621:0x036f, B:623:0x0380, B:624:0x0385, B:626:0x038d, B:628:0x0391, B:630:0x0397, B:633:0x039c, B:635:0x03a0, B:659:0x03f4, B:661:0x03fc, B:664:0x0405, B:665:0x041d, B:636:0x03a3, B:638:0x03ab, B:641:0x03b0, B:655:0x03e3, B:656:0x03e6, B:642:0x03b6, B:645:0x03bf, B:648:0x03c5, B:651:0x03cb, B:652:0x03d4, B:654:0x03de, B:658:0x03ec, B:666:0x041e, B:667:0x043c, B:669:0x043f, B:671:0x0443, B:673:0x0449, B:682:0x045d, B:688:0x046f, B:690:0x047e, B:692:0x0489, B:693:0x0491, B:704:0x04ba, B:706:0x04c8, B:709:0x04d1, B:712:0x04e1, B:713:0x04ff, B:700:0x04a1, B:702:0x04ab, B:703:0x04b0, B:716:0x0504, B:718:0x050e, B:719:0x0511, B:721:0x051c, B:722:0x0520, B:724:0x052b, B:727:0x0532, B:730:0x053c, B:731:0x0541, B:734:0x0546, B:736:0x054b, B:740:0x0556, B:742:0x055e, B:744:0x0573, B:748:0x059a, B:750:0x05a2, B:753:0x05aa, B:755:0x05ae, B:756:0x05b5, B:758:0x05ba, B:759:0x05bd, B:761:0x05c5, B:764:0x05cf, B:767:0x05d9, B:768:0x05dd, B:769:0x05e1, B:770:0x05f9, B:745:0x0581, B:746:0x058d, B:771:0x05fa, B:773:0x060c, B:776:0x0613, B:779:0x061f, B:780:0x063d, B:677:0x0451, B:456:0x00b9, B:457:0x00d7, B:460:0x00dc, B:462:0x00e7, B:464:0x00eb, B:466:0x00ef, B:469:0x00f5, B:476:0x0104, B:478:0x010c, B:481:0x011f, B:482:0x0137, B:483:0x0138, B:484:0x013d, B:495:0x0152, B:496:0x0158, B:498:0x015f, B:500:0x0169, B:504:0x0177, B:507:0x0180, B:508:0x0198, B:503:0x0173, B:499:0x0164, B:509:0x0199, B:510:0x01b1, B:516:0x01bb, B:518:0x01c3, B:521:0x01d6, B:522:0x01f6, B:523:0x01f7, B:524:0x01fc, B:525:0x01fd, B:527:0x0207, B:781:0x063e, B:782:0x0645, B:783:0x0646, B:784:0x064b, B:785:0x064c, B:786:0x0651), top: B:791:0x0070, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:681:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:688:0x046f A[Catch: all -> 0x0652, TRY_ENTER, TryCatch #1 {all -> 0x0652, blocks: (B:441:0x0070, B:443:0x0074, B:446:0x007e, B:449:0x0091, B:453:0x00a6, B:529:0x0211, B:530:0x0217, B:532:0x0222, B:534:0x022a, B:538:0x023e, B:540:0x024c, B:563:0x0295, B:564:0x029c, B:566:0x02a9, B:567:0x02ac, B:569:0x02b6, B:573:0x02c2, B:574:0x02c8, B:576:0x02d0, B:577:0x02d5, B:579:0x02dd, B:580:0x02e7, B:584:0x02f0, B:585:0x02f7, B:586:0x02f8, B:589:0x0302, B:591:0x0306, B:593:0x030c, B:594:0x030f, B:596:0x0315, B:599:0x0326, B:607:0x0341, B:608:0x0345, B:605:0x033d, B:541:0x0251, B:544:0x025c, B:549:0x0269, B:551:0x026f, B:556:0x027c, B:560:0x0284, B:615:0x0357, B:617:0x035d, B:619:0x0365, B:621:0x036f, B:623:0x0380, B:624:0x0385, B:626:0x038d, B:628:0x0391, B:630:0x0397, B:633:0x039c, B:635:0x03a0, B:659:0x03f4, B:661:0x03fc, B:664:0x0405, B:665:0x041d, B:636:0x03a3, B:638:0x03ab, B:641:0x03b0, B:655:0x03e3, B:656:0x03e6, B:642:0x03b6, B:645:0x03bf, B:648:0x03c5, B:651:0x03cb, B:652:0x03d4, B:654:0x03de, B:658:0x03ec, B:666:0x041e, B:667:0x043c, B:669:0x043f, B:671:0x0443, B:673:0x0449, B:682:0x045d, B:688:0x046f, B:690:0x047e, B:692:0x0489, B:693:0x0491, B:704:0x04ba, B:706:0x04c8, B:709:0x04d1, B:712:0x04e1, B:713:0x04ff, B:700:0x04a1, B:702:0x04ab, B:703:0x04b0, B:716:0x0504, B:718:0x050e, B:719:0x0511, B:721:0x051c, B:722:0x0520, B:724:0x052b, B:727:0x0532, B:730:0x053c, B:731:0x0541, B:734:0x0546, B:736:0x054b, B:740:0x0556, B:742:0x055e, B:744:0x0573, B:748:0x059a, B:750:0x05a2, B:753:0x05aa, B:755:0x05ae, B:756:0x05b5, B:758:0x05ba, B:759:0x05bd, B:761:0x05c5, B:764:0x05cf, B:767:0x05d9, B:768:0x05dd, B:769:0x05e1, B:770:0x05f9, B:745:0x0581, B:746:0x058d, B:771:0x05fa, B:773:0x060c, B:776:0x0613, B:779:0x061f, B:780:0x063d, B:677:0x0451, B:456:0x00b9, B:457:0x00d7, B:460:0x00dc, B:462:0x00e7, B:464:0x00eb, B:466:0x00ef, B:469:0x00f5, B:476:0x0104, B:478:0x010c, B:481:0x011f, B:482:0x0137, B:483:0x0138, B:484:0x013d, B:495:0x0152, B:496:0x0158, B:498:0x015f, B:500:0x0169, B:504:0x0177, B:507:0x0180, B:508:0x0198, B:503:0x0173, B:499:0x0164, B:509:0x0199, B:510:0x01b1, B:516:0x01bb, B:518:0x01c3, B:521:0x01d6, B:522:0x01f6, B:523:0x01f7, B:524:0x01fc, B:525:0x01fd, B:527:0x0207, B:781:0x063e, B:782:0x0645, B:783:0x0646, B:784:0x064b, B:785:0x064c, B:786:0x0651), top: B:791:0x0070, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:694:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:706:0x04c8 A[Catch: all -> 0x0652, TryCatch #1 {all -> 0x0652, blocks: (B:441:0x0070, B:443:0x0074, B:446:0x007e, B:449:0x0091, B:453:0x00a6, B:529:0x0211, B:530:0x0217, B:532:0x0222, B:534:0x022a, B:538:0x023e, B:540:0x024c, B:563:0x0295, B:564:0x029c, B:566:0x02a9, B:567:0x02ac, B:569:0x02b6, B:573:0x02c2, B:574:0x02c8, B:576:0x02d0, B:577:0x02d5, B:579:0x02dd, B:580:0x02e7, B:584:0x02f0, B:585:0x02f7, B:586:0x02f8, B:589:0x0302, B:591:0x0306, B:593:0x030c, B:594:0x030f, B:596:0x0315, B:599:0x0326, B:607:0x0341, B:608:0x0345, B:605:0x033d, B:541:0x0251, B:544:0x025c, B:549:0x0269, B:551:0x026f, B:556:0x027c, B:560:0x0284, B:615:0x0357, B:617:0x035d, B:619:0x0365, B:621:0x036f, B:623:0x0380, B:624:0x0385, B:626:0x038d, B:628:0x0391, B:630:0x0397, B:633:0x039c, B:635:0x03a0, B:659:0x03f4, B:661:0x03fc, B:664:0x0405, B:665:0x041d, B:636:0x03a3, B:638:0x03ab, B:641:0x03b0, B:655:0x03e3, B:656:0x03e6, B:642:0x03b6, B:645:0x03bf, B:648:0x03c5, B:651:0x03cb, B:652:0x03d4, B:654:0x03de, B:658:0x03ec, B:666:0x041e, B:667:0x043c, B:669:0x043f, B:671:0x0443, B:673:0x0449, B:682:0x045d, B:688:0x046f, B:690:0x047e, B:692:0x0489, B:693:0x0491, B:704:0x04ba, B:706:0x04c8, B:709:0x04d1, B:712:0x04e1, B:713:0x04ff, B:700:0x04a1, B:702:0x04ab, B:703:0x04b0, B:716:0x0504, B:718:0x050e, B:719:0x0511, B:721:0x051c, B:722:0x0520, B:724:0x052b, B:727:0x0532, B:730:0x053c, B:731:0x0541, B:734:0x0546, B:736:0x054b, B:740:0x0556, B:742:0x055e, B:744:0x0573, B:748:0x059a, B:750:0x05a2, B:753:0x05aa, B:755:0x05ae, B:756:0x05b5, B:758:0x05ba, B:759:0x05bd, B:761:0x05c5, B:764:0x05cf, B:767:0x05d9, B:768:0x05dd, B:769:0x05e1, B:770:0x05f9, B:745:0x0581, B:746:0x058d, B:771:0x05fa, B:773:0x060c, B:776:0x0613, B:779:0x061f, B:780:0x063d, B:677:0x0451, B:456:0x00b9, B:457:0x00d7, B:460:0x00dc, B:462:0x00e7, B:464:0x00eb, B:466:0x00ef, B:469:0x00f5, B:476:0x0104, B:478:0x010c, B:481:0x011f, B:482:0x0137, B:483:0x0138, B:484:0x013d, B:495:0x0152, B:496:0x0158, B:498:0x015f, B:500:0x0169, B:504:0x0177, B:507:0x0180, B:508:0x0198, B:503:0x0173, B:499:0x0164, B:509:0x0199, B:510:0x01b1, B:516:0x01bb, B:518:0x01c3, B:521:0x01d6, B:522:0x01f6, B:523:0x01f7, B:524:0x01fc, B:525:0x01fd, B:527:0x0207, B:781:0x063e, B:782:0x0645, B:783:0x0646, B:784:0x064b, B:785:0x064c, B:786:0x0651), top: B:791:0x0070, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:807:0x029c A[EDGE_INSN: B:807:0x029c->B:564:0x029c ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:822:0x04cd A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v33, types: [h4.k] */
    /* JADX WARN: Type inference failed for: r17v0, types: [h4.a] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object R(java.util.Map r18, java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 1623
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.a.R(java.util.Map, java.lang.Object):java.lang.Object");
    }

    public final void W(Object obj) {
        o oVar;
        i4.l lVar;
        Object d10;
        Class<?> cls = obj.getClass();
        t d11 = this.f15771c.d(cls);
        if (d11 instanceof o) {
            oVar = (o) d11;
        } else {
            oVar = null;
        }
        if (this.f15774f.h0() != 12 && this.f15774f.h0() != 16) {
            StringBuilder a10 = android.support.v4.media.d.a("syntax error, expect {, actual ");
            a10.append(this.f15774f.z0());
            throw new e4.d(a10.toString());
        }
        while (true) {
            String v10 = this.f15774f.v(this.f15770b);
            if (v10 == null) {
                if (this.f15774f.h0() == 13) {
                    this.f15774f.J(16);
                    return;
                } else if (this.f15774f.h0() == 16 && this.f15774f.I(b.AllowArbitraryCommas)) {
                }
            }
            if (oVar != null) {
                lVar = oVar.i(v10, null);
            } else {
                lVar = null;
            }
            if (lVar == null) {
                if (this.f15774f.I(b.IgnoreNotMatch)) {
                    this.f15774f.y0();
                    D();
                    if (this.f15774f.h0() == 13) {
                        this.f15774f.nextToken();
                        return;
                    }
                } else {
                    StringBuilder a11 = android.support.v4.media.d.a("setter not found, class ");
                    a11.append(cls.getName());
                    a11.append(", property ");
                    a11.append(v10);
                    throw new e4.d(a11.toString());
                }
            } else {
                n4.c cVar = lVar.f16452a;
                Class<?> cls2 = cVar.f21951e;
                Type type = cVar.f21952f;
                if (cls2 == Integer.TYPE) {
                    this.f15774f.D();
                    d10 = d0.f17349a.d(this, type, null);
                } else if (cls2 == String.class) {
                    this.f15774f.D();
                    d10 = f1.f(this);
                } else if (cls2 == Long.TYPE) {
                    this.f15774f.D();
                    d10 = o0.f17455a.d(this, type, null);
                } else {
                    t c10 = this.f15771c.c(cls2, type);
                    c cVar2 = this.f15774f;
                    c10.b();
                    cVar2.D();
                    d10 = c10.d(this, type, null);
                }
                lVar.d(obj, d10);
                if (this.f15774f.h0() != 16 && this.f15774f.h0() == 13) {
                    this.f15774f.J(16);
                    return;
                }
            }
        }
    }

    public final void X() {
        if (this.f15774f.I(b.DisableCircularReferenceDetect)) {
            return;
        }
        this.f15775g = this.f15775g.f15834b;
        int i10 = this.f15777i;
        if (i10 <= 0) {
            return;
        }
        int i11 = i10 - 1;
        this.f15777i = i11;
        this.f15776h[i11] = null;
    }

    public final Object Z(String str) {
        if (this.f15776h == null) {
            return null;
        }
        int i10 = 0;
        while (true) {
            j[] jVarArr = this.f15776h;
            if (i10 >= jVarArr.length || i10 >= this.f15777i) {
                break;
            }
            j jVar = jVarArr[i10];
            if (jVar.toString().equals(str)) {
                return jVar.f15833a;
            }
            i10++;
        }
        return null;
    }

    public final void a(int i10) {
        c cVar = this.f15774f;
        if (cVar.h0() == i10) {
            cVar.nextToken();
            return;
        }
        StringBuilder a10 = android.support.v4.media.d.a("syntax error, expect ");
        a10.append(i.a(i10));
        a10.append(", actual ");
        a10.append(i.a(cVar.h0()));
        throw new e4.d(a10.toString());
    }

    public final void b() {
        c cVar = this.f15774f;
        cVar.y0();
        if (cVar.h0() != 4) {
            throw new e4.d("type not match error");
        }
        if (!"java.awt.Point".equals(cVar.W())) {
            throw new e4.d("type not match error");
        }
        cVar.nextToken();
        if (cVar.h0() == 16) {
            cVar.nextToken();
        }
    }

    public final j b0(j jVar, Object obj, Object obj2) {
        if (this.f15774f.I(b.DisableCircularReferenceDetect)) {
            return null;
        }
        j jVar2 = new j(jVar, obj, obj2);
        this.f15775g = jVar2;
        int i10 = this.f15777i;
        this.f15777i = i10 + 1;
        j[] jVarArr = this.f15776h;
        if (jVarArr == null) {
            this.f15776h = new j[8];
        } else if (i10 >= jVarArr.length) {
            j[] jVarArr2 = new j[(jVarArr.length * 3) / 2];
            System.arraycopy(jVarArr, 0, jVarArr2, 0, jVarArr.length);
            this.f15776h = jVarArr2;
        }
        this.f15776h[i10] = jVar2;
        return this.f15775g;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        c cVar = this.f15774f;
        try {
            if (cVar.I(b.AutoCloseSource) && cVar.h0() != 20) {
                throw new e4.d("not close json text, token : " + i.a(cVar.h0()));
            }
        } finally {
            cVar.close();
        }
    }

    public final j e0(Object obj, Object obj2) {
        if (this.f15774f.I(b.DisableCircularReferenceDetect)) {
            return null;
        }
        return b0(this.f15775g, obj, obj2);
    }

    public final void h(C0282a c0282a) {
        if (this.f15778j == null) {
            this.f15778j = new ArrayList(2);
        }
        this.f15778j.add(c0282a);
    }

    public final void h0(j jVar) {
        if (this.f15774f.I(b.DisableCircularReferenceDetect)) {
            return;
        }
        this.f15775g = jVar;
    }

    public final void i0(int i10) {
        this.f15779k = i10;
    }

    public final void j(Collection collection) {
        if (this.f15779k == 1) {
            if (collection instanceof List) {
                C0282a y10 = y();
                y10.f15785c = new x(this, (List) collection, collection.size() - 1);
                y10.f15786d = this.f15775g;
            } else {
                C0282a y11 = y();
                y11.f15785c = new x(collection);
                y11.f15786d = this.f15775g;
            }
            this.f15779k = 0;
        }
    }

    public final void k(Map map, Object obj) {
        if (this.f15779k == 1) {
            x xVar = new x(map, obj);
            C0282a y10 = y();
            y10.f15785c = xVar;
            y10.f15786d = this.f15775g;
            this.f15779k = 0;
        }
    }

    public final k q() {
        return this.f15771c;
    }

    public final j s() {
        return this.f15775g;
    }

    public final DateFormat v() {
        if (this.f15773e == null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.f15772d, this.f15774f.E0());
            this.f15773e = simpleDateFormat;
            simpleDateFormat.setTimeZone(this.f15774f.X());
        }
        return this.f15773e;
    }

    public final C0282a y() {
        ArrayList arrayList = this.f15778j;
        return (C0282a) arrayList.get(arrayList.size() - 1);
    }

    public a(String str) {
        this(str, k.f15845u, e4.a.f13344f);
    }
}
