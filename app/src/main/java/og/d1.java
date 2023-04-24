package og;

import com.topstep.fitcloud.pro.model.dial.DialPacket;
import com.topstep.fitcloud.pro.model.dial.DialPushParams;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public interface d1 {
    Object a(int i10, String str, xl.d dVar);

    Serializable b(DialPushParams dialPushParams, xl.d dVar);

    Object c(xl.d<? super DialPushParams> dVar);

    Object d(DialPushParams dialPushParams, xl.d<? super xf.a> dVar);

    Object e(DialPushParams dialPushParams, xl.d<? super List<DialPacket>> dVar);

    Object f(String str, DialPacket dialPacket, xl.d<? super tl.l> dVar);
}
