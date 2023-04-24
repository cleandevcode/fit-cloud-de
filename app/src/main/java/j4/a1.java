package j4;

import j4.a;
import java.io.File;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: i */
    public static final a1 f17315i = new a1();

    /* renamed from: j */
    public static boolean f17316j = false;

    /* renamed from: k */
    public static boolean f17317k = false;

    /* renamed from: l */
    public static boolean f17318l = false;

    /* renamed from: m */
    public static boolean f17319m = false;

    /* renamed from: n */
    public static boolean f17320n = false;

    /* renamed from: o */
    public static boolean f17321o = false;

    /* renamed from: a */
    public boolean f17322a;

    /* renamed from: b */
    public a f17323b;

    /* renamed from: c */
    public String f17324c = e4.a.f13341c;

    /* renamed from: g */
    public long[] f17328g = {4165360493669296979L, 4446674157046724083L};

    /* renamed from: h */
    public ArrayList f17329h = new ArrayList();

    /* renamed from: f */
    public final boolean f17327f = false;

    /* renamed from: d */
    public final n4.h<Type, t0> f17325d = new n4.h<>(DfuBaseService.ERROR_REMOTE_MASK);

    /* renamed from: e */
    public final n4.h<Type, n4.h<Type, t0>> f17326e = new n4.h<>(16);

    public a1() {
        this.f17322a = !n4.b.f21946a;
        try {
            if (this.f17322a) {
                this.f17323b = new a();
            }
        } catch (Throwable unused) {
            this.f17322a = false;
        }
        f(Boolean.class, n.f17452a);
        f(Character.class, r.f17464a);
        d0 d0Var = d0.f17349a;
        f(Byte.class, d0Var);
        f(Short.class, d0Var);
        f(Integer.class, d0Var);
        f(Long.class, o0.f17455a);
        f(Float.class, b0.f17331b);
        f(Double.class, x.f17470b);
        f(BigDecimal.class, l.f17448c);
        f(BigInteger.class, m.f17451c);
        f(String.class, f1.f17400a);
        u0 u0Var = u0.f17468a;
        f(byte[].class, u0Var);
        f(short[].class, u0Var);
        f(int[].class, u0Var);
        f(long[].class, u0Var);
        f(float[].class, u0Var);
        f(double[].class, u0Var);
        f(boolean[].class, u0Var);
        f(char[].class, u0Var);
        f(Object[].class, s0.f17466a);
        q0 q0Var = q0.f17461b;
        f(Class.class, q0Var);
        f(SimpleDateFormat.class, q0Var);
        f(Currency.class, new q0());
        f(TimeZone.class, q0Var);
        f(InetAddress.class, q0Var);
        f(Inet4Address.class, q0Var);
        f(Inet6Address.class, q0Var);
        f(InetSocketAddress.class, q0Var);
        f(File.class, q0Var);
        e eVar = e.f17369a;
        f(Appendable.class, eVar);
        f(StringBuffer.class, eVar);
        f(StringBuilder.class, eVar);
        g1 g1Var = g1.f17402a;
        f(Charset.class, g1Var);
        f(Pattern.class, g1Var);
        f(Locale.class, g1Var);
        f(URI.class, g1Var);
        f(URL.class, g1Var);
        f(UUID.class, g1Var);
        g gVar = g.f17401a;
        f(AtomicBoolean.class, gVar);
        f(AtomicInteger.class, gVar);
        f(AtomicLong.class, gVar);
        x0 x0Var = x0.f17472a;
        f(AtomicReference.class, x0Var);
        f(AtomicIntegerArray.class, gVar);
        f(AtomicLongArray.class, gVar);
        f(WeakReference.class, x0Var);
        f(SoftReference.class, x0Var);
        f(LinkedList.class, t.f17467a);
    }

    public static Member d(Class cls) {
        Method[] methods;
        Field[] fields;
        Method method = null;
        for (Method method2 : cls.getMethods()) {
            if (method2.getReturnType() != Void.class && ((f4.b) method2.getAnnotation(f4.b.class)) != null) {
                if (method != null) {
                    return null;
                }
                method = method2;
            }
        }
        for (Field field : cls.getFields()) {
            if (((f4.b) field.getAnnotation(f4.b.class)) != null) {
                if (method != null) {
                    return null;
                }
                method = field;
            }
        }
        return method;
    }

    public final j0 a(z0 z0Var) {
        String str;
        String str2;
        String str3;
        boolean z10;
        n4.c[] cVarArr;
        j0 j0Var;
        String str4;
        boolean z11;
        boolean z12;
        String str5;
        boolean z13;
        String str6;
        boolean z14;
        boolean z15;
        String str7;
        f4.d dVar;
        Class<String> cls;
        a aVar;
        String name;
        Method method;
        Class<String> cls2 = String.class;
        a aVar2 = this.f17323b;
        aVar2.getClass();
        Class<z0> cls3 = z0.class;
        Class<?> cls4 = z0Var.f17480a;
        if (cls4.isPrimitive()) {
            throw new e4.d(k.f.a(cls4, android.support.v4.media.d.a("unsupportd class ")));
        }
        f4.d dVar2 = (f4.d) n4.n.x(cls4, f4.d.class);
        n4.c[] cVarArr2 = z0Var.f17483d;
        int length = cVarArr2.length;
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                n4.c cVar = cVarArr2[i10];
                if (cVar.f21949c == null && (method = cVar.f21948b) != null && method.getDeclaringClass().isInterface()) {
                    j0Var = new j0(z0Var);
                    break;
                }
                i10++;
            } else {
                n4.c[] cVarArr3 = z0Var.f17484e;
                boolean z16 = cVarArr3 == z0Var.f17483d;
                if (cVarArr3.length > 256) {
                    j0Var = new j0(z0Var);
                } else {
                    int length2 = cVarArr3.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length2) {
                            n4.c cVar2 = cVarArr3[i11];
                            Member member = cVar2.f21948b;
                            if (member == null) {
                                member = cVar2.f21949c;
                            }
                            if (!n4.b.a(member.getName())) {
                                j0Var = new j0(z0Var);
                                break;
                            }
                            i11++;
                        } else {
                            StringBuilder a10 = android.support.v4.media.d.a("ASMSerializer_");
                            a10.append(aVar2.f17290b.incrementAndGet());
                            a10.append("_");
                            a10.append(cls4.getSimpleName());
                            String sb2 = a10.toString();
                            Package r52 = a.class.getPackage();
                            if (r52 != null) {
                                str = android.support.v4.media.a.a(r52.getName(), ".", sb2);
                                str2 = name.replace('.', '/') + "/" + sb2;
                            } else {
                                str = sb2;
                                str2 = str;
                            }
                            g4.b bVar = new g4.b();
                            bVar.g(str2, a.f17286h, new String[]{a.f17282d});
                            int length3 = cVarArr3.length;
                            int i12 = 0;
                            while (true) {
                                str3 = str;
                                if (i12 >= length3) {
                                    break;
                                }
                                int i13 = length3;
                                n4.c cVar3 = cVarArr3[i12];
                                if (cVar3.f21951e.isPrimitive() || cVar3.f21951e == cls2) {
                                    aVar = aVar2;
                                } else {
                                    aVar = aVar2;
                                    new g4.c(bVar, androidx.activity.e.b(new StringBuilder(), cVar3.f21947a, "_asm_fieldType"), "Ljava/lang/reflect/Type;");
                                    if (List.class.isAssignableFrom(cVar3.f21951e)) {
                                        new g4.c(bVar, androidx.activity.e.b(new StringBuilder(), cVar3.f21947a, "_asm_list_item_ser_"), a.f17283e);
                                    }
                                    new g4.c(bVar, androidx.activity.e.b(new StringBuilder(), cVar3.f21947a, "_asm_ser_"), a.f17283e);
                                }
                                i12++;
                                str = str3;
                                length3 = i13;
                                aVar2 = aVar;
                            }
                            a aVar3 = aVar2;
                            StringBuilder a11 = android.support.v4.media.d.a("(");
                            a11.append(n4.b.b(cls3));
                            a11.append(")V");
                            g4.h hVar = new g4.h(bVar, "<init>", a11.toString(), null);
                            hVar.i(25, 0);
                            hVar.i(25, 1);
                            String str8 = a.f17286h;
                            StringBuilder a12 = android.support.v4.media.d.a("(");
                            a12.append(n4.b.b(cls3));
                            a12.append(")V");
                            hVar.g(str8, 183, "<init>", a12.toString());
                            int i14 = 0;
                            while (i14 < cVarArr3.length) {
                                n4.c cVar4 = cVarArr3[i14];
                                if (cVar4.f21951e.isPrimitive() || cVar4.f21951e == cls2) {
                                    cls = cls2;
                                } else {
                                    hVar.i(25, 0);
                                    if (cVar4.f21948b != null) {
                                        hVar.f(g4.i.b(n4.b.b(cVar4.f21953g)));
                                        hVar.f(cVar4.f21948b.getName());
                                        cls = cls2;
                                        hVar.g(n4.b.f(n4.b.class), 184, "getMethodType", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Type;");
                                    } else {
                                        cls = cls2;
                                        hVar.i(25, 0);
                                        hVar.f(Integer.valueOf(i14));
                                        hVar.g(a.f17286h, 183, "getFieldType", "(I)Ljava/lang/reflect/Type;");
                                    }
                                    hVar.a(str2, 181, androidx.activity.e.b(new StringBuilder(), cVar4.f21947a, "_asm_fieldType"), "Ljava/lang/reflect/Type;");
                                }
                                i14++;
                                cls2 = cls;
                            }
                            hVar.b(177);
                            hVar.f14987h = 4;
                            hVar.f14988i = 4;
                            if (dVar2 != null) {
                                for (e1 e1Var : dVar2.serialzeFeatures()) {
                                    if (e1Var == e1.DisableCircularReferenceDetect) {
                                        z10 = true;
                                        break;
                                    }
                                }
                            }
                            z10 = false;
                            int i15 = 0;
                            while (i15 < 3) {
                                Class<z0> cls5 = cls3;
                                if (i15 == 0) {
                                    z14 = true;
                                    z15 = z10;
                                    z13 = z15;
                                    str5 = "writeNormal";
                                    str6 = "write";
                                } else {
                                    str5 = "writeNormal";
                                    if (i15 == 1) {
                                        z15 = z10;
                                        z13 = z15;
                                        str6 = str5;
                                        z14 = false;
                                    } else {
                                        z13 = z10;
                                        str6 = "writeDirectNonContext";
                                        z14 = true;
                                        z15 = true;
                                    }
                                }
                                int i16 = i15;
                                String str9 = str5;
                                Class<?> cls6 = cls4;
                                n4.c[] cVarArr4 = cVarArr3;
                                g4.b bVar2 = bVar;
                                String str10 = str3;
                                a.C0304a c0304a = new a.C0304a(cVarArr3, z0Var, str2, z14, z15);
                                StringBuilder a13 = android.support.v4.media.d.a("(L");
                                String str11 = a.f17281c;
                                g4.h hVar2 = new g4.h(bVar2, str6, androidx.activity.e.b(a13, str11, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"), new String[]{"java/io/IOException"});
                                g4.e eVar = new g4.e();
                                hVar2.i(25, 2);
                                hVar2.d(199, eVar);
                                hVar2.i(25, 1);
                                hVar2.g(str11, 182, "writeNull", "()V");
                                hVar2.b(177);
                                hVar2.e(eVar);
                                hVar2.i(25, 1);
                                hVar2.a(str11, 180, "out", a.f17285g);
                                hVar2.i(58, c0304a.a("out"));
                                if (z16 || c0304a.f17294d || !(dVar2 == null || dVar2.alphabetic())) {
                                    str7 = "(L";
                                } else {
                                    g4.e eVar2 = new g4.e();
                                    hVar2.i(25, c0304a.a("out"));
                                    hVar2.g(a.f17284f, 182, "isSortField", "()Z");
                                    hVar2.d(154, eVar2);
                                    hVar2.i(25, 0);
                                    hVar2.i(25, 1);
                                    hVar2.i(25, 2);
                                    hVar2.i(25, 3);
                                    hVar2.i(25, 4);
                                    hVar2.i(21, 5);
                                    StringBuilder sb3 = new StringBuilder();
                                    str7 = "(L";
                                    sb3.append(str7);
                                    sb3.append(str11);
                                    sb3.append(";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
                                    hVar2.g(str2, 182, "writeUnsorted", sb3.toString());
                                    hVar2.b(177);
                                    hVar2.e(eVar2);
                                }
                                if (!c0304a.f17294d || z15) {
                                    dVar = dVar2;
                                } else {
                                    g4.e eVar3 = new g4.e();
                                    g4.e eVar4 = new g4.e();
                                    hVar2.i(25, 0);
                                    hVar2.i(25, 1);
                                    dVar = dVar2;
                                    hVar2.g(a.f17286h, 182, "writeDirect", android.support.v4.media.a.a(str7, str11, ";)Z"));
                                    hVar2.d(154, eVar4);
                                    hVar2.i(25, 0);
                                    hVar2.i(25, 1);
                                    hVar2.i(25, 2);
                                    hVar2.i(25, 3);
                                    hVar2.i(25, 4);
                                    hVar2.i(21, 5);
                                    hVar2.g(str2, 182, str9, str7 + str11 + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
                                    hVar2.b(177);
                                    hVar2.e(eVar4);
                                    hVar2.i(25, c0304a.a("out"));
                                    hVar2.f(Integer.valueOf(e1.DisableCircularReferenceDetect.f17396a));
                                    hVar2.g(a.f17284f, 182, "isEnabled", "(I)Z");
                                    hVar2.d(153, eVar3);
                                    hVar2.i(25, 0);
                                    hVar2.i(25, 1);
                                    hVar2.i(25, 2);
                                    hVar2.i(25, 3);
                                    hVar2.i(25, 4);
                                    hVar2.i(21, 5);
                                    hVar2.g(str2, 182, "writeDirectNonContext", str7 + str11 + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
                                    hVar2.b(177);
                                    hVar2.e(eVar3);
                                }
                                hVar2.i(25, 2);
                                hVar2.h(192, n4.b.f(cls6));
                                hVar2.i(58, c0304a.a("entity"));
                                a.l(hVar2, cVarArr4, c0304a);
                                hVar2.b(177);
                                hVar2.f14987h = 7;
                                hVar2.f14988i = c0304a.f17296f + 2;
                                i15 = i16 + 1;
                                cVarArr3 = cVarArr4;
                                bVar = bVar2;
                                cls3 = cls5;
                                dVar2 = dVar;
                                z10 = z13;
                                cls4 = cls6;
                                str3 = str10;
                            }
                            boolean z17 = z10;
                            Class<z0> cls7 = cls3;
                            Class<?> cls8 = cls4;
                            n4.c[] cVarArr5 = cVarArr3;
                            String str12 = str3;
                            g4.b bVar3 = bVar;
                            if (z16) {
                                cVarArr = cVarArr5;
                            } else {
                                cVarArr = cVarArr5;
                                a.C0304a c0304a2 = new a.C0304a(cVarArr5, z0Var, str2, false, z17);
                                StringBuilder a14 = android.support.v4.media.d.a("(L");
                                String str13 = a.f17281c;
                                g4.h hVar3 = new g4.h(bVar3, "writeUnsorted", androidx.activity.e.b(a14, str13, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"), new String[]{"java/io/IOException"});
                                hVar3.i(25, 1);
                                hVar3.a(str13, 180, "out", a.f17285g);
                                hVar3.i(58, c0304a2.a("out"));
                                hVar3.i(25, 2);
                                hVar3.h(192, n4.b.f(cls8));
                                hVar3.i(58, c0304a2.a("entity"));
                                a.l(hVar3, cVarArr2, c0304a2);
                                hVar3.b(177);
                                hVar3.f14987h = 7;
                                hVar3.f14988i = c0304a2.f17296f + 2;
                            }
                            for (int i17 = 0; i17 < 3; i17++) {
                                if (i17 == 0) {
                                    str4 = "writeAsArray";
                                    z12 = z17;
                                    z11 = true;
                                } else if (i17 == 1) {
                                    str4 = "writeAsArrayNormal";
                                    z12 = z17;
                                    z11 = false;
                                } else {
                                    str4 = "writeAsArrayNonContext";
                                    z11 = true;
                                    z12 = true;
                                }
                                a.C0304a c0304a3 = new a.C0304a(cVarArr, z0Var, str2, z11, z12);
                                StringBuilder a15 = android.support.v4.media.d.a("(L");
                                String str14 = a.f17281c;
                                g4.h hVar4 = new g4.h(bVar3, str4, androidx.activity.e.b(a15, str14, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"), new String[]{"java/io/IOException"});
                                hVar4.i(25, 1);
                                hVar4.a(str14, 180, "out", a.f17285g);
                                hVar4.i(58, c0304a3.a("out"));
                                hVar4.i(25, 2);
                                hVar4.h(192, n4.b.f(cls8));
                                hVar4.i(58, c0304a3.a("entity"));
                                a.k(hVar4, cVarArr, c0304a3);
                                hVar4.b(177);
                                hVar4.f14987h = 7;
                                hVar4.f14988i = c0304a3.f17296f + 2;
                            }
                            byte[] f10 = bVar3.f();
                            j0Var = (j0) aVar3.f17289a.a(str12, f10, f10.length).getConstructor(cls7).newInstance(z0Var);
                        }
                    }
                }
            }
        }
        int i18 = 0;
        while (true) {
            a0[] a0VarArr = j0Var.f17419j;
            if (i18 >= a0VarArr.length) {
                return j0Var;
            }
            Class<?> cls9 = a0VarArr[i18].f17298a.f21951e;
            if (cls9.isEnum()) {
                boolean z18 = e(cls9) instanceof y;
            }
            i18++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x0064, code lost:
        if (r1 != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x006c, code lost:
        if (r3 != java.lang.Object.class) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0157, code lost:
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x016e, code lost:
        throw new e4.d("create asm serializer error, verson 1.2.83, class " + r3, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x016f, code lost:
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x017b, code lost:
        if (r14.getMessage().indexOf("Metaspace") != (-1)) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x017e, code lost:
        throw r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:?, code lost:
        return a(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j4.t0 b(java.lang.Class<?> r14) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.a1.b(java.lang.Class):j4.t0");
    }

    public final t0 c(Type type) {
        t0 a10;
        Type i10 = e4.a.i(type);
        if (i10 == null) {
            a10 = this.f17325d.a(type);
        } else {
            n4.h<Type, t0> a11 = this.f17326e.a(type);
            if (a11 == null) {
                return null;
            }
            a10 = a11.a(i10);
        }
        return a10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:434:0x0171, code lost:
        if (r2.serializeEnumAsJavaBean() != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x0309, code lost:
        f(r4, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x0459, code lost:
        f(r24, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:682:?, code lost:
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:624:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:683:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j4.t0 e(java.lang.Class<?> r24) {
        /*
            Method dump skipped, instructions count: 1138
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.a1.e(java.lang.Class):j4.t0");
    }

    public final void f(Type type, t0 t0Var) {
        Type i10 = e4.a.i(type);
        if (i10 == null) {
            this.f17325d.b(type, t0Var);
            return;
        }
        n4.h<Type, t0> a10 = this.f17326e.a(type);
        if (a10 == null) {
            a10 = new n4.h<>(4);
            this.f17326e.b(type, a10);
        }
        a10.b(i10, t0Var);
    }
}
