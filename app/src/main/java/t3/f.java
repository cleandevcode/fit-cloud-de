package t3;

import a.e;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import c4.h;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.Iterator;
import m2.l;
import pn.n;
import w.j;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: j */
    public static f f27551j;

    /* renamed from: a */
    public final Context f27552a;

    /* renamed from: b */
    public final ck.a f27553b;

    /* renamed from: c */
    public final ArrayList f27554c = new ArrayList();

    /* renamed from: d */
    public final ArrayList f27555d = new ArrayList();

    /* renamed from: e */
    public final ArrayList f27556e = new ArrayList();

    /* renamed from: f */
    public boolean f27557f = false;

    /* renamed from: g */
    public nk.a f27558g;

    /* renamed from: h */
    public l f27559h;

    /* renamed from: i */
    public j f27560i;

    /* loaded from: classes.dex */
    public class a implements ck.d {
        public a() {
            f.this = r1;
        }

        public final void a(String str, long j10, String str2) {
            gm.j.e("AliLpImpl", "receiver from lp ==> " + str + " dat ==> " + str2 + "msgId ==> " + j10);
            Iterator it = f.this.f27555d.iterator();
            while (it.hasNext()) {
                ((c4.e) it.next()).d(str, j10, str2);
            }
            t6.a aVar = new t6.a();
            String.valueOf(ok.a.f23614a.incrementAndGet());
            String.valueOf(j10);
            l lVar = f.this.f27559h;
            String[] split = e4.a.t(aVar).split("\"data\":\"\"");
            StringBuilder sb2 = new StringBuilder();
            p0.a.a(sb2, split[0], "\"data\":", "{}");
            sb2.append(split[1]);
            String sb3 = sb2.toString();
            String str3 = ((String) lVar.f20216b) + "/" + str + "_reply";
            Log.d("Id2Communicate", "上行topic:" + str3);
            Log.d("Id2Communicate", "上行数据:" + sb3);
            ((ck.a) lVar.f20215a).a(str3, sb3.getBytes(), null);
        }
    }

    /* loaded from: classes.dex */
    public class b implements pk.a {

        /* renamed from: a */
        public final /* synthetic */ h f27562a;

        public b(h hVar) {
            this.f27562a = hVar;
        }

        @Override // pk.a
        public final void a(pn.e eVar) {
            int a10 = eVar.a();
            gm.j.e("AliLpImpl", "sendId2Data success ==> " + a10);
            h hVar = this.f27562a;
            if (hVar != null) {
                hVar.a();
            }
        }

        @Override // pk.a
        public final void b(pn.e eVar, Exception exc) {
            gm.j.e("AliLpImpl", "sendId2Data onFailure " + exc);
            h hVar = this.f27562a;
            if (hVar != null && (exc instanceof n)) {
                n nVar = (n) exc;
                hVar.c(eVar.a(), nVar.f24444a, nVar.getMessage());
            }
        }
    }

    public f(Context context) {
        this.f27552a = context;
        ck.a aVar = ck.a.f4904q;
        this.f27553b = aVar;
        aVar.f4916l = false;
        aVar.f4917m = 30;
        aVar.f4918n = 2;
        aVar.f4910f = "tcp://iot-06z00c6kgq6t1w4.mqtt.iothub.aliyuncs.com";
        a aVar2 = new a();
        aVar.f4906b = context;
        aVar.f4914j = aVar2;
        if (!TextUtils.isEmpty(aVar.f4908d) && !TextUtils.isEmpty(null)) {
            Log.e("AiotMqtt", "device info error");
            gm.j.e("AiotMqtt", "passWord ==> " + aVar.f4912h);
        }
    }

    public final void a(String str, String str2, String str3) {
        String str4;
        gm.j.e("AliLpImpl", "doConnect ==> productKey " + str + " deviceName ==> " + str2 + " AliAgentImpl.sAuthTimestamp ==> " + t3.a.f27524f + " deviceSecret == > " + str3);
        ck.a aVar = this.f27553b;
        if (aVar != null) {
            aVar.f4907c = str;
            aVar.f4908d = str2;
            StringBuilder a10 = android.support.v4.media.d.a("/sys/");
            a10.append(aVar.f4907c);
            a10.append("/");
            aVar.f4919o = androidx.activity.e.b(a10, aVar.f4908d, "/thing");
            String str5 = aVar.f4909e;
            if (str5 != null && str5.indexOf("timestamp=") != -1) {
                int indexOf = aVar.f4909e.indexOf("timestamp=") + 10;
                str4 = aVar.f4909e.substring(indexOf, indexOf + 13);
            } else {
                str4 = "1234567890123";
            }
            aVar.f4909e = str + ContainerUtils.FIELD_DELIMITER + str2 + "|timestamp=" + str4 + ",securemode=2,signmethod=hmacsha1|";
            aVar.f4911g = android.support.v4.media.a.a(str2, ContainerUtils.FIELD_DELIMITER, str);
            ck.a aVar2 = this.f27553b;
            String str6 = t3.a.f27524f;
            if (aVar2.f4909e.contains("timestamp=")) {
                int indexOf2 = aVar2.f4909e.indexOf("timestamp=") + 10;
                String substring = aVar2.f4909e.substring(0, indexOf2);
                aVar2.f4909e = substring.concat(str6).concat(aVar2.f4909e.substring(indexOf2 + 13));
                StringBuilder a11 = android.support.v4.media.d.a("new client id = ");
                a11.append(aVar2.f4909e);
                Log.w("iot mqtt", a11.toString());
            }
            gm.j.e("AiotMqtt", "password ===> " + str3);
            aVar2.f4912h = str3;
            gm.j.e("AliLpImpl", "do connect...");
            this.f27553b.b();
        }
    }

    public final void b(String str, String str2, String str3, String str4, String str5, e.a aVar) {
        qk.c cVar = new qk.c(this.f27552a);
        g gVar = new g(aVar);
        cVar.f24942d = str;
        cVar.f24943e = str2;
        cVar.f24944f = str3;
        cVar.f24945g = str4;
        cVar.f24946h = str5;
        cVar.f24939a = gVar;
        new Thread(new qk.a(cVar)).start();
    }

    public final void c(String str, String str2, h hVar) {
        StringBuilder a10 = android.support.v4.media.d.a("sendId2Data isIotConnected ==> ");
        a10.append(this.f27557f);
        gm.j.e("AliLpImpl", a10.toString());
        if (!this.f27557f) {
            hVar.c(-1, 0, "IOT not connected.");
            return;
        }
        j jVar = this.f27560i;
        if (jVar != null) {
            b bVar = new b(hVar);
            l lVar = (l) jVar.f29497b;
            lVar.getClass();
            str.replace("/", ".");
            String str3 = ((String) lVar.f20216b) + "/" + str;
            t6.b bVar2 = new t6.b();
            bVar2.f27794a = ok.a.f23614a.incrementAndGet();
            bVar2.f27795b = "";
            String t10 = e4.a.t(bVar2);
            gm.j.e("Id2Communicate", "jsonStr ==> " + t10);
            String[] split = t10.split("\"params\":\"\"");
            String str4 = split[0] + "\"params\":" + str2.toString() + split[1];
            Log.d("Id2Communicate", "上行topic:" + str3);
            Log.d("Id2Communicate", "上行数据:" + str4);
            ((ck.a) lVar.f20215a).a(str3, str4.getBytes(), bVar);
        }
    }
}
