package yb;

import android.content.Context;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.EnumMap;
import ya.a;

/* loaded from: classes.dex */
public abstract class y implements b4.a, za.f {

    /* renamed from: a */
    public static d6.b0 f31418a;

    /* renamed from: b */
    public static a.C0576a f31419b;

    public static String e(String str, String str2) {
        if (!"_default_config_tag".equals(str)) {
            return android.support.v4.media.a.a(str, "-", str2);
        }
        return str;
    }

    public static String f(String str, String str2, String str3) {
        if ("_default_config_tag".equals(str)) {
            return a.b.b("_default_config_tag#", str3);
        }
        return str + "-" + str2 + "#" + str3;
    }

    public static void g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                p.b.c("IOUtil", "closeSecure IOException");
            }
        }
    }

    public static int h(boolean[] zArr, int i10, int[] iArr, boolean z10) {
        int i11 = 0;
        for (int i12 : iArr) {
            int i13 = 0;
            while (i13 < i12) {
                zArr[i10] = z10;
                i13++;
                i10++;
            }
            i11 += i12;
            z10 = !z10;
        }
        return i11;
    }

    public static t i(String str, String str2) {
        w a10;
        r.a().getClass();
        c0 c0Var = (c0) r.f31378b.get(str);
        if (c0Var != null && (a10 = c0Var.a(str2)) != null) {
            return a10.f31403g;
        }
        return null;
    }

    public static String o() {
        z zVar = r.a().f31380a;
        if (TextUtils.isEmpty(zVar.f31423d)) {
            return zVar.f31422c;
        }
        return zVar.f31423d;
    }

    public static String p() {
        String str;
        String str2;
        z zVar = r.a().f31380a;
        if (TextUtils.isEmpty(zVar.f31421b)) {
            String str3 = "";
            try {
                str2 = (String) Class.forName("com.huawei.android.os.BuildEx").getMethod("getUDID", new Class[0]).invoke(null, new Object[0]);
            } catch (AndroidRuntimeException unused) {
            } catch (ClassNotFoundException unused2) {
            } catch (IllegalAccessException unused3) {
            } catch (IllegalArgumentException unused4) {
            } catch (NoSuchMethodException unused5) {
            } catch (InvocationTargetException unused6) {
            }
            try {
                m2.f.b("getUDID success");
            } catch (AndroidRuntimeException unused7) {
                str3 = str2;
                str = "getUDID getudid failed, RuntimeException is AndroidRuntimeException";
                m2.f.h("hmsSdk", str);
                str2 = str3;
                zVar.f31421b = str2;
                return zVar.f31421b;
            } catch (ClassNotFoundException unused8) {
                str3 = str2;
                str = "getUDID method invoke failed";
                m2.f.h("hmsSdk", str);
                str2 = str3;
                zVar.f31421b = str2;
                return zVar.f31421b;
            } catch (IllegalAccessException unused9) {
                str3 = str2;
                str = "getUDID method invoke failed : Illegal AccessException";
                m2.f.h("hmsSdk", str);
                str2 = str3;
                zVar.f31421b = str2;
                return zVar.f31421b;
            } catch (IllegalArgumentException unused10) {
                str3 = str2;
                str = "getUDID method invoke failed : Illegal ArgumentException";
                m2.f.h("hmsSdk", str);
                str2 = str3;
                zVar.f31421b = str2;
                return zVar.f31421b;
            } catch (NoSuchMethodException unused11) {
                str3 = str2;
                str = "getUDID method invoke failed : NoSuchMethodException";
                m2.f.h("hmsSdk", str);
                str2 = str3;
                zVar.f31421b = str2;
                return zVar.f31421b;
            } catch (InvocationTargetException unused12) {
                str3 = str2;
                str = "getUDID method invoke failed : InvocationTargetException";
                m2.f.h("hmsSdk", str);
                str2 = str3;
                zVar.f31421b = str2;
                return zVar.f31421b;
            }
            zVar.f31421b = str2;
        }
        return zVar.f31421b;
    }

    public static w r(String str, String str2) {
        r.a().getClass();
        c0 c0Var = (c0) r.f31378b.get(str);
        if (c0Var != null) {
            if ("alltype".equals(str2)) {
                w a10 = c0Var.a("oper");
                if (a10 == null) {
                    return c0Var.a("maint");
                }
                return a10;
            }
            return c0Var.a(str2);
        }
        return null;
    }

    public static Context s() {
        return r.a().f31380a.f31429j;
    }

    public void A(ze.g gVar) {
    }

    public void B(int i10) {
    }

    public bb.b d(String str, za.a aVar, EnumMap enumMap) {
        if (!str.isEmpty()) {
            int q10 = q();
            za.c cVar = za.c.MARGIN;
            if (enumMap.containsKey(cVar)) {
                q10 = Integer.parseInt(enumMap.get(cVar).toString());
            }
            boolean[] k10 = k(str);
            int length = k10.length;
            int i10 = q10 + length;
            int max = Math.max(200, i10);
            int max2 = Math.max(1, 200);
            int i11 = max / i10;
            int i12 = (max - (length * i11)) / 2;
            bb.b bVar = new bb.b(max, max2);
            int i13 = 0;
            while (i13 < length) {
                if (k10[i13]) {
                    bVar.c(i12, 0, i11, max2);
                }
                i13++;
                i12 += i11;
            }
            return bVar;
        }
        throw new IllegalArgumentException("Found empty contents");
    }

    public abstract ed.b j();

    public abstract boolean[] k(String str);

    public int q() {
        return 10;
    }

    public abstract Object y();

    public void z(int i10) {
    }
}
