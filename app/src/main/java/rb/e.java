package rb;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    public static final Set<String> f25461a = Collections.unmodifiableSet(new a());

    /* loaded from: classes.dex */
    public static class a extends HashSet<String> {
        public a() {
            super(16);
            add("ser_country");
            add("reg_country");
            add("issue_country");
            add("geo_ip");
        }
    }
}
