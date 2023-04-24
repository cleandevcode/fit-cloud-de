package ke;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public static final ArrayList<re.a> f18456a;

    static {
        ArrayList<re.a> arrayList = new ArrayList<>();
        f18456a = arrayList;
        arrayList.add(new re.a(0, "Patch (Both MP and OTA)", -1, true, 7));
        arrayList.add(new re.a(1, "App bank 0 image (Both MP and OTA)", -1, true, 7));
        arrayList.add(new re.a(2, "APP bank 1 image (OTA)", -1, true, 7));
        arrayList.add(new re.a(3, "User data (MP)", -1, true, 7));
        arrayList.add(new re.a(4, "Patch extension image (Both MP and OTA)", -1, true, 7));
        arrayList.add(new re.a(5, "Config file (MP)", -1, true, 7));
        arrayList.add(new re.a(6, "External Flash (MP)", -1, true, 7));
    }

    public static re.a a(int i10) {
        Iterator<re.a> it = f18456a.iterator();
        while (it.hasNext()) {
            re.a next = it.next();
            if (next.f25543a == i10) {
                return next;
            }
        }
        return null;
    }
}
