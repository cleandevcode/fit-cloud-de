package of;

import com.topstep.fitcloud.pro.ui.DeviceFragment;
import com.topstep.fitcloud.pro.ui.HomePageFragment;
import com.topstep.fitcloud.pro.ui.camera.CameraFragment;
import com.topstep.fitcloud.pro.ui.data.BloodPressureFragment;
import com.topstep.fitcloud.pro.ui.data.ExerciseFragment;
import com.topstep.fitcloud.pro.ui.data.HeartRateFragment;
import com.topstep.fitcloud.pro.ui.data.OxygenFragment;
import com.topstep.fitcloud.pro.ui.data.PressureFragment;
import com.topstep.fitcloud.pro.ui.data.SleepFragment;
import com.topstep.fitcloud.pro.ui.data.TemperatureDetailFragment;
import com.topstep.fitcloud.pro.ui.data.TemperatureFragment;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgDetailFragment;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgFragment;
import com.topstep.fitcloud.pro.ui.device.bind.DeviceBindFragment;
import com.topstep.fitcloud.pro.ui.device.bind.DeviceSpecifyFragment;
import com.topstep.fitcloud.pro.ui.device.dial.DialPushViewModel;
import com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomFragment;
import com.topstep.fitcloud.pro.ui.device.settings.BloodPressureAlarmFragment;
import com.topstep.fitcloud.pro.ui.device.settings.DrinkWaterFragment;
import com.topstep.fitcloud.pro.ui.device.settings.HealthMonitorFragment;
import com.topstep.fitcloud.pro.ui.device.settings.HeartRateAlarmFragment;
import com.topstep.fitcloud.pro.ui.device.settings.LongTimeBrightDurationFragment;
import com.topstep.fitcloud.pro.ui.device.settings.NotificationFragment;
import com.topstep.fitcloud.pro.ui.device.settings.NotificationOtherFragment;
import com.topstep.fitcloud.pro.ui.device.settings.ProtectionReminderFragment;
import com.topstep.fitcloud.pro.ui.device.settings.ScreenFragment;
import com.topstep.fitcloud.pro.ui.device.settings.SedentaryFragment;
import com.topstep.fitcloud.pro.ui.device.settings.TurnWristLightingFragment;
import com.topstep.fitcloud.pro.ui.friend.FriendListFragment;
import com.topstep.fitcloud.pro.ui.policy.PrivacyPolicyFragment;
import com.topstep.fitcloud.pro.ui.settings.EditUserFragment;
import com.topstep.fitcloud.pro.ui.settings.ExerciseGoalFragment;
import com.topstep.fitcloud.pro.ui.settings.UnitFragment;
import com.topstep.fitcloud.pro.ui.settings.WechatSportFragment;
import com.topstep.fitcloud.pro.ui.settings.assist.AssistFragment;
import com.topstep.fitcloud.pro.ui.settings.assist.DeviceInfoFragment;
import com.topstep.fitcloud.pro.ui.settings.assist.WeatherFragment;
import com.topstep.fitcloud.pro.ui.settings.wh.WhDetailFragment;
import com.topstep.fitcloud.pro.ui.settings.wh.WhHomePageFragment;
import com.topstep.fitcloud.pro.ui.settings.wh.WhSettingsFragment;
import com.topstep.fitcloud.pro.ui.sport.SportFragment;
import com.topstep.fitcloud.pro.ui.sport.SportHistoryFragment;
import ik.a;
import og.j1;
import og.n1;
import yh.g;
import zh.i;

/* loaded from: classes2.dex */
public final class f extends v {

    /* renamed from: a */
    public final k f23097a;

    /* renamed from: b */
    public final b f23098b;

    /* renamed from: c */
    public sl.a<g.b> f23099c = mk.b.a(new a(0));

    /* renamed from: d */
    public sl.a<i.b> f23100d = mk.b.a(new a(1));

    /* loaded from: classes2.dex */
    public static final class a<T> implements sl.a<T> {

        /* renamed from: a */
        public final int f23101a;

        /* renamed from: of.f$a$a */
        /* loaded from: classes2.dex */
        public class C0412a implements g.b {
            @Override // yh.g.b
            public final yh.g a(DialPushViewModel dialPushViewModel, boolean z10) {
                return new yh.g(dialPushViewModel, z10);
            }
        }

        /* loaded from: classes2.dex */
        public class b implements i.b {
            @Override // zh.i.b
            public final zh.i a(DialPushViewModel dialPushViewModel) {
                return new zh.i(dialPushViewModel);
            }
        }

        public a(int i10) {
            this.f23101a = i10;
        }

        @Override // sl.a, dk.a
        public final T get() {
            int i10 = this.f23101a;
            if (i10 != 0) {
                if (i10 == 1) {
                    return (T) new b();
                }
                throw new AssertionError(this.f23101a);
            }
            return (T) new C0412a();
        }
    }

    public f(k kVar, d dVar, b bVar) {
        this.f23097a = kVar;
        this.f23098b = bVar;
    }

    @Override // ei.d0
    public final void A() {
    }

    @Override // ii.z0
    public final void A0() {
    }

    @Override // vh.d
    public final void B() {
    }

    @Override // bi.s
    public final void B0(HeartRateAlarmFragment heartRateAlarmFragment) {
        heartRateAlarmFragment.f11171t0 = (og.t) this.f23097a.f23167y.get();
    }

    @Override // ph.h0
    public final void C() {
    }

    @Override // rh.f
    public final void C0() {
    }

    @Override // bi.w0
    public final void D() {
    }

    @Override // ii.b1
    public final void D0(WechatSportFragment wechatSportFragment) {
        wechatSportFragment.f11943r0 = (og.t) this.f23097a.f23167y.get();
    }

    @Override // ph.b1
    public final void E(SleepFragment sleepFragment) {
        sleepFragment.f10559w0 = (og.t) this.f23097a.f23167y.get();
        sleepFragment.f10560x0 = (lg.c) this.f23097a.P.get();
        sleepFragment.f10561y0 = this.f23097a.Q.get();
    }

    @Override // ii.a1
    public final void E0(UnitFragment unitFragment) {
        unitFragment.f11924s0 = k.g(this.f23097a);
        unitFragment.f11925t0 = k.l(this.f23097a);
        unitFragment.f11926u0 = (og.t) this.f23097a.f23167y.get();
    }

    @Override // ci.h
    public final void F() {
    }

    @Override // mi.y
    public final void F0(SportHistoryFragment sportHistoryFragment) {
        sportHistoryFragment.f12163w0 = k.l(this.f23097a);
    }

    @Override // ji.a
    public final void G(AssistFragment assistFragment) {
        this.f23097a.f23144b.getClass();
        assistFragment.f11949v0 = new rf.e();
    }

    @Override // di.f
    public final void G0() {
    }

    @Override // ei.x
    public final void H() {
    }

    @Override // ji.j
    public final void H0(DeviceInfoFragment deviceInfoFragment) {
        deviceInfoFragment.f11978u0 = (og.t) this.f23097a.f23167y.get();
    }

    @Override // bi.q
    public final void I(HealthMonitorFragment healthMonitorFragment) {
        healthMonitorFragment.f11156s0 = (og.t) this.f23097a.f23167y.get();
    }

    @Override // bi.n
    public final void I0(DrinkWaterFragment drinkWaterFragment) {
        drinkWaterFragment.f11117s0 = (og.t) this.f23097a.f23167y.get();
    }

    @Override // ai.h
    public final void J() {
    }

    @Override // zh.c
    public final void K() {
    }

    @Override // ni.k
    public final void L() {
    }

    @Override // ei.k
    public final void M() {
    }

    @Override // bi.d1
    public final void N(SedentaryFragment sedentaryFragment) {
        sedentaryFragment.f11297s0 = (og.t) this.f23097a.f23167y.get();
    }

    @Override // bi.s0
    public final void O(ProtectionReminderFragment protectionReminderFragment) {
        protectionReminderFragment.f11242s0 = (og.t) this.f23097a.f23167y.get();
    }

    @Override // ph.x0
    public final void P() {
    }

    @Override // bi.a
    public final void Q(BloodPressureAlarmFragment bloodPressureAlarmFragment) {
        bloodPressureAlarmFragment.f11066w0 = (og.t) this.f23097a.f23167y.get();
    }

    @Override // bi.o
    public final void R() {
    }

    @Override // ei.r0
    public final void S() {
    }

    @Override // ni.h
    public final void T() {
    }

    @Override // ph.c0
    public final void U(ExerciseFragment exerciseFragment) {
        exerciseFragment.f10461x0 = k.l(this.f23097a);
        exerciseFragment.f10462y0 = k.k(this.f23097a);
        exerciseFragment.f10463z0 = (lg.c) this.f23097a.P.get();
        exerciseFragment.A0 = this.f23097a.Q.get();
    }

    @Override // ii.u
    public final void V(EditUserFragment editUserFragment) {
        editUserFragment.I0 = k.g(this.f23097a);
        editUserFragment.J0 = (kg.k) this.f23097a.f23157o.get();
        editUserFragment.K0 = k.l(this.f23097a);
        editUserFragment.L0 = (og.t) this.f23097a.f23167y.get();
    }

    @Override // mi.u
    public final void W(SportFragment sportFragment) {
        sportFragment.f12140w0 = k.l(this.f23097a);
        sportFragment.f12141x0 = k.o(this.f23097a);
    }

    @Override // bi.e1
    public final void X(TurnWristLightingFragment turnWristLightingFragment) {
        turnWristLightingFragment.f11311s0 = (og.t) this.f23097a.f23167y.get();
    }

    @Override // ei.c
    public final void Y() {
    }

    @Override // ph.v
    public final void Z() {
    }

    @Override // ik.a.b
    public final a.c a() {
        return this.f23098b.a();
    }

    @Override // th.m
    public final void a0() {
    }

    @Override // ii.n
    public final void b() {
    }

    @Override // ci.e
    public final void b0() {
    }

    @Override // oh.i
    public final void c(CameraFragment cameraFragment) {
        cameraFragment.E0 = (og.t) this.f23097a.f23167y.get();
    }

    @Override // ei.l0
    public final void c0() {
    }

    @Override // ei.v
    public final void d() {
    }

    @Override // yh.f
    public final void d0(yh.e eVar) {
        eVar.f31717v0 = this.f23099c.get();
    }

    @Override // ci.k
    public final void e() {
    }

    @Override // ph.d1
    public final void e0(TemperatureFragment temperatureFragment) {
        temperatureFragment.f24234p0 = (og.t) this.f23097a.f23167y.get();
        temperatureFragment.f24235q0 = (lg.c) this.f23097a.P.get();
        temperatureFragment.B0 = this.f23097a.Q.get();
        temperatureFragment.C0 = k.l(this.f23097a);
    }

    @Override // di.e
    public final void f() {
    }

    @Override // ih.z
    public final void f0() {
    }

    @Override // th.e
    public final void g() {
    }

    @Override // com.topstep.fitcloud.pro.ui.dialog.f
    public final void g0(com.topstep.fitcloud.pro.ui.dialog.e eVar) {
        eVar.H0 = (yg.m) this.f23097a.f23160r.get();
    }

    @Override // rh.q
    public final void h() {
    }

    @Override // ph.i0
    public final void h0(HeartRateFragment heartRateFragment) {
        heartRateFragment.f24234p0 = (og.t) this.f23097a.f23167y.get();
        heartRateFragment.f24235q0 = (lg.c) this.f23097a.P.get();
        heartRateFragment.B0 = this.f23097a.Q.get();
    }

    @Override // uh.r
    public final void i(DeviceSpecifyFragment deviceSpecifyFragment) {
        deviceSpecifyFragment.f10827y0 = (og.t) this.f23097a.f23167y.get();
    }

    @Override // yh.c
    public final void i0() {
    }

    @Override // ni.i
    public final void j() {
    }

    @Override // ii.x
    public final void j0() {
    }

    @Override // uh.l
    public final void k(uh.i iVar) {
        iVar.I0 = (og.t) this.f23097a.f23167y.get();
    }

    @Override // ei.r
    public final void k0() {
    }

    @Override // ph.w0
    public final void l(OxygenFragment oxygenFragment) {
        oxygenFragment.f24234p0 = (og.t) this.f23097a.f23167y.get();
        oxygenFragment.f24235q0 = (lg.c) this.f23097a.P.get();
        oxygenFragment.B0 = this.f23097a.Q.get();
    }

    @Override // bi.j
    public final void l0() {
    }

    @Override // rh.j
    public final void m(EcgFragment ecgFragment) {
        ecgFragment.f10665x0 = this.f23097a.Q.get();
        ecgFragment.f10666y0 = (lg.c) this.f23097a.P.get();
        ecgFragment.f10667z0 = (og.t) this.f23097a.f23167y.get();
    }

    @Override // yh.k
    public final void m0() {
    }

    @Override // bi.o0
    public final void n(NotificationOtherFragment notificationOtherFragment) {
        notificationOtherFragment.f11222s0 = (j1) this.f23097a.B.get();
    }

    @Override // bi.l0
    public final void n0(NotificationFragment notificationFragment) {
        notificationFragment.f11200s0 = (j1) this.f23097a.B.get();
    }

    @Override // ph.v0
    public final void o() {
    }

    @Override // hi.c
    public final void o0() {
    }

    @Override // ii.s
    public final void p() {
    }

    @Override // ph.w
    public final void p0(BloodPressureFragment bloodPressureFragment) {
        bloodPressureFragment.f24234p0 = (og.t) this.f23097a.f23167y.get();
        bloodPressureFragment.f24235q0 = (lg.c) this.f23097a.P.get();
        bloodPressureFragment.B0 = this.f23097a.Q.get();
    }

    @Override // ph.c1
    public final void q(TemperatureDetailFragment temperatureDetailFragment) {
        temperatureDetailFragment.f10588z0 = k.l(this.f23097a);
    }

    @Override // bi.c1
    public final void q0(ScreenFragment screenFragment) {
        screenFragment.f11283s0 = (og.t) this.f23097a.f23167y.get();
    }

    @Override // ji.o
    public final void r(WeatherFragment weatherFragment) {
        weatherFragment.f11991v0 = k.n(this.f23097a);
        k kVar = this.f23097a;
        com.bumptech.glide.manager.g gVar = kVar.f23143a;
        ch.d dVar = new ch.d(kVar.s(), kVar.f23151i.get());
        gVar.getClass();
        weatherFragment.f11992w0 = dVar;
        weatherFragment.f11993x0 = (og.t) this.f23097a.f23167y.get();
    }

    @Override // ii.o0
    public final void r0() {
    }

    @Override // ei.c0
    public final void s(FriendListFragment friendListFragment) {
        friendListFragment.f11579w0 = k.j(this.f23097a);
    }

    @Override // ih.c
    public final void s0(DeviceFragment deviceFragment) {
        deviceFragment.f10133v0 = (og.t) this.f23097a.f23167y.get();
        deviceFragment.f10134w0 = k.i(this.f23097a);
        deviceFragment.f10135x0 = (n1) this.f23097a.f23162t.get();
        deviceFragment.f10136y0 = k.j(this.f23097a);
    }

    @Override // li.h
    public final void t(WhHomePageFragment whHomePageFragment) {
        whHomePageFragment.f12087u0 = k.m(this.f23097a);
    }

    @Override // rh.d
    public final void t0(EcgDetailFragment ecgDetailFragment) {
        ecgDetailFragment.f10620x0 = mk.a.a(this.f23097a.f23157o);
    }

    @Override // ih.s
    public final void u(HomePageFragment homePageFragment) {
        homePageFragment.f24234p0 = (og.t) this.f23097a.f23167y.get();
        homePageFragment.f24235q0 = (lg.c) this.f23097a.P.get();
        homePageFragment.f10185z0 = k.k(this.f23097a);
        homePageFragment.A0 = k.l(this.f23097a);
        homePageFragment.B0 = k.m(this.f23097a);
        homePageFragment.C0 = this.f23097a.Q.get();
    }

    @Override // li.k
    public final void u0(WhSettingsFragment whSettingsFragment) {
        whSettingsFragment.f12104w0 = k.m(this.f23097a);
        whSettingsFragment.f12105x0 = (og.t) this.f23097a.f23167y.get();
    }

    @Override // ci.i0
    public final void v() {
    }

    @Override // li.e
    public final void v0(WhDetailFragment whDetailFragment) {
        whDetailFragment.f12060x0 = k.m(this.f23097a);
    }

    @Override // bi.j0
    public final void w(LongTimeBrightDurationFragment longTimeBrightDurationFragment) {
        longTimeBrightDurationFragment.f11186s0 = (og.t) this.f23097a.f23167y.get();
    }

    @Override // hi.j
    public final void w0(PrivacyPolicyFragment privacyPolicyFragment) {
        privacyPolicyFragment.f11730v0 = (yg.m) this.f23097a.f23160r.get();
    }

    @Override // ph.y0
    public final void x(PressureFragment pressureFragment) {
        pressureFragment.f24234p0 = (og.t) this.f23097a.f23167y.get();
        pressureFragment.f24235q0 = (lg.c) this.f23097a.P.get();
        pressureFragment.B0 = this.f23097a.Q.get();
    }

    @Override // com.topstep.fitcloud.pro.ui.dialog.b
    public final void x0(com.topstep.fitcloud.pro.ui.dialog.a aVar) {
        aVar.H0 = (yg.m) this.f23097a.f23160r.get();
    }

    @Override // bi.d
    public final void y() {
    }

    @Override // uh.g
    public final void y0(DeviceBindFragment deviceBindFragment) {
        deviceBindFragment.f10802y0 = (og.t) this.f23097a.f23167y.get();
    }

    @Override // zh.e
    public final void z(DialCustomFragment dialCustomFragment) {
        dialCustomFragment.C0 = this.f23100d.get();
    }

    @Override // ii.w
    public final void z0(ExerciseGoalFragment exerciseGoalFragment) {
        exerciseGoalFragment.f11837t0 = k.g(this.f23097a);
        exerciseGoalFragment.f11838u0 = k.l(this.f23097a);
        exerciseGoalFragment.f11839v0 = k.k(this.f23097a);
    }
}
