package com.huawei.hms.framework.common;

import com.huawei.android.os.BuildEx;

/* loaded from: classes.dex */
public class EmuiUtil {
    public static final String BUILDEX_VERSION = "com.huawei.android.os.BuildEx$VERSION";
    public static final String EMUI_SDK_INT = "EMUI_SDK_INT";
    public static final String GET_PRIMARY_COLOR = "getPrimaryColor";
    public static final String GET_SUGGESTION_FOR_GROUND_COLOR_STYLE = "getSuggestionForgroundColorStyle";
    public static final String IMMERSION_STYLE = "com.huawei.android.immersion.ImmersionStyle";

    /* renamed from: a */
    public static int f7030a = -1;

    /* JADX WARN: Removed duplicated region for block: B:61:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    static {
        /*
            int r0 = getEMUIVersionCode()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getEmuiType emuiVersionCode="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "KPMS_Util_Emui"
            com.huawei.hms.framework.common.Logger.d(r2, r1)
            r1 = 17
            if (r0 < r1) goto L21
            r0 = 90
            goto L50
        L21:
            r1 = 15
            if (r0 < r1) goto L28
            r0 = 81
            goto L50
        L28:
            r1 = 14
            if (r0 < r1) goto L2f
            r0 = 60
            goto L50
        L2f:
            r1 = 11
            if (r0 < r1) goto L36
            r0 = 50
            goto L50
        L36:
            r1 = 10
            if (r0 < r1) goto L3d
            r0 = 41
            goto L50
        L3d:
            r1 = 9
            if (r0 < r1) goto L44
            r0 = 40
            goto L50
        L44:
            r1 = 8
            if (r0 < r1) goto L4b
            r0 = 31
            goto L50
        L4b:
            r1 = 7
            if (r0 < r1) goto L52
            r0 = 30
        L50:
            com.huawei.hms.framework.common.EmuiUtil.f7030a = r0
        L52:
            int r0 = com.huawei.hms.framework.common.EmuiUtil.f7030a
            r1 = -1
            if (r0 != r1) goto L5c
            java.lang.String r0 = "emuiType is unkown"
            com.huawei.hms.framework.common.Logger.i(r2, r0)
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.common.EmuiUtil.<clinit>():void");
    }

    public static int getEMUIVersionCode() {
        int intValue;
        Object staticFieldObj = ReflectionUtils.getStaticFieldObj(BUILDEX_VERSION, EMUI_SDK_INT);
        if (staticFieldObj != null) {
            try {
                intValue = ((Integer) staticFieldObj).intValue();
            } catch (ClassCastException e10) {
                Logger.e("KPMS_Util_Emui", "getEMUIVersionCode ClassCastException:", e10);
            }
            Logger.d("KPMS_Util_Emui", "the emui version code is::" + intValue);
            return intValue;
        }
        intValue = 0;
        Logger.d("KPMS_Util_Emui", "the emui version code is::" + intValue);
        return intValue;
    }

    public static boolean isEMUI() {
        return -1 != f7030a;
    }

    public static boolean isUpPVersion() {
        if (ReflectionUtils.checkCompatible("com.huawei.android.os.BuildEx")) {
            StringBuilder a10 = android.support.v4.media.d.a("com.huawei.android.os.BuildEx.VERSION.EMUI_SDK_INT: ");
            a10.append(BuildEx.VERSION.EMUI_SDK_INT);
            Logger.d("KPMS_Util_Emui", a10.toString());
            if (BuildEx.VERSION.EMUI_SDK_INT < 17) {
                return false;
            }
            return true;
        }
        Logger.w("KPMS_Util_Emui", "com.huawei.android.os.BuildEx : false");
        return false;
    }
}
