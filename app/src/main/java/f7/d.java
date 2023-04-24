package f7;

import gm.l;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;
import mf.a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import om.h;
import p000do.a;
import tl.g;

/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: a */
    public final Properties f14167a;

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        g.a aVar;
        try {
            Properties properties = new Properties();
            properties.load(Runtime.getRuntime().exec("getprop").getInputStream());
            aVar = properties;
        } catch (Throwable th2) {
            aVar = a0.f(th2);
        }
        Throwable a10 = g.a(aVar);
        if (a10 != null) {
            a.b bVar = p000do.a.f13275a;
            bVar.t("SystemUtil");
            bVar.q(a10);
        }
        this.f14167a = (Properties) (aVar instanceof g.a ? null : aVar);
    }

    @Override // f7.b
    public final String a(String str) {
        String str2;
        boolean z10;
        Object f10;
        BufferedReader bufferedReader;
        Properties properties = this.f14167a;
        String str3 = null;
        if (properties != null) {
            str2 = properties.getProperty(str);
        } else {
            str2 = null;
        }
        if (str2 != null && str2.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            a.b bVar = p000do.a.f13275a;
            bVar.t("RomUtil");
            bVar.p("runtime error:%s", str);
            try {
                InputStream inputStream = Runtime.getRuntime().exec("getprop " + str).getInputStream();
                l.e(inputStream, "input");
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream, om.a.f23623a);
                if (inputStreamReader instanceof BufferedReader) {
                    bufferedReader = (BufferedReader) inputStreamReader;
                } else {
                    bufferedReader = new BufferedReader(inputStreamReader, DfuBaseService.ERROR_REMOTE_MASK);
                }
                f10 = bufferedReader.readLine();
                a0.d(bufferedReader, null);
                a0.d(inputStream, null);
            } catch (Throwable th2) {
                f10 = a0.f(th2);
            }
            Throwable a10 = g.a(f10);
            if (a10 != null) {
                a.b bVar2 = p000do.a.f13275a;
                bVar2.t("SystemUtil");
                bVar2.q(a10);
            }
            boolean z11 = f10 instanceof g.a;
            if (!z11) {
                a.b bVar3 = p000do.a.f13275a;
                bVar3.t("SystemUtil");
                bVar3.h("%s=%s", str, (String) f10);
            }
            if (!z11) {
                str3 = f10;
            }
            return str3;
        }
        a.b bVar4 = p000do.a.f13275a;
        bVar4.t("RomUtil");
        bVar4.h("runtime -> %s=%s", str, str2);
        return h.Y(h.Y(str2, "[", ""), "]", "");
    }
}
