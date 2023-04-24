package g4;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* loaded from: classes.dex */
public final /* synthetic */ class g {
    public static String a(String str, Object obj) {
        return str + obj;
    }

    public static /* synthetic */ String b(int i10) {
        return i10 == 1 ? GrsBaseInfo.CountryCodeSource.UNKNOWN : i10 == 2 ? "HORIZONTAL_DIMENSION" : i10 == 3 ? "VERTICAL_DIMENSION" : i10 == 4 ? "LEFT" : i10 == 5 ? "RIGHT" : i10 == 6 ? "TOP" : i10 == 7 ? "BOTTOM" : i10 == 8 ? "BASELINE" : "null";
    }
}
