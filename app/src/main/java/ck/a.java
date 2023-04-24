package ck;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import e4.n;
import gm.j;
import h4.k;
import java.util.Iterator;
import java.util.TimeZone;
import on.e;
import pn.i;
import pn.l;
import pn.o;
import qa.h;
import t3.f;
import y.g0;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: q */
    public static final a f4904q = new a();

    /* renamed from: a */
    public final Handler f4905a;

    /* renamed from: b */
    public Context f4906b;

    /* renamed from: d */
    public String f4908d;

    /* renamed from: g */
    public String f4911g;

    /* renamed from: h */
    public String f4912h;

    /* renamed from: i */
    public e f4913i;

    /* renamed from: j */
    public d f4914j;

    /* renamed from: k */
    public l f4915k;

    /* renamed from: o */
    public String f4919o;

    /* renamed from: c */
    public String f4907c = "h5qaTREM0SX";

    /* renamed from: e */
    public String f4909e = "";

    /* renamed from: f */
    public String f4910f = "tcp://iot-06z00c6kgq6t1w4.mqtt.iothub.aliyuncs.com";

    /* renamed from: l */
    public boolean f4916l = true;

    /* renamed from: m */
    public int f4917m = 60;

    /* renamed from: n */
    public int f4918n = 2;

    /* renamed from: p */
    public final C0076a f4920p = new C0076a();

    /* renamed from: ck.a$a */
    /* loaded from: classes2.dex */
    public class C0076a implements i {

        /* renamed from: ck.a$a$a */
        /* loaded from: classes2.dex */
        public class C0077a extends n<t6.b<t6.c>> {
        }

        /* renamed from: ck.a$a$b */
        /* loaded from: classes2.dex */
        public class b extends n<t6.b<String>> {
        }

        public C0076a() {
            a.this = r1;
        }

        @Override // pn.i
        public final void a(String str, o oVar) {
            Log.i("AiotMqtt", "messageArrived topic: " + str + ", messageArrived msg");
            d dVar = a.this.f4914j;
            if (dVar != null) {
                f.a aVar = (f.a) dVar;
                StringBuilder a10 = androidx.activity.result.d.a("topic: ", str, ", messageArrived msg: ");
                a10.append(new String(oVar.f24447b));
                j.e("AliLpImpl", a10.toString());
                byte[] bArr = oVar.f24447b;
                if (str.equals(a.this.f4919o + "/service/WearCommonCommand")) {
                    String str2 = new String(bArr);
                    Log.w("AiotMqtt", "onIotMessageArrived 穿戴通用服务命令调用" + str2);
                    C0077a c0077a = new C0077a();
                    TimeZone timeZone = e4.a.f13339a;
                    t6.b bVar = (t6.b) e4.a.o(str2, c0077a.f13432a, k.f15845u, e4.a.f13344f, new h4.b[0]);
                    t6.c cVar = (t6.c) bVar.f27795b;
                    long j10 = bVar.f27794a;
                    cVar.getClass();
                    j.e("AiotMqtt", "cmdId ===> null");
                    String str3 = str.split("thing/")[1];
                    int i10 = oVar.f24451f;
                    j.e("AiotMqtt", "message.getId() ==> " + i10);
                    j.e("AiotMqtt", "id  ==> " + j10);
                    ((f.a) a.this.f4914j).a(str3, j10, new h().f(cVar));
                    return;
                }
                String str4 = str.split("thing/")[1];
                String str5 = new String(bArr);
                Log.w("onId2Arrived 下发Id2数据调用", str5);
                b bVar2 = new b();
                TimeZone timeZone2 = e4.a.f13339a;
                t6.b bVar3 = (t6.b) e4.a.o(str5, bVar2.f13432a, k.f15845u, e4.a.f13344f, new h4.b[0]);
                long j11 = bVar3.f27794a;
                ((f.a) a.this.f4914j).a(str4, j11, (String) bVar3.f27795b);
            }
        }

        @Override // pn.i
        public final void b(Throwable th2) {
            d dVar = a.this.f4914j;
            if (dVar != null) {
                f.a aVar = (f.a) dVar;
                j.e("AliLpImpl", "onIotDisconnected..." + th2);
                f fVar = f.this;
                fVar.f27557f = false;
                Iterator it = fVar.f27554c.iterator();
                while (it.hasNext()) {
                    ((c4.b) it.next()).b();
                }
                f fVar2 = f.this;
                fVar2.f27558g = null;
                fVar2.f27559h = null;
            }
            a aVar2 = a.this;
            if (aVar2.f4916l) {
                aVar2.b();
            }
        }

        @Override // pn.i
        public final void c(pn.c cVar) {
            Log.i("AiotMqtt", "deliveryComplete msg delivered");
        }
    }

    public a() {
        HandlerThread handlerThread = new HandlerThread("lp-handler");
        handlerThread.start();
        this.f4905a = new Handler(handlerThread.getLooper());
    }

    public final void a(String str, byte[] bArr, pk.a aVar) {
        this.f4905a.post(new g0(this, bArr, str, aVar, 2));
    }

    public final void b() {
        try {
            j.e("AiotMqtt", "userName ==> " + this.f4911g);
            j.e("AiotMqtt", "passWord ==> " + this.f4912h);
            l lVar = new l();
            this.f4915k = lVar;
            String str = this.f4911g;
            if (str != null && str.trim().equals("")) {
                throw new IllegalArgumentException();
            }
            lVar.f24440c = str;
            this.f4915k.f24441d = this.f4912h.toCharArray();
            l lVar2 = this.f4915k;
            lVar2.f24443f = this.f4916l;
            int i10 = this.f4917m;
            if (i10 >= 0) {
                lVar2.f24438a = i10;
                lVar2.f24439b = 1000;
                String str2 = this.f4909e;
                e eVar = new e(this.f4906b, this.f4910f, str2);
                this.f4913i = eVar;
                eVar.f23674l = this.f4920p;
                j.e("AiotMqtt", "mqttConnectOptions ===> " + this.f4915k);
                Log.w("AiotMqtt", "mqtt connect:" + str2 + ", passwd:" + this.f4912h);
                this.f4913i.c(this.f4915k, null, new c(this));
                return;
            }
            throw new IllegalArgumentException();
        } catch (pn.n e10) {
            e10.printStackTrace();
        }
    }
}
