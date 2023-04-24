package o8;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import c0.e;
import c0.f;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.scankit.C0637e;
import d6.s;
import gm.j;
import gm.l;
import i8.p;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import m2.t;
import m2.y;
import mf.a0;
import o5.q0;
import o5.v;
import om.h;
import org.json.JSONArray;
import org.json.JSONStringer;
import vl.a;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a */
    public static Context f22882a;

    /* renamed from: b */
    public static Boolean f22883b;

    /* renamed from: c */
    public static String f22884c;

    /* renamed from: d */
    public static String f22885d;

    /* renamed from: e */
    public static String f22886e;

    /* renamed from: f */
    public static String f22887f;

    /* renamed from: g */
    public static String f22888g;

    /* renamed from: h */
    public static boolean f22889h;

    public static void A(Parcel parcel, int i10, long j10) {
        parcel.writeInt(i10 | 524288);
        parcel.writeLong(j10);
    }

    public static void B(Parcel parcel, int i10, Parcelable parcelable, int i11) {
        if (parcelable == null) {
            return;
        }
        int F = F(parcel, i10);
        parcelable.writeToParcel(parcel, i11);
        J(parcel, F);
    }

    public static void C(Parcel parcel, int i10, String str) {
        if (str == null) {
            return;
        }
        int F = F(parcel, i10);
        parcel.writeString(str);
        J(parcel, F);
    }

    public static void D(Parcel parcel, int i10, Parcelable[] parcelableArr, int i11) {
        if (parcelableArr == null) {
            return;
        }
        int F = F(parcel, i10);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                K(parcel, parcelable, i11);
            }
        }
        J(parcel, F);
    }

    public static void E(Parcel parcel, int i10, List list) {
        if (list == null) {
            return;
        }
        int F = F(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            Parcelable parcelable = (Parcelable) list.get(i11);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                K(parcel, parcelable, 0);
            }
        }
        J(parcel, F);
    }

    public static int F(Parcel parcel, int i10) {
        parcel.writeInt(i10 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static String G(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String sb2;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i11 >= length) {
                break;
            }
            Object obj = objArr[i11];
            if (obj == null) {
                sb2 = "null";
            } else {
                try {
                    sb2 = obj.toString();
                } catch (Exception e10) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e10);
                    StringBuilder a10 = androidx.activity.result.d.a("<", str2, " threw ");
                    a10.append(e10.getClass().getName());
                    a10.append(">");
                    sb2 = a10.toString();
                }
            }
            objArr[i11] = sb2;
            i11++;
        }
        StringBuilder sb3 = new StringBuilder((length * 16) + str.length());
        int i12 = 0;
        while (true) {
            length2 = objArr.length;
            if (i10 >= length2 || (indexOf = str.indexOf("%s", i12)) == -1) {
                break;
            }
            sb3.append((CharSequence) str, i12, indexOf);
            sb3.append(objArr[i10]);
            i12 = indexOf + 2;
            i10++;
        }
        sb3.append((CharSequence) str, i12, str.length());
        if (i10 < length2) {
            sb3.append(" [");
            sb3.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb3.append(", ");
                sb3.append(objArr[i13]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }

    public static void H(int i10) {
        boolean z10;
        if (i10 != 100 && i10 != 102 && i10 != 104) {
            if (i10 != 105) {
                z10 = false;
                p.b(z10, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i10));
            }
            i10 = 105;
        }
        z10 = true;
        p.b(z10, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i10));
    }

    public static String I(int i10) {
        if (i10 != 100) {
            if (i10 != 102) {
                if (i10 != 104) {
                    if (i10 == 105) {
                        return "PASSIVE";
                    }
                    throw new IllegalArgumentException();
                }
                return "LOW_POWER";
            }
            return "BALANCED_POWER_ACCURACY";
        }
        return "HIGH_ACCURACY";
    }

    public static void J(Parcel parcel, int i10) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10 - 4);
        parcel.writeInt(dataPosition - i10);
        parcel.setDataPosition(dataPosition);
    }

    public static void K(Parcel parcel, Parcelable parcelable, int i10) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i10);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    public static SecretKeySpec a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr.length == 16 && bArr2.length == 16 && bArr3.length == 16) {
            b(bArr, -4);
            byte[] d10 = d(bArr, bArr2);
            b(d10, 6);
            return new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(jb.b.a(d(d10, bArr3)).toCharArray(), bArr4, 5000, 128)).getEncoded(), "AES");
        }
        throw new IllegalArgumentException("invalid data for generating the key.");
    }

    public static void b(byte[] bArr, int i10) {
        for (int i11 = 0; i11 < bArr.length; i11++) {
            if (i10 < 0) {
                bArr[i11] = (byte) (bArr[i11] << (-i10));
            } else {
                bArr[i11] = (byte) (bArr[i11] >> i10);
            }
        }
    }

    public static boolean c(Long l10) {
        if (l10 == null) {
            com.huawei.hms.framework.common.Logger.v(C0637e.f7371a, "Method isTimeExpire input param expireTime is null.");
            return true;
        }
        try {
        } catch (NumberFormatException unused) {
            com.huawei.hms.framework.common.Logger.v(C0637e.f7371a, "isSpExpire spValue NumberFormatException.");
        }
        if (l10.longValue() - System.currentTimeMillis() >= 0) {
            com.huawei.hms.framework.common.Logger.i(C0637e.f7371a, "isSpExpire false.");
            return false;
        }
        com.huawei.hms.framework.common.Logger.i(C0637e.f7371a, "isSpExpire true.");
        return true;
    }

    public static byte[] d(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            byte[] bArr3 = new byte[bArr.length];
            for (int i10 = 0; i10 < bArr.length; i10++) {
                bArr3[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
            }
            return bArr3;
        }
        throw new IllegalArgumentException("left and right must be the same length.");
    }

    public static boolean e(Long l10) {
        if (l10 == null) {
            com.huawei.hms.framework.common.Logger.v(C0637e.f7371a, "Method isTimeWillExpire input param expireTime is null.");
            return true;
        }
        try {
            if (l10.longValue() - (System.currentTimeMillis() + 300000) >= 0) {
                com.huawei.hms.framework.common.Logger.v(C0637e.f7371a, "isSpExpire false.");
                return false;
            }
        } catch (NumberFormatException unused) {
            com.huawei.hms.framework.common.Logger.v(C0637e.f7371a, "isSpExpire spValue NumberFormatException.");
        }
        return true;
    }

    public static void f(String str, String str2) {
        Log.e("SecurityComp10105306: " + str, str2);
    }

    public static ParcelUuid g(byte[] bArr) {
        if (bArr.length < 16) {
            return null;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.BIG_ENDIAN);
        return new ParcelUuid(new UUID(wrap.getLong(0), wrap.getLong(8)));
    }

    public static void h(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static c0.a i() {
        if (c0.a.f4499a == null) {
            synchronized (c0.a.class) {
                if (c0.a.f4499a == null) {
                    c0.a.f4499a = new c0.a();
                }
            }
        }
        return c0.a.f4499a;
    }

    public static float j(float f10, float f11, float f12, float f13) {
        double d10 = 0.0f - f10;
        double d11 = 0.0f - f11;
        float hypot = (float) Math.hypot(d10, d11);
        double d12 = f12 - f10;
        float hypot2 = (float) Math.hypot(d12, d11);
        double d13 = f13 - f11;
        float hypot3 = (float) Math.hypot(d12, d13);
        float hypot4 = (float) Math.hypot(d10, d13);
        return (hypot <= hypot2 || hypot <= hypot3 || hypot <= hypot4) ? (hypot2 <= hypot3 || hypot2 <= hypot4) ? hypot3 > hypot4 ? hypot3 : hypot4 : hypot2 : hypot;
    }

    public static final void k(s2.a aVar) {
        l.f(aVar, "db");
        vl.a aVar2 = new vl.a();
        Cursor U = aVar.U("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        l.e(U, "db.query(\"SELECT name FR… WHERE type = 'trigger'\")");
        while (U.moveToNext()) {
            try {
                aVar2.add(U.getString(0));
            } finally {
            }
        }
        tl.l lVar = tl.l.f28297a;
        a0.d(U, null);
        h7.a.g(aVar2);
        Iterator it = aVar2.iterator();
        while (true) {
            a.C0536a c0536a = (a.C0536a) it;
            if (c0536a.hasNext()) {
                String str = (String) c0536a.next();
                l.e(str, "triggerName");
                if (h.a0(str, "room_fts_content_sync_", false)) {
                    aVar.o("DROP TRIGGER IF EXISTS " + str);
                }
            } else {
                return;
            }
        }
    }

    public static final void l(Throwable th2) {
        HashMap hashMap;
        s.b bVar;
        s.b bVar2 = s.b.Unknown;
        if (f22889h && th2 != null) {
            HashSet hashSet = new HashSet();
            StackTraceElement[] stackTrace = th2.getStackTrace();
            l.e(stackTrace, "e.stackTrace");
            for (StackTraceElement stackTraceElement : stackTrace) {
                s sVar = s.f12755a;
                String className = stackTraceElement.getClassName();
                l.e(className, "it.className");
                synchronized (s.f12755a) {
                    hashMap = s.f12756b;
                    if (hashMap.isEmpty()) {
                        hashMap.put(s.b.AAM, new String[]{"com.facebook.appevents.aam."});
                        hashMap.put(s.b.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
                        hashMap.put(s.b.CloudBridge, new String[]{"com.facebook.appevents.cloudbridge."});
                        hashMap.put(s.b.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
                        hashMap.put(s.b.AnrReport, new String[]{"com.facebook.internal.instrument.anrreport."});
                        hashMap.put(s.b.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
                        hashMap.put(s.b.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
                        hashMap.put(s.b.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
                        hashMap.put(s.b.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
                        hashMap.put(s.b.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
                        hashMap.put(s.b.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
                        hashMap.put(s.b.IapLogging, new String[]{"com.facebook.appevents.iap."});
                        hashMap.put(s.b.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
                    }
                }
                Iterator it = hashMap.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        bVar = (s.b) entry.getKey();
                        String[] strArr = (String[]) entry.getValue();
                        int length = strArr.length;
                        int i10 = 0;
                        while (i10 < length) {
                            String str = strArr[i10];
                            i10++;
                            if (h.a0(className, str, false)) {
                                break;
                            }
                        }
                    } else {
                        bVar = bVar2;
                        break;
                    }
                }
                if (bVar != bVar2) {
                    s sVar2 = s.f12755a;
                    l.f(bVar, "feature");
                    v.a().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString(l.k(bVar, "FBSDKFeature"), "14.1.0").apply();
                    hashSet.add(bVar.toString());
                }
            }
            v vVar = v.f22837a;
            if (q0.b() && (!hashSet.isEmpty())) {
                new f6.b(new JSONArray((Collection) hashSet)).c();
            }
        }
    }

    public static byte[] m(String str, String str2, String str3, String str4, String str5) {
        byte[] b10;
        StringBuilder sb2;
        ByteOrder byteOrder = x3.b.f30193a;
        j.e("DataUtils", "deviceName ==> " + str);
        j.e("DataUtils", "deviceSecret ==> " + str2);
        j.e("DataUtils", "productKey ==> " + str3);
        j.e("DataUtils", "timestamp ==> " + str4);
        j.e("DataUtils", "sonce ==> " + str5);
        byte[] bArr = null;
        try {
            if (TextUtils.isEmpty(str5)) {
                j.e("DataUtils", "r1(sonce)为空，启用固定值测试");
                Log.d("DataUtils", "secretKey: 0123456789abcdef");
                b10 = "0123456789abcdef".getBytes("UTF-8");
                String a10 = pa.a.a(b10);
                Log.d("DataUtils", "secretKey hex: " + a10);
                str2 = "103e325c29ea5368ed421b75f07bdd49";
                sb2 = new StringBuilder();
                sb2.append("ds明文 ：");
            } else {
                b10 = rm.l.b(str5, str4, str3);
                String a11 = pa.a.a(b10);
                Log.d("DataUtils", "secretKey hex: " + a11);
                sb2 = new StringBuilder();
                sb2.append("ds明文 ：");
            }
            sb2.append(str2);
            Log.d("DataUtils", sb2.toString());
            byte[] bytes = str2.getBytes();
            SecretKeySpec secretKeySpec = new SecretKeySpec(b10, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, secretKeySpec, new IvParameterSpec(new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}));
            bArr = cipher.doFinal(bytes);
            String a12 = pa.a.a(bArr);
            PrintStream printStream = System.out;
            printStream.println("ds密文 Hex: " + a12);
        } catch (Exception e10) {
            Log.d("DataUtils", "加密失败，明文：" + str2);
            e10.printStackTrace();
        }
        String a13 = x3.a.a(bArr);
        Log.d("FGSInfoConfig", "DS密文并进行了base64编码：" + a13);
        return x3.b.c("FGS", new JSONStringer().object().key("msg_type").value("FGS_MSG_TYPE_DS_DOWNLOAD_REQ").key("code").value(200L).key("deviceSecret").value(a13).key(CrashHianalyticsData.MESSAGE).value("success").key("sidver").value(1L).endObject().toString());
    }

    public static final File n(Context context, String str) {
        File file = new File(context.getFilesDir(), android.support.v4.media.a.a("json/", str, ".json"));
        File parentFile = file.getParentFile();
        if (parentFile != null && (parentFile.exists() || parentFile.mkdirs())) {
            return file;
        }
        StringBuilder a10 = android.support.v4.media.d.a("file ");
        a10.append(file.getAbsolutePath());
        a10.append(" not exist");
        throw new FileNotFoundException(a10.toString());
    }

    public static e o() {
        if (e.f4512b == null) {
            synchronized (e.class) {
                if (e.f4512b == null) {
                    e.f4512b = new e();
                }
            }
        }
        return e.f4512b;
    }

    public static c0.b p() {
        if (f.f4515a == null) {
            synchronized (f.class) {
                if (f.f4515a == null) {
                    f.f4515a = new c0.b(new Handler(Looper.getMainLooper()));
                }
            }
        }
        return f.f4515a;
    }

    public static String q(int i10) {
        switch (i10) {
            case 257:
                return "PROGRESS_ORIGIN";
            case 258:
                return "PROGRESS_IMAGE_ACTIVE_SUCCESS";
            case 259:
                return "PROGRESS_ABORTED";
            case 260:
                return "PROGRESS_PROCESSING_ERROR";
            case 261:
                return "PROGRESS_COMPLETED";
            default:
                switch (i10) {
                    case 513:
                        return "PROGRESS_INITIALIZE";
                    case 514:
                        return "PROGRESS_STARTED";
                    case 515:
                        return "PROGRESS_SCAN_REMOTE";
                    case 516:
                        return "PROGRESS_CONNECT_REMOTE";
                    case 517:
                        return "PROGRESS_PREPARE_OTA_ENVIRONMENT";
                    case 518:
                        return "PROGRESS_REMOTE_ENTER_OTA";
                    case 519:
                        return "PROGRESS_SCAN_OTA_REMOTE";
                    case 520:
                        return "PROGRESS_CONNECT_OTA_REMOTE";
                    case 521:
                        return "PROGRESS_START_DFU_PROCESS";
                    case 522:
                        return "PROGRESS_HAND_OVER_PROCESSING";
                    case 523:
                        return "PROGRESS_PENDING_ACTIVE_IMAGE";
                    case 524:
                        return "PROGRESS_ACTIVE_IMAGE_AND_RESET";
                    case 525:
                        return "PROGRESS_ABORT_PROCESSING";
                    case 526:
                        return "PROGRESS_DOWNLOAD_FIRMWARE";
                    case 527:
                        return "PROGRESS_SCAN_SECONDARY_BUD";
                    default:
                        return String.format("Unknown: 0x%04X", Integer.valueOf(i10));
                }
        }
    }

    public static final Cursor r(t tVar, y yVar) {
        l.f(tVar, "db");
        l.f(yVar, "sqLiteQuery");
        return tVar.o(yVar, null);
    }

    public static byte[] s(ParcelUuid parcelUuid) {
        ByteBuffer allocate = ByteBuffer.allocate(16);
        allocate.order(ByteOrder.BIG_ENDIAN);
        UUID uuid = parcelUuid.getUuid();
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        allocate.putLong(mostSignificantBits);
        allocate.putLong(8, leastSignificantBits);
        return allocate.array();
    }

    public static void t(Parcel parcel, int i10, boolean z10) {
        parcel.writeInt(i10 | 262144);
        parcel.writeInt(z10 ? 1 : 0);
    }

    public static void u(Parcel parcel, int i10, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int F = F(parcel, i10);
        parcel.writeBundle(bundle);
        J(parcel, F);
    }

    public static void v(Parcel parcel, int i10, byte b10) {
        parcel.writeInt(i10 | 262144);
        parcel.writeInt(b10);
    }

    public static void w(Parcel parcel, int i10, float f10) {
        parcel.writeInt(i10 | 262144);
        parcel.writeFloat(f10);
    }

    public static void x(Parcel parcel, int i10, Float f10) {
        if (f10 == null) {
            return;
        }
        parcel.writeInt(i10 | 262144);
        parcel.writeFloat(f10.floatValue());
    }

    public static void y(Parcel parcel, int i10, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int F = F(parcel, i10);
        parcel.writeStrongBinder(iBinder);
        J(parcel, F);
    }

    public static void z(Parcel parcel, int i10, int i11) {
        parcel.writeInt(i10 | 262144);
        parcel.writeInt(i11);
    }
}
