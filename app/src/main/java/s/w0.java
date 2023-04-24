package s;

import android.content.Context;
import android.media.CamcorderProfile;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class w0 implements a0.y {

    /* renamed from: a */
    public final HashMap f26228a;

    /* renamed from: b */
    public final c f26229b;

    /* loaded from: classes.dex */
    public class a implements c {
        @Override // s.c
        public final CamcorderProfile a(int i10, int i11) {
            return CamcorderProfile.get(i10, i11);
        }

        @Override // s.c
        public final boolean b(int i10, int i11) {
            return CamcorderProfile.hasProfile(i10, i11);
        }
    }

    public w0(Context context, Object obj, Set<String> set) {
        t.d0 a10;
        a aVar = new a();
        this.f26228a = new HashMap();
        this.f26229b = aVar;
        if (obj instanceof t.d0) {
            a10 = (t.d0) obj;
        } else {
            a10 = t.d0.a(context, b0.o.a());
        }
        context.getClass();
        for (String str : set) {
            this.f26228a.put(str, new h2(context, str, a10, this.f26229b));
        }
    }
}
