package on;

import android.os.Bundle;
import on.g;
import org.eclipse.paho.android.service.MqttService;

/* loaded from: classes2.dex */
public final class h extends g.b {

    /* renamed from: c */
    public final /* synthetic */ Bundle f23702c;

    /* renamed from: d */
    public final /* synthetic */ g f23703d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, Bundle bundle, Bundle bundle2) {
        super(bundle);
        this.f23703d = gVar;
        this.f23702c = bundle2;
    }

    @Override // on.g.b, pn.a
    public final void a(pn.e eVar) {
        this.f23703d.f23690i.g("MqttConnection", "Reconnect Success!");
        this.f23703d.f23690i.g("MqttConnection", "DeliverBacklog when reconnect.");
        this.f23703d.g(this.f23702c);
    }

    @Override // on.g.b, pn.a
    public final void b(pn.e eVar, Exception exc) {
        this.f23702c.putString("MqttService.errorMessage", exc.getLocalizedMessage());
        this.f23702c.putSerializable("MqttService.exception", exc);
        g gVar = this.f23703d;
        MqttService mqttService = gVar.f23690i;
        String str = gVar.f23686e;
        n nVar = n.ERROR;
        mqttService.b(str, nVar, this.f23702c);
        g gVar2 = this.f23703d;
        Bundle bundle = this.f23702c;
        gVar2.e();
        gVar2.f23691j = true;
        gVar2.k(false);
        gVar2.f23690i.b(gVar2.f23686e, nVar, bundle);
        gVar2.j();
    }
}
