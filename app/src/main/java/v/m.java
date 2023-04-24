package v;

import a0.q1;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public final class m implements q1 {

    /* renamed from: a */
    public static final HashMap f28963a;

    static {
        HashMap hashMap = new HashMap();
        f28963a = hashMap;
        hashMap.put("SM-T580", null);
        hashMap.put("SM-J710MN", new Range(21, 26));
        hashMap.put("SM-A320FL", null);
        hashMap.put("SM-G570M", null);
        hashMap.put("SM-G610F", null);
        hashMap.put("SM-G610M", new Range(21, 26));
    }

    public static Size a(int i10) {
        if (b()) {
            if (i10 != 0) {
                int i11 = i10 - 1;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            return null;
                        }
                        return new Size(3264, 1836);
                    }
                    return new Size(1280, 720);
                }
                return new Size(1920, 1080);
            }
            throw null;
        }
        return null;
    }

    public static boolean b() {
        if ("samsung".equalsIgnoreCase(Build.BRAND) && f28963a.containsKey(Build.MODEL.toUpperCase(Locale.US))) {
            Range range = (Range) f28963a.get(Build.MODEL.toUpperCase(Locale.US));
            if (range == null) {
                return true;
            }
            return range.contains((Range) Integer.valueOf(Build.VERSION.SDK_INT));
        }
        return false;
    }
}
