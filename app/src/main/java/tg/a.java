package tg;

import com.topstep.fitcloud.pro.model.data.EcgRecord;
import com.topstep.fitcloud.pro.model.data.SimpleEcgRecord;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import vf.m;
import vf.r;

/* loaded from: classes2.dex */
public interface a {
    Object a(long j10, xl.d<? super List<r>> dVar);

    Object b(long j10, xl.d<? super yf.a> dVar);

    Object c(long j10, xl.d<? super List<vf.c>> dVar);

    Object d(long j10, Date date, xl.d<? super r> dVar);

    Object e(long j10, UUID uuid, xl.d<? super String> dVar);

    Object f(long j10, xl.d<? super List<SimpleEcgRecord>> dVar);

    Object g(long j10, Date date, xl.d<? super vf.k> dVar);

    Object h(long j10, xl.d<? super List<vf.f>> dVar);

    Object i(long j10, Date date, xl.d<? super vf.f> dVar);

    Object j(long j10, xl.d<? super List<vf.k>> dVar);

    Object k(long j10, Date date, xl.d<? super vf.c> dVar);

    Object l(long j10, Date date, xl.d<? super m> dVar);

    Object m(long j10, UUID uuid, xl.d<? super EcgRecord> dVar);

    Object n(long j10, xl.d<? super List<m>> dVar);
}
