package qn;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/* loaded from: classes2.dex */
public class m extends j {

    /* renamed from: b */
    public ResourceBundle f25110b = ResourceBundle.getBundle("org.eclipse.paho.client.mqttv3.internal.nls.messages");

    @Override // qn.j
    public final String a(int i10) {
        try {
            return this.f25110b.getString(Integer.toString(i10));
        } catch (MissingResourceException unused) {
            return "MqttException";
        }
    }
}
