package ke;

import java.util.ArrayList;
import java.util.Iterator;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static final ArrayList<re.a> f18454a;

    static {
        ArrayList<re.a> arrayList = new ArrayList<>();
        f18454a = arrayList;
        arrayList.add(new re.a(0, "SOCV Config File", 257, false, 1));
        arrayList.add(new re.a(1, "System Config", DfuBaseService.ERROR_REMOTE_TYPE_LEGACY, true, 1));
        arrayList.add(new re.a(2, "OTA Header", 10128, 2048, true, 1, false));
        arrayList.add(new re.a(3, "Secure Boot Loader", 10129, 1792, true, 3, false));
        arrayList.add(new re.a(4, "ROM Patch", 10130, DfuBaseService.ERROR_REMOTE_TYPE_SECURE, true, 3, false));
        arrayList.add(new re.a(5, "App", 10131, 768, true, 5, false));
        arrayList.add(new re.a(6, "DSP System", 10132, 1280, true, 515, false));
        arrayList.add(new re.a(7, "DSP App", 10133, 1538, true, 515, false));
        arrayList.add(new re.a(8, "DSP Config", 10135, 1040, true, 514, true));
        arrayList.add(new re.a(9, "App Config", 10134, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED, true, 2, true));
        arrayList.add(new re.a(10, "Ext Image 0", 10136, 2304, false, 1, true));
        arrayList.add(new re.a(11, "Ext Image 1", 10137, 2305, false, 1, false));
        arrayList.add(new re.a(12, "Ext Image 2", 10138, 2306, false, 1, false));
        arrayList.add(new re.a(13, "Ext Image 3", 10139, 2307, false, 1, false));
        arrayList.add(new re.a(17, "Sys Patch", 10140, 513, false, 3, false));
        arrayList.add(new re.a(18, "Stack Patch", 10141, 514, false, 3, false));
        arrayList.add(new re.a(19, "Upper Stack", 10142, 515, false, 1, false));
        arrayList.add(new re.a(20, "Framework", 10143, 516, false, 1, false));
        arrayList.add(new re.a(14, "Factory Image", 2560, false, 1));
        arrayList.add(new re.a(15, "Backup Data 1", 2816, false, 1));
        arrayList.add(new re.a(16, "Backup Data 2", 2817, false, 1));
        arrayList.add(new re.a(17, "Platform Ext", 10145, 517, false, 3, false));
        arrayList.add(new re.a(18, "Stack Patch", 10141, 518, false, 1, false));
        arrayList.add(new re.a(19, "Upper stack", 10142, 519, false, 3, false));
        arrayList.add(new re.a(24, "Voice Prompt Data", 10148, 520, false, 2, false));
        arrayList.add(new re.a(24, "User Data 1", 65534, 61441, false, 1, false));
        arrayList.add(new re.a(24, "User Data 2", 65533, 61442, false, 1, false));
        arrayList.add(new re.a(24, "User Data 3", 65532, 61443, false, 1, false));
        arrayList.add(new re.a(24, "User Data 4", 65531, 61444, false, 1, false));
        arrayList.add(new re.a(24, "User Data 5", 65530, 61445, false, 1, false));
        arrayList.add(new re.a(24, "User Data 6", 65529, 61446, false, 1, false));
        arrayList.add(new re.a(24, "User Data 7", 65528, 61447, false, 1, false));
        arrayList.add(new re.a(24, "User Data 8", 65527, 61448, false, 1, false));
    }

    public static re.a a(int i10) {
        Iterator<re.a> it = f18454a.iterator();
        while (it.hasNext()) {
            re.a next = it.next();
            if (next.f25546d == i10) {
                return next;
            }
        }
        return null;
    }
}
