package zf;

import android.support.v4.media.d;
import com.topstep.fitcloud.pro.model.game.push.GamePacket;
import com.topstep.fitcloud.pro.model.game.push.GameSpaceSkin;
import gm.l;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a */
    public final List<GamePacket> f32346a;

    /* renamed from: b */
    public final List<GamePacket> f32347b;

    /* renamed from: c */
    public final ArrayList<GameSpaceSkin> f32348c;

    public a(List list, ArrayList arrayList, ArrayList arrayList2) {
        l.f(list, "remoteGamePackets");
        this.f32346a = list;
        this.f32347b = arrayList;
        this.f32348c = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return l.a(this.f32346a, aVar.f32346a) && l.a(this.f32347b, aVar.f32347b) && l.a(this.f32348c, aVar.f32348c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f32347b.hashCode();
        return this.f32348c.hashCode() + ((hashCode + (this.f32346a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder a10 = d.a("GamePushParams(remoteGamePackets=");
        a10.append(this.f32346a);
        a10.append(", localGamePackets=");
        a10.append(this.f32347b);
        a10.append(", pushableSpaceSkins=");
        a10.append(this.f32348c);
        a10.append(')');
        return a10.toString();
    }
}
