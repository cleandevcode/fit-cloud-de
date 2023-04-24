package ke;

import java.util.ArrayList;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    public static final ArrayList<re.a> f18458a;

    static {
        ArrayList<re.a> arrayList = new ArrayList<>();
        f18458a = arrayList;
        arrayList.add(new re.a(0, "SOCV Config", 257));
        arrayList.add(new re.a(1, "System Config", DfuBaseService.ERROR_REMOTE_TYPE_LEGACY));
        arrayList.add(new re.a(2, "OTA Header", 10128, 2048, true, 1, false));
        arrayList.add(new re.a(3, "Secure Boot Loader", 10129, 1792, true, 3, false));
        arrayList.add(new re.a(4, "ROM Patch", 10130, DfuBaseService.ERROR_REMOTE_TYPE_SECURE, true, 3, false));
        arrayList.add(new re.a(5, "App", 10131, 768, true, 3, false));
        arrayList.add(new re.a(6, "App Data 1", 10132, 2305, true, 3, false));
        arrayList.add(new re.a(7, "App Data 2", 10133, 2306, true, 3, false));
        arrayList.add(new re.a(8, "App Data 3", 10134, 2307, true, 3, false));
        arrayList.add(new re.a(9, "App Data 4", 10135, 2308, true, 3, false));
        arrayList.add(new re.a(10, "App Data 5", 10136, 2309, true, 3, false));
        arrayList.add(new re.a(11, "App Data 6", 10137, 2310, true, 3, false));
        arrayList.add(new re.a(12, "Upper Stack", 10138, 2560, true, 3, false));
        arrayList.add(new re.a(13, "Stack Patch", 10138, 515, true, 3, false));
        arrayList.add(new re.a(16, "MP RF Test", 513));
        arrayList.add(new re.a(17, "Factory Code", -1, 2816, true, 3, false));
    }
}
