package yb;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class j0 {
    public static boolean a(String str, String str2) {
        StringBuilder sb2;
        String str3;
        if (TextUtils.isEmpty(str2)) {
            sb2 = new StringBuilder();
            str3 = "checkString() Parameter is empty : ";
        } else if (str2.length() <= 256) {
            return true;
        } else {
            sb2 = new StringBuilder();
            str3 = "checkString() Failure of parameter length check! Parameter:";
        }
        sb2.append(str3);
        sb2.append(str);
        m2.f.h("hmsSdk", sb2.toString());
        return false;
    }
}
