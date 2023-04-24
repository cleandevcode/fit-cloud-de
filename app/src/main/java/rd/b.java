package rd;

import android.content.Context;
import android.os.Build;
import java.util.Arrays;
import vd.c;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public static Context f25538a = null;

    /* renamed from: b */
    public static boolean f25539b = false;

    /* renamed from: c */
    public static boolean f25540c = false;

    public static synchronized void a(Context context, a aVar) {
        synchronized (b.class) {
            if (f25538a == null) {
                f25538a = context.getApplicationContext();
            }
            ge.b.o(String.format("%s:%s:%s", "com.realsil.sdk", "rtk-core", "unspecified"), true);
            f25539b = aVar.f25534a;
            f25540c = true;
            String str = aVar.f25536c;
            boolean z10 = aVar.f25535b;
            int i10 = aVar.f25537d;
            ge.b.f15314a = str;
            ge.b.f15315b = z10;
            ge.b.f15316c = i10;
            ge.b.d(aVar.toString());
            if (c.f29212m == null) {
                c.i(f25538a);
            }
            if (yd.b.f31446m == null) {
                yd.b.i(f25538a);
            }
            vd.b.g(f25538a);
            StringBuilder sb2 = new StringBuilder("DeviceInfo{");
            sb2.append("SDK_INT: " + Build.VERSION.SDK_INT);
            sb2.append("\nDevice name: " + Build.DEVICE);
            sb2.append("\nAndroid Version: " + Build.VERSION.RELEASE);
            sb2.append("\nManufacture: " + Build.MANUFACTURER);
            sb2.append("\nModel: " + Build.MODEL);
            sb2.append("\nsupportedABIS: " + Arrays.toString(Build.SUPPORTED_ABIS));
            sb2.append("}");
            ge.b.d(sb2.toString());
        }
    }
}
