package p;

import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.ParcelUuid;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.widget.u0;
import com.github.kilnn.tool.R;
import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.framework.common.Logger;
import fm.l;
import ga.f;
import ga.h;
import i2.b0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import k1.i2;
import k1.o0;
import m2.c0;
import m2.t;
import no.nordicsemi.android.dfu.DfuBaseService;
import pm.b0;
import pm.g0;
import pm.n0;
import pm.y0;
import s.h1;
import ul.i;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public static c9.a f23722a;

    public static void A(int i10, int i11) {
        String G;
        if (i10 >= 0 && i10 < i11) {
            return;
        }
        if (i10 >= 0) {
            if (i11 < 0) {
                throw new IllegalArgumentException(u0.a("negative size: ", i11));
            }
            G = o8.b.G("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
        } else {
            G = o8.b.G("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException(G);
    }

    public static void B(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(D(i10, i11, "index"));
        }
    }

    public static void C(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException((i10 < 0 || i10 > i12) ? D(i10, i12, "start index") : (i11 < 0 || i11 > i12) ? D(i11, i12, "end index") : o8.b.G("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    public static String D(int i10, int i11, String str) {
        if (i10 < 0) {
            return o8.b.G("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return o8.b.G("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(u0.a("negative size: ", i11));
    }

    public static String a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        InputStream inputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                if (!new File(str).isDirectory()) {
                    inputStream = context.getAssets().open(str);
                    byte[] bArr = new byte[DfuBaseService.ERROR_REMOTE_MASK];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            byteArrayOutputStream.flush();
                            return new String(byteArrayOutputStream.toByteArray(), "UTF-8");
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                }
            } catch (IOException unused) {
                Logger.w("c", "local config file is not exist.filename is {%s}", str);
            }
            return "";
        } finally {
            IoUtils.closeSecure((OutputStream) byteArrayOutputStream);
            IoUtils.closeSecure(inputStream);
        }
    }

    public static String b(String str) {
        return a.b.b("SecurityComp10105309: ", str);
    }

    public static void c(String str, String str2) {
        Log.e(b(str), str2);
    }

    public static String d(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            String hexString = Integer.toHexString(b10 & 255);
            if (hexString.length() == 1) {
                sb2.append('0');
            }
            sb2.append(hexString);
        }
        return sb2.toString();
    }

    public static void e(String str, String str2) {
        Log.i(b(str), str2);
    }

    public static void f() {
        h1.k("Not in application's main thread", s());
    }

    public static void g(View view, l lVar) {
        gm.l.f(view, "<this>");
        gm.l.f(lVar, "block");
        view.setTag(R.id.triggerDelayKey, 500L);
        view.setOnClickListener(new k7.b(view, lVar, 0));
    }

    public static String h(byte[] bArr) {
        StringBuilder sb2;
        byte b10;
        StringBuilder a10;
        byte b11;
        StringBuilder a11;
        byte b12;
        StringBuilder a12;
        byte b13;
        StringBuilder a13;
        byte b14;
        StringBuilder a14;
        byte b15;
        if (bArr != null && bArr.length >= 6) {
            if ((bArr[5] & 255) <= 15) {
                sb2 = new StringBuilder("0");
                b10 = bArr[5];
            } else {
                sb2 = new StringBuilder();
                b10 = bArr[5];
            }
            sb2.append(Integer.toHexString(b10 & 255).toUpperCase());
            sb2.append(":");
            String sb3 = sb2.toString();
            if ((bArr[4] & 255) <= 15) {
                a10 = a.a(sb3, "0");
                b11 = bArr[4];
            } else {
                a10 = android.support.v4.media.d.a(sb3);
                b11 = bArr[4];
            }
            a10.append(Integer.toHexString(b11 & 255).toUpperCase());
            a10.append(":");
            String sb4 = a10.toString();
            if ((bArr[3] & 255) <= 15) {
                a11 = a.a(sb4, "0");
                b12 = bArr[3];
            } else {
                a11 = android.support.v4.media.d.a(sb4);
                b12 = bArr[3];
            }
            a11.append(Integer.toHexString(b12 & 255).toUpperCase());
            a11.append(":");
            String sb5 = a11.toString();
            if ((bArr[2] & 255) <= 15) {
                a12 = a.a(sb5, "0");
                b13 = bArr[2];
            } else {
                a12 = android.support.v4.media.d.a(sb5);
                b13 = bArr[2];
            }
            a12.append(Integer.toHexString(b13 & 255).toUpperCase());
            a12.append(":");
            String sb6 = a12.toString();
            if ((bArr[1] & 255) <= 15) {
                a13 = a.a(sb6, "0");
                b14 = bArr[1];
            } else {
                a13 = android.support.v4.media.d.a(sb6);
                b14 = bArr[1];
            }
            a13.append(Integer.toHexString(b14 & 255).toUpperCase());
            a13.append(":");
            String sb7 = a13.toString();
            if ((bArr[0] & 255) <= 15) {
                a14 = a.a(sb7, "0");
                b15 = bArr[0];
            } else {
                a14 = android.support.v4.media.d.a(sb7);
                b15 = bArr[0];
            }
            a14.append(Integer.toHexString(b15 & 255).toUpperCase());
            return a14.toString();
        }
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
        r2 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final ik.d i(androidx.fragment.app.x r2, i2.j r3) {
        /*
        L0:
            boolean r0 = r2 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L21
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto L15
            android.app.Activity r2 = (android.app.Activity) r2
            androidx.lifecycle.v0$b r3 = r3.r()
            androidx.lifecycle.p0 r3 = (androidx.lifecycle.p0) r3
            ik.d r2 = ik.d.c(r2, r3)
            return r2
        L15:
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            java.lang.String r0 = "ctx.baseContext"
            gm.l.e(r2, r0)
            goto L0
        L21:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected an activity context for creating a HiltViewModelFactory for a "
            r0.append(r1)
            java.lang.String r1 = "NavBackStackEntry but instead found: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p.b.i(androidx.fragment.app.x, i2.j):ik.d");
    }

    public static g0 j(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return new h();
            }
            return new ga.d();
        }
        return new h();
    }

    public static String k(BluetoothDevice bluetoothDevice) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("BluetoothDevice{ %s/%s", m(bluetoothDevice.getAddress()), bluetoothDevice.getName()));
        Locale locale = Locale.US;
        sb2.append(String.format(locale, "\n\tbondState=%d, type=0x%02X", Integer.valueOf(bluetoothDevice.getBondState()), Integer.valueOf(bluetoothDevice.getType())));
        BluetoothClass bluetoothClass = bluetoothDevice.getBluetoothClass();
        if (bluetoothClass != null) {
            sb2.append(String.format(locale, ", majorDeviceClass=0x%04X", Integer.valueOf(bluetoothClass.getMajorDeviceClass())));
            sb2.append(String.format(locale, ", deviceClass=0x%04X", Integer.valueOf(bluetoothClass.getDeviceClass())));
        }
        ParcelUuid[] uuids = bluetoothDevice.getUuids();
        if (uuids != null && uuids.length > 0) {
            sb2.append("\n\tsupportedFeaturesUuids");
            int length = uuids.length;
            for (int i10 = 0; i10 < length; i10++) {
                sb2.append(String.format("\n\t\t%s", uuids[i10].toString()));
            }
        }
        sb2.append("\n}");
        return sb2.toString();
    }

    public static String l(BluetoothGatt bluetoothGatt) {
        List<BluetoothGattService> services = bluetoothGatt.getServices();
        StringBuilder sb2 = new StringBuilder();
        for (BluetoothGattService bluetoothGattService : services) {
            sb2.append(String.format(Locale.US, "\nservice: type=%d, %02X/%s", Integer.valueOf(bluetoothGattService.getType()), Integer.valueOf(bluetoothGattService.getInstanceId()), bluetoothGattService.getUuid().toString()));
            for (BluetoothGattCharacteristic bluetoothGattCharacteristic : bluetoothGattService.getCharacteristics()) {
                sb2.append(String.format(Locale.US, "\n\tcharacteristic: %02X/%s", Integer.valueOf(bluetoothGattCharacteristic.getInstanceId()), bluetoothGattCharacteristic.getUuid().toString()));
                sb2.append(String.format("\n\t\tprop= 0x%02X (%s)", Integer.valueOf(bluetoothGattCharacteristic.getProperties()), ae.b.b(bluetoothGattCharacteristic.getProperties())));
                sb2.append(String.format("\n\t\tperms= 0x%02X (%s)", Integer.valueOf(bluetoothGattCharacteristic.getPermissions()), ae.b.a(bluetoothGattCharacteristic.getPermissions())));
                List<BluetoothGattDescriptor> descriptors = bluetoothGattCharacteristic.getDescriptors();
                if (descriptors != null && descriptors.size() > 0) {
                    for (BluetoothGattDescriptor bluetoothGattDescriptor : descriptors) {
                        sb2.append(String.format(Locale.US, "\n\t\t\tdescriptor: UUID: %s", bluetoothGattDescriptor.getUuid().toString()));
                        sb2.append(String.format("\n\t\t\t\tperms= 0x%02X (%s)", Integer.valueOf(bluetoothGattDescriptor.getPermissions()), ae.b.a(bluetoothGattDescriptor.getPermissions())));
                    }
                }
            }
        }
        return sb2.toString();
    }

    public static String m(String str) {
        if (str != null && str.length() == 17) {
            byte[] bArr = new byte[6];
            if (str.length() >= 17) {
                bArr[0] = (byte) (Character.digit(str.charAt(16), 16) + (Character.digit(str.charAt(15), 16) * 16));
                bArr[1] = (byte) (Character.digit(str.charAt(13), 16) + (Character.digit(str.charAt(12), 16) * 16));
                bArr[2] = (byte) (Character.digit(str.charAt(10), 16) + (Character.digit(str.charAt(9), 16) * 16));
                bArr[3] = (byte) (Character.digit(str.charAt(7), 16) + (Character.digit(str.charAt(6), 16) * 16));
                bArr[4] = (byte) (Character.digit(str.charAt(4), 16) + (Character.digit(str.charAt(3), 16) * 16));
                bArr[5] = (byte) (Character.digit(str.charAt(1), 16) + (Character.digit(str.charAt(0), 16) * 16));
            } else {
                bArr[0] = 0;
                bArr[1] = 0;
                bArr[2] = 0;
                bArr[3] = 0;
                bArr[4] = 0;
                bArr[5] = 0;
            }
            return String.format("%02X:%02X:**:**:**:%02X", Byte.valueOf(bArr[5]), Byte.valueOf(bArr[4]), Byte.valueOf(bArr[0]));
        }
        return "";
    }

    public static String n(byte[] bArr, boolean z10) {
        return (bArr == null || bArr.length < 6) ? "" : z10 ? String.format("%02X:%02X:**:**:**:%02X", Byte.valueOf(bArr[0]), Byte.valueOf(bArr[1]), Byte.valueOf(bArr[5])) : String.format("%02X:%02X:%02X:%02X:%02X:%02X", Byte.valueOf(bArr[0]), Byte.valueOf(bArr[1]), Byte.valueOf(bArr[2]), Byte.valueOf(bArr[3]), Byte.valueOf(bArr[4]), Byte.valueOf(bArr[5]));
    }

    public static final int o(Cursor cursor, String str) {
        String str2;
        boolean z10;
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex('`' + str + '`');
            if (columnIndex < 0) {
                if (Build.VERSION.SDK_INT <= 25) {
                    if (str.length() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        String[] columnNames = cursor.getColumnNames();
                        gm.l.e(columnNames, "columnNames");
                        String str3 = '.' + str;
                        String str4 = '.' + str + '`';
                        int length = columnNames.length;
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < length) {
                            String str5 = columnNames[i10];
                            int i12 = i11 + 1;
                            if (str5.length() >= str.length() + 2 && (om.h.U(str5, str3, false) || (str5.charAt(0) == '`' && om.h.U(str5, str4, false)))) {
                                columnIndex = i11;
                                break;
                            }
                            i10++;
                            i11 = i12;
                        }
                    }
                }
                columnIndex = -1;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames2 = cursor.getColumnNames();
            gm.l.e(columnNames2, "c.columnNames");
            str2 = i.C(columnNames2, null, null, null, 63);
        } catch (Exception e10) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e10);
            str2 = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }

    public static final b0 p(t tVar) {
        gm.l.f(tVar, "<this>");
        Map<String, Object> map = tVar.f20271k;
        Object obj = map.get("QueryDispatcher");
        if (obj == null) {
            Executor executor = tVar.f20262b;
            n0 n0Var = null;
            if (executor != null) {
                if (executor instanceof n0) {
                    n0Var = (n0) executor;
                }
                if (n0Var == null || (obj = n0Var.f24372a) == null) {
                    obj = new y0(executor);
                }
                map.put("QueryDispatcher", obj);
            } else {
                gm.l.l("queryExecutor");
                throw null;
            }
        }
        return (b0) obj;
    }

    public static final b0 q(t tVar) {
        gm.l.f(tVar, "<this>");
        Map<String, Object> map = tVar.f20271k;
        Object obj = map.get("TransactionDispatcher");
        if (obj == null) {
            c0 c0Var = tVar.f20263c;
            n0 n0Var = null;
            if (c0Var != null) {
                if (c0Var instanceof n0) {
                    n0Var = (n0) c0Var;
                }
                if (n0Var == null || (obj = n0Var.f24372a) == null) {
                    obj = new y0(c0Var);
                }
                map.put("TransactionDispatcher", obj);
            } else {
                gm.l.l("transactionExecutor");
                throw null;
            }
        }
        return (b0) obj;
    }

    public static byte[] r(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        int length = upperCase.length() / 2;
        byte[] bArr = new byte[length];
        try {
            byte[] bytes = upperCase.getBytes("UTF-8");
            for (int i10 = 0; i10 < length; i10++) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("0x");
                int i11 = i10 * 2;
                sb2.append(new String(new byte[]{bytes[i11]}, "UTF-8"));
                bArr[i10] = (byte) (((byte) (Byte.decode(sb2.toString()).byteValue() << 4)) ^ Byte.decode("0x" + new String(new byte[]{bytes[i11 + 1]}, "UTF-8")).byteValue());
            }
        } catch (UnsupportedEncodingException | NumberFormatException e10) {
            StringBuilder a10 = android.support.v4.media.d.a("hex string 2 byte array exception : ");
            a10.append(e10.getMessage());
            o8.b.f("HexUtil", a10.toString());
        }
        return bArr;
    }

    public static boolean s() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static boolean t(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static final i2.b0 u(l lVar) {
        i2.c0 c0Var = new i2.c0();
        lVar.k(c0Var);
        b0.a aVar = c0Var.f16253a;
        aVar.f16241a = c0Var.f16254b;
        aVar.f16242b = false;
        aVar.b(c0Var.f16255c, c0Var.f16256d);
        return aVar.a();
    }

    public static String v(int i10) {
        if (i10 != 16) {
            if (i10 != 17) {
                switch (i10) {
                    case 1:
                        return "HEADSET";
                    case 2:
                        return "A2DP";
                    case 3:
                        return "HEALTH";
                    case 4:
                        return "HID_HOST";
                    case 5:
                        return "PAN";
                    case 6:
                        return "PBAP";
                    case 7:
                        return "GATT";
                    case 8:
                        return "GATT_SERVER";
                    case 9:
                        return "MAP";
                    case 10:
                        return "SAP";
                    case 11:
                        return "A2DP_SINK";
                    case 12:
                        return "AVRCP_CONTROLLER";
                    default:
                        return "Unknown";
                }
            }
            return "PBAP_CLIENT";
        }
        return "HEADSET_CLIENT";
    }

    public static final SharedPreferences.Editor w(SharedPreferences.Editor editor, String str, double d10) {
        SharedPreferences.Editor putLong = editor.putLong(str, Double.doubleToRawLongBits(d10));
        gm.l.e(putLong, "putLong(key, value.toRawBits())");
        return putLong;
    }

    public static void x(View view, float f10) {
        Drawable background = view.getBackground();
        if (background instanceof ga.f) {
            ((ga.f) background).j(f10);
        }
    }

    public static void y(View view) {
        Drawable background = view.getBackground();
        if (background instanceof ga.f) {
            z(view, (ga.f) background);
        }
    }

    public static void z(View view, ga.f fVar) {
        boolean z10;
        w9.a aVar = fVar.f15069a.f15094b;
        if (aVar != null && aVar.f29763a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            float f10 = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                f10 += o0.i.i((View) parent);
            }
            f.b bVar = fVar.f15069a;
            if (bVar.f15105m != f10) {
                bVar.f15105m = f10;
                fVar.q();
            }
        }
    }
}
