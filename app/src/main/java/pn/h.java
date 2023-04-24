package pn;

import bi.m0;
import java.util.Hashtable;
import java.util.Timer;
import java.util.TimerTask;
import javax.net.SocketFactory;

/* loaded from: classes2.dex */
public class h implements b {

    /* renamed from: j */
    public static final String f24424j;

    /* renamed from: k */
    public static final un.b f24425k;

    /* renamed from: l */
    public static int f24426l;

    /* renamed from: m */
    public static /* synthetic */ Class f24427m;

    /* renamed from: a */
    public String f24428a;

    /* renamed from: b */
    public String f24429b;

    /* renamed from: c */
    public qn.a f24430c;

    /* renamed from: d */
    public k f24431d;

    /* renamed from: e */
    public i f24432e;

    /* renamed from: f */
    public l f24433f;

    /* renamed from: g */
    public Object f24434g;

    /* renamed from: h */
    public Timer f24435h;

    /* renamed from: i */
    public boolean f24436i = false;

    /* loaded from: classes2.dex */
    public class a extends TimerTask {
        public a() {
            h.this = r1;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            h.f24425k.c(h.f24424j, "ReconnectTask.run", "506");
            h.this.b();
        }
    }

    static {
        Class<h> cls = f24427m;
        if (cls == null) {
            cls = h.class;
            f24427m = cls;
        }
        String name = cls.getName();
        f24424j = name;
        f24425k = un.c.a(name);
        f24426l = 1000;
    }

    public h(String str, String str2, k kVar, on.a aVar) {
        f24425k.d(str2);
        if (str2 == null) {
            throw new IllegalArgumentException("Null clientId");
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < str2.length() - 1) {
            char charAt = str2.charAt(i10);
            if (charAt >= 55296 && charAt <= 56319) {
                i10++;
            }
            i11++;
            i10++;
        }
        if (i11 > 65535) {
            throw new IllegalArgumentException("ClientId longer than 65535 characters");
        }
        l.b(str);
        this.f24429b = str;
        this.f24428a = str2;
        this.f24431d = kVar;
        if (kVar == null) {
            this.f24431d = new p5.e(7, 0);
        }
        f24425k.g(f24424j, "MqttAsyncClient", "101", new Object[]{str2, str, kVar});
        this.f24431d.c(str2, str);
        this.f24430c = new qn.a(this, this.f24431d, aVar);
        this.f24431d.close();
        new Hashtable();
    }

    public static String e(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf == -1) {
            indexOf = str.indexOf(47);
        }
        if (indexOf == -1) {
            indexOf = str.length();
        }
        return str.substring(0, indexOf);
    }

    public static int f(int i10, String str) {
        int lastIndexOf = str.lastIndexOf(58);
        if (lastIndexOf == -1) {
            return i10;
        }
        int indexOf = str.indexOf(47);
        if (indexOf == -1) {
            indexOf = str.length();
        }
        return Integer.parseInt(str.substring(lastIndexOf + 1, indexOf));
    }

    @Override // pn.b
    public final String a() {
        return this.f24428a;
    }

    public final void b() {
        f24425k.g(f24424j, "attemptReconnect", "500", new Object[]{this.f24428a});
        try {
            c(this.f24433f, this.f24434g, new g(this));
        } catch (s | n e10) {
            f24425k.e(f24424j, "attemptReconnect", "804", null, e10);
        }
    }

    public final e c(l lVar, Object obj, pn.a aVar) {
        String str;
        qn.o oVar;
        int i10;
        if (!this.f24430c.f()) {
            if (!this.f24430c.g()) {
                if (!this.f24430c.h()) {
                    if (!this.f24430c.e()) {
                        this.f24433f = lVar;
                        this.f24434g = obj;
                        boolean z10 = lVar.f24443f;
                        un.b bVar = f24425k;
                        String str2 = f24424j;
                        Object[] objArr = new Object[8];
                        int i11 = 0;
                        objArr[0] = Boolean.TRUE;
                        objArr[1] = new Integer(30);
                        objArr[2] = new Integer(lVar.f24438a);
                        objArr[3] = lVar.f24440c;
                        if (lVar.f24441d == null) {
                            str = "[null]";
                        } else {
                            str = "[notnull]";
                        }
                        objArr[4] = str;
                        objArr[5] = "[null]";
                        objArr[6] = obj;
                        objArr[7] = aVar;
                        bVar.g(str2, "connect", "103", objArr);
                        qn.a aVar2 = this.f24430c;
                        String str3 = this.f24429b;
                        bVar.g(str2, "createNetworkModules", "116", new Object[]{str3});
                        String[] strArr = {str3};
                        qn.l[] lVarArr = new qn.l[1];
                        int i12 = 0;
                        for (int i13 = 1; i12 < i13; i13 = 1) {
                            String str4 = strArr[i12];
                            un.b bVar2 = f24425k;
                            String str5 = f24424j;
                            Object[] objArr2 = new Object[i13];
                            objArr2[i11] = str4;
                            bVar2.g(str5, "createNetworkModule", "115", objArr2);
                            int b10 = l.b(str4);
                            sn.i iVar = null;
                            if (b10 != 0) {
                                if (b10 != i13) {
                                    if (b10 != 2) {
                                        if (b10 != 3) {
                                            if (b10 == 4) {
                                                String substring = str4.substring(6);
                                                String e10 = e(substring);
                                                int f10 = f(443, substring);
                                                rn.a aVar3 = new rn.a();
                                                sn.i iVar2 = new sn.i(aVar3.a(), str4, e10, f10, this.f24428a);
                                                iVar2.f25125e = 30;
                                                iVar2.f25115j = 30;
                                                String[] c10 = aVar3.c();
                                                iVar = iVar2;
                                                if (c10 != null) {
                                                    iVar2.c(c10);
                                                    iVar = iVar2;
                                                }
                                            }
                                        } else {
                                            String substring2 = str4.substring(5);
                                            oVar = new sn.f(SocketFactory.getDefault(), str4, e(substring2), f(80, substring2), this.f24428a);
                                            i10 = 30;
                                        }
                                    } else {
                                        iVar = new qn.i(str4.substring(8));
                                    }
                                } else {
                                    String substring3 = str4.substring(6);
                                    String e11 = e(substring3);
                                    int f11 = f(8883, substring3);
                                    rn.a aVar4 = new rn.a();
                                    qn.n nVar = new qn.n(aVar4.a(), e11, f11, this.f24428a);
                                    nVar.f25125e = 30;
                                    nVar.f25115j = 30;
                                    String[] c11 = aVar4.c();
                                    if (c11 != null) {
                                        nVar.c(c11);
                                    }
                                    iVar = nVar;
                                }
                                lVarArr[i12] = iVar;
                                i12++;
                                i11 = 0;
                            } else {
                                String substring4 = str4.substring(6);
                                oVar = new qn.o(SocketFactory.getDefault(), e(substring4), f(1883, substring4), this.f24428a);
                                i10 = 30;
                            }
                            oVar.f25125e = i10;
                            iVar = oVar;
                            lVarArr[i12] = iVar;
                            i12++;
                            i11 = 0;
                        }
                        f24425k.c(f24424j, "createNetworkModules", "108");
                        aVar2.f25000c = lVarArr;
                        this.f24430c.f25003f.f25052b = new f(this, z10);
                        t tVar = new t(this.f24428a);
                        qn.g gVar = new qn.g(this, this.f24431d, this.f24430c, lVar, tVar, obj, aVar, this.f24436i);
                        qn.p pVar = tVar.f24452a;
                        pVar.f25139k = gVar;
                        pVar.f25140l = this;
                        i iVar3 = this.f24432e;
                        if (iVar3 instanceof j) {
                            gVar.f25098i = (j) iVar3;
                        }
                        this.f24430c.f24999b = i11;
                        gVar.c();
                        return tVar;
                    }
                    throw new n(32111);
                }
                throw new n(32102);
            }
            throw new n(32110);
        }
        throw m0.h(32100);
    }

    public final void d(pn.a aVar) {
        un.b bVar = f24425k;
        String str = f24424j;
        bVar.g(str, "disconnect", "104", new Object[]{new Long(30000L), null, aVar});
        t tVar = new t(this.f24428a);
        qn.p pVar = tVar.f24452a;
        pVar.f25139k = aVar;
        pVar.f25140l = null;
        try {
            this.f24430c.c(new tn.e(), tVar);
            bVar.c(str, "disconnect", "108");
        } catch (n e10) {
            f24425k.e(f24424j, "disconnect", "105", null, e10);
            throw e10;
        }
    }

    public final void g() {
        f24425k.g(f24424j, "reconnect", "500", new Object[]{this.f24428a});
        if (this.f24430c.f()) {
            throw m0.h(32100);
        }
        if (this.f24430c.g()) {
            throw new n(32110);
        }
        if (this.f24430c.h()) {
            throw new n(32102);
        }
        if (this.f24430c.e()) {
            throw new n(32111);
        }
        h();
        b();
    }

    public final void h() {
        f24425k.g(f24424j, "stopReconnectCycle", "504", new Object[]{this.f24428a});
        this.f24435h.cancel();
        f24426l = 1000;
    }
}
