package fc;

import android.content.Context;
import android.content.pm.PackageManager;
import s.h1;

/* loaded from: classes.dex */
public final class c {
    public static String a(String str) {
        String str2;
        StringBuilder sb2;
        String str3;
        Context context = h1.f25978c;
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            e = e10;
            sb2 = new StringBuilder();
            str3 = "getVersion NameNotFoundException : ";
            sb2.append(str3);
            sb2.append(e.getMessage());
            str2 = sb2.toString();
            p.b.c("h", str2);
            return "";
        } catch (Exception e11) {
            e = e11;
            sb2 = new StringBuilder();
            str3 = "getVersion: ";
            sb2.append(str3);
            sb2.append(e.getMessage());
            str2 = sb2.toString();
            p.b.c("h", str2);
            return "";
        } catch (Throwable unused) {
            str2 = "throwable";
            p.b.c("h", str2);
            return "";
        }
    }
}
