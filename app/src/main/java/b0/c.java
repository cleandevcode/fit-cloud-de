package b0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import bi.m0;
import com.google.android.gms.common.api.Status;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.framework.common.Logger;
import java.io.EOFException;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import javax.net.ssl.HttpsURLConnection;
import l2.j3;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.json.JSONArray;
import org.json.JSONObject;
import s.h1;
import y.u0;
import y3.r0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public static final float[][] f3931a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b */
    public static final float[][] f3932b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c */
    public static final float[] f3933c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d */
    public static final float[][] f3934d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    public static String a(String str, String str2) {
        if (str.equals(str2)) {
            return str;
        }
        HashSet hashSet = new HashSet();
        if (!TextUtils.isEmpty(str)) {
            JSONArray jSONArray = new JSONObject(str).getJSONArray("services");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                hashSet.add(jSONArray.getString(i10));
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            JSONArray jSONArray2 = new JSONObject(str2).getJSONArray("services");
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                hashSet.add(jSONArray2.getString(i11));
            }
        }
        if (hashSet.isEmpty()) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray3 = new JSONArray();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            jSONArray3.put((String) it.next());
        }
        jSONObject.put("services", jSONArray3);
        return jSONObject.toString();
    }

    public static HttpsURLConnection b(Context context, String str, String str2) {
        Context appContext;
        String format;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        URLConnection openConnection = new URL(str).openConnection();
        if (openConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
            try {
                httpsURLConnection.setSSLSocketFactory(wb.a.a(context));
                httpsURLConnection.setHostnameVerifier(wb.a.f29778a);
            } catch (IllegalArgumentException unused) {
                Logger.w("URLConnectionHelper", "init https ssl socket failed.");
            }
            httpsURLConnection.setConnectTimeout(10000);
            httpsURLConnection.setReadTimeout(10000);
            httpsURLConnection.setDoOutput(true);
            httpsURLConnection.setUseCaches(false);
            if (context == null) {
                format = String.format(Locale.ROOT, "NetworkKit-grs/%s", "5.0.10.302");
            } else {
                if (ContextHolder.getAppContext() == null) {
                    appContext = context;
                } else {
                    appContext = ContextHolder.getAppContext();
                }
                String packageName = appContext.getPackageName();
                String str3 = "";
                if (ContextHolder.getAppContext() != null) {
                    context = ContextHolder.getAppContext();
                }
                try {
                    str3 = context.getPackageManager().getPackageInfo(context.getPackageName(), DfuBaseService.ERROR_CONNECTION_MASK).versionName;
                } catch (PackageManager.NameNotFoundException e10) {
                    Logger.w("AgentUtil", "", e10);
                }
                String str4 = Build.VERSION.RELEASE;
                String str5 = Build.MODEL;
                Locale locale = Locale.ROOT;
                Object[] objArr = new Object[6];
                objArr[0] = packageName;
                objArr[1] = str3;
                objArr[2] = str4;
                objArr[3] = str5;
                objArr[4] = "5.0.10.302";
                if (TextUtils.isEmpty(str2)) {
                    str2 = "no_service_name";
                }
                objArr[5] = str2;
                format = String.format(locale, "%s/%s (Linux; Android %s; %s) NetworkKit-grs/%s %s", objArr);
            }
            Logger.d("URLConnectionHelper", "request to grs server with a User-Agent header is:" + format);
            httpsURLConnection.setRequestProperty("User-Agent", format);
            return httpsURLConnection;
        }
        Logger.w("URLConnectionHelper", "urlConnection is not an instance of HttpsURLConnection");
        return null;
    }

    public static void c(HttpsURLConnection httpsURLConnection, String str) {
        if (str == null) {
            Logger.i("URLConnectionHelper", "sendHttpBody: The Body Data is Null");
            return;
        }
        OutputStream outputStream = null;
        try {
            outputStream = httpsURLConnection.getOutputStream();
            outputStream.write(str.getBytes("UTF-8"));
            outputStream.flush();
        } finally {
            IoUtils.closeSecure(outputStream);
        }
    }

    public static final boolean d(Field field, mm.b... bVarArr) {
        if (bVarArr.length > 0) {
            mm.b bVar = bVarArr[0];
            Class<?> type = field.getType();
            boolean z10 = type instanceof ParameterizedType;
            Class p10 = m0.p(bVar);
            if (z10) {
                Type rawType = ((ParameterizedType) type).getRawType();
                gm.l.d(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
                type = (Class) rawType;
            }
            return p10.isAssignableFrom(type);
        }
        return false;
    }

    public static final boolean e(Field field, mm.b... bVarArr) {
        if (bVarArr.length > 0) {
            mm.b bVar = bVarArr[0];
            Class<?> type = field.getType();
            boolean z10 = type instanceof ParameterizedType;
            Class p10 = m0.p(bVar);
            if (z10) {
                Type rawType = ((ParameterizedType) type).getRawType();
                gm.l.d(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
                type = (Class) rawType;
            }
            return p10.isAssignableFrom(type);
        }
        return false;
    }

    public static byte[] f(short s10) {
        return new byte[]{(byte) (s10 & 255), (byte) ((s10 >> 8) & 255)};
    }

    public static void g(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void h(Object obj, Class cls) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    public static void i(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Argument must not be null");
        }
    }

    public static void j(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static int k(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
    }

    public static final Class l(Class cls) {
        Class<?> cls2;
        gm.l.f(cls, "<this>");
        Class<?>[] declaredClasses = cls.getDeclaredClasses();
        gm.l.e(declaredClasses, "declaredClasses");
        int length = declaredClasses.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                cls2 = null;
                break;
            }
            cls2 = declaredClasses[i10];
            if (r0.class.isAssignableFrom(cls2)) {
                break;
            }
            i10++;
        }
        if (cls2 != null) {
            return cls2;
        }
        return null;
    }

    public static View m(View view, int i10) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View findViewById = viewGroup.getChildAt(i11).findViewById(i10);
                if (findViewById != null) {
                    return findViewById;
                }
            }
            return null;
        }
        return null;
    }

    public static int n(int i10, int i11, boolean z10) {
        int i12 = (z10 ? (i11 - i10) + 360 : i11 + i10) % 360;
        if (u0.e("CameraOrientationUtil")) {
            u0.a("CameraOrientationUtil", String.format("getRelativeImageRotation: destRotationDegrees=%s, sourceRotationDegrees=%s, isOppositeFacing=%s, result=%s", Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10), Integer.valueOf(i12)));
        }
        return i12;
    }

    public static final Object o(Class cls) {
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        gm.l.e(declaredConstructors, "declaredConstructors");
        for (Constructor<?> constructor : declaredConstructors) {
            if (constructor.getParameterTypes().length == 1) {
                Object newInstance = constructor.newInstance(null);
                gm.l.e(newInstance, "declaredConstructors.fir… == 1 }.newInstance(null)");
                return newInstance;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final boolean p(ln.e eVar) {
        long j10;
        gm.l.f(eVar, "<this>");
        try {
            ln.e eVar2 = new ln.e();
            long j11 = eVar.f20098b;
            if (j11 > 64) {
                j10 = 64;
            } else {
                j10 = j11;
            }
            eVar.v(eVar2, 0L, j10);
            for (int i10 = 0; i10 < 16; i10++) {
                if (!eVar2.A()) {
                    int R = eVar2.R();
                    if (Character.isISOControl(R) && !Character.isWhitespace(R)) {
                        return false;
                    }
                } else {
                    return true;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static float q(int i10) {
        float f10 = i10 / 255.0f;
        return (f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static String r(int i10) {
        if (i10 != 257) {
            switch (i10) {
                case 0:
                    return "0x0000-SUCCESS";
                case 1:
                    return "0x0001-GATT_INVALID_HANDLE";
                case 2:
                    return "0x0002-GATT_READ_NOT_PERMIT";
                case 3:
                    return "0x0003-GATT_WRITE_NOT_PERMIT";
                case 4:
                    return "0x0004-GATT_INVALID_PDU";
                case 5:
                    return "0x0005-GATT_INSUF_AUTHENTICATION";
                case 6:
                    return "0x0006-GATT_REQ_NOT_SUPPORTED";
                case 7:
                    return "0x0007-GATT_INVALID_OFFSET";
                case 8:
                    return "0x0008-GATT_INSUF_AUTHORIZATION";
                case 9:
                    return "0x0009-GATT_PREPARE_Q_FULL";
                case 10:
                    return "0x000a-GATT_NOT_FOUND";
                case 11:
                    return "0x000b-GATT_NOT_LONG";
                case 12:
                    return "0x000c-GATT_INSUF_KEY_SIZE";
                case 13:
                    return "0x000d-GATT_INVALID_ATTR_LEN";
                case 14:
                    return "0x000e-GATT_ERR_UNLIKELY";
                case 15:
                    return "0x000f-GATT_INSUF_ENCRYPTION";
                case 16:
                    return "0x0010-GATT_UNSUPPORT_GRP_TYPE";
                case 17:
                    return "0x0011-GATT_INSUF_RESOURCE";
                default:
                    switch (i10) {
                        case 128:
                            return "0x0080-GATT_NO_RESOURCES";
                        case 129:
                            return "0x0081-GATT_INTERNAL_ERROR";
                        case 130:
                            return "0x0082-GATT_WRONG_STATE";
                        case 131:
                            return "0x0083-GATT_DB_FULL";
                        case 132:
                            return "0x0084-GATT_BUSY";
                        case 133:
                            return "0x0085-GATT_ERROR";
                        case 134:
                            return "0x0086-GATT_CMD_STARTED";
                        case 135:
                            return "0x0087-GATT_ILLEGAL_PARAMETER";
                        case 136:
                            return "0x0088-GATT_PENDING";
                        case 137:
                            return "0x0089-GATT_AUTH_FAIL";
                        case 138:
                            return "0x008a-GATT_MORE";
                        case 139:
                            return "0x008b-GATT_INVALID_CFG";
                        case 140:
                            return "0x008c-GATT_SERVICE_STARTED";
                        case 141:
                            return "0x008d-GATT_ENCRYPED_NO_MITM";
                        case 142:
                            return "0x008e-GATT_NOT_ENCRYPTED";
                        case 143:
                            return "0x008f-GATT_CONGESTED";
                        default:
                            switch (i10) {
                                case 253:
                                    return "0x00FD-GATT_CCC_CFG_ERR";
                                case 254:
                                    return "0x00FE-GATT_PRC_IN_PROGRESS";
                                case 255:
                                    return "0x00FF-GATT_OUT_OF_RANGE";
                                default:
                                    return "UNKNOWN (" + i10 + ")";
                            }
                    }
            }
        }
        return "0x0101-TOO MANY OPEN CONNECTIONS";
    }

    public static void s(Status status, Object obj, g9.h hVar) {
        boolean z10;
        if (status.f6057b <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            hVar.a(obj);
            return;
        }
        hVar.f15034a.c(h1.n(status));
    }

    public static final boolean t(j3 j3Var, j3 j3Var2, l2.r0 r0Var) {
        gm.l.f(j3Var, "<this>");
        if (j3Var2 != null && ((!(j3Var2 instanceof j3.b) || !(j3Var instanceof j3.a)) && (((j3Var instanceof j3.b) && (j3Var2 instanceof j3.a)) || (j3Var.f19033c == j3Var2.f19033c && j3Var.f19034d == j3Var2.f19034d && j3Var2.a(r0Var) <= j3Var.a(r0Var))))) {
            return false;
        }
        return true;
    }

    public static int u(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        return 270;
                    }
                    throw new IllegalArgumentException(androidx.appcompat.widget.u0.a("Unsupported surface rotation: ", i10));
                }
                return 180;
            }
            return 90;
        }
        return 0;
    }

    public static float v() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }
}
