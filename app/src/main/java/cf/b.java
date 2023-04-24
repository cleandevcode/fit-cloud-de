package cf;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import no.nordicsemi.android.dfu.DfuBaseService;
import ze.j;

/* loaded from: classes.dex */
public final class b extends we.a {
    /* JADX WARN: Code restructure failed: missing block: B:681:0x04c5, code lost:
        if (r3 < 0) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:688:0x04d2, code lost:
        if (r3 < 0) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:941:0x0a92, code lost:
        if (1 == we.a.b(r6, r1)) goto L475;
     */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0106 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:613:0x0238 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:755:0x0646 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:815:0x0761 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:872:0x089b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:911:0x09b8  */
    /* JADX WARN: Removed duplicated region for block: B:915:0x0a01  */
    /* JADX WARN: Removed duplicated region for block: B:919:0x0a28  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ze.a s(re.b r39) {
        /*
            Method dump skipped, instructions count: 2774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cf.b.s(re.b):ze.a");
    }

    public static ze.a t(re.b bVar) {
        boolean z10;
        int i10;
        te.a aVar;
        Context context = bVar.f25551a;
        int i11 = bVar.f25552b;
        String str = bVar.f25558h;
        bVar.a();
        int i12 = bVar.f25560j;
        j jVar = bVar.f25561k;
        boolean z11 = bVar.f25562l;
        boolean z12 = bVar.f25564n;
        try {
            InputStream open = context.getAssets().open(str);
            ze.a e10 = we.a.e(bVar);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            e10.f32232f = i11;
            me.a a10 = me.a.a(context, str, open, 0L);
            int i13 = 1;
            if (a10 != null) {
                if (a10.f20476d) {
                    e10.f32231e = true;
                    e10.f32232f = a10.f20478f;
                    e10.f32238l = a10.v(0);
                    e10.f32240n = a10.v(1);
                    e10.f32236j = 0;
                    if (z12 && !e10.a(i11)) {
                        return e10;
                    }
                    int i14 = 0;
                    z10 = false;
                    while (i14 < 16) {
                        int r10 = we.a.r(i14, jVar.N, jVar.Q);
                        if (r10 < 16) {
                            i10 = e10.f32236j | i13;
                        } else {
                            i10 = e10.f32236j | 2;
                        }
                        e10.f32236j = i10;
                        if (!re.a.f(i12, r10)) {
                            ge.b.n("image file disable: bitNumber=" + r10);
                        } else {
                            se.a s10 = a10.s(r10);
                            if (s10 != null) {
                                aVar = s10.b(context, e10.f32232f, bVar.f25570t);
                            } else {
                                aVar = null;
                            }
                            if (aVar != null) {
                                arrayList2.add(aVar);
                                if (z11 && 1 != we.a.h(aVar, r10, jVar)) {
                                    z10 = true;
                                } else {
                                    arrayList3.add(aVar);
                                    arrayList.add(s10);
                                }
                            }
                        }
                        i14++;
                        i13 = 1;
                    }
                    a10.k();
                } else {
                    ge.b.p("pack for MP can not be OTA");
                    throw new ne.b("not support pack file.", 4116);
                }
            } else {
                try {
                    te.a o10 = we.a.o(context, e10.f32232f, str, 0L, bVar.f25570t);
                    if (o10 != null) {
                        arrayList2.add(o10);
                        e10.f32232f = o10.f28052i & 255;
                        e10.f32233g = o10.f28055l;
                        if (z12 && !e10.a(i11)) {
                            return e10;
                        }
                        if (z11 && 1 != we.a.k(o10, jVar)) {
                            z10 = true;
                        }
                        arrayList3.add(o10);
                    }
                    z10 = false;
                } catch (IOException e11) {
                    ge.b.p(e11.toString());
                    throw new ne.b(e11.getMessage(), DfuBaseService.ERROR_FILE_NOT_FOUND);
                }
            }
            e10.f32239m = arrayList2;
            e10.f32242p = arrayList3;
            e10.f32241o = arrayList;
            if (z11 && z10 && arrayList3.size() < 1) {
                e10.f32235i = false;
                e10.f32234h = DfuBaseService.ERROR_INVALID_RESPONSE;
            }
            return e10;
        } catch (IOException e12) {
            ge.b.p(e12.toString());
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:199:0x021b, code lost:
        if (1 == we.a.b(r2, r3)) goto L105;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ze.a u(re.b r18) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cf.b.u(re.b):ze.a");
    }

    /* JADX WARN: Code restructure failed: missing block: B:1083:0x08da, code lost:
        if (r0 < 0) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1089:0x08e6, code lost:
        if (r0 < 0) goto L436;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1101:0x0940, code lost:
        if (r5.f32235i == false) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:778:0x01fa, code lost:
        if (r0 < 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:785:0x0207, code lost:
        if (r0 < 0) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:799:0x0265, code lost:
        if (r4.f32235i == false) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:1073:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:1077:0x08b3  */
    /* JADX WARN: Removed duplicated region for block: B:1081:0x08d6  */
    /* JADX WARN: Removed duplicated region for block: B:1087:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:1178:0x0b03  */
    /* JADX WARN: Removed duplicated region for block: B:1182:0x0b3e  */
    /* JADX WARN: Removed duplicated region for block: B:1188:0x0b65  */
    /* JADX WARN: Removed duplicated region for block: B:1194:0x0b7b  */
    /* JADX WARN: Removed duplicated region for block: B:1195:0x0b7f  */
    /* JADX WARN: Removed duplicated region for block: B:1200:0x0b95  */
    /* JADX WARN: Removed duplicated region for block: B:1256:0x0c91 A[Catch: IOException -> 0x0d1b, TryCatch #4 {IOException -> 0x0d1b, blocks: (B:1246:0x0c65, B:1248:0x0c75, B:1256:0x0c91, B:1260:0x0c9d, B:1267:0x0cc0, B:1262:0x0ca1, B:1265:0x0ca8, B:1266:0x0cbf, B:1268:0x0cc4, B:1269:0x0ccb, B:1270:0x0ccc, B:1271:0x0cd3, B:1273:0x0cd6, B:1277:0x0cdf, B:1281:0x0ceb, B:1283:0x0cf3, B:1285:0x0cfa, B:1251:0x0c87), top: B:1391:0x0c65 }] */
    /* JADX WARN: Removed duplicated region for block: B:1290:0x0d07 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:1309:0x0d4b  */
    /* JADX WARN: Removed duplicated region for block: B:1381:0x0e05  */
    /* JADX WARN: Removed duplicated region for block: B:893:0x041b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:986:0x0602 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ze.a v(re.b r41) {
        /*
            Method dump skipped, instructions count: 3634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cf.b.v(re.b):ze.a");
    }

    public static ze.a w(re.b bVar) {
        boolean z10;
        int i10 = bVar.f25552b;
        String str = bVar.f25558h;
        bVar.a();
        int i11 = bVar.f25560j;
        j jVar = bVar.f25561k;
        boolean z11 = bVar.f25562l;
        boolean z12 = bVar.f25564n;
        ze.a g10 = we.a.g(bVar);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        g10.f32232f = i10;
        if (le.b.b(bVar) != null) {
            ge.b.p("not support multi pack file");
            g10.f32235i = false;
            g10.f32230d = 4;
            g10.f32234h = 4103;
            return g10;
        }
        me.a b10 = me.a.b(str);
        if (b10 != null) {
            if (b10.f20476d) {
                ge.b.o(b10.toString(), we.a.f29795a);
                g10.f32230d = 2;
                g10.f32231e = true;
                g10.f32232f = b10.f20478f;
                g10.f32238l = b10.v(0);
                g10.f32240n = b10.v(1);
                g10.f32236j = 0;
                if (z12 && !g10.a(i10)) {
                    return g10;
                }
                Iterator it = b10.v(bVar.f25569s).iterator();
                z10 = false;
                while (it.hasNext()) {
                    se.a aVar = (se.a) it.next();
                    int d10 = aVar.d();
                    if (!re.a.f(i11, d10)) {
                        zd.b.a(android.support.v4.media.d.a("ignore prohibit upgrade image_id="), aVar.f26905j);
                    } else {
                        te.a c10 = aVar.c(g10.f32232f, bVar.f25570t);
                        if (c10 == null) {
                            boolean z13 = we.a.f29796b;
                            StringBuilder a10 = android.support.v4.media.d.a("invalid stream: ");
                            a10.append(aVar.toString());
                            ge.b.o(a10.toString(), z13);
                        } else {
                            arrayList2.add(c10);
                            if (z11 && 1 != we.a.h(c10, d10, jVar)) {
                                z10 = true;
                            } else {
                                arrayList3.add(c10);
                                arrayList.add(aVar);
                            }
                        }
                    }
                }
                b10.k();
            } else {
                ge.b.p("pack for MP can not be OTA");
                throw new ne.b("not support pack file.", 4116);
            }
        } else {
            g10.f32230d = 1;
            g10.f32236j = 0;
            try {
                te.a p10 = we.a.p(i10, bVar.f25570t, 0L, str);
                if (p10 != null) {
                    arrayList2.add(p10);
                    g10.f32232f = p10.f28052i & 255;
                    g10.f32233g = p10.f28055l;
                    if (z12 && !g10.a(i10)) {
                        return g10;
                    }
                    if (z11 && 1 != we.a.k(p10, jVar)) {
                        z10 = true;
                    } else {
                        arrayList3.add(p10);
                    }
                }
                z10 = false;
            } catch (IOException e10) {
                ge.b.p(e10.toString());
                throw new ne.b(e10.getMessage(), DfuBaseService.ERROR_FILE_NOT_FOUND);
            }
        }
        g10.f32239m = arrayList2;
        g10.f32242p = arrayList3;
        g10.f32241o = arrayList;
        if (z11 && z10 && arrayList3.size() < 1) {
            g10.f32235i = false;
            g10.f32234h = DfuBaseService.ERROR_INVALID_RESPONSE;
        }
        return g10;
    }

    public static ArrayList x(re.b bVar) {
        ze.a v10 = v(bVar);
        if (v10 != null && v10.f32234h == 4096) {
            return v10.f32242p;
        }
        return new ArrayList();
    }
}
