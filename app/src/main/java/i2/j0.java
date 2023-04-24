package i2;

import android.annotation.SuppressLint;
import i2.h0;
import java.util.LinkedHashMap;

@SuppressLint({"TypeParameterUnusedInFormals"})
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: b */
    public static final LinkedHashMap f16308b = new LinkedHashMap();

    /* renamed from: a */
    public final LinkedHashMap f16309a = new LinkedHashMap();

    /* loaded from: classes.dex */
    public static final class a {
        public static String a(Class cls) {
            LinkedHashMap linkedHashMap = j0.f16308b;
            String str = (String) linkedHashMap.get(cls);
            if (str == null) {
                h0.b bVar = (h0.b) cls.getAnnotation(h0.b.class);
                if (bVar != null) {
                    str = bVar.value();
                } else {
                    str = null;
                }
                if (b(str)) {
                    linkedHashMap.put(cls, str);
                } else {
                    StringBuilder a10 = android.support.v4.media.d.a("No @Navigator.Name annotation found for ");
                    a10.append(cls.getSimpleName());
                    throw new IllegalArgumentException(a10.toString().toString());
                }
            }
            gm.l.c(str);
            return str;
        }

        public static boolean b(String str) {
            if (str != null) {
                return str.length() > 0;
            }
            return false;
        }
    }

    public final void a(h0 h0Var) {
        String a10 = a.a(h0Var.getClass());
        if (a.b(a10)) {
            h0 h0Var2 = (h0) this.f16309a.get(a10);
            if (!gm.l.a(h0Var2, h0Var)) {
                boolean z10 = false;
                if (h0Var2 != null && h0Var2.f16285b) {
                    z10 = true;
                }
                if (!z10) {
                    if (!h0Var.f16285b) {
                        h0 h0Var3 = (h0) this.f16309a.put(a10, h0Var);
                        return;
                    }
                    throw new IllegalStateException(("Navigator " + h0Var + " is already attached to another NavController").toString());
                }
                throw new IllegalStateException(("Navigator " + h0Var + " is replacing an already attached " + h0Var2).toString());
            }
            return;
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
    }

    public final <T extends h0<?>> T b(String str) {
        gm.l.f(str, "name");
        if (a.b(str)) {
            T t10 = (T) this.f16309a.get(str);
            if (t10 != null) {
                return t10;
            }
            throw new IllegalStateException(android.support.v4.media.a.a("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
    }
}
