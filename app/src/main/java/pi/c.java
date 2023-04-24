package pi;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class c extends u7.c {

    /* renamed from: a */
    public final /* synthetic */ List f24259a;

    public c(ArrayList arrayList) {
        this.f24259a = arrayList;
    }

    @Override // u7.c
    public final String a(float f10) {
        int i10 = (int) f10;
        return (i10 < 0 || i10 >= this.f24259a.size()) ? "" : (String) this.f24259a.get(i10);
    }
}
