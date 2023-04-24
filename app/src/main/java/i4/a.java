package i4;

import h4.a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c */
    public static final String f16430c = n4.b.f(h4.a.class);

    /* renamed from: d */
    public static final String f16431d = n4.b.f(h4.e.class);

    /* renamed from: a */
    public final n4.a f16432a;

    /* renamed from: b */
    public final AtomicLong f16433b = new AtomicLong();

    /* renamed from: i4.a$a */
    /* loaded from: classes.dex */
    public static class C0291a {

        /* renamed from: a */
        public int f16434a;

        /* renamed from: b */
        public final HashMap f16435b = new HashMap();

        /* renamed from: c */
        public final Class<?> f16436c;

        /* renamed from: d */
        public final n4.i f16437d;

        /* renamed from: e */
        public final String f16438e;

        /* renamed from: f */
        public n4.c[] f16439f;

        public C0291a(String str, n4.i iVar, int i10) {
            this.f16434a = -1;
            this.f16438e = str;
            this.f16436c = iVar.f21988a;
            this.f16434a = i10;
            this.f16437d = iVar;
            this.f16439f = iVar.f21995h;
        }

        public static String a(n4.c cVar) {
            StringBuilder a10;
            if (c(cVar.f21947a)) {
                a10 = new StringBuilder();
                a10.append(cVar.f21947a);
                a10.append("_asm_deser__");
            } else {
                a10 = android.support.v4.media.d.a("_asm_deser__");
                a10.append(n4.n.u(cVar.f21947a));
            }
            return a10.toString();
        }

        public static String b(n4.c cVar) {
            StringBuilder a10;
            if (c(cVar.f21947a)) {
                a10 = new StringBuilder();
                a10.append(cVar.f21947a);
                a10.append("_asm_prefix__");
            } else {
                a10 = android.support.v4.media.d.a("asm_field_");
                a10.append(n4.n.u(cVar.f21947a));
            }
            return a10.toString();
        }

        public static boolean c(String str) {
            int i10 = 0;
            while (true) {
                boolean z10 = true;
                if (i10 >= str.length()) {
                    return true;
                }
                char charAt = str.charAt(i10);
                if (charAt == 0) {
                    boolean[] zArr = n4.g.f21969c;
                    if (!((charAt >= zArr.length || !zArr[charAt]) ? false : false)) {
                        return false;
                    }
                } else {
                    boolean[] zArr2 = n4.g.f21970d;
                    if (!((charAt >= zArr2.length || !zArr2[charAt]) ? false : false)) {
                        return false;
                    }
                }
                i10++;
            }
        }

        public final int d(String str) {
            if (((Integer) this.f16435b.get(str)) == null) {
                HashMap hashMap = this.f16435b;
                int i10 = this.f16434a;
                this.f16434a = i10 + 1;
                hashMap.put(str, Integer.valueOf(i10));
            }
            return ((Integer) this.f16435b.get(str)).intValue();
        }

        public final int e(n4.c cVar) {
            return d(cVar.f21947a + "_asm");
        }

        public final int f(n4.c cVar) {
            String b10 = androidx.activity.e.b(new StringBuilder(), cVar.f21947a, "_asm");
            if (((Integer) this.f16435b.get(b10)) == null) {
                this.f16435b.put(b10, Integer.valueOf(this.f16434a));
                this.f16434a += 2;
            }
            return ((Integer) this.f16435b.get(b10)).intValue();
        }
    }

    public a(n4.a aVar) {
        this.f16432a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x017f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(i4.a.C0291a r16, g4.h r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.a.a(i4.a$a, g4.h, boolean):void");
    }

    public static void b(C0291a c0291a, g4.h hVar) {
        Constructor<?> constructor = c0291a.f16437d.f21990c;
        if (Modifier.isPublic(constructor.getModifiers())) {
            Class<?> cls = c0291a.f16437d.f21989b;
            if (cls == null) {
                cls = c0291a.f16436c;
            }
            hVar.h(187, n4.b.f(cls));
            hVar.b(89);
            hVar.g(n4.b.f(constructor.getDeclaringClass()), 183, "<init>", "()V");
        } else {
            hVar.i(25, 0);
            hVar.i(25, 1);
            hVar.i(25, 0);
            hVar.a(n4.b.f(o.class), 180, "clazz", "Ljava/lang/Class;");
            hVar.g(n4.b.f(o.class), 183, "createInstance", androidx.activity.e.b(android.support.v4.media.d.a("(L"), f16430c, ";Ljava/lang/reflect/Type;)Ljava/lang/Object;"));
            Class<?> cls2 = c0291a.f16437d.f21989b;
            if (cls2 == null) {
                cls2 = c0291a.f16436c;
            }
            hVar.h(192, n4.b.f(cls2));
        }
        hVar.i(58, c0291a.d("instance"));
    }

    public static void c(C0291a c0291a, g4.h hVar, n4.c cVar, Class cls, int i10) {
        h(c0291a, hVar, cVar);
        g4.e eVar = new g4.e();
        g4.e eVar2 = new g4.e();
        if ((cVar.f21956j & h4.b.SupportArrayToBean.f15812a) != 0) {
            hVar.b(89);
            hVar.h(193, n4.b.f(o.class));
            hVar.d(153, eVar);
            hVar.h(192, n4.b.f(o.class));
            hVar.i(25, 1);
            if (cVar.f21952f instanceof Class) {
                hVar.f(g4.i.b(n4.b.b(cVar.f21951e)));
            } else {
                hVar.i(25, 0);
                hVar.f(Integer.valueOf(i10));
                hVar.g(n4.b.f(o.class), 182, "getFieldType", "(I)Ljava/lang/reflect/Type;");
            }
            hVar.f(cVar.f21947a);
            hVar.f(Integer.valueOf(cVar.f21956j));
            hVar.g(n4.b.f(o.class), 182, "deserialze", androidx.activity.e.b(android.support.v4.media.d.a("(L"), f16430c, ";Ljava/lang/reflect/Type;Ljava/lang/Object;I)Ljava/lang/Object;"));
            hVar.h(192, n4.b.f(cls));
            hVar.i(58, c0291a.e(cVar));
            hVar.d(167, eVar2);
            hVar.e(eVar);
        }
        hVar.i(25, 1);
        if (cVar.f21952f instanceof Class) {
            hVar.f(g4.i.b(n4.b.b(cVar.f21951e)));
        } else {
            hVar.i(25, 0);
            hVar.f(Integer.valueOf(i10));
            hVar.g(n4.b.f(o.class), 182, "getFieldType", "(I)Ljava/lang/reflect/Type;");
        }
        hVar.f(cVar.f21947a);
        hVar.g(n4.b.f(t.class), 185, "deserialze", androidx.activity.e.b(android.support.v4.media.d.a("(L"), f16430c, ";Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;"));
        hVar.h(192, n4.b.f(cls));
        hVar.i(58, c0291a.e(cVar));
        hVar.e(eVar2);
    }

    public static void d(g4.b bVar, C0291a c0291a) {
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        Class<h4.l> cls;
        Class<o> cls2;
        String str;
        int i12;
        int e10;
        int i13;
        int i14;
        int i15;
        String str2;
        String str3;
        String str4;
        int e11;
        int i16;
        int i17;
        String str5;
        String str6;
        String str7;
        String str8;
        g4.e eVar;
        int i18;
        int e12;
        Class<h4.l> cls3 = h4.l.class;
        Class<o> cls4 = o.class;
        String str9 = "(L";
        StringBuilder a10 = android.support.v4.media.d.a("(L");
        String str10 = f16430c;
        g4.h hVar = new g4.h(bVar, "deserialzeArrayMapping", androidx.activity.e.b(a10, str10, ";Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"), null);
        n(c0291a, hVar);
        hVar.i(25, c0291a.d("lexer"));
        hVar.i(25, 1);
        hVar.g(str10, 182, "getSymbolTable", "()" + n4.b.b(cls3));
        String str11 = f16431d;
        StringBuilder a11 = android.support.v4.media.d.a("(");
        a11.append(n4.b.b(cls3));
        a11.append(")Ljava/lang/String;");
        hVar.g(str11, 182, "scanTypeName", a11.toString());
        hVar.i(58, c0291a.d("typeName"));
        g4.e eVar2 = new g4.e();
        hVar.i(25, c0291a.d("typeName"));
        hVar.d(198, eVar2);
        hVar.i(25, 1);
        hVar.g(str10, 182, "getConfig", "()" + n4.b.b(h4.k.class));
        hVar.i(25, 0);
        hVar.a(n4.b.f(cls4), 180, "beanInfo", n4.b.b(n4.i.class));
        hVar.i(25, c0291a.d("typeName"));
        String f10 = n4.b.f(cls4);
        StringBuilder a12 = android.support.v4.media.d.a("(");
        a12.append(n4.b.b(h4.k.class));
        a12.append(n4.b.b(n4.i.class));
        a12.append("Ljava/lang/String;)");
        a12.append(n4.b.b(cls4));
        hVar.g(f10, 184, "getSeeAlso", a12.toString());
        hVar.i(58, c0291a.d("userTypeDeser"));
        hVar.i(25, c0291a.d("userTypeDeser"));
        hVar.h(193, n4.b.f(cls4));
        hVar.d(153, eVar2);
        hVar.i(25, c0291a.d("userTypeDeser"));
        hVar.i(25, 1);
        hVar.i(25, 2);
        hVar.i(25, 3);
        hVar.i(25, 4);
        hVar.g(n4.b.f(cls4), 182, "deserialzeArrayMapping", android.support.v4.media.a.a("(L", str10, ";Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"));
        hVar.b(176);
        hVar.e(eVar2);
        b(c0291a, hVar);
        n4.c[] cVarArr = c0291a.f16437d.f21996i;
        int length = cVarArr.length;
        int i19 = 0;
        while (i19 < length) {
            if (i19 == length - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i10 = length;
                z11 = z10;
                i11 = 93;
            } else {
                i10 = length;
                z11 = z10;
                i11 = 44;
            }
            n4.c cVar = cVarArr[i19];
            n4.c[] cVarArr2 = cVarArr;
            Class<?> cls5 = cVar.f21951e;
            Type type = cVar.f21952f;
            int i20 = i19;
            if (cls5 != Byte.TYPE && cls5 != Short.TYPE && cls5 != Integer.TYPE) {
                String str12 = str9;
                cls2 = cls4;
                if (cls5 == Byte.class) {
                    hVar.i(25, c0291a.d("lexer"));
                    hVar.i(16, i11);
                    str8 = f16431d;
                    hVar.g(str8, 182, "scanInt", "(C)I");
                    hVar.g("java/lang/Byte", 184, "valueOf", "(B)Ljava/lang/Byte;");
                    hVar.i(58, c0291a.e(cVar));
                    eVar = new g4.e();
                } else if (cls5 == Short.class) {
                    hVar.i(25, c0291a.d("lexer"));
                    hVar.i(16, i11);
                    str8 = f16431d;
                    hVar.g(str8, 182, "scanInt", "(C)I");
                    hVar.g("java/lang/Short", 184, "valueOf", "(S)Ljava/lang/Short;");
                    hVar.i(58, c0291a.e(cVar));
                    eVar = new g4.e();
                } else if (cls5 == Integer.class) {
                    hVar.i(25, c0291a.d("lexer"));
                    hVar.i(16, i11);
                    str8 = f16431d;
                    hVar.g(str8, 182, "scanInt", "(C)I");
                    hVar.g("java/lang/Integer", 184, "valueOf", "(I)Ljava/lang/Integer;");
                    hVar.i(58, c0291a.e(cVar));
                    eVar = new g4.e();
                } else {
                    if (cls5 == Long.TYPE) {
                        hVar.i(25, c0291a.d("lexer"));
                        hVar.i(16, i11);
                        hVar.g(f16431d, 182, "scanLong", "(C)J");
                        i18 = 55;
                    } else if (cls5 == Long.class) {
                        hVar.i(25, c0291a.d("lexer"));
                        hVar.i(16, i11);
                        str8 = f16431d;
                        hVar.g(str8, 182, "scanLong", "(C)J");
                        hVar.g("java/lang/Long", 184, "valueOf", "(J)Ljava/lang/Long;");
                        hVar.i(58, c0291a.e(cVar));
                        eVar = new g4.e();
                    } else {
                        if (cls5 == Boolean.TYPE) {
                            hVar.i(25, c0291a.d("lexer"));
                            hVar.i(16, i11);
                            str5 = f16431d;
                            str6 = "scanBoolean";
                            str7 = "(C)Z";
                            i17 = 182;
                        } else if (cls5 == Float.TYPE) {
                            hVar.i(25, c0291a.d("lexer"));
                            hVar.i(16, i11);
                            hVar.g(f16431d, 182, "scanFloat", "(C)F");
                            i18 = 56;
                            e12 = c0291a.e(cVar);
                            hVar.i(i18, e12);
                            str = str12;
                            cls = cls3;
                            i12 = i20;
                            i19 = i12 + 1;
                            length = i10;
                            str9 = str;
                            cVarArr = cVarArr2;
                            cls3 = cls;
                            cls4 = cls2;
                        } else if (cls5 == Float.class) {
                            hVar.i(25, c0291a.d("lexer"));
                            hVar.i(16, i11);
                            str8 = f16431d;
                            hVar.g(str8, 182, "scanFloat", "(C)F");
                            hVar.g("java/lang/Float", 184, "valueOf", "(F)Ljava/lang/Float;");
                            hVar.i(58, c0291a.e(cVar));
                            eVar = new g4.e();
                        } else if (cls5 == Double.TYPE) {
                            hVar.i(25, c0291a.d("lexer"));
                            hVar.i(16, i11);
                            hVar.g(f16431d, 182, "scanDouble", "(C)D");
                            i18 = 57;
                        } else if (cls5 == Double.class) {
                            hVar.i(25, c0291a.d("lexer"));
                            hVar.i(16, i11);
                            str8 = f16431d;
                            hVar.g(str8, 182, "scanDouble", "(C)D");
                            hVar.g("java/lang/Double", 184, "valueOf", "(D)Ljava/lang/Double;");
                            hVar.i(58, c0291a.e(cVar));
                            eVar = new g4.e();
                        } else if (cls5 == Character.TYPE) {
                            hVar.i(25, c0291a.d("lexer"));
                            hVar.i(16, i11);
                            i17 = 182;
                            hVar.g(f16431d, 182, "scanString", "(C)Ljava/lang/String;");
                            hVar.b(3);
                            str5 = "java/lang/String";
                            str6 = "charAt";
                            str7 = "(I)C";
                        } else {
                            if (cls5 == String.class) {
                                hVar.i(25, c0291a.d("lexer"));
                                hVar.i(16, i11);
                                str2 = f16431d;
                                str3 = "scanString";
                                str4 = "(C)Ljava/lang/String;";
                            } else if (cls5 == BigDecimal.class) {
                                hVar.i(25, c0291a.d("lexer"));
                                hVar.i(16, i11);
                                str2 = f16431d;
                                str3 = "scanDecimal";
                                str4 = "(C)Ljava/math/BigDecimal;";
                            } else if (cls5 == Date.class) {
                                hVar.i(25, c0291a.d("lexer"));
                                hVar.i(16, i11);
                                str2 = f16431d;
                                str3 = "scanDate";
                                str4 = "(C)Ljava/util/Date;";
                            } else if (cls5 == UUID.class) {
                                hVar.i(25, c0291a.d("lexer"));
                                hVar.i(16, i11);
                                str2 = f16431d;
                                str3 = "scanUUID";
                                str4 = "(C)Ljava/util/UUID;";
                            } else {
                                if (cls5.isEnum()) {
                                    g4.e eVar3 = new g4.e();
                                    g4.e eVar4 = new g4.e();
                                    g4.e eVar5 = new g4.e();
                                    g4.e eVar6 = new g4.e();
                                    hVar.i(25, c0291a.d("lexer"));
                                    String str13 = f16431d;
                                    hVar.g(str13, 182, "getCurrent", "()C");
                                    hVar.b(89);
                                    hVar.i(54, c0291a.d("ch"));
                                    hVar.f(110);
                                    hVar.d(159, eVar6);
                                    hVar.i(21, c0291a.d("ch"));
                                    hVar.f(34);
                                    hVar.d(160, eVar3);
                                    hVar.e(eVar6);
                                    hVar.i(25, c0291a.d("lexer"));
                                    hVar.f(g4.i.b(n4.b.b(cls5)));
                                    hVar.i(25, 1);
                                    String str14 = f16430c;
                                    StringBuilder a13 = android.support.v4.media.d.a("()");
                                    a13.append(n4.b.b(cls3));
                                    hVar.g(str14, 182, "getSymbolTable", a13.toString());
                                    hVar.i(16, i11);
                                    hVar.g(str13, 182, "scanEnum", "(Ljava/lang/Class;" + n4.b.b(cls3) + "C)Ljava/lang/Enum;");
                                    hVar.d(167, eVar5);
                                    hVar.e(eVar3);
                                    hVar.i(21, c0291a.d("ch"));
                                    hVar.f(48);
                                    hVar.d(161, eVar4);
                                    hVar.i(21, c0291a.d("ch"));
                                    hVar.f(57);
                                    hVar.d(163, eVar4);
                                    h(c0291a, hVar, cVar);
                                    hVar.h(192, n4.b.f(h.class));
                                    hVar.i(25, c0291a.d("lexer"));
                                    hVar.i(16, i11);
                                    hVar.g(str13, 182, "scanInt", "(C)I");
                                    hVar.g(n4.b.f(h.class), 182, "valueOf", "(I)Ljava/lang/Enum;");
                                    hVar.d(167, eVar5);
                                    hVar.e(eVar4);
                                    hVar.i(25, 0);
                                    hVar.i(25, c0291a.d("lexer"));
                                    hVar.i(16, i11);
                                    str = str12;
                                    hVar.g(n4.b.f(cls2), 182, "scanEnum", android.support.v4.media.a.a(str, str13, ";C)Ljava/lang/Enum;"));
                                    hVar.e(eVar5);
                                    hVar.h(192, n4.b.f(cls5));
                                    hVar.i(58, c0291a.e(cVar));
                                } else {
                                    str = str12;
                                    if (Collection.class.isAssignableFrom(cls5)) {
                                        Class<?> C = n4.n.C(type);
                                        if (C == String.class) {
                                            if (cls5 != List.class && cls5 != Collections.class && cls5 != ArrayList.class) {
                                                hVar.f(g4.i.b(n4.b.b(cls5)));
                                                hVar.g(n4.b.f(n4.n.class), 184, "createCollection", "(Ljava/lang/Class;)Ljava/util/Collection;");
                                            } else {
                                                hVar.h(187, n4.b.f(ArrayList.class));
                                                hVar.b(89);
                                                hVar.g(n4.b.f(ArrayList.class), 183, "<init>", "()V");
                                            }
                                            hVar.i(58, c0291a.e(cVar));
                                            hVar.i(25, c0291a.d("lexer"));
                                            hVar.i(25, c0291a.e(cVar));
                                            hVar.i(16, i11);
                                            String str15 = f16431d;
                                            hVar.g(str15, 182, "scanStringArray", "(Ljava/util/Collection;C)V");
                                            g4.e eVar7 = new g4.e();
                                            hVar.i(25, c0291a.d("lexer"));
                                            hVar.a(str15, 180, "matchStat", "I");
                                            hVar.f(5);
                                            hVar.d(160, eVar7);
                                            hVar.b(1);
                                            hVar.i(58, c0291a.e(cVar));
                                            hVar.e(eVar7);
                                        } else {
                                            g4.e eVar8 = new g4.e();
                                            hVar.i(25, c0291a.d("lexer"));
                                            String str16 = f16431d;
                                            hVar.g(str16, 182, "token", "()I");
                                            hVar.i(54, c0291a.d("token"));
                                            hVar.i(21, c0291a.d("token"));
                                            if (i20 == 0) {
                                                i15 = 14;
                                            } else {
                                                i15 = 16;
                                            }
                                            hVar.f(Integer.valueOf(i15));
                                            hVar.d(159, eVar8);
                                            hVar.i(25, 1);
                                            hVar.f(Integer.valueOf(i15));
                                            String str17 = f16430c;
                                            hVar.g(str17, 182, "throwException", "(I)V");
                                            hVar.e(eVar8);
                                            g4.e eVar9 = new g4.e();
                                            g4.e eVar10 = new g4.e();
                                            cls = cls3;
                                            hVar.i(25, c0291a.d("lexer"));
                                            hVar.g(str16, 182, "getCurrent", "()C");
                                            hVar.i(16, 91);
                                            hVar.d(160, eVar9);
                                            hVar.i(25, c0291a.d("lexer"));
                                            hVar.g(str16, 182, "next", "()C");
                                            hVar.b(87);
                                            hVar.i(25, c0291a.d("lexer"));
                                            hVar.f(14);
                                            hVar.g(str16, 182, "setToken", "(I)V");
                                            hVar.d(167, eVar10);
                                            hVar.e(eVar9);
                                            hVar.i(25, c0291a.d("lexer"));
                                            hVar.f(14);
                                            hVar.g(str16, 182, "nextToken", "(I)V");
                                            hVar.e(eVar10);
                                            i12 = i20;
                                            i(hVar, cls5, i12, false);
                                            hVar.b(89);
                                            hVar.i(58, c0291a.e(cVar));
                                            g(c0291a, hVar, cVar, C);
                                            hVar.i(25, 1);
                                            hVar.f(g4.i.b(n4.b.b(C)));
                                            hVar.i(25, 3);
                                            String f11 = n4.b.f(cls2);
                                            StringBuilder a14 = android.support.v4.media.d.a("(Ljava/util/Collection;");
                                            a14.append(n4.b.b(t.class));
                                            a14.append("L");
                                            a14.append(str17);
                                            a14.append(";Ljava/lang/reflect/Type;Ljava/lang/Object;)V");
                                            hVar.g(f11, 184, "parseArray", a14.toString());
                                        }
                                    } else {
                                        i12 = i20;
                                        cls = cls3;
                                        if (cls5.isArray()) {
                                            hVar.i(25, c0291a.d("lexer"));
                                            hVar.f(14);
                                            hVar.g(f16431d, 182, "nextToken", "(I)V");
                                            hVar.i(25, 1);
                                            hVar.i(25, 0);
                                            hVar.f(Integer.valueOf(i12));
                                            hVar.g(n4.b.f(cls2), 182, "getFieldType", "(I)Ljava/lang/reflect/Type;");
                                            hVar.g(f16430c, 182, "parseObject", "(Ljava/lang/reflect/Type;)Ljava/lang/Object;");
                                            hVar.h(192, n4.b.f(cls5));
                                            e10 = c0291a.e(cVar);
                                            i13 = 58;
                                        } else {
                                            g4.e eVar11 = new g4.e();
                                            g4.e eVar12 = new g4.e();
                                            if (cls5 == Date.class) {
                                                hVar.i(25, c0291a.d("lexer"));
                                                String str18 = f16431d;
                                                hVar.g(str18, 182, "getCurrent", "()C");
                                                hVar.f(49);
                                                hVar.d(160, eVar11);
                                                hVar.h(187, n4.b.f(Date.class));
                                                hVar.b(89);
                                                hVar.i(25, c0291a.d("lexer"));
                                                hVar.i(16, i11);
                                                hVar.g(str18, 182, "scanLong", "(C)J");
                                                hVar.g(n4.b.f(Date.class), 183, "<init>", "(J)V");
                                                hVar.i(58, c0291a.e(cVar));
                                                hVar.d(167, eVar12);
                                            }
                                            hVar.e(eVar11);
                                            j(14, hVar, c0291a);
                                            c(c0291a, hVar, cVar, cls5, i12);
                                            hVar.i(25, c0291a.d("lexer"));
                                            hVar.g(f16431d, 182, "token", "()I");
                                            hVar.f(15);
                                            hVar.d(159, eVar12);
                                            hVar.i(25, 0);
                                            hVar.i(25, c0291a.d("lexer"));
                                            if (!z11) {
                                                i14 = 16;
                                            } else {
                                                i14 = 15;
                                            }
                                            hVar.f(Integer.valueOf(i14));
                                            String f12 = n4.b.f(cls2);
                                            StringBuilder a15 = android.support.v4.media.d.a("(");
                                            a15.append(n4.b.b(h4.c.class));
                                            a15.append("I)V");
                                            hVar.g(f12, 183, "check", a15.toString());
                                            hVar.e(eVar12);
                                        }
                                    }
                                    i19 = i12 + 1;
                                    length = i10;
                                    str9 = str;
                                    cVarArr = cVarArr2;
                                    cls3 = cls;
                                    cls4 = cls2;
                                }
                                cls = cls3;
                                i12 = i20;
                                i19 = i12 + 1;
                                length = i10;
                                str9 = str;
                                cVarArr = cVarArr2;
                                cls3 = cls;
                                cls4 = cls2;
                            }
                            hVar.g(str2, 182, str3, str4);
                            e11 = c0291a.e(cVar);
                            i16 = 58;
                            hVar.i(i16, e11);
                            str = str12;
                            cls = cls3;
                            i12 = i20;
                            i19 = i12 + 1;
                            length = i10;
                            str9 = str;
                            cVarArr = cVarArr2;
                            cls3 = cls;
                            cls4 = cls2;
                        }
                        hVar.g(str5, i17, str6, str7);
                        e11 = c0291a.e(cVar);
                        i16 = 54;
                        hVar.i(i16, e11);
                        str = str12;
                        cls = cls3;
                        i12 = i20;
                        i19 = i12 + 1;
                        length = i10;
                        str9 = str;
                        cVarArr = cVarArr2;
                        cls3 = cls;
                        cls4 = cls2;
                    }
                    e12 = c0291a.f(cVar);
                    hVar.i(i18, e12);
                    str = str12;
                    cls = cls3;
                    i12 = i20;
                    i19 = i12 + 1;
                    length = i10;
                    str9 = str;
                    cVarArr = cVarArr2;
                    cls3 = cls;
                    cls4 = cls2;
                }
                hVar.i(25, c0291a.d("lexer"));
                hVar.a(str8, 180, "matchStat", "I");
                hVar.f(5);
                hVar.d(160, eVar);
                hVar.b(1);
                hVar.i(58, c0291a.e(cVar));
                hVar.e(eVar);
                str = str12;
                cls = cls3;
                i12 = i20;
                i19 = i12 + 1;
                length = i10;
                str9 = str;
                cVarArr = cVarArr2;
                cls3 = cls;
                cls4 = cls2;
            } else {
                cls = cls3;
                cls2 = cls4;
                str = str9;
                i12 = i20;
                hVar.i(25, c0291a.d("lexer"));
                hVar.i(16, i11);
                hVar.g(f16431d, 182, "scanInt", "(C)I");
                e10 = c0291a.e(cVar);
                i13 = 54;
            }
            hVar.i(i13, e10);
            i19 = i12 + 1;
            length = i10;
            str9 = str;
            cVarArr = cVarArr2;
            cls3 = cls;
            cls4 = cls2;
        }
        a(c0291a, hVar, false);
        g4.e eVar13 = new g4.e();
        g4.e eVar14 = new g4.e();
        g4.e eVar15 = new g4.e();
        g4.e eVar16 = new g4.e();
        hVar.i(25, c0291a.d("lexer"));
        String str19 = f16431d;
        hVar.g(str19, 182, "getCurrent", "()C");
        hVar.b(89);
        hVar.i(54, c0291a.d("ch"));
        hVar.i(16, 44);
        hVar.d(160, eVar14);
        hVar.i(25, c0291a.d("lexer"));
        hVar.g(str19, 182, "next", "()C");
        hVar.b(87);
        hVar.i(25, c0291a.d("lexer"));
        hVar.f(16);
        hVar.g(str19, 182, "setToken", "(I)V");
        hVar.d(167, eVar16);
        hVar.e(eVar14);
        hVar.i(21, c0291a.d("ch"));
        hVar.i(16, 93);
        hVar.d(160, eVar15);
        hVar.i(25, c0291a.d("lexer"));
        hVar.g(str19, 182, "next", "()C");
        hVar.b(87);
        hVar.i(25, c0291a.d("lexer"));
        hVar.f(15);
        hVar.g(str19, 182, "setToken", "(I)V");
        hVar.d(167, eVar16);
        hVar.e(eVar15);
        hVar.i(21, c0291a.d("ch"));
        hVar.i(16, 26);
        hVar.d(160, eVar13);
        hVar.i(25, c0291a.d("lexer"));
        hVar.g(str19, 182, "next", "()C");
        hVar.b(87);
        hVar.i(25, c0291a.d("lexer"));
        hVar.f(20);
        hVar.g(str19, 182, "setToken", "(I)V");
        hVar.d(167, eVar16);
        hVar.e(eVar13);
        hVar.i(25, c0291a.d("lexer"));
        hVar.f(16);
        hVar.g(str19, 182, "nextToken", "(I)V");
        hVar.e(eVar16);
        hVar.i(25, c0291a.d("instance"));
        hVar.b(176);
        int i21 = c0291a.f16434a;
        hVar.f14987h = 5;
        hVar.f14988i = i21;
    }

    public static void e(C0291a c0291a, g4.h hVar, g4.e eVar, n4.c cVar, Class cls, Class cls2, int i10) {
        String str;
        String str2;
        int i11;
        int i12;
        g4.e eVar2 = new g4.e();
        String str3 = f16431d;
        hVar.g(str3, 182, "matchField", "([C)Z");
        hVar.d(153, eVar2);
        l(i10, hVar, c0291a);
        g4.e eVar3 = new g4.e();
        hVar.i(25, c0291a.d("lexer"));
        hVar.g(str3, 182, "token", "()I");
        hVar.f(8);
        hVar.d(160, eVar3);
        hVar.i(25, c0291a.d("lexer"));
        hVar.f(16);
        hVar.g(str3, 182, "nextToken", "(I)V");
        hVar.d(167, eVar2);
        hVar.e(eVar3);
        g4.e eVar4 = new g4.e();
        g4.e eVar5 = new g4.e();
        g4.e eVar6 = new g4.e();
        hVar.i(25, c0291a.d("lexer"));
        hVar.g(str3, 182, "token", "()I");
        hVar.f(21);
        hVar.d(160, eVar5);
        hVar.i(25, c0291a.d("lexer"));
        hVar.f(14);
        hVar.g(str3, 182, "nextToken", "(I)V");
        i(hVar, cls, i10, true);
        hVar.d(167, eVar4);
        hVar.e(eVar5);
        hVar.i(25, c0291a.d("lexer"));
        hVar.g(str3, 182, "token", "()I");
        hVar.f(14);
        hVar.d(159, eVar6);
        hVar.i(25, c0291a.d("lexer"));
        hVar.g(str3, 182, "token", "()I");
        hVar.f(12);
        hVar.d(160, eVar);
        i(hVar, cls, i10, false);
        hVar.i(58, c0291a.e(cVar));
        g(c0291a, hVar, cVar, cls2);
        hVar.i(25, 1);
        hVar.f(g4.i.b(n4.b.b(cls2)));
        hVar.b(3);
        hVar.g("java/lang/Integer", 184, "valueOf", "(I)Ljava/lang/Integer;");
        String f10 = n4.b.f(t.class);
        StringBuilder a10 = android.support.v4.media.d.a("(L");
        String str4 = f16430c;
        hVar.g(f10, 185, "deserialze", androidx.activity.e.b(a10, str4, ";Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;"));
        hVar.i(58, c0291a.d("list_item_value"));
        hVar.i(25, c0291a.e(cVar));
        hVar.i(25, c0291a.d("list_item_value"));
        if (cls.isInterface()) {
            str = "list_item_value";
            hVar.g(n4.b.f(cls), 185, "add", "(Ljava/lang/Object;)Z");
        } else {
            str = "list_item_value";
            hVar.g(n4.b.f(cls), 182, "add", "(Ljava/lang/Object;)Z");
        }
        hVar.b(87);
        hVar.d(167, eVar2);
        hVar.e(eVar6);
        i(hVar, cls, i10, false);
        hVar.e(eVar4);
        hVar.i(58, c0291a.e(cVar));
        boolean g10 = h4.k.g(cVar.f21951e);
        g(c0291a, hVar, cVar, cls2);
        if (g10) {
            hVar.g(n4.b.f(t.class), 185, "getFastMatchToken", "()I");
            hVar.i(54, c0291a.d("fastMatchToken"));
            hVar.i(25, c0291a.d("lexer"));
            hVar.i(21, c0291a.d("fastMatchToken"));
            str2 = "(I)V";
            hVar.g(str3, 182, "nextToken", str2);
        } else {
            str2 = "(I)V";
            hVar.b(87);
            hVar.f(12);
            hVar.i(54, c0291a.d("fastMatchToken"));
            j(12, hVar, c0291a);
        }
        hVar.i(25, 1);
        hVar.g(str4, 182, "getContext", "()" + n4.b.b(h4.j.class));
        hVar.i(58, c0291a.d("listContext"));
        hVar.i(25, 1);
        hVar.i(25, c0291a.e(cVar));
        hVar.f(cVar.f21947a);
        hVar.g(str4, 182, "setContext", "(Ljava/lang/Object;Ljava/lang/Object;)" + n4.b.b(h4.j.class));
        hVar.b(87);
        g4.e eVar7 = new g4.e();
        g4.e eVar8 = new g4.e();
        hVar.b(3);
        String str5 = str2;
        hVar.i(54, c0291a.d("i"));
        hVar.e(eVar7);
        hVar.i(25, c0291a.d("lexer"));
        hVar.g(str3, 182, "token", "()I");
        hVar.f(15);
        hVar.d(159, eVar8);
        hVar.i(25, 0);
        hVar.a(c0291a.f16438e, 180, androidx.activity.e.b(new StringBuilder(), cVar.f21947a, "_asm_list_item_deser__"), n4.b.b(t.class));
        hVar.i(25, 1);
        hVar.f(g4.i.b(n4.b.b(cls2)));
        hVar.i(21, c0291a.d("i"));
        hVar.g("java/lang/Integer", 184, "valueOf", "(I)Ljava/lang/Integer;");
        hVar.g(n4.b.f(t.class), 185, "deserialze", android.support.v4.media.a.a("(L", str4, ";Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;"));
        String str6 = str;
        hVar.i(58, c0291a.d(str6));
        int d10 = c0291a.d("i");
        j1.e eVar9 = hVar.f14986g;
        eVar9.d(132);
        eVar9.b(d10, 1);
        hVar.i(25, c0291a.e(cVar));
        hVar.i(25, c0291a.d(str6));
        if (cls.isInterface()) {
            hVar.g(n4.b.f(cls), 185, "add", "(Ljava/lang/Object;)Z");
            i12 = 87;
            i11 = 182;
        } else {
            i11 = 182;
            hVar.g(n4.b.f(cls), 182, "add", "(Ljava/lang/Object;)Z");
            i12 = 87;
        }
        hVar.b(i12);
        hVar.i(25, 1);
        hVar.i(25, c0291a.e(cVar));
        hVar.g(str4, i11, "checkListResolve", "(Ljava/util/Collection;)V");
        hVar.i(25, c0291a.d("lexer"));
        hVar.g(str3, i11, "token", "()I");
        hVar.f(16);
        hVar.d(160, eVar7);
        if (g10) {
            hVar.i(25, c0291a.d("lexer"));
            hVar.i(21, c0291a.d("fastMatchToken"));
            hVar.g(str3, i11, "nextToken", str5);
        } else {
            j(12, hVar, c0291a);
        }
        hVar.d(167, eVar7);
        hVar.e(eVar8);
        hVar.i(25, 1);
        hVar.i(25, c0291a.d("listContext"));
        hVar.g(str4, 182, "setContext", "(" + n4.b.b(h4.j.class) + ")V");
        hVar.i(25, c0291a.d("lexer"));
        hVar.g(str3, 182, "token", "()I");
        hVar.f(15);
        hVar.d(160, eVar);
        k(c0291a, hVar);
        hVar.e(eVar2);
    }

    public static void f(C0291a c0291a, g4.h hVar, n4.c cVar, Class cls, int i10) {
        g4.e eVar = new g4.e();
        g4.e eVar2 = new g4.e();
        hVar.i(25, c0291a.d("lexer"));
        hVar.i(25, 0);
        hVar.a(c0291a.f16438e, 180, C0291a.b(cVar), "[C");
        hVar.g(f16431d, 182, "matchField", "([C)Z");
        hVar.d(154, eVar);
        hVar.b(1);
        hVar.i(58, c0291a.e(cVar));
        hVar.d(167, eVar2);
        hVar.e(eVar);
        l(i10, hVar, c0291a);
        hVar.i(21, c0291a.d("matchedCount"));
        hVar.b(4);
        hVar.b(96);
        hVar.i(54, c0291a.d("matchedCount"));
        c(c0291a, hVar, cVar, cls, i10);
        hVar.i(25, 1);
        String str = f16430c;
        hVar.g(str, 182, "getResolveStatus", "()I");
        hVar.f(1);
        hVar.d(160, eVar2);
        hVar.i(25, 1);
        hVar.g(str, 182, "getLastResolveTask", "()" + n4.b.b(a.C0282a.class));
        hVar.i(58, c0291a.d("resolveTask"));
        hVar.i(25, c0291a.d("resolveTask"));
        hVar.i(25, 1);
        hVar.g(str, 182, "getContext", "()" + n4.b.b(h4.j.class));
        hVar.a(n4.b.f(a.C0282a.class), 181, "ownerContext", n4.b.b(h4.j.class));
        hVar.i(25, c0291a.d("resolveTask"));
        hVar.i(25, 0);
        hVar.f(cVar.f21947a);
        String f10 = n4.b.f(o.class);
        StringBuilder a10 = android.support.v4.media.d.a("(Ljava/lang/String;)");
        a10.append(n4.b.b(l.class));
        hVar.g(f10, 182, "getFieldDeserializer", a10.toString());
        hVar.a(n4.b.f(a.C0282a.class), 181, "fieldDeserializer", n4.b.b(l.class));
        hVar.i(25, 1);
        hVar.f(0);
        hVar.g(str, 182, "setResolveStatus", "(I)V");
        hVar.e(eVar2);
    }

    public static void g(C0291a c0291a, g4.h hVar, n4.c cVar, Class cls) {
        g4.e eVar = new g4.e();
        hVar.i(25, 0);
        hVar.a(c0291a.f16438e, 180, androidx.activity.e.b(new StringBuilder(), cVar.f21947a, "_asm_list_item_deser__"), n4.b.b(t.class));
        hVar.d(199, eVar);
        hVar.i(25, 0);
        hVar.i(25, 1);
        String str = f16430c;
        StringBuilder a10 = android.support.v4.media.d.a("()");
        a10.append(n4.b.b(h4.k.class));
        hVar.g(str, 182, "getConfig", a10.toString());
        hVar.f(g4.i.b(n4.b.b(cls)));
        String f10 = n4.b.f(h4.k.class);
        StringBuilder a11 = android.support.v4.media.d.a("(Ljava/lang/reflect/Type;)");
        a11.append(n4.b.b(t.class));
        hVar.g(f10, 182, "getDeserializer", a11.toString());
        hVar.a(c0291a.f16438e, 181, androidx.activity.e.b(new StringBuilder(), cVar.f21947a, "_asm_list_item_deser__"), n4.b.b(t.class));
        hVar.e(eVar);
        hVar.i(25, 0);
        hVar.a(c0291a.f16438e, 180, androidx.activity.e.b(new StringBuilder(), cVar.f21947a, "_asm_list_item_deser__"), n4.b.b(t.class));
    }

    public static void h(C0291a c0291a, g4.h hVar, n4.c cVar) {
        g4.e eVar = new g4.e();
        hVar.i(25, 0);
        hVar.a(c0291a.f16438e, 180, C0291a.a(cVar), n4.b.b(t.class));
        hVar.d(199, eVar);
        hVar.i(25, 0);
        hVar.i(25, 1);
        String str = f16430c;
        StringBuilder a10 = android.support.v4.media.d.a("()");
        a10.append(n4.b.b(h4.k.class));
        hVar.g(str, 182, "getConfig", a10.toString());
        hVar.f(g4.i.b(n4.b.b(cVar.f21951e)));
        String f10 = n4.b.f(h4.k.class);
        StringBuilder a11 = android.support.v4.media.d.a("(Ljava/lang/reflect/Type;)");
        a11.append(n4.b.b(t.class));
        hVar.g(f10, 182, "getDeserializer", a11.toString());
        hVar.a(c0291a.f16438e, 181, C0291a.a(cVar), n4.b.b(t.class));
        hVar.e(eVar);
        hVar.i(25, 0);
        hVar.a(c0291a.f16438e, 180, C0291a.a(cVar), n4.b.b(t.class));
    }

    public static void i(g4.h hVar, Class cls, int i10, boolean z10) {
        Class cls2;
        String f10;
        if (!cls.isAssignableFrom(ArrayList.class) || z10) {
            if (!cls.isAssignableFrom(LinkedList.class) || z10) {
                if (!cls.isAssignableFrom(HashSet.class)) {
                    if (cls.isAssignableFrom(TreeSet.class)) {
                        hVar.h(187, n4.b.f(TreeSet.class));
                        hVar.b(89);
                        cls2 = TreeSet.class;
                    } else if (cls.isAssignableFrom(LinkedHashSet.class)) {
                        hVar.h(187, n4.b.f(LinkedHashSet.class));
                        hVar.b(89);
                        cls2 = LinkedHashSet.class;
                    } else if (!z10) {
                        hVar.i(25, 0);
                        hVar.f(Integer.valueOf(i10));
                        hVar.g(n4.b.f(o.class), 182, "getFieldType", "(I)Ljava/lang/reflect/Type;");
                        hVar.g(n4.b.f(n4.n.class), 184, "createCollection", "(Ljava/lang/reflect/Type;)Ljava/util/Collection;");
                        hVar.h(192, n4.b.f(cls));
                    }
                }
                hVar.h(187, n4.b.f(HashSet.class));
                hVar.b(89);
                cls2 = HashSet.class;
            } else {
                hVar.h(187, n4.b.f(LinkedList.class));
                hVar.b(89);
                cls2 = LinkedList.class;
            }
            f10 = n4.b.f(cls2);
        } else {
            f10 = "java/util/ArrayList";
            hVar.h(187, "java/util/ArrayList");
            hVar.b(89);
        }
        hVar.g(f10, 183, "<init>", "()V");
        hVar.h(192, n4.b.f(cls));
    }

    public static void j(int i10, g4.h hVar, C0291a c0291a) {
        int i11;
        g4.e eVar = new g4.e();
        g4.e eVar2 = new g4.e();
        hVar.i(25, c0291a.d("lexer"));
        String str = f16431d;
        hVar.g(str, 182, "getCurrent", "()C");
        if (i10 == 12) {
            i11 = 123;
        } else if (i10 != 14) {
            throw new IllegalStateException();
        } else {
            i11 = 91;
        }
        hVar.i(16, i11);
        hVar.d(160, eVar);
        hVar.i(25, c0291a.d("lexer"));
        hVar.g(str, 182, "next", "()C");
        hVar.b(87);
        hVar.i(25, c0291a.d("lexer"));
        hVar.f(Integer.valueOf(i10));
        hVar.g(str, 182, "setToken", "(I)V");
        hVar.d(167, eVar2);
        hVar.e(eVar);
        hVar.i(25, c0291a.d("lexer"));
        hVar.f(Integer.valueOf(i10));
        hVar.g(str, 182, "nextToken", "(I)V");
        hVar.e(eVar2);
    }

    public static void k(C0291a c0291a, g4.h hVar) {
        g4.e eVar = new g4.e();
        g4.e eVar2 = new g4.e();
        g4.e eVar3 = new g4.e();
        g4.e eVar4 = new g4.e();
        g4.e eVar5 = new g4.e();
        hVar.i(25, c0291a.d("lexer"));
        String str = f16431d;
        hVar.g(str, 182, "getCurrent", "()C");
        hVar.b(89);
        hVar.i(54, c0291a.d("ch"));
        hVar.i(16, 44);
        hVar.d(160, eVar2);
        hVar.i(25, c0291a.d("lexer"));
        hVar.g(str, 182, "next", "()C");
        hVar.b(87);
        hVar.i(25, c0291a.d("lexer"));
        hVar.f(16);
        hVar.g(str, 182, "setToken", "(I)V");
        hVar.d(167, eVar5);
        hVar.e(eVar2);
        hVar.i(21, c0291a.d("ch"));
        hVar.i(16, 125);
        hVar.d(160, eVar3);
        hVar.i(25, c0291a.d("lexer"));
        hVar.g(str, 182, "next", "()C");
        hVar.b(87);
        hVar.i(25, c0291a.d("lexer"));
        hVar.f(13);
        hVar.g(str, 182, "setToken", "(I)V");
        hVar.d(167, eVar5);
        hVar.e(eVar3);
        hVar.i(21, c0291a.d("ch"));
        hVar.i(16, 93);
        hVar.d(160, eVar4);
        hVar.i(25, c0291a.d("lexer"));
        hVar.g(str, 182, "next", "()C");
        hVar.b(87);
        hVar.i(25, c0291a.d("lexer"));
        hVar.f(15);
        hVar.g(str, 182, "setToken", "(I)V");
        hVar.d(167, eVar5);
        hVar.e(eVar4);
        hVar.i(21, c0291a.d("ch"));
        hVar.i(16, 26);
        hVar.d(160, eVar);
        hVar.i(25, c0291a.d("lexer"));
        hVar.f(20);
        hVar.g(str, 182, "setToken", "(I)V");
        hVar.d(167, eVar5);
        hVar.e(eVar);
        hVar.i(25, c0291a.d("lexer"));
        hVar.g(str, 182, "nextToken", "()V");
        hVar.e(eVar5);
    }

    public static void l(int i10, g4.h hVar, C0291a c0291a) {
        StringBuilder a10 = android.support.v4.media.d.a("_asm_flag_");
        a10.append(i10 / 32);
        String sb2 = a10.toString();
        hVar.i(21, c0291a.d(sb2));
        hVar.f(Integer.valueOf(1 << i10));
        hVar.b(128);
        hVar.i(54, c0291a.d(sb2));
    }

    public static void n(C0291a c0291a, g4.h hVar) {
        hVar.i(25, 1);
        hVar.a(f16430c, 180, "lexer", n4.b.b(h4.c.class));
        hVar.h(192, f16431d);
        hVar.i(58, c0291a.d("lexer"));
    }

    /* JADX WARN: Removed duplicated region for block: B:414:0x0ac2  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0b37 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final i4.t m(h4.k r37, n4.i r38) {
        /*
            Method dump skipped, instructions count: 3380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.a.m(h4.k, n4.i):i4.t");
    }
}
