package a0;

import android.util.ArrayMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class d2 {

    /* renamed from: b */
    public static final d2 f45b = new d2(new ArrayMap());

    /* renamed from: a */
    public final Map<String, Object> f46a;

    public d2(ArrayMap arrayMap) {
        this.f46a = arrayMap;
    }

    public final Object a(String str) {
        return this.f46a.get(str);
    }

    public final Set<String> b() {
        return this.f46a.keySet();
    }

    public final String toString() {
        return "android.hardware.camera2.CaptureRequest.setTag.CX";
    }
}
