package pn;

/* loaded from: classes2.dex */
public class n extends Exception {

    /* renamed from: a */
    public int f24444a;

    /* renamed from: b */
    public Throwable f24445b;

    public n(int i10) {
        this.f24444a = i10;
    }

    public n(int i10, Throwable th2) {
        this.f24444a = i10;
        this.f24445b = th2;
    }

    public n(Throwable th2) {
        this.f24444a = 0;
        this.f24445b = th2;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f24445b;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        boolean z10;
        Class cls;
        int i10 = this.f24444a;
        if (qn.j.f25107a == null) {
            boolean z11 = false;
            try {
                Class.forName("java.util.ResourceBundle");
                z10 = true;
            } catch (ClassNotFoundException unused) {
                z10 = false;
            }
            if (z10) {
                cls = qn.m.class;
            } else {
                try {
                    Class.forName("org.eclipse.paho.client.mqttv3.internal.MIDPCatalog");
                    z11 = true;
                } catch (ClassNotFoundException unused2) {
                }
                if (z11) {
                    try {
                        cls = Class.forName("org.eclipse.paho.client.mqttv3.internal.MIDPCatalog");
                    } catch (Exception unused3) {
                        return "";
                    }
                }
            }
            qn.j.f25107a = (qn.j) cls.newInstance();
        }
        return qn.j.f25107a.a(i10);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer(String.valueOf(getMessage()));
        stringBuffer.append(" (");
        stringBuffer.append(this.f24444a);
        stringBuffer.append(")");
        String stringBuffer2 = stringBuffer.toString();
        if (this.f24445b != null) {
            StringBuffer stringBuffer3 = new StringBuffer(String.valueOf(stringBuffer2));
            stringBuffer3.append(" - ");
            stringBuffer3.append(this.f24445b.toString());
            return stringBuffer3.toString();
        }
        return stringBuffer2;
    }
}
