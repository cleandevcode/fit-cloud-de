package tg;

import com.topstep.fitcloud.pro.model.friend.Friend;
import com.topstep.fitcloud.pro.model.friend.FriendMsg;
import java.io.Serializable;
import java.util.List;
import tl.l;

/* loaded from: classes2.dex */
public interface c {
    Object a(long j10, xl.d<? super Friend> dVar);

    Object b(long j10, xl.d<? super l> dVar);

    Object c(xl.d<? super List<Friend>> dVar);

    Object d(long j10, xl.d<? super l> dVar);

    Object e(xl.d<? super List<FriendMsg>> dVar);

    Object f(long j10, String str, xl.d<? super l> dVar);

    Serializable g(String str, xl.d dVar);

    boolean h();

    Object i(long j10, String str, String str2, xl.d<? super l> dVar);

    Object j(long j10, xl.d<? super l> dVar);
}
