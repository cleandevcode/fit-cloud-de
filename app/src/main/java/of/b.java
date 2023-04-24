package of;

import a0.r1;
import com.topstep.fitcloud.pro.ui.MainActivity;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportActivity;
import com.topstep.fitcloud.pro.ui.sport.SportGoalActivity;
import com.topstep.fitcloud.pro.ui.sport.SportingActivity;
import ik.a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class b extends t {

    /* renamed from: a */
    public final k f23086a;

    /* renamed from: b */
    public final d f23087b;

    /* renamed from: c */
    public final b f23088c = this;

    public b(k kVar, d dVar) {
        this.f23086a = kVar;
        this.f23087b = dVar;
    }

    @Override // ik.a.InterfaceC0299a
    public final a.c a() {
        return new a.c(d(), new l(this.f23086a, this.f23087b));
    }

    @Override // uh.p
    public final void b() {
    }

    @Override // jh.a
    public final void c() {
    }

    @Override // ik.d.a
    public final Set<String> d() {
        r1 r1Var = new r1(0);
        r1Var.a("com.topstep.fitcloud.pro.ui.settings.AccountManageViewMode");
        r1Var.a("com.topstep.fitcloud.pro.ui.device.alarm.AlarmViewModel");
        r1Var.a("com.topstep.fitcloud.pro.ui.policy.AskPolicyViewMode");
        r1Var.a("com.topstep.fitcloud.pro.ui.settings.assist.AssistViewModel");
        r1Var.a("com.topstep.fitcloud.pro.ui.data.BloodPressureDetailViewModel");
        r1Var.a("com.topstep.fitcloud.pro.ui.device.settings.BusinessCardViewModel");
        r1Var.a("com.topstep.fitcloud.pro.ui.device.settings.CollectionCodeViewModel");
        r1Var.a("com.topstep.fitcloud.pro.ui.device.contacts.ContactsViewModel");
        r1Var.a("com.topstep.fitcloud.pro.ui.device.bind.DeviceSpecifyViewModel");
        r1Var.a("com.topstep.fitcloud.pro.ui.DeviceViewModel");
        r1Var.a("com.topstep.fitcloud.pro.ui.device.dial.DfuViewModel");
        r1Var.a("com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomDfuViewModel");
        r1Var.a("com.topstep.fitcloud.pro.ui.device.dial.DialPushViewModel");
        r1Var.a("com.topstep.fitcloud.pro.ui.data.ecg.EcgDetailReportViewModel");
        r1Var.a("com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportViewModel");
        r1Var.a("com.topstep.fitcloud.pro.ui.data.ecg.EcgViewModel");
        r1Var.a("com.topstep.fitcloud.pro.ui.settings.EditIdentityIdViewModel");
        r1Var.a("com.topstep.fitcloud.pro.ui.settings.FeedbackViewModel");
        r1Var.a("com.topstep.fitcloud.pro.ui.friend.FriendAddViewModel");
        r1Var.a("com.topstep.fitcloud.pro.ui.friend.FriendDataViewModel");
        r1Var.a("com.topstep.fitcloud.pro.ui.friend.FriendEcgViewModel");
        r1Var.a("com.topstep.fitcloud.pro.ui.friend.FriendInfoViewModel");
        r1Var.a("com.topstep.fitcloud.pro.ui.friend.FriendMsgVieModel");
        r1Var.a("com.topstep.fitcloud.pro.ui.friend.FriendRenameViewModel");
        r1Var.a("com.topstep.fitcloud.pro.ui.friend.FriendSearchViewModel");
        r1Var.a("com.topstep.fitcloud.pro.ui.friend.FriendViewModel");
        r1Var.a("com.topstep.fitcloud.pro.ui.device.game.push.GamePushViewModel");
        r1Var.a("com.topstep.fitcloud.pro.ui.data.HeartRateDetailViewModel");
        r1Var.a("com.topstep.fitcloud.pro.ui.LaunchNavigationViewMode");
        r1Var.a("com.topstep.fitcloud.pro.ui.MineViewModel");
        r1Var.a("com.topstep.fitcloud.pro.ui.data.OxygenDetailViewModel");
        r1Var.a("com.topstep.fitcloud.pro.ui.data.PressureDetailViewModel");
        r1Var.a("com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsViewModel");
        r1Var.a("com.topstep.fitcloud.pro.ui.settings.SettingsViewModel");
        r1Var.a("com.topstep.fitcloud.pro.ui.device.song.push.SongPushViewModel");
        r1Var.a("com.topstep.fitcloud.pro.ui.device.song.push.SongSelectViewModel");
        r1Var.a("com.topstep.fitcloud.pro.ui.sport.SportDetailViewModel");
        r1Var.a("com.topstep.fitcloud.pro.ui.sport.SportHistoryViewModel");
        r1Var.a("com.topstep.fitcloud.pro.ui.sport.SportingViewMode");
        r1Var.a("com.topstep.fitcloud.pro.ui.data.TemperatureDetailViewModel");
        if (r1Var.f176a.isEmpty()) {
            return Collections.emptySet();
        }
        if (r1Var.f176a.size() == 1) {
            return Collections.singleton(r1Var.f176a.get(0));
        }
        return Collections.unmodifiableSet(new HashSet(r1Var.f176a));
    }

    @Override // hi.a
    public final void e() {
    }

    @Override // ih.y
    public final void f(MainActivity mainActivity) {
        mainActivity.f10242z = k.j(this.f23086a);
        mainActivity.A = k.p(this.f23086a);
        mainActivity.B = (og.t) this.f23086a.f23167y.get();
        mainActivity.C = (kg.k) this.f23086a.f23157o.get();
    }

    @Override // mi.u0
    public final void g(SportingActivity sportingActivity) {
        sportingActivity.H = k.l(this.f23086a);
        sportingActivity.L = (kg.k) this.f23086a.f23157o.get();
    }

    @Override // mi.p
    public final void h() {
    }

    @Override // oh.a
    public final void i() {
    }

    @Override // mi.v
    public final void j(SportGoalActivity sportGoalActivity) {
        sportGoalActivity.f12153y = k.l(this.f23086a);
        sportGoalActivity.B = k.o(this.f23086a);
    }

    @Override // ih.t
    public final void k() {
    }

    @Override // rh.o
    public final void l(EcgHealthReportActivity ecgHealthReportActivity) {
        ecgHealthReportActivity.f10696y = k.g(this.f23086a);
        ecgHealthReportActivity.f10697z = mk.a.a(this.f23086a.f23157o);
        ecgHealthReportActivity.A = k.l(this.f23086a);
    }

    @Override // ik.d.a
    public final l m() {
        return new l(this.f23086a, this.f23087b);
    }

    @Override // dagger.hilt.android.internal.managers.f.a
    public final e n() {
        return new e(this.f23086a, this.f23087b, this.f23088c);
    }
}
