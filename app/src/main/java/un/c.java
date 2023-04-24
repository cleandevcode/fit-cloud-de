package un;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a */
    public static final String f28953a;

    /* renamed from: b */
    public static String f28954b;

    /* renamed from: c */
    public static /* synthetic */ Class f28955c;

    /* renamed from: d */
    public static /* synthetic */ Class f28956d;

    static {
        Class<c> cls = f28955c;
        if (cls == null) {
            cls = c.class;
            f28955c = cls;
        }
        f28953a = cls.getName();
        Class<a> cls2 = f28956d;
        if (cls2 == null) {
            cls2 = a.class;
            f28956d = cls2;
        }
        f28954b = cls2.getName();
    }

    public static b a(String str) {
        b bVar;
        String str2 = f28954b;
        ResourceBundle bundle = ResourceBundle.getBundle("org.eclipse.paho.client.mqttv3.internal.nls.logcat");
        try {
            bVar = (b) Class.forName(str2).newInstance();
            bVar.h(bundle, str);
        } catch (ClassNotFoundException | ExceptionInInitializerError | IllegalAccessException | InstantiationException | NoClassDefFoundError | SecurityException unused) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        throw new MissingResourceException("Error locating the logging class", f28953a, str);
    }
}
