package tc;

import android.util.Pair;
import java.util.UUID;

/* loaded from: classes.dex */
public class j extends Pair<UUID, Integer> {
    public j(UUID uuid, Integer num) {
        super(uuid, num);
    }

    @Override // android.util.Pair
    public String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("CharacteristicNotificationId{UUID=");
        a10.append(((UUID) ((Pair) this).first).toString());
        a10.append(", instanceId=");
        a10.append(((Integer) ((Pair) this).second).toString());
        a10.append('}');
        return a10.toString();
    }
}
