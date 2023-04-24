package f6;

import d6.m0;
import gm.l;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Iterator;
import o5.v;
import o5.y;
import om.h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f {
    public static final void a(String str) {
        File b10 = b();
        if (b10 == null || str == null) {
            return;
        }
        new File(b10, str).delete();
    }

    public static final File b() {
        File file = new File(v.a().getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public static final boolean c(Thread thread) {
        StackTraceElement[] stackTrace = thread.getStackTrace();
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                l.e(className, "element.className");
                if (h.a0(className, "com.facebook", false)) {
                    String className2 = stackTraceElement.getClassName();
                    l.e(className2, "element.className");
                    if (!h.a0(className2, "com.facebook.appevents.codeless", false)) {
                        String className3 = stackTraceElement.getClassName();
                        l.e(className3, "element.className");
                        if (!h.a0(className3, "com.facebook.appevents.suggestedevents", false)) {
                            return true;
                        }
                    }
                    String methodName = stackTraceElement.getMethodName();
                    l.e(methodName, "element.methodName");
                    if (h.a0(methodName, "onClick", false)) {
                        continue;
                    } else {
                        String methodName2 = stackTraceElement.getMethodName();
                        l.e(methodName2, "element.methodName");
                        if (h.a0(methodName2, "onItemClick", false)) {
                            continue;
                        } else {
                            String methodName3 = stackTraceElement.getMethodName();
                            l.e(methodName3, "element.methodName");
                            if (!h.a0(methodName3, "onTouch", false)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final JSONObject d(String str) {
        File b10 = b();
        if (b10 == null || str == null) {
            return null;
        }
        try {
            return new JSONObject(m0.L(new FileInputStream(new File(b10, str))));
        } catch (Exception unused) {
            a(str);
            return null;
        }
    }

    public static final void e(String str, JSONArray jSONArray, y.b bVar) {
        if (jSONArray.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, jSONArray.toString());
            JSONObject o10 = m0.o();
            if (o10 != null) {
                Iterator<String> keys = o10.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, o10.get(next));
                }
            }
            String str2 = y.f22858j;
            String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{v.b()}, 1));
            l.e(format, "java.lang.String.format(format, *args)");
            y.c.h(null, format, jSONObject, bVar).d();
        } catch (JSONException unused) {
        }
    }

    public static final void f(String str, String str2) {
        File b10 = b();
        if (b10 == null || str == null || str2 == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(b10, str));
            byte[] bytes = str2.getBytes(om.a.f23623a);
            l.e(bytes, "(this as java.lang.String).getBytes(charset)");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }
}
