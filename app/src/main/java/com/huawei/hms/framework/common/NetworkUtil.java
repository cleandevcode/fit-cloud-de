package com.huawei.hms.framework.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.UserManager;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthNr;
import android.telephony.CellSignalStrengthTdscdma;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.HwTelephonyManager;
import android.telephony.SignalStrength;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class NetworkUtil {
    public static final int UNAVAILABLE = Integer.MAX_VALUE;

    /* loaded from: classes.dex */
    public static final class NetType {
        public static final int TYPE_2G = 2;
        public static final int TYPE_3G = 3;
        public static final int TYPE_4G = 4;
        public static final int TYPE_4G_NSA = 7;
        public static final int TYPE_5G = 5;
        public static final int TYPE_5G_SA = 8;
        public static final int TYPE_MOBILE = 6;
        public static final int TYPE_NO_NETWORK = -1;
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_WIFI = 1;
    }

    /* loaded from: classes.dex */
    public static final class SignalType {
        public static final String LTE_CQI = "lteCqi";
        public static final String LTE_DBM = "lteDbm";
        public static final String LTE_RSRP = "lteRsrp";
        public static final String LTE_RSRQ = "lteRsrq";
        public static final String LTE_RSSI = "lteRssi";
        public static final String LTE_RSSNR = "lteRssnr";
        public static final String NR_CSIRSRP = "nrCSIRsrp";
        public static final String NR_CSIRSRQ = "nrCSIRsrq";
        public static final String NR_CSISINR = "nrCSISinr";
        public static final String NR_DBM = "nrDbm";
        public static final String NR_SSRSRP = "nrSSRsrp";
        public static final String NR_SSRSRQ = "nrSSRsrq";
        public static final String NR_SSSINR = "nrSSSinr";
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x001e, code lost:
        r4 = r4.getServiceState();
     */
    @android.annotation.SuppressLint({"MissingPermission", "NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(android.content.Context r4) {
        /*
            java.lang.String r0 = "NetworkUtil"
            java.lang.String r1 = "com.huawei.android.os.BuildEx$VERSION"
            boolean r1 = com.huawei.hms.framework.common.ReflectionUtils.checkCompatible(r1)
            r2 = 0
            if (r1 != 0) goto Lc
            return r2
        Lc:
            if (r4 == 0) goto L35
            java.lang.String r1 = "phone"
            java.lang.Object r4 = com.huawei.hms.framework.common.ContextCompat.getSystemService(r4, r1)
            android.telephony.TelephonyManager r4 = (android.telephony.TelephonyManager) r4
            if (r4 == 0) goto L35
            int r1 = com.huawei.android.os.BuildEx.VERSION.EMUI_SDK_INT     // Catch: java.lang.NoClassDefFoundError -> L2a java.lang.NoSuchMethodError -> L2d java.lang.SecurityException -> L30
            r3 = 21
            if (r1 < r3) goto L35
            android.telephony.ServiceState r4 = com.huawei.hms.framework.common.b.a(r4)     // Catch: java.lang.NoClassDefFoundError -> L2a java.lang.NoSuchMethodError -> L2d java.lang.SecurityException -> L30
            if (r4 == 0) goto L35
            int r4 = com.huawei.android.telephony.ServiceStateEx.getConfigRadioTechnology(r4)     // Catch: java.lang.NoClassDefFoundError -> L2a java.lang.NoSuchMethodError -> L2d java.lang.SecurityException -> L30
            r2 = r4
            goto L35
        L2a:
            java.lang.String r4 = "NoClassDefFoundError occur in method getHwNetworkType."
            goto L32
        L2d:
            java.lang.String r4 = "NoSuchMethodError occur in method getHwNetworkType."
            goto L32
        L30:
            java.lang.String r4 = "requires permission maybe missing."
        L32:
            com.huawei.hms.framework.common.Logger.w(r0, r4)
        L35:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.common.NetworkUtil.a(android.content.Context):int");
    }

    public static int b(Context context) {
        SignalStrength c10;
        int dbm;
        int i10 = Integer.MAX_VALUE;
        if (Build.VERSION.SDK_INT <= 28 || (c10 = c(context)) == null) {
            return Integer.MAX_VALUE;
        }
        int networkType = getNetworkType(context);
        try {
            if (networkType != 3) {
                if (networkType != 4) {
                    if (networkType != 5) {
                        return Integer.MAX_VALUE;
                    }
                    List cellSignalStrengths = c10.getCellSignalStrengths(CellSignalStrengthNr.class);
                    if (cellSignalStrengths.size() <= 0) {
                        return Integer.MAX_VALUE;
                    }
                    dbm = ((CellSignalStrengthNr) cellSignalStrengths.get(0)).getDbm();
                } else {
                    List cellSignalStrengths2 = c10.getCellSignalStrengths(CellSignalStrengthLte.class);
                    if (cellSignalStrengths2.size() <= 0) {
                        return Integer.MAX_VALUE;
                    }
                    dbm = ((CellSignalStrengthLte) cellSignalStrengths2.get(0)).getDbm();
                }
            } else {
                List cellSignalStrengths3 = c10.getCellSignalStrengths(CellSignalStrengthCdma.class);
                if (cellSignalStrengths3.size() > 0) {
                    dbm = ((CellSignalStrengthCdma) cellSignalStrengths3.get(0)).getDbm();
                } else {
                    List cellSignalStrengths4 = c10.getCellSignalStrengths(CellSignalStrengthTdscdma.class);
                    if (cellSignalStrengths4.size() > 0) {
                        dbm = ((CellSignalStrengthTdscdma) cellSignalStrengths4.get(0)).getDbm();
                    } else {
                        List cellSignalStrengths5 = c10.getCellSignalStrengths(CellSignalStrengthWcdma.class);
                        if (cellSignalStrengths5.size() <= 0) {
                            return Integer.MAX_VALUE;
                        }
                        dbm = ((CellSignalStrengthWcdma) cellSignalStrengths5.get(0)).getDbm();
                    }
                }
            }
            i10 = dbm;
            return i10;
        } catch (Throwable th2) {
            StringBuilder a10 = android.support.v4.media.d.a("getMobileSingalStrength: throwable:");
            a10.append(th2.getClass());
            Logger.i("NetworkUtil", a10.toString());
            return i10;
        }
    }

    public static SignalStrength c(Context context) {
        int defaultDataSubscriptionId;
        TelephonyManager createForSubscriptionId;
        SignalStrength signalStrength;
        if (context == null || Build.VERSION.SDK_INT < 28) {
            return null;
        }
        Object systemService = ContextCompat.getSystemService(context, "phone");
        if (systemService instanceof TelephonyManager) {
            defaultDataSubscriptionId = SubscriptionManager.getDefaultDataSubscriptionId();
            createForSubscriptionId = ((TelephonyManager) systemService).createForSubscriptionId(defaultDataSubscriptionId);
            signalStrength = createForSubscriptionId.getSignalStrength();
            return signalStrength;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getDnsServerIps(android.content.Context r9) {
        /*
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1 = 0
            if (r9 == 0) goto L80
            java.lang.String r2 = "connectivity"
            java.lang.Object r9 = com.huawei.hms.framework.common.ContextCompat.getSystemService(r9, r2)
            android.net.ConnectivityManager r9 = (android.net.ConnectivityManager) r9
            if (r9 == 0) goto L80
            android.net.NetworkInfo r2 = r9.getActiveNetworkInfo()     // Catch: java.lang.RuntimeException -> L5a java.lang.SecurityException -> L61
            if (r2 == 0) goto L80
            android.net.Network[] r3 = r9.getAllNetworks()     // Catch: java.lang.RuntimeException -> L5a java.lang.SecurityException -> L61
            int r4 = r3.length     // Catch: java.lang.RuntimeException -> L5a java.lang.SecurityException -> L61
            r5 = 0
        L1e:
            if (r5 >= r4) goto L80
            r6 = r3[r5]     // Catch: java.lang.RuntimeException -> L5a java.lang.SecurityException -> L61
            if (r6 != 0) goto L25
            goto L57
        L25:
            android.net.NetworkInfo r7 = r9.getNetworkInfo(r6)     // Catch: java.lang.RuntimeException -> L5a java.lang.SecurityException -> L61
            if (r7 == 0) goto L57
            int r7 = r7.getType()     // Catch: java.lang.RuntimeException -> L5a java.lang.SecurityException -> L61
            int r8 = r2.getType()     // Catch: java.lang.RuntimeException -> L5a java.lang.SecurityException -> L61
            if (r7 != r8) goto L57
            android.net.LinkProperties r6 = r9.getLinkProperties(r6)     // Catch: java.lang.RuntimeException -> L5a java.lang.SecurityException -> L61
            if (r6 == 0) goto L57
            java.util.List r6 = r6.getDnsServers()     // Catch: java.lang.RuntimeException -> L5a java.lang.SecurityException -> L61
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.RuntimeException -> L5a java.lang.SecurityException -> L61
        L43:
            boolean r7 = r6.hasNext()     // Catch: java.lang.RuntimeException -> L5a java.lang.SecurityException -> L61
            if (r7 == 0) goto L57
            java.lang.Object r7 = r6.next()     // Catch: java.lang.RuntimeException -> L5a java.lang.SecurityException -> L61
            java.net.InetAddress r7 = (java.net.InetAddress) r7     // Catch: java.lang.RuntimeException -> L5a java.lang.SecurityException -> L61
            java.lang.String r7 = r7.getHostAddress()     // Catch: java.lang.RuntimeException -> L5a java.lang.SecurityException -> L61
            r0.add(r7)     // Catch: java.lang.RuntimeException -> L5a java.lang.SecurityException -> L61
            goto L43
        L57:
            int r5 = r5 + 1
            goto L1e
        L5a:
            r9 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            goto L67
        L61:
            r9 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
        L67:
            java.lang.String r3 = "getActiveNetworkInfo failed, exception:"
            r2.append(r3)
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getSimpleName()
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            java.lang.String r2 = "NetworkUtil"
            com.huawei.hms.framework.common.Logger.i(r2, r9)
        L80:
            boolean r9 = r0.isEmpty()
            if (r9 == 0) goto L89
            java.lang.String[] r9 = new java.lang.String[r1]
            goto L95
        L89:
            int r9 = r0.size()
            java.lang.String[] r9 = new java.lang.String[r9]
            java.lang.Object[] r9 = r0.toArray(r9)
            java.lang.String[] r9 = (java.lang.String[]) r9
        L95:
            java.lang.String r9 = java.util.Arrays.toString(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.common.NetworkUtil.getDnsServerIps(android.content.Context):java.lang.String");
    }

    public static String getHost(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return new URI(str).getHost();
        } catch (URISyntaxException e10) {
            Logger.w("NetworkUtil", e10.getClass().getSimpleName());
            return "";
        }
    }

    public static int getInfoWithReflect(SignalStrength signalStrength, String str) {
        String sb2;
        StringBuilder a10;
        String str2;
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                final Method declaredMethod = SignalStrength.class.getDeclaredMethod(str, new Class[0]);
                AccessController.doPrivileged(new PrivilegedAction() { // from class: com.huawei.hms.framework.common.NetworkUtil.1
                    @Override // java.security.PrivilegedAction
                    public Object run() {
                        declaredMethod.setAccessible(true);
                        return null;
                    }
                });
                return ((Integer) declaredMethod.invoke(signalStrength, new Object[0])).intValue();
            }
            return Integer.MAX_VALUE;
        } catch (IllegalAccessException unused) {
            a10 = android.support.v4.media.d.a(str);
            str2 = " : cannot access";
            a10.append(str2);
            sb2 = a10.toString();
            Logger.i("NetworkUtil", sb2);
            return Integer.MAX_VALUE;
        } catch (NoSuchMethodException unused2) {
            a10 = android.support.v4.media.d.a(str);
            str2 = " : function not found";
            a10.append(str2);
            sb2 = a10.toString();
            Logger.i("NetworkUtil", sb2);
            return Integer.MAX_VALUE;
        } catch (InvocationTargetException unused3) {
            a10 = android.support.v4.media.d.a(str);
            str2 = " : InvocationTargetException";
            a10.append(str2);
            sb2 = a10.toString();
            Logger.i("NetworkUtil", sb2);
            return Integer.MAX_VALUE;
        } catch (Throwable th2) {
            StringBuilder a11 = p.a.a(str, " : throwable:");
            a11.append(th2.getClass());
            sb2 = a11.toString();
            Logger.i("NetworkUtil", sb2);
            return Integer.MAX_VALUE;
        }
    }

    public static int getLteCqi(Context context) {
        List cellSignalStrengths;
        int cqi;
        SignalStrength c10 = c(context);
        if (c10 == null) {
            return Integer.MAX_VALUE;
        }
        try {
        } catch (Throwable th2) {
            StringBuilder a10 = android.support.v4.media.d.a("getLteCqi: throwable:");
            a10.append(th2.getClass());
            Logger.i("NetworkUtil", a10.toString());
        }
        if (Build.VERSION.SDK_INT > 28) {
            cellSignalStrengths = c10.getCellSignalStrengths(CellSignalStrengthLte.class);
            if (cellSignalStrengths.size() > 0) {
                cqi = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getCqi();
                return cqi;
            }
            return Integer.MAX_VALUE;
        }
        return getInfoWithReflect(c10, "getLteCqi");
    }

    public static int getLteRsrp(Context context) {
        List cellSignalStrengths;
        int rsrp;
        SignalStrength c10 = c(context);
        if (c10 == null) {
            return Integer.MAX_VALUE;
        }
        try {
        } catch (Throwable th2) {
            StringBuilder a10 = android.support.v4.media.d.a("getLteRsrp: throwable:");
            a10.append(th2.getClass());
            Logger.i("NetworkUtil", a10.toString());
        }
        if (Build.VERSION.SDK_INT > 28) {
            cellSignalStrengths = c10.getCellSignalStrengths(CellSignalStrengthLte.class);
            if (cellSignalStrengths.size() > 0) {
                rsrp = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRsrp();
                return rsrp;
            }
            return Integer.MAX_VALUE;
        }
        return getInfoWithReflect(c10, "getLteRsrp");
    }

    public static int getLteRsrq(Context context) {
        List cellSignalStrengths;
        int rsrq;
        SignalStrength c10 = c(context);
        if (c10 == null) {
            return Integer.MAX_VALUE;
        }
        try {
        } catch (Throwable th2) {
            StringBuilder a10 = android.support.v4.media.d.a("getLteRsrq: throwable:");
            a10.append(th2.getClass());
            Logger.i("NetworkUtil", a10.toString());
        }
        if (Build.VERSION.SDK_INT > 28) {
            cellSignalStrengths = c10.getCellSignalStrengths(CellSignalStrengthLte.class);
            if (cellSignalStrengths.size() > 0) {
                rsrq = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRsrq();
                return rsrq;
            }
            return Integer.MAX_VALUE;
        }
        return getInfoWithReflect(c10, "getLteRsrq");
    }

    public static int getLteRssi(Context context) {
        List cellSignalStrengths;
        int rssi;
        SignalStrength c10 = c(context);
        if (c10 == null) {
            return Integer.MAX_VALUE;
        }
        try {
            if (Build.VERSION.SDK_INT > 28) {
                cellSignalStrengths = c10.getCellSignalStrengths(CellSignalStrengthLte.class);
                if (cellSignalStrengths.size() > 0) {
                    rssi = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRssi();
                    return rssi;
                }
            }
        } catch (Throwable th2) {
            StringBuilder a10 = android.support.v4.media.d.a("getLteRssi: throwable:");
            a10.append(th2.getClass());
            Logger.i("NetworkUtil", a10.toString());
        }
        return Integer.MAX_VALUE;
    }

    public static int getLteRssnr(Context context) {
        List cellSignalStrengths;
        int rssnr;
        SignalStrength c10 = c(context);
        if (c10 == null) {
            return Integer.MAX_VALUE;
        }
        try {
        } catch (Throwable th2) {
            StringBuilder a10 = android.support.v4.media.d.a("getLteRssnr: throwable:");
            a10.append(th2.getClass());
            Logger.i("NetworkUtil", a10.toString());
        }
        if (Build.VERSION.SDK_INT > 28) {
            cellSignalStrengths = c10.getCellSignalStrengths(CellSignalStrengthLte.class);
            if (cellSignalStrengths.size() > 0) {
                rssnr = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRssnr();
                return rssnr;
            }
            return Integer.MAX_VALUE;
        }
        return getInfoWithReflect(c10, "getLteRssnr");
    }

    public static Map<String, Integer> getLteSignalInfo(Context context) {
        List cellSignalStrengths;
        int rsrp;
        int rsrq;
        int rssnr;
        int cqi;
        int rssi;
        HashMap hashMap = new HashMap();
        SignalStrength c10 = c(context);
        if (c10 == null) {
            return hashMap;
        }
        try {
            if (Build.VERSION.SDK_INT > 28) {
                cellSignalStrengths = c10.getCellSignalStrengths(CellSignalStrengthLte.class);
                if (cellSignalStrengths.size() > 0) {
                    hashMap.put(SignalType.LTE_DBM, Integer.valueOf(((CellSignalStrengthLte) cellSignalStrengths.get(0)).getDbm()));
                    rsrp = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRsrp();
                    hashMap.put(SignalType.LTE_RSRP, Integer.valueOf(rsrp));
                    rsrq = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRsrq();
                    hashMap.put(SignalType.LTE_RSRQ, Integer.valueOf(rsrq));
                    rssnr = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRssnr();
                    hashMap.put(SignalType.LTE_RSSNR, Integer.valueOf(rssnr));
                    cqi = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getCqi();
                    hashMap.put(SignalType.LTE_CQI, Integer.valueOf(cqi));
                    rssi = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRssi();
                    hashMap.put(SignalType.LTE_RSSI, Integer.valueOf(rssi));
                }
            } else {
                hashMap.put(SignalType.LTE_DBM, Integer.valueOf(getInfoWithReflect(c10, "getDbm")));
                hashMap.put(SignalType.LTE_RSRP, Integer.valueOf(getInfoWithReflect(c10, "getLteRsrp")));
                hashMap.put(SignalType.LTE_RSRQ, Integer.valueOf(getInfoWithReflect(c10, "getLteRsrq")));
                hashMap.put(SignalType.LTE_RSSNR, Integer.valueOf(getInfoWithReflect(c10, "getLteRssnr")));
                hashMap.put(SignalType.LTE_CQI, Integer.valueOf(getInfoWithReflect(c10, "getLteCqi")));
            }
        } catch (Throwable th2) {
            StringBuilder a10 = android.support.v4.media.d.a("getLteRssi: throwable:");
            a10.append(th2.getClass());
            Logger.i("NetworkUtil", a10.toString());
        }
        return hashMap;
    }

    public static String getMNC(Context context) {
        if (context != null && isSimReady(context)) {
            Object systemService = ContextCompat.getSystemService(context, "phone");
            TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
            if (telephonyManager == null) {
                Logger.e("NetworkUtil", "getSubscriptionOperatorType: other error!");
                return "unknown";
            }
            String networkOperator = telephonyManager.getNetworkOperator();
            return ("46001".equals(networkOperator) || "46006".equals(networkOperator) || "46009".equals(networkOperator)) ? "China_Unicom" : ("46000".equals(networkOperator) || "46002".equals(networkOperator) || "46004".equals(networkOperator) || "46007".equals(networkOperator)) ? "China_Mobile" : ("46003".equals(networkOperator) || "46005".equals(networkOperator) || "46011".equals(networkOperator)) ? "China_Telecom" : "other";
        }
        return "unknown";
    }

    public static int getMobileRsrp(Context context) {
        SignalStrength c10 = c(context);
        if (c10 == null) {
            return Integer.MAX_VALUE;
        }
        try {
            if (Build.VERSION.SDK_INT > 28) {
                return b(context);
            }
            return getInfoWithReflect(c10, "getDbm");
        } catch (Throwable th2) {
            StringBuilder a10 = android.support.v4.media.d.a("getDbm: throwable:");
            a10.append(th2.getClass());
            Logger.i("NetworkUtil", a10.toString());
            return Integer.MAX_VALUE;
        }
    }

    public static String getNetWorkNSAorSA() {
        try {
            HwTelephonyManager hwTelephonyManager = HwTelephonyManager.getDefault();
            int default4GSlotId = hwTelephonyManager.getDefault4GSlotId();
            Logger.v("NetworkUtil", "phoneId " + default4GSlotId);
            boolean isNsaState = hwTelephonyManager.isNsaState(default4GSlotId);
            Logger.v("NetworkUtil", "isNsa " + isNsaState);
            return isNsaState ? "5G_NSA" : "5G_SA";
        } catch (Throwable unused) {
            Logger.v("NetworkUtil", "isNsaState error");
            return null;
        }
    }

    @SuppressLint({"MissingPermission"})
    public static NetworkInfo getNetworkInfo(Context context) {
        ConnectivityManager connectivityManager;
        if (!ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") || (connectivityManager = (ConnectivityManager) ContextCompat.getSystemService(context, "connectivity")) == null) {
            return null;
        }
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (RuntimeException e10) {
            StringBuilder a10 = android.support.v4.media.d.a("getActiveNetworkInfo failed, exception:");
            a10.append(e10.getClass().getSimpleName());
            a10.append(e10.getMessage());
            Logger.i("NetworkUtil", a10.toString());
            return null;
        }
    }

    @SuppressLint({"MissingPermission"})
    public static NetworkInfo.DetailedState getNetworkStatus(Context context) {
        String sb2;
        NetworkInfo.DetailedState detailedState = NetworkInfo.DetailedState.IDLE;
        if (context != null) {
            Object systemService = ContextCompat.getSystemService(context, "connectivity");
            if (systemService instanceof ConnectivityManager) {
                try {
                    if (!ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
                        return detailedState;
                    }
                    NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        detailedState = activeNetworkInfo.getDetailedState();
                    } else {
                        Logger.i("NetworkUtil", "getNetworkStatus networkIsConnected netInfo is null!");
                    }
                } catch (RuntimeException e10) {
                    StringBuilder a10 = android.support.v4.media.d.a("getNetworkStatus exception");
                    a10.append(e10.getClass().getSimpleName());
                    a10.append(e10.getMessage());
                    sb2 = a10.toString();
                }
            } else {
                sb2 = "getNetworkStatus ConnectivityManager is null!";
            }
            Logger.i("NetworkUtil", sb2);
        }
        return detailedState;
    }

    public static int getNetworkType(Context context) {
        if (context != null) {
            return getNetworkType(getNetworkInfo(context), context);
        }
        return 0;
    }

    public static int getNetworkType(NetworkInfo networkInfo) {
        return getNetworkType(networkInfo, null);
    }

    public static int getNetworkType(NetworkInfo networkInfo, Context context) {
        int i10;
        if (networkInfo == null || !networkInfo.isConnected()) {
            return -1;
        }
        int type = networkInfo.getType();
        if (1 == type || 13 == type) {
            return 1;
        }
        if (type == 0) {
            int a10 = a(context);
            Logger.v("NetworkUtil", "getHwNetworkType return is: " + a10);
            if (a10 == 0) {
                a10 = networkInfo.getSubtype();
            }
            if (a10 != 20) {
                switch (a10) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        i10 = 2;
                        break;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        i10 = 3;
                        break;
                    case 13:
                        i10 = 4;
                        break;
                    default:
                        i10 = 0;
                        break;
                }
            } else {
                i10 = 5;
            }
            if (i10 != 0 || Build.VERSION.SDK_INT < 25) {
                return i10;
            }
            if (a10 == 16) {
                return 2;
            }
            if (a10 == 17) {
                return 3;
            }
        }
        return 0;
    }

    public static int getNrCsiRsrp(Context context) {
        SignalStrength c10;
        try {
        } catch (Throwable th2) {
            StringBuilder a10 = android.support.v4.media.d.a("getNrCsiRsrp: throwable:");
            a10.append(th2.getClass());
            Logger.i("NetworkUtil", a10.toString());
        }
        if (Build.VERSION.SDK_INT <= 28 || (c10 = c(context)) == null) {
            return Integer.MAX_VALUE;
        }
        List cellSignalStrengths = c10.getCellSignalStrengths(CellSignalStrengthNr.class);
        if (cellSignalStrengths.size() > 0) {
            return ((CellSignalStrengthNr) cellSignalStrengths.get(0)).getCsiRsrp();
        }
        return Integer.MAX_VALUE;
    }

    public static int getNrCsiRsrq(Context context) {
        SignalStrength c10;
        try {
        } catch (Throwable th2) {
            StringBuilder a10 = android.support.v4.media.d.a("getNrCsiRsrq: throwable:");
            a10.append(th2.getClass());
            Logger.i("NetworkUtil", a10.toString());
        }
        if (Build.VERSION.SDK_INT <= 28 || (c10 = c(context)) == null) {
            return Integer.MAX_VALUE;
        }
        List cellSignalStrengths = c10.getCellSignalStrengths(CellSignalStrengthNr.class);
        if (cellSignalStrengths.size() > 0) {
            return ((CellSignalStrengthNr) cellSignalStrengths.get(0)).getCsiRsrq();
        }
        return Integer.MAX_VALUE;
    }

    public static int getNrCsiSinr(Context context) {
        SignalStrength c10;
        try {
        } catch (Throwable th2) {
            StringBuilder a10 = android.support.v4.media.d.a("getNrCsiSinr: throwable:");
            a10.append(th2.getClass());
            Logger.i("NetworkUtil", a10.toString());
        }
        if (Build.VERSION.SDK_INT <= 28 || (c10 = c(context)) == null) {
            return Integer.MAX_VALUE;
        }
        List cellSignalStrengths = c10.getCellSignalStrengths(CellSignalStrengthNr.class);
        if (cellSignalStrengths.size() > 0) {
            return ((CellSignalStrengthNr) cellSignalStrengths.get(0)).getCsiSinr();
        }
        return Integer.MAX_VALUE;
    }

    public static Map<String, Integer> getNrSignalInfo(Context context) {
        HashMap hashMap = new HashMap();
        SignalStrength c10 = c(context);
        if (c10 == null) {
            return hashMap;
        }
        try {
            if (Build.VERSION.SDK_INT > 28) {
                List cellSignalStrengths = c10.getCellSignalStrengths(CellSignalStrengthNr.class);
                if (cellSignalStrengths.size() > 0) {
                    hashMap.put(SignalType.NR_DBM, Integer.valueOf(((CellSignalStrengthNr) cellSignalStrengths.get(0)).getDbm()));
                    hashMap.put(SignalType.NR_CSIRSRP, Integer.valueOf(((CellSignalStrengthNr) cellSignalStrengths.get(0)).getCsiRsrp()));
                    hashMap.put(SignalType.NR_CSIRSRQ, Integer.valueOf(((CellSignalStrengthNr) cellSignalStrengths.get(0)).getCsiRsrq()));
                    hashMap.put(SignalType.NR_CSISINR, Integer.valueOf(((CellSignalStrengthNr) cellSignalStrengths.get(0)).getCsiSinr()));
                    hashMap.put(SignalType.NR_SSRSRP, Integer.valueOf(((CellSignalStrengthNr) cellSignalStrengths.get(0)).getSsRsrp()));
                    hashMap.put(SignalType.NR_SSRSRQ, Integer.valueOf(((CellSignalStrengthNr) cellSignalStrengths.get(0)).getSsRsrq()));
                    hashMap.put(SignalType.NR_SSSINR, Integer.valueOf(((CellSignalStrengthNr) cellSignalStrengths.get(0)).getSsSinr()));
                }
            }
        } catch (Throwable th2) {
            StringBuilder a10 = android.support.v4.media.d.a("getLteRssi: throwable:");
            a10.append(th2.getClass());
            Logger.i("NetworkUtil", a10.toString());
        }
        return hashMap;
    }

    public static int getNrSsRsrp(Context context) {
        SignalStrength c10;
        try {
        } catch (Throwable th2) {
            StringBuilder a10 = android.support.v4.media.d.a("getNrSsRsrp: throwable:");
            a10.append(th2.getClass());
            Logger.i("NetworkUtil", a10.toString());
        }
        if (Build.VERSION.SDK_INT <= 28 || (c10 = c(context)) == null) {
            return Integer.MAX_VALUE;
        }
        List cellSignalStrengths = c10.getCellSignalStrengths(CellSignalStrengthNr.class);
        if (cellSignalStrengths.size() > 0) {
            return ((CellSignalStrengthNr) cellSignalStrengths.get(0)).getSsRsrp();
        }
        return Integer.MAX_VALUE;
    }

    public static int getNrSsRsrq(Context context) {
        SignalStrength c10;
        try {
        } catch (Throwable th2) {
            StringBuilder a10 = android.support.v4.media.d.a("getNrSsRsrq: throwable:");
            a10.append(th2.getClass());
            Logger.i("NetworkUtil", a10.toString());
        }
        if (Build.VERSION.SDK_INT <= 28 || (c10 = c(context)) == null) {
            return Integer.MAX_VALUE;
        }
        List cellSignalStrengths = c10.getCellSignalStrengths(CellSignalStrengthNr.class);
        if (cellSignalStrengths.size() > 0) {
            return ((CellSignalStrengthNr) cellSignalStrengths.get(0)).getSsRsrq();
        }
        return Integer.MAX_VALUE;
    }

    public static int getNrSsSinr(Context context) {
        SignalStrength c10;
        try {
        } catch (Throwable th2) {
            StringBuilder a10 = android.support.v4.media.d.a("getNrSsSinr: throwable:");
            a10.append(th2.getClass());
            Logger.i("NetworkUtil", a10.toString());
        }
        if (Build.VERSION.SDK_INT <= 28 || (c10 = c(context)) == null) {
            return Integer.MAX_VALUE;
        }
        List cellSignalStrengths = c10.getCellSignalStrengths(CellSignalStrengthNr.class);
        if (cellSignalStrengths.size() > 0) {
            return ((CellSignalStrengthNr) cellSignalStrengths.get(0)).getSsSinr();
        }
        return Integer.MAX_VALUE;
    }

    public static int getPrimaryNetworkType(Context context) {
        int networkType = getNetworkType(getNetworkInfo(context), context);
        if (networkType != -1) {
            if (networkType != 1) {
                return (networkType == 2 || networkType == 3 || networkType == 4 || networkType == 5) ? 6 : 0;
            }
            return 1;
        }
        return -1;
    }

    public static int getPrimaryNetworkType(NetworkInfo networkInfo) {
        int networkType = getNetworkType(networkInfo);
        if (networkType != -1) {
            if (networkType != 1) {
                return (networkType == 2 || networkType == 3 || networkType == 4 || networkType == 5) ? 6 : 0;
            }
            return 1;
        }
        return -1;
    }

    public static String getWifiGatewayIp(Context context) {
        if (context == null) {
            return " ";
        }
        Object systemService = ContextCompat.getSystemService(context.getApplicationContext(), "wifi");
        if (!(systemService instanceof WifiManager)) {
            return " ";
        }
        try {
            int i10 = ((WifiManager) systemService).getDhcpInfo().gateway;
            return InetAddress.getByAddress(new byte[]{(byte) (i10 & 255), (byte) ((i10 >> 8) & 255), (byte) ((i10 >> 16) & 255), (byte) ((i10 >> 24) & 255)}).getHostAddress();
        } catch (RuntimeException | UnknownHostException e10) {
            StringBuilder a10 = android.support.v4.media.d.a("getWifiGatewayIp error!");
            a10.append(e10.getClass().getSimpleName());
            a10.append(e10.getMessage());
            Logger.i("NetworkUtil", a10.toString());
            return " ";
        }
    }

    public static int getWifiRssi(Context context) {
        if (context == null) {
            return -127;
        }
        Object systemService = ContextCompat.getSystemService(context.getApplicationContext(), "wifi");
        if (!(systemService instanceof WifiManager)) {
            return -127;
        }
        try {
            WifiInfo connectionInfo = ((WifiManager) systemService).getConnectionInfo();
            if (connectionInfo == null || connectionInfo.getBSSID() == null) {
                return -127;
            }
            return connectionInfo.getRssi();
        } catch (RuntimeException e10) {
            StringBuilder a10 = android.support.v4.media.d.a("getWifiRssiLevel did not has permission!");
            a10.append(e10.getClass().getSimpleName());
            a10.append(e10.getMessage());
            Logger.i("NetworkUtil", a10.toString());
            return -127;
        }
    }

    public static int getWifiRssiLevel(Context context) {
        return WifiManager.calculateSignalLevel(getWifiRssi(context), 5);
    }

    public static boolean isChangeToConnected(NetworkInfo networkInfo, NetworkInfo networkInfo2) {
        if ((networkInfo == null || !networkInfo.isConnected()) && networkInfo2.isConnected()) {
            Logger.v("NetworkUtil", "Find network state changed to connected");
            return true;
        }
        return false;
    }

    public static boolean isConnectTypeChange(NetworkInfo networkInfo, NetworkInfo networkInfo2) {
        if (networkInfo == null || !networkInfo.isConnected() || !networkInfo2.isConnected() || getPrimaryNetworkType(networkInfo) == getPrimaryNetworkType(networkInfo2)) {
            return false;
        }
        Logger.v("NetworkUtil", "Find activity network changed");
        return true;
    }

    @Deprecated
    public static boolean isForeground(Context context) {
        return ActivityUtil.isForeground(context);
    }

    public static boolean isNetworkAvailable(Context context) {
        if (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo networkInfo = getNetworkInfo(context);
            return networkInfo != null && networkInfo.isConnected();
        }
        return true;
    }

    public static boolean isSimReady(Context context) {
        Object systemService = ContextCompat.getSystemService(context, "phone");
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        return telephonyManager != null && telephonyManager.getSimState() == 5;
    }

    public static boolean isUserUnlocked(Context context) {
        UserManager userManager;
        boolean isUserUnlocked;
        if (Build.VERSION.SDK_INT < 24 || (userManager = (UserManager) ContextCompat.getSystemService(context, "user")) == null) {
            return true;
        }
        try {
            isUserUnlocked = userManager.isUserUnlocked();
            return isUserUnlocked;
        } catch (RuntimeException e10) {
            Logger.e("NetworkUtil", "dealType rethrowFromSystemServer:", e10);
            return true;
        }
    }

    public static int netWork(Context context) {
        int networkType = getNetworkType(context);
        Logger.v("NetworkUtil", "newWorkType " + networkType);
        if (networkType == 4) {
            if (TextUtils.equals("5G_NSA", getNetWorkNSAorSA())) {
                return 7;
            }
            return networkType;
        } else if (networkType == 5 && TextUtils.equals("5G_SA", getNetWorkNSAorSA())) {
            return 8;
        } else {
            return networkType;
        }
    }

    @Deprecated
    public static NetworkInfo.DetailedState networkStatus(Context context) {
        return getNetworkStatus(context);
    }

    @SuppressLint({"MissingPermission"})
    public static int readDataSaverMode(Context context) {
        int restrictBackgroundStatus;
        int i10 = 0;
        if (context != null && Build.VERSION.SDK_INT >= 24 && ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            Object systemService = ContextCompat.getSystemService(context, "connectivity");
            if (systemService instanceof ConnectivityManager) {
                ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                try {
                    if (connectivityManager.isActiveNetworkMetered()) {
                        restrictBackgroundStatus = connectivityManager.getRestrictBackgroundStatus();
                        i10 = restrictBackgroundStatus;
                    } else {
                        Logger.v("NetworkUtil", "ConnectType is not Mobile Network!");
                    }
                } catch (RuntimeException e10) {
                    Logger.e("NetworkUtil", "SystemServer error:", e10);
                }
            }
        }
        return i10;
    }
}
