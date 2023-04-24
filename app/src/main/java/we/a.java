package we;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import ke.g;
import no.nordicsemi.android.dfu.DfuBaseService;
import pe.d;
import pe.e;
import rm.l;
import ze.i;
import ze.j;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    public static boolean f29795a = ie.b.f16771a;

    /* renamed from: b */
    public static boolean f29796b = ie.b.f16772b;

    public static int a(te.a aVar, int i10, j jVar) {
        return (jVar == null || f(aVar, jVar.n(i10))) ? 1 : 2;
    }

    public static int b(te.a aVar, j jVar) {
        re.a a10;
        if (jVar == null || (a10 = ke.b.a(aVar.f28058o)) == null) {
            return 1;
        }
        ge.b.n(a10.toString());
        if (!a10.f25547e) {
            ge.b.e("not support version check , ignore section size", f29795a);
            return 1;
        } else if (f(aVar, jVar.m(a10.f25543a))) {
            return 1;
        } else {
            return 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int c(te.a r18, ze.j r19, int r20) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: we.a.c(te.a, ze.j, int):int");
    }

    public static te.a d(int i10, InputStream inputStream, long j10, int i11) {
        if (f29796b) {
            ge.b.n(String.format(Locale.US, "icType=0x%02X, skipOffset=%d,imageHeadsetOffset=%d", Integer.valueOf(i10), Long.valueOf(j10), Integer.valueOf(i11)));
        }
        inputStream.skip(j10);
        if (i10 <= 3) {
            return new pe.c(inputStream, i11);
        }
        if (i10 == 4 || i10 == 6 || i10 == 7 || i10 == 8) {
            return new pe.b(inputStream, i11);
        }
        if (i10 == 11 || i10 == 10 || i10 == 13) {
            return new pe.a(inputStream);
        }
        if (i10 == 5 || i10 == 9 || i10 == 12 || i10 == 14 || i10 == 15) {
            return new d(inputStream, i11);
        }
        if (i10 == 16) {
            return new e(inputStream, i11);
        }
        ge.b.n(String.format("not support icType=0x%02X", Integer.valueOf(i10)));
        return null;
    }

    public static ze.a e(re.b bVar) {
        if (bVar.f25551a != null) {
            String str = bVar.f25558h;
            if (!TextUtils.isEmpty(str)) {
                String a10 = bVar.a();
                String a11 = he.b.a(str);
                if (a11 != null && a11.equalsIgnoreCase(a10)) {
                    ze.a aVar = new ze.a();
                    aVar.f32227a = str;
                    int lastIndexOf = str.lastIndexOf("/");
                    if (lastIndexOf != -1) {
                        if (lastIndexOf != 0) {
                            str.substring(0, lastIndexOf + 1);
                        }
                        str = str.substring(lastIndexOf + 1);
                    }
                    aVar.f32228b = str;
                    aVar.f32237k = bVar.f25569s;
                    return aVar;
                }
                ge.b.p("invalid suffix: " + a11);
                throw new ne.b("invalid suffix", DfuBaseService.ERROR_FILE_INVALID);
            }
            throw new ne.b("invalid path: ", DfuBaseService.ERROR_FILE_ERROR);
        }
        throw new ne.b("invalid context", DfuBaseService.ERROR_FILE_NOT_FOUND);
    }

    public static boolean f(te.a aVar, i iVar) {
        if (iVar == null) {
            return true;
        }
        int i10 = aVar.f28056m;
        int i11 = iVar.f32339e;
        if (i11 > 0 && i10 > i11) {
            ge.b.p(String.format(Locale.US, "image size(%d) is exceed the limit of section size(%d)", Integer.valueOf(i10), Integer.valueOf(iVar.f32339e)));
            return false;
        }
        boolean z10 = f29796b;
        ge.b.o("section size validate ok: " + i10, z10);
        return true;
    }

    public static ze.a g(re.b bVar) {
        String str = bVar.f25558h;
        if (!TextUtils.isEmpty(str)) {
            String a10 = bVar.a();
            String a11 = he.b.a(str);
            if (a11 != null && a11.equalsIgnoreCase(a10)) {
                File file = new File(str);
                if (file.exists()) {
                    ze.a aVar = new ze.a();
                    aVar.f32227a = file.getPath();
                    aVar.f32228b = file.getName();
                    aVar.f32229c = file.length();
                    aVar.f32237k = bVar.f25569s;
                    return aVar;
                }
                throw new ne.b("image file not exist", DfuBaseService.ERROR_FILE_IO_EXCEPTION);
            }
            ge.b.p("invalid suffix: " + a11);
            throw new ne.b("invalid suffix", DfuBaseService.ERROR_FILE_INVALID);
        }
        throw new ne.b("invalid path: ", DfuBaseService.ERROR_FILE_ERROR);
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x002a, code lost:
        if (r12 != 21) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0178, code lost:
        if (r12 != 21) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int h(te.a r11, int r12, ze.j r13) {
        /*
            Method dump skipped, instructions count: 704
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: we.a.h(te.a, int, ze.j):int");
    }

    public static int i(re.a aVar, te.a aVar2, j jVar) {
        if (aVar == null || jVar == null) {
            return 1;
        }
        ge.b.d(aVar.toString());
        i n10 = jVar.n(aVar2.f28053j);
        if (n10 == null) {
            return 1;
        }
        int i10 = aVar2.f28055l;
        int i11 = aVar.f25548f;
        if (m(i10, i11, n10.f32338d, jVar.f32262l, i11) <= 0) {
            ge.b.p(String.format(Locale.US, "image: bitNumber=%d, file(%08X)<device(%08X)", Integer.valueOf(aVar.f25543a), Integer.valueOf(aVar2.f28055l), Integer.valueOf(n10.f32338d)));
            return -1;
        }
        zd.b.a(android.support.v4.media.d.a("version validate ok: "), aVar2.f28055l);
        return 1;
    }

    public static int j(te.a aVar, j jVar) {
        String format;
        if (jVar == null) {
            return 1;
        }
        int i10 = aVar.f28058o;
        int i11 = aVar.f28055l;
        if (jVar.f32262l == 0) {
            int i12 = jVar.f32261k;
            if (i12 <= 3) {
                ge.b.n("not support version check for bee1 when otaVersion=0");
                return 1;
            } else if (i12 != 4 && i12 != 6 && i12 != 7 && i12 != 8) {
                if (i12 == 5 || i12 == 9 || i12 == 12) {
                    if (i10 != 512) {
                        if (i10 == 768 && i11 < jVar.o()) {
                            format = String.format(Locale.US, "app iamge : file(%08X)<device(%08X)", Integer.valueOf(i11), Integer.valueOf(jVar.o()));
                            ge.b.p(format);
                            return -1;
                        }
                    } else if (i11 < jVar.q()) {
                        format = String.format(Locale.US, "patch iamge: file(%08X)<device(%08X)", Integer.valueOf(i11), Integer.valueOf(jVar.q()));
                        ge.b.p(format);
                        return -1;
                    }
                }
                return 1;
            } else if (i10 != 512) {
                if (i10 == 768 && i11 < jVar.o()) {
                    format = String.format(Locale.US, "app iamge: file(%08X)<device(%08X)", Integer.valueOf(i11), Integer.valueOf(jVar.o()));
                    ge.b.p(format);
                    return -1;
                }
                return 1;
            } else {
                if (i11 < jVar.q()) {
                    format = String.format(Locale.US, "patch iamge : file(%08X)<device(%08X)", Integer.valueOf(i11), Integer.valueOf(jVar.q()));
                    ge.b.p(format);
                    return -1;
                }
                return 1;
            }
        }
        return k(aVar, jVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int k(te.a r8, ze.j r9) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: we.a.k(te.a, ze.j):int");
    }

    public static int l(int i10, int i11, int i12) {
        g b10 = g.b(i12, i10);
        g b11 = g.b(i12, i11);
        ge.b.n(b10.toString());
        ge.b.n(b11.toString());
        return b10.a(b11);
    }

    public static int m(int i10, int i11, int i12, int i13, int i14) {
        ge.b.n(String.format(Locale.US, "checkVersion: bin=%08X(%d) %s, soc=%08X(%d) %s", Integer.valueOf(i10), Integer.valueOf(i10), p001if.d.d(i11, i10, i14), Integer.valueOf(i12), Integer.valueOf(i12), p001if.d.d(i13, i12, i14)));
        if (i12 == -1) {
            return 1;
        }
        if (i11 <= 0) {
            int a10 = l.a(i12, i13, i14);
            if (i10 > a10) {
                return 1;
            }
            return i10 == a10 ? 0 : -1;
        } else if (i13 <= 0) {
            int a11 = l.a(i10, i11, i14);
            if (a11 > i12) {
                return 1;
            }
            return a11 == i12 ? 0 : -1;
        } else {
            return g.b(i14, i10).a(g.b(i14, i12));
        }
    }

    public static int n(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, boolean z10) {
        if (i14 == 2 && i11 == 1040) {
            i18 = 516;
        }
        if (i14 <= 0) {
            i18 = 7;
        }
        return g.b(i18, i13).a(g.b(ue.a.C(i10, i15, i17, i12, z10), i16));
    }

    public static te.a o(Context context, int i10, String str, long j10, int i11) {
        ge.b.o(String.format(Locale.US, "fileName=%s, icType=%d", str, Integer.valueOf(i10)), f29796b);
        AssetManager assets = context.getAssets();
        if (assets == null) {
            ge.b.p("assetManager is null");
            return null;
        }
        InputStream open = assets.open(str);
        if (open == null) {
            ge.b.d("open asset file failed");
            return null;
        }
        return d(i10, open, j10, i11);
    }

    public static te.a p(int i10, int i11, long j10, String str) {
        return d(i10, new FileInputStream(str), j10, i11);
    }

    public static byte[] q(int i10, int i11, String str) {
        te.a aVar;
        try {
            aVar = p(i10, i11, 0L, str);
        } catch (IOException e10) {
            e10.printStackTrace();
            aVar = null;
        }
        if (aVar == null) {
            return null;
        }
        aVar.k();
        byte[] bArr = aVar.f28067x;
        try {
            aVar.close();
        } catch (Exception e11) {
            ge.b.f(e11.toString());
        }
        return bArr;
    }

    public static int r(int i10, int i11, int i12) {
        int i13 = (i11 >> (i10 * 2)) & 3;
        if (i13 == 0) {
            if (i12 != 2) {
                return i10;
            }
        } else if (i13 != 1) {
            return i10;
        }
        return i10 + 16;
    }
}
