package y;

import a0.j0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class w {

    /* loaded from: classes.dex */
    public static final class a implements a0.g0 {

        /* renamed from: a */
        public final List<a0.j0> f30787a;

        public a(List<a0.j0> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
            }
            this.f30787a = Collections.unmodifiableList(new ArrayList(list));
        }

        @Override // a0.g0
        public final List<a0.j0> a() {
            return this.f30787a;
        }
    }

    public static a a() {
        return new a(Arrays.asList(new j0.a()));
    }
}
