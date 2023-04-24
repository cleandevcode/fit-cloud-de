package si;

import android.content.Context;
import android.os.Build;
import androidx.fragment.app.r;
import androidx.fragment.app.x;
import com.topstep.fitcloudpro.R;
import gm.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import jc.a0;
import jc.b0;
import jc.c0;
import jc.d0;
import jc.e0;
import jc.f0;
import jc.g0;
import jc.y;
import jc.z;
import lh.i;
import mi.n;
import y.i0;
import y.j1;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a */
    public static final f f27071a = new f();

    /* loaded from: classes2.dex */
    public interface a {
        void b(boolean z10);
    }

    public static ArrayList a() {
        ArrayList arrayList = new ArrayList(6);
        arrayList.add("android.permission.READ_CALL_LOG");
        arrayList.add("android.permission.READ_PHONE_STATE");
        arrayList.add("android.permission.READ_CONTACTS");
        arrayList.add("android.permission.CALL_PHONE");
        if (Build.VERSION.SDK_INT >= 26) {
            arrayList.add("android.permission.ANSWER_PHONE_CALLS");
        }
        arrayList.add("android.permission.SEND_SMS");
        return arrayList;
    }

    public static boolean c(f fVar, Context context, List list) {
        fVar.getClass();
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (y0.a.a(context, (String) it.next()) != 0) {
                return false;
            }
        }
        return true;
    }

    public static void h(f fVar, r rVar, ArrayList arrayList, ArrayList arrayList2, a aVar) {
        x a10;
        int i10;
        fVar.getClass();
        l.f(rVar, "fragment");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        int i11 = Build.VERSION.SDK_INT;
        int i12 = rVar.V0().getApplicationInfo().targetSdkVersion;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (ic.a.f16762a.contains(str)) {
                linkedHashSet2.add(str);
            } else {
                linkedHashSet.add(str);
            }
        }
        if (linkedHashSet2.contains("android.permission.ACCESS_BACKGROUND_LOCATION") && (i11 == 29 || (i11 == 30 && i12 < 30))) {
            linkedHashSet2.remove("android.permission.ACCESS_BACKGROUND_LOCATION");
            linkedHashSet.add("android.permission.ACCESS_BACKGROUND_LOCATION");
        }
        if (linkedHashSet2.contains("android.permission.POST_NOTIFICATIONS") && i11 >= 33 && i12 >= 33) {
            linkedHashSet2.remove("android.permission.POST_NOTIFICATIONS");
            linkedHashSet.add("android.permission.POST_NOTIFICATIONS");
        }
        jc.x xVar = new jc.x(null, rVar, linkedHashSet, linkedHashSet2);
        int i13 = si.a.D0;
        xVar.f17636o = new s5.b(arrayList2, null, 5);
        xVar.f17637p = new i0(arrayList2, null, 5);
        xVar.f17627f = true;
        xVar.f17635n = new e(rVar, aVar);
        if (Build.VERSION.SDK_INT != 26) {
            xVar.f17624c = xVar.a().getRequestedOrientation();
            int i14 = xVar.a().getResources().getConfiguration().orientation;
            if (i14 != 1) {
                if (i14 == 2) {
                    a10 = xVar.a();
                    i10 = 6;
                }
            } else {
                a10 = xVar.a();
                i10 = 7;
            }
            a10.setRequestedOrientation(i10);
        }
        a0 a0Var = new a0();
        a0Var.a(new d0(xVar));
        a0Var.a(new y(xVar));
        a0Var.a(new f0(xVar));
        a0Var.a(new g0(xVar));
        a0Var.a(new c0(xVar));
        a0Var.a(new b0(xVar));
        a0Var.a(new e0(xVar));
        a0Var.a(new z(xVar));
        jc.b bVar = (jc.b) a0Var.f17570a;
        if (bVar != null) {
            bVar.j();
        }
    }

    public static void i(r rVar, a aVar, int i10) {
        f fVar = f27071a;
        if ((i10 & 4) != 0) {
            aVar = null;
        }
        l.f(rVar, "fragment");
        if (Build.VERSION.SDK_INT < 23) {
            if (aVar != null) {
                aVar.b(true);
                return;
            }
            return;
        }
        Context V0 = rVar.V0();
        String string = V0.getString(R.string.permission_sms_for_notification);
        l.e(string, "context.getString(R.stri…ion_sms_for_notification)");
        String string2 = V0.getString(R.string.permission_contacts_for_notification);
        l.e(string2, "context.getString(R.stri…ontacts_for_notification)");
        h(fVar, rVar, h7.a.f("android.permission.RECEIVE_SMS", "android.permission.READ_SMS", "android.permission.READ_CONTACTS"), h7.a.f(new c("android.permission-group.SMS", string, null), new c("android.permission-group.CONTACTS", string2, null)), new n(V0, aVar));
    }

    public static void j(r rVar, a aVar, int i10) {
        f fVar = f27071a;
        if ((i10 & 4) != 0) {
            aVar = null;
        }
        l.f(rVar, "fragment");
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 23) {
            if (aVar != null) {
                aVar.b(true);
                return;
            }
            return;
        }
        Context V0 = rVar.V0();
        ArrayList arrayList = new ArrayList(4);
        String string = V0.getString(R.string.permission_phone_for_notification);
        l.e(string, "context.getString(R.stri…n_phone_for_notification)");
        arrayList.add(new c("android.permission-group.PHONE", string, null));
        String string2 = V0.getString(R.string.permission_contacts_for_notification);
        l.e(string2, "context.getString(R.stri…ontacts_for_notification)");
        arrayList.add(new c("android.permission-group.CONTACTS", string2, null));
        if (i11 >= 28) {
            String string3 = V0.getString(R.string.permission_call_log_for_notification);
            l.e(string3, "context.getString(R.stri…all_log_for_notification)");
            arrayList.add(new c("android.permission-group.CALL_LOG", string3, null));
        }
        String string4 = V0.getString(R.string.permission_sms_for_telephony_reject);
        l.e(string4, "context.getString(R.stri…sms_for_telephony_reject)");
        arrayList.add(new c("android.permission-group.SMS", string4, null));
        h(fVar, rVar, a(), arrayList, new j1(V0, aVar, 3));
    }

    public final boolean b(Context context) {
        l.f(context, "context");
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = true;
        if (i10 < 23) {
            return true;
        }
        return c(this, context, (23 > i10 || i10 >= 31) ? false : false ? h7.a.f("android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION") : h7.a.f("android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT"));
    }

    public final boolean d(Context context) {
        return c(this, context, h7.a.p("android.permission.RECEIVE_SMS"));
    }

    public final boolean e(Context context) {
        return c(this, context, Build.VERSION.SDK_INT >= 31 ? h7.a.q("android.permission.READ_CALL_LOG", "android.permission.READ_PHONE_STATE") : h7.a.p("android.permission.READ_CALL_LOG"));
    }

    public final void f(r rVar, a aVar) {
        boolean z10;
        ArrayList f10;
        ArrayList f11;
        String str;
        l.f(rVar, "fragment");
        Context V0 = rVar.V0();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 23) {
            aVar.b(true);
            return;
        }
        if (23 <= i10 && i10 < 31) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f10 = h7.a.f("android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION");
            c[] cVarArr = new c[1];
            String string = V0.getString(R.string.permission_location_for_ble_scan);
            l.e(string, "context.getString(R.stri…on_location_for_ble_scan)");
            String string2 = V0.getString(R.string.permission_explain);
            l.e(string2, "context.getString(R.string.permission_explain)");
            String string3 = V0.getString(R.string.permission_explain_clicker);
            l.e(string3, "context.getString(R.stri…rmission_explain_clicker)");
            if (h7.a.n(V0)) {
                str = "https://developer.android.google.cn/guide/topics/connectivity/bluetooth-le#permissions";
            } else {
                str = "https://developer.android.com/guide/topics/connectivity/bluetooth/permissions#declare-android11-or-lower";
            }
            cVarArr[0] = new c("android.permission-group.LOCATION", string, new d(string2, string3, str));
            f11 = h7.a.f(cVarArr);
        } else {
            f10 = h7.a.f("android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT");
            String string4 = V0.getString(R.string.permission_nearby_devices_for_ble);
            l.e(string4, "context.getString(R.stri…n_nearby_devices_for_ble)");
            f11 = h7.a.f(new c("android.permission-group.NEARBY_DEVICES", string4, null));
        }
        h(this, rVar, f10, f11, aVar);
    }

    public final void g(i iVar, a aVar) {
        l.f(iVar, "fragment");
        if (Build.VERSION.SDK_INT < 23) {
            aVar.b(true);
            return;
        }
        Context V0 = iVar.V0();
        ArrayList f10 = h7.a.f("android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR");
        String string = V0.getString(R.string.permission_calendar_for_women_health);
        l.e(string, "context.getString(R.stri…alendar_for_women_health)");
        h(this, iVar, f10, h7.a.f(new c("android.permission-group.CALENDAR", string, null)), aVar);
    }

    public final void k(r rVar, a aVar) {
        l.f(rVar, "fragment");
        if (Build.VERSION.SDK_INT < 23) {
            aVar.b(true);
            return;
        }
        Context V0 = rVar.V0();
        ArrayList f10 = h7.a.f("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
        String string = V0.getString(R.string.permission_location_for_weather);
        l.e(string, "context.getString(R.stri…ion_location_for_weather)");
        h(this, rVar, f10, h7.a.f(new c("android.permission-group.LOCATION", string, null)), aVar);
    }
}
