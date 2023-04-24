package i8;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class n {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final ArrayList f16695a;

        /* renamed from: b */
        public final Object f16696b;

        public /* synthetic */ a(Object obj) {
            p.f(obj);
            this.f16696b = obj;
            this.f16695a = new ArrayList();
        }

        @CanIgnoreReturnValue
        public final void a(Object obj, String str) {
            ArrayList arrayList = this.f16695a;
            String valueOf = String.valueOf(obj);
            arrayList.add(str + ContainerUtils.KEY_VALUE_DELIMITER + valueOf);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.f16696b.getClass().getSimpleName());
            sb2.append('{');
            int size = this.f16695a.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append((String) this.f16695a.get(i10));
                if (i10 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
