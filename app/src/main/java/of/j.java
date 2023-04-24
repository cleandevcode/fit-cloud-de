package of;

import com.topstep.fitcloud.pro.function.DeviceService;
import com.topstep.fitcloud.pro.function.MyNotificationListenerService;
import com.topstep.fitcloud.pro.function.SportService;

/* loaded from: classes2.dex */
public final class j extends x {

    /* renamed from: a */
    public final k f23142a;

    public j(k kVar) {
        this.f23142a = kVar;
    }

    @Override // sf.x
    public final void a(SportService sportService) {
        k kVar = this.f23142a;
        com.bumptech.glide.manager.g gVar = kVar.f23143a;
        lg.b bVar = new lg.b(kVar.f23151i.get());
        gVar.getClass();
        sportService.f9568s = bVar;
    }

    @Override // sf.s
    public final void b(MyNotificationListenerService myNotificationListenerService) {
        myNotificationListenerService.f9557g = mk.a.a(this.f23142a.B);
    }

    @Override // sf.k
    public final void c(DeviceService deviceService) {
        deviceService.f9550f = (og.t) this.f23142a.f23167y.get();
    }
}
