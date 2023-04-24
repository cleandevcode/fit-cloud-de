package j4;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c */
    public static final String f17281c = n4.b.f(i0.class);

    /* renamed from: d */
    public static final String f17282d;

    /* renamed from: e */
    public static final String f17283e;

    /* renamed from: f */
    public static final String f17284f;

    /* renamed from: g */
    public static final String f17285g;

    /* renamed from: h */
    public static final String f17286h;

    /* renamed from: i */
    public static final String f17287i;

    /* renamed from: j */
    public static final String f17288j;

    /* renamed from: a */
    public final n4.a f17289a = new n4.a();

    /* renamed from: b */
    public final AtomicLong f17290b = new AtomicLong();

    /* renamed from: j4.a$a */
    /* loaded from: classes.dex */
    public static class C0304a {

        /* renamed from: a */
        public final n4.c[] f17291a;

        /* renamed from: b */
        public final String f17292b;

        /* renamed from: c */
        public final z0 f17293c;

        /* renamed from: d */
        public final boolean f17294d;

        /* renamed from: e */
        public HashMap f17295e = new HashMap();

        /* renamed from: f */
        public int f17296f = 9;

        /* renamed from: g */
        public final boolean f17297g;

        public C0304a(n4.c[] cVarArr, z0 z0Var, String str, boolean z10, boolean z11) {
            this.f17291a = cVarArr;
            this.f17292b = str;
            this.f17293c = z0Var;
            this.f17294d = z10;
            this.f17297g = z11 || z0Var.f17480a.isEnum();
        }

        public final int a(String str) {
            if (((Integer) this.f17295e.get(str)) == null) {
                HashMap hashMap = this.f17295e;
                int i10 = this.f17296f;
                this.f17296f = i10 + 1;
                hashMap.put(str, Integer.valueOf(i10));
            }
            return ((Integer) this.f17295e.get(str)).intValue();
        }

        public final int b(String str) {
            if (((Integer) this.f17295e.get(str)) == null) {
                this.f17295e.put(str, Integer.valueOf(this.f17296f));
                this.f17296f += 2;
            }
            return ((Integer) this.f17295e.get(str)).intValue();
        }
    }

    static {
        String f10 = n4.b.f(t0.class);
        f17282d = f10;
        f17283e = android.support.v4.media.a.a("L", f10, ";");
        String f11 = n4.b.f(d1.class);
        f17284f = f11;
        f17285g = android.support.v4.media.a.a("L", f11, ";");
        f17286h = n4.b.f(j0.class);
        n4.b.f(j0.class);
        f17287i = n4.b.b(y0.class);
        f17288j = n4.b.b(c1.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:247:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0359 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(g4.h r28, n4.c r29, j4.a.C0304a r30, g4.e r31) {
        /*
            Method dump skipped, instructions count: 1202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.a.a(g4.h, n4.c, j4.a$a, g4.e):void");
    }

    public static void b(g4.h hVar, C0304a c0304a, n4.c cVar) {
        Method method = cVar.f21948b;
        hVar.i(25, c0304a.a("entity"));
        if (method != null) {
            Class<?> declaringClass = method.getDeclaringClass();
            hVar.g(n4.b.f(declaringClass), declaringClass.isInterface() ? 185 : 182, method.getName(), n4.b.c(method));
            if (method.getReturnType().equals(cVar.f21951e)) {
                return;
            }
        } else {
            Field field = cVar.f21949c;
            hVar.a(n4.b.f(cVar.f21953g), 180, field.getName(), n4.b.b(field.getType()));
            if (field.getType().equals(cVar.f21951e)) {
                return;
            }
        }
        hVar.h(192, n4.b.f(cVar.f21951e));
    }

    public static void c(g4.h hVar, C0304a c0304a, n4.c cVar) {
        g4.e eVar = new g4.e();
        hVar.i(25, 0);
        String str = c0304a.f17292b;
        String b10 = androidx.activity.e.b(new StringBuilder(), cVar.f21947a, "_asm_ser_");
        String str2 = f17283e;
        hVar.a(str, 180, b10, str2);
        hVar.d(199, eVar);
        hVar.i(25, 0);
        hVar.i(25, 1);
        hVar.f(g4.i.b(n4.b.b(cVar.f21951e)));
        hVar.g(f17281c, 182, "getObjectWriter", a.b.b("(Ljava/lang/Class;)", str2));
        hVar.a(c0304a.f17292b, 181, androidx.activity.e.b(new StringBuilder(), cVar.f21947a, "_asm_ser_"), str2);
        hVar.e(eVar);
        hVar.i(25, 0);
        hVar.a(c0304a.f17292b, 180, androidx.activity.e.b(new StringBuilder(), cVar.f21947a, "_asm_ser_"), str2);
    }

    public static void d(g4.h hVar, C0304a c0304a, n4.c cVar, Class cls) {
        g4.e eVar = new g4.e();
        hVar.i(25, 0);
        String str = c0304a.f17292b;
        String b10 = androidx.activity.e.b(new StringBuilder(), cVar.f21947a, "_asm_list_item_ser_");
        String str2 = f17283e;
        hVar.a(str, 180, b10, str2);
        hVar.d(199, eVar);
        hVar.i(25, 0);
        hVar.i(25, 1);
        hVar.f(g4.i.b(n4.b.b(cls)));
        hVar.g(f17281c, 182, "getObjectWriter", a.b.b("(Ljava/lang/Class;)", str2));
        hVar.a(c0304a.f17292b, 181, androidx.activity.e.b(new StringBuilder(), cVar.f21947a, "_asm_list_item_ser_"), str2);
        hVar.e(eVar);
        hVar.i(25, 0);
        hVar.a(c0304a.f17292b, 180, androidx.activity.e.b(new StringBuilder(), cVar.f21947a, "_asm_list_item_ser_"), str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(g4.h r13, j4.a.C0304a r14, n4.c r15) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.a.e(g4.h, j4.a$a, n4.c):void");
    }

    public static void f(g4.h hVar, n4.c cVar, C0304a c0304a, int i10, char c10) {
        g4.e eVar = new g4.e();
        g(hVar, cVar, c0304a, eVar);
        b(hVar, c0304a, cVar);
        hVar.i(54, i10);
        a(hVar, cVar, c0304a, eVar);
        hVar.i(25, c0304a.a("out"));
        hVar.i(21, c0304a.a("seperator"));
        hVar.i(25, 6);
        hVar.i(21, i10);
        String str = f17284f;
        hVar.g(str, 182, "writeFieldValue", "(CLjava/lang/String;" + c10 + ")V");
        h(hVar, c0304a);
        hVar.e(eVar);
    }

    public static void g(g4.h hVar, n4.c cVar, C0304a c0304a, g4.e eVar) {
        if (!c0304a.f17294d) {
            hVar.i(25, 0);
            hVar.i(25, 1);
            hVar.i(25, 2);
            hVar.i(25, 6);
            String str = f17286h;
            StringBuilder a10 = android.support.v4.media.d.a("(L");
            String str2 = f17281c;
            hVar.g(str, 182, "applyName", androidx.activity.e.b(a10, str2, ";Ljava/lang/Object;Ljava/lang/String;)Z"));
            hVar.d(153, eVar);
            hVar.i(25, 0);
            hVar.i(25, 1);
            hVar.f(cVar.f21957k);
            hVar.g(str, 182, "applyLabel", "(L" + str2 + ";Ljava/lang/String;)Z");
            hVar.d(153, eVar);
        }
        if (cVar.f21949c == null) {
            hVar.i(25, c0304a.a("out"));
            hVar.f(Integer.valueOf(e1.IgnoreNonFieldGetter.f17396a));
            hVar.g(f17284f, 182, "isEnabled", "(I)Z");
            hVar.d(154, eVar);
        }
    }

    public static void h(g4.h hVar, C0304a c0304a) {
        hVar.i(16, 44);
        hVar.i(54, c0304a.a("seperator"));
    }

    public static void i(g4.h hVar, C0304a c0304a) {
        String str;
        String str2;
        String str3;
        boolean z10 = c0304a.f17294d;
        hVar.i(25, c0304a.a("out"));
        hVar.i(25, 6);
        if (z10) {
            str = f17284f;
            str2 = "writeFieldNameDirect";
            str3 = "(Ljava/lang/String;)V";
        } else {
            hVar.b(3);
            str = f17284f;
            str2 = "writeFieldName";
            str3 = "(Ljava/lang/String;Z)V";
        }
        hVar.g(str, 182, str2, str3);
    }

    public static void j(g4.h hVar, n4.c cVar, C0304a c0304a, g4.e eVar) {
        Class<?> cls;
        String str;
        g4.e eVar2;
        g4.e eVar3;
        int i10;
        String str2;
        String str3;
        boolean z10;
        boolean z11;
        String str4;
        String str5 = cVar.f21963q;
        Class<?> cls2 = cVar.f21951e;
        g4.e eVar4 = new g4.e();
        if (c0304a.f17294d) {
            hVar.i(25, c0304a.a("object"));
        } else {
            hVar.i(25, 8);
        }
        hVar.b(89);
        hVar.i(58, c0304a.a("object"));
        hVar.d(199, eVar4);
        e(hVar, c0304a, cVar);
        hVar.d(167, eVar);
        hVar.e(eVar4);
        hVar.i(25, c0304a.a("out"));
        hVar.i(21, c0304a.a("seperator"));
        hVar.g(f17284f, 182, "write", "(I)V");
        i(hVar, c0304a);
        g4.e eVar5 = new g4.e();
        g4.e eVar6 = new g4.e();
        if (!Modifier.isPublic(cls2.getModifiers()) || h4.k.g(cls2)) {
            cls = String.class;
            str = str5;
            eVar2 = eVar5;
            eVar3 = eVar6;
        } else {
            hVar.i(25, c0304a.a("object"));
            hVar.g("java/lang/Object", 182, "getClass", "()Ljava/lang/Class;");
            hVar.f(g4.i.b(n4.b.b(cls2)));
            hVar.d(166, eVar6);
            c(hVar, c0304a, cVar);
            hVar.i(58, c0304a.a("fied_ser"));
            g4.e eVar7 = new g4.e();
            g4.e eVar8 = new g4.e();
            hVar.i(25, c0304a.a("fied_ser"));
            String str6 = f17286h;
            hVar.h(193, str6);
            hVar.d(153, eVar7);
            int i11 = cVar.f21955i;
            cls = String.class;
            if ((e1.DisableCircularReferenceDetect.f17396a & i11) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            str = str5;
            if ((e1.BeanToArray.f17396a & i11) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z10 && (!c0304a.f17297g || !c0304a.f17294d)) {
                if (!z11) {
                    str4 = "write";
                } else {
                    str4 = "writeAsArray";
                }
            } else if (z11) {
                str4 = "writeAsArrayNonContext";
            } else {
                str4 = "writeDirectNonContext";
            }
            hVar.i(25, c0304a.a("fied_ser"));
            hVar.h(192, str6);
            hVar.i(25, 1);
            hVar.i(25, c0304a.a("object"));
            hVar.i(25, 6);
            hVar.i(25, 0);
            eVar3 = eVar6;
            hVar.a(c0304a.f17292b, 180, androidx.activity.e.b(new StringBuilder(), cVar.f21947a, "_asm_fieldType"), "Ljava/lang/reflect/Type;");
            hVar.f(Integer.valueOf(cVar.f21955i));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("(L");
            String str7 = f17281c;
            hVar.g(str6, 182, str4, androidx.activity.e.b(sb2, str7, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"));
            hVar.d(167, eVar8);
            hVar.e(eVar7);
            hVar.i(25, c0304a.a("fied_ser"));
            hVar.i(25, 1);
            hVar.i(25, c0304a.a("object"));
            hVar.i(25, 6);
            hVar.i(25, 0);
            hVar.a(c0304a.f17292b, 180, androidx.activity.e.b(new StringBuilder(), cVar.f21947a, "_asm_fieldType"), "Ljava/lang/reflect/Type;");
            hVar.f(Integer.valueOf(cVar.f21955i));
            hVar.g(f17282d, 185, "write", android.support.v4.media.a.a("(L", str7, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"));
            hVar.e(eVar8);
            eVar2 = eVar5;
            hVar.d(167, eVar2);
        }
        hVar.e(eVar3);
        hVar.i(25, 1);
        if (c0304a.f17294d) {
            i10 = c0304a.a("object");
        } else {
            i10 = 8;
        }
        hVar.i(25, i10);
        if (str != null) {
            hVar.f(str);
            hVar.g(f17281c, 182, "writeWithFormat", "(Ljava/lang/Object;Ljava/lang/String;)V");
        } else {
            hVar.i(25, 6);
            Type type = cVar.f21952f;
            if ((type instanceof Class) && ((Class) type).isPrimitive()) {
                str2 = f17281c;
                str3 = "(Ljava/lang/Object;Ljava/lang/Object;)V";
            } else {
                Class<?> cls3 = cls;
                if (cVar.f21951e == cls3) {
                    hVar.f(g4.i.b(n4.b.b(cls3)));
                } else {
                    hVar.i(25, 0);
                    hVar.a(c0304a.f17292b, 180, androidx.activity.e.b(new StringBuilder(), cVar.f21947a, "_asm_fieldType"), "Ljava/lang/reflect/Type;");
                }
                hVar.f(Integer.valueOf(cVar.f21955i));
                str2 = f17281c;
                str3 = "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V";
            }
            hVar.g(str2, 182, "writeWithFieldName", str3);
        }
        hVar.e(eVar2);
        h(hVar, c0304a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x01c0, code lost:
        if (r13 == java.lang.Object.class) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void k(g4.h r31, n4.c[] r32, j4.a.C0304a r33) {
        /*
            Method dump skipped, instructions count: 2010
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.a.k(g4.h, n4.c[], j4.a$a):void");
    }

    public static void l(g4.h hVar, n4.c[] cVarArr, C0304a c0304a) {
        String str;
        g4.e eVar;
        String str2;
        String str3;
        int i10;
        int i11;
        int i12;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        g4.e eVar2;
        g4.e eVar3;
        String str13;
        g4.e eVar4;
        g4.e eVar5;
        String str14;
        g4.e eVar6;
        g4.e eVar7;
        n4.c cVar;
        String str15;
        String str16;
        String str17;
        int i13;
        int i14;
        int i15;
        n4.c cVar2;
        g4.e eVar8;
        String str18;
        String str19;
        int a10;
        char c10;
        boolean z10;
        int i16;
        int i17;
        n4.c[] cVarArr2 = cVarArr;
        g4.e eVar9 = new g4.e();
        int length = cVarArr2.length;
        String str20 = "write";
        String str21 = "(L";
        String str22 = "out";
        if (!c0304a.f17294d) {
            g4.e eVar10 = new g4.e();
            g4.e eVar11 = new g4.e();
            hVar.i(25, c0304a.a("out"));
            hVar.f(Integer.valueOf(e1.PrettyFormat.f17396a));
            hVar.g(f17284f, 182, "isEnabled", "(I)Z");
            hVar.d(154, eVar11);
            int length2 = cVarArr2.length;
            int i18 = 0;
            while (true) {
                if (i18 >= length2) {
                    z10 = false;
                    break;
                } else if (cVarArr2[i18].f21948b != null) {
                    z10 = true;
                    break;
                } else {
                    i18++;
                }
            }
            if (z10) {
                i16 = 25;
                hVar.i(25, c0304a.a("out"));
                hVar.f(Integer.valueOf(e1.IgnoreErrorGetter.f17396a));
                hVar.g(f17284f, 182, "isEnabled", "(I)Z");
                i17 = 153;
            } else {
                i16 = 25;
                i17 = 167;
            }
            hVar.d(i17, eVar10);
            hVar.e(eVar11);
            hVar.i(i16, 0);
            hVar.i(i16, 1);
            hVar.i(i16, 2);
            hVar.i(i16, 3);
            hVar.i(i16, 4);
            hVar.i(21, 5);
            hVar.g(f17286h, 183, "write", androidx.activity.e.b(android.support.v4.media.d.a("(L"), f17281c, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"));
            hVar.b(177);
            hVar.e(eVar10);
        }
        if (!c0304a.f17297g) {
            g4.e eVar12 = new g4.e();
            hVar.i(25, 0);
            hVar.i(25, 1);
            hVar.i(25, 2);
            hVar.i(21, 5);
            hVar.g(f17286h, 182, "writeReference", androidx.activity.e.b(android.support.v4.media.d.a("(L"), f17281c, ";Ljava/lang/Object;I)Z"));
            hVar.d(153, eVar12);
            hVar.b(177);
            hVar.e(eVar12);
        }
        if (c0304a.f17294d) {
            str = c0304a.f17297g ? "writeAsArrayNonContext" : "writeAsArray";
        } else {
            str = "writeAsArrayNormal";
        }
        int i19 = c0304a.f17293c.f17485f;
        e1 e1Var = e1.BeanToArray;
        if ((i19 & e1Var.f17396a) == 0) {
            g4.e eVar13 = new g4.e();
            hVar.i(25, c0304a.a("out"));
            hVar.f(Integer.valueOf(e1Var.f17396a));
            hVar.g(f17284f, 182, "isEnabled", "(I)Z");
            hVar.d(153, eVar13);
            hVar.i(25, 0);
            hVar.i(25, 1);
            hVar.i(25, 2);
            hVar.i(25, 3);
            hVar.i(25, 4);
            hVar.i(21, 5);
            hVar.g(c0304a.f17292b, 182, str, androidx.activity.e.b(android.support.v4.media.d.a("(L"), f17281c, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"));
            hVar.b(177);
            hVar.e(eVar13);
        } else {
            hVar.i(25, 0);
            hVar.i(25, 1);
            hVar.i(25, 2);
            hVar.i(25, 3);
            hVar.i(25, 4);
            hVar.i(21, 5);
            hVar.g(c0304a.f17292b, 182, str, androidx.activity.e.b(android.support.v4.media.d.a("(L"), f17281c, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"));
            hVar.b(177);
        }
        String str23 = "(";
        if (!c0304a.f17297g) {
            hVar.i(25, 1);
            String str24 = f17281c;
            StringBuilder a11 = android.support.v4.media.d.a("()");
            String str25 = f17287i;
            a11.append(str25);
            hVar.g(str24, 182, "getContext", a11.toString());
            hVar.i(58, c0304a.a("parent"));
            hVar.i(25, 1);
            hVar.i(25, c0304a.a("parent"));
            hVar.i(25, 2);
            hVar.i(25, 3);
            hVar.f(Integer.valueOf(c0304a.f17293c.f17485f));
            hVar.g(str24, 182, "setContext", "(" + str25 + "Ljava/lang/Object;Ljava/lang/Object;I)V");
        }
        boolean z11 = (c0304a.f17293c.f17485f & e1.WriteClassName.f17396a) != 0;
        String str26 = "(I)V";
        if (!z11 && c0304a.f17294d) {
            hVar.i(16, 123);
            eVar = eVar9;
            str2 = "parent";
            str3 = ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V";
        } else {
            g4.e eVar14 = new g4.e();
            g4.e eVar15 = new g4.e();
            g4.e eVar16 = new g4.e();
            if (z11) {
                eVar = eVar9;
                str2 = "parent";
                str3 = ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V";
                i10 = 182;
            } else {
                str2 = "parent";
                hVar.i(25, 1);
                hVar.i(25, 4);
                hVar.i(25, 2);
                eVar = eVar9;
                str3 = ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V";
                i10 = 182;
                hVar.g(f17281c, 182, "isWriteClassName", "(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z");
                hVar.d(153, eVar15);
            }
            hVar.i(25, 4);
            hVar.i(25, 2);
            hVar.g("java/lang/Object", i10, "getClass", "()Ljava/lang/Class;");
            hVar.d(165, eVar15);
            hVar.e(eVar16);
            hVar.i(25, c0304a.a("out"));
            hVar.i(16, 123);
            hVar.g(f17284f, i10, "write", "(I)V");
            hVar.i(25, 0);
            hVar.i(25, 1);
            String str27 = c0304a.f17293c.f17482c;
            if (str27 != null) {
                hVar.f(str27);
            } else {
                hVar.b(1);
            }
            hVar.i(25, 2);
            hVar.g(f17286h, 182, "writeClassName", androidx.activity.e.b(android.support.v4.media.d.a("(L"), f17281c, ";Ljava/lang/String;Ljava/lang/Object;)V"));
            hVar.i(16, 44);
            hVar.d(167, eVar14);
            hVar.e(eVar15);
            hVar.i(16, 123);
            hVar.e(eVar14);
        }
        String str28 = "seperator";
        hVar.i(54, c0304a.a("seperator"));
        if (!c0304a.f17294d) {
            hVar.i(25, 0);
            hVar.i(25, 1);
            hVar.i(25, 2);
            hVar.i(21, c0304a.a("seperator"));
            hVar.g(f17286h, 182, "writeBefore", androidx.activity.e.b(android.support.v4.media.d.a("(L"), f17281c, ";Ljava/lang/Object;C)C"));
            hVar.i(54, c0304a.a("seperator"));
        }
        if (!c0304a.f17294d) {
            hVar.i(25, c0304a.a("out"));
            hVar.g(f17284f, 182, "isNotWriteDefaultValue", "()Z");
            hVar.i(54, c0304a.a("notWriteDefaultValue"));
            hVar.i(25, 1);
            hVar.i(25, 0);
            String str29 = f17281c;
            StringBuilder a12 = android.support.v4.media.d.a("(");
            String str30 = f17288j;
            hVar.g(str29, 182, "checkValue", androidx.activity.e.b(a12, str30, ")Z"));
            hVar.i(54, c0304a.a("checkValue"));
            hVar.i(25, 1);
            hVar.i(25, 0);
            hVar.g(str29, 182, "hasNameFilters", "(" + str30 + ")Z");
            hVar.i(54, c0304a.a("hasNameFilters"));
        }
        int i20 = 0;
        while (i20 < length) {
            n4.c cVar3 = cVarArr2[i20];
            Class<?> cls = cVar3.f21951e;
            hVar.f(cVar3.f21947a);
            hVar.i(58, 6);
            if (cls == Byte.TYPE || cls == Short.TYPE || cls == Integer.TYPE) {
                i11 = length;
                i12 = i20;
                str4 = str23;
                str5 = str26;
                str6 = str21;
                str7 = str22;
                str8 = str28;
                str9 = str3;
                f(hVar, cVar3, c0304a, c0304a.a(cls.getName()), 'I');
            } else {
                String str31 = "writeFieldValue";
                if (cls == Long.TYPE) {
                    g4.e eVar17 = new g4.e();
                    g(hVar, cVar3, c0304a, eVar17);
                    b(hVar, c0304a, cVar3);
                    hVar.i(55, c0304a.b("long"));
                    a(hVar, cVar3, c0304a, eVar17);
                    hVar.i(25, c0304a.a(str22));
                    hVar.i(21, c0304a.a(str28));
                    hVar.i(25, 6);
                    hVar.i(22, c0304a.b("long"));
                    hVar.g(f17284f, 182, "writeFieldValue", "(CLjava/lang/String;J)V");
                    h(hVar, c0304a);
                    hVar.e(eVar17);
                } else if (cls == Float.TYPE) {
                    g4.e eVar18 = new g4.e();
                    g(hVar, cVar3, c0304a, eVar18);
                    b(hVar, c0304a, cVar3);
                    hVar.i(56, c0304a.a("float"));
                    a(hVar, cVar3, c0304a, eVar18);
                    hVar.i(25, c0304a.a(str22));
                    hVar.i(21, c0304a.a(str28));
                    hVar.i(25, 6);
                    hVar.i(23, c0304a.a("float"));
                    hVar.g(f17284f, 182, "writeFieldValue", "(CLjava/lang/String;F)V");
                    h(hVar, c0304a);
                    hVar.e(eVar18);
                } else if (cls == Double.TYPE) {
                    g4.e eVar19 = new g4.e();
                    g(hVar, cVar3, c0304a, eVar19);
                    b(hVar, c0304a, cVar3);
                    hVar.i(57, c0304a.b("double"));
                    a(hVar, cVar3, c0304a, eVar19);
                    hVar.i(25, c0304a.a(str22));
                    hVar.i(21, c0304a.a(str28));
                    hVar.i(25, 6);
                    hVar.i(24, c0304a.b("double"));
                    hVar.g(f17284f, 182, "writeFieldValue", "(CLjava/lang/String;D)V");
                    h(hVar, c0304a);
                    hVar.e(eVar19);
                } else {
                    if (cls == Boolean.TYPE) {
                        a10 = c0304a.a("boolean");
                        c10 = 'Z';
                    } else if (cls == Character.TYPE) {
                        a10 = c0304a.a("char");
                        c10 = 'C';
                    } else {
                        if (cls == String.class) {
                            g4.e eVar20 = new g4.e();
                            if (cVar3.f21947a.equals(c0304a.f17293c.f17482c)) {
                                hVar.i(25, 1);
                                hVar.i(25, 4);
                                hVar.i(25, 2);
                                i11 = length;
                                hVar.g(f17281c, 182, "isWriteClassName", "(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z");
                                hVar.d(154, eVar20);
                            } else {
                                i11 = length;
                            }
                            g(hVar, cVar3, c0304a, eVar20);
                            b(hVar, c0304a, cVar3);
                            hVar.i(58, c0304a.a("string"));
                            a(hVar, cVar3, c0304a, eVar20);
                            g4.e eVar21 = new g4.e();
                            g4.e eVar22 = new g4.e();
                            str4 = str23;
                            hVar.i(25, c0304a.a("string"));
                            hVar.d(199, eVar21);
                            e(hVar, c0304a, cVar3);
                            hVar.d(167, eVar22);
                            hVar.e(eVar21);
                            if ("trim".equals(cVar3.f21963q)) {
                                hVar.i(25, c0304a.a("string"));
                                hVar.g("java/lang/String", 182, "trim", "()Ljava/lang/String;");
                                hVar.i(58, c0304a.a("string"));
                            }
                            if (c0304a.f17294d) {
                                hVar.i(25, c0304a.a(str22));
                                hVar.i(21, c0304a.a(str28));
                                hVar.i(25, 6);
                                hVar.i(25, c0304a.a("string"));
                                str19 = f17284f;
                                str31 = "writeFieldValueStringWithDoubleQuoteCheck";
                            } else {
                                hVar.i(25, c0304a.a(str22));
                                hVar.i(21, c0304a.a(str28));
                                hVar.i(25, 6);
                                hVar.i(25, c0304a.a("string"));
                                str19 = f17284f;
                            }
                            hVar.g(str19, 182, str31, "(CLjava/lang/String;Ljava/lang/String;)V");
                            h(hVar, c0304a);
                            hVar.e(eVar22);
                            hVar.e(eVar20);
                        } else {
                            i11 = length;
                            str4 = str23;
                            if (cls == BigDecimal.class) {
                                g4.e eVar23 = new g4.e();
                                g(hVar, cVar3, c0304a, eVar23);
                                b(hVar, c0304a, cVar3);
                                hVar.i(58, c0304a.a("decimal"));
                                a(hVar, cVar3, c0304a, eVar23);
                                g4.e eVar24 = new g4.e();
                                g4.e eVar25 = new g4.e();
                                g4.e eVar26 = new g4.e();
                                hVar.e(eVar24);
                                hVar.i(25, c0304a.a("decimal"));
                                hVar.d(199, eVar25);
                                e(hVar, c0304a, cVar3);
                                hVar.d(167, eVar26);
                                hVar.e(eVar25);
                                hVar.i(25, c0304a.a(str22));
                                hVar.i(21, c0304a.a(str28));
                                hVar.i(25, 6);
                                hVar.i(25, c0304a.a("decimal"));
                                hVar.g(f17284f, 182, "writeFieldValue", "(CLjava/lang/String;Ljava/math/BigDecimal;)V");
                                h(hVar, c0304a);
                                hVar.d(167, eVar26);
                                hVar.e(eVar26);
                                hVar.e(eVar23);
                            } else if (List.class.isAssignableFrom(cls)) {
                                Type F = n4.n.F(cVar3.f21952f);
                                Class cls2 = null;
                                Class cls3 = F instanceof Class ? (Class) F : null;
                                if (cls3 != Object.class && cls3 != Serializable.class) {
                                    cls2 = cls3;
                                }
                                g4.e eVar27 = new g4.e();
                                g4.e eVar28 = new g4.e();
                                g4.e eVar29 = new g4.e();
                                g(hVar, cVar3, c0304a, eVar27);
                                b(hVar, c0304a, cVar3);
                                hVar.h(192, "java/util/List");
                                i12 = i20;
                                str6 = str21;
                                hVar.i(58, c0304a.a("list"));
                                a(hVar, cVar3, c0304a, eVar27);
                                hVar.i(25, c0304a.a("list"));
                                hVar.d(199, eVar28);
                                e(hVar, c0304a, cVar3);
                                hVar.d(167, eVar29);
                                hVar.e(eVar28);
                                hVar.i(25, c0304a.a(str22));
                                hVar.i(21, c0304a.a(str28));
                                String str32 = f17284f;
                                hVar.g(str32, 182, str20, str26);
                                i(hVar, c0304a);
                                hVar.i(25, c0304a.a("list"));
                                String str33 = str28;
                                hVar.g("java/util/List", 185, "size", "()I");
                                hVar.i(54, c0304a.a("size"));
                                g4.e eVar30 = new g4.e();
                                g4.e eVar31 = new g4.e();
                                hVar.i(21, c0304a.a("size"));
                                hVar.b(3);
                                hVar.d(160, eVar30);
                                hVar.i(25, c0304a.a(str22));
                                hVar.f("[]");
                                hVar.g(str32, 182, str20, "(Ljava/lang/String;)V");
                                hVar.d(167, eVar31);
                                hVar.e(eVar30);
                                if (c0304a.f17297g) {
                                    eVar2 = eVar31;
                                } else {
                                    hVar.i(25, 1);
                                    hVar.i(25, c0304a.a("list"));
                                    hVar.i(25, 6);
                                    eVar2 = eVar31;
                                    hVar.g(f17281c, 182, "setContext", "(Ljava/lang/Object;Ljava/lang/Object;)V");
                                }
                                if (F == String.class && c0304a.f17294d) {
                                    hVar.i(25, c0304a.a(str22));
                                    hVar.i(25, c0304a.a("list"));
                                    hVar.g(str32, 182, str20, "(Ljava/util/List;)V");
                                    i15 = 182;
                                    str5 = str26;
                                    str7 = str22;
                                    str9 = str3;
                                    i13 = 1;
                                    i14 = 25;
                                } else {
                                    hVar.i(25, c0304a.a(str22));
                                    hVar.i(16, 91);
                                    hVar.g(str32, 182, str20, str26);
                                    g4.e eVar32 = new g4.e();
                                    g4.e eVar33 = new g4.e();
                                    g4.e eVar34 = new g4.e();
                                    hVar.b(3);
                                    hVar.i(54, c0304a.a("i"));
                                    hVar.e(eVar32);
                                    hVar.i(21, c0304a.a("i"));
                                    hVar.i(21, c0304a.a("size"));
                                    hVar.d(162, eVar34);
                                    hVar.i(21, c0304a.a("i"));
                                    hVar.d(153, eVar33);
                                    hVar.i(25, c0304a.a(str22));
                                    hVar.i(16, 44);
                                    hVar.g(str32, 182, str20, str26);
                                    hVar.e(eVar33);
                                    hVar.i(25, c0304a.a("list"));
                                    hVar.i(21, c0304a.a("i"));
                                    hVar.g("java/util/List", 185, "get", "(I)Ljava/lang/Object;");
                                    hVar.i(58, c0304a.a("list_item"));
                                    g4.e eVar35 = new g4.e();
                                    g4.e eVar36 = new g4.e();
                                    hVar.i(25, c0304a.a("list_item"));
                                    hVar.d(199, eVar36);
                                    hVar.i(25, c0304a.a(str22));
                                    hVar.g(str32, 182, "writeNull", "()V");
                                    hVar.d(167, eVar35);
                                    hVar.e(eVar36);
                                    g4.e eVar37 = new g4.e();
                                    g4.e eVar38 = new g4.e();
                                    if (cls2 == null || !Modifier.isPublic(cls2.getModifiers())) {
                                        eVar3 = eVar32;
                                        str13 = str26;
                                        eVar4 = eVar34;
                                        eVar5 = eVar38;
                                        str14 = str22;
                                        str9 = str3;
                                        eVar6 = eVar37;
                                        eVar7 = eVar35;
                                        cVar = cVar3;
                                    } else {
                                        str13 = str26;
                                        str14 = str22;
                                        hVar.i(25, c0304a.a("list_item"));
                                        eVar4 = eVar34;
                                        eVar3 = eVar32;
                                        hVar.g("java/lang/Object", 182, "getClass", "()Ljava/lang/Class;");
                                        hVar.f(g4.i.b(n4.b.b(cls2)));
                                        hVar.d(166, eVar38);
                                        d(hVar, c0304a, cVar3, cls2);
                                        hVar.i(58, c0304a.a("list_item_desc"));
                                        g4.e eVar39 = new g4.e();
                                        g4.e eVar40 = new g4.e();
                                        eVar7 = eVar35;
                                        boolean z12 = c0304a.f17294d;
                                        if (z12) {
                                            eVar5 = eVar38;
                                            String str34 = (c0304a.f17297g && z12) ? "writeDirectNonContext" : str20;
                                            eVar8 = eVar37;
                                            hVar.i(25, c0304a.a("list_item_desc"));
                                            String str35 = f17286h;
                                            hVar.h(193, str35);
                                            hVar.d(153, eVar39);
                                            str18 = str20;
                                            hVar.i(25, c0304a.a("list_item_desc"));
                                            hVar.h(192, str35);
                                            hVar.i(25, 1);
                                            hVar.i(25, c0304a.a("list_item"));
                                            if (c0304a.f17297g) {
                                                hVar.b(1);
                                            } else {
                                                hVar.i(21, c0304a.a("i"));
                                                hVar.g("java/lang/Integer", 184, "valueOf", "(I)Ljava/lang/Integer;");
                                            }
                                            hVar.f(g4.i.b(n4.b.b(cls2)));
                                            hVar.f(Integer.valueOf(cVar3.f21955i));
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append(str6);
                                            cVar2 = cVar3;
                                            str9 = str3;
                                            hVar.g(str35, 182, str34, androidx.activity.e.b(sb2, f17281c, str9));
                                            hVar.d(167, eVar40);
                                            hVar.e(eVar39);
                                        } else {
                                            cVar2 = cVar3;
                                            eVar8 = eVar37;
                                            str18 = str20;
                                            eVar5 = eVar38;
                                            str9 = str3;
                                        }
                                        hVar.i(25, c0304a.a("list_item_desc"));
                                        hVar.i(25, 1);
                                        hVar.i(25, c0304a.a("list_item"));
                                        if (c0304a.f17297g) {
                                            hVar.b(1);
                                        } else {
                                            hVar.i(21, c0304a.a("i"));
                                            hVar.g("java/lang/Integer", 184, "valueOf", "(I)Ljava/lang/Integer;");
                                        }
                                        hVar.f(g4.i.b(n4.b.b(cls2)));
                                        cVar = cVar2;
                                        hVar.f(Integer.valueOf(cVar.f21955i));
                                        str20 = str18;
                                        hVar.g(f17282d, 185, str20, androidx.activity.e.b(android.support.v4.media.d.a(str6), f17281c, str9));
                                        hVar.e(eVar40);
                                        eVar6 = eVar8;
                                        hVar.d(167, eVar6);
                                    }
                                    hVar.e(eVar5);
                                    hVar.i(25, 1);
                                    hVar.i(25, c0304a.a("list_item"));
                                    if (c0304a.f17297g) {
                                        hVar.b(1);
                                    } else {
                                        hVar.i(21, c0304a.a("i"));
                                        hVar.g("java/lang/Integer", 184, "valueOf", "(I)Ljava/lang/Integer;");
                                    }
                                    if (cls2 == null || !Modifier.isPublic(cls2.getModifiers())) {
                                        str15 = f17281c;
                                        str16 = "writeWithFieldName";
                                        str17 = "(Ljava/lang/Object;Ljava/lang/Object;)V";
                                    } else {
                                        hVar.f(g4.i.b(n4.b.b((Class) F)));
                                        hVar.f(Integer.valueOf(cVar.f21955i));
                                        str15 = f17281c;
                                        str16 = "writeWithFieldName";
                                        str17 = "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V";
                                    }
                                    hVar.g(str15, 182, str16, str17);
                                    hVar.e(eVar6);
                                    hVar.e(eVar7);
                                    int a13 = c0304a.a("i");
                                    j1.e eVar41 = hVar.f14986g;
                                    eVar41.d(132);
                                    i13 = 1;
                                    eVar41.b(a13, 1);
                                    hVar.d(167, eVar3);
                                    hVar.e(eVar4);
                                    str7 = str14;
                                    i14 = 25;
                                    hVar.i(25, c0304a.a(str7));
                                    hVar.i(16, 93);
                                    i15 = 182;
                                    str5 = str13;
                                    hVar.g(str32, 182, str20, str5);
                                }
                                hVar.i(i14, i13);
                                hVar.g(f17281c, i15, "popContext", "()V");
                                hVar.e(eVar2);
                                h(hVar, c0304a);
                                hVar.e(eVar29);
                                hVar.e(eVar27);
                                str8 = str33;
                            } else {
                                String str36 = str28;
                                i12 = i20;
                                str5 = str26;
                                str6 = str21;
                                str7 = str22;
                                str9 = str3;
                                if (cls.isEnum()) {
                                    g4.e eVar42 = new g4.e();
                                    g4.e eVar43 = new g4.e();
                                    g4.e eVar44 = new g4.e();
                                    g(hVar, cVar3, c0304a, eVar44);
                                    b(hVar, c0304a, cVar3);
                                    hVar.h(192, "java/lang/Enum");
                                    hVar.i(58, c0304a.a("enum"));
                                    a(hVar, cVar3, c0304a, eVar44);
                                    hVar.i(25, c0304a.a("enum"));
                                    hVar.d(199, eVar42);
                                    e(hVar, c0304a, cVar3);
                                    hVar.d(167, eVar43);
                                    hVar.e(eVar42);
                                    if (c0304a.f17294d) {
                                        hVar.i(25, c0304a.a(str7));
                                        str8 = str36;
                                        hVar.i(21, c0304a.a(str8));
                                        hVar.i(25, 6);
                                        hVar.i(25, c0304a.a("enum"));
                                        hVar.g("java/lang/Enum", 182, "name", "()Ljava/lang/String;");
                                        str10 = f17284f;
                                        str11 = "writeFieldValueStringWithDoubleQuote";
                                        str12 = "(CLjava/lang/String;Ljava/lang/String;)V";
                                    } else {
                                        str8 = str36;
                                        hVar.i(25, c0304a.a(str7));
                                        hVar.i(21, c0304a.a(str8));
                                        String str37 = f17284f;
                                        hVar.g(str37, 182, str20, str5);
                                        hVar.i(25, c0304a.a(str7));
                                        hVar.i(25, 6);
                                        hVar.b(3);
                                        hVar.g(str37, 182, "writeFieldName", "(Ljava/lang/String;Z)V");
                                        hVar.i(25, 1);
                                        hVar.i(25, c0304a.a("enum"));
                                        hVar.i(25, 6);
                                        hVar.f(g4.i.b(n4.b.b(cVar3.f21951e)));
                                        hVar.f(Integer.valueOf(cVar3.f21955i));
                                        str10 = f17281c;
                                        str11 = "writeWithFieldName";
                                        str12 = "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V";
                                    }
                                    hVar.g(str10, 182, str11, str12);
                                    h(hVar, c0304a);
                                    hVar.e(eVar43);
                                    hVar.e(eVar44);
                                } else {
                                    str8 = str36;
                                    g4.e eVar45 = new g4.e();
                                    g(hVar, cVar3, c0304a, eVar45);
                                    b(hVar, c0304a, cVar3);
                                    hVar.i(58, c0304a.a("object"));
                                    a(hVar, cVar3, c0304a, eVar45);
                                    j(hVar, cVar3, c0304a, eVar45);
                                    hVar.e(eVar45);
                                }
                            }
                        }
                        i12 = i20;
                        str5 = str26;
                        str6 = str21;
                        str7 = str22;
                        str8 = str28;
                        str9 = str3;
                    }
                    f(hVar, cVar3, c0304a, a10, c10);
                }
                i11 = length;
                str4 = str23;
                i12 = i20;
                str5 = str26;
                str6 = str21;
                str7 = str22;
                str8 = str28;
                str9 = str3;
            }
            str22 = str7;
            str3 = str9;
            str28 = str8;
            str26 = str5;
            str23 = str4;
            str21 = str6;
            cVarArr2 = cVarArr;
            i20 = i12 + 1;
            length = i11;
        }
        String str38 = str28;
        String str39 = str23;
        String str40 = str26;
        String str41 = str21;
        String str42 = str22;
        if (!c0304a.f17294d) {
            hVar.i(25, 0);
            hVar.i(25, 1);
            hVar.i(25, 2);
            hVar.i(21, c0304a.a(str38));
            hVar.g(f17286h, 182, "writeAfter", androidx.activity.e.b(android.support.v4.media.d.a(str41), f17281c, ";Ljava/lang/Object;C)C"));
            hVar.i(54, c0304a.a(str38));
        }
        g4.e eVar46 = new g4.e();
        g4.e eVar47 = new g4.e();
        hVar.i(21, c0304a.a(str38));
        hVar.c(16, 123);
        hVar.d(160, eVar46);
        hVar.i(25, c0304a.a(str42));
        hVar.i(16, 123);
        String str43 = f17284f;
        hVar.g(str43, 182, str20, str40);
        hVar.e(eVar46);
        hVar.i(25, c0304a.a(str42));
        hVar.i(16, 125);
        hVar.g(str43, 182, str20, str40);
        hVar.e(eVar47);
        hVar.e(eVar);
        if (c0304a.f17297g) {
            return;
        }
        hVar.i(25, 1);
        hVar.i(25, c0304a.a(str2));
        hVar.g(f17281c, 182, "setContext", androidx.activity.e.b(android.support.v4.media.d.a(str39), f17287i, ")V"));
    }
}
