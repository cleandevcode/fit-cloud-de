package ae;

import android.bluetooth.BluetoothGatt;
import android.support.v4.media.d;
import android.text.TextUtils;
import androidx.activity.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public static final HashMap<Integer, String> f456a;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f456a = hashMap;
        hashMap.put(0, "UNKNOW");
        hashMap.put(1, "READ");
        hashMap.put(2, "READ_ENCRYPTED");
        hashMap.put(4, "READ_ENCRYPTED_MITM");
        hashMap.put(16, "WRITE");
        hashMap.put(32, "WRITE_ENCRYPTED");
        hashMap.put(64, "WRITE_ENCRYPTED_MITM");
        hashMap.put(128, "WRITE_SIGNED");
        Integer valueOf = Integer.valueOf((int) DfuBaseService.ERROR_REMOTE_TYPE_LEGACY);
        hashMap.put(valueOf, "WRITE_SIGNED_MITM");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1, "BROADCAST");
        hashMap2.put(128, "EXTENDED_PROPS");
        hashMap2.put(32, "INDICATE");
        hashMap2.put(16, "NOTIFY");
        hashMap2.put(2, "READ");
        hashMap2.put(64, "SIGNED_WRITE");
        hashMap2.put(8, "WRITE");
        hashMap2.put(4, "WRITE_NO_RESPONSE");
        HashMap hashMap3 = new HashMap();
        hashMap3.put(0, "UNKNOW");
        hashMap3.put(1, "READ");
        hashMap3.put(2, "READ_ENCRYPTED");
        hashMap3.put(4, "READ_ENCRYPTED_MITM");
        hashMap3.put(16, "WRITE");
        hashMap3.put(32, "WRITE_ENCRYPTED");
        hashMap3.put(64, "WRITE_ENCRYPTED_MITM");
        hashMap3.put(128, "WRITE_SIGNED");
        hashMap3.put(valueOf, "WRITE_SIGNED_MITM");
    }

    public static String a(int i10) {
        HashMap<Integer, String> hashMap = f456a;
        String str = hashMap.get(Integer.valueOf(i10));
        if (TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < 32; i11++) {
                int i12 = 1 << i11;
                if ((i10 & i12) > 0) {
                    arrayList.add(Integer.valueOf(i12));
                }
            }
            String str2 = "";
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                str2 = e.b(d.a(str2), hashMap.get(arrayList.get(i13)), "|");
            }
            return str2;
        }
        return str;
    }

    public static String b(int i10) {
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        if ((i10 & 1) == 1) {
            arrayList.add("BROADCAST");
        }
        if ((i10 & 2) == 2) {
            arrayList.add("READ");
        }
        if ((i10 & 4) == 4) {
            arrayList.add("WRITE_NO_RESPONSE");
        }
        if ((i10 & 8) == 8) {
            arrayList.add("WRITE");
        }
        if ((i10 & 16) == 16) {
            arrayList.add("NOTIFY");
        }
        if ((i10 & 32) == 32) {
            arrayList.add("INDICATE");
        }
        if (arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (sb2.length() > 0) {
                    sb2.append("|");
                }
                sb2.append(str);
            }
        }
        return sb2.toString();
    }

    public static void c(BluetoothGatt bluetoothGatt) {
        try {
            ((Boolean) bluetoothGatt.getClass().getMethod("refresh", new Class[0]).invoke(bluetoothGatt, new Object[0])).booleanValue();
        } catch (Exception e10) {
            ge.b.p("refreshing device failed: " + e10.toString());
        }
    }
}
