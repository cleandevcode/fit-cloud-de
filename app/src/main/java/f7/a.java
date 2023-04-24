package f7;

import android.annotation.SuppressLint;
import gm.l;
import java.lang.reflect.Method;
import p000do.a;

/* loaded from: classes.dex */
public final class a implements b {
    @SuppressLint({"PrivateApi"})

    /* renamed from: a */
    public Class<?> f14146a;

    /* renamed from: b */
    public Method f14147b;

    public a() {
        Class<?> cls = Class.forName("android.os.SystemProperties");
        this.f14146a = cls;
        Method declaredMethod = cls.getDeclaredMethod("get", String.class);
        l.e(declaredMethod, "classType.getDeclaredMet…get\", String::class.java)");
        this.f14147b = declaredMethod;
    }

    @Override // f7.b
    public final String a(String str) {
        try {
            Object invoke = this.f14147b.invoke(this.f14146a, str);
            if (invoke != null) {
                a.b bVar = p000do.a.f13275a;
                bVar.t("RomUtil");
                bVar.h("reflect -> %s=%s", str, invoke.toString());
                return invoke.toString();
            }
            return null;
        } catch (Exception e10) {
            a.b bVar2 = p000do.a.f13275a;
            bVar2.t("RomUtil");
            bVar2.r(e10, "reflect error:%s", str);
            return null;
        }
    }
}
