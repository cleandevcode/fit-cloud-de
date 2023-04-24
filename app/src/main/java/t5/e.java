package t5;

import android.util.Log;
import gm.l;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    public static final e f27787a = new e();

    /* renamed from: b */
    public static final String f27788b = e.class.getCanonicalName();

    /* renamed from: c */
    public static Class<?> f27789c;

    public static final void a(String str, String str2) {
        try {
            if (f27789c == null) {
                f27787a.getClass();
                f27789c = Class.forName("com.unity3d.player.UnityPlayer");
            }
            Class<?> cls = f27789c;
            if (cls != null) {
                Method method = cls.getMethod("UnitySendMessage", String.class, String.class, String.class);
                l.e(method, "unityPlayer.getMethod(\n              UNITY_SEND_MESSAGE_METHOD, String::class.java, String::class.java, String::class.java)");
                Class<?> cls2 = f27789c;
                if (cls2 != null) {
                    method.invoke(cls2, "UnityFacebookSDKPlugin", str, str2);
                    return;
                } else {
                    l.l("unityPlayer");
                    throw null;
                }
            }
            l.l("unityPlayer");
            throw null;
        } catch (Exception e10) {
            Log.e(f27788b, "Failed to send message to Unity", e10);
        }
    }
}
