package ke;

import java.util.ArrayList;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public static final ArrayList<re.a> f18457a;

    static {
        ArrayList<re.a> arrayList = new ArrayList<>();
        f18457a = arrayList;
        arrayList.add(new re.a(0, "SOCV Config File", 257, true, 3));
        arrayList.add(new re.a(1, "System Config", DfuBaseService.ERROR_REMOTE_TYPE_LEGACY, true, 3));
        arrayList.add(new re.a(2, "OTA Header", 2048, true, 2));
        arrayList.add(new re.a(3, "Secure Boot Loader", 1792, true, 3));
        arrayList.add(new re.a(4, "ROM Patch", DfuBaseService.ERROR_REMOTE_TYPE_SECURE, true, 3));
        arrayList.add(new re.a(5, "App", 768, true, 3));
        arrayList.add(new re.a(6, "APP Data1 File", 2305, false, 3));
        arrayList.add(new re.a(7, "APP Data2 File", 2306, false, 3));
        arrayList.add(new re.a(8, "APP Data3 File", 2307, false, 3));
        arrayList.add(new re.a(9, "APP Data4 File", 2308, false, 3));
        arrayList.add(new re.a(10, "APP Data5 File", 2309, false, 3));
        arrayList.add(new re.a(11, "APP Data6 File", 2310, false, 3));
        arrayList.add(new re.a(12, "Upper Stack", 2560, true, 3));
    }
}
