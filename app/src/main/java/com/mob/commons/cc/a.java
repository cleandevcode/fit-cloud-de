package com.mob.commons.cc;

import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.PackageManager;
import com.mob.commons.cc.p;
import com.mob.commons.cc.w;
import com.mob.tools.MobHandlerThread;
import com.mob.tools.network.NetCommunicator;
import com.mob.tools.network.NetworkHelper;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    private static final q f8290a = new q();

    /* renamed from: b */
    private static volatile p f8291b;

    /* renamed from: c */
    private static volatile p f8292c;

    static {
        try {
            f8291b = new p(new p.a() { // from class: com.mob.commons.cc.a.1
                @Override // com.mob.commons.cc.p.a
                public Object a(String str, ArrayList<Object> arrayList) {
                    try {
                        if (a.f8292c != null) {
                            return a.f8292c.a(str, arrayList);
                        }
                        return null;
                    } catch (Throwable unused) {
                        return null;
                    }
                }
            });
            f8292c = new p(new p.a() { // from class: com.mob.commons.cc.a.2
                @Override // com.mob.commons.cc.p.a
                public Object a(String str, ArrayList<Object> arrayList) {
                    return str + "" + arrayList;
                }
            });
            f8291b.a("tt", null);
        } catch (Throwable unused) {
        }
    }

    public static int a() {
        return w.a();
    }

    public static LinkedList<Object> a(Object obj, Object... objArr) {
        return ((y) obj).b(objArr);
    }

    public static void a(Context context, String str, String str2, Method method) {
        a(w.a(str), context, str2, method);
    }

    public static void a(Context context, String str, String str2, HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2) {
        w.c a10 = w.a(str);
        a10.a("ss_dhMap", hashMap).a("ss_dataMaps", hashMap2);
        a(a10, context, str2, (Method) null);
    }

    public static void a(Context context, byte[] bArr, String str, Method method) {
        a(w.a(bArr), context, str, method);
    }

    private static void a(w.c cVar, Context context, String str, Method method) {
        cVar.a(com.mob.commons.n.b("012:ek_dhScgce<cGcddbcjdgJhc"), o.class).a("MNT", d.class).a("MSPH", g.class).a("MBH", b.class).a(com.mob.commons.n.b("016.fhdbebgccecjQgEdc=hWcgdh(bOcg6h3ceMg"), MobHandlerThread.class).a(com.mob.commons.n.b("020(fhdbebeicgdbceXgHcfceefRcVfdUh5cf8h8cd[ih_cg"), h.class).a(com.mob.commons.n.b("018Afhdbebffdbcj7ch@cjKcZfdNh*efdbdcZih,cg"), k.class).a(com.mob.commons.n.b("020,fhdbebdgBh?cg*i!cdcfLhOffdbcjcj0hTcfYc)cddbcj"), m.class).a(com.mob.commons.n.b("018BfhdbebffdbcjKch)cjNc0ekebefLhGcg,ihEcg"), j.class).a("MobNetworkCallback", l.class).a(com.mob.commons.n.b("009!dgeigccecjOg_dc+h7cg"), p.class).a("MNC", NetCommunicator.class).a(com.mob.commons.n.b("004*fhdedhek"), NetworkHelper.NetworkTimeOut.class).a(h.class, h.class).a(j.class, j.class).a(m.class, n.class).a(l.class, l.class).a(q.class, q.class).a(o.class, o.class).a(d.class, d.class).a(g.class, i.class).a(b.class, b.class).a(Context.class, c.class).a(PackageManager.class, f.class).a(NotificationManager.class, e.class).a("ss_suls", f8290a).a(com.mob.commons.n.b("015Hefefcccfdbcj(chKck(c7fgcecgce5k"), context).a(com.mob.commons.n.b("014Wefefccef=c3cecgIcNfgcecgceHkYef"), str).a(com.mob.commons.n.b("012MefefccefCc;cecg_c+dhcdSkh"), Long.valueOf(System.currentTimeMillis())).a(com.mob.commons.n.b("006EefefccMkgd"), method).a(com.mob.commons.n.b("016McfdbRkk9dbcjce*d[dkefKgIcidkcfAg(cf"));
        cVar.a();
    }
}
