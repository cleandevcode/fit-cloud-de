package of;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.l0;
import androidx.lifecycle.s0;
import com.topstep.fitcloud.pro.ui.DeviceViewModel;
import com.topstep.fitcloud.pro.ui.LaunchNavigationViewMode;
import com.topstep.fitcloud.pro.ui.MineViewModel;
import com.topstep.fitcloud.pro.ui.data.BloodPressureDetailViewModel;
import com.topstep.fitcloud.pro.ui.data.HeartRateDetailViewModel;
import com.topstep.fitcloud.pro.ui.data.OxygenDetailViewModel;
import com.topstep.fitcloud.pro.ui.data.PressureDetailViewModel;
import com.topstep.fitcloud.pro.ui.data.TemperatureDetailViewModel;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgDetailReportViewModel;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportViewModel;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgViewModel;
import com.topstep.fitcloud.pro.ui.device.alarm.AlarmViewModel;
import com.topstep.fitcloud.pro.ui.device.bind.DeviceSpecifyViewModel;
import com.topstep.fitcloud.pro.ui.device.contacts.ContactsViewModel;
import com.topstep.fitcloud.pro.ui.device.dial.DfuViewModel;
import com.topstep.fitcloud.pro.ui.device.dial.DialPushViewModel;
import com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomDfuViewModel;
import com.topstep.fitcloud.pro.ui.device.game.push.GamePushViewModel;
import com.topstep.fitcloud.pro.ui.device.settings.BusinessCardViewModel;
import com.topstep.fitcloud.pro.ui.device.settings.CollectionCodeViewModel;
import com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsViewModel;
import com.topstep.fitcloud.pro.ui.device.song.push.SongPushViewModel;
import com.topstep.fitcloud.pro.ui.device.song.push.SongSelectViewModel;
import com.topstep.fitcloud.pro.ui.friend.FriendAddViewModel;
import com.topstep.fitcloud.pro.ui.friend.FriendDataViewModel;
import com.topstep.fitcloud.pro.ui.friend.FriendEcgViewModel;
import com.topstep.fitcloud.pro.ui.friend.FriendInfoViewModel;
import com.topstep.fitcloud.pro.ui.friend.FriendMsgVieModel;
import com.topstep.fitcloud.pro.ui.friend.FriendRenameViewModel;
import com.topstep.fitcloud.pro.ui.friend.FriendSearchViewModel;
import com.topstep.fitcloud.pro.ui.friend.FriendViewModel;
import com.topstep.fitcloud.pro.ui.policy.AskPolicyViewMode;
import com.topstep.fitcloud.pro.ui.settings.AccountManageViewMode;
import com.topstep.fitcloud.pro.ui.settings.EditIdentityIdViewModel;
import com.topstep.fitcloud.pro.ui.settings.FeedbackViewModel;
import com.topstep.fitcloud.pro.ui.settings.SettingsViewModel;
import com.topstep.fitcloud.pro.ui.settings.assist.AssistViewModel;
import com.topstep.fitcloud.pro.ui.sport.SportDetailViewModel;
import com.topstep.fitcloud.pro.ui.sport.SportHistoryViewModel;
import com.topstep.fitcloud.pro.ui.sport.SportingViewMode;
import java.util.Map;
import og.i1;
import og.m1;
import og.n1;
import pm.o0;

/* loaded from: classes2.dex */
public final class m extends z {
    public a A;
    public a B;
    public a C;
    public a D;
    public a E;
    public a F;
    public a G;
    public a H;
    public a I;
    public a J;
    public a K;
    public a L;
    public a M;
    public a N;
    public a O;
    public a P;

    /* renamed from: a */
    public final l0 f23175a;

    /* renamed from: b */
    public final k f23176b;

    /* renamed from: c */
    public a f23177c;

    /* renamed from: d */
    public a f23178d;

    /* renamed from: e */
    public a f23179e;

    /* renamed from: f */
    public a f23180f;

    /* renamed from: g */
    public a f23181g;

    /* renamed from: h */
    public a f23182h;

    /* renamed from: i */
    public a f23183i;

    /* renamed from: j */
    public a f23184j;

    /* renamed from: k */
    public a f23185k;

    /* renamed from: l */
    public a f23186l;

    /* renamed from: m */
    public a f23187m;

    /* renamed from: n */
    public a f23188n;

    /* renamed from: o */
    public a f23189o;

    /* renamed from: p */
    public a f23190p;

    /* renamed from: q */
    public a f23191q;

    /* renamed from: r */
    public a f23192r;

    /* renamed from: s */
    public a f23193s;

    /* renamed from: t */
    public a f23194t;

    /* renamed from: u */
    public a f23195u;

    /* renamed from: v */
    public a f23196v;

    /* renamed from: w */
    public a f23197w;

    /* renamed from: x */
    public a f23198x;

    /* renamed from: y */
    public a f23199y;

    /* renamed from: z */
    public a f23200z;

    /* loaded from: classes2.dex */
    public static final class a<T> implements sl.a<T> {

        /* renamed from: a */
        public final k f23201a;

        /* renamed from: b */
        public final m f23202b;

        /* renamed from: c */
        public final int f23203c;

        public a(k kVar, m mVar, int i10) {
            this.f23201a = kVar;
            this.f23202b = mVar;
            this.f23203c = i10;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [ih.a, T, com.topstep.fitcloud.pro.ui.policy.AskPolicyViewMode] */
        /* JADX WARN: Type inference failed for: r2v56, types: [com.topstep.fitcloud.pro.ui.LaunchNavigationViewMode, ih.a, T] */
        @Override // sl.a, dk.a
        public final T get() {
            switch (this.f23203c) {
                case 0:
                    return (T) new AccountManageViewMode(k.g(this.f23201a), (kg.k) this.f23201a.f23157o.get());
                case 1:
                    return (T) new AlarmViewModel((og.t) this.f23201a.f23167y.get());
                case 2:
                    m mVar = this.f23202b;
                    Context context = this.f23201a.f23145c.f17992a;
                    mf.a0.c(context);
                    ?? r22 = (T) new AskPolicyViewMode(context);
                    r22.f16821e = mVar.f23176b.t();
                    r22.f11720f = (yg.m) mVar.f23176b.f23160r.get();
                    return r22;
                case 3:
                    return (T) new AssistViewModel(this.f23202b.f23175a, (og.t) this.f23201a.f23167y.get());
                case 4:
                    m mVar2 = this.f23202b;
                    return (T) new BloodPressureDetailViewModel(mVar2.f23175a, new sh.a(mVar2.f23176b.Q.get(), mk.a.a(mVar2.f23176b.P), mk.a.a(mVar2.f23176b.S)));
                case 5:
                    return (T) new BusinessCardViewModel(this.f23202b.f23175a, (og.t) this.f23201a.f23167y.get());
                case 6:
                    return (T) new CollectionCodeViewModel(this.f23202b.f23175a, (og.t) this.f23201a.f23167y.get());
                case 7:
                    return (T) new ContactsViewModel((og.t) this.f23201a.f23167y.get());
                case 8:
                    return (T) new DeviceSpecifyViewModel(this.f23202b.f23175a, (n1) this.f23201a.f23162t.get());
                case 9:
                    return (T) new DeviceViewModel((og.t) this.f23201a.f23167y.get(), k.p(this.f23201a));
                case 10:
                    return (T) new DfuViewModel((og.t) this.f23201a.f23167y.get());
                case 11:
                    Application j10 = h7.a.j(this.f23201a.f23145c.f17992a);
                    mf.a0.c(j10);
                    return (T) new DialCustomDfuViewModel(j10, this.f23202b.f23175a);
                case 12:
                    return (T) new DialPushViewModel((og.t) this.f23201a.f23167y.get(), k.h(this.f23201a));
                case 13:
                    return (T) new EcgDetailReportViewModel(this.f23202b.f23175a, (lg.c) this.f23201a.P.get(), mk.a.a(this.f23201a.S));
                case 14:
                    l0 l0Var = this.f23202b.f23175a;
                    Context context2 = this.f23201a.f23145c.f17992a;
                    mf.a0.c(context2);
                    m mVar3 = this.f23202b;
                    mVar3.getClass();
                    wm.b bVar = o0.f24382b;
                    mf.a0.c(bVar);
                    return (T) new EcgHealthReportViewModel(l0Var, context2, new gh.d(bVar, (yg.m) mVar3.f23176b.f23160r.get()));
                case 15:
                    return (T) new EcgViewModel(this.f23202b.f23175a, (lg.c) this.f23201a.P.get());
                case 16:
                    return (T) new EditIdentityIdViewModel(k.g(this.f23201a), (kg.k) this.f23201a.f23157o.get());
                case 17:
                    l0 l0Var2 = this.f23202b.f23175a;
                    k kVar = this.f23201a;
                    com.bumptech.glide.manager.g gVar = kVar.f23143a;
                    Context context3 = kVar.f23145c.f17992a;
                    mf.a0.c(context3);
                    wm.b bVar2 = o0.f24382b;
                    mf.a0.c(bVar2);
                    kVar.f23144b.getClass();
                    sg.f fVar = new sg.f(context3, bVar2, kVar.s(), kVar.t(), (og.t) kVar.f23167y.get(), kVar.f23149g.get(), new rf.e());
                    gVar.getClass();
                    return (T) new FeedbackViewModel(l0Var2, fVar);
                case 18:
                    return (T) new FriendAddViewModel(this.f23202b.f23175a, k.q(this.f23201a), (kg.k) this.f23201a.f23157o.get(), k.g(this.f23201a));
                case 19:
                    return (T) new FriendDataViewModel(this.f23202b.f23175a, k.q(this.f23201a), (tg.a) this.f23201a.S.get(), k.l(this.f23201a));
                case 20:
                    return (T) new FriendEcgViewModel(this.f23202b.f23175a, (tg.a) this.f23201a.S.get());
                case 21:
                    return (T) new FriendInfoViewModel(this.f23202b.f23175a, k.q(this.f23201a), k.l(this.f23201a));
                case 22:
                    return (T) new FriendMsgVieModel(this.f23202b.f23175a, k.q(this.f23201a));
                case 23:
                    return (T) new FriendRenameViewModel(this.f23202b.f23175a, k.q(this.f23201a));
                case 24:
                    return (T) new FriendSearchViewModel(this.f23202b.f23175a, k.q(this.f23201a), k.g(this.f23201a));
                case 25:
                    return (T) new FriendViewModel(this.f23202b.f23175a, k.q(this.f23201a));
                case 26:
                    k kVar2 = this.f23201a;
                    com.bumptech.glide.manager.g gVar2 = kVar2.f23143a;
                    Context context4 = kVar2.f23145c.f17992a;
                    mf.a0.c(context4);
                    i1 i1Var = new i1(context4, (og.t) kVar2.f23167y.get(), kVar2.s());
                    gVar2.getClass();
                    return (T) new GamePushViewModel((og.t) this.f23201a.f23167y.get(), i1Var);
                case 27:
                    m mVar4 = this.f23202b;
                    return (T) new HeartRateDetailViewModel(mVar4.f23175a, new sh.c(mVar4.f23176b.Q.get(), mk.a.a(mVar4.f23176b.P), mk.a.a(mVar4.f23176b.S)));
                case 28:
                    m mVar5 = this.f23202b;
                    Context context5 = this.f23201a.f23145c.f17992a;
                    mf.a0.c(context5);
                    ?? r23 = (T) new LaunchNavigationViewMode(context5);
                    r23.f16821e = mVar5.f23176b.t();
                    r23.f10235f = (yg.m) mVar5.f23176b.f23160r.get();
                    return r23;
                case 29:
                    return (T) new MineViewModel(k.g(this.f23201a), (kg.k) this.f23201a.f23157o.get(), (og.t) this.f23201a.f23167y.get(), mk.a.a(this.f23201a.T), (yg.m) this.f23201a.f23160r.get(), k.j(this.f23201a), k.q(this.f23201a));
                case 30:
                    m mVar6 = this.f23202b;
                    return (T) new OxygenDetailViewModel(mVar6.f23175a, new sh.d(mVar6.f23176b.Q.get(), mk.a.a(mVar6.f23176b.P), mk.a.a(mVar6.f23176b.S)));
                case 31:
                    m mVar7 = this.f23202b;
                    return (T) new PressureDetailViewModel(mVar7.f23175a, new sh.e(mVar7.f23176b.Q.get(), mk.a.a(mVar7.f23176b.P), mk.a.a(mVar7.f23176b.S)));
                case 32:
                    long g10 = k.g(this.f23201a);
                    k kVar3 = this.f23201a;
                    com.bumptech.glide.manager.g gVar3 = kVar3.f23143a;
                    m1 m1Var = new m1(kVar3.f23151i.get());
                    gVar3.getClass();
                    return (T) new QrCodeSettingsViewModel(g10, m1Var, (og.t) this.f23201a.f23167y.get());
                case 33:
                    l0 l0Var3 = this.f23202b.f23175a;
                    long g11 = k.g(this.f23201a);
                    kg.k kVar4 = (kg.k) this.f23201a.f23157o.get();
                    jg.b t10 = this.f23201a.t();
                    k kVar5 = this.f23201a;
                    com.bumptech.glide.manager.g gVar4 = kVar5.f23143a;
                    ch.b bVar3 = kVar5.H.get();
                    gVar4.getClass();
                    gm.l.f(bVar3, "repository");
                    return (T) new SettingsViewModel(l0Var3, g11, kVar4, t10, bVar3, k.j(this.f23201a), k.p(this.f23201a), (yg.m) this.f23201a.f23160r.get());
                case 34:
                    l0 l0Var4 = this.f23202b.f23175a;
                    Context context6 = this.f23201a.f23145c.f17992a;
                    mf.a0.c(context6);
                    return (T) new SongPushViewModel(l0Var4, context6, (og.t) this.f23201a.f23167y.get());
                case 35:
                    l0 l0Var5 = this.f23202b.f23175a;
                    Context context7 = this.f23201a.f23145c.f17992a;
                    mf.a0.c(context7);
                    return (T) new SongSelectViewModel(l0Var5, context7);
                case 36:
                    return (T) new SportDetailViewModel(this.f23202b.f23175a, k.g(this.f23201a), (kg.k) this.f23201a.f23157o.get(), k.l(this.f23201a), k.o(this.f23201a));
                case 37:
                    return (T) new SportHistoryViewModel(k.o(this.f23201a), k.g(this.f23201a));
                case 38:
                    return (T) new SportingViewMode(this.f23202b.f23175a, k.o(this.f23201a));
                case 39:
                    m mVar8 = this.f23202b;
                    return (T) new TemperatureDetailViewModel(mVar8.f23175a, new sh.f(mVar8.f23176b.Q.get(), mk.a.a(mVar8.f23176b.P), mk.a.a(mVar8.f23176b.S)));
                default:
                    throw new AssertionError(this.f23203c);
            }
        }
    }

    public m(k kVar, d dVar, l0 l0Var) {
        this.f23176b = kVar;
        this.f23175a = l0Var;
        this.f23177c = new a(kVar, this, 0);
        this.f23178d = new a(kVar, this, 1);
        this.f23179e = new a(kVar, this, 2);
        this.f23180f = new a(kVar, this, 3);
        this.f23181g = new a(kVar, this, 4);
        this.f23182h = new a(kVar, this, 5);
        this.f23183i = new a(kVar, this, 6);
        this.f23184j = new a(kVar, this, 7);
        this.f23185k = new a(kVar, this, 8);
        this.f23186l = new a(kVar, this, 9);
        this.f23187m = new a(kVar, this, 10);
        this.f23188n = new a(kVar, this, 11);
        this.f23189o = new a(kVar, this, 12);
        this.f23190p = new a(kVar, this, 13);
        this.f23191q = new a(kVar, this, 14);
        this.f23192r = new a(kVar, this, 15);
        this.f23193s = new a(kVar, this, 16);
        this.f23194t = new a(kVar, this, 17);
        this.f23195u = new a(kVar, this, 18);
        this.f23196v = new a(kVar, this, 19);
        this.f23197w = new a(kVar, this, 20);
        this.f23198x = new a(kVar, this, 21);
        this.f23199y = new a(kVar, this, 22);
        this.f23200z = new a(kVar, this, 23);
        this.A = new a(kVar, this, 24);
        this.B = new a(kVar, this, 25);
        this.C = new a(kVar, this, 26);
        this.D = new a(kVar, this, 27);
        this.E = new a(kVar, this, 28);
        this.F = new a(kVar, this, 29);
        this.G = new a(kVar, this, 30);
        this.H = new a(kVar, this, 31);
        this.I = new a(kVar, this, 32);
        this.J = new a(kVar, this, 33);
        this.K = new a(kVar, this, 34);
        this.L = new a(kVar, this, 35);
        this.M = new a(kVar, this, 36);
        this.N = new a(kVar, this, 37);
        this.O = new a(kVar, this, 38);
        this.P = new a(kVar, this, 39);
    }

    @Override // ik.d.b
    public final Map<String, sl.a<s0>> a() {
        x2.i iVar = new x2.i(40);
        iVar.f("com.topstep.fitcloud.pro.ui.settings.AccountManageViewMode", this.f23177c);
        iVar.f("com.topstep.fitcloud.pro.ui.device.alarm.AlarmViewModel", this.f23178d);
        iVar.f("com.topstep.fitcloud.pro.ui.policy.AskPolicyViewMode", this.f23179e);
        iVar.f("com.topstep.fitcloud.pro.ui.settings.assist.AssistViewModel", this.f23180f);
        iVar.f("com.topstep.fitcloud.pro.ui.data.BloodPressureDetailViewModel", this.f23181g);
        iVar.f("com.topstep.fitcloud.pro.ui.device.settings.BusinessCardViewModel", this.f23182h);
        iVar.f("com.topstep.fitcloud.pro.ui.device.settings.CollectionCodeViewModel", this.f23183i);
        iVar.f("com.topstep.fitcloud.pro.ui.device.contacts.ContactsViewModel", this.f23184j);
        iVar.f("com.topstep.fitcloud.pro.ui.device.bind.DeviceSpecifyViewModel", this.f23185k);
        iVar.f("com.topstep.fitcloud.pro.ui.DeviceViewModel", this.f23186l);
        iVar.f("com.topstep.fitcloud.pro.ui.device.dial.DfuViewModel", this.f23187m);
        iVar.f("com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomDfuViewModel", this.f23188n);
        iVar.f("com.topstep.fitcloud.pro.ui.device.dial.DialPushViewModel", this.f23189o);
        iVar.f("com.topstep.fitcloud.pro.ui.data.ecg.EcgDetailReportViewModel", this.f23190p);
        iVar.f("com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportViewModel", this.f23191q);
        iVar.f("com.topstep.fitcloud.pro.ui.data.ecg.EcgViewModel", this.f23192r);
        iVar.f("com.topstep.fitcloud.pro.ui.settings.EditIdentityIdViewModel", this.f23193s);
        iVar.f("com.topstep.fitcloud.pro.ui.settings.FeedbackViewModel", this.f23194t);
        iVar.f("com.topstep.fitcloud.pro.ui.friend.FriendAddViewModel", this.f23195u);
        iVar.f("com.topstep.fitcloud.pro.ui.friend.FriendDataViewModel", this.f23196v);
        iVar.f("com.topstep.fitcloud.pro.ui.friend.FriendEcgViewModel", this.f23197w);
        iVar.f("com.topstep.fitcloud.pro.ui.friend.FriendInfoViewModel", this.f23198x);
        iVar.f("com.topstep.fitcloud.pro.ui.friend.FriendMsgVieModel", this.f23199y);
        iVar.f("com.topstep.fitcloud.pro.ui.friend.FriendRenameViewModel", this.f23200z);
        iVar.f("com.topstep.fitcloud.pro.ui.friend.FriendSearchViewModel", this.A);
        iVar.f("com.topstep.fitcloud.pro.ui.friend.FriendViewModel", this.B);
        iVar.f("com.topstep.fitcloud.pro.ui.device.game.push.GamePushViewModel", this.C);
        iVar.f("com.topstep.fitcloud.pro.ui.data.HeartRateDetailViewModel", this.D);
        iVar.f("com.topstep.fitcloud.pro.ui.LaunchNavigationViewMode", this.E);
        iVar.f("com.topstep.fitcloud.pro.ui.MineViewModel", this.F);
        iVar.f("com.topstep.fitcloud.pro.ui.data.OxygenDetailViewModel", this.G);
        iVar.f("com.topstep.fitcloud.pro.ui.data.PressureDetailViewModel", this.H);
        iVar.f("com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsViewModel", this.I);
        iVar.f("com.topstep.fitcloud.pro.ui.settings.SettingsViewModel", this.J);
        iVar.f("com.topstep.fitcloud.pro.ui.device.song.push.SongPushViewModel", this.K);
        iVar.f("com.topstep.fitcloud.pro.ui.device.song.push.SongSelectViewModel", this.L);
        iVar.f("com.topstep.fitcloud.pro.ui.sport.SportDetailViewModel", this.M);
        iVar.f("com.topstep.fitcloud.pro.ui.sport.SportHistoryViewModel", this.N);
        iVar.f("com.topstep.fitcloud.pro.ui.sport.SportingViewMode", this.O);
        iVar.f("com.topstep.fitcloud.pro.ui.data.TemperatureDetailViewModel", this.P);
        return iVar.d();
    }
}
