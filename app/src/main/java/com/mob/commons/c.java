package com.mob.commons;

import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.utils.DH;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a */
    public static HashMap<String, List<String>> f8281a = new HashMap<>();

    /* renamed from: b */
    public static final String f8282b;

    /* renamed from: c */
    public static final String f8283c;

    /* renamed from: d */
    public static final String f8284d;

    /* renamed from: e */
    public static final String f8285e;

    /* renamed from: f */
    public static final String f8286f;

    static {
        String a10 = o.a("006Mdgecdkfhdeff");
        f8282b = a10;
        String a11 = o.a("005Udg]hIdfNd(df");
        f8283c = a11;
        String a12 = o.a("005i:dhdhecdh");
        f8284d = a12;
        String a13 = o.a("006hij4dedg2i");
        f8285e = a13;
        String a14 = o.a("003hEeded");
        f8286f = a14;
        try {
            f8281a.put(a12, Arrays.asList(o.a("018ZdfLe2dehiNi%dldgel!h dc9d%deedfgeldgec^l"), o.a("0201df0e'dehi6i=dhdhecdhel,h=dcYd!deedfgeldgec*l")));
            f8281a.put(a13, Arrays.asList(o.a("020hij)fghi:h=dfUd dfel>h*dc=dDdeedfgeldgecCl"), o.a("019,dfHeEdehiShij4fgelPh7dcFdAdeedfgeldgecWl")));
            f8281a.put(a14, Arrays.asList("api-df.dutils.com", "api-df.dutils.com"));
            f8281a.put(a10, Arrays.asList(o.a("017Qdf>eSdehifhdgelHh%dcZdVdeedfgeldgecWl"), o.a("0160df@eHdehidgel=h)dcYd'deedfgeldgec$l")));
            f8281a.put(a11, Arrays.asList(o.a("016)dfYe3dehi5h!el-hDdc4dZdeedfgeldgecWl"), o.a("017Kdf)e@dehifhZhKelRh1dcSd^deedfgeldgecPl")));
            f8281a.put("sdrl", Arrays.asList("api-df.dutils.com", "api-df.dutils.com"));
        } catch (Throwable unused) {
        }
    }

    public static String a(String str) {
        return C0744r.a(b(str, (String) null));
    }

    public static String a(String str, String str2) {
        return C0744r.a(b(str, str2));
    }

    public static void a(final com.mob.tools.utils.b<Void> bVar) {
        DH.requester(MobSDK.getContext()).checkNetworkAvailable().request(new DH.DHResponder() { // from class: com.mob.commons.c.1
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                try {
                    if (dHResponse.checkNetworkAvailable()) {
                        HashMap hashMap = (HashMap) b.a(o.a("002,ec5c"), (Object) null);
                        if (hashMap == null || hashMap.isEmpty()) {
                            hashMap = new HashMap();
                            hashMap.putAll(c.f8281a);
                        }
                        for (Map.Entry entry : hashMap.entrySet()) {
                            c.b((String) entry.getKey(), (List) entry.getValue());
                        }
                    }
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        });
    }

    public static boolean a(final HashMap<String, List<String>> hashMap) {
        final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        DH.requester(MobSDK.getContext()).checkNetworkAvailable().request(new DH.DHResponder() { // from class: com.mob.commons.c.2
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                LinkedBlockingQueue linkedBlockingQueue2;
                Boolean bool;
                HashMap hashMap2;
                if (dHResponse.checkNetworkAvailable() && (hashMap2 = hashMap) != null && !hashMap2.isEmpty() && Thread.currentThread().getId() != a0.q.a()) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        c.b((String) entry.getKey(), (List) entry.getValue());
                    }
                    linkedBlockingQueue2 = linkedBlockingQueue;
                    bool = Boolean.TRUE;
                } else {
                    linkedBlockingQueue2 = linkedBlockingQueue;
                    bool = Boolean.FALSE;
                }
                linkedBlockingQueue2.offer(bool);
            }
        });
        try {
            Boolean bool = (Boolean) linkedBlockingQueue.poll(200L, TimeUnit.MILLISECONDS);
            if (bool != null) {
                return bool.booleanValue();
            }
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    private static String b(String str, String str2) {
        List<String> list;
        String c10 = w.a().c(str, str2);
        return (!TextUtils.isEmpty(c10) || (list = f8281a.get(str)) == null || list.size() <= 0) ? c10 : list.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(java.lang.String r3, java.util.List<java.lang.String> r4) {
        /*
            if (r4 == 0) goto L66
            int r0 = r4.size()
            if (r0 != 0) goto L9
            goto L66
        L9:
            r0 = 0
            java.lang.String r0 = b(r3, r0)
            boolean r1 = b(r0)
            if (r1 != 0) goto L66
            boolean r1 = b(r0)
            if (r1 != 0) goto L66
            java.util.Iterator r4 = r4.iterator()
        L1e:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L66
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = b(r1)
            if (r2 != 0) goto L36
            boolean r2 = b(r1)
            if (r2 == 0) goto L1e
        L36:
            boolean r4 = r1.equals(r0)
            if (r4 != 0) goto L66
            com.mob.tools.log.NLog r4 = com.mob.tools.MobLog.getInstance()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "sy dm: "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = ":"
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r4.d(r0, r2)
            com.mob.commons.w r4 = com.mob.commons.w.a()
            r4.d(r3, r1)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.c.b(java.lang.String, java.util.List):void");
    }

    private static boolean b(String str) {
        if (str != null) {
            try {
                InetAddress[] allByName = InetAddress.getAllByName(str);
                if (allByName != null) {
                    for (InetAddress inetAddress : allByName) {
                        if (!c(inetAddress.getHostAddress())) {
                            return false;
                        }
                    }
                }
                MobLog.getInstance().d("ck ht suc: " + str, new Object[0]);
                return true;
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
            }
        }
        return false;
    }

    private static boolean c(String str) {
        if (TextUtils.isEmpty(str) || str.equals("127.0.0.1") || str.startsWith("10.") || str.startsWith("192.168")) {
            return false;
        }
        if (str.startsWith("172.")) {
            String[] split = str.split("\\.");
            if (split.length > 1) {
                try {
                    int parseInt = Integer.parseInt(split[1]);
                    return parseInt < 16 || parseInt > 31;
                } catch (Throwable th2) {
                    MobLog.getInstance().d(th2);
                }
            }
        }
        return true;
    }
}
