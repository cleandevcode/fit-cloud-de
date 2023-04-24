package rm;

import android.content.Context;
import android.util.Log;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.s0;
import bi.z0;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.logging.Logger;
import pm.a2;
import pm.e0;
import pm.o0;
import v1.d;
import yb.f0;
import yb.k0;
import yb.p0;

/* loaded from: classes2.dex */
public final /* synthetic */ class l {
    public static int a(int i10, int i11, int i12) {
        if (i11 <= 0) {
            return i10;
        }
        if (i12 == 1) {
            return (i10 >> 24) & 255;
        }
        if (i12 == 515) {
            return (i10 & 255) | ((i10 >> 8) & 255);
        } else if (i12 == 2) {
            return i10 & 255;
        } else {
            if (i12 == 3) {
                return (i10 >> 27) & 31;
            }
            if (i12 == 5) {
                return (i10 >> 21) & 2047;
            }
            if (i12 == 4 || i12 == 7 || i12 != 514) {
                return i10;
            }
            return (i10 & 255) | ((i10 >> 8) & 255);
        }
    }

    public static byte[] b(String str, String str2, String str3) {
        int i10;
        byte[] bArr = new byte[16];
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int i11 = 8;
        if (bytes.length >= 8) {
            for (int i12 = 0; i12 < 8; i12++) {
                bArr[i12] = bytes[i12];
            }
            byte[] bytes2 = str2.getBytes(StandardCharsets.UTF_8);
            if (bytes2.length >= 4) {
                while (true) {
                    if (i11 >= 12) {
                        break;
                    }
                    bArr[i11] = bytes2[i11 - 8];
                    i11++;
                }
                byte[] bytes3 = str3.getBytes(StandardCharsets.UTF_8);
                if (bytes3.length >= 4) {
                    for (i10 = 12; i10 < 16; i10++) {
                        bArr[i10] = bytes3[i10 - 12];
                    }
                    return bArr;
                }
                throw new Exception("pk 小于4个字节");
            }
            throw new Exception("ts 小于4个字节");
        }
        throw new Exception("sonce 小于8字节");
    }

    public static int c(hb.b bVar, boolean z10) {
        int i10;
        int i11;
        byte b10;
        if (z10) {
            i10 = bVar.f16075c;
        } else {
            i10 = bVar.f16074b;
        }
        if (z10) {
            i11 = bVar.f16074b;
        } else {
            i11 = bVar.f16075c;
        }
        byte[][] bArr = bVar.f16073a;
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            byte b11 = -1;
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                if (z10) {
                    b10 = bArr[i13][i15];
                } else {
                    b10 = bArr[i15][i13];
                }
                if (b10 == b11) {
                    i14++;
                } else {
                    if (i14 >= 5) {
                        i12 += (i14 - 5) + 3;
                    }
                    b11 = b10;
                    i14 = 1;
                }
            }
            if (i14 >= 5) {
                i12 = (i14 - 5) + 3 + i12;
            }
        }
        return i12;
    }

    public static void d() {
        String str;
        p0 p0Var = m2.f.f20193a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(System.lineSeparator());
        sb2.append("======================================= ");
        sb2.append(System.lineSeparator());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("FormalHASDK_2.2.0.313");
        if (!yb.v.f31396a.booleanValue()) {
            str = "";
        } else {
            str = "-dev";
        }
        sb3.append(str);
        sb2.append(sb3.toString());
        sb2.append("");
        sb2.append(System.lineSeparator());
        sb2.append("=======================================");
        Log.i("FormalHASDK", sb2.toString());
        p0Var.f31374b = 3;
        p0Var.f31373a = true;
    }

    public static int e(float[] fArr, int[] iArr, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < 6; i11++) {
            int ceil = (int) Math.ceil(fArr[i11]);
            iArr[i11] = ceil;
            if (i10 > ceil) {
                Arrays.fill(bArr, (byte) 0);
                i10 = ceil;
            }
            if (i10 == ceil) {
                bArr[i11] = (byte) (bArr[i11] + 1);
            }
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:218:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x023e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static a0.r1 f(t.t r9) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rm.l.f(t.t):a0.r1");
    }

    public static final LifecycleCoroutineScopeImpl g(androidx.lifecycle.u uVar) {
        gm.l.f(uVar, "<this>");
        androidx.lifecycle.v a02 = uVar.a0();
        gm.l.e(a02, "lifecycle");
        return tb.a.g(a02);
    }

    public static final e0 h(s0 s0Var) {
        Object obj;
        Object obj2;
        gm.l.f(s0Var, "<this>");
        HashMap hashMap = s0Var.f2780a;
        if (hashMap == null) {
            obj2 = null;
        } else {
            synchronized (hashMap) {
                obj = s0Var.f2780a.get("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
            }
            obj2 = obj;
        }
        e0 e0Var = (e0) obj2;
        if (e0Var != null) {
            return e0Var;
        }
        a2 a10 = z0.a();
        wm.c cVar = o0.f24381a;
        return (e0) s0Var.d(new androidx.lifecycle.d(a10.s(um.q.f28935a.q0())), "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
    }

    public static void i(char c10) {
        String hexString;
        throw new IllegalArgumentException("Illegal character: " + c10 + " (0x" + ("0000".substring(0, 4 - hexString.length()) + Integer.toHexString(c10)) + ')');
    }

    public static void j(Context context, String str, String str2) {
        yb.b0 b0Var = new yb.b0(context);
        m2.f.b("Builder.setEnableImei(boolean isReportAndroidImei) is execute.");
        ((yb.w) b0Var.f31279c).f31403g.f31389a = false;
        ((yb.w) b0Var.f31280d).f31403g.f31389a = false;
        m2.f.b("Builder.setEnableUDID(boolean isReportUDID) is execute.");
        ((yb.w) b0Var.f31279c).f31403g.f31391c = false;
        ((yb.w) b0Var.f31280d).f31403g.f31391c = false;
        m2.f.b("Builder.setEnableSN(boolean isReportSN) is execute.");
        ((yb.w) b0Var.f31279c).f31403g.f31390b = false;
        ((yb.w) b0Var.f31280d).f31403g.f31390b = false;
        b0Var.b(0, str);
        b0Var.b(1, str);
        m2.f.b("Builder.setAppID is execute");
        b0Var.f31278b = str2;
        b0Var.a();
    }

    public static final d.a k(String str) {
        gm.l.f(str, "name");
        return new d.a(str);
    }

    public static final boolean l(AssertionError assertionError) {
        boolean z10;
        Logger logger = ln.o.f20118a;
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        if (message != null) {
            z10 = om.l.c0(message, "getsockname failed", false);
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    public static boolean m(char c10) {
        return c10 >= 128 && c10 <= 255;
    }

    public static boolean n(char c10) {
        return (c10 == '\r' || c10 == '*' || c10 == '>') || c10 == ' ' || (c10 >= '0' && c10 <= '9') || (c10 >= 'A' && c10 <= 'Z');
    }

    public static int o(String str, int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i12;
        boolean z14;
        if (i10 >= str.length()) {
            return i11;
        }
        float[] fArr = {1.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.25f};
        if (i11 == 0) {
            // fill-array-data instruction
            fArr[0] = 0.0f;
            fArr[1] = 1.0f;
            fArr[2] = 1.0f;
            fArr[3] = 1.0f;
            fArr[4] = 1.0f;
            fArr[5] = 1.25f;
        } else {
            fArr[i11] = 0.0f;
        }
        int i13 = 0;
        while (true) {
            int i14 = i10 + i13;
            if (i14 == str.length()) {
                byte[] bArr = new byte[6];
                int[] iArr = new int[6];
                int e10 = e(fArr, iArr, bArr);
                int i15 = 0;
                for (int i16 = 0; i16 < 6; i16++) {
                    i15 += bArr[i16];
                }
                if (iArr[0] == e10) {
                    return 0;
                }
                if (i15 == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (i15 == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (i15 == 1 && bArr[2] > 0) {
                    return 2;
                }
                if (i15 == 1 && bArr[3] > 0) {
                    return 3;
                }
                return 1;
            }
            char charAt = str.charAt(i14);
            i13++;
            if (charAt >= '0' && charAt <= '9') {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (m(charAt)) {
                float ceil = (float) Math.ceil(fArr[0]);
                fArr[0] = ceil;
                fArr[0] = ceil + 2.0f;
            } else {
                float ceil2 = (float) Math.ceil(fArr[0]);
                fArr[0] = ceil2;
                fArr[0] = ceil2 + 1.0f;
            }
            if (charAt != ' ' && ((charAt < '0' || charAt > '9') && (charAt < 'A' || charAt > 'Z'))) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (m(charAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (charAt != ' ' && ((charAt < '0' || charAt > '9') && (charAt < 'a' || charAt > 'z'))) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (z12) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (m(charAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (n(charAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (m(charAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (charAt >= ' ' && charAt <= '^') {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                i12 = 4;
                fArr[4] = fArr[4] + 0.75f;
            } else {
                i12 = 4;
                if (m(charAt)) {
                    fArr[4] = fArr[4] + 4.25f;
                } else {
                    fArr[4] = fArr[4] + 3.25f;
                }
            }
            fArr[5] = fArr[5] + 1.0f;
            if (i13 >= i12) {
                int[] iArr2 = new int[6];
                byte[] bArr2 = new byte[6];
                e(fArr, iArr2, bArr2);
                int i17 = 0;
                for (int i18 = 0; i18 < 6; i18++) {
                    i17 += bArr2[i18];
                }
                int i19 = iArr2[0];
                int i20 = iArr2[5];
                if (i19 < i20 && i19 < iArr2[1] && i19 < iArr2[2] && i19 < iArr2[3] && i19 < iArr2[4]) {
                    return 0;
                }
                if (i20 >= i19) {
                    byte b10 = bArr2[1];
                    byte b11 = bArr2[2];
                    byte b12 = bArr2[3];
                    byte b13 = bArr2[4];
                    if (b10 + b11 + b12 + b13 != 0) {
                        if (i17 == 1 && b13 > 0) {
                            return 4;
                        }
                        if (i17 == 1 && b11 > 0) {
                            return 2;
                        }
                        if (i17 == 1 && b12 > 0) {
                            return 3;
                        }
                        int i21 = iArr2[1];
                        int i22 = i21 + 1;
                        if (i22 < i19 && i22 < i20 && i22 < iArr2[4] && i22 < iArr2[2]) {
                            int i23 = iArr2[3];
                            if (i21 < i23) {
                                return 1;
                            }
                            if (i21 == i23) {
                                for (int i24 = i10 + i13 + 1; i24 < str.length(); i24++) {
                                    char charAt2 = str.charAt(i24);
                                    if (charAt2 != '\r' && charAt2 != '*' && charAt2 != '>') {
                                        z14 = false;
                                    } else {
                                        z14 = true;
                                    }
                                    if (z14) {
                                        return 3;
                                    }
                                    if (!n(charAt2)) {
                                        break;
                                    }
                                }
                                return 1;
                            }
                        }
                    } else {
                        return 5;
                    }
                } else {
                    return 5;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x014f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void p(java.util.LinkedHashMap r13, java.lang.String r14, int r15) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rm.l.p(java.util.LinkedHashMap, java.lang.String, int):void");
    }

    public static void q() {
        d6.b0 b0Var;
        synchronized (yb.y.class) {
            if (yb.y.f31418a == null) {
                yb.y.f31418a = f0.f31300b.f31301a;
            }
            b0Var = yb.y.f31418a;
        }
        if (b0Var != null && k0.f31336c.a()) {
            d6.b0 b0Var2 = yb.y.f31418a;
            b0Var2.getClass();
            m2.f.d("onReport. TAG: " + ((String) b0Var2.f12641a) + ", TYPE: -1");
            yb.q a10 = yb.q.a();
            String str = (String) b0Var2.f12641a;
            a10.getClass();
            yb.n a11 = yb.n.a();
            if (a11.f31354a == null) {
                m2.f.e("hmsSdk", "onReport() null context or SDK was not init.");
                return;
            }
            m2.f.b("onReport: Before calling runtaskhandler()");
            a11.d(str, "alltype", yb.r.a().f31380a.f31424e);
        }
    }

    public static final double r(String str, int i10, RoundingMode roundingMode) {
        BigDecimal scale = new BigDecimal(str).setScale(i10, roundingMode);
        gm.l.e(scale, "bd.setScale(scale, mode)");
        return scale.doubleValue();
    }

    public static final float s(float f10) {
        return (float) r(String.valueOf(f10), 1, RoundingMode.DOWN);
    }

    public static final float t(float f10) {
        return (float) r(String.valueOf(f10), 1, RoundingMode.HALF_UP);
    }

    public static final ln.c u(Socket socket) {
        Logger logger = ln.o.f20118a;
        ln.x xVar = new ln.x(socket);
        OutputStream outputStream = socket.getOutputStream();
        gm.l.e(outputStream, "getOutputStream()");
        return new ln.c(xVar, new ln.q(outputStream, xVar));
    }

    public static final ln.d v(Socket socket) {
        Logger logger = ln.o.f20118a;
        ln.x xVar = new ln.x(socket);
        InputStream inputStream = socket.getInputStream();
        gm.l.e(inputStream, "getInputStream()");
        return new ln.d(xVar, new ln.n(inputStream, xVar));
    }

    public static final d.a w(String str) {
        gm.l.f(str, "name");
        return new d.a(str);
    }
}
