package i4;

import h4.k;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class o implements t {

    /* renamed from: a */
    public final l[] f16454a;

    /* renamed from: b */
    public final l[] f16455b;

    /* renamed from: c */
    public final Class<?> f16456c;

    /* renamed from: d */
    public final n4.i f16457d;

    /* renamed from: e */
    public ConcurrentHashMap f16458e;

    /* renamed from: f */
    public final HashMap f16459f;

    /* renamed from: g */
    public HashMap f16460g;

    /* renamed from: h */
    public transient long[] f16461h;

    /* renamed from: i */
    public transient short[] f16462i;

    /* renamed from: j */
    public final k.c f16463j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(h4.k kVar, Class<?> cls, Type type) {
        this(kVar, n4.i.b(cls, type, kVar.f15861k));
        kVar.getClass();
    }

    public o(h4.k kVar, n4.i iVar) {
        Class<?> cls;
        String[] strArr;
        this.f16456c = iVar.f21988a;
        this.f16457d = iVar;
        iVar.getClass();
        this.f16463j = null;
        n4.c[] cVarArr = iVar.f21996i;
        this.f16455b = new l[cVarArr.length];
        int length = cVarArr.length;
        HashMap hashMap = null;
        for (int i10 = 0; i10 < length; i10++) {
            n4.c cVar = iVar.f21996i[i10];
            kVar.getClass();
            Class<?> cls2 = iVar.f21988a;
            Class<?> cls3 = cVar.f21951e;
            f4.b d10 = cVar.d();
            l cVar2 = (((d10 == null || (cls = d10.deserializeUsing()) == Void.class) ? null : cls) == null && (cls3 == List.class || cls3 == ArrayList.class)) ? new c(cls2, cVar) : new f(cls2, cVar);
            this.f16455b[i10] = cVar2;
            if (length > 128) {
                if (this.f16460g == null) {
                    this.f16460g = new HashMap();
                }
                this.f16460g.put(cVar.f21947a, cVar2);
            }
            for (String str : cVar.f21964r) {
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                hashMap.put(str, cVar2);
            }
        }
        this.f16459f = hashMap;
        n4.c[] cVarArr2 = iVar.f21995h;
        this.f16454a = new l[cVarArr2.length];
        int length2 = cVarArr2.length;
        for (int i11 = 0; i11 < length2; i11++) {
            this.f16454a[i11] = i(iVar.f21995h[i11].f21947a, null);
        }
    }

    public static o j(h4.k kVar, n4.i iVar, String str) {
        iVar.getClass();
        return null;
    }

    public static boolean k(int i10, int[] iArr) {
        int i11;
        if (iArr != null && (i11 = i10 / 32) < iArr.length) {
            return ((1 << (i10 % 32)) & iArr[i11]) != 0;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00e2 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Enum m(h4.e r13, char[] r14, i4.t r15) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.o.m(h4.e, char[], i4.t):java.lang.Enum");
    }

    @Override // i4.t
    public int b() {
        return 12;
    }

    public final Object c(h4.a aVar, Type type) {
        Object newInstance;
        n4.c[] cVarArr;
        if ((type instanceof Class) && this.f16456c.isInterface()) {
            return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{(Class) type}, new e4.e());
        }
        n4.i iVar = this.f16457d;
        Constructor<?> constructor = iVar.f21990c;
        Object obj = null;
        if (constructor == null && iVar.f21992e == null) {
            return null;
        }
        Method method = iVar.f21992e;
        if (method != null && iVar.f21994g > 0) {
            return null;
        }
        try {
            if (iVar.f21994g == 0) {
                if (constructor != null) {
                    newInstance = constructor.newInstance(new Object[0]);
                } else {
                    newInstance = method.invoke(null, new Object[0]);
                }
            } else {
                h4.j jVar = aVar.f15775g;
                if (jVar != null && jVar.f15833a != null) {
                    if (type instanceof Class) {
                        String name = ((Class) type).getName();
                        String substring = name.substring(0, name.lastIndexOf(36));
                        Object obj2 = jVar.f15833a;
                        String name2 = obj2.getClass().getName();
                        if (!name2.equals(substring)) {
                            h4.j jVar2 = jVar.f15834b;
                            if (jVar2 != null && jVar2.f15833a != null && ("java.util.ArrayList".equals(name2) || "java.util.List".equals(name2) || "java.util.Collection".equals(name2) || "java.util.Map".equals(name2) || "java.util.HashMap".equals(name2))) {
                                if (jVar2.f15833a.getClass().getName().equals(substring)) {
                                    obj = jVar2.f15833a;
                                }
                            } else {
                                obj = obj2;
                            }
                            obj2 = obj;
                        }
                        if (obj2 != null && (!(obj2 instanceof Collection) || !((Collection) obj2).isEmpty())) {
                            newInstance = constructor.newInstance(obj2);
                        } else {
                            throw new e4.d("can't create non-static inner class instance.");
                        }
                    } else {
                        throw new e4.d("can't create non-static inner class instance.");
                    }
                } else {
                    throw new e4.d("can't create non-static inner class instance.");
                }
            }
            if (aVar != null && aVar.f15774f.I(h4.b.InitStringFieldAsEmpty)) {
                for (n4.c cVar : this.f16457d.f21995h) {
                    if (cVar.f21951e == String.class) {
                        try {
                            cVar.h(newInstance, "");
                        } catch (Exception e10) {
                            throw new e4.d(k.f.a(this.f16456c, android.support.v4.media.d.a("create instance error, class ")), e10);
                        }
                    }
                }
            }
            return newInstance;
        } catch (e4.d e11) {
            throw e11;
        } catch (Exception e12) {
            throw new e4.d(k.f.a(this.f16456c, android.support.v4.media.d.a("create instance error, class ")), e12);
        }
    }

    @Override // i4.t
    public <T> T d(h4.a aVar, Type type, Object obj) {
        return (T) f(aVar, type, obj, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:382:0x008c, code lost:
        if (r11 != false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x00a0, code lost:
        if (r10.f21948b != null) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x00a2, code lost:
        r13 = r11.getType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x00a8, code lost:
        if (r13 != java.lang.Boolean.TYPE) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x00ac, code lost:
        if (r8 != java.lang.Boolean.FALSE) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x00ae, code lost:
        r11.setBoolean(r2, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x00b5, code lost:
        if (r8 != java.lang.Boolean.TRUE) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x00b7, code lost:
        r11.setBoolean(r2, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x00be, code lost:
        if (r13 != java.lang.Integer.TYPE) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x00c2, code lost:
        if ((r8 instanceof java.lang.Number) == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x00c4, code lost:
        r11.setInt(r2, ((java.lang.Number) r8).intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x00d1, code lost:
        if (r13 != java.lang.Long.TYPE) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x00d5, code lost:
        if ((r8 instanceof java.lang.Number) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x00d7, code lost:
        r11.setLong(r2, ((java.lang.Number) r8).longValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x00e2, code lost:
        r7 = '-';
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x00e8, code lost:
        if (r13 != java.lang.Float.TYPE) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x00ec, code lost:
        if ((r8 instanceof java.lang.Number) == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x00ee, code lost:
        r4 = ((java.lang.Number) r8).floatValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x00f4, code lost:
        r11.setFloat(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x00fb, code lost:
        if ((r8 instanceof java.lang.String) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x00fd, code lost:
        r8 = (java.lang.String) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0103, code lost:
        if (r8.length() > 10) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0105, code lost:
        r5 = n4.n.f22012a;
        r5 = r8.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x010b, code lost:
        if (r5 < 10) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x010d, code lost:
        r20 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0111, code lost:
        r9 = 0;
        r10 = false;
        r12 = 0;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0116, code lost:
        if (r9 >= r5) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x0118, code lost:
        r15 = r8.charAt(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x011c, code lost:
        if (r15 != r7) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x011e, code lost:
        if (r9 != 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x0120, code lost:
        r20 = r8;
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0127, code lost:
        if (r15 != '.') goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x0129, code lost:
        if (r12 == 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x012c, code lost:
        r12 = (r5 - r9) - (r6 ? 1 : 0);
        r20 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0133, code lost:
        if (r15 < r4) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x0137, code lost:
        if (r15 > '9') goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x0139, code lost:
        r20 = r8;
        r13 = (r13 * 10) + (r15 - '0');
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x0143, code lost:
        r9 = r9 + 1;
        r8 = r20;
        r4 = '0';
        r7 = '-';
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x014e, code lost:
        r20 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x0150, code lost:
        if (r10 == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x0152, code lost:
        r13 = -r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x0153, code lost:
        switch(r12) {
            case 0: goto L106;
            case 1: goto L105;
            case 2: goto L104;
            case 3: goto L103;
            case 4: goto L102;
            case 5: goto L101;
            case 6: goto L100;
            case 7: goto L99;
            case 8: goto L98;
            case 9: goto L96;
            default: goto L69;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0157, code lost:
        r4 = (float) r13;
        r5 = 1.0E9f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x015c, code lost:
        r4 = (float) r13;
        r5 = 1.0E8f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0161, code lost:
        r4 = (float) r13;
        r5 = 1.0E7f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x0166, code lost:
        r4 = (float) r13;
        r5 = 1000000.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x016b, code lost:
        r4 = (float) r13;
        r5 = 100000.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x0170, code lost:
        r4 = (float) r13;
        r5 = 10000.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x0175, code lost:
        r4 = (float) r13;
        r5 = 1000.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0179, code lost:
        r4 = (float) r13;
        r5 = 100.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x017d, code lost:
        r4 = (float) r13;
        r5 = 10.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0180, code lost:
        r4 = r4 / r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x0183, code lost:
        r4 = (float) r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x0186, code lost:
        r4 = java.lang.Float.parseFloat(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x018c, code lost:
        r4 = java.lang.Float.parseFloat(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x0196, code lost:
        if (r13 != java.lang.Double.TYPE) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x019a, code lost:
        if ((r8 instanceof java.lang.Number) == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x019c, code lost:
        r4 = ((java.lang.Number) r8).doubleValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x01a6, code lost:
        if ((r8 instanceof java.lang.String) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x01a8, code lost:
        r8 = (java.lang.String) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x01ae, code lost:
        if (r8.length() > 10) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x01b0, code lost:
        r5 = n4.n.f22012a;
        r5 = r8.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x01b6, code lost:
        if (r5 <= 10) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x01ba, code lost:
        r7 = 0;
        r9 = false;
        r10 = 0;
        r12 = 0;
        r15 = '.';
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x01c1, code lost:
        if (r7 >= r5) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x01c3, code lost:
        r4 = r8.charAt(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x01c9, code lost:
        if (r4 != '-') goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x01cb, code lost:
        if (r7 != 0) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x01cd, code lost:
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x01d0, code lost:
        if (r4 != r15) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x01d2, code lost:
        if (r10 == 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x01d6, code lost:
        r10 = (r5 - r7) - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x01dd, code lost:
        if (r4 < '0') goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x01e1, code lost:
        if (r4 > '9') goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x01e3, code lost:
        r12 = (r12 * 10) + (r4 - '0');
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x01eb, code lost:
        r7 = r7 + 1;
        r15 = '.';
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x01f2, code lost:
        if (r9 == false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x01f4, code lost:
        r12 = -r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x01f5, code lost:
        switch(r10) {
            case 0: goto L155;
            case 1: goto L154;
            case 2: goto L153;
            case 3: goto L152;
            case 4: goto L151;
            case 5: goto L150;
            case 6: goto L149;
            case 7: goto L148;
            case 8: goto L147;
            case 9: goto L145;
            default: goto L156;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x01f9, code lost:
        r4 = r12;
        r6 = 1.0E9d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x0200, code lost:
        r4 = r12;
        r6 = 1.0E8d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x0207, code lost:
        r4 = r12;
        r6 = 1.0E7d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x020e, code lost:
        r4 = r12;
        r6 = 1000000.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x0215, code lost:
        r4 = r12;
        r6 = 100000.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x021c, code lost:
        r4 = r12;
        r6 = 10000.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0223, code lost:
        r4 = r12;
        r6 = 1000.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x022a, code lost:
        r4 = r12;
        r6 = 100.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x022e, code lost:
        r4 = r12;
        r6 = 10.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0231, code lost:
        r4 = r4 / r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0233, code lost:
        r4 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x0235, code lost:
        r4 = java.lang.Double.parseDouble(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x023a, code lost:
        r4 = java.lang.Double.parseDouble(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x023e, code lost:
        r11.setDouble(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x0242, code lost:
        if (r8 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0248, code lost:
        if (r12 != r8.getClass()) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x024a, code lost:
        r11.set(r2, r8);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [i4.o] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.util.HashMap, int[]] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r6v17, types: [int] */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r9v4, types: [i4.l] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(java.util.Map<java.lang.String, java.lang.Object> r20, h4.k r21) {
        /*
            Method dump skipped, instructions count: 1112
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.o.e(java.util.Map, h4.k):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:1027:0x034d, code lost:
        if (r5 == (-2)) goto L592;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1045:0x0387, code lost:
        if (r13.I(h4.b.AllowArbitraryCommas) != false) goto L449;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1128:0x04ce, code lost:
        r6 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1131:0x04d8, code lost:
        if (r3 != null) goto L534;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1132:0x04da, code lost:
        r3 = r12.a(r0, r13.l0(), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1133:0x04e2, code lost:
        r2 = r32.q().d(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1136:0x04ec, code lost:
        r3 = r2.d(r32, r3, r34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1137:0x04f2, code lost:
        if ((r2 instanceof i4.o) == false) goto L542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1138:0x04f4, code lost:
        r2 = (i4.o) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1139:0x04f6, code lost:
        if (r7 == null) goto L542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1140:0x04f8, code lost:
        r2 = r2.h(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1141:0x04fc, code lost:
        if (r2 == null) goto L542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1142:0x04fe, code lost:
        r2.e(r3, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1145:0x0507, code lost:
        if (r1 == null) goto L544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1146:0x0509, code lost:
        r1.f15833a = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1147:0x050d, code lost:
        r32.h0(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1148:0x0510, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1155:0x0524, code lost:
        r0 = 0;
        r4 = r6;
        r3 = r18;
        r29 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1245:0x068c, code lost:
        r1 = r18;
        r3 = r26;
        r4 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1246:0x0692, code lost:
        if (r4 != null) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1247:0x0694, code lost:
        if (r3 != null) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1248:0x0696, code lost:
        r2 = c(r32, r33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1249:0x069a, code lost:
        if (r1 != null) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1250:0x069c, code lost:
        r1 = r32.b0(r15, r2, r34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1252:0x06a1, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1253:0x06a2, code lost:
        r4 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1254:0x06a5, code lost:
        if (r1 == null) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1255:0x06a7, code lost:
        r1.f15833a = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1256:0x06a9, code lost:
        r32.h0(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1257:0x06ac, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1258:0x06ad, code lost:
        r2 = r31.f16457d;
        r5 = r2.f22002o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1260:0x06b3, code lost:
        if (r5 == null) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1261:0x06b5, code lost:
        r2 = new java.lang.Object[r5.length];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1263:0x06ba, code lost:
        if (r7 >= r5.length) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1264:0x06bc, code lost:
        r10 = r3.remove(r5[r7]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1265:0x06c2, code lost:
        if (r10 != null) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1266:0x06c4, code lost:
        r11 = r31.f16457d;
        r12 = r11.f22001n[r7];
        r11 = r11.f21995h[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:1267:0x06d0, code lost:
        if (r12 != java.lang.Byte.TYPE) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1268:0x06d2, code lost:
        r0 = java.lang.Byte.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1269:0x06d6, code lost:
        r10 = r0;
        r14 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1271:0x06dd, code lost:
        if (r12 != java.lang.Short.TYPE) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1272:0x06df, code lost:
        r0 = java.lang.Short.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1274:0x06e6, code lost:
        if (r12 != java.lang.Integer.TYPE) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1275:0x06e8, code lost:
        r0 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1277:0x06ef, code lost:
        if (r12 != java.lang.Long.TYPE) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1278:0x06f1, code lost:
        r0 = 0L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1280:0x06f8, code lost:
        if (r12 != java.lang.Float.TYPE) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1281:0x06fa, code lost:
        r0 = java.lang.Float.valueOf(0.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1283:0x0701, code lost:
        if (r12 != java.lang.Double.TYPE) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1284:0x0703, code lost:
        r0 = java.lang.Double.valueOf(0.0d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1286:0x070a, code lost:
        if (r12 != java.lang.Boolean.TYPE) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1287:0x070c, code lost:
        r0 = java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1288:0x070f, code lost:
        r14 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1289:0x0711, code lost:
        if (r12 != r14) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1291:0x071a, code lost:
        if ((r11.f21956j & h4.b.InitStringFieldAsEmpty.f15812a) == 0) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1292:0x071c, code lost:
        r10 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:1293:0x071e, code lost:
        r14 = r29;
        r0 = r31.f16457d.f22001n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1294:0x0724, code lost:
        if (r0 == null) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1296:0x0727, code lost:
        if (r7 >= r0.length) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1297:0x0729, code lost:
        r0 = r0[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:1298:0x072d, code lost:
        if ((r0 instanceof java.lang.Class) == false) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1299:0x072f, code lost:
        r0 = (java.lang.Class) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1300:0x0735, code lost:
        if (r0.isInstance(r10) != false) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1302:0x0739, code lost:
        if ((r10 instanceof java.util.List) == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1303:0x073b, code lost:
        r11 = (java.util.List) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1304:0x0743, code lost:
        if (r11.size() != 1) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1306:0x074e, code lost:
        if (r0.isInstance(r11.get(0)) == false) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1307:0x0750, code lost:
        r10 = r11.get(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1308:0x0754, code lost:
        r2[r7] = r10;
        r7 = r7 + 1;
        r0 = 0;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1309:0x075d, code lost:
        r14 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1310:0x0761, code lost:
        r14 = r29;
        r0 = r2.f21995h;
        r2 = r0.length;
        r7 = new java.lang.Object[r2];
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1311:0x0769, code lost:
        if (r10 >= r2) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1312:0x076b, code lost:
        r11 = r0[r10];
        r12 = r3.get(r11.f21947a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1313:0x0773, code lost:
        if (r12 != null) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1314:0x0775, code lost:
        r13 = r11.f21952f;
        r16 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1315:0x077b, code lost:
        if (r13 != java.lang.Byte.TYPE) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1316:0x077d, code lost:
        r12 = (byte) 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1318:0x0785, code lost:
        if (r13 != java.lang.Short.TYPE) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1319:0x0787, code lost:
        r12 = (short) 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1321:0x078f, code lost:
        if (r13 != java.lang.Integer.TYPE) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1322:0x0791, code lost:
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1324:0x0799, code lost:
        if (r13 != java.lang.Long.TYPE) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1325:0x079b, code lost:
        r12 = 0L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1327:0x07a2, code lost:
        if (r13 != java.lang.Float.TYPE) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1328:0x07a4, code lost:
        r12 = java.lang.Float.valueOf(0.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1330:0x07ab, code lost:
        if (r13 != java.lang.Double.TYPE) goto L339;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1331:0x07ad, code lost:
        r12 = java.lang.Double.valueOf(0.0d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1333:0x07b4, code lost:
        if (r13 != java.lang.Boolean.TYPE) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1334:0x07b6, code lost:
        r12 = java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1335:0x07b9, code lost:
        if (r13 != r14) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1337:0x07c2, code lost:
        if ((r11.f21956j & h4.b.InitStringFieldAsEmpty.f15812a) == 0) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1338:0x07c4, code lost:
        r12 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:1339:0x07c6, code lost:
        r16 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1340:0x07c8, code lost:
        r7[r10] = r12;
        r10 = r10 + 1;
        r0 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1341:0x07cf, code lost:
        r2 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1342:0x07d0, code lost:
        r0 = r31.f16457d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1343:0x07d4, code lost:
        if (r0.f21991d == null) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1345:0x07d8, code lost:
        if (r0.f22003p == false) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1346:0x07da, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1348:0x07dc, code lost:
        if (r0 >= r2.length) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1350:0x07e0, code lost:
        if (r2[r0] != null) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1351:0x07e2, code lost:
        r6 = r31.f16457d.f21995h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1352:0x07e6, code lost:
        if (r6 == null) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1354:0x07e9, code lost:
        if (r0 >= r6.length) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1356:0x07ef, code lost:
        if (r6[r0].f21951e != r14) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1357:0x07f1, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1358:0x07f3, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1359:0x07f6, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1360:0x07f7, code lost:
        if (r0 == false) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1361:0x07f9, code lost:
        r0 = r31.f16457d.f22004q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1362:0x07fd, code lost:
        if (r0 == null) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1363:0x07ff, code lost:
        r4 = r0.newInstance(new java.lang.Object[0]);
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1365:0x0808, code lost:
        if (r0 >= r2.length) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1366:0x080a, code lost:
        r6 = r2[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:1367:0x080c, code lost:
        if (r6 == null) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1368:0x080e, code lost:
        r7 = r31.f16457d.f21995h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1369:0x0812, code lost:
        if (r7 == 0) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1371:0x0815, code lost:
        if (r0 >= r7.length) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1372:0x0817, code lost:
        r7[r0].h(r4, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1373:0x081c, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1374:0x081f, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1376:0x0821, code lost:
        r4 = r31.f16457d.f21991d.newInstance(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1377:0x0829, code lost:
        if (r5 == null) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1378:0x082b, code lost:
        r0 = r3.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:1380:0x0837, code lost:
        if (r0.hasNext() == false) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1381:0x0839, code lost:
        r2 = (java.util.Map.Entry) r0.next();
        r3 = h((java.lang.String) r2.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:1382:0x0849, code lost:
        if (r3 == null) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1383:0x084b, code lost:
        r3.d(r4, r2.getValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:1385:0x0879, code lost:
        throw new e4.d("create instance error, " + r5 + ", " + r31.f16457d.f21991d.toGenericString(), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1386:0x087a, code lost:
        r0 = r0.f21992e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1387:0x087c, code lost:
        if (r0 == null) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1390:0x0883, code lost:
        r4 = r0.invoke(null, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1391:0x0885, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1394:0x08a5, code lost:
        throw new e4.d("create factory method error, " + r31.f16457d.f21992e.toString(), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1395:0x08a6, code lost:
        if (r1 == null) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1396:0x08a8, code lost:
        r1.f15833a = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1397:0x08aa, code lost:
        r0 = r31.f16457d.f21993f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1398:0x08ae, code lost:
        if (r0 != null) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1399:0x08b0, code lost:
        if (r1 == null) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1400:0x08b2, code lost:
        r1.f15833a = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1401:0x08b4, code lost:
        r32.h0(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1402:0x08b7, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1404:0x08b9, code lost:
        r0 = r0.invoke(r4, new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1405:0x08bf, code lost:
        if (r1 == null) goto L365;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1406:0x08c1, code lost:
        r1.f15833a = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1407:0x08c3, code lost:
        r32.h0(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1408:0x08c6, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1409:0x08c7, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1411:0x08cf, code lost:
        throw new e4.d("build object error", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1420:0x0915, code lost:
        throw new e4.d("syntax error, unexpect token " + h4.i.a(r13.h0()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:885:0x01d9, code lost:
        if (r5 == (-2)) goto L591;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1162:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:1164:0x0559 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:1187:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:1217:0x0606 A[Catch: all -> 0x063d, TryCatch #15 {all -> 0x063d, blocks: (B:1189:0x05b6, B:1192:0x05c1, B:1217:0x0606, B:1218:0x0612, B:1194:0x05c9, B:1196:0x05cd, B:1198:0x05d1, B:1200:0x05d5, B:1202:0x05d9, B:1215:0x0601, B:1208:0x05e7, B:1210:0x05ef, B:1212:0x05f6, B:1214:0x05fb, B:1224:0x0634), top: B:1459:0x05b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:1222:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:1241:0x0682 A[Catch: all -> 0x091e, TryCatch #16 {all -> 0x091e, blocks: (B:1418:0x08eb, B:1238:0x0676, B:1241:0x0682, B:1243:0x0688, B:1413:0x08d2, B:1415:0x08da, B:1419:0x08f7, B:1420:0x0915, B:1230:0x065c, B:1232:0x0662, B:1234:0x0668, B:1235:0x066d, B:1421:0x0916, B:1422:0x091d), top: B:1461:0x08eb }] */
    /* JADX WARN: Removed duplicated region for block: B:1431:0x0931  */
    /* JADX WARN: Removed duplicated region for block: B:1451:0x0362 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1462:0x0617 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:790:0x0063 A[Catch: all -> 0x0041, TRY_LEAVE, TryCatch #2 {all -> 0x0041, blocks: (B:773:0x0036, B:780:0x0048, B:782:0x0053, B:784:0x0059, B:790:0x0063, B:796:0x0072, B:803:0x0088, B:808:0x0096, B:810:0x009e, B:813:0x00a8, B:815:0x00ae, B:819:0x00b5, B:823:0x00be, B:829:0x00e0, B:833:0x00fa, B:834:0x0103, B:835:0x0104, B:837:0x0125, B:838:0x012d, B:839:0x0140, B:843:0x0147), top: B:1440:0x0034, inners: #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:979:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:980:0x02d7  */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r7v5, types: [n4.c[]] */
    /* JADX WARN: Type inference failed for: r7v6, types: [n4.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(h4.a r32, java.lang.reflect.Type r33, java.lang.Object r34, int r35) {
        /*
            Method dump skipped, instructions count: 2364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.o.f(h4.a, java.lang.reflect.Type, java.lang.Object, int):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x00b8, code lost:
        r13 = android.support.v4.media.d.a("illegal enum. ");
        r13.append(r0.h());
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x00ce, code lost:
        throw new e4.d(r13.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(h4.a r12, java.lang.reflect.Type r13) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.o.g(h4.a, java.lang.reflect.Type):java.lang.Object");
    }

    public final l h(String str) {
        return i(str, null);
    }

    public final l i(String str, int[] iArr) {
        l lVar;
        if (str == null) {
            return null;
        }
        HashMap hashMap = this.f16460g;
        if (hashMap == null || (lVar = (l) hashMap.get(str)) == null) {
            int i10 = 0;
            int length = this.f16455b.length - 1;
            while (i10 <= length) {
                int i11 = (i10 + length) >>> 1;
                int compareTo = this.f16455b[i11].f16452a.f21947a.compareTo(str);
                if (compareTo < 0) {
                    i10 = i11 + 1;
                } else if (compareTo <= 0) {
                    if (k(i11, iArr)) {
                        return null;
                    }
                    return this.f16455b[i11];
                } else {
                    length = i11 - 1;
                }
            }
            HashMap hashMap2 = this.f16459f;
            if (hashMap2 != null) {
                return (l) hashMap2.get(str);
            }
            return null;
        }
        return lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:214:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x020b  */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l(h4.a r22, java.lang.String r23, java.lang.Object r24, java.lang.reflect.Type r25, java.util.HashMap r26, int[] r27) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.o.l(h4.a, java.lang.String, java.lang.Object, java.lang.reflect.Type, java.util.HashMap, int[]):boolean");
    }

    public final l n(String str, int[] iArr) {
        boolean z10;
        if (str == null) {
            return null;
        }
        l i10 = i(str, iArr);
        if (i10 == null) {
            int i11 = 0;
            if (this.f16461h == null) {
                long[] jArr = new long[this.f16455b.length];
                int i12 = 0;
                while (true) {
                    l[] lVarArr = this.f16455b;
                    if (i12 >= lVarArr.length) {
                        break;
                    }
                    jArr[i12] = lVarArr[i12].f16452a.f21965s;
                    i12++;
                }
                Arrays.sort(jArr);
                this.f16461h = jArr;
            }
            int binarySearch = Arrays.binarySearch(this.f16461h, n4.n.v(str));
            if (binarySearch < 0) {
                binarySearch = Arrays.binarySearch(this.f16461h, n4.n.u(str));
            }
            if (binarySearch < 0) {
                z10 = str.startsWith("is");
                if (z10) {
                    binarySearch = Arrays.binarySearch(this.f16461h, n4.n.u(str.substring(2)));
                }
            } else {
                z10 = false;
            }
            if (binarySearch >= 0) {
                if (this.f16462i == null) {
                    short[] sArr = new short[this.f16461h.length];
                    Arrays.fill(sArr, (short) -1);
                    while (true) {
                        l[] lVarArr2 = this.f16455b;
                        if (i11 >= lVarArr2.length) {
                            break;
                        }
                        int binarySearch2 = Arrays.binarySearch(this.f16461h, lVarArr2[i11].f16452a.f21965s);
                        if (binarySearch2 >= 0) {
                            sArr[binarySearch2] = (short) i11;
                        }
                        i11++;
                    }
                    this.f16462i = sArr;
                }
                short s10 = this.f16462i[binarySearch];
                if (s10 != -1 && !k(s10, iArr)) {
                    i10 = this.f16455b[s10];
                }
            }
            if (i10 != null) {
                n4.c cVar = i10.f16452a;
                if ((cVar.f21956j & h4.b.DisableFieldSmartMatch.f15812a) != 0) {
                    return null;
                }
                Class<?> cls = cVar.f21951e;
                if (z10 && cls != Boolean.TYPE && cls != Boolean.class) {
                    return null;
                }
            }
        }
        return i10;
    }
}
