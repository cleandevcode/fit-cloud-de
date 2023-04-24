package lg;

import com.topstep.fitcloud.pro.model.data.BloodPressureRealtime;
import com.topstep.fitcloud.pro.model.data.EcgRecord;
import com.topstep.fitcloud.pro.model.data.HeartRateRealtime;
import com.topstep.fitcloud.pro.model.data.OxygenRealtime;
import com.topstep.fitcloud.pro.model.data.PressureRealtime;
import com.topstep.fitcloud.pro.model.data.TemperatureRealtime;
import java.util.Date;
import java.util.UUID;
import ph.b0;

/* loaded from: classes2.dex */
public interface c {
    void A(HeartRateRealtime heartRateRealtime);

    void B(Date date, Date date2);

    tm.j C(Date date, Date date2);

    tm.j D();

    Object E(Date date, xl.d<? super vf.c> dVar);

    void F(Date date, Date date2);

    tm.j G(Date date, Date date2);

    tm.j H();

    Object I(Date date, xl.d<? super vf.r> dVar);

    y J(Date date);

    tm.j K(Date date, Date date2);

    Object L(UUID uuid, xl.d<? super EcgRecord> dVar);

    void M(Date date, Date date2);

    Object N(Date date, xl.d<? super vf.n> dVar);

    void a(PressureRealtime pressureRealtime);

    tm.j b(Date date);

    tm.j c();

    Object d(Date date, xl.d<? super vf.m> dVar);

    Object e(Date date, b0.a aVar);

    u f(Date date);

    void g(BloodPressureRealtime bloodPressureRealtime);

    Object h(UUID uuid, xl.d<? super String> dVar);

    tm.j i();

    tm.j j(Date date, Date date2);

    tm.j k();

    void l(Date date, Date date2);

    tm.j m();

    void n(Date date);

    void o(Date date, Date date2);

    void p(vf.a aVar);

    Object q(Date date, xl.d<? super vf.k> dVar);

    void r(EcgRecord ecgRecord);

    Object s(Date date, xl.d<? super vf.f> dVar);

    tm.j t(Date date, Date date2);

    void u(TemperatureRealtime temperatureRealtime);

    void v(OxygenRealtime oxygenRealtime);

    tm.j w(Date date, Date date2);

    void x(Date date, Date date2);

    void y(Date date, Date date2);

    tm.j z(Date date, Date date2);
}
