package v5;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import gm.l;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o5.v;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    public static final f f29104a = new f();

    /* renamed from: b */
    public static final HashMap<String, Method> f29105b = new HashMap<>();

    /* renamed from: c */
    public static final HashMap<String, Class<?>> f29106c = new HashMap<>();

    /* renamed from: d */
    public static final String f29107d = v.a().getPackageName();

    /* renamed from: e */
    public static final SharedPreferences f29108e = v.a().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);

    /* renamed from: f */
    public static final SharedPreferences f29109f = v.a().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    public static final ArrayList<String> f(Context context, Object obj) {
        if (i6.a.b(f.class)) {
            return null;
        }
        try {
            f fVar = f29104a;
            return fVar.a(fVar.e(context, obj, "inapp"));
        } catch (Throwable th2) {
            i6.a.a(f.class, th2);
            return null;
        }
    }

    public final ArrayList<String> a(ArrayList<String> arrayList) {
        if (i6.a.b(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList2 = new ArrayList<>();
            SharedPreferences.Editor edit = f29109f.edit();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                try {
                    JSONObject jSONObject = new JSONObject(next);
                    String string = jSONObject.getString("productId");
                    long j10 = jSONObject.getLong("purchaseTime");
                    String string2 = jSONObject.getString("purchaseToken");
                    if (currentTimeMillis - (j10 / 1000) <= 86400 && !l.a(f29109f.getString(string, ""), string2)) {
                        edit.putString(string, string2);
                        arrayList2.add(next);
                    }
                } catch (JSONException unused) {
                }
            }
            edit.apply();
            return arrayList2;
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0030 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #3 {all -> 0x0036, blocks: (B:32:0x0008, B:35:0x0013, B:45:0x0030, B:38:0x001e), top: B:52:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Class<?> b(android.content.Context r4, java.lang.String r5) {
        /*
            r3 = this;
            boolean r0 = i6.a.b(r3)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.HashMap<java.lang.String, java.lang.Class<?>> r0 = v5.f.f29106c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L36
            java.lang.Class r0 = (java.lang.Class) r0     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L13
            return r0
        L13:
            int r0 = v5.j.f29124a     // Catch: java.lang.Throwable -> L36
            java.lang.Class<v5.j> r0 = v5.j.class
            boolean r2 = i6.a.b(r0)     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto L1e
            goto L2d
        L1e:
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch: java.lang.Throwable -> L27 java.lang.ClassNotFoundException -> L2c
            java.lang.Class r4 = r4.loadClass(r5)     // Catch: java.lang.Throwable -> L27 java.lang.ClassNotFoundException -> L2c
            goto L2e
        L27:
            r4 = move-exception
            i6.a.a(r0, r4)     // Catch: java.lang.Throwable -> L36
            goto L2d
        L2c:
        L2d:
            r4 = r1
        L2e:
            if (r4 == 0) goto L35
            java.util.HashMap<java.lang.String, java.lang.Class<?>> r0 = v5.f.f29106c     // Catch: java.lang.Throwable -> L36
            r0.put(r5, r4)     // Catch: java.lang.Throwable -> L36
        L35:
            return r4
        L36:
            r4 = move-exception
            i6.a.a(r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v5.f.b(android.content.Context, java.lang.String):java.lang.Class");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final Method c(String str, Class cls) {
        Class[] clsArr;
        Method b10;
        if (i6.a.b(this)) {
            return null;
        }
        try {
            HashMap<String, Method> hashMap = f29105b;
            Method method = hashMap.get(str);
            if (method != null) {
                return method;
            }
            switch (str.hashCode()) {
                case -1801122596:
                    if (!str.equals("getPurchases")) {
                        clsArr = null;
                        break;
                    } else {
                        Class cls2 = Integer.TYPE;
                        l.e(cls2, "TYPE");
                        clsArr = new Class[]{cls2, String.class, String.class, String.class};
                        break;
                    }
                case -1450694211:
                    if (!str.equals("isBillingSupported")) {
                        clsArr = null;
                        break;
                    } else {
                        Class cls3 = Integer.TYPE;
                        l.e(cls3, "TYPE");
                        clsArr = new Class[]{cls3, String.class, String.class};
                        break;
                    }
                case -1123215065:
                    if (!str.equals("asInterface")) {
                        clsArr = null;
                        break;
                    } else {
                        clsArr = new Class[]{IBinder.class};
                        break;
                    }
                case -594356707:
                    if (!str.equals("getPurchaseHistory")) {
                        clsArr = null;
                        break;
                    } else {
                        Class cls4 = Integer.TYPE;
                        l.e(cls4, "TYPE");
                        clsArr = new Class[]{cls4, String.class, String.class, String.class, Bundle.class};
                        break;
                    }
                case -573310373:
                    if (!str.equals("getSkuDetails")) {
                        clsArr = null;
                        break;
                    } else {
                        Class cls5 = Integer.TYPE;
                        l.e(cls5, "TYPE");
                        clsArr = new Class[]{cls5, String.class, String.class, Bundle.class};
                        break;
                    }
                default:
                    clsArr = null;
                    break;
            }
            if (clsArr == null) {
                b10 = j.b(cls, str, null);
            } else {
                int i10 = j.f29124a;
                b10 = j.b(cls, str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            }
            if (b10 != null) {
                hashMap.put(str, b10);
            }
            return b10;
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return null;
        }
    }

    public final ArrayList d(Context context, Object obj) {
        ArrayList<String> stringArrayList;
        if (i6.a.b(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (i(context, obj, "inapp")) {
                char c10 = 0;
                String str = null;
                int i10 = 0;
                boolean z10 = false;
                while (true) {
                    Object[] objArr = new Object[5];
                    objArr[c10] = 6;
                    objArr[1] = f29107d;
                    objArr[2] = "inapp";
                    objArr[3] = str;
                    objArr[4] = new Bundle();
                    Object h10 = h(context, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj, objArr);
                    if (h10 != null) {
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        Bundle bundle = (Bundle) h10;
                        if (bundle.getInt("RESPONSE_CODE") == 0 && (stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) != null) {
                            Iterator<String> it = stringArrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                String next = it.next();
                                if (currentTimeMillis - (new JSONObject(next).getLong("purchaseTime") / 1000) > 1200) {
                                    z10 = true;
                                    break;
                                }
                                arrayList.add(next);
                                i10++;
                            }
                            str = bundle.getString("INAPP_CONTINUATION_TOKEN");
                            if (i10 < 30 || str == null || z10) {
                                break;
                                break;
                            }
                            c10 = 0;
                        }
                    }
                    str = null;
                    if (i10 < 30) {
                        break;
                    }
                    c10 = 0;
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0062 A[EDGE_INSN: B:63:0x0062->B:55:0x0062 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList<java.lang.String> e(android.content.Context r13, java.lang.Object r14, java.lang.String r15) {
        /*
            r12 = this;
            boolean r0 = i6.a.b(r12)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L63
            r0.<init>()     // Catch: java.lang.Throwable -> L63
            if (r14 != 0) goto L10
            return r0
        L10:
            boolean r2 = r12.i(r13, r14, r15)     // Catch: java.lang.Throwable -> L63
            if (r2 == 0) goto L62
            r2 = 0
            r3 = r1
            r4 = 0
        L19:
            r5 = 4
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L63
            r5 = 3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L63
            r11[r2] = r6     // Catch: java.lang.Throwable -> L63
            r6 = 1
            java.lang.String r7 = v5.f.f29107d     // Catch: java.lang.Throwable -> L63
            r11[r6] = r7     // Catch: java.lang.Throwable -> L63
            r6 = 2
            r11[r6] = r15     // Catch: java.lang.Throwable -> L63
            r11[r5] = r3     // Catch: java.lang.Throwable -> L63
            java.lang.String r8 = "com.android.vending.billing.IInAppBillingService"
            java.lang.String r9 = "getPurchases"
            r6 = r12
            r7 = r13
            r10 = r14
            java.lang.Object r3 = r6.h(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L63
            if (r3 == 0) goto L5b
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch: java.lang.Throwable -> L63
            java.lang.String r5 = "RESPONSE_CODE"
            int r5 = r3.getInt(r5)     // Catch: java.lang.Throwable -> L63
            if (r5 != 0) goto L5b
            java.lang.String r5 = "INAPP_PURCHASE_DATA_LIST"
            java.util.ArrayList r5 = r3.getStringArrayList(r5)     // Catch: java.lang.Throwable -> L63
            if (r5 == 0) goto L62
            int r6 = r5.size()     // Catch: java.lang.Throwable -> L63
            int r4 = r4 + r6
            r0.addAll(r5)     // Catch: java.lang.Throwable -> L63
            java.lang.String r5 = "INAPP_CONTINUATION_TOKEN"
            java.lang.String r3 = r3.getString(r5)     // Catch: java.lang.Throwable -> L63
            goto L5c
        L5b:
            r3 = r1
        L5c:
            r5 = 30
            if (r4 >= r5) goto L62
            if (r3 != 0) goto L19
        L62:
            return r0
        L63:
            r13 = move-exception
            i6.a.a(r12, r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v5.f.e(android.content.Context, java.lang.Object, java.lang.String):java.util.ArrayList");
    }

    public final LinkedHashMap g(Context context, ArrayList arrayList, Object obj, boolean z10) {
        int size;
        if (i6.a.b(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (obj != null && !arrayList.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
                Object[] objArr = new Object[4];
                int i10 = 0;
                objArr[0] = 3;
                objArr[1] = f29107d;
                objArr[2] = z10 ? "subs" : "inapp";
                objArr[3] = bundle;
                Object h10 = h(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, objArr);
                if (h10 != null) {
                    Bundle bundle2 = (Bundle) h10;
                    if (bundle2.getInt("RESPONSE_CODE") == 0) {
                        ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList != null && arrayList.size() == stringArrayList.size() && arrayList.size() - 1 >= 0) {
                            while (true) {
                                int i11 = i10 + 1;
                                Object obj2 = arrayList.get(i10);
                                l.e(obj2, "skuList[i]");
                                String str = stringArrayList.get(i10);
                                l.e(str, "skuDetailsList[i]");
                                linkedHashMap.put(obj2, str);
                                if (i11 > size) {
                                    break;
                                }
                                i10 = i11;
                            }
                        }
                        k(linkedHashMap);
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return null;
        }
    }

    public final Object h(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method c10;
        if (i6.a.b(this)) {
            return null;
        }
        try {
            Class<?> b10 = b(context, str);
            if (b10 == null || (c10 = c(str2, b10)) == null) {
                return null;
            }
            int i10 = j.f29124a;
            return j.d(b10, obj, c10, Arrays.copyOf(objArr, objArr.length));
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return null;
        }
    }

    public final boolean i(Context context, Object obj, String str) {
        if (i6.a.b(this) || obj == null) {
            return false;
        }
        try {
            Object h10 = h(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, f29107d, str});
            if (h10 != null) {
                return ((Integer) h10).intValue() == 0;
            }
            return false;
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return false;
        }
    }

    public final LinkedHashMap j(ArrayList arrayList) {
        if (i6.a.b(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                String string = f29108e.getString(str, null);
                if (string != null) {
                    List s02 = om.l.s0(string, new String[]{";"}, 2, 2);
                    if (currentTimeMillis - Long.parseLong((String) s02.get(0)) < 43200) {
                        l.e(str, "sku");
                        linkedHashMap.put(str, s02.get(1));
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return null;
        }
    }

    public final void k(LinkedHashMap linkedHashMap) {
        if (i6.a.b(this)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences.Editor edit = f29108e.edit();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                edit.putString((String) entry.getKey(), currentTimeMillis + ';' + ((String) entry.getValue()));
            }
            edit.apply();
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }
}
