package on;

import android.os.Bundle;
import on.g;
import org.eclipse.paho.android.service.MqttService;

/* loaded from: classes2.dex */
public final class f extends g.b {

    /* renamed from: c */
    public final /* synthetic */ Bundle f23680c;

    /* renamed from: d */
    public final /* synthetic */ g f23681d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, Bundle bundle, Bundle bundle2) {
        super(bundle);
        this.f23681d = gVar;
        this.f23680c = bundle2;
    }

    @Override // on.g.b, pn.a
    public final void a(pn.e eVar) {
        this.f23681d.g(this.f23680c);
        this.f23681d.f23690i.g("MqttConnection", "connect success!");
    }

    @Override // on.g.b, pn.a
    public final void b(pn.e eVar, Exception exc) {
        this.f23680c.putString("MqttService.errorMessage", exc.getLocalizedMessage());
        this.f23680c.putSerializable("MqttService.exception", exc);
        MqttService mqttService = this.f23681d.f23690i;
        StringBuilder a10 = android.support.v4.media.d.a("connect fail, call connect to reconnect.reason:");
        a10.append(exc.getMessage());
        mqttService.h("MqttConnection", a10.toString());
        g gVar = this.f23681d;
        Bundle bundle = this.f23680c;
        gVar.e();
        gVar.f23691j = true;
        gVar.k(false);
        gVar.f23690i.b(gVar.f23686e, n.ERROR, bundle);
        gVar.j();
    }
}
