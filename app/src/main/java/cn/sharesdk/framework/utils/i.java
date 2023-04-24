package cn.sharesdk.framework.utils;

import android.content.Context;
import com.mob.tools.utils.ResHelper;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a */
    public static float f5314a = 1.5f;

    /* renamed from: b */
    public static int f5315b = 540;

    /* renamed from: c */
    private static Context f5316c;

    public static int a(int i10) {
        return ResHelper.designToDevice(f5316c, f5314a, i10);
    }

    public static void a(Context context) {
        Context context2 = f5316c;
        if (context2 == null || context2 != context.getApplicationContext()) {
            f5316c = context;
        }
    }

    public static int b(int i10) {
        return ResHelper.designToDevice(f5316c, f5315b, i10);
    }
}
