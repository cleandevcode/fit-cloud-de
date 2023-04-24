package mi;

import a0.a2;
import com.topstep.fitcloud.pro.model.data.SportRecord;

/* loaded from: classes2.dex */
public abstract class z {

    /* loaded from: classes2.dex */
    public static final class a extends z {

        /* renamed from: a */
        public final SportRecord f21875a;

        public a(SportRecord sportRecord) {
            gm.l.f(sportRecord, "record");
            this.f21875a = sportRecord;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && gm.l.a(this.f21875a, ((a) obj).f21875a);
        }

        public final int hashCode() {
            return this.f21875a.hashCode();
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("RecordModel(record=");
            a10.append(this.f21875a);
            a10.append(')');
            return a10.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends z {

        /* renamed from: a */
        public final String f21876a;

        public b(String str) {
            this.f21876a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && gm.l.a(this.f21876a, ((b) obj).f21876a);
        }

        public final int hashCode() {
            return this.f21876a.hashCode();
        }

        public final String toString() {
            return a2.a(android.support.v4.media.d.a("SeparatorModel(key="), this.f21876a, ')');
        }
    }
}
