package x5;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    public static final /* synthetic */ int f30297a = 0;

    static {
        new e();
    }

    public static final String a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i10 = 0;
        while (i10 < length) {
            byte b10 = bArr[i10];
            i10++;
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
            gm.l.e(format, "java.lang.String.format(format, *args)");
            stringBuffer.append(format);
        }
        String stringBuffer2 = stringBuffer.toString();
        gm.l.e(stringBuffer2, "sb.toString()");
        return stringBuffer2;
    }

    public static final View b(Activity activity) {
        if (i6.a.b(e.class) || activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            return window.getDecorView().getRootView();
        } catch (Exception unused) {
            return null;
        } catch (Throwable th2) {
            i6.a.a(e.class, th2);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x005e, code lost:
        if (om.h.a0(r0, "generic", false) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean c() {
        /*
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r1 = "FINGERPRINT"
            gm.l.e(r0, r1)
            java.lang.String r1 = "generic"
            r2 = 0
            boolean r3 = om.h.a0(r0, r1, r2)
            if (r3 != 0) goto L68
            java.lang.String r3 = "unknown"
            boolean r0 = om.h.a0(r0, r3, r2)
            if (r0 != 0) goto L68
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r3 = "MODEL"
            gm.l.e(r0, r3)
            java.lang.String r3 = "google_sdk"
            boolean r4 = om.l.c0(r0, r3, r2)
            if (r4 != 0) goto L68
            java.lang.String r4 = "Emulator"
            boolean r4 = om.l.c0(r0, r4, r2)
            if (r4 != 0) goto L68
            java.lang.String r4 = "Android SDK built for x86"
            boolean r0 = om.l.c0(r0, r4, r2)
            if (r0 != 0) goto L68
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r4 = "MANUFACTURER"
            gm.l.e(r0, r4)
            java.lang.String r4 = "Genymotion"
            boolean r0 = om.l.c0(r0, r4, r2)
            if (r0 != 0) goto L68
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r4 = "BRAND"
            gm.l.e(r0, r4)
            boolean r0 = om.h.a0(r0, r1, r2)
            if (r0 == 0) goto L60
            java.lang.String r0 = android.os.Build.DEVICE
            java.lang.String r4 = "DEVICE"
            gm.l.e(r0, r4)
            boolean r0 = om.h.a0(r0, r1, r2)
            if (r0 != 0) goto L68
        L60:
            java.lang.String r0 = android.os.Build.PRODUCT
            boolean r0 = gm.l.a(r3, r0)
            if (r0 == 0) goto L69
        L68:
            r2 = 1
        L69:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.e.c():boolean");
    }
}
