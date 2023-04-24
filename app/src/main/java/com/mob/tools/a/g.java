package com.mob.tools.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.location.Location;
import android.os.Handler;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
public class g implements com.mob.tools.a.a {

    /* renamed from: a */
    private Context f8799a;

    /* loaded from: classes.dex */
    public abstract class a<T> {

        /* renamed from: a */
        private ArrayList<Object> f8937a;

        public a(Object... objArr) {
            g.this = r1;
            this.f8937a = new ArrayList<>(Arrays.asList(objArr));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public T a(Object obj) {
            return obj;
        }

        public abstract T b(ArrayList<Object> arrayList);
    }

    public g(Context context) {
        this.f8799a = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0062, code lost:
        if (r3 != java.lang.Boolean.TYPE) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0069, code lost:
        if (r3 != java.lang.Integer.TYPE) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0074, code lost:
        if (r3 != java.lang.Byte.TYPE) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x007d, code lost:
        if (r3 != java.lang.Character.TYPE) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0086, code lost:
        if (r3 != java.lang.Short.TYPE) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x008f, code lost:
        if (r3 != java.lang.Long.TYPE) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x009a, code lost:
        if (r3 != java.lang.Float.TYPE) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x00a4, code lost:
        if (r3 != java.lang.Double.TYPE) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x00ac, code lost:
        return (T) java.lang.Double.valueOf(0.0d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:?, code lost:
        return (T) java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:?, code lost:
        return (T) (-1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:?, code lost:
        return (T) (byte) 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:?, code lost:
        return (T) 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:?, code lost:
        return (T) 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:?, code lost:
        return (T) 0L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:?, code lost:
        return (T) java.lang.Float.valueOf(0.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:?, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private <T> T a(java.lang.Class<T> r3, com.mob.tools.a.g.a<T> r4) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L5e
            if (r4 == 0) goto L5e
            java.util.ArrayList r1 = com.mob.tools.a.g.a.a(r4)     // Catch: java.lang.Throwable -> L56
            java.lang.Object r4 = r4.b(r1)     // Catch: java.lang.Throwable -> L56
            if (r4 == 0) goto L5e
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
            if (r3 != r1) goto L14
            goto L5e
        L14:
            java.lang.Class r1 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L56
            if (r3 != r1) goto L20
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
        L1a:
            java.lang.Object r4 = r1.cast(r4)     // Catch: java.lang.Throwable -> L56
        L1e:
            r0 = r4
            goto L5e
        L20:
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L56
            if (r3 != r1) goto L27
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            goto L1a
        L27:
            java.lang.Class r1 = java.lang.Byte.TYPE     // Catch: java.lang.Throwable -> L56
            if (r3 != r1) goto L2e
            java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
            goto L1a
        L2e:
            java.lang.Class r1 = java.lang.Character.TYPE     // Catch: java.lang.Throwable -> L56
            if (r3 != r1) goto L35
            java.lang.Class<java.lang.Character> r1 = java.lang.Character.class
            goto L1a
        L35:
            java.lang.Class r1 = java.lang.Short.TYPE     // Catch: java.lang.Throwable -> L56
            if (r3 != r1) goto L3c
            java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
            goto L1a
        L3c:
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L56
            if (r3 != r1) goto L43
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            goto L1a
        L43:
            java.lang.Class r1 = java.lang.Float.TYPE     // Catch: java.lang.Throwable -> L56
            if (r3 != r1) goto L4a
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            goto L1a
        L4a:
            java.lang.Class r1 = java.lang.Double.TYPE     // Catch: java.lang.Throwable -> L56
            if (r3 != r1) goto L51
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            goto L1a
        L51:
            java.lang.Object r4 = r3.cast(r4)     // Catch: java.lang.Throwable -> L56
            goto L1e
        L56:
            r4 = move-exception
            com.mob.tools.log.NLog r1 = com.mob.tools.MobLog.getInstance()
            r1.d(r4)
        L5e:
            if (r0 != 0) goto Lac
            java.lang.Class r4 = java.lang.Boolean.TYPE
            if (r3 != r4) goto L67
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto Lac
        L67:
            java.lang.Class r4 = java.lang.Integer.TYPE
            if (r3 != r4) goto L71
            r3 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            goto Lac
        L71:
            java.lang.Class r4 = java.lang.Byte.TYPE
            r1 = 0
            if (r3 != r4) goto L7b
            java.lang.Byte r0 = java.lang.Byte.valueOf(r1)
            goto Lac
        L7b:
            java.lang.Class r4 = java.lang.Character.TYPE
            if (r3 != r4) goto L84
            java.lang.Character r0 = java.lang.Character.valueOf(r1)
            goto Lac
        L84:
            java.lang.Class r4 = java.lang.Short.TYPE
            if (r3 != r4) goto L8d
            java.lang.Short r0 = java.lang.Short.valueOf(r1)
            goto Lac
        L8d:
            java.lang.Class r4 = java.lang.Long.TYPE
            if (r3 != r4) goto L98
            r3 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            goto Lac
        L98:
            java.lang.Class r4 = java.lang.Float.TYPE
            if (r3 != r4) goto La2
            r3 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r3)
            goto Lac
        La2:
            java.lang.Class r4 = java.lang.Double.TYPE
            if (r3 != r4) goto Lac
            r3 = 0
            java.lang.Double r0 = java.lang.Double.valueOf(r3)
        Lac:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.a.g.a(java.lang.Class, com.mob.tools.a.g$a):java.lang.Object");
    }

    @Override // com.mob.tools.a.a
    public String A() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.64
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gbrd", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String B() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.65
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gdvtp", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String[] C() {
        return (String[]) a(String[].class, new a<String[]>(new Object[0]) { // from class: com.mob.tools.a.g.66
            public String[] a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("qriei", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String[] b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String D() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.67
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gbhnm", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public int E() {
        return ((Integer) a(Integer.TYPE, new a<Integer>(new Object[0]) { // from class: com.mob.tools.a.g.68
            public Integer a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gcld", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ Integer b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        })).intValue();
    }

    @Override // com.mob.tools.a.a
    public int F() {
        return ((Integer) a(Integer.TYPE, new a<Integer>(new Object[0]) { // from class: com.mob.tools.a.g.69
            public Integer a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gcllc", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ Integer b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        })).intValue();
    }

    @Override // com.mob.tools.a.a
    public int G() {
        return ((Integer) a(Integer.TYPE, new a<Integer>(new Object[0]) { // from class: com.mob.tools.a.g.70
            public Integer a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gpcmt", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ Integer b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        })).intValue();
    }

    @Override // com.mob.tools.a.a
    public int H() {
        return ((Integer) a(Integer.TYPE, new a<Integer>(new Object[0]) { // from class: com.mob.tools.a.g.71
            public Integer a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gcmlt", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ Integer b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        })).intValue();
    }

    @Override // com.mob.tools.a.a
    public int I() {
        return ((Integer) a(Integer.TYPE, new a<Integer>(new Object[0]) { // from class: com.mob.tools.a.g.73
            public Integer a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gcmln", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ Integer b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        })).intValue();
    }

    @Override // com.mob.tools.a.a
    public int J() {
        return ((Integer) a(Integer.TYPE, new a<Integer>(new Object[0]) { // from class: com.mob.tools.a.g.74
            public Integer a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gcmbd", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ Integer b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        })).intValue();
    }

    @Override // com.mob.tools.a.a
    public int K() {
        return ((Integer) a(Integer.TYPE, new a<Integer>(new Object[0]) { // from class: com.mob.tools.a.g.75
            public Integer a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gcmsd", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ Integer b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        })).intValue();
    }

    @Override // com.mob.tools.a.a
    public int L() {
        return ((Integer) a(Integer.TYPE, new a<Integer>(new Object[0]) { // from class: com.mob.tools.a.g.76
            public Integer a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gcmnd", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ Integer b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        })).intValue();
    }

    @Override // com.mob.tools.a.a
    public ArrayList<HashMap<String, Object>> M() {
        return (ArrayList) a(ArrayList.class, new a<ArrayList>(new Object[0]) { // from class: com.mob.tools.a.g.77
            public ArrayList a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gnbclin", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ ArrayList b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public HashMap<String, Object> N() {
        return (HashMap) a(HashMap.class, new a<HashMap>(new Object[0]) { // from class: com.mob.tools.a.g.78
            public HashMap a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("wmcwi", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ HashMap b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public ArrayList<HashMap<String, Object>> O() {
        return (ArrayList) a(ArrayList.class, new a<ArrayList>(new Object[0]) { // from class: com.mob.tools.a.g.79
            public ArrayList a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gavlwls", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ ArrayList b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public boolean P() {
        return ((Boolean) a(Boolean.TYPE, new a<Boolean>(new Object[0]) { // from class: com.mob.tools.a.g.80
            public Boolean a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("scwls", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ Boolean b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public int Q() {
        return ((Integer) a(Integer.TYPE, new a<Integer>(new Object[0]) { // from class: com.mob.tools.a.g.81
            public Integer a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("govsit", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ Integer b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        })).intValue();
    }

    @Override // com.mob.tools.a.a
    public String R() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.82
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("govsnm", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String S() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.84
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("golgu", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String T() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.85
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gocnty", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public HashMap<String, Object> U() {
        return (HashMap) a(HashMap.class, new a<HashMap>(new Object[0]) { // from class: com.mob.tools.a.g.86
            public HashMap a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gcuin", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ HashMap b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public ArrayList<ArrayList<String>> V() {
        return (ArrayList) a(ArrayList.class, new a<ArrayList>(new Object[0]) { // from class: com.mob.tools.a.g.87
            public ArrayList a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gtydvin", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ ArrayList b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public int W() {
        return ((Integer) a(Integer.TYPE, new a<Integer>(new Object[0]) { // from class: com.mob.tools.a.g.89
            public Integer a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gsnbtns", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ Integer b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        })).intValue();
    }

    @Override // com.mob.tools.a.a
    public int X() {
        return ((Integer) a(Integer.TYPE, new a<Integer>(new Object[0]) { // from class: com.mob.tools.a.g.90
            public Integer a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gsnbtmd", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ Integer b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        })).intValue();
    }

    @Override // com.mob.tools.a.a
    public String Y() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.91
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gqmkn", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public HashMap<String, HashMap<String, Long>> Z() {
        return (HashMap) a(HashMap.class, new a<HashMap>(new Object[0]) { // from class: com.mob.tools.a.g.92
            public HashMap a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gszin", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ HashMap b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public ApplicationInfo a(String str, int i10) {
        return (ApplicationInfo) a(ApplicationInfo.class, new a<ApplicationInfo>(str, Integer.valueOf(i10)) { // from class: com.mob.tools.a.g.42
            public ApplicationInfo a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gtaifprm", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ ApplicationInfo b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public PackageInfo a(boolean z10, int i10, String str, int i11) {
        return (PackageInfo) a(PackageInfo.class, new a<PackageInfo>(Boolean.valueOf(z10), Integer.valueOf(i10), str, Integer.valueOf(i11)) { // from class: com.mob.tools.a.g.15
            public PackageInfo a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gpgiffist", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ PackageInfo b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public Location a(int i10, int i11, boolean z10) {
        return (Location) a(Location.class, new a<Location>(Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10)) { // from class: com.mob.tools.a.g.121
            public Location a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("glctn", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ Location b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String a(String str, String str2) {
        return (String) a(String.class, new a<String>(str, str2) { // from class: com.mob.tools.a.g.20
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("bsasm", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String a(boolean z10) {
        return (String) a(String.class, new a<String>(Boolean.valueOf(z10)) { // from class: com.mob.tools.a.g.46
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gimip", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public List<ResolveInfo> a(Intent intent, int i10) {
        return (List) a(List.class, new a<List>(intent, Integer.valueOf(i10)) { // from class: com.mob.tools.a.g.12
            public List a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("qritsvc", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ List b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public void a(BroadcastReceiver broadcastReceiver) {
        a(Void.class, new a<Void>(broadcastReceiver) { // from class: com.mob.tools.a.g.37
            public Void a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("unrgrcv", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ Void b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        a(Void.class, new a<Void>(broadcastReceiver, intentFilter) { // from class: com.mob.tools.a.g.38
            public Void a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("rgrcv", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ Void b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public void a(Handler.Callback callback) {
        a(Void.class, new a<Void>(callback) { // from class: com.mob.tools.a.g.88
            public Void a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gbtrstt", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ Void b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public void a(View view) {
        a(Void.class, new a<Void>(view) { // from class: com.mob.tools.a.g.16
            public Void a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("hdstipu", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ Void b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public void a(BlockingQueue<Boolean> blockingQueue) {
        a(Void.class, new a<Void>(blockingQueue) { // from class: com.mob.tools.a.g.39
            public Void a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("rgwsr", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ Void b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public boolean a() {
        return ((Boolean) a(Boolean.TYPE, new a<Boolean>(new Object[0]) { // from class: com.mob.tools.a.g.1
            public Boolean a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("cird", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ Boolean b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public boolean a(String str) {
        return ((Boolean) a(Boolean.TYPE, new a<Boolean>(str) { // from class: com.mob.tools.a.g.13
            public Boolean a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("ifkps", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ Boolean b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public HashMap<String, Object> aA() {
        return (HashMap) a(HashMap.class, new a<HashMap>(new Object[0]) { // from class: com.mob.tools.a.g.130
            public HashMap a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gdltm", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ HashMap b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public ArrayList<HashMap<String, Object>> aB() {
        return (ArrayList) a(ArrayList.class, new a<ArrayList>(new Object[0]) { // from class: com.mob.tools.a.g.131
            public ArrayList a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gmlt", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ ArrayList b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String aC() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.133
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gscpt", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String aD() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.134
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gsnmd", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String aE() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.136
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gpgnm", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String aF() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.137
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gpnmmt", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public int aG() {
        return ((Integer) a(Integer.TYPE, new a<Integer>(new Object[0]) { // from class: com.mob.tools.a.g.4
            public Integer a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gpvsnm", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ Integer b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        })).intValue();
    }

    @Override // com.mob.tools.a.a
    public String aH() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.5
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gpvsme", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public boolean aI() {
        return ((Boolean) a(Boolean.TYPE, new a<Boolean>(new Object[0]) { // from class: com.mob.tools.a.g.6
            public Boolean a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("cinmnps", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ Boolean b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public String aJ() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.7
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gcrtpcnm", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public boolean aK() {
        return ((Boolean) a(Boolean.TYPE, new a<Boolean>(new Object[0]) { // from class: com.mob.tools.a.g.8
            public Boolean a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("ciafgd", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ Boolean b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public Object aL() {
        return a(Object.class, new a<Object>(new Object[0]) { // from class: com.mob.tools.a.g.10
            @Override // com.mob.tools.a.g.a
            public Object b(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("crtavthd", arrayList));
            }
        });
    }

    @Override // com.mob.tools.a.a
    public Context aM() {
        return (Context) a(Context.class, new a<Context>(new Object[0]) { // from class: com.mob.tools.a.g.11
            public Context a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gaplcn", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ Context b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String aN() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.18
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gdvda", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String aO() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.19
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gdvdtnas", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public long aP() {
        return ((Long) a(Long.TYPE, new a<Long>(new Object[0]) { // from class: com.mob.tools.a.g.21
            public Long a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("galtut", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ Long b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        })).longValue();
    }

    @Override // com.mob.tools.a.a
    public String aQ() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.22
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gbrdm", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String aR() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.23
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gdvme", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String aS() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.25
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gdpyd", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String aT() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.26
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gfgrnt", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String aU() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.27
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("grivsn", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String aV() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.28
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gcrup", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String aW() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.29
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gcifm", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String aX() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.30
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("godm", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String aY() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.31
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("godhm", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String aZ() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.32
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gadm", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public HashMap<String, Long> aa() {
        return (HashMap) a(HashMap.class, new a<HashMap>(new Object[0]) { // from class: com.mob.tools.a.g.93
            public HashMap a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gmrin", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ HashMap b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public int ab() {
        return ((Integer) a(Integer.TYPE, new a<Integer>(new Object[0]) { // from class: com.mob.tools.a.g.95
            public Integer a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gabct", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ Integer b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        })).intValue();
    }

    @Override // com.mob.tools.a.a
    public String ac() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.96
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("galgu", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String ad() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.97
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gscsz", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String ae() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.98
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gneyp", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String af() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.100
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gnktpfs", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String ag() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.101
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gdtlnktpfs", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public boolean ah() {
        return ((Boolean) a(Boolean.TYPE, new a<Boolean>(new Object[0]) { // from class: com.mob.tools.a.g.102
            public Boolean a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("cknavbl", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ Boolean b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public int ai() {
        return ((Integer) a(Integer.TYPE, new a<Integer>(new Object[0]) { // from class: com.mob.tools.a.g.103
            public Integer a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gdntp", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ Integer b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        })).intValue();
    }

    @Override // com.mob.tools.a.a
    public ArrayList<HashMap<String, String>> aj() {
        return (ArrayList) a(ArrayList.class, new a<ArrayList>(new Object[0]) { // from class: com.mob.tools.a.g.104
            public ArrayList a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gcrslt", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ ArrayList b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String ak() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.106
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gtmne", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public HashMap<String, Object> al() {
        return (HashMap) a(HashMap.class, new a<HashMap>(new Object[0]) { // from class: com.mob.tools.a.g.107
            public HashMap a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gspt", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ HashMap b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public HashMap<String, String> am() {
        return (HashMap) a(HashMap.class, new a<HashMap>(new Object[0]) { // from class: com.mob.tools.a.g.108
            public HashMap a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gcfre", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ HashMap b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String an() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.109
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gctp", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String ao() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.110
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gflv", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public HashMap<String, Object> ap() {
        return (HashMap) a(HashMap.class, new a<HashMap>(new Object[0]) { // from class: com.mob.tools.a.g.111
            public HashMap a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gtrc", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ HashMap b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String aq() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.112
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gbsbd", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String ar() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.113
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gbfspy", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String as() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.114
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gbplfo", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public HashMap<String, Object> at() {
        return (HashMap) a(HashMap.class, new a<HashMap>(new Object[0]) { // from class: com.mob.tools.a.g.115
            public HashMap a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gdvmua", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ HashMap b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String au() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.117
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("giads", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public ArrayList<HashMap<String, String>> av() {
        return (ArrayList) a(ArrayList.class, new a<ArrayList>(new Object[0]) { // from class: com.mob.tools.a.g.119
            public ArrayList a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gal", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ ArrayList b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public ArrayList<HashMap<String, String>> aw() {
        return (ArrayList) a(ArrayList.class, new a<ArrayList>(new Object[0]) { // from class: com.mob.tools.a.g.120
            public ArrayList a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gsl", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ ArrayList b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String ax() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.123
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gdvci", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String ay() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.124
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gdvk", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String az() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.129
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gdltmpg", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public ResolveInfo b(Intent intent, int i10) {
        return (ResolveInfo) a(ResolveInfo.class, new a<ResolveInfo>(intent, Integer.valueOf(i10)) { // from class: com.mob.tools.a.g.14
            public ResolveInfo a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("rsaciy", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ ResolveInfo b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String b(String str) {
        return (String) a(String.class, new a<String>(str) { // from class: com.mob.tools.a.g.122
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gstmpts", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String b(boolean z10) {
        return (String) a(String.class, new a<String>(Boolean.valueOf(z10)) { // from class: com.mob.tools.a.g.49
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gisip", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public void b(View view) {
        a(Void.class, new a<Void>(view) { // from class: com.mob.tools.a.g.17
            public Void a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("swstin", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ Void b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public boolean b() {
        return ((Boolean) a(Boolean.TYPE, new a<Boolean>(new Object[0]) { // from class: com.mob.tools.a.g.50
            public Boolean a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("cx", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ Boolean b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public String ba() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.33
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gvdm", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String bb() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.34
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gudm", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public HashMap<String, Object> bc() {
        return (HashMap) a(HashMap.class, new a<HashMap>(new Object[0]) { // from class: com.mob.tools.a.g.36
            public HashMap a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("galdm", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ HashMap b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public ApplicationInfo bd() {
        return (ApplicationInfo) a(ApplicationInfo.class, new a<ApplicationInfo>(new Object[0]) { // from class: com.mob.tools.a.g.40
            public ApplicationInfo a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gtaif", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ ApplicationInfo b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public ArrayList<HashMap<String, Object>> be() {
        return (ArrayList) a(ArrayList.class, new a<ArrayList>(new Object[0]) { // from class: com.mob.tools.a.g.41
            public ArrayList a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gtaifok", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ ArrayList b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public boolean bf() {
        return ((Boolean) a(Boolean.TYPE, new a<Boolean>(new Object[0]) { // from class: com.mob.tools.a.g.43
            public Boolean a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gpsavlb", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ Boolean b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public String c(String str) {
        return (String) a(String.class, new a<String>(str) { // from class: com.mob.tools.a.g.126
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gdfrspg", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String c(boolean z10) {
        return (String) a(String.class, new a<String>(Boolean.valueOf(z10)) { // from class: com.mob.tools.a.g.55
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gcriefce", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public boolean c() {
        return ((Boolean) a(Boolean.TYPE, new a<Boolean>(new Object[0]) { // from class: com.mob.tools.a.g.61
            public Boolean a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("ckpd", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ Boolean b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public String d(boolean z10) {
        return (String) a(String.class, new a<String>(Boolean.valueOf(z10)) { // from class: com.mob.tools.a.g.57
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gcrnmfce", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public List<String> d(String str) {
        return (List) a(List.class, new a<List>(str) { // from class: com.mob.tools.a.g.128
            public List a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("grsvps", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ List b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public boolean d() {
        return ((Boolean) a(Boolean.TYPE, new a<Boolean>(new Object[0]) { // from class: com.mob.tools.a.g.72
            public Boolean a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("degb", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ Boolean b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public String e(boolean z10) {
        return (String) a(String.class, new a<String>(Boolean.valueOf(z10)) { // from class: com.mob.tools.a.g.99
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gneypfce", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public boolean e() {
        return ((Boolean) a(Boolean.TYPE, new a<Boolean>(new Object[0]) { // from class: com.mob.tools.a.g.83
            public Boolean a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("vnmt", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ Boolean b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public boolean e(String str) {
        return ((Boolean) a(Boolean.TYPE, new a<Boolean>(str) { // from class: com.mob.tools.a.g.132
            public Boolean a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("ipgist", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ Boolean b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public String f(String str) {
        return (String) a(String.class, new a<String>(str) { // from class: com.mob.tools.a.g.135
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gsnmdfp", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public ArrayList<HashMap<String, String>> f(boolean z10) {
        return (ArrayList) a(ArrayList.class, new a<ArrayList>(Boolean.valueOf(z10)) { // from class: com.mob.tools.a.g.118
            public ArrayList a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gia", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ ArrayList b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public boolean f() {
        return ((Boolean) a(Boolean.TYPE, new a<Boolean>(new Object[0]) { // from class: com.mob.tools.a.g.94
            public Boolean a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("ckua", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ Boolean b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public String g(String str) {
        return (String) a(String.class, new a<String>(str) { // from class: com.mob.tools.a.g.3
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gpnmfp", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String g(boolean z10) {
        return (String) a(String.class, new a<String>(Boolean.valueOf(z10)) { // from class: com.mob.tools.a.g.125
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gdvkfc", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public boolean g() {
        return ((Boolean) a(Boolean.TYPE, new a<Boolean>(new Object[0]) { // from class: com.mob.tools.a.g.105
            public Boolean a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("dvenbl", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ Boolean b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public boolean h() {
        return ((Boolean) a(Boolean.TYPE, new a<Boolean>(new Object[0]) { // from class: com.mob.tools.a.g.116
            public Boolean a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("ubenbl", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ Boolean b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public boolean h(String str) {
        return ((Boolean) a(Boolean.TYPE, new a<Boolean>(str) { // from class: com.mob.tools.a.g.9
            public Boolean a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("ckpmsi", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ Boolean b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public boolean i() {
        return ((Boolean) a(Boolean.TYPE, new a<Boolean>(new Object[0]) { // from class: com.mob.tools.a.g.127
            public Boolean a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("iwpxy", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ Boolean b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public boolean j() {
        return ((Boolean) a(Boolean.TYPE, new a<Boolean>(new Object[0]) { // from class: com.mob.tools.a.g.2
            public Boolean a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("ismlt", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ Boolean b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public boolean k() {
        return ((Boolean) a(Boolean.TYPE, new a<Boolean>(new Object[0]) { // from class: com.mob.tools.a.g.24
            public Boolean a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("istvdv", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ Boolean b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public String l() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.35
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gsrln", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String m() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.44
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gavti", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String n() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.45
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gimi", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String o() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.47
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gimimem", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String p() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.48
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gisi", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String[] q() {
        return (String[]) a(String[].class, new a<String[]>(new Object[0]) { // from class: com.mob.tools.a.g.51
            public String[] a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("qryisi", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String[] b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String r() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.52
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gsimt", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String s() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.53
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gbsi", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String t() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.54
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gcrie", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String u() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.56
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gcrnm", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String v() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.58
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gssn", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String w() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.59
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gmivsn", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String x() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.60
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("godmt", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String y() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.62
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("bgmdl", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String z() {
        return (String) a(String.class, new a<String>(new Object[0]) { // from class: com.mob.tools.a.g.63
            public String a(ArrayList<Object> arrayList) {
                return a(com.mob.tools.b.a.a("gmnft", arrayList));
            }

            @Override // com.mob.tools.a.g.a
            public /* synthetic */ String b(ArrayList arrayList) {
                return a((ArrayList<Object>) arrayList);
            }
        });
    }
}
