package p3;

import android.content.ComponentName;
import android.content.Context;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    public static final String f23806a = f3.m.e("PackageManagerHelper");

    public static void a(Context context, Class<?> cls, boolean z10) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z10 ? 1 : 2, 1);
            f3.m c10 = f3.m.c();
            String str = f23806a;
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            objArr[1] = z10 ? "enabled" : "disabled";
            c10.a(str, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e10) {
            f3.m c11 = f3.m.c();
            String str2 = f23806a;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            objArr2[1] = z10 ? "enabled" : "disabled";
            c11.a(str2, String.format("%s could not be %s", objArr2), e10);
        }
    }
}
