package tc;

import android.util.Pair;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: classes.dex */
public final class i extends j {

    /* renamed from: a */
    public final byte[] f27981a;

    public i(UUID uuid, Integer num, byte[] bArr) {
        super(uuid, num);
        this.f27981a = bArr;
    }

    @Override // android.util.Pair
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return (obj instanceof j) && super.equals(obj);
        } else if (super.equals(obj)) {
            return Arrays.equals(this.f27981a, ((i) obj).f27981a);
        } else {
            return false;
        }
    }

    @Override // android.util.Pair
    public final int hashCode() {
        return Arrays.hashCode(this.f27981a) + (super.hashCode() * 31);
    }

    @Override // tc.j, android.util.Pair
    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("CharacteristicChangedEvent{UUID=");
        a10.append(((UUID) ((Pair) this).first).toString());
        a10.append(", instanceId=");
        a10.append(((Integer) ((Pair) this).second).toString());
        a10.append(", data=");
        a10.append(Arrays.toString(this.f27981a));
        a10.append('}');
        return a10.toString();
    }
}
